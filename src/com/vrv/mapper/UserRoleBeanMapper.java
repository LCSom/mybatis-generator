package com.vrv.mapper;

import com.vrv.bean.UserRoleBean;
import com.vrv.bean.UserRoleBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleBeanMapper {
    int countByExample(UserRoleBeanExample example);

    int deleteByExample(UserRoleBeanExample example);

    int deleteByPrimaryKey(Integer urtId);

    int insert(UserRoleBean record);

    int insertSelective(UserRoleBean record);

    List<UserRoleBean> selectByExample(UserRoleBeanExample example);

    UserRoleBean selectByPrimaryKey(Integer urtId);

    int updateByExampleSelective(@Param("record") UserRoleBean record, @Param("example") UserRoleBeanExample example);

    int updateByExample(@Param("record") UserRoleBean record, @Param("example") UserRoleBeanExample example);

    int updateByPrimaryKeySelective(UserRoleBean record);

    int updateByPrimaryKey(UserRoleBean record);
}