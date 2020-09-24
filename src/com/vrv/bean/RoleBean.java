package com.vrv.bean;

import java.util.Date;

public class RoleBean {
    private Integer rtId;

    private String rtName;

    private String rtDescription;

    private String rtType;

    private Integer rtRoleLevel;

    private String rtCreator;

    private String rtUpdater;

    private String rtClassify;

    private String rtParam1;

    private String rtParam2;

    private String rtParam3;

    private String rtParam4;

    private String rtParam5;

    private String rtParam6;

    private Date rtCreatedDatetime;

    private Date rtUpdatedDatetime;

    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public String getRtName() {
        return rtName;
    }

    public void setRtName(String rtName) {
        this.rtName = rtName == null ? null : rtName.trim();
    }

    public String getRtDescription() {
        return rtDescription;
    }

    public void setRtDescription(String rtDescription) {
        this.rtDescription = rtDescription == null ? null : rtDescription.trim();
    }

    public String getRtType() {
        return rtType;
    }

    public void setRtType(String rtType) {
        this.rtType = rtType == null ? null : rtType.trim();
    }

    public Integer getRtRoleLevel() {
        return rtRoleLevel;
    }

    public void setRtRoleLevel(Integer rtRoleLevel) {
        this.rtRoleLevel = rtRoleLevel;
    }

    public String getRtCreator() {
        return rtCreator;
    }

    public void setRtCreator(String rtCreator) {
        this.rtCreator = rtCreator == null ? null : rtCreator.trim();
    }

    public String getRtUpdater() {
        return rtUpdater;
    }

    public void setRtUpdater(String rtUpdater) {
        this.rtUpdater = rtUpdater == null ? null : rtUpdater.trim();
    }

    public String getRtClassify() {
        return rtClassify;
    }

    public void setRtClassify(String rtClassify) {
        this.rtClassify = rtClassify == null ? null : rtClassify.trim();
    }

    public String getRtParam1() {
        return rtParam1;
    }

    public void setRtParam1(String rtParam1) {
        this.rtParam1 = rtParam1 == null ? null : rtParam1.trim();
    }

    public String getRtParam2() {
        return rtParam2;
    }

    public void setRtParam2(String rtParam2) {
        this.rtParam2 = rtParam2 == null ? null : rtParam2.trim();
    }

    public String getRtParam3() {
        return rtParam3;
    }

    public void setRtParam3(String rtParam3) {
        this.rtParam3 = rtParam3 == null ? null : rtParam3.trim();
    }

    public String getRtParam4() {
        return rtParam4;
    }

    public void setRtParam4(String rtParam4) {
        this.rtParam4 = rtParam4 == null ? null : rtParam4.trim();
    }

    public String getRtParam5() {
        return rtParam5;
    }

    public void setRtParam5(String rtParam5) {
        this.rtParam5 = rtParam5 == null ? null : rtParam5.trim();
    }

    public String getRtParam6() {
        return rtParam6;
    }

    public void setRtParam6(String rtParam6) {
        this.rtParam6 = rtParam6 == null ? null : rtParam6.trim();
    }

    public Date getRtCreatedDatetime() {
        return rtCreatedDatetime;
    }

    public void setRtCreatedDatetime(Date rtCreatedDatetime) {
        this.rtCreatedDatetime = rtCreatedDatetime;
    }

    public Date getRtUpdatedDatetime() {
        return rtUpdatedDatetime;
    }

    public void setRtUpdatedDatetime(Date rtUpdatedDatetime) {
        this.rtUpdatedDatetime = rtUpdatedDatetime;
    }
}