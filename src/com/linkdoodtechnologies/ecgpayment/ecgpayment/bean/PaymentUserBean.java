package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

public class PaymentUserBean {
    private Integer autId;

    private String autAppId;

    private String autAppSecret;

    private String autRemark;

    private String autDomain;

    private String autFrontendUrl;

    private String autBackendUrl;

    private String autIdentifier;

    private String autStatus;

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

    public String getAutFrontendUrl() {
        return autFrontendUrl;
    }

    public void setAutFrontendUrl(String autFrontendUrl) {
        this.autFrontendUrl = autFrontendUrl == null ? null : autFrontendUrl.trim();
    }

    public String getAutBackendUrl() {
        return autBackendUrl;
    }

    public void setAutBackendUrl(String autBackendUrl) {
        this.autBackendUrl = autBackendUrl == null ? null : autBackendUrl.trim();
    }

    public String getAutIdentifier() {
        return autIdentifier;
    }

    public void setAutIdentifier(String autIdentifier) {
        this.autIdentifier = autIdentifier == null ? null : autIdentifier.trim();
    }

    public String getAutStatus() {
        return autStatus;
    }

    public void setAutStatus(String autStatus) {
        this.autStatus = autStatus == null ? null : autStatus.trim();
    }
}