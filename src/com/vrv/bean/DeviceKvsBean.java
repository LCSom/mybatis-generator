package com.vrv.bean;

import java.util.Date;

public class DeviceKvsBean {
    private String id;

    private String devonlyid;

    private String kvsname;

    private String flag;

    private String desinfo;

    private Integer type;

    private String kvsversion;

    private String kvsengineversion;

    private String kvslibversion;

    private String installpath;

    private Date installtime;

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

    public String getKvsname() {
        return kvsname;
    }

    public void setKvsname(String kvsname) {
        this.kvsname = kvsname == null ? null : kvsname.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getDesinfo() {
        return desinfo;
    }

    public void setDesinfo(String desinfo) {
        this.desinfo = desinfo == null ? null : desinfo.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKvsversion() {
        return kvsversion;
    }

    public void setKvsversion(String kvsversion) {
        this.kvsversion = kvsversion == null ? null : kvsversion.trim();
    }

    public String getKvsengineversion() {
        return kvsengineversion;
    }

    public void setKvsengineversion(String kvsengineversion) {
        this.kvsengineversion = kvsengineversion == null ? null : kvsengineversion.trim();
    }

    public String getKvslibversion() {
        return kvslibversion;
    }

    public void setKvslibversion(String kvslibversion) {
        this.kvslibversion = kvslibversion == null ? null : kvslibversion.trim();
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
}