package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

public class CloudRenewInstanceBean {
    private Integer ecrId;

    private String ecrOtn;

    private String ecrRenewStartDate;

    private String ecrRenewEndDate;

    private Integer ecrPeriodNum;

    private String ecrPeriodType;

    private String ecrCloudType;

    private String ecrRemark;

    private Integer ecrStatus;

    private String ecrParam1;

    private String ecrParam2;

    private String ecrParam3;

    private String ecrParam4;

    public Integer getEcrId() {
        return ecrId;
    }

    public void setEcrId(Integer ecrId) {
        this.ecrId = ecrId;
    }

    public String getEcrOtn() {
        return ecrOtn;
    }

    public void setEcrOtn(String ecrOtn) {
        this.ecrOtn = ecrOtn == null ? null : ecrOtn.trim();
    }

    public String getEcrRenewStartDate() {
        return ecrRenewStartDate;
    }

    public void setEcrRenewStartDate(String ecrRenewStartDate) {
        this.ecrRenewStartDate = ecrRenewStartDate == null ? null : ecrRenewStartDate.trim();
    }

    public String getEcrRenewEndDate() {
        return ecrRenewEndDate;
    }

    public void setEcrRenewEndDate(String ecrRenewEndDate) {
        this.ecrRenewEndDate = ecrRenewEndDate == null ? null : ecrRenewEndDate.trim();
    }

    public Integer getEcrPeriodNum() {
        return ecrPeriodNum;
    }

    public void setEcrPeriodNum(Integer ecrPeriodNum) {
        this.ecrPeriodNum = ecrPeriodNum;
    }

    public String getEcrPeriodType() {
        return ecrPeriodType;
    }

    public void setEcrPeriodType(String ecrPeriodType) {
        this.ecrPeriodType = ecrPeriodType == null ? null : ecrPeriodType.trim();
    }

    public String getEcrCloudType() {
        return ecrCloudType;
    }

    public void setEcrCloudType(String ecrCloudType) {
        this.ecrCloudType = ecrCloudType == null ? null : ecrCloudType.trim();
    }

    public String getEcrRemark() {
        return ecrRemark;
    }

    public void setEcrRemark(String ecrRemark) {
        this.ecrRemark = ecrRemark == null ? null : ecrRemark.trim();
    }

    public Integer getEcrStatus() {
        return ecrStatus;
    }

    public void setEcrStatus(Integer ecrStatus) {
        this.ecrStatus = ecrStatus;
    }

    public String getEcrParam1() {
        return ecrParam1;
    }

    public void setEcrParam1(String ecrParam1) {
        this.ecrParam1 = ecrParam1 == null ? null : ecrParam1.trim();
    }

    public String getEcrParam2() {
        return ecrParam2;
    }

    public void setEcrParam2(String ecrParam2) {
        this.ecrParam2 = ecrParam2 == null ? null : ecrParam2.trim();
    }

    public String getEcrParam3() {
        return ecrParam3;
    }

    public void setEcrParam3(String ecrParam3) {
        this.ecrParam3 = ecrParam3 == null ? null : ecrParam3.trim();
    }

    public String getEcrParam4() {
        return ecrParam4;
    }

    public void setEcrParam4(String ecrParam4) {
        this.ecrParam4 = ecrParam4 == null ? null : ecrParam4.trim();
    }
}