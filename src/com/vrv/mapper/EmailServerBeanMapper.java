package com.vrv.mapper;

import com.vrv.bean.EmailServerBean;
import com.vrv.bean.EmailServerBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailServerBeanMapper {
    int countByExample(EmailServerBeanExample example);

    int deleteByExample(EmailServerBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(EmailServerBean record);

    int insertSelective(EmailServerBean record);

    List<EmailServerBean> selectByExample(EmailServerBeanExample example);

    EmailServerBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EmailServerBean record, @Param("example") EmailServerBeanExample example);

    int updateByExample(@Param("record") EmailServerBean record, @Param("example") EmailServerBeanExample example);

    int updateByPrimaryKeySelective(EmailServerBean record);

    int updateByPrimaryKey(EmailServerBean record);
}