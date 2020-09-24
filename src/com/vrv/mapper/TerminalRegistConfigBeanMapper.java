package com.vrv.mapper;

import com.vrv.bean.TerminalRegistConfigBean;
import com.vrv.bean.TerminalRegistConfigBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalRegistConfigBeanMapper {
    int countByExample(TerminalRegistConfigBeanExample example);

    int deleteByExample(TerminalRegistConfigBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(TerminalRegistConfigBean record);

    int insertSelective(TerminalRegistConfigBean record);

    List<TerminalRegistConfigBean> selectByExampleWithBLOBs(TerminalRegistConfigBeanExample example);

    List<TerminalRegistConfigBean> selectByExample(TerminalRegistConfigBeanExample example);

    TerminalRegistConfigBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TerminalRegistConfigBean record, @Param("example") TerminalRegistConfigBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") TerminalRegistConfigBean record, @Param("example") TerminalRegistConfigBeanExample example);

    int updateByExample(@Param("record") TerminalRegistConfigBean record, @Param("example") TerminalRegistConfigBeanExample example);

    int updateByPrimaryKeySelective(TerminalRegistConfigBean record);

    int updateByPrimaryKeyWithBLOBs(TerminalRegistConfigBean record);

    int updateByPrimaryKey(TerminalRegistConfigBean record);
}