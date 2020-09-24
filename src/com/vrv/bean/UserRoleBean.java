package com.vrv.bean;

public class UserRoleBean {
    private Integer urtId;

    private Integer urtUtId;

    private String urtName;

    private String urtDescription;

    private String urtParam1;

    private String urtParam2;

    private String urtParam3;

    private String urtParam4;

    private String urtParam5;

    private Integer urtStatus;

    public Integer getUrtId() {
        return urtId;
    }

    public void setUrtId(Integer urtId) {
        this.urtId = urtId;
    }

    public Integer getUrtUtId() {
        return urtUtId;
    }

    public void setUrtUtId(Integer urtUtId) {
        this.urtUtId = urtUtId;
    }

    public String getUrtName() {
        return urtName;
    }

    public void setUrtName(String urtName) {
        this.urtName = urtName == null ? null : urtName.trim();
    }

    public String getUrtDescription() {
        return urtDescription;
    }

    public void setUrtDescription(String urtDescription) {
        this.urtDescription = urtDescription == null ? null : urtDescription.trim();
    }

    public String getUrtParam1() {
        return urtParam1;
    }

    public void setUrtParam1(String urtParam1) {
        this.urtParam1 = urtParam1 == null ? null : urtParam1.trim();
    }

    public String getUrtParam2() {
        return urtParam2;
    }

    public void setUrtParam2(String urtParam2) {
        this.urtParam2 = urtParam2 == null ? null : urtParam2.trim();
    }

    public String getUrtParam3() {
        return urtParam3;
    }

    public void setUrtParam3(String urtParam3) {
        this.urtParam3 = urtParam3 == null ? null : urtParam3.trim();
    }

    public String getUrtParam4() {
        return urtParam4;
    }

    public void setUrtParam4(String urtParam4) {
        this.urtParam4 = urtParam4 == null ? null : urtParam4.trim();
    }

    public String getUrtParam5() {
        return urtParam5;
    }

    public void setUrtParam5(String urtParam5) {
        this.urtParam5 = urtParam5 == null ? null : urtParam5.trim();
    }

    public Integer getUrtStatus() {
        return urtStatus;
    }

    public void setUrtStatus(Integer urtStatus) {
        this.urtStatus = urtStatus;
    }
}