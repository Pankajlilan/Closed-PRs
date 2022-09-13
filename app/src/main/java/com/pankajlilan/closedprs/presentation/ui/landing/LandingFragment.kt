package com.pankajlilan.closedprs.presentation.ui.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pankajlilan.closedprs.R
import com.pankajlilan.closedprs.databinding.FragmentLandingBinding
import com.pankajlilan.closedprs.presentation.ui.HomeActivity
import com.pankajlilan.closedprs.utils.extensions.isValid
import com.pankajlilan.closedprs.utils.extensions.toast

class LandingFragment : Fragment() {

    private lateinit var _binding: FragmentLandingBinding
    private val binding: FragmentLandingBinding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLandingBinding.inflate(inflater, container, false)
        onClicks()
        (requireActivity() as HomeActivity).supportActionBar?.title = getString(R.string.app_name)
        return _binding.root
    }

    private fun onClicks() {
        binding.btnContinue.setOnClickListener {
            val userName = binding.edtUserName.text.toString()
            if (userName.isValid()) {
                goToPullRequestFragment(userName)
            } else {
                toast(getString(com.pankajlilan.closedprs.R.string.info_valid_username))
            }
        }
    }

    private fun goToPullRequestFragment(userName: String) {
        findNavController().navigate(
            LandingFragmentDirections.navigateToRepoFragment(userName)
        )
    }
}