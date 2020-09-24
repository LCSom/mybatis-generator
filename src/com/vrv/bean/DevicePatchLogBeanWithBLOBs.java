package com.vrv.bean;

public class DevicePatchLogBeanWithBLOBs extends DevicePatchLogBean {
    private byte[] ipnumber;

    private String patchcve;

    public byte[] getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(byte[] ipnumber) {
        this.ipnumber = ipnumber;
    }

    public String getPatchcve() {
        return patchcve;
    }

    public void setPatchcve(String patchcve) {
        this.patchcve = patchcve == null ? null : patchcve.trim();
    }
}