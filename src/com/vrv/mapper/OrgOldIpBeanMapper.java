package com.vrv.mapper;

import com.vrv.bean.OrgOldIpBeanExample;
import com.vrv.bean.OrgOldIpBeanKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgOldIpBeanMapper {
    int countByExample(OrgOldIpBeanExample example);

    int deleteByExample(OrgOldIpBeanExample example);

    int deleteByPrimaryKey(OrgOldIpBeanKey key);

    int insert(OrgOldIpBeanKey record);

    int insertSelective(OrgOldIpBeanKey record);

    List<OrgOldIpBeanKey> selectByExample(OrgOldIpBeanExample example);

    int updateByExampleSelective(@Param("record") OrgOldIpBeanKey record, @Param("example") OrgOldIpBeanExample example);

    int updateByExample(@Param("record") OrgOldIpBeanKey record, @Param("example") OrgOldIpBeanExample example);
}