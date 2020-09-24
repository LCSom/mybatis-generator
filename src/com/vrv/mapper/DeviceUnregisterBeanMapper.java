package com.vrv.mapper;

import com.vrv.bean.DeviceUnregisterBean;
import com.vrv.bean.DeviceUnregisterBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceUnregisterBeanMapper {
    int countByExample(DeviceUnregisterBeanExample example);

    int deleteByExample(DeviceUnregisterBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceUnregisterBean record);

    int insertSelective(DeviceUnregisterBean record);

    List<DeviceUnregisterBean> selectByExample(DeviceUnregisterBeanExample example);

    DeviceUnregisterBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceUnregisterBean record, @Param("example") DeviceUnregisterBeanExample example);

    int updateByExample(@Param("record") DeviceUnregisterBean record, @Param("example") DeviceUnregisterBeanExample example);

    int updateByPrimaryKeySelective(DeviceUnregisterBean record);

    int updateByPrimaryKey(DeviceUnregisterBean record);
}