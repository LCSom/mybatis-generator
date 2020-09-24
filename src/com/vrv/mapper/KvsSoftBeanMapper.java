package com.vrv.mapper;

import com.vrv.bean.KvsSoftBean;
import com.vrv.bean.KvsSoftBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KvsSoftBeanMapper {
    int countByExample(KvsSoftBeanExample example);

    int deleteByExample(KvsSoftBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(KvsSoftBean record);

    int insertSelective(KvsSoftBean record);

    List<KvsSoftBean> selectByExample(KvsSoftBeanExample example);

    KvsSoftBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") KvsSoftBean record, @Param("example") KvsSoftBeanExample example);

    int updateByExample(@Param("record") KvsSoftBean record, @Param("example") KvsSoftBeanExample example);

    int updateByPrimaryKeySelective(KvsSoftBean record);

    int updateByPrimaryKey(KvsSoftBean record);
}