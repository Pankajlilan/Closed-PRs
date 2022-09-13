package com.pankajlilan.closedprs.data.services

import com.pankajlilan.closedprs.data.endpoints.RepoApi
import com.pankajlilan.closedprs.data.models.Repo
import com.pankajlilan.closedprs.utils.networking.NetworkTools
import io.reactivex.Single
import retrofit2.Response

class ReposService {
    private var api: RepoApi = NetworkTools.retrofit.create(RepoApi::class.java)

    fun getReposForUser(user: String, page: Int, perPage: Int): Single<Response<List<Repo>>> {
        return api.getRepos(user, page, perPage)
    }
}