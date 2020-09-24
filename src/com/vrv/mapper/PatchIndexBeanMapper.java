package com.vrv.mapper;

import com.vrv.bean.PatchIndexBean;
import com.vrv.bean.PatchIndexBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatchIndexBeanMapper {
    int countByExample(PatchIndexBeanExample example);

    int deleteByExample(PatchIndexBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatchIndexBean record);

    int insertSelective(PatchIndexBean record);

    List<PatchIndexBean> selectByExample(PatchIndexBeanExample example);

    PatchIndexBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatchIndexBean record, @Param("example") PatchIndexBeanExample example);

    int updateByExample(@Param("record") PatchIndexBean record, @Param("example") PatchIndexBeanExample example);

    int updateByPrimaryKeySelective(PatchIndexBean record);

    int updateByPrimaryKey(PatchIndexBean record);
}