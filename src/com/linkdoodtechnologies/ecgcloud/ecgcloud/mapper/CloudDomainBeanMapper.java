package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudDomainBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.CloudDomainBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudDomainBeanMapper {
    int countByExample(CloudDomainBeanExample example);

    int deleteByExample(CloudDomainBeanExample example);

    int deleteByPrimaryKey(Integer cdtId);

    int insert(CloudDomainBean record);

    int insertSelective(CloudDomainBean record);

    List<CloudDomainBean> selectByExample(CloudDomainBeanExample example);

    CloudDomainBean selectByPrimaryKey(Integer cdtId);

    int updateByExampleSelective(@Param("record") CloudDomainBean record, @Param("example") CloudDomainBeanExample example);

    int updateByExample(@Param("record") CloudDomainBean record, @Param("example") CloudDomainBeanExample example);

    int updateByPrimaryKeySelective(CloudDomainBean record);

    int updateByPrimaryKey(CloudDomainBean record);
}