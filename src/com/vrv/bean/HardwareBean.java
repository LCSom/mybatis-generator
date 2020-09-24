package com.vrv.bean;

import java.util.Date;

public class HardwareBean {
    private String id;

    private String devonlyid;

    private String hardwaretypeid;

    private String hardwarename;

    private String hardwarecompany;

    private String hardwarevid;

    private String hardwarepid;

    private String description;

    private Date reporttime;

    private String properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevonlyid() {
        return devonlyid;
    }

    public void setDevonlyid(String devonlyid) {
        this.devonlyid = devonlyid == null ? null : devonlyid.trim();
    }

    public String getHardwaretypeid() {
        return hardwaretypeid;
    }

    public void setHardwaretypeid(String hardwaretypeid) {
        this.hardwaretypeid = hardwaretypeid == null ? null : hardwaretypeid.trim();
    }

    public String getHardwarename() {
        return hardwarename;
    }

    public void setHardwarename(String hardwarename) {
        this.hardwarename = hardwarename == null ? null : hardwarename.trim();
    }

    public String getHardwarecompany() {
        return hardwarecompany;
    }

    public void setHardwarecompany(String hardwarecompany) {
        this.hardwarecompany = hardwarecompany == null ? null : hardwarecompany.trim();
    }

    public String getHardwarevid() {
        return hardwarevid;
    }

    public void setHardwarevid(String hardwarevid) {
        this.hardwarevid = hardwarevid == null ? null : hardwarevid.trim();
    }

    public String getHardwarepid() {
        return hardwarepid;
    }

    public void setHardwarepid(String hardwarepid) {
        this.hardwarepid = hardwarepid == null ? null : hardwarepid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}