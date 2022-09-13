package com.pankajlilan.closedprs.data.services

import com.pankajlilan.closedprs.data.endpoints.PullRequestApi
import com.pankajlilan.closedprs.data.models.PullRequest
import com.pankajlilan.closedprs.utils.networking.NetworkTools
import io.reactivex.Single
import retrofit2.Response

class PRService {
    private var api: PullRequestApi = NetworkTools.retrofit.create(PullRequestApi::class.java)

    fun getClosedPRs(
        owner: String,
        repo: String,
        page: Int,
        perPage: Int,
        state: String
    ): Single<Response<List<PullRequest>>> {
        return api.getClosedPRs(owner, repo, page, perPage, state)
    }
}