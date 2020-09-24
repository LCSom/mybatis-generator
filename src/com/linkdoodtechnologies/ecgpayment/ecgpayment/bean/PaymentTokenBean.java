package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

public class PaymentTokenBean {
    private Integer pttId;

    private String pttAttId;

    private String pttToken;

    private String pttGeneratedTime;

    private String pttExpiredTime;

    private Integer pttStatus;

    private String pttParam1;

    private String pttParam2;

    private String pttParam3;

    private String pttParam4;

    private String pttParam5;

    private String pttValue;

    public Integer getPttId() {
        return pttId;
    }

    public void setPttId(Integer pttId) {
        this.pttId = pttId;
    }

    public String getPttAttId() {
        return pttAttId;
    }

    public void setPttAttId(String pttAttId) {
        this.pttAttId = pttAttId == null ? null : pttAttId.trim();
    }

    public String getPttToken() {
        return pttToken;
    }

    public void setPttToken(String pttToken) {
        this.pttToken = pttToken == null ? null : pttToken.trim();
    }

    public String getPttGeneratedTime() {
        return pttGeneratedTime;
    }

    public void setPttGeneratedTime(String pttGeneratedTime) {
        this.pttGeneratedTime = pttGeneratedTime == null ? null : pttGeneratedTime.trim();
    }

    public String getPttExpiredTime() {
        return pttExpiredTime;
    }

    public void setPttExpiredTime(String pttExpiredTime) {
        this.pttExpiredTime = pttExpiredTime == null ? null : pttExpiredTime.trim();
    }

    public Integer getPttStatus() {
        return pttStatus;
    }

    public void setPttStatus(Integer pttStatus) {
        this.pttStatus = pttStatus;
    }

    public String getPttParam1() {
        return pttParam1;
    }

    public void setPttParam1(String pttParam1) {
        this.pttParam1 = pttParam1 == null ? null : pttParam1.trim();
    }

    public String getPttParam2() {
        return pttParam2;
    }

    public void setPttParam2(String pttParam2) {
        this.pttParam2 = pttParam2 == null ? null : pttParam2.trim();
    }

    public String getPttParam3() {
        return pttParam3;
    }

    public void setPttParam3(String pttParam3) {
        this.pttParam3 = pttParam3 == null ? null : pttParam3.trim();
    }

    public String getPttParam4() {
        return pttParam4;
    }

    public void setPttParam4(String pttParam4) {
        this.pttParam4 = pttParam4 == null ? null : pttParam4.trim();
    }

    public String getPttParam5() {
        return pttParam5;
    }

    public void setPttParam5(String pttParam5) {
        this.pttParam5 = pttParam5 == null ? null : pttParam5.trim();
    }

    public String getPttValue() {
        return pttValue;
    }

    public void setPttValue(String pttValue) {
        this.pttValue = pttValue == null ? null : pttValue.trim();
    }
}