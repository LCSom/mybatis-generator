package com.linkdoodtechnologies.ecgnotification.ecgnotification.mapper;

import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.NotificationBean;
import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.NotificationBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationBeanMapper {
    int countByExample(NotificationBeanExample example);

    int deleteByExample(NotificationBeanExample example);

    int deleteByPrimaryKey(Integer ntId);

    int insert(NotificationBean record);

    int insertSelective(NotificationBean record);

    List<NotificationBean> selectByExample(NotificationBeanExample example);

    NotificationBean selectByPrimaryKey(Integer ntId);

    int updateByExampleSelective(@Param("record") NotificationBean record, @Param("example") NotificationBeanExample example);

    int updateByExample(@Param("record") NotificationBean record, @Param("example") NotificationBeanExample example);

    int updateByPrimaryKeySelective(NotificationBean record);

    int updateByPrimaryKey(NotificationBean record);
}