package com.vrv.mapper;

import com.vrv.bean.DeviceTypeGroupBean;
import com.vrv.bean.DeviceTypeGroupBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeGroupBeanMapper {
    int countByExample(DeviceTypeGroupBeanExample example);

    int deleteByExample(DeviceTypeGroupBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceTypeGroupBean record);

    int insertSelective(DeviceTypeGroupBean record);

    List<DeviceTypeGroupBean> selectByExampleWithBLOBs(DeviceTypeGroupBeanExample example);

    List<DeviceTypeGroupBean> selectByExample(DeviceTypeGroupBeanExample example);

    DeviceTypeGroupBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceTypeGroupBean record, @Param("example") DeviceTypeGroupBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceTypeGroupBean record, @Param("example") DeviceTypeGroupBeanExample example);

    int updateByExample(@Param("record") DeviceTypeGroupBean record, @Param("example") DeviceTypeGroupBeanExample example);

    int updateByPrimaryKeySelective(DeviceTypeGroupBean record);

    int updateByPrimaryKeyWithBLOBs(DeviceTypeGroupBean record);

    int updateByPrimaryKey(DeviceTypeGroupBean record);
}