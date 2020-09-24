package com.vrv.mapper;

import com.vrv.bean.HolidayUserBean;
import com.vrv.bean.HolidayUserBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolidayUserBeanMapper {
    int countByExample(HolidayUserBeanExample example);

    int deleteByExample(HolidayUserBeanExample example);

    int deleteByPrimaryKey(Integer hutId);

    int insert(HolidayUserBean record);

    int insertSelective(HolidayUserBean record);

    List<HolidayUserBean> selectByExample(HolidayUserBeanExample example);

    HolidayUserBean selectByPrimaryKey(Integer hutId);

    int updateByExampleSelective(@Param("record") HolidayUserBean record, @Param("example") HolidayUserBeanExample example);

    int updateByExample(@Param("record") HolidayUserBean record, @Param("example") HolidayUserBeanExample example);

    int updateByPrimaryKeySelective(HolidayUserBean record);

    int updateByPrimaryKey(HolidayUserBean record);
}