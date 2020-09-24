package com.vrv.mapper;

import com.vrv.bean.MergeSoftBean;
import com.vrv.bean.MergeSoftBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MergeSoftBeanMapper {
    int countByExample(MergeSoftBeanExample example);

    int deleteByExample(MergeSoftBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(MergeSoftBean record);

    int insertSelective(MergeSoftBean record);

    List<MergeSoftBean> selectByExample(MergeSoftBeanExample example);

    MergeSoftBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MergeSoftBean record, @Param("example") MergeSoftBeanExample example);

    int updateByExample(@Param("record") MergeSoftBean record, @Param("example") MergeSoftBeanExample example);

    int updateByPrimaryKeySelective(MergeSoftBean record);

    int updateByPrimaryKey(MergeSoftBean record);
}