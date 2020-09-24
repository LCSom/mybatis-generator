package com.vrv.bean;

public class EmailServerBean {
    private String id;

    private String host;

    private Integer port;

    private String username;

    private String password;

    private Integer isssl;

    private String type;

    private String language;

    private String managermail;

    private Integer overtime;

    private String timezone;

    private String validation;

    private String databasefile;

    private String testmail;

    private String userfilepath;

    private String usestatus;

    private String emailmark;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsssl() {
        return isssl;
    }

    public void setIsssl(Integer isssl) {
        this.isssl = isssl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getManagermail() {
        return managermail;
    }

    public void setManagermail(String managermail) {
        this.managermail = managermail == null ? null : managermail.trim();
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone == null ? null : timezone.trim();
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation == null ? null : validation.trim();
    }

    public String getDatabasefile() {
        return databasefile;
    }

    public void setDatabasefile(String databasefile) {
        this.databasefile = databasefile == null ? null : databasefile.trim();
    }

    public String getTestmail() {
        return testmail;
    }

    public void setTestmail(String testmail) {
        this.testmail = testmail == null ? null : testmail.trim();
    }

    public String getUserfilepath() {
        return userfilepath;
    }

    public void setUserfilepath(String userfilepath) {
        this.userfilepath = userfilepath == null ? null : userfilepath.trim();
    }

    public String getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(String usestatus) {
        this.usestatus = usestatus == null ? null : usestatus.trim();
    }

    public String getEmailmark() {
        return emailmark;
    }

    public void setEmailmark(String emailmark) {
        this.emailmark = emailmark == null ? null : emailmark.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}