package com.vrv.mapper;

import com.vrv.bean.DeviceOnlineBean;
import com.vrv.bean.DeviceOnlineBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceOnlineBeanMapper {
    int countByExample(DeviceOnlineBeanExample example);

    int deleteByExample(DeviceOnlineBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceOnlineBean record);

    int insertSelective(DeviceOnlineBean record);

    List<DeviceOnlineBean> selectByExample(DeviceOnlineBeanExample example);

    DeviceOnlineBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceOnlineBean record, @Param("example") DeviceOnlineBeanExample example);

    int updateByExample(@Param("record") DeviceOnlineBean record, @Param("example") DeviceOnlineBeanExample example);

    int updateByPrimaryKeySelective(DeviceOnlineBean record);

    int updateByPrimaryKey(DeviceOnlineBean record);
}