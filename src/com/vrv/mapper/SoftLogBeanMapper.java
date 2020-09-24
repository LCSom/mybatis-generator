package com.vrv.mapper;

import com.vrv.bean.SoftLogBean;
import com.vrv.bean.SoftLogBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftLogBeanMapper {
    int countByExample(SoftLogBeanExample example);

    int deleteByExample(SoftLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(SoftLogBean record);

    int insertSelective(SoftLogBean record);

    List<SoftLogBean> selectByExampleWithBLOBs(SoftLogBeanExample example);

    List<SoftLogBean> selectByExample(SoftLogBeanExample example);

    SoftLogBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SoftLogBean record, @Param("example") SoftLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") SoftLogBean record, @Param("example") SoftLogBeanExample example);

    int updateByExample(@Param("record") SoftLogBean record, @Param("example") SoftLogBeanExample example);

    int updateByPrimaryKeySelective(SoftLogBean record);

    int updateByPrimaryKeyWithBLOBs(SoftLogBean record);

    int updateByPrimaryKey(SoftLogBean record);
}