package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

public class ApiUserBean {
    private Integer autId;

    private String autAppId;

    private String autAppSecret;

    private String autRemark;

    private String autDomain;

    private String autNotifyUrl;

    private String autStatus;

    private String autUniqueId;

    public Integer getAutId() {
        return autId;
    }

    public void setAutId(Integer autId) {
        this.autId = autId;
    }

    public String getAutAppId() {
        return autAppId;
    }

    public void setAutAppId(String autAppId) {
        this.autAppId = autAppId == null ? null : autAppId.trim();
    }

    public String getAutAppSecret() {
        return autAppSecret;
    }

    public void setAutAppSecret(String autAppSecret) {
        this.autAppSecret = autAppSecret == null ? null : autAppSecret.trim();
    }

    public String getAutRemark() {
        return autRemark;
    }

    public void setAutRemark(String autRemark) {
        this.autRemark = autRemark == null ? null : autRemark.trim();
    }

    public String getAutDomain() {
        return autDomain;
    }

    public void setAutDomain(String autDomain) {
        this.autDomain = autDomain == null ? null : autDomain.trim();
    }

    public String getAutNotifyUrl() {
        return autNotifyUrl;
    }

    public void setAutNotifyUrl(String autNotifyUrl) {
        this.autNotifyUrl = autNotifyUrl == null ? null : autNotifyUrl.trim();
    }

    public String getAutStatus() {
        return autStatus;
    }

    public void setAutStatus(String autStatus) {
        this.autStatus = autStatus == null ? null : autStatus.trim();
    }

    public String getAutUniqueId() {
        return autUniqueId;
    }

    public void setAutUniqueId(String autUniqueId) {
        this.autUniqueId = autUniqueId == null ? null : autUniqueId.trim();
    }
}