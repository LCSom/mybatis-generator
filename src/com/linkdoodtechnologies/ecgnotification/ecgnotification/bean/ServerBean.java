package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

public class ServerBean {
    private Integer stId;

    private String stDomain;

    private String stDdio1AppId;

    private String stDdio1AppSecret;

    private String stDdio2AppId;

    private String stDdio2AppSecret;

    private String stParam1;

    private String stParam2;

    private String stParam3;

    private String stParam4;

    private String stParam5;

    private Integer stStatus;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStDomain() {
        return stDomain;
    }

    public void setStDomain(String stDomain) {
        this.stDomain = stDomain == null ? null : stDomain.trim();
    }

    public String getStDdio1AppId() {
        return stDdio1AppId;
    }

    public void setStDdio1AppId(String stDdio1AppId) {
        this.stDdio1AppId = stDdio1AppId == null ? null : stDdio1AppId.trim();
    }

    public String getStDdio1AppSecret() {
        return stDdio1AppSecret;
    }

    public void setStDdio1AppSecret(String stDdio1AppSecret) {
        this.stDdio1AppSecret = stDdio1AppSecret == null ? null : stDdio1AppSecret.trim();
    }

    public String getStDdio2AppId() {
        return stDdio2AppId;
    }

    public void setStDdio2AppId(String stDdio2AppId) {
        this.stDdio2AppId = stDdio2AppId == null ? null : stDdio2AppId.trim();
    }

    public String getStDdio2AppSecret() {
        return stDdio2AppSecret;
    }

    public void setStDdio2AppSecret(String stDdio2AppSecret) {
        this.stDdio2AppSecret = stDdio2AppSecret == null ? null : stDdio2AppSecret.trim();
    }

    public String getStParam1() {
        return stParam1;
    }

    public void setStParam1(String stParam1) {
        this.stParam1 = stParam1 == null ? null : stParam1.trim();
    }

    public String getStParam2() {
        return stParam2;
    }

    public void setStParam2(String stParam2) {
        this.stParam2 = stParam2 == null ? null : stParam2.trim();
    }

    public String getStParam3() {
        return stParam3;
    }

    public void setStParam3(String stParam3) {
        this.stParam3 = stParam3 == null ? null : stParam3.trim();
    }

    public String getStParam4() {
        return stParam4;
    }

    public void setStParam4(String stParam4) {
        this.stParam4 = stParam4 == null ? null : stParam4.trim();
    }

    public String getStParam5() {
        return stParam5;
    }

    public void setStParam5(String stParam5) {
        this.stParam5 = stParam5 == null ? null : stParam5.trim();
    }

    public Integer getStStatus() {
        return stStatus;
    }

    public void setStStatus(Integer stStatus) {
        this.stStatus = stStatus;
    }
}