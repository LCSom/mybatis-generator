package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

public class PaymentMethodBean {
    private Integer pmtId;

    private String pmtAttId;

    private String pmtUniqueId;

    private String pmtType;

    private String pmtName;

    private String pmtAppId;

    private String pmtAppSecret;

    private String pmtUrl;

    private String pmtRemark;

    private String pmtParam1;

    private String pmtParam2;

    private String pmtParam3;

    private String pmtParam4;

    private String pmtParam5;

    private String pmtStatus;

    public Integer getPmtId() {
        return pmtId;
    }

    public void setPmtId(Integer pmtId) {
        this.pmtId = pmtId;
    }

    public String getPmtAttId() {
        return pmtAttId;
    }

    public void setPmtAttId(String pmtAttId) {
        this.pmtAttId = pmtAttId == null ? null : pmtAttId.trim();
    }

    public String getPmtUniqueId() {
        return pmtUniqueId;
    }

    public void setPmtUniqueId(String pmtUniqueId) {
        this.pmtUniqueId = pmtUniqueId == null ? null : pmtUniqueId.trim();
    }

    public String getPmtType() {
        return pmtType;
    }

    public void setPmtType(String pmtType) {
        this.pmtType = pmtType == null ? null : pmtType.trim();
    }

    public String getPmtName() {
        return pmtName;
    }

    public void setPmtName(String pmtName) {
        this.pmtName = pmtName == null ? null : pmtName.trim();
    }

    public String getPmtAppId() {
        return pmtAppId;
    }

    public void setPmtAppId(String pmtAppId) {
        this.pmtAppId = pmtAppId == null ? null : pmtAppId.trim();
    }

    public String getPmtAppSecret() {
        return pmtAppSecret;
    }

    public void setPmtAppSecret(String pmtAppSecret) {
        this.pmtAppSecret = pmtAppSecret == null ? null : pmtAppSecret.trim();
    }

    public String getPmtUrl() {
        return pmtUrl;
    }

    public void setPmtUrl(String pmtUrl) {
        this.pmtUrl = pmtUrl == null ? null : pmtUrl.trim();
    }

    public String getPmtRemark() {
        return pmtRemark;
    }

    public void setPmtRemark(String pmtRemark) {
        this.pmtRemark = pmtRemark == null ? null : pmtRemark.trim();
    }

    public String getPmtParam1() {
        return pmtParam1;
    }

    public void setPmtParam1(String pmtParam1) {
        this.pmtParam1 = pmtParam1 == null ? null : pmtParam1.trim();
    }

    public String getPmtParam2() {
        return pmtParam2;
    }

    public void setPmtParam2(String pmtParam2) {
        this.pmtParam2 = pmtParam2 == null ? null : pmtParam2.trim();
    }

    public String getPmtParam3() {
        return pmtParam3;
    }

    public void setPmtParam3(String pmtParam3) {
        this.pmtParam3 = pmtParam3 == null ? null : pmtParam3.trim();
    }

    public String getPmtParam4() {
        return pmtParam4;
    }

    public void setPmtParam4(String pmtParam4) {
        this.pmtParam4 = pmtParam4 == null ? null : pmtParam4.trim();
    }

    public String getPmtParam5() {
        return pmtParam5;
    }

    public void setPmtParam5(String pmtParam5) {
        this.pmtParam5 = pmtParam5 == null ? null : pmtParam5.trim();
    }

    public String getPmtStatus() {
        return pmtStatus;
    }

    public void setPmtStatus(String pmtStatus) {
        this.pmtStatus = pmtStatus == null ? null : pmtStatus.trim();
    }
}