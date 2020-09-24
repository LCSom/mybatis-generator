package com.vrv.mapper;

import com.vrv.bean.TerminalOrgTierConfigBean;
import com.vrv.bean.TerminalOrgTierConfigBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalOrgTierConfigBeanMapper {
    int countByExample(TerminalOrgTierConfigBeanExample example);

    int deleteByExample(TerminalOrgTierConfigBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(TerminalOrgTierConfigBean record);

    int insertSelective(TerminalOrgTierConfigBean record);

    List<TerminalOrgTierConfigBean> selectByExample(TerminalOrgTierConfigBeanExample example);

    TerminalOrgTierConfigBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TerminalOrgTierConfigBean record, @Param("example") TerminalOrgTierConfigBeanExample example);

    int updateByExample(@Param("record") TerminalOrgTierConfigBean record, @Param("example") TerminalOrgTierConfigBeanExample example);

    int updateByPrimaryKeySelective(TerminalOrgTierConfigBean record);

    int updateByPrimaryKey(TerminalOrgTierConfigBean record);
}