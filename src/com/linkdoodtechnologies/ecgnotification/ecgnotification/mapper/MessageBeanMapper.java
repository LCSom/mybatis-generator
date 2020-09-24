package com.linkdoodtechnologies.ecgnotification.ecgnotification.mapper;

import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.MessageBean;
import com.linkdoodtechnologies.ecgnotification.ecgnotification.bean.MessageBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBeanMapper {
    int countByExample(MessageBeanExample example);

    int deleteByExample(MessageBeanExample example);

    int deleteByPrimaryKey(Integer mtId);

    int insert(MessageBean record);

    int insertSelective(MessageBean record);

    List<MessageBean> selectByExample(MessageBeanExample example);

    MessageBean selectByPrimaryKey(Integer mtId);

    int updateByExampleSelective(@Param("record") MessageBean record, @Param("example") MessageBeanExample example);

    int updateByExample(@Param("record") MessageBean record, @Param("example") MessageBeanExample example);

    int updateByPrimaryKeySelective(MessageBean record);

    int updateByPrimaryKey(MessageBean record);
}