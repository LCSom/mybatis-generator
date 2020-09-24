package com.vrv.bean;

public class PatchBeanWithBLOBs extends PatchBean {
    private String superceded;

    private String supercededby;

    private String patchcve;

    public String getSuperceded() {
        return superceded;
    }

    public void setSuperceded(String superceded) {
        this.superceded = superceded == null ? null : superceded.trim();
    }

    public String getSupercededby() {
        return supercededby;
    }

    public void setSupercededby(String supercededby) {
        this.supercededby = supercededby == null ? null : supercededby.trim();
    }

    public String getPatchcve() {
        return patchcve;
    }

    public void setPatchcve(String patchcve) {
        this.patchcve = patchcve == null ? null : patchcve.trim();
    }
}