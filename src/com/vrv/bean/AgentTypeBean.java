package com.vrv.bean;

public class AgentTypeBean {
    private String id;

    private String typename;

    private String typecode;

    private Integer agentpacktype;

    private String parentclass;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public Integer getAgentpacktype() {
        return agentpacktype;
    }

    public void setAgentpacktype(Integer agentpacktype) {
        this.agentpacktype = agentpacktype;
    }

    public String getParentclass() {
        return parentclass;
    }

    public void setParentclass(String parentclass) {
        this.parentclass = parentclass == null ? null : parentclass.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}