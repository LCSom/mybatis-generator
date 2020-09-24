package com.vrv.mapper;

import com.vrv.bean.DeviceKvsBean;
import com.vrv.bean.DeviceKvsBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceKvsBeanMapper {
    int countByExample(DeviceKvsBeanExample example);

    int deleteByExample(DeviceKvsBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceKvsBean record);

    int insertSelective(DeviceKvsBean record);

    List<DeviceKvsBean> selectByExample(DeviceKvsBeanExample example);

    DeviceKvsBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceKvsBean record, @Param("example") DeviceKvsBeanExample example);

    int updateByExample(@Param("record") DeviceKvsBean record, @Param("example") DeviceKvsBeanExample example);

    int updateByPrimaryKeySelective(DeviceKvsBean record);

    int updateByPrimaryKey(DeviceKvsBean record);
}