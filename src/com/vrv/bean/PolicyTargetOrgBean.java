package com.vrv.bean;

public class PolicyTargetOrgBean {
    private String id;

    private String policytargetid;

    private String organizationid;

    private Integer flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPolicytargetid() {
        return policytargetid;
    }

    public void setPolicytargetid(String policytargetid) {
        this.policytargetid = policytargetid == null ? null : policytargetid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}