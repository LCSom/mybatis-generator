package com.vrv.bean;

import java.util.Date;

public class TerminalRegistConfigBean {
    private String id;

    private String itemfield;

    private String dbfield;

    private String title;

    private String itemname;

    private Integer isverify;

    private Integer onlyselect;

    private Integer needfill;

    private String ctrltype;

    private Integer enabled;

    private Date createtime;

    private Date updatetime;

    private Integer sort;

    private String fieldcode;

    private Integer isshow;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemfield() {
        return itemfield;
    }

    public void setItemfield(String itemfield) {
        this.itemfield = itemfield == null ? null : itemfield.trim();
    }

    public String getDbfield() {
        return dbfield;
    }

    public void setDbfield(String dbfield) {
        this.dbfield = dbfield == null ? null : dbfield.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getIsverify() {
        return isverify;
    }

    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }

    public Integer getOnlyselect() {
        return onlyselect;
    }

    public void setOnlyselect(Integer onlyselect) {
        this.onlyselect = onlyselect;
    }

    public Integer getNeedfill() {
        return needfill;
    }

    public void setNeedfill(Integer needfill) {
        this.needfill = needfill;
    }

    public String getCtrltype() {
        return ctrltype;
    }

    public void setCtrltype(String ctrltype) {
        this.ctrltype = ctrltype == null ? null : ctrltype.trim();
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getFieldcode() {
        return fieldcode;
    }

    public void setFieldcode(String fieldcode) {
        this.fieldcode = fieldcode == null ? null : fieldcode.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}