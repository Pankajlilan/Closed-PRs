package com.pankajlilan.closedprs.utils.pagination.datasource;

import java.lang.System;

/**
 * Class that handles how to retrieve data for the recyclerview
 * @see BaseDataSource
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J*\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u0011H\u0015J*\u0010\u0012\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u0014H\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u0015"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/datasource/ReposDataSource;", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/BaseDataSource;", "Lcom/pankajlilan/closedprs/data/models/Repo;", "user", "", "(Ljava/lang/String;)V", "manager", "Lcom/pankajlilan/closedprs/domain/ReposManager;", "getUser", "()Ljava/lang/String;", "setUser", "loadAdditionalData", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadInitialData", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "app_prodDebug"})
public final class ReposDataSource extends com.pankajlilan.closedprs.utils.pagination.datasource.base.BaseDataSource<com.pankajlilan.closedprs.data.models.Repo> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user;
    private final com.pankajlilan.closedprs.domain.ReposManager manager = null;
    
    public ReposDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void loadInitialData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.pankajlilan.closedprs.data.models.Repo> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void loadAdditionalData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.pankajlilan.closedprs.data.models.Repo> callback) {
    }
}