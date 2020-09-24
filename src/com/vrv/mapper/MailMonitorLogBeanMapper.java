package com.vrv.mapper;

import com.vrv.bean.MailMonitorLogBean;
import com.vrv.bean.MailMonitorLogBeanExample;
import com.vrv.bean.MailMonitorLogBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailMonitorLogBeanMapper {
    int countByExample(MailMonitorLogBeanExample example);

    int deleteByExample(MailMonitorLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(MailMonitorLogBeanWithBLOBs record);

    int insertSelective(MailMonitorLogBeanWithBLOBs record);

    List<MailMonitorLogBeanWithBLOBs> selectByExampleWithBLOBs(MailMonitorLogBeanExample example);

    List<MailMonitorLogBean> selectByExample(MailMonitorLogBeanExample example);

    MailMonitorLogBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MailMonitorLogBeanWithBLOBs record, @Param("example") MailMonitorLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") MailMonitorLogBeanWithBLOBs record, @Param("example") MailMonitorLogBeanExample example);

    int updateByExample(@Param("record") MailMonitorLogBean record, @Param("example") MailMonitorLogBeanExample example);

    int updateByPrimaryKeySelective(MailMonitorLogBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MailMonitorLogBeanWithBLOBs record);

    int updateByPrimaryKey(MailMonitorLogBean record);
}