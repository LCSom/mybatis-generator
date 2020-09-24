package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

public class NotificationBean {
    private Integer ntId;

    private Integer ntUtId;

    private String ntType;

    private String ntPhoneEmail;

    private String ntMessage;

    private String ntParam1;

    private String ntParam2;

    private String ntParam3;

    private String ntParam4;

    private String ntParam5;

    private String ntParam6;

    private Integer ntStatus;

    public Integer getNtId() {
        return ntId;
    }

    public void setNtId(Integer ntId) {
        this.ntId = ntId;
    }

    public Integer getNtUtId() {
        return ntUtId;
    }

    public void setNtUtId(Integer ntUtId) {
        this.ntUtId = ntUtId;
    }

    public String getNtType() {
        return ntType;
    }

    public void setNtType(String ntType) {
        this.ntType = ntType == null ? null : ntType.trim();
    }

    public String getNtPhoneEmail() {
        return ntPhoneEmail;
    }

    public void setNtPhoneEmail(String ntPhoneEmail) {
        this.ntPhoneEmail = ntPhoneEmail == null ? null : ntPhoneEmail.trim();
    }

    public String getNtMessage() {
        return ntMessage;
    }

    public void setNtMessage(String ntMessage) {
        this.ntMessage = ntMessage == null ? null : ntMessage.trim();
    }

    public String getNtParam1() {
        return ntParam1;
    }

    public void setNtParam1(String ntParam1) {
        this.ntParam1 = ntParam1 == null ? null : ntParam1.trim();
    }

    public String getNtParam2() {
        return ntParam2;
    }

    public void setNtParam2(String ntParam2) {
        this.ntParam2 = ntParam2 == null ? null : ntParam2.trim();
    }

    public String getNtParam3() {
        return ntParam3;
    }

    public void setNtParam3(String ntParam3) {
        this.ntParam3 = ntParam3 == null ? null : ntParam3.trim();
    }

    public String getNtParam4() {
        return ntParam4;
    }

    public void setNtParam4(String ntParam4) {
        this.ntParam4 = ntParam4 == null ? null : ntParam4.trim();
    }

    public String getNtParam5() {
        return ntParam5;
    }

    public void setNtParam5(String ntParam5) {
        this.ntParam5 = ntParam5 == null ? null : ntParam5.trim();
    }

    public String getNtParam6() {
        return ntParam6;
    }

    public void setNtParam6(String ntParam6) {
        this.ntParam6 = ntParam6 == null ? null : ntParam6.trim();
    }

    public Integer getNtStatus() {
        return ntStatus;
    }

    public void setNtStatus(Integer ntStatus) {
        this.ntStatus = ntStatus;
    }
}