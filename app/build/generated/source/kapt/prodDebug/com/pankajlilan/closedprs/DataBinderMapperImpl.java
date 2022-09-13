package com.pankajlilan.closedprs;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.pankajlilan.closedprs.databinding.FragmentLandingBindingImpl;
import com.pankajlilan.closedprs.databinding.FragmentPullRequestBindingImpl;
import com.pankajlilan.closedprs.databinding.FragmentRepoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLANDING = 1;

  private static final int LAYOUT_FRAGMENTPULLREQUEST = 2;

  private static final int LAYOUT_FRAGMENTREPO = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.pankajlilan.closedprs.R.layout.fragment_landing, LAYOUT_FRAGMENTLANDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.pankajlilan.closedprs.R.layout.fragment_pull_request, LAYOUT_FRAGMENTPULLREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.pankajlilan.closedprs.R.layout.fragment_repo, LAYOUT_FRAGMENTREPO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLANDING: {
          if ("layout/fragment_landing_0".equals(tag)) {
            return new FragmentLandingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_landing is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPULLREQUEST: {
          if ("layout/fragment_pull_request_0".equals(tag)) {
            return new FragmentPullRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pull_request is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPO: {
          if ("layout/fragment_repo_0".equals(tag)) {
            return new FragmentRepoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_repo is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_landing_0", com.pankajlilan.closedprs.R.layout.fragment_landing);
      sKeys.put("layout/fragment_pull_request_0", com.pankajlilan.closedprs.R.layout.fragment_pull_request);
      sKeys.put("layout/fragment_repo_0", com.pankajlilan.closedprs.R.layout.fragment_repo);
    }
  }
}
