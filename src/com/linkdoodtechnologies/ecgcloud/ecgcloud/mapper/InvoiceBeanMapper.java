package com.linkdoodtechnologies.ecgcloud.ecgcloud.mapper;

import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.InvoiceBean;
import com.linkdoodtechnologies.ecgcloud.ecgcloud.bean.InvoiceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceBeanMapper {
    int countByExample(InvoiceBeanExample example);

    int deleteByExample(InvoiceBeanExample example);

    int deleteByPrimaryKey(Integer itId);

    int insert(InvoiceBean record);

    int insertSelective(InvoiceBean record);

    List<InvoiceBean> selectByExample(InvoiceBeanExample example);

    InvoiceBean selectByPrimaryKey(Integer itId);

    int updateByExampleSelective(@Param("record") InvoiceBean record, @Param("example") InvoiceBeanExample example);

    int updateByExample(@Param("record") InvoiceBean record, @Param("example") InvoiceBeanExample example);

    int updateByPrimaryKeySelective(InvoiceBean record);

    int updateByPrimaryKey(InvoiceBean record);
}