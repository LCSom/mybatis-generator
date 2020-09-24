package com.vrv.mapper;

import com.vrv.bean.PatchBean;
import com.vrv.bean.PatchBeanExample;
import com.vrv.bean.PatchBeanWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatchBeanMapper {
    int countByExample(PatchBeanExample example);

    int deleteByExample(PatchBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatchBeanWithBLOBs record);

    int insertSelective(PatchBeanWithBLOBs record);

    List<PatchBeanWithBLOBs> selectByExampleWithBLOBs(PatchBeanExample example);

    List<PatchBean> selectByExample(PatchBeanExample example);

    PatchBeanWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatchBeanWithBLOBs record, @Param("example") PatchBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") PatchBeanWithBLOBs record, @Param("example") PatchBeanExample example);

    int updateByExample(@Param("record") PatchBean record, @Param("example") PatchBeanExample example);

    int updateByPrimaryKeySelective(PatchBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatchBeanWithBLOBs record);

    int updateByPrimaryKey(PatchBean record);
}