package com.pankajlilan.closedprs.presentation.ui.repo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pankajlilan.closedprs.R
import com.pankajlilan.closedprs.data.models.Repo
import com.pankajlilan.closedprs.databinding.FragmentRepoBinding
import com.pankajlilan.closedprs.presentation.ui.HomeActivity
import com.pankajlilan.closedprs.presentation.utils.Event
import com.pankajlilan.closedprs.utils.extensions.toast
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.empty_view.*
import kotlinx.android.synthetic.main.empty_view.view.*
import kotlinx.android.synthetic.main.fragment_repo.*

class RepoFragment : Fragment() {
    private lateinit var viewModel: RepoViewModel
    private lateinit var adapter: RepoAdapter
    private lateinit var userName: String
    private lateinit var _binding: FragmentRepoBinding
    private val binding: FragmentRepoBinding
        get() = _binding
    private val args: RepoFragmentArgs by navArgs()
    private val fetchDataDisposable: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(requireActivity())[RepoViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRepoBinding.inflate(inflater, container, false)
        return _binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupViews()
        registerObservables()

        args.gitUsername.let {
            userName = it
            viewModel.newSearch(it)
        }
    }

    private fun setupViews() {
        (requireActivity() as HomeActivity).supportActionBar?.title = "Your repos"

        Glide.with(this)
            .load(ContextCompat.getDrawable(requireContext(), R.drawable.ic_searching))
            .apply(RequestOptions().override(300, 300))
            .into(empty_view_imageView)

        adapter = RepoAdapter(
            object : RepoAdapter.ItemClickListener {
                override fun onItemClicked(repos: Repo) {
                    repos.name?.let {
                        goToClosedPrFragment(userName, it)
                    }
                }
            }
        )
        binding.apply {
            mainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
            mainRecyclerView.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fetchDataDisposable.clear()
    }

    override fun onDestroy() {
        super.onDestroy()
        fetchDataDisposable.dispose()
    }

    private fun onError() {
        Glide.with(this).load(R.drawable.ic_error)
            .apply(RequestOptions().override(800, 500))
            .into(binding.mainEmptyView.empty_view_imageView)
        toast(getString(R.string.err_search))
    }

    private fun onNoDataFound(show: Event<Boolean>?) {
        this.main_emptyView.visibility = if (show?.peek() == true) View.VISIBLE else View.GONE

        Glide.with(this).load(R.drawable.ic_no_data)
            .into(binding.mainEmptyView.empty_view_imageView)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun registerObservables() {
        // We start by submitting the list to the adapter initially
        submitItems()

        // Toast for API Errors
        viewModel.errorEvent.observe(viewLifecycleOwner) {
            onError()
        }

        // Clearing the data of the adapter when doing a new search
        viewModel.clearDataEvents.observe(viewLifecycleOwner) {
            viewModel.clearDataSource()
            submitItems()
            adapter.notifyDataSetChanged()
        }

        // Showing an empty view on the screen
        viewModel.emptyVisibilityEvents.observe(viewLifecycleOwner) {
            onNoDataFound(it)
        }

        // Display the recyclerview loading item
        viewModel.recyclerViewLoadingEvents.observe(viewLifecycleOwner) {
            it?.let { adapter.loading = it.peek() }
        }
    }

    // Submits the list (with the pagination) to the adapter
    private fun submitItems() {
        viewModel.getItems()!!
            .subscribeOn(Schedulers.io())
            .subscribe(
                { items -> adapter.submitList(items) },
                {
                    onError()
                }
            ).also {
                fetchDataDisposable.add(it)
            }
    }

    private fun goToClosedPrFragment(userName: String, repo: String) {
        findNavController().navigate(
            RepoFragmentDirections.navigateToPullRequestFragment(userName, repo)
        )
    }
}
