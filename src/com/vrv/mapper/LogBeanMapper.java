package com.vrv.mapper;

import com.vrv.bean.LogBean;
import com.vrv.bean.LogBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogBeanMapper {
    int countByExample(LogBeanExample example);

    int deleteByExample(LogBeanExample example);

    int deleteByPrimaryKey(Integer ltId);

    int insert(LogBean record);

    int insertSelective(LogBean record);

    List<LogBean> selectByExample(LogBeanExample example);

    LogBean selectByPrimaryKey(Integer ltId);

    int updateByExampleSelective(@Param("record") LogBean record, @Param("example") LogBeanExample example);

    int updateByExample(@Param("record") LogBean record, @Param("example") LogBeanExample example);

    int updateByPrimaryKeySelective(LogBean record);

    int updateByPrimaryKey(LogBean record);
}