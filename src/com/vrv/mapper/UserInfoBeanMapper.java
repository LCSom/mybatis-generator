package com.vrv.mapper;

import com.vrv.bean.UserInfoBean;
import com.vrv.bean.UserInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoBeanMapper {
    int countByExample(UserInfoBeanExample example);

    int deleteByExample(UserInfoBeanExample example);

    int deleteByPrimaryKey(Integer uitId);

    int insert(UserInfoBean record);

    int insertSelective(UserInfoBean record);

    List<UserInfoBean> selectByExample(UserInfoBeanExample example);

    UserInfoBean selectByPrimaryKey(Integer uitId);

    int updateByExampleSelective(@Param("record") UserInfoBean record, @Param("example") UserInfoBeanExample example);

    int updateByExample(@Param("record") UserInfoBean record, @Param("example") UserInfoBeanExample example);

    int updateByPrimaryKeySelective(UserInfoBean record);

    int updateByPrimaryKey(UserInfoBean record);
}