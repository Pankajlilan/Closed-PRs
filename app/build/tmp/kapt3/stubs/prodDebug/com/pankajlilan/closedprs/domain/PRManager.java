package com.pankajlilan.closedprs.domain;

import java.lang.System;

/**
 * Class that connects the Data layer to Presentation, where the API objects are manipulated and observed by
 * the Views (Activity, Fragment or View)
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/pankajlilan/closedprs/domain/PRManager;", "", "()V", "reposService", "Lcom/pankajlilan/closedprs/data/services/PRService;", "getClosedPRList", "Lio/reactivex/Single;", "", "Lcom/pankajlilan/closedprs/data/models/PullRequest;", "owner", "", "repo", "page", "", "perPage", "state", "app_prodDebug"})
public final class PRManager {
    private com.pankajlilan.closedprs.data.services.PRService reposService;
    
    public PRManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.pankajlilan.closedprs.data.models.PullRequest>> getClosedPRList(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String repo, int page, int perPage, @org.jetbrains.annotations.NotNull()
    java.lang.String state) {
        return null;
    }
}