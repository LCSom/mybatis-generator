package com.vrv.mapper;

import com.vrv.bean.PolicyTargetOrgBean;
import com.vrv.bean.PolicyTargetOrgBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolicyTargetOrgBeanMapper {
    int countByExample(PolicyTargetOrgBeanExample example);

    int deleteByExample(PolicyTargetOrgBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PolicyTargetOrgBean record);

    int insertSelective(PolicyTargetOrgBean record);

    List<PolicyTargetOrgBean> selectByExample(PolicyTargetOrgBeanExample example);

    PolicyTargetOrgBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PolicyTargetOrgBean record, @Param("example") PolicyTargetOrgBeanExample example);

    int updateByExample(@Param("record") PolicyTargetOrgBean record, @Param("example") PolicyTargetOrgBeanExample example);

    int updateByPrimaryKeySelective(PolicyTargetOrgBean record);

    int updateByPrimaryKey(PolicyTargetOrgBean record);
}