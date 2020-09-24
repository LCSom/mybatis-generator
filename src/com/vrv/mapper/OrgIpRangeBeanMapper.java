package com.vrv.mapper;

import com.vrv.bean.OrgIpRangeBean;
import com.vrv.bean.OrgIpRangeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgIpRangeBeanMapper {
    int countByExample(OrgIpRangeBeanExample example);

    int deleteByExample(OrgIpRangeBeanExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgIpRangeBean record);

    int insertSelective(OrgIpRangeBean record);

    List<OrgIpRangeBean> selectByExample(OrgIpRangeBeanExample example);

    OrgIpRangeBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgIpRangeBean record, @Param("example") OrgIpRangeBeanExample example);

    int updateByExample(@Param("record") OrgIpRangeBean record, @Param("example") OrgIpRangeBeanExample example);

    int updateByPrimaryKeySelective(OrgIpRangeBean record);

    int updateByPrimaryKey(OrgIpRangeBean record);
}