package com.vrv.mapper;

import com.vrv.bean.PrintProtectedLogBean;
import com.vrv.bean.PrintProtectedLogBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrintProtectedLogBeanMapper {
    int countByExample(PrintProtectedLogBeanExample example);

    int deleteByExample(PrintProtectedLogBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PrintProtectedLogBean record);

    int insertSelective(PrintProtectedLogBean record);

    List<PrintProtectedLogBean> selectByExampleWithBLOBs(PrintProtectedLogBeanExample example);

    List<PrintProtectedLogBean> selectByExample(PrintProtectedLogBeanExample example);

    PrintProtectedLogBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PrintProtectedLogBean record, @Param("example") PrintProtectedLogBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") PrintProtectedLogBean record, @Param("example") PrintProtectedLogBeanExample example);

    int updateByExample(@Param("record") PrintProtectedLogBean record, @Param("example") PrintProtectedLogBeanExample example);

    int updateByPrimaryKeySelective(PrintProtectedLogBean record);

    int updateByPrimaryKeyWithBLOBs(PrintProtectedLogBean record);

    int updateByPrimaryKey(PrintProtectedLogBean record);
}