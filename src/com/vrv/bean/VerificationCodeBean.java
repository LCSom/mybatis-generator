package com.vrv.bean;

import java.util.Date;

public class VerificationCodeBean {
    private Integer vctId;

    private String vctType;

    private String vctContact;

    private String vctValue;

    private String vctParam1;

    private String vctParam2;

    private String vctParam3;

    private String vctParam4;

    private String vctParam5;

    private Integer vctStatus;

    private Date vctExpiredDatetime;

    private Date vctCreatedDatetime;

    private Date vctUpdatedDatetime;

    public Integer getVctId() {
        return vctId;
    }

    public void setVctId(Integer vctId) {
        this.vctId = vctId;
    }

    public String getVctType() {
        return vctType;
    }

    public void setVctType(String vctType) {
        this.vctType = vctType == null ? null : vctType.trim();
    }

    public String getVctContact() {
        return vctContact;
    }

    public void setVctContact(String vctContact) {
        this.vctContact = vctContact == null ? null : vctContact.trim();
    }

    public String getVctValue() {
        return vctValue;
    }

    public void setVctValue(String vctValue) {
        this.vctValue = vctValue == null ? null : vctValue.trim();
    }

    public String getVctParam1() {
        return vctParam1;
    }

    public void setVctParam1(String vctParam1) {
        this.vctParam1 = vctParam1 == null ? null : vctParam1.trim();
    }

    public String getVctParam2() {
        return vctParam2;
    }

    public void setVctParam2(String vctParam2) {
        this.vctParam2 = vctParam2 == null ? null : vctParam2.trim();
    }

    public String getVctParam3() {
        return vctParam3;
    }

    public void setVctParam3(String vctParam3) {
        this.vctParam3 = vctParam3 == null ? null : vctParam3.trim();
    }

    public String getVctParam4() {
        return vctParam4;
    }

    public void setVctParam4(String vctParam4) {
        this.vctParam4 = vctParam4 == null ? null : vctParam4.trim();
    }

    public String getVctParam5() {
        return vctParam5;
    }

    public void setVctParam5(String vctParam5) {
        this.vctParam5 = vctParam5 == null ? null : vctParam5.trim();
    }

    public Integer getVctStatus() {
        return vctStatus;
    }

    public void setVctStatus(Integer vctStatus) {
        this.vctStatus = vctStatus;
    }

    public Date getVctExpiredDatetime() {
        return vctExpiredDatetime;
    }

    public void setVctExpiredDatetime(Date vctExpiredDatetime) {
        this.vctExpiredDatetime = vctExpiredDatetime;
    }

    public Date getVctCreatedDatetime() {
        return vctCreatedDatetime;
    }

    public void setVctCreatedDatetime(Date vctCreatedDatetime) {
        this.vctCreatedDatetime = vctCreatedDatetime;
    }

    public Date getVctUpdatedDatetime() {
        return vctUpdatedDatetime;
    }

    public void setVctUpdatedDatetime(Date vctUpdatedDatetime) {
        this.vctUpdatedDatetime = vctUpdatedDatetime;
    }
}