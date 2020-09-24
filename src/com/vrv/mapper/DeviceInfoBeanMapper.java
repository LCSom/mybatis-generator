package com.vrv.mapper;

import com.vrv.bean.DeviceInfoBean;
import com.vrv.bean.DeviceInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceInfoBeanMapper {
    int countByExample(DeviceInfoBeanExample example);

    int deleteByExample(DeviceInfoBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceInfoBean record);

    int insertSelective(DeviceInfoBean record);

    List<DeviceInfoBean> selectByExampleWithBLOBs(DeviceInfoBeanExample example);

    List<DeviceInfoBean> selectByExample(DeviceInfoBeanExample example);

    DeviceInfoBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceInfoBean record, @Param("example") DeviceInfoBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceInfoBean record, @Param("example") DeviceInfoBeanExample example);

    int updateByExample(@Param("record") DeviceInfoBean record, @Param("example") DeviceInfoBeanExample example);

    int updateByPrimaryKeySelective(DeviceInfoBean record);

    int updateByPrimaryKeyWithBLOBs(DeviceInfoBean record);

    int updateByPrimaryKey(DeviceInfoBean record);
}