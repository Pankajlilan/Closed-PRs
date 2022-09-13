package com.pankajlilan.closedprs.presentation.ui.pullRequest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestViewModel;", "Lcom/pankajlilan/closedprs/presentation/ui/base/BasePaginationViewModel;", "Lcom/pankajlilan/closedprs/utils/pagination/factory/PullRequestDataSourceFactory;", "Lcom/pankajlilan/closedprs/data/models/PullRequest;", "()V", "fetchClosedPullRequest", "", "user", "", "repo", "getPageSize", "", "app_prodDebug"})
public final class PullRequestViewModel extends com.pankajlilan.closedprs.presentation.ui.base.BasePaginationViewModel<com.pankajlilan.closedprs.utils.pagination.factory.PullRequestDataSourceFactory, com.pankajlilan.closedprs.data.models.PullRequest> {
    
    public PullRequestViewModel() {
        super();
    }
    
    @java.lang.Override()
    public int getPageSize() {
        return 0;
    }
    
    /**
     * Handles a new user search
     */
    public final void fetchClosedPullRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String repo) {
    }
}