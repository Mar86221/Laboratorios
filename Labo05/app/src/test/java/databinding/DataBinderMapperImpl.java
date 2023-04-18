package databinding;addAction

import androidx.databinding.MergedDataBinderMapper;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.dgarzona.labo05.DataBinderMapperImpl());
  }
}
