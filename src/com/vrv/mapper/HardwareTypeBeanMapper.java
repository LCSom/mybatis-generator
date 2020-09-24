package com.vrv.mapper;

import com.vrv.bean.HardwareTypeBean;
import com.vrv.bean.HardwareTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareTypeBeanMapper {
    int countByExample(HardwareTypeBeanExample example);

    int deleteByExample(HardwareTypeBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardwareTypeBean record);

    int insertSelective(HardwareTypeBean record);

    List<HardwareTypeBean> selectByExample(HardwareTypeBeanExample example);

    HardwareTypeBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardwareTypeBean record, @Param("example") HardwareTypeBeanExample example);

    int updateByExample(@Param("record") HardwareTypeBean record, @Param("example") HardwareTypeBeanExample example);

    int updateByPrimaryKeySelective(HardwareTypeBean record);

    int updateByPrimaryKey(HardwareTypeBean record);
}