package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.mapper;

import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionBean;
import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionBeanMapper {
    int countByExample(PromotionBeanExample example);

    int deleteByExample(PromotionBeanExample example);

    int deleteByPrimaryKey(Integer prtId);

    int insert(PromotionBean record);

    int insertSelective(PromotionBean record);

    List<PromotionBean> selectByExample(PromotionBeanExample example);

    PromotionBean selectByPrimaryKey(Integer prtId);

    int updateByExampleSelective(@Param("record") PromotionBean record, @Param("example") PromotionBeanExample example);

    int updateByExample(@Param("record") PromotionBean record, @Param("example") PromotionBeanExample example);

    int updateByPrimaryKeySelective(PromotionBean record);

    int updateByPrimaryKey(PromotionBean record);
}