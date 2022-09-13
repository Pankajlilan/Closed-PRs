package com.pankajlilan.closedprs.data.endpoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\bH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/pankajlilan/closedprs/data/endpoints/PullRequestApi;", "", "getClosedPRs", "Lio/reactivex/Single;", "Lretrofit2/Response;", "", "Lcom/pankajlilan/closedprs/data/models/PullRequest;", "owner", "", "repo", "page", "", "perPage", "state", "app_prodDebug"})
public abstract interface PullRequestApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos/{owner}/{repo}/pulls")
    public abstract io.reactivex.Single<retrofit2.Response<java.util.List<com.pankajlilan.closedprs.data.models.PullRequest>>> getClosedPRs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "repo")
    java.lang.String repo, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "state")
    java.lang.String state);
}