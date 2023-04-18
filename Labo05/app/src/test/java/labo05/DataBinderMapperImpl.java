package labo05;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;

import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

import com.dgarzona.labo05.databinding.ActivityMainBindingImpl;
import com.dgarzona.labo05.databinding.FragmentMovieContainerBindingImpl;
import com.dgarzona.labo05.databinding.FragmentMovieDetailsBindingImpl;
import com.dgarzona.labo05.databinding.FragmentNewMovieBindingImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTMOVIECONTAINER = 2;

  private static final int LAYOUT_FRAGMENTMOVIEDETAILS = 3;

  private static final int LAYOUT_FRAGMENTNEWMOVIE = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dgarzona.labo05.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dgarzona.labo05.R.layout.fragment_movie_container, LAYOUT_FRAGMENTMOVIECONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dgarzona.labo05.R.layout.fragment_movie_details, LAYOUT_FRAGMENTMOVIEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dgarzona.labo05.R.layout.fragment_new_movie, LAYOUT_FRAGMENTNEWMOVIE);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIECONTAINER: {
          if ("layout/fragment_movie_container_0".equals(tag)) {
            return new FragmentMovieContainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie_container is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIEDETAILS: {
          if ("layout/fragment_movie_details_0".equals(tag)) {
            return new FragmentMovieDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWMOVIE: {
          if ("layout/fragment_new_movie_0".equals(tag)) {
            return new FragmentNewMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_movie is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.dgarzona.labo05.R.layout.activity_main);
      sKeys.put("layout/fragment_movie_container_0", com.dgarzona.labo05.R.layout.fragment_movie_container);
      sKeys.put("layout/fragment_movie_details_0", com.dgarzona.labo05.R.layout.fragment_movie_details);
      sKeys.put("layout/fragment_new_movie_0", com.dgarzona.labo05.R.layout.fragment_new_movie);
    }
  }
}
