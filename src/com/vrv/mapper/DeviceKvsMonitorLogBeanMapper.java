package com.vrv.mapper;

import com.vrv.bean.DeviceKvsMonitorLogBean;
import com.vrv.bean.DeviceKvsMonitorLogBeanExample;
import com.vrv.bean.DeviceKvsMonitorLogBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceKvsMonitorLogBeanMapper {
    int countByExample(DeviceKvsMonitorLogBeanExample example);

    int deleteByExample(DeviceKvsMonitorLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceKvsMonitorLogBeanWithBLOBs record);

    int insertSelective(DeviceKvsMonitorLogBeanWithBLOBs record);

    List<DeviceKvsMonitorLogBeanWithBLOBs> selectByExampleWithBLOBs(DeviceKvsMonitorLogBeanExample example);

    List<DeviceKvsMonitorLogBean> selectByExample(DeviceKvsMonitorLogBeanExample example);

    DeviceKvsMonitorLogBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceKvsMonitorLogBeanWithBLOBs record, @Param("example") DeviceKvsMonitorLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceKvsMonitorLogBeanWithBLOBs record, @Param("example") DeviceKvsMonitorLogBeanExample example);

    int updateByExample(@Param("record") DeviceKvsMonitorLogBean record, @Param("example") DeviceKvsMonitorLogBeanExample example);

    int updateByPrimaryKeySelective(DeviceKvsMonitorLogBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeviceKvsMonitorLogBeanWithBLOBs record);

    int updateByPrimaryKey(DeviceKvsMonitorLogBean record);
}