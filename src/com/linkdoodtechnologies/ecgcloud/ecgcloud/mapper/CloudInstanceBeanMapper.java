package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudInstanceBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudInstanceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudInstanceBeanMapper {
    int countByExample(CloudInstanceBeanExample example);

    int deleteByExample(CloudInstanceBeanExample example);

    int deleteByPrimaryKey(Integer citId);

    int insert(CloudInstanceBean record);

    int insertSelective(CloudInstanceBean record);

    List<CloudInstanceBean> selectByExample(CloudInstanceBeanExample example);

    CloudInstanceBean selectByPrimaryKey(Integer citId);

    int updateByExampleSelective(@Param("record") CloudInstanceBean record, @Param("example") CloudInstanceBeanExample example);

    int updateByExample(@Param("record") CloudInstanceBean record, @Param("example") CloudInstanceBeanExample example);

    int updateByPrimaryKeySelective(CloudInstanceBean record);

    int updateByPrimaryKey(CloudInstanceBean record);
}