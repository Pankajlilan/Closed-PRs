package com.pankajlilan.closedprs.data.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/pankajlilan/closedprs/data/services/ReposService;", "", "()V", "api", "Lcom/pankajlilan/closedprs/data/endpoints/RepoApi;", "getReposForUser", "Lio/reactivex/Single;", "Lretrofit2/Response;", "", "Lcom/pankajlilan/closedprs/data/models/Repo;", "user", "", "page", "", "perPage", "app_prodDebug"})
public final class ReposService {
    private com.pankajlilan.closedprs.data.endpoints.RepoApi api;
    
    public ReposService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<retrofit2.Response<java.util.List<com.pankajlilan.closedprs.data.models.Repo>>> getReposForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String user, int page, int perPage) {
        return null;
    }
}