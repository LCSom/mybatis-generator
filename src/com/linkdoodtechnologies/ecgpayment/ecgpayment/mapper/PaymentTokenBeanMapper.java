package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentTokenBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.PaymentTokenBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentTokenBeanMapper {
    int countByExample(PaymentTokenBeanExample example);

    int deleteByExample(PaymentTokenBeanExample example);

    int deleteByPrimaryKey(Integer pttId);

    int insert(PaymentTokenBean record);

    int insertSelective(PaymentTokenBean record);

    List<PaymentTokenBean> selectByExampleWithBLOBs(PaymentTokenBeanExample example);

    List<PaymentTokenBean> selectByExample(PaymentTokenBeanExample example);

    PaymentTokenBean selectByPrimaryKey(Integer pttId);

    int updateByExampleSelective(@Param("record") PaymentTokenBean record, @Param("example") PaymentTokenBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") PaymentTokenBean record, @Param("example") PaymentTokenBeanExample example);

    int updateByExample(@Param("record") PaymentTokenBean record, @Param("example") PaymentTokenBeanExample example);

    int updateByPrimaryKeySelective(PaymentTokenBean record);

    int updateByPrimaryKeyWithBLOBs(PaymentTokenBean record);

    int updateByPrimaryKey(PaymentTokenBean record);
}