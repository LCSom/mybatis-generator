package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

import java.util.Date;

public class MessageBean {
    private Integer mtId;

    private Integer mtStId;

    private String mtMessage;

    private Integer mtRead;

    private Integer mtStatus;

    private String mtParam1;

    private String mtParam2;

    private String mtParam3;

    private String mtParam4;

    private String mtParam5;

    private Date mtCreatedDatetime;

    private Date mtUpdatedDatetime;

    public Integer getMtId() {
        return mtId;
    }

    public void setMtId(Integer mtId) {
        this.mtId = mtId;
    }

    public Integer getMtStId() {
        return mtStId;
    }

    public void setMtStId(Integer mtStId) {
        this.mtStId = mtStId;
    }

    public String getMtMessage() {
        return mtMessage;
    }

    public void setMtMessage(String mtMessage) {
        this.mtMessage = mtMessage == null ? null : mtMessage.trim();
    }

    public Integer getMtRead() {
        return mtRead;
    }

    public void setMtRead(Integer mtRead) {
        this.mtRead = mtRead;
    }

    public Integer getMtStatus() {
        return mtStatus;
    }

    public void setMtStatus(Integer mtStatus) {
        this.mtStatus = mtStatus;
    }

    public String getMtParam1() {
        return mtParam1;
    }

    public void setMtParam1(String mtParam1) {
        this.mtParam1 = mtParam1 == null ? null : mtParam1.trim();
    }

    public String getMtParam2() {
        return mtParam2;
    }

    public void setMtParam2(String mtParam2) {
        this.mtParam2 = mtParam2 == null ? null : mtParam2.trim();
    }

    public String getMtParam3() {
        return mtParam3;
    }

    public void setMtParam3(String mtParam3) {
        this.mtParam3 = mtParam3 == null ? null : mtParam3.trim();
    }

    public String getMtParam4() {
        return mtParam4;
    }

    public void setMtParam4(String mtParam4) {
        this.mtParam4 = mtParam4 == null ? null : mtParam4.trim();
    }

    public String getMtParam5() {
        return mtParam5;
    }

    public void setMtParam5(String mtParam5) {
        this.mtParam5 = mtParam5 == null ? null : mtParam5.trim();
    }

    public Date getMtCreatedDatetime() {
        return mtCreatedDatetime;
    }

    public void setMtCreatedDatetime(Date mtCreatedDatetime) {
        this.mtCreatedDatetime = mtCreatedDatetime;
    }

    public Date getMtUpdatedDatetime() {
        return mtUpdatedDatetime;
    }

    public void setMtUpdatedDatetime(Date mtUpdatedDatetime) {
        this.mtUpdatedDatetime = mtUpdatedDatetime;
    }
}