package com.pankajlilan.closedprs.presentation.ui.base;

import java.lang.System;

/**
 * Base ViewModel class with observables and helper methods needed to use in the Pagination Library
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00040\u0002*\b\b\u0001\u0010\u0004*\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020\u000bJ\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u000bH\u0002J\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0018\u00010 J\b\u0010+\u001a\u00020,H\u0004J\b\u0010-\u001a\u00020\u0003H&J\u0006\u0010.\u001a\u00020\u000bJ\u0006\u0010/\u001a\u00020\u000bJ\b\u00100\u001a\u00020\u000bH\u0014J\u0006\u00101\u001a\u00020\u000bJ\u0006\u00102\u001a\u00020\u000bJ\u0006\u00103\u001a\u00020\u000bR\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u001c\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0012\u00a8\u00064"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/base/BasePaginationViewModel;", "T", "Landroidx/paging/DataSource$Factory;", "", "K", "", "Landroidx/lifecycle/ViewModel;", "()V", "_clearDataEvents", "Landroidx/lifecycle/MutableLiveData;", "Lcom/pankajlilan/closedprs/presentation/utils/Event;", "", "_emptyVisibilityEvents", "", "_errorToastEvent", "_recyclerViewLoadingEvents", "clearDataEvents", "getClearDataEvents", "()Landroidx/lifecycle/MutableLiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataSourceFactory", "getDataSourceFactory", "()Landroidx/paging/DataSource$Factory;", "setDataSourceFactory", "(Landroidx/paging/DataSource$Factory;)V", "Landroidx/paging/DataSource$Factory;", "emptyVisibilityEvents", "getEmptyVisibilityEvents", "errorEvent", "getErrorEvent", "pagedObservable", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "recyclerViewLoadingEvents", "getRecyclerViewLoadingEvents", "addDisposable", "d", "Lio/reactivex/disposables/Disposable;", "clearData", "clearDataSource", "createPagedObservable", "getItems", "getListener", "Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "getPageSize", "hideEmptyVisibility", "hideRecyclerLoading", "onCleared", "showEmptyVisibility", "showErrorToast", "showRecyclerLoading", "app_prodDebug"})
public abstract class BasePaginationViewModel<T extends androidx.paging.DataSource.Factory<java.lang.Integer, K>, K extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    protected T dataSourceFactory;
    private io.reactivex.Observable<androidx.paging.PagedList<K>> pagedObservable;
    private final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<kotlin.Unit>> _clearDataEvents = null;
    private final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean>> _emptyVisibilityEvents = null;
    private final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean>> _recyclerViewLoadingEvents = null;
    private final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<kotlin.Unit>> _errorToastEvent = null;
    
    public BasePaginationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getDataSourceFactory() {
        return null;
    }
    
    protected final void setDataSourceFactory(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<kotlin.Unit>> getClearDataEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean>> getEmptyVisibilityEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean>> getRecyclerViewLoadingEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.pankajlilan.closedprs.presentation.utils.Event<kotlin.Unit>> getErrorEvent() {
        return null;
    }
    
    /**
     * This stipulates how many items are going to be fetched each time the user scrolls to the end of the recyclerview
     * Please note that initially 3 x [getPageSize] items are going to be loaded
     */
    public abstract int getPageSize();
    
    public final void clearData() {
    }
    
    /**
     * Generates a new datasource,
     * Used when we need to do a new search for a different user
     */
    public final void clearDataSource() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Observable<androidx.paging.PagedList<K>> getItems() {
        return null;
    }
    
    /**
     * Creates observable stream for the data fetched by the DataSource
     */
    private final void createPagedObservable() {
    }
    
    /**
     * Listener used in the DataSource that we use to manipulate the Activity/Fragment to show/hide views and present
     * relevant information
     */
    @org.jetbrains.annotations.NotNull()
    protected final com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading getListener() {
        return null;
    }
    
    /**
     * Helper methods to show and hide views on the Activity/Fragment
     */
    public final void showEmptyVisibility() {
    }
    
    public final void hideEmptyVisibility() {
    }
    
    public final void showRecyclerLoading() {
    }
    
    public final void hideRecyclerLoading() {
    }
    
    public final void showErrorToast() {
    }
    
    public final boolean addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable d) {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}