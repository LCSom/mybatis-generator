package com.vrv.mapper;

import com.vrv.bean.DeviceBean;
import com.vrv.bean.DeviceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceBeanMapper {
    int countByExample(DeviceBeanExample example);

    int deleteByExample(DeviceBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceBean record);

    int insertSelective(DeviceBean record);

    List<DeviceBean> selectByExample(DeviceBeanExample example);

    DeviceBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceBean record, @Param("example") DeviceBeanExample example);

    int updateByExample(@Param("record") DeviceBean record, @Param("example") DeviceBeanExample example);

    int updateByPrimaryKeySelective(DeviceBean record);

    int updateByPrimaryKey(DeviceBean record);
}