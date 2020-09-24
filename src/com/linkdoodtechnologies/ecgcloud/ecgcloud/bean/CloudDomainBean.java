package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.Date;

public class CloudDomainBean {
    private Integer cdtId;

    private String cdtDomainName;

    private String cdtIp;

    private String cdtVersion;

    private Date cdtCreatedDatetime;

    private Date cdtUpdatedDatetime;

    private Integer cdtStatus;

    private String cdtParam1;

    private String cdtParam2;

    private String cdtParam3;

    private String cdtParam4;

    private String cdtParam5;

    public Integer getCdtId() {
        return cdtId;
    }

    public void setCdtId(Integer cdtId) {
        this.cdtId = cdtId;
    }

    public String getCdtDomainName() {
        return cdtDomainName;
    }

    public void setCdtDomainName(String cdtDomainName) {
        this.cdtDomainName = cdtDomainName == null ? null : cdtDomainName.trim();
    }

    public String getCdtIp() {
        return cdtIp;
    }

    public void setCdtIp(String cdtIp) {
        this.cdtIp = cdtIp == null ? null : cdtIp.trim();
    }

    public String getCdtVersion() {
        return cdtVersion;
    }

    public void setCdtVersion(String cdtVersion) {
        this.cdtVersion = cdtVersion == null ? null : cdtVersion.trim();
    }

    public Date getCdtCreatedDatetime() {
        return cdtCreatedDatetime;
    }

    public void setCdtCreatedDatetime(Date cdtCreatedDatetime) {
        this.cdtCreatedDatetime = cdtCreatedDatetime;
    }

    public Date getCdtUpdatedDatetime() {
        return cdtUpdatedDatetime;
    }

    public void setCdtUpdatedDatetime(Date cdtUpdatedDatetime) {
        this.cdtUpdatedDatetime = cdtUpdatedDatetime;
    }

    public Integer getCdtStatus() {
        return cdtStatus;
    }

    public void setCdtStatus(Integer cdtStatus) {
        this.cdtStatus = cdtStatus;
    }

    public String getCdtParam1() {
        return cdtParam1;
    }

    public void setCdtParam1(String cdtParam1) {
        this.cdtParam1 = cdtParam1 == null ? null : cdtParam1.trim();
    }

    public String getCdtParam2() {
        return cdtParam2;
    }

    public void setCdtParam2(String cdtParam2) {
        this.cdtParam2 = cdtParam2 == null ? null : cdtParam2.trim();
    }

    public String getCdtParam3() {
        return cdtParam3;
    }

    public void setCdtParam3(String cdtParam3) {
        this.cdtParam3 = cdtParam3 == null ? null : cdtParam3.trim();
    }

    public String getCdtParam4() {
        return cdtParam4;
    }

    public void setCdtParam4(String cdtParam4) {
        this.cdtParam4 = cdtParam4 == null ? null : cdtParam4.trim();
    }

    public String getCdtParam5() {
        return cdtParam5;
    }

    public void setCdtParam5(String cdtParam5) {
        this.cdtParam5 = cdtParam5 == null ? null : cdtParam5.trim();
    }
}