package com.vrv.bean;

import java.util.Date;

public class InstallSoftBean {
    private String id;

    private String sid;

    private String devonlyid;

    private String name;

    private String company;

    private Integer wow64;

    private String regguid;

    private String installpath;

    private Date installtime;

    private String version;

    private String uninstallpath;

    private Integer standardflag;

    private String softid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getDevonlyid() {
        return devonlyid;
    }

    public void setDevonlyid(String devonlyid) {
        this.devonlyid = devonlyid == null ? null : devonlyid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Integer getWow64() {
        return wow64;
    }

    public void setWow64(Integer wow64) {
        this.wow64 = wow64;
    }

    public String getRegguid() {
        return regguid;
    }

    public void setRegguid(String regguid) {
        this.regguid = regguid == null ? null : regguid.trim();
    }

    public String getInstallpath() {
        return installpath;
    }

    public void setInstallpath(String installpath) {
        this.installpath = installpath == null ? null : installpath.trim();
    }

    public Date getInstalltime() {
        return installtime;
    }

    public void setInstalltime(Date installtime) {
        this.installtime = installtime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getUninstallpath() {
        return uninstallpath;
    }

    public void setUninstallpath(String uninstallpath) {
        this.uninstallpath = uninstallpath == null ? null : uninstallpath.trim();
    }

    public Integer getStandardflag() {
        return standardflag;
    }

    public void setStandardflag(Integer standardflag) {
        this.standardflag = standardflag;
    }

    public String getSoftid() {
        return softid;
    }

    public void setSoftid(String softid) {
        this.softid = softid == null ? null : softid.trim();
    }
}