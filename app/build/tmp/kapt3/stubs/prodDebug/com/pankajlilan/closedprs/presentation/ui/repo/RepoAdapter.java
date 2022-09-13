package com.pankajlilan.closedprs.presentation.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter;", "Lcom/pankajlilan/closedprs/presentation/ui/base/BaseDiffAdapter;", "Lcom/pankajlilan/closedprs/data/models/Repo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter$ItemClickListener;", "(Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter$ItemClickListener;)V", "getListener", "()Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter$ItemClickListener;", "setListener", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClickListener", "MainViewHolder", "app_prodDebug"})
public final class RepoAdapter extends com.pankajlilan.closedprs.presentation.ui.base.BaseDiffAdapter<com.pankajlilan.closedprs.data.models.Repo, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.pankajlilan.closedprs.presentation.ui.repo.RepoAdapter.ItemClickListener listener;
    
    public RepoAdapter(@org.jetbrains.annotations.NotNull()
    com.pankajlilan.closedprs.presentation.ui.repo.RepoAdapter.ItemClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pankajlilan.closedprs.presentation.ui.repo.RepoAdapter.ItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.pankajlilan.closedprs.presentation.ui.repo.RepoAdapter.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter$ItemClickListener;", "", "onItemClicked", "", "repos", "Lcom/pankajlilan/closedprs/data/models/Repo;", "app_prodDebug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.pankajlilan.closedprs.data.models.Repo repos);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "descriptionTextView", "Landroid/widget/TextView;", "getDescriptionTextView", "()Landroid/widget/TextView;", "languageTextView", "getLanguageTextView", "starsTextView", "getStarsTextView", "titleTextView", "getTitleTextView", "watchersTextView", "getWatchersTextView", "app_prodDebug"})
    public static final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView descriptionTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView watchersTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView languageTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView starsTextView = null;
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescriptionTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getWatchersTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLanguageTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getStarsTextView() {
            return null;
        }
    }
}