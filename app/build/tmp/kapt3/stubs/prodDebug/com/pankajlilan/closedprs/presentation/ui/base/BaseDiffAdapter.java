package com.pankajlilan.closedprs.presentation.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0002\u0012\u0013B\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/base/BaseDiffAdapter;", "T", "ViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/paging/PagedListAdapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "value", "", "loading", "getLoading", "()Z", "setLoading", "(Z)V", "getItemViewType", "", "position", "DefaultCallback", "LoadingViewHolder", "app_prodDebug"})
public abstract class BaseDiffAdapter<T extends java.lang.Object, ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.paging.PagedListAdapter<T, ViewHolder> {
    private boolean loading = true;
    
    public BaseDiffAdapter() {
        super(null);
    }
    
    public BaseDiffAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setLoading(boolean value) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/base/BaseDiffAdapter$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/pankajlilan/closedprs/presentation/ui/base/BaseDiffAdapter;Landroid/view/View;)V", "app_prodDebug"})
    public final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/base/BaseDiffAdapter$DefaultCallback;", "", "()V", "defaultDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "T", "app_prodDebug"})
    public static final class DefaultCallback {
        @org.jetbrains.annotations.NotNull()
        public static final com.pankajlilan.closedprs.presentation.ui.base.BaseDiffAdapter.DefaultCallback INSTANCE = null;
        
        private DefaultCallback() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>androidx.recyclerview.widget.DiffUtil.ItemCallback<T> defaultDiffCallback() {
            return null;
        }
    }
}