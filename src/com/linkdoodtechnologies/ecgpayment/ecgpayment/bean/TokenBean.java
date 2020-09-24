package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

public class TokenBean {
    private Integer attTokenId;

    private String attAutId;

    private String attTokenKey;

    private Boolean attTokenStatus;

    private String attTokenExpireDate;

    private String attTokenAccessType;

    public Integer getAttTokenId() {
        return attTokenId;
    }

    public void setAttTokenId(Integer attTokenId) {
        this.attTokenId = attTokenId;
    }

    public String getAttAutId() {
        return attAutId;
    }

    public void setAttAutId(String attAutId) {
        this.attAutId = attAutId == null ? null : attAutId.trim();
    }

    public String getAttTokenKey() {
        return attTokenKey;
    }

    public void setAttTokenKey(String attTokenKey) {
        this.attTokenKey = attTokenKey == null ? null : attTokenKey.trim();
    }

    public Boolean getAttTokenStatus() {
        return attTokenStatus;
    }

    public void setAttTokenStatus(Boolean attTokenStatus) {
        this.attTokenStatus = attTokenStatus;
    }

    public String getAttTokenExpireDate() {
        return attTokenExpireDate;
    }

    public void setAttTokenExpireDate(String attTokenExpireDate) {
        this.attTokenExpireDate = attTokenExpireDate == null ? null : attTokenExpireDate.trim();
    }

    public String getAttTokenAccessType() {
        return attTokenAccessType;
    }

    public void setAttTokenAccessType(String attTokenAccessType) {
        this.attTokenAccessType = attTokenAccessType == null ? null : attTokenAccessType.trim();
    }
}