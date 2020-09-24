package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudWatchBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudWatchBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudWatchBeanMapper {
    int countByExample(CloudWatchBeanExample example);

    int deleteByExample(CloudWatchBeanExample example);

    int deleteByPrimaryKey(Integer cwtId);

    int insert(CloudWatchBean record);

    int insertSelective(CloudWatchBean record);

    List<CloudWatchBean> selectByExample(CloudWatchBeanExample example);

    CloudWatchBean selectByPrimaryKey(Integer cwtId);

    int updateByExampleSelective(@Param("record") CloudWatchBean record, @Param("example") CloudWatchBeanExample example);

    int updateByExample(@Param("record") CloudWatchBean record, @Param("example") CloudWatchBeanExample example);

    int updateByPrimaryKeySelective(CloudWatchBean record);

    int updateByPrimaryKey(CloudWatchBean record);
}