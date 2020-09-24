package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentUserBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentUserBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentUserBeanMapper {
    int countByExample(PaymentUserBeanExample example);

    int deleteByExample(PaymentUserBeanExample example);

    int deleteByPrimaryKey(Integer autId);

    int insert(PaymentUserBean record);

    int insertSelective(PaymentUserBean record);

    List<PaymentUserBean> selectByExample(PaymentUserBeanExample example);

    PaymentUserBean selectByPrimaryKey(Integer autId);

    int updateByExampleSelective(@Param("record") PaymentUserBean record, @Param("example") PaymentUserBeanExample example);

    int updateByExample(@Param("record") PaymentUserBean record, @Param("example") PaymentUserBeanExample example);

    int updateByPrimaryKeySelective(PaymentUserBean record);

    int updateByPrimaryKey(PaymentUserBean record);
}