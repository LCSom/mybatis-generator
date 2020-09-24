package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentAppBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentAppBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentAppBeanMapper {
    int countByExample(PaymentAppBeanExample example);

    int deleteByExample(PaymentAppBeanExample example);

    int deleteByPrimaryKey(Integer patId);

    int insert(PaymentAppBean record);

    int insertSelective(PaymentAppBean record);

    List<PaymentAppBean> selectByExample(PaymentAppBeanExample example);

    PaymentAppBean selectByPrimaryKey(Integer patId);

    int updateByExampleSelective(@Param("record") PaymentAppBean record, @Param("example") PaymentAppBeanExample example);

    int updateByExample(@Param("record") PaymentAppBean record, @Param("example") PaymentAppBeanExample example);

    int updateByPrimaryKeySelective(PaymentAppBean record);

    int updateByPrimaryKey(PaymentAppBean record);
}