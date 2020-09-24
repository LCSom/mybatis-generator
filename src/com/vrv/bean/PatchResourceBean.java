package com.vrv.bean;

public class PatchResourceBean {
    private String id;

    private String updateid;

    private String language;

    private String showname;

    private String description;

    private String holedescription;

    private String holeinfo;

    private String affects;

    private String suggestion;

    private String url;

    private Long patchsize;

    private String checksum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUpdateid() {
        return updateid;
    }

    public void setUpdateid(String updateid) {
        this.updateid = updateid == null ? null : updateid.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHoledescription() {
        return holedescription;
    }

    public void setHoledescription(String holedescription) {
        this.holedescription = holedescription == null ? null : holedescription.trim();
    }

    public String getHoleinfo() {
        return holeinfo;
    }

    public void setHoleinfo(String holeinfo) {
        this.holeinfo = holeinfo == null ? null : holeinfo.trim();
    }

    public String getAffects() {
        return affects;
    }

    public void setAffects(String affects) {
        this.affects = affects == null ? null : affects.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getPatchsize() {
        return patchsize;
    }

    public void setPatchsize(Long patchsize) {
        this.patchsize = patchsize;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum == null ? null : checksum.trim();
    }
}