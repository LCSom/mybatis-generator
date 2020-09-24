package com.vrv.bean;

public class DeviceKvsMonitorLogBeanWithBLOBs extends DeviceKvsMonitorLogBean {
    private String url;

    private byte[] ipnumber;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public byte[] getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(byte[] ipnumber) {
        this.ipnumber = ipnumber;
    }
}