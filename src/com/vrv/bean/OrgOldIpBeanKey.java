package com.vrv.bean;

public class OrgOldIpBeanKey {
    private String oldserverip;

    private String organizationid;

    public String getOldserverip() {
        return oldserverip;
    }

    public void setOldserverip(String oldserverip) {
        this.oldserverip = oldserverip == null ? null : oldserverip.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }
}