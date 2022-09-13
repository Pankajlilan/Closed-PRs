package com.pankajlilan.closedprs.utils.pagination.datasource;

import java.lang.System;

/**
 * Class that handles how to retrieve data for the recyclerview
 * @see BaseDataSource
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J*\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0015H\u0015J*\u0010\u0016\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0018H\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/datasource/PrDataSource;", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/BaseDataSource;", "Lcom/pankajlilan/closedprs/data/models/PullRequest;", "user", "", "repo", "(Ljava/lang/String;Ljava/lang/String;)V", "manager", "Lcom/pankajlilan/closedprs/domain/PRManager;", "getRepo", "()Ljava/lang/String;", "setRepo", "(Ljava/lang/String;)V", "getUser", "setUser", "loadAdditionalData", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadInitialData", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "app_prodDebug"})
public final class PrDataSource extends com.pankajlilan.closedprs.utils.pagination.datasource.base.BaseDataSource<com.pankajlilan.closedprs.data.models.PullRequest> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String repo;
    private final com.pankajlilan.closedprs.domain.PRManager manager = null;
    
    public PrDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void loadInitialData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.pankajlilan.closedprs.data.models.PullRequest> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void loadAdditionalData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.pankajlilan.closedprs.data.models.PullRequest> callback) {
    }
}