package com.vrv.bean;

public class ServerAreaOrgBeanKey {
    private String orgid;

    private String serverareaid;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getServerareaid() {
        return serverareaid;
    }

    public void setServerareaid(String serverareaid) {
        this.serverareaid = serverareaid == null ? null : serverareaid.trim();
    }
}