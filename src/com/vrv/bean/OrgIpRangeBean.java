package com.vrv.bean;

public class OrgIpRangeBean {
    private String id;

    private String organizationid;

    private String beginip;

    private String endip;

    private Integer tier;

    private String beginipnumber;

    private String endipnumber;

    private Integer status;

    private Integer deletestatus;

    private String ipremarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getBeginip() {
        return beginip;
    }

    public void setBeginip(String beginip) {
        this.beginip = beginip == null ? null : beginip.trim();
    }

    public String getEndip() {
        return endip;
    }

    public void setEndip(String endip) {
        this.endip = endip == null ? null : endip.trim();
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getBeginipnumber() {
        return beginipnumber;
    }

    public void setBeginipnumber(String beginipnumber) {
        this.beginipnumber = beginipnumber == null ? null : beginipnumber.trim();
    }

    public String getEndipnumber() {
        return endipnumber;
    }

    public void setEndipnumber(String endipnumber) {
        this.endipnumber = endipnumber == null ? null : endipnumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public String getIpremarks() {
        return ipremarks;
    }

    public void setIpremarks(String ipremarks) {
        this.ipremarks = ipremarks == null ? null : ipremarks.trim();
    }
}