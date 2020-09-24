package com.vrv.bean;

public class MailMonitorLogBeanWithBLOBs extends MailMonitorLogBean {
    private String mainbody;

    private String sensitivecontent;

    private byte[] ipnumber;

    public String getMainbody() {
        return mainbody;
    }

    public void setMainbody(String mainbody) {
        this.mainbody = mainbody == null ? null : mainbody.trim();
    }

    public String getSensitivecontent() {
        return sensitivecontent;
    }

    public void setSensitivecontent(String sensitivecontent) {
        this.sensitivecontent = sensitivecontent == null ? null : sensitivecontent.trim();
    }

    public byte[] getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(byte[] ipnumber) {
        this.ipnumber = ipnumber;
    }
}