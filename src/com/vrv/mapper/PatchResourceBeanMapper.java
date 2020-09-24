package com.vrv.mapper;

import com.vrv.bean.PatchResourceBean;
import com.vrv.bean.PatchResourceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatchResourceBeanMapper {
    int countByExample(PatchResourceBeanExample example);

    int deleteByExample(PatchResourceBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatchResourceBean record);

    int insertSelective(PatchResourceBean record);

    List<PatchResourceBean> selectByExample(PatchResourceBeanExample example);

    PatchResourceBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatchResourceBean record, @Param("example") PatchResourceBeanExample example);

    int updateByExample(@Param("record") PatchResourceBean record, @Param("example") PatchResourceBeanExample example);

    int updateByPrimaryKeySelective(PatchResourceBean record);

    int updateByPrimaryKey(PatchResourceBean record);
}