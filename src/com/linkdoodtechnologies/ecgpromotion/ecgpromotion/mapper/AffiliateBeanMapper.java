package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.mapper;

import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.AffiliateBean;
import com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean.AffiliateBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AffiliateBeanMapper {
    int countByExample(AffiliateBeanExample example);

    int deleteByExample(AffiliateBeanExample example);

    int deleteByPrimaryKey(Integer aftId);

    int insert(AffiliateBean record);

    int insertSelective(AffiliateBean record);

    List<AffiliateBean> selectByExample(AffiliateBeanExample example);

    AffiliateBean selectByPrimaryKey(Integer aftId);

    int updateByExampleSelective(@Param("record") AffiliateBean record, @Param("example") AffiliateBeanExample example);

    int updateByExample(@Param("record") AffiliateBean record, @Param("example") AffiliateBeanExample example);

    int updateByPrimaryKeySelective(AffiliateBean record);

    int updateByPrimaryKey(AffiliateBean record);
}