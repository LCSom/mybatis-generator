package com.vrv.mapper;

import com.vrv.bean.ConstantBean;
import com.vrv.bean.ConstantBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstantBeanMapper {
    int countByExample(ConstantBeanExample example);

    int deleteByExample(ConstantBeanExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(ConstantBean record);

    int insertSelective(ConstantBean record);

    List<ConstantBean> selectByExample(ConstantBeanExample example);

    ConstantBean selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") ConstantBean record, @Param("example") ConstantBeanExample example);

    int updateByExample(@Param("record") ConstantBean record, @Param("example") ConstantBeanExample example);

    int updateByPrimaryKeySelective(ConstantBean record);

    int updateByPrimaryKey(ConstantBean record);
}