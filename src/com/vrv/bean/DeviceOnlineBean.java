package com.vrv.bean;

import java.util.Date;

public class DeviceOnlineBean {
    private String id;

    private String devonlyid;

    private Date logintime;

    private String sessionid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevonlyid() {
        return devonlyid;
    }

    public void setDevonlyid(String devonlyid) {
        this.devonlyid = devonlyid == null ? null : devonlyid.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }
}