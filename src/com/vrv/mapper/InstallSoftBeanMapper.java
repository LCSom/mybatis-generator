package com.vrv.mapper;

import com.vrv.bean.InstallSoftBean;
import com.vrv.bean.InstallSoftBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstallSoftBeanMapper {
    int countByExample(InstallSoftBeanExample example);

    int deleteByExample(InstallSoftBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(InstallSoftBean record);

    int insertSelective(InstallSoftBean record);

    List<InstallSoftBean> selectByExample(InstallSoftBeanExample example);

    InstallSoftBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InstallSoftBean record, @Param("example") InstallSoftBeanExample example);

    int updateByExample(@Param("record") InstallSoftBean record, @Param("example") InstallSoftBeanExample example);

    int updateByPrimaryKeySelective(InstallSoftBean record);

    int updateByPrimaryKey(InstallSoftBean record);
}