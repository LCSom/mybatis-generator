package com.vrv.mapper;

import com.vrv.bean.ManagerOrgBean;
import com.vrv.bean.ManagerOrgBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerOrgBeanMapper {
    int countByExample(ManagerOrgBeanExample example);

    int deleteByExample(ManagerOrgBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(ManagerOrgBean record);

    int insertSelective(ManagerOrgBean record);

    List<ManagerOrgBean> selectByExample(ManagerOrgBeanExample example);

    ManagerOrgBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ManagerOrgBean record, @Param("example") ManagerOrgBeanExample example);

    int updateByExample(@Param("record") ManagerOrgBean record, @Param("example") ManagerOrgBeanExample example);

    int updateByPrimaryKeySelective(ManagerOrgBean record);

    int updateByPrimaryKey(ManagerOrgBean record);
}