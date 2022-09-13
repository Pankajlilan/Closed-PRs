package com.pankajlilan.closedprs.utils.pagination.factory;

import java.lang.System;

/**
 * Factory class that handles the creation of DataSources
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/factory/ReposDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/pankajlilan/closedprs/data/models/Repo;", "loading", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "user", "", "(Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;Ljava/lang/String;)V", "source", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/ReposDataSource;", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "create", "Landroidx/paging/DataSource;", "app_prodDebug"})
public final class ReposDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.pankajlilan.closedprs.data.models.Repo> {
    private com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading loading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user;
    private com.pankajlilan.closedprs.utils.pagination.datasource.ReposDataSource source;
    
    public ReposDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading loading, @org.jetbrains.annotations.Nullable()
    java.lang.String user) {
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
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.pankajlilan.closedprs.data.models.Repo> create() {
        return null;
    }
}