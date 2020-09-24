package com.vrv.bean;

import java.util.Date;

public class DeviceBean {
    private String id;

    private String ip;

    private Integer iptype;

    private String ipnumber;

    private String mac;

    private String name;

    private String groupname;

    private String description;

    private String osid;

    private String devicetypeid;

    private String useronlyid;

    private String organizationid;

    private String organizationcodeui;

    private String approvalid;

    private Integer approvalstate;

    private String devonlyid;

    private Date registertime;

    private String clientid;

    private String clientname;

    private String clientsign;

    private String softversion;

    private String clientversion;

    private Date uninstalltime;

    private String switchid;

    private String switchport;

    private String cputype;

    private Double cpuhz;

    private Double memorysize;

    private String diskmodel;

    private Integer disksize;

    private String diskserial;

    private String computermanufacturer;

    private String computermodel;

    private String matherboardid;

    private String serviceno;

    private Integer ismutios;

    private Integer isvm;

    private String communicateip;

    private Integer isopened;

    private Integer regstate;

    private Integer protectstate;

    private Integer roamstate;

    private Integer deletestate;

    private String deviceusefulid;

    private Date lastupgradetime;

    private String olddevonlyid;

    private String location;

    private String holdername;

    private Integer assetstatus;

    private Date effectiveprotectedtime;

    private Integer issetlock;

    private Integer issetreregist;

    private Integer issetblock;

    private Integer issetuninstall;

    private Integer issetdisable;

    private Integer agentpacktype;

    private String logindomainname;

    private Integer accessnetworkstate;

    private Integer isfirewall;

    private String serverareaid;

    private Date reporttime;

    private Date updatetime;

    private Date findtime;

    private String classify;

    private Integer inforsource;

    private Integer iscontrol;

    private Date lastactivetime;

    private String historyonlinetime;

    private Integer losecontroltime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getIptype() {
        return iptype;
    }

    public void setIptype(Integer iptype) {
        this.iptype = iptype;
    }

    public String getIpnumber() {
        return ipnumber;
    }

    public void setIpnumber(String ipnumber) {
        this.ipnumber = ipnumber == null ? null : ipnumber.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOsid() {
        return osid;
    }

    public void setOsid(String osid) {
        this.osid = osid == null ? null : osid.trim();
    }

    public String getDevicetypeid() {
        return devicetypeid;
    }

    public void setDevicetypeid(String devicetypeid) {
        this.devicetypeid = devicetypeid == null ? null : devicetypeid.trim();
    }

    public String getUseronlyid() {
        return useronlyid;
    }

    public void setUseronlyid(String useronlyid) {
        this.useronlyid = useronlyid == null ? null : useronlyid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getOrganizationcodeui() {
        return organizationcodeui;
    }

    public void setOrganizationcodeui(String organizationcodeui) {
        this.organizationcodeui = organizationcodeui == null ? null : organizationcodeui.trim();
    }

    public String getApprovalid() {
        return approvalid;
    }

    public void setApprovalid(String approvalid) {
        this.approvalid = approvalid == null ? null : approvalid.trim();
    }

    public Integer getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(Integer approvalstate) {
        this.approvalstate = approvalstate;
    }

    public String getDevonlyid() {
        return devonlyid;
    }

    public void setDevonlyid(String devonlyid) {
        this.devonlyid = devonlyid == null ? null : devonlyid.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientsign() {
        return clientsign;
    }

    public void setClientsign(String clientsign) {
        this.clientsign = clientsign == null ? null : clientsign.trim();
    }

    public String getSoftversion() {
        return softversion;
    }

    public void setSoftversion(String softversion) {
        this.softversion = softversion == null ? null : softversion.trim();
    }

    public String getClientversion() {
        return clientversion;
    }

    public void setClientversion(String clientversion) {
        this.clientversion = clientversion == null ? null : clientversion.trim();
    }

    public Date getUninstalltime() {
        return uninstalltime;
    }

    public void setUninstalltime(Date uninstalltime) {
        this.uninstalltime = uninstalltime;
    }

    public String getSwitchid() {
        return switchid;
    }

    public void setSwitchid(String switchid) {
        this.switchid = switchid == null ? null : switchid.trim();
    }

    public String getSwitchport() {
        return switchport;
    }

    public void setSwitchport(String switchport) {
        this.switchport = switchport == null ? null : switchport.trim();
    }

    public String getCputype() {
        return cputype;
    }

    public void setCputype(String cputype) {
        this.cputype = cputype == null ? null : cputype.trim();
    }

    public Double getCpuhz() {
        return cpuhz;
    }

    public void setCpuhz(Double cpuhz) {
        this.cpuhz = cpuhz;
    }

    public Double getMemorysize() {
        return memorysize;
    }

    public void setMemorysize(Double memorysize) {
        this.memorysize = memorysize;
    }

    public String getDiskmodel() {
        return diskmodel;
    }

    public void setDiskmodel(String diskmodel) {
        this.diskmodel = diskmodel == null ? null : diskmodel.trim();
    }

    public Integer getDisksize() {
        return disksize;
    }

    public void setDisksize(Integer disksize) {
        this.disksize = disksize;
    }

    public String getDiskserial() {
        return diskserial;
    }

    public void setDiskserial(String diskserial) {
        this.diskserial = diskserial == null ? null : diskserial.trim();
    }

    public String getComputermanufacturer() {
        return computermanufacturer;
    }

    public void setComputermanufacturer(String computermanufacturer) {
        this.computermanufacturer = computermanufacturer == null ? null : computermanufacturer.trim();
    }

    public String getComputermodel() {
        return computermodel;
    }

    public void setComputermodel(String computermodel) {
        this.computermodel = computermodel == null ? null : computermodel.trim();
    }

    public String getMatherboardid() {
        return matherboardid;
    }

    public void setMatherboardid(String matherboardid) {
        this.matherboardid = matherboardid == null ? null : matherboardid.trim();
    }

    public String getServiceno() {
        return serviceno;
    }

    public void setServiceno(String serviceno) {
        this.serviceno = serviceno == null ? null : serviceno.trim();
    }

    public Integer getIsmutios() {
        return ismutios;
    }

    public void setIsmutios(Integer ismutios) {
        this.ismutios = ismutios;
    }

    public Integer getIsvm() {
        return isvm;
    }

    public void setIsvm(Integer isvm) {
        this.isvm = isvm;
    }

    public String getCommunicateip() {
        return communicateip;
    }

    public void setCommunicateip(String communicateip) {
        this.communicateip = communicateip == null ? null : communicateip.trim();
    }

    public Integer getIsopened() {
        return isopened;
    }

    public void setIsopened(Integer isopened) {
        this.isopened = isopened;
    }

    public Integer getRegstate() {
        return regstate;
    }

    public void setRegstate(Integer regstate) {
        this.regstate = regstate;
    }

    public Integer getProtectstate() {
        return protectstate;
    }

    public void setProtectstate(Integer protectstate) {
        this.protectstate = protectstate;
    }

    public Integer getRoamstate() {
        return roamstate;
    }

    public void setRoamstate(Integer roamstate) {
        this.roamstate = roamstate;
    }

    public Integer getDeletestate() {
        return deletestate;
    }

    public void setDeletestate(Integer deletestate) {
        this.deletestate = deletestate;
    }

    public String getDeviceusefulid() {
        return deviceusefulid;
    }

    public void setDeviceusefulid(String deviceusefulid) {
        this.deviceusefulid = deviceusefulid == null ? null : deviceusefulid.trim();
    }

    public Date getLastupgradetime() {
        return lastupgradetime;
    }

    public void setLastupgradetime(Date lastupgradetime) {
        this.lastupgradetime = lastupgradetime;
    }

    public String getOlddevonlyid() {
        return olddevonlyid;
    }

    public void setOlddevonlyid(String olddevonlyid) {
        this.olddevonlyid = olddevonlyid == null ? null : olddevonlyid.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername == null ? null : holdername.trim();
    }

    public Integer getAssetstatus() {
        return assetstatus;
    }

    public void setAssetstatus(Integer assetstatus) {
        this.assetstatus = assetstatus;
    }

    public Date getEffectiveprotectedtime() {
        return effectiveprotectedtime;
    }

    public void setEffectiveprotectedtime(Date effectiveprotectedtime) {
        this.effectiveprotectedtime = effectiveprotectedtime;
    }

    public Integer getIssetlock() {
        return issetlock;
    }

    public void setIssetlock(Integer issetlock) {
        this.issetlock = issetlock;
    }

    public Integer getIssetreregist() {
        return issetreregist;
    }

    public void setIssetreregist(Integer issetreregist) {
        this.issetreregist = issetreregist;
    }

    public Integer getIssetblock() {
        return issetblock;
    }

    public void setIssetblock(Integer issetblock) {
        this.issetblock = issetblock;
    }

    public Integer getIssetuninstall() {
        return issetuninstall;
    }

    public void setIssetuninstall(Integer issetuninstall) {
        this.issetuninstall = issetuninstall;
    }

    public Integer getIssetdisable() {
        return issetdisable;
    }

    public void setIssetdisable(Integer issetdisable) {
        this.issetdisable = issetdisable;
    }

    public Integer getAgentpacktype() {
        return agentpacktype;
    }

    public void setAgentpacktype(Integer agentpacktype) {
        this.agentpacktype = agentpacktype;
    }

    public String getLogindomainname() {
        return logindomainname;
    }

    public void setLogindomainname(String logindomainname) {
        this.logindomainname = logindomainname == null ? null : logindomainname.trim();
    }

    public Integer getAccessnetworkstate() {
        return accessnetworkstate;
    }

    public void setAccessnetworkstate(Integer accessnetworkstate) {
        this.accessnetworkstate = accessnetworkstate;
    }

    public Integer getIsfirewall() {
        return isfirewall;
    }

    public void setIsfirewall(Integer isfirewall) {
        this.isfirewall = isfirewall;
    }

    public String getServerareaid() {
        return serverareaid;
    }

    public void setServerareaid(String serverareaid) {
        this.serverareaid = serverareaid == null ? null : serverareaid.trim();
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getFindtime() {
        return findtime;
    }

    public void setFindtime(Date findtime) {
        this.findtime = findtime;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public Integer getInforsource() {
        return inforsource;
    }

    public void setInforsource(Integer inforsource) {
        this.inforsource = inforsource;
    }

    public Integer getIscontrol() {
        return iscontrol;
    }

    public void setIscontrol(Integer iscontrol) {
        this.iscontrol = iscontrol;
    }

    public Date getLastactivetime() {
        return lastactivetime;
    }

    public void setLastactivetime(Date lastactivetime) {
        this.lastactivetime = lastactivetime;
    }

    public String getHistoryonlinetime() {
        return historyonlinetime;
    }

    public void setHistoryonlinetime(String historyonlinetime) {
        this.historyonlinetime = historyonlinetime == null ? null : historyonlinetime.trim();
    }

    public Integer getLosecontroltime() {
        return losecontroltime;
    }

    public void setLosecontroltime(Integer losecontroltime) {
        this.losecontroltime = losecontroltime;
    }
}