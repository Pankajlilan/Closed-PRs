package com.pankajlilan.closedprs.utils.pagination.datasource.base;

import java.lang.System;

/**
 * Class that handles how the recyclerview will retrieve data when:
 * @see loadInitial - The recyclerview and adapter are initialized OR when recreating the DataSource
 * @see loadAfter - The user scrolls to retrieve more data
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0016J*\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0016H$J*\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J*\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J*\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J*\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001bH$J8\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0016H\u0004J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0004J8\u0010#\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001bH\u0004J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006%"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/BaseDataSource;", "T", "Landroidx/paging/PageKeyedDataSource;", "", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onDataSourceLoading", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "getOnDataSourceLoading", "()Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "setOnDataSourceLoading", "(Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;)V", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "invalidate", "loadAdditionalData", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadAfter", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "loadInitialData", "submitData", "items", "", "submitError", "error", "", "submitInitialData", "submitInitialError", "app_prodDebug"})
public abstract class BaseDataSource<T extends java.lang.Object> extends androidx.paging.PageKeyedDataSource<java.lang.Integer, T> {
    public com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading onDataSourceLoading;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    public BaseDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading getOnDataSourceLoading() {
        return null;
    }
    
    public final void setOnDataSourceLoading(@org.jetbrains.annotations.NotNull()
    com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading p0) {
    }
    
    protected abstract void loadInitialData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, T> callback);
    
    protected abstract void loadAdditionalData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback);
    
    /**
     * Initial data loaded by the recyclerview,
     * When started, it will load 3 times the number of items "per_page"
     */
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, T> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback) {
    }
    
    /**
     * All the data that is fetched when the user scrolls
     */
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback) {
    }
    
    /**
     * These helper methods will abstract how we handle data and call the necessary methods on the listener
     */
    protected final void submitInitialData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, T> callback) {
    }
    
    protected final void submitData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback) {
    }
    
    protected final void submitInitialError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    protected final void submitError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
}