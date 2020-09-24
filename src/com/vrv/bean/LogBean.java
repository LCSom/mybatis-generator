package com.vrv.bean;

import java.util.Date;

public class LogBean {
    private Integer ltId;

    private String ltOprLp;

    private String ltLogType;

    private String ltParam1;

    private String ltParam2;

    private String ltParam3;

    private String ltParam4;

    private String ltParam5;

    private String ltParam6;

    private String ltParam7;

    private String ltParam8;

    private Boolean ltStatus;

    private Date ltCreatedDatetime;

    private Date ltUpdatedDatetime;

    public Integer getLtId() {
        return ltId;
    }

    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    public String getLtOprLp() {
        return ltOprLp;
    }

    public void setLtOprLp(String ltOprLp) {
        this.ltOprLp = ltOprLp == null ? null : ltOprLp.trim();
    }

    public String getLtLogType() {
        return ltLogType;
    }

    public void setLtLogType(String ltLogType) {
        this.ltLogType = ltLogType == null ? null : ltLogType.trim();
    }

    public String getLtParam1() {
        return ltParam1;
    }

    public void setLtParam1(String ltParam1) {
        this.ltParam1 = ltParam1 == null ? null : ltParam1.trim();
    }

    public String getLtParam2() {
        return ltParam2;
    }

    public void setLtParam2(String ltParam2) {
        this.ltParam2 = ltParam2 == null ? null : ltParam2.trim();
    }

    public String getLtParam3() {
        return ltParam3;
    }

    public void setLtParam3(String ltParam3) {
        this.ltParam3 = ltParam3 == null ? null : ltParam3.trim();
    }

    public String getLtParam4() {
        return ltParam4;
    }

    public void setLtParam4(String ltParam4) {
        this.ltParam4 = ltParam4 == null ? null : ltParam4.trim();
    }

    public String getLtParam5() {
        return ltParam5;
    }

    public void setLtParam5(String ltParam5) {
        this.ltParam5 = ltParam5 == null ? null : ltParam5.trim();
    }

    public String getLtParam6() {
        return ltParam6;
    }

    public void setLtParam6(String ltParam6) {
        this.ltParam6 = ltParam6 == null ? null : ltParam6.trim();
    }

    public String getLtParam7() {
        return ltParam7;
    }

    public void setLtParam7(String ltParam7) {
        this.ltParam7 = ltParam7 == null ? null : ltParam7.trim();
    }

    public String getLtParam8() {
        return ltParam8;
    }

    public void setLtParam8(String ltParam8) {
        this.ltParam8 = ltParam8 == null ? null : ltParam8.trim();
    }

    public Boolean getLtStatus() {
        return ltStatus;
    }

    public void setLtStatus(Boolean ltStatus) {
        this.ltStatus = ltStatus;
    }

    public Date getLtCreatedDatetime() {
        return ltCreatedDatetime;
    }

    public void setLtCreatedDatetime(Date ltCreatedDatetime) {
        this.ltCreatedDatetime = ltCreatedDatetime;
    }

    public Date getLtUpdatedDatetime() {
        return ltUpdatedDatetime;
    }

    public void setLtUpdatedDatetime(Date ltUpdatedDatetime) {
        this.ltUpdatedDatetime = ltUpdatedDatetime;
    }
}