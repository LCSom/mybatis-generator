package com.vrv.mapper;

import com.vrv.bean.OsBean;
import com.vrv.bean.OsBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsBeanMapper {
    int countByExample(OsBeanExample example);

    int deleteByExample(OsBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(OsBean record);

    int insertSelective(OsBean record);

    List<OsBean> selectByExample(OsBeanExample example);

    OsBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OsBean record, @Param("example") OsBeanExample example);

    int updateByExample(@Param("record") OsBean record, @Param("example") OsBeanExample example);

    int updateByPrimaryKeySelective(OsBean record);

    int updateByPrimaryKey(OsBean record);
}