package com.pankajlilan.closedprs.utils.pagination.factory;

import java.lang.System;

/**
 * Factory class that handles the creation of DataSources
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/factory/PullRequestDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/pankajlilan/closedprs/data/models/PullRequest;", "loading", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "user", "", "repo", "(Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;Ljava/lang/String;Ljava/lang/String;)V", "getRepo", "()Ljava/lang/String;", "setRepo", "(Ljava/lang/String;)V", "source", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/PrDataSource;", "getUser", "setUser", "create", "Landroidx/paging/DataSource;", "app_prodDebug"})
public final class PullRequestDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.pankajlilan.closedprs.data.models.PullRequest> {
    private com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading loading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String repo;
    private com.pankajlilan.closedprs.utils.pagination.datasource.PrDataSource source;
    
    public PullRequestDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading loading, @org.jetbrains.annotations.Nullable()
    java.lang.String user, @org.jetbrains.annotations.Nullable()
    java.lang.String repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.pankajlilan.closedprs.data.models.PullRequest> create() {
        return null;
    }
}