package com.vrv.mapper;

import com.vrv.bean.HardwareBean;
import com.vrv.bean.HardwareBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareBeanMapper {
    int countByExample(HardwareBeanExample example);

    int deleteByExample(HardwareBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardwareBean record);

    int insertSelective(HardwareBean record);

    List<HardwareBean> selectByExampleWithBLOBs(HardwareBeanExample example);

    List<HardwareBean> selectByExample(HardwareBeanExample example);

    HardwareBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardwareBean record, @Param("example") HardwareBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") HardwareBean record, @Param("example") HardwareBeanExample example);

    int updateByExample(@Param("record") HardwareBean record, @Param("example") HardwareBeanExample example);

    int updateByPrimaryKeySelective(HardwareBean record);

    int updateByPrimaryKeyWithBLOBs(HardwareBean record);

    int updateByPrimaryKey(HardwareBean record);
}