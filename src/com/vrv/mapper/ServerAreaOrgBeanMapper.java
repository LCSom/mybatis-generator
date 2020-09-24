package com.vrv.mapper;

import com.vrv.bean.ServerAreaOrgBeanExample;
import com.vrv.bean.ServerAreaOrgBeanKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerAreaOrgBeanMapper {
    int countByExample(ServerAreaOrgBeanExample example);

    int deleteByExample(ServerAreaOrgBeanExample example);

    int deleteByPrimaryKey(ServerAreaOrgBeanKey key);

    int insert(ServerAreaOrgBeanKey record);

    int insertSelective(ServerAreaOrgBeanKey record);

    List<ServerAreaOrgBeanKey> selectByExample(ServerAreaOrgBeanExample example);

    int updateByExampleSelective(@Param("record") ServerAreaOrgBeanKey record, @Param("example") ServerAreaOrgBeanExample example);

    int updateByExample(@Param("record") ServerAreaOrgBeanKey record, @Param("example") ServerAreaOrgBeanExample example);
}