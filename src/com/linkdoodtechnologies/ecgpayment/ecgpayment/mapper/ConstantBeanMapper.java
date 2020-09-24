package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.ConstantBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.ConstantBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstantBeanMapper {
    int countByExample(ConstantBeanExample example);

    int deleteByExample(ConstantBeanExample example);

    int deleteByPrimaryKey(Integer constId);

    int insert(ConstantBean record);

    int insertSelective(ConstantBean record);

    List<ConstantBean> selectByExample(ConstantBeanExample example);

    ConstantBean selectByPrimaryKey(Integer constId);

    int updateByExampleSelective(@Param("record") ConstantBean record, @Param("example") ConstantBeanExample example);

    int updateByExample(@Param("record") ConstantBean record, @Param("example") ConstantBeanExample example);

    int updateByPrimaryKeySelective(ConstantBean record);

    int updateByPrimaryKey(ConstantBean record);
}