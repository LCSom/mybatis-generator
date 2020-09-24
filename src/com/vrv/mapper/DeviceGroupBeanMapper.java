package com.vrv.mapper;

import com.vrv.bean.DeviceGroupBean;
import com.vrv.bean.DeviceGroupBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceGroupBeanMapper {
    int countByExample(DeviceGroupBeanExample example);

    int deleteByExample(DeviceGroupBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceGroupBean record);

    int insertSelective(DeviceGroupBean record);

    List<DeviceGroupBean> selectByExample(DeviceGroupBeanExample example);

    DeviceGroupBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceGroupBean record, @Param("example") DeviceGroupBeanExample example);

    int updateByExample(@Param("record") DeviceGroupBean record, @Param("example") DeviceGroupBeanExample example);

    int updateByPrimaryKeySelective(DeviceGroupBean record);

    int updateByPrimaryKey(DeviceGroupBean record);
}