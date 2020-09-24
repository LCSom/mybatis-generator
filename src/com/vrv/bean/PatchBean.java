package com.vrv.bean;

import java.util.Date;

public class PatchBean {
    private String id;

    private String updateid;

    private String bulletinid;

    private Date publishtime;

    private Date distributetime;

    private String patchcode;

    private String patchname;

    private String patchpath;

    private Integer patchlevel;

    private String patchtype;

    private Integer isdistribute;

    private String ostype;

    private String company;

    private String productfamily;

    private String product;

    private String updatetype;

    private String crc;

    private String cpuarch;

    private Date createtime;

    private Date updatetime;

    private String patchclass;

    private String fromindex;

    private Integer isblacklist;

    private Boolean issync;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUpdateid() {
        return updateid;
    }

    public void setUpdateid(String updateid) {
        this.updateid = updateid == null ? null : updateid.trim();
    }

    public String getBulletinid() {
        return bulletinid;
    }

    public void setBulletinid(String bulletinid) {
        this.bulletinid = bulletinid == null ? null : bulletinid.trim();
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Date getDistributetime() {
        return distributetime;
    }

    public void setDistributetime(Date distributetime) {
        this.distributetime = distributetime;
    }

    public String getPatchcode() {
        return patchcode;
    }

    public void setPatchcode(String patchcode) {
        this.patchcode = patchcode == null ? null : patchcode.trim();
    }

    public String getPatchname() {
        return patchname;
    }

    public void setPatchname(String patchname) {
        this.patchname = patchname == null ? null : patchname.trim();
    }

    public String getPatchpath() {
        return patchpath;
    }

    public void setPatchpath(String patchpath) {
        this.patchpath = patchpath == null ? null : patchpath.trim();
    }

    public Integer getPatchlevel() {
        return patchlevel;
    }

    public void setPatchlevel(Integer patchlevel) {
        this.patchlevel = patchlevel;
    }

    public String getPatchtype() {
        return patchtype;
    }

    public void setPatchtype(String patchtype) {
        this.patchtype = patchtype == null ? null : patchtype.trim();
    }

    public Integer getIsdistribute() {
        return isdistribute;
    }

    public void setIsdistribute(Integer isdistribute) {
        this.isdistribute = isdistribute;
    }

    public String getOstype() {
        return ostype;
    }

    public void setOstype(String ostype) {
        this.ostype = ostype == null ? null : ostype.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getProductfamily() {
        return productfamily;
    }

    public void setProductfamily(String productfamily) {
        this.productfamily = productfamily == null ? null : productfamily.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getUpdatetype() {
        return updatetype;
    }

    public void setUpdatetype(String updatetype) {
        this.updatetype = updatetype == null ? null : updatetype.trim();
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc == null ? null : crc.trim();
    }

    public String getCpuarch() {
        return cpuarch;
    }

    public void setCpuarch(String cpuarch) {
        this.cpuarch = cpuarch == null ? null : cpuarch.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPatchclass() {
        return patchclass;
    }

    public void setPatchclass(String patchclass) {
        this.patchclass = patchclass == null ? null : patchclass.trim();
    }

    public String getFromindex() {
        return fromindex;
    }

    public void setFromindex(String fromindex) {
        this.fromindex = fromindex == null ? null : fromindex.trim();
    }

    public Integer getIsblacklist() {
        return isblacklist;
    }

    public void setIsblacklist(Integer isblacklist) {
        this.isblacklist = isblacklist;
    }

    public Boolean getIssync() {
        return issync;
    }

    public void setIssync(Boolean issync) {
        this.issync = issync;
    }
}