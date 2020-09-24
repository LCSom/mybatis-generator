package com.vrv.bean;

import java.util.Date;

public class DeviceNetworkBean {
    private String id;

    private String devonlyid;

    private String mac;

    private String ip;

    private String gate;

    private String gateways;

    private String dns;

    private String mactype;

    private String netcardname;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevonlyid() {
        return devonlyid;
    }

    public void setDevonlyid(String devonlyid) {
        this.devonlyid = devonlyid == null ? null : devonlyid.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate == null ? null : gate.trim();
    }

    public String getGateways() {
        return gateways;
    }

    public void setGateways(String gateways) {
        this.gateways = gateways == null ? null : gateways.trim();
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns == null ? null : dns.trim();
    }

    public String getMactype() {
        return mactype;
    }

    public void setMactype(String mactype) {
        this.mactype = mactype == null ? null : mactype.trim();
    }

    public String getNetcardname() {
        return netcardname;
    }

    public void setNetcardname(String netcardname) {
        this.netcardname = netcardname == null ? null : netcardname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}