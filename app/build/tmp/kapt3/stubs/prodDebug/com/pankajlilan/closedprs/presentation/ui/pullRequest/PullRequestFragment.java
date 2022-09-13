package com.pankajlilan.closedprs.presentation.ui.pullRequest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010\'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0002J\u0018\u0010)\u001a\u00020\u001c2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002J\b\u0010-\u001a\u00020\u001cH\u0003J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/pankajlilan/closedprs/databinding/FragmentPullRequestBinding;", "adapter", "Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestAdapter;", "args", "Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestFragmentArgs;", "getArgs", "()Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/pankajlilan/closedprs/databinding/FragmentPullRequestBinding;", "fetchDataDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchDataDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "fetchDataDisposable$delegate", "Lkotlin/Lazy;", "repo", "", "userName", "viewModel", "Lcom/pankajlilan/closedprs/presentation/ui/pullRequest/PullRequestViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onError", "onNoDataFound", "show", "Lcom/pankajlilan/closedprs/presentation/utils/Event;", "", "registerObservables", "setupViews", "submitItems", "app_prodDebug"})
public final class PullRequestFragment extends androidx.fragment.app.Fragment {
    private com.pankajlilan.closedprs.presentation.ui.pullRequest.PullRequestViewModel viewModel;
    private com.pankajlilan.closedprs.presentation.ui.pullRequest.PullRequestAdapter adapter;
    private java.lang.String userName;
    private java.lang.String repo;
    private com.pankajlilan.closedprs.databinding.FragmentPullRequestBinding _binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy fetchDataDisposable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public PullRequestFragment() {
        super();
    }
    
    private final com.pankajlilan.closedprs.databinding.FragmentPullRequestBinding getBinding() {
        return null;
    }
    
    private final com.pankajlilan.closedprs.presentation.ui.pullRequest.PullRequestFragmentArgs getArgs() {
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void registerObservables() {
    }
    
    private final void onError() {
    }
    
    private final void onNoDataFound(com.pankajlilan.closedprs.presentation.utils.Event<java.lang.Boolean> show) {
    }
    
    private final void submitItems() {
    }
}