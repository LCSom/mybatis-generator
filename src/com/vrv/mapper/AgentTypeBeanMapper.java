package com.vrv.mapper;

import com.vrv.bean.AgentTypeBean;
import com.vrv.bean.AgentTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentTypeBeanMapper {
    int countByExample(AgentTypeBeanExample example);

    int deleteByExample(AgentTypeBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(AgentTypeBean record);

    int insertSelective(AgentTypeBean record);

    List<AgentTypeBean> selectByExampleWithBLOBs(AgentTypeBeanExample example);

    List<AgentTypeBean> selectByExample(AgentTypeBeanExample example);

    AgentTypeBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AgentTypeBean record, @Param("example") AgentTypeBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") AgentTypeBean record, @Param("example") AgentTypeBeanExample example);

    int updateByExample(@Param("record") AgentTypeBean record, @Param("example") AgentTypeBeanExample example);

    int updateByPrimaryKeySelective(AgentTypeBean record);

    int updateByPrimaryKeyWithBLOBs(AgentTypeBean record);

    int updateByPrimaryKey(AgentTypeBean record);
}