package com.vrv.bean;

import java.util.Date;

public class OrgBean {
    private String id;

    private String name;

    private String zipcode;

    private String orglevel;

    private Integer tier;

    private String description;

    private String codeui;

    private Integer state;

    private String parentid;

    private String creatorid;

    private Date createtime;

    private String updaterid;

    private Date updatetime;

    private String defaultauthor;

    private String maintainer;

    private String maintainerphone;

    private String maintainertel;

    private String maintaineremail;

    private Long sort;

    private String abbrname;

    private String shortid;

    private String parentpath;

    private String depttype;

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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getOrglevel() {
        return orglevel;
    }

    public void setOrglevel(String orglevel) {
        this.orglevel = orglevel == null ? null : orglevel.trim();
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCodeui() {
        return codeui;
    }

    public void setCodeui(String codeui) {
        this.codeui = codeui == null ? null : codeui.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdaterid() {
        return updaterid;
    }

    public void setUpdaterid(String updaterid) {
        this.updaterid = updaterid == null ? null : updaterid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDefaultauthor() {
        return defaultauthor;
    }

    public void setDefaultauthor(String defaultauthor) {
        this.defaultauthor = defaultauthor == null ? null : defaultauthor.trim();
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public String getMaintainerphone() {
        return maintainerphone;
    }

    public void setMaintainerphone(String maintainerphone) {
        this.maintainerphone = maintainerphone == null ? null : maintainerphone.trim();
    }

    public String getMaintainertel() {
        return maintainertel;
    }

    public void setMaintainertel(String maintainertel) {
        this.maintainertel = maintainertel == null ? null : maintainertel.trim();
    }

    public String getMaintaineremail() {
        return maintaineremail;
    }

    public void setMaintaineremail(String maintaineremail) {
        this.maintaineremail = maintaineremail == null ? null : maintaineremail.trim();
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getAbbrname() {
        return abbrname;
    }

    public void setAbbrname(String abbrname) {
        this.abbrname = abbrname == null ? null : abbrname.trim();
    }

    public String getShortid() {
        return shortid;
    }

    public void setShortid(String shortid) {
        this.shortid = shortid == null ? null : shortid.trim();
    }

    public String getParentpath() {
        return parentpath;
    }

    public void setParentpath(String parentpath) {
        this.parentpath = parentpath == null ? null : parentpath.trim();
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype == null ? null : depttype.trim();
    }
}