package com.vrv.mapper;

import com.vrv.bean.DeviceTypeBean;
import com.vrv.bean.DeviceTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeBeanMapper {
    int countByExample(DeviceTypeBeanExample example);

    int deleteByExample(DeviceTypeBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceTypeBean record);

    int insertSelective(DeviceTypeBean record);

    List<DeviceTypeBean> selectByExample(DeviceTypeBeanExample example);

    DeviceTypeBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceTypeBean record, @Param("example") DeviceTypeBeanExample example);

    int updateByExample(@Param("record") DeviceTypeBean record, @Param("example") DeviceTypeBeanExample example);

    int updateByPrimaryKeySelective(DeviceTypeBean record);

    int updateByPrimaryKey(DeviceTypeBean record);
}