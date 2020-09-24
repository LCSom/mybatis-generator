package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.mapper;

import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionUsageBean;
import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.PromotionUsageBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionUsageBeanMapper {
    int countByExample(PromotionUsageBeanExample example);

    int deleteByExample(PromotionUsageBeanExample example);

    int deleteByPrimaryKey(Integer putId);

    int insert(PromotionUsageBean record);

    int insertSelective(PromotionUsageBean record);

    List<PromotionUsageBean> selectByExample(PromotionUsageBeanExample example);

    PromotionUsageBean selectByPrimaryKey(Integer putId);

    int updateByExampleSelective(@Param("record") PromotionUsageBean record, @Param("example") PromotionUsageBeanExample example);

    int updateByExample(@Param("record") PromotionUsageBean record, @Param("example") PromotionUsageBeanExample example);

    int updateByPrimaryKeySelective(PromotionUsageBean record);

    int updateByPrimaryKey(PromotionUsageBean record);
}