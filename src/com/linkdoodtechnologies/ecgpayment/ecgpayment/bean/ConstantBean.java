package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

public class ConstantBean {
    private Integer constId;

    private String constType;

    private String constValue;

    private String constParam1;

    private String constParam2;

    private String constParam3;

    private String constParam4;

    private String constParam5;

    public Integer getConstId() {
        return constId;
    }

    public void setConstId(Integer constId) {
        this.constId = constId;
    }

    public String getConstType() {
        return constType;
    }

    public void setConstType(String constType) {
        this.constType = constType == null ? null : constType.trim();
    }

    public String getConstValue() {
        return constValue;
    }

    public void setConstValue(String constValue) {
        this.constValue = constValue == null ? null : constValue.trim();
    }

    public String getConstParam1() {
        return constParam1;
    }

    public void setConstParam1(String constParam1) {
        this.constParam1 = constParam1 == null ? null : constParam1.trim();
    }

    public String getConstParam2() {
        return constParam2;
    }

    public void setConstParam2(String constParam2) {
        this.constParam2 = constParam2 == null ? null : constParam2.trim();
    }

    public String getConstParam3() {
        return constParam3;
    }

    public void setConstParam3(String constParam3) {
        this.constParam3 = constParam3 == null ? null : constParam3.trim();
    }

    public String getConstParam4() {
        return constParam4;
    }

    public void setConstParam4(String constParam4) {
        this.constParam4 = constParam4 == null ? null : constParam4.trim();
    }

    public String getConstParam5() {
        return constParam5;
    }

    public void setConstParam5(String constParam5) {
        this.constParam5 = constParam5 == null ? null : constParam5.trim();
    }
}