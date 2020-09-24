package com.vrv.mapper;

import com.vrv.bean.ChartBean;
import com.vrv.bean.ChartBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartBeanMapper {
    int countByExample(ChartBeanExample example);

    int deleteByExample(ChartBeanExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(ChartBean record);

    int insertSelective(ChartBean record);

    List<ChartBean> selectByExample(ChartBeanExample example);

    ChartBean selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") ChartBean record, @Param("example") ChartBeanExample example);

    int updateByExample(@Param("record") ChartBean record, @Param("example") ChartBeanExample example);

    int updateByPrimaryKeySelective(ChartBean record);

    int updateByPrimaryKey(ChartBean record);
}