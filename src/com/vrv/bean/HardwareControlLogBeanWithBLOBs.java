package com.vrv.bean;

public class HardwareControlLogBeanWithBLOBs extends HardwareControlLogBean {
    private byte[] ipnumber;

    private String properties;

    public byte[] getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(byte[] ipnumber) {
        this.ipnumber = ipnumber;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}