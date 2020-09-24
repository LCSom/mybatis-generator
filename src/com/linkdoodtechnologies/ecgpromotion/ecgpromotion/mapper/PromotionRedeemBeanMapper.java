package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.mapper;

import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionRedeemBean;
import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionRedeemBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionRedeemBeanMapper {
    int countByExample(PromotionRedeemBeanExample example);

    int deleteByExample(PromotionRedeemBeanExample example);

    int deleteByPrimaryKey(Integer prrtId);

    int insert(PromotionRedeemBean record);

    int insertSelective(PromotionRedeemBean record);

    List<PromotionRedeemBean> selectByExample(PromotionRedeemBeanExample example);

    PromotionRedeemBean selectByPrimaryKey(Integer prrtId);

    int updateByExampleSelective(@Param("record") PromotionRedeemBean record, @Param("example") PromotionRedeemBeanExample example);

    int updateByExample(@Param("record") PromotionRedeemBean record, @Param("example") PromotionRedeemBeanExample example);

    int updateByPrimaryKeySelective(PromotionRedeemBean record);

    int updateByPrimaryKey(PromotionRedeemBean record);
}