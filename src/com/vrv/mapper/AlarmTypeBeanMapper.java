package com.vrv.mapper;

import com.vrv.bean.AlarmTypeBean;
import com.vrv.bean.AlarmTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmTypeBeanMapper {
    int countByExample(AlarmTypeBeanExample example);

    int deleteByExample(AlarmTypeBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlarmTypeBean record);

    int insertSelective(AlarmTypeBean record);

    List<AlarmTypeBean> selectByExample(AlarmTypeBeanExample example);

    AlarmTypeBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlarmTypeBean record, @Param("example") AlarmTypeBeanExample example);

    int updateByExample(@Param("record") AlarmTypeBean record, @Param("example") AlarmTypeBeanExample example);

    int updateByPrimaryKeySelective(AlarmTypeBean record);

    int updateByPrimaryKey(AlarmTypeBean record);
}