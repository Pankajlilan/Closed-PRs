package com.pankajlilan.closedprs.presentation.ui.repo

import com.pankajlilan.closedprs.data.models.Repo
import com.pankajlilan.closedprs.presentation.ui.base.BasePaginationViewModel
import com.pankajlilan.closedprs.utils.pagination.factory.ReposDataSourceFactory

class RepoViewModel : BasePaginationViewModel<ReposDataSourceFactory, Repo>() {
    init {
        dataSourceFactory = ReposDataSourceFactory(getListener(), null)
    }

    override fun getPageSize(): Int = 3

    /**
     * Handles a new user search
     */
    fun newSearch(user : String) {
        dataSourceFactory.user = user
        clearData()
    }
}