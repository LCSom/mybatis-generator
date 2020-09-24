package com.vrv.mapper;

import com.vrv.bean.FileProtectedLogBean;
import com.vrv.bean.FileProtectedLogBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileProtectedLogBeanMapper {
    int countByExample(FileProtectedLogBeanExample example);

    int deleteByExample(FileProtectedLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(FileProtectedLogBean record);

    int insertSelective(FileProtectedLogBean record);

    List<FileProtectedLogBean> selectByExampleWithBLOBs(FileProtectedLogBeanExample example);

    List<FileProtectedLogBean> selectByExample(FileProtectedLogBeanExample example);

    FileProtectedLogBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FileProtectedLogBean record, @Param("example") FileProtectedLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") FileProtectedLogBean record, @Param("example") FileProtectedLogBeanExample example);

    int updateByExample(@Param("record") FileProtectedLogBean record, @Param("example") FileProtectedLogBeanExample example);

    int updateByPrimaryKeySelective(FileProtectedLogBean record);

    int updateByPrimaryKeyWithBLOBs(FileProtectedLogBean record);

    int updateByPrimaryKey(FileProtectedLogBean record);
}