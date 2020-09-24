package com.vrv.mapper;

import com.vrv.bean.RoleBean;
import com.vrv.bean.RoleBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleBeanMapper {
    int countByExample(RoleBeanExample example);

    int deleteByExample(RoleBeanExample example);

    int deleteByPrimaryKey(Integer rtId);

    int insert(RoleBean record);

    int insertSelective(RoleBean record);

    List<RoleBean> selectByExample(RoleBeanExample example);

    RoleBean selectByPrimaryKey(Integer rtId);

    int updateByExampleSelective(@Param("record") RoleBean record, @Param("example") RoleBeanExample example);

    int updateByExample(@Param("record") RoleBean record, @Param("example") RoleBeanExample example);

    int updateByPrimaryKeySelective(RoleBean record);

    int updateByPrimaryKey(RoleBean record);
}