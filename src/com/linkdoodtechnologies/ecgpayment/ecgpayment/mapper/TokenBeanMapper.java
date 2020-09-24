package com.linkdoodtechnologies.ecgpayment.ecgpayment.mapper;

import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.TokenBean;
import com.linkdoodtechnologies.ecgpayment.ecgpayment.bean.TokenBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenBeanMapper {
    int countByExample(TokenBeanExample example);

    int deleteByExample(TokenBeanExample example);

    int deleteByPrimaryKey(Integer attTokenId);

    int insert(TokenBean record);

    int insertSelective(TokenBean record);

    List<TokenBean> selectByExample(TokenBeanExample example);

    TokenBean selectByPrimaryKey(Integer attTokenId);

    int updateByExampleSelective(@Param("record") TokenBean record, @Param("example") TokenBeanExample example);

    int updateByExample(@Param("record") TokenBean record, @Param("example") TokenBeanExample example);

    int updateByPrimaryKeySelective(TokenBean record);

    int updateByPrimaryKey(TokenBean record);
}