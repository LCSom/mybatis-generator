package com.vrv.bean;

import java.util.Date;

public class KvsSoftBean {
    private String id;

    private String name;

    private String flag;

    private String desinfo;

    private Integer type;

    private String company;

    private String softversion;

    private String softenginever;

    private String softvirusbasever;

    private String url;

    private String version;

    private String installpath;

    private String enginever;

    private String virusbasever;

    private Date publishtime;

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSoftversion() {
        return softversion;
    }

    public void setSoftversion(String softversion) {
        this.softversion = softversion == null ? null : softversion.trim();
    }

    public String getSoftenginever() {
        return softenginever;
    }

    public void setSoftenginever(String softenginever) {
        this.softenginever = softenginever == null ? null : softenginever.trim();
    }

    public String getSoftvirusbasever() {
        return softvirusbasever;
    }

    public void setSoftvirusbasever(String softvirusbasever) {
        this.softvirusbasever = softvirusbasever == null ? null : softvirusbasever.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getInstallpath() {
        return installpath;
    }

    public void setInstallpath(String installpath) {
        this.installpath = installpath == null ? null : installpath.trim();
    }

    public String getEnginever() {
        return enginever;
    }

    public void setEnginever(String enginever) {
        this.enginever = enginever == null ? null : enginever.trim();
    }

    public String getVirusbasever() {
        return virusbasever;
    }

    public void setVirusbasever(String virusbasever) {
        this.virusbasever = virusbasever == null ? null : virusbasever.trim();
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}