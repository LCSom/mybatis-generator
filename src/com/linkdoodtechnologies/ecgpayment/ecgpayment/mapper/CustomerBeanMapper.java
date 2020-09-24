package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.CustomerBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.CustomerBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerBeanMapper {
    int countByExample(CustomerBeanExample example);

    int deleteByExample(CustomerBeanExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(CustomerBean record);

    int insertSelective(CustomerBean record);

    List<CustomerBean> selectByExample(CustomerBeanExample example);

    CustomerBean selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") CustomerBean record, @Param("example") CustomerBeanExample example);

    int updateByExample(@Param("record") CustomerBean record, @Param("example") CustomerBeanExample example);

    int updateByPrimaryKeySelective(CustomerBean record);

    int updateByPrimaryKey(CustomerBean record);
}