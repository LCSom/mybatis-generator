package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.ApiUserBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.ApiUserBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiUserBeanMapper {
    int countByExample(ApiUserBeanExample example);

    int deleteByExample(ApiUserBeanExample example);

    int deleteByPrimaryKey(Integer autId);

    int insert(ApiUserBean record);

    int insertSelective(ApiUserBean record);

    List<ApiUserBean> selectByExample(ApiUserBeanExample example);

    ApiUserBean selectByPrimaryKey(Integer autId);

    int updateByExampleSelective(@Param("record") ApiUserBean record, @Param("example") ApiUserBeanExample example);

    int updateByExample(@Param("record") ApiUserBean record, @Param("example") ApiUserBeanExample example);

    int updateByPrimaryKeySelective(ApiUserBean record);

    int updateByPrimaryKey(ApiUserBean record);
}