package com.vrv.bean;

import java.util.Date;

public class ServerAreaBean {
    private String id;

    private String name;

    private String creatorid;

    private Date createtime;

    private String updaterid;

    private Date updatetime;

    private String description;

    private Integer ismain;

    private String managerid;

    private String maintainer;

    private String maintainerphone;

    private String maintaineremail;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsmain() {
        return ismain;
    }

    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
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

    public String getMaintaineremail() {
        return maintaineremail;
    }

    public void setMaintaineremail(String maintaineremail) {
        this.maintaineremail = maintaineremail == null ? null : maintaineremail.trim();
    }
}