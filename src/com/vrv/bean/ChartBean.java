package com.vrv.bean;

public class ChartBean {
    private Integer ctId;

    private Integer ctUtId;

    private String ctChartType;

    private String ctChartSize;

    private String ctChartTitle;

    private String ctParam1;

    private String ctParam2;

    private String ctParam3;

    private String ctParam4;

    private String ctParam5;

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getCtUtId() {
        return ctUtId;
    }

    public void setCtUtId(Integer ctUtId) {
        this.ctUtId = ctUtId;
    }

    public String getCtChartType() {
        return ctChartType;
    }

    public void setCtChartType(String ctChartType) {
        this.ctChartType = ctChartType == null ? null : ctChartType.trim();
    }

    public String getCtChartSize() {
        return ctChartSize;
    }

    public void setCtChartSize(String ctChartSize) {
        this.ctChartSize = ctChartSize == null ? null : ctChartSize.trim();
    }

    public String getCtChartTitle() {
        return ctChartTitle;
    }

    public void setCtChartTitle(String ctChartTitle) {
        this.ctChartTitle = ctChartTitle == null ? null : ctChartTitle.trim();
    }

    public String getCtParam1() {
        return ctParam1;
    }

    public void setCtParam1(String ctParam1) {
        this.ctParam1 = ctParam1 == null ? null : ctParam1.trim();
    }

    public String getCtParam2() {
        return ctParam2;
    }

    public void setCtParam2(String ctParam2) {
        this.ctParam2 = ctParam2 == null ? null : ctParam2.trim();
    }

    public String getCtParam3() {
        return ctParam3;
    }

    public void setCtParam3(String ctParam3) {
        this.ctParam3 = ctParam3 == null ? null : ctParam3.trim();
    }

    public String getCtParam4() {
        return ctParam4;
    }

    public void setCtParam4(String ctParam4) {
        this.ctParam4 = ctParam4 == null ? null : ctParam4.trim();
    }

    public String getCtParam5() {
        return ctParam5;
    }

    public void setCtParam5(String ctParam5) {
        this.ctParam5 = ctParam5 == null ? null : ctParam5.trim();
    }
}