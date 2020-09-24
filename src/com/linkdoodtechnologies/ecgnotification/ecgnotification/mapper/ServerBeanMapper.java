package com.linkdoodtechnologies.ecgnotification.ecgnotification.mapper;

import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.ServerBean;
import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.ServerBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerBeanMapper {
    int countByExample(ServerBeanExample example);

    int deleteByExample(ServerBeanExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(ServerBean record);

    int insertSelective(ServerBean record);

    List<ServerBean> selectByExample(ServerBeanExample example);

    ServerBean selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") ServerBean record, @Param("example") ServerBeanExample example);

    int updateByExample(@Param("record") ServerBean record, @Param("example") ServerBeanExample example);

    int updateByPrimaryKeySelective(ServerBean record);

    int updateByPrimaryKey(ServerBean record);
}