package com.vrv.mapper;

import com.vrv.bean.ServerAreaBean;
import com.vrv.bean.ServerAreaBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerAreaBeanMapper {
    int countByExample(ServerAreaBeanExample example);

    int deleteByExample(ServerAreaBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(ServerAreaBean record);

    int insertSelective(ServerAreaBean record);

    List<ServerAreaBean> selectByExample(ServerAreaBeanExample example);

    ServerAreaBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ServerAreaBean record, @Param("example") ServerAreaBeanExample example);

    int updateByExample(@Param("record") ServerAreaBean record, @Param("example") ServerAreaBeanExample example);

    int updateByPrimaryKeySelective(ServerAreaBean record);

    int updateByPrimaryKey(ServerAreaBean record);
}