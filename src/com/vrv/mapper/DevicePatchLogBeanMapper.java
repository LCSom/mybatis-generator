package com.vrv.mapper;

import com.vrv.bean.DevicePatchLogBean;
import com.vrv.bean.DevicePatchLogBeanExample;
import com.vrv.bean.DevicePatchLogBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicePatchLogBeanMapper {
    int countByExample(DevicePatchLogBeanExample example);

    int deleteByExample(DevicePatchLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(DevicePatchLogBeanWithBLOBs record);

    int insertSelective(DevicePatchLogBeanWithBLOBs record);

    List<DevicePatchLogBeanWithBLOBs> selectByExampleWithBLOBs(DevicePatchLogBeanExample example);

    List<DevicePatchLogBean> selectByExample(DevicePatchLogBeanExample example);

    DevicePatchLogBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DevicePatchLogBeanWithBLOBs record, @Param("example") DevicePatchLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") DevicePatchLogBeanWithBLOBs record, @Param("example") DevicePatchLogBeanExample example);

    int updateByExample(@Param("record") DevicePatchLogBean record, @Param("example") DevicePatchLogBeanExample example);

    int updateByPrimaryKeySelective(DevicePatchLogBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DevicePatchLogBeanWithBLOBs record);

    int updateByPrimaryKey(DevicePatchLogBean record);
}