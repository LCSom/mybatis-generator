package com.vrv.bean;

public class HardwareLogBeanWithBLOBs extends HardwareLogBean {
    private String properties;

    private byte[] ipnumber;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    public byte[] getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(byte[] ipnumber) {
        this.ipnumber = ipnumber;
    }
}