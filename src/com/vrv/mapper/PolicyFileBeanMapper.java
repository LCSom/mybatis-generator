package com.vrv.mapper;

import com.vrv.bean.PolicyFileBean;
import com.vrv.bean.PolicyFileBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolicyFileBeanMapper {
    int countByExample(PolicyFileBeanExample example);

    int deleteByExample(PolicyFileBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PolicyFileBean record);

    int insertSelective(PolicyFileBean record);

    List<PolicyFileBean> selectByExampleWithBLOBs(PolicyFileBeanExample example);

    List<PolicyFileBean> selectByExample(PolicyFileBeanExample example);

    PolicyFileBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PolicyFileBean record, @Param("example") PolicyFileBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") PolicyFileBean record, @Param("example") PolicyFileBeanExample example);

    int updateByExample(@Param("record") PolicyFileBean record, @Param("example") PolicyFileBeanExample example);

    int updateByPrimaryKeySelective(PolicyFileBean record);

    int updateByPrimaryKeyWithBLOBs(PolicyFileBean record);

    int updateByPrimaryKey(PolicyFileBean record);
}