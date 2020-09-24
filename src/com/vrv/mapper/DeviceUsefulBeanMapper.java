package com.vrv.mapper;

import com.vrv.bean.DeviceUsefulBean;
import com.vrv.bean.DeviceUsefulBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceUsefulBeanMapper {
    int countByExample(DeviceUsefulBeanExample example);

    int deleteByExample(DeviceUsefulBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceUsefulBean record);

    int insertSelective(DeviceUsefulBean record);

    List<DeviceUsefulBean> selectByExample(DeviceUsefulBeanExample example);

    DeviceUsefulBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceUsefulBean record, @Param("example") DeviceUsefulBeanExample example);

    int updateByExample(@Param("record") DeviceUsefulBean record, @Param("example") DeviceUsefulBeanExample example);

    int updateByPrimaryKeySelective(DeviceUsefulBean record);

    int updateByPrimaryKey(DeviceUsefulBean record);
}