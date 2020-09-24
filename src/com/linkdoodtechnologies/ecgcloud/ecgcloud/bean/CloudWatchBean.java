package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

public class CloudWatchBean {
    private Integer cwtId;

    private Integer cwtCitId;

    private String cwtCloudType;

    private String cwtTotalNetworkOut;

    private String cwtStartDate;

    private String cwtEndDate;

    private String cwtParam1;

    private String cwtParam2;

    private String cwtParam3;

    private String cwtParam4;

    private String cwtParam5;

    public Integer getCwtId() {
        return cwtId;
    }

    public void setCwtId(Integer cwtId) {
        this.cwtId = cwtId;
    }

    public Integer getCwtCitId() {
        return cwtCitId;
    }

    public void setCwtCitId(Integer cwtCitId) {
        this.cwtCitId = cwtCitId;
    }

    public String getCwtCloudType() {
        return cwtCloudType;
    }

    public void setCwtCloudType(String cwtCloudType) {
        this.cwtCloudType = cwtCloudType == null ? null : cwtCloudType.trim();
    }

    public String getCwtTotalNetworkOut() {
        return cwtTotalNetworkOut;
    }

    public void setCwtTotalNetworkOut(String cwtTotalNetworkOut) {
        this.cwtTotalNetworkOut = cwtTotalNetworkOut == null ? null : cwtTotalNetworkOut.trim();
    }

    public String getCwtStartDate() {
        return cwtStartDate;
    }

    public void setCwtStartDate(String cwtStartDate) {
        this.cwtStartDate = cwtStartDate == null ? null : cwtStartDate.trim();
    }

    public String getCwtEndDate() {
        return cwtEndDate;
    }

    public void setCwtEndDate(String cwtEndDate) {
        this.cwtEndDate = cwtEndDate == null ? null : cwtEndDate.trim();
    }

    public String getCwtParam1() {
        return cwtParam1;
    }

    public void setCwtParam1(String cwtParam1) {
        this.cwtParam1 = cwtParam1 == null ? null : cwtParam1.trim();
    }

    public String getCwtParam2() {
        return cwtParam2;
    }

    public void setCwtParam2(String cwtParam2) {
        this.cwtParam2 = cwtParam2 == null ? null : cwtParam2.trim();
    }

    public String getCwtParam3() {
        return cwtParam3;
    }

    public void setCwtParam3(String cwtParam3) {
        this.cwtParam3 = cwtParam3 == null ? null : cwtParam3.trim();
    }

    public String getCwtParam4() {
        return cwtParam4;
    }

    public void setCwtParam4(String cwtParam4) {
        this.cwtParam4 = cwtParam4 == null ? null : cwtParam4.trim();
    }

    public String getCwtParam5() {
        return cwtParam5;
    }

    public void setCwtParam5(String cwtParam5) {
        this.cwtParam5 = cwtParam5 == null ? null : cwtParam5.trim();
    }
}