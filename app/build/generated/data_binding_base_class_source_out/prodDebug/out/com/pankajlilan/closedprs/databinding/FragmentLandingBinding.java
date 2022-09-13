// Generated by data binding compiler. Do not edit!
package com.pankajlilan.closedprs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.pankajlilan.closedprs.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLandingBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView appCompatImageView2;

  @NonNull
  public final AppCompatTextView appCompatTextView;

  @NonNull
  public final AppCompatButton btnContinue;

  @NonNull
  public final AppCompatEditText edtUserName;

  protected FragmentLandingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView,
      AppCompatButton btnContinue, AppCompatEditText edtUserName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatImageView2 = appCompatImageView2;
    this.appCompatTextView = appCompatTextView;
    this.btnContinue = btnContinue;
    this.edtUserName = edtUserName;
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landing, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLandingBinding>inflateInternal(inflater, R.layout.fragment_landing, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landing, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLandingBinding>inflateInternal(inflater, R.layout.fragment_landing, null, false, component);
  }

  public static FragmentLandingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLandingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLandingBinding)bind(component, view, R.layout.fragment_landing);
  }
}