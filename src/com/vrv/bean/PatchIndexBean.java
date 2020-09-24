package com.vrv.bean;

import java.util.Date;

public class PatchIndexBean {
    private String id;

    private String name;

    private String path;

    private String checksum;

    private String crc;

    private Date uploadtime;

    private Date lastuploadtime;

    private String fromindex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum == null ? null : checksum.trim();
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc == null ? null : crc.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getLastuploadtime() {
        return lastuploadtime;
    }

    public void setLastuploadtime(Date lastuploadtime) {
        this.lastuploadtime = lastuploadtime;
    }

    public String getFromindex() {
        return fromindex;
    }

    public void setFromindex(String fromindex) {
        this.fromindex = fromindex == null ? null : fromindex.trim();
    }
}