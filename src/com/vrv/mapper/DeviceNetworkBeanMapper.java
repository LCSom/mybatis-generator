package com.vrv.mapper;

import com.vrv.bean.DeviceNetworkBean;
import com.vrv.bean.DeviceNetworkBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceNetworkBeanMapper {
    int countByExample(DeviceNetworkBeanExample example);

    int deleteByExample(DeviceNetworkBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceNetworkBean record);

    int insertSelective(DeviceNetworkBean record);

    List<DeviceNetworkBean> selectByExample(DeviceNetworkBeanExample example);

    DeviceNetworkBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceNetworkBean record, @Param("example") DeviceNetworkBeanExample example);

    int updateByExample(@Param("record") DeviceNetworkBean record, @Param("example") DeviceNetworkBeanExample example);

    int updateByPrimaryKeySelective(DeviceNetworkBean record);

    int updateByPrimaryKey(DeviceNetworkBean record);
}