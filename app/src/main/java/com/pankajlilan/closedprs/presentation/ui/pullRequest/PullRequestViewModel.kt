package com.pankajlilan.closedprs.presentation.ui.pullRequest

import com.pankajlilan.closedprs.data.models.PullRequest
import com.pankajlilan.closedprs.presentation.ui.base.BasePaginationViewModel
import com.pankajlilan.closedprs.utils.pagination.factory.PullRequestDataSourceFactory

class PullRequestViewModel : BasePaginationViewModel<PullRequestDataSourceFactory, PullRequest>() {
    init {
        dataSourceFactory = PullRequestDataSourceFactory(getListener(), null, null)
    }

    override fun getPageSize(): Int = 10

    /**
     * Handles a new user search
     */
    fun fetchClosedPullRequest(user : String, repo: String) {
        dataSourceFactory.user = user
        dataSourceFactory.repo = repo
        clearData()
    }
}