package com.vrv.mapper;

import com.vrv.bean.HardwareControlLogBean;
import com.vrv.bean.HardwareControlLogBeanExample;
import com.vrv.bean.HardwareControlLogBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareControlLogBeanMapper {
    int countByExample(HardwareControlLogBeanExample example);

    int deleteByExample(HardwareControlLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardwareControlLogBeanWithBLOBs record);

    int insertSelective(HardwareControlLogBeanWithBLOBs record);

    List<HardwareControlLogBeanWithBLOBs> selectByExampleWithBLOBs(HardwareControlLogBeanExample example);

    List<HardwareControlLogBean> selectByExample(HardwareControlLogBeanExample example);

    HardwareControlLogBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardwareControlLogBeanWithBLOBs record, @Param("example") HardwareControlLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") HardwareControlLogBeanWithBLOBs record, @Param("example") HardwareControlLogBeanExample example);

    int updateByExample(@Param("record") HardwareControlLogBean record, @Param("example") HardwareControlLogBeanExample example);

    int updateByPrimaryKeySelective(HardwareControlLogBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HardwareControlLogBeanWithBLOBs record);

    int updateByPrimaryKey(HardwareControlLogBean record);
}