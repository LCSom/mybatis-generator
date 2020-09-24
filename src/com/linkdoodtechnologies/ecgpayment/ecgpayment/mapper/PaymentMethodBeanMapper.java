package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentMethodBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentMethodBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMethodBeanMapper {
    int countByExample(PaymentMethodBeanExample example);

    int deleteByExample(PaymentMethodBeanExample example);

    int deleteByPrimaryKey(Integer pmtId);

    int insert(PaymentMethodBean record);

    int insertSelective(PaymentMethodBean record);

    List<PaymentMethodBean> selectByExample(PaymentMethodBeanExample example);

    PaymentMethodBean selectByPrimaryKey(Integer pmtId);

    int updateByExampleSelective(@Param("record") PaymentMethodBean record, @Param("example") PaymentMethodBeanExample example);

    int updateByExample(@Param("record") PaymentMethodBean record, @Param("example") PaymentMethodBeanExample example);

    int updateByPrimaryKeySelective(PaymentMethodBean record);

    int updateByPrimaryKey(PaymentMethodBean record);
}