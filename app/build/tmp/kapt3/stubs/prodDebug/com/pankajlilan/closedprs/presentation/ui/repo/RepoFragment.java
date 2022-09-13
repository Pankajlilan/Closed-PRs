package com.pankajlilan.closedprs.presentation.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0012\u0010 \u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\u0018\u0010*\u001a\u00020\u001b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J\b\u0010.\u001a\u00020\u001bH\u0003J\b\u0010/\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/pankajlilan/closedprs/databinding/FragmentRepoBinding;", "adapter", "Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoAdapter;", "args", "Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoFragmentArgs;", "getArgs", "()Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/pankajlilan/closedprs/databinding/FragmentRepoBinding;", "fetchDataDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchDataDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "fetchDataDisposable$delegate", "Lkotlin/Lazy;", "userName", "", "viewModel", "Lcom/pankajlilan/closedprs/presentation/ui/repo/RepoViewModel;", "goToClosedPrFragment", "", "repo", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onError", "onNoDataFound", "show", "Lcom/pankajlilan/closedprs/presentation/utils/Event;", "", "registerObservables", "setupViews", "submitItems", "app_prodDebug"})
public final class RepoFragment extends androidx.fragment.app.Fragment {
    private com.pankajlilan.closedprs.presentation.ui.repo.RepoViewModel viewModel;
    private com.pankajlilan.closedprs.presentation.ui.repo.RepoAdapter adapter;
    private java.lang.String userName;
    private com.pankajlilan.closedprs.databinding.FragmentRepoBinding _binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy fetchDataDisposable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public RepoFragment() {
        super();
    }
    
    private final com.pankajlilan.closedprs.databinding.FragmentRepoBinding getBinding() {
        return null;
    }
    
    private final com.pankajlilan.closedprs.presentation.ui.repo.RepoFragmentArgs getArgs() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getFetchDataDisposable() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void onError() {
    }
    
    private final void onNoDataFound(com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean> show) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void registerObservables() {
    }
    
    private final void submitItems() {
    }
    
    private final void goToClosedPrFragment(java.lang.String userName, java.lang.String repo) {
    }
}