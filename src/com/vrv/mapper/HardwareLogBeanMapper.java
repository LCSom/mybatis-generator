package com.vrv.mapper;

import com.vrv.bean.HardwareLogBean;
import com.vrv.bean.HardwareLogBeanExample;
import com.vrv.bean.HardwareLogBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareLogBeanMapper {
    int countByExample(HardwareLogBeanExample example);

    int deleteByExample(HardwareLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardwareLogBeanWithBLOBs record);

    int insertSelective(HardwareLogBeanWithBLOBs record);

    List<HardwareLogBeanWithBLOBs> selectByExampleWithBLOBs(HardwareLogBeanExample example);

    List<HardwareLogBean> selectByExample(HardwareLogBeanExample example);

    HardwareLogBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardwareLogBeanWithBLOBs record, @Param("example") HardwareLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") HardwareLogBeanWithBLOBs record, @Param("example") HardwareLogBeanExample example);

    int updateByExample(@Param("record") HardwareLogBean record, @Param("example") HardwareLogBeanExample example);

    int updateByPrimaryKeySelective(HardwareLogBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HardwareLogBeanWithBLOBs record);

    int updateByPrimaryKey(HardwareLogBean record);
}