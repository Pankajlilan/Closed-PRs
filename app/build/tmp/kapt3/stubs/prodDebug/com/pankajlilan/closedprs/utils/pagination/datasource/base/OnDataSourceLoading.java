package com.pankajlilan.closedprs.utils.pagination.datasource.base;

import java.lang.System;

/**
 * Interface that will let us communicate between
 * @see BaseDataSource class
 * and
 * @see com.pankajlilan.closedprs.presentation.ui.base.BasePaginationViewModel
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/pankajlilan/closedprs/utils/pagination/datasource/base/OnDataSourceLoading;", "", "onDataLoading", "", "onDataLoadingEnd", "onError", "onFirstFetch", "onFirstFetchEndWithData", "onFirstFetchEndWithoutData", "onInitialError", "app_prodDebug"})
public abstract interface OnDataSourceLoading {
    
    public abstract void onFirstFetch();
    
    public abstract void onFirstFetchEndWithData();
    
    public abstract void onFirstFetchEndWithoutData();
    
    public abstract void onDataLoading();
    
    public abstract void onDataLoadingEnd();
    
    public abstract void onInitialError();
    
    public abstract void onError();
}