package com.vrv.mapper;

import com.vrv.bean.VerificationCodeBean;
import com.vrv.bean.VerificationCodeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerificationCodeBeanMapper {
    int countByExample(VerificationCodeBeanExample example);

    int deleteByExample(VerificationCodeBeanExample example);

    int deleteByPrimaryKey(Integer vctId);

    int insert(VerificationCodeBean record);

    int insertSelective(VerificationCodeBean record);

    List<VerificationCodeBean> selectByExample(VerificationCodeBeanExample example);

    VerificationCodeBean selectByPrimaryKey(Integer vctId);

    int updateByExampleSelective(@Param("record") VerificationCodeBean record, @Param("example") VerificationCodeBeanExample example);

    int updateByExample(@Param("record") VerificationCodeBean record, @Param("example") VerificationCodeBeanExample example);

    int updateByPrimaryKeySelective(VerificationCodeBean record);

    int updateByPrimaryKey(VerificationCodeBean record);
}