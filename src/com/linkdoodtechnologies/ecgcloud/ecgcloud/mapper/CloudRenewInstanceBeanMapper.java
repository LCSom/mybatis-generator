package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudRenewInstanceBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudRenewInstanceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudRenewInstanceBeanMapper {
    int countByExample(CloudRenewInstanceBeanExample example);

    int deleteByExample(CloudRenewInstanceBeanExample example);

    int deleteByPrimaryKey(Integer ecrId);

    int insert(CloudRenewInstanceBean record);

    int insertSelective(CloudRenewInstanceBean record);

    List<CloudRenewInstanceBean> selectByExample(CloudRenewInstanceBeanExample example);

    CloudRenewInstanceBean selectByPrimaryKey(Integer ecrId);

    int updateByExampleSelective(@Param("record") CloudRenewInstanceBean record, @Param("example") CloudRenewInstanceBeanExample example);

    int updateByExample(@Param("record") CloudRenewInstanceBean record, @Param("example") CloudRenewInstanceBeanExample example);

    int updateByPrimaryKeySelective(CloudRenewInstanceBean record);

    int updateByPrimaryKey(CloudRenewInstanceBean record);
}