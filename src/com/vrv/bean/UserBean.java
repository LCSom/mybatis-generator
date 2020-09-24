package com.vrv.bean;

import java.util.Date;

public class UserBean {
    private Integer utId;

    private String utUsername;

    private String utPassword;

    private String utParam1;

    private String utParam2;

    private String utParam3;

    private String utParam4;

    private String utParam5;

    private Integer utIspwdinvalid;

    private Integer utStatus;

    private Date utCreatedDatetime;

    private Date utUpdatedDatetime;

    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    public String getUtUsername() {
        return utUsername;
    }

    public void setUtUsername(String utUsername) {
        this.utUsername = utUsername == null ? null : utUsername.trim();
    }

    public String getUtPassword() {
        return utPassword;
    }

    public void setUtPassword(String utPassword) {
        this.utPassword = utPassword == null ? null : utPassword.trim();
    }

    public String getUtParam1() {
        return utParam1;
    }

    public void setUtParam1(String utParam1) {
        this.utParam1 = utParam1 == null ? null : utParam1.trim();
    }

    public String getUtParam2() {
        return utParam2;
    }

    public void setUtParam2(String utParam2) {
        this.utParam2 = utParam2 == null ? null : utParam2.trim();
    }

    public String getUtParam3() {
        return utParam3;
    }

    public void setUtParam3(String utParam3) {
        this.utParam3 = utParam3 == null ? null : utParam3.trim();
    }

    public String getUtParam4() {
        return utParam4;
    }

    public void setUtParam4(String utParam4) {
        this.utParam4 = utParam4 == null ? null : utParam4.trim();
    }

    public String getUtParam5() {
        return utParam5;
    }

    public void setUtParam5(String utParam5) {
        this.utParam5 = utParam5 == null ? null : utParam5.trim();
    }

    public Integer getUtIspwdinvalid() {
        return utIspwdinvalid;
    }

    public void setUtIspwdinvalid(Integer utIspwdinvalid) {
        this.utIspwdinvalid = utIspwdinvalid;
    }

    public Integer getUtStatus() {
        return utStatus;
    }

    public void setUtStatus(Integer utStatus) {
        this.utStatus = utStatus;
    }

    public Date getUtCreatedDatetime() {
        return utCreatedDatetime;
    }

    public void setUtCreatedDatetime(Date utCreatedDatetime) {
        this.utCreatedDatetime = utCreatedDatetime;
    }

    public Date getUtUpdatedDatetime() {
        return utUpdatedDatetime;
    }

    public void setUtUpdatedDatetime(Date utUpdatedDatetime) {
        this.utUpdatedDatetime = utUpdatedDatetime;
    }
}