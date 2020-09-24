package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceInfoBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceInfoBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIsNull() {
            addCriterion("osDescription is null");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIsNotNull() {
            addCriterion("osDescription is not null");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionEqualTo(String value) {
            addCriterion("osDescription =", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotEqualTo(String value) {
            addCriterion("osDescription <>", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionGreaterThan(String value) {
            addCriterion("osDescription >", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("osDescription >=", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLessThan(String value) {
            addCriterion("osDescription <", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("osDescription <=", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLike(String value) {
            addCriterion("osDescription like", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotLike(String value) {
            addCriterion("osDescription not like", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIn(List<String> values) {
            addCriterion("osDescription in", values, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotIn(List<String> values) {
            addCriterion("osDescription not in", values, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionBetween(String value1, String value2) {
            addCriterion("osDescription between", value1, value2, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotBetween(String value1, String value2) {
            addCriterion("osDescription not between", value1, value2, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOslanguageIsNull() {
            addCriterion("osLanguage is null");
            return (Criteria) this;
        }

        public Criteria andOslanguageIsNotNull() {
            addCriterion("osLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andOslanguageEqualTo(String value) {
            addCriterion("osLanguage =", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotEqualTo(String value) {
            addCriterion("osLanguage <>", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageGreaterThan(String value) {
            addCriterion("osLanguage >", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageGreaterThanOrEqualTo(String value) {
            addCriterion("osLanguage >=", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLessThan(String value) {
            addCriterion("osLanguage <", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLessThanOrEqualTo(String value) {
            addCriterion("osLanguage <=", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLike(String value) {
            addCriterion("osLanguage like", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotLike(String value) {
            addCriterion("osLanguage not like", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageIn(List<String> values) {
            addCriterion("osLanguage in", values, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotIn(List<String> values) {
            addCriterion("osLanguage not in", values, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageBetween(String value1, String value2) {
            addCriterion("osLanguage between", value1, value2, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotBetween(String value1, String value2) {
            addCriterion("osLanguage not between", value1, value2, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNull() {
            addCriterion("osVersion is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNotNull() {
            addCriterion("osVersion is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionEqualTo(String value) {
            addCriterion("osVersion =", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotEqualTo(String value) {
            addCriterion("osVersion <>", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThan(String value) {
            addCriterion("osVersion >", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThanOrEqualTo(String value) {
            addCriterion("osVersion >=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThan(String value) {
            addCriterion("osVersion <", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThanOrEqualTo(String value) {
            addCriterion("osVersion <=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLike(String value) {
            addCriterion("osVersion like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotLike(String value) {
            addCriterion("osVersion not like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionIn(List<String> values) {
            addCriterion("osVersion in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotIn(List<String> values) {
            addCriterion("osVersion not in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionBetween(String value1, String value2) {
            addCriterion("osVersion between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotBetween(String value1, String value2) {
            addCriterion("osVersion not between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsserialIsNull() {
            addCriterion("osSerial is null");
            return (Criteria) this;
        }

        public Criteria andOsserialIsNotNull() {
            addCriterion("osSerial is not null");
            return (Criteria) this;
        }

        public Criteria andOsserialEqualTo(String value) {
            addCriterion("osSerial =", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialNotEqualTo(String value) {
            addCriterion("osSerial <>", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialGreaterThan(String value) {
            addCriterion("osSerial >", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialGreaterThanOrEqualTo(String value) {
            addCriterion("osSerial >=", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialLessThan(String value) {
            addCriterion("osSerial <", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialLessThanOrEqualTo(String value) {
            addCriterion("osSerial <=", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialLike(String value) {
            addCriterion("osSerial like", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialNotLike(String value) {
            addCriterion("osSerial not like", value, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialIn(List<String> values) {
            addCriterion("osSerial in", values, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialNotIn(List<String> values) {
            addCriterion("osSerial not in", values, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialBetween(String value1, String value2) {
            addCriterion("osSerial between", value1, value2, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsserialNotBetween(String value1, String value2) {
            addCriterion("osSerial not between", value1, value2, "osserial");
            return (Criteria) this;
        }

        public Criteria andOsinstallIsNull() {
            addCriterion("osInstall is null");
            return (Criteria) this;
        }

        public Criteria andOsinstallIsNotNull() {
            addCriterion("osInstall is not null");
            return (Criteria) this;
        }

        public Criteria andOsinstallEqualTo(Date value) {
            addCriterion("osInstall =", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallNotEqualTo(Date value) {
            addCriterion("osInstall <>", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallGreaterThan(Date value) {
            addCriterion("osInstall >", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallGreaterThanOrEqualTo(Date value) {
            addCriterion("osInstall >=", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallLessThan(Date value) {
            addCriterion("osInstall <", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallLessThanOrEqualTo(Date value) {
            addCriterion("osInstall <=", value, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallIn(List<Date> values) {
            addCriterion("osInstall in", values, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallNotIn(List<Date> values) {
            addCriterion("osInstall not in", values, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallBetween(Date value1, Date value2) {
            addCriterion("osInstall between", value1, value2, "osinstall");
            return (Criteria) this;
        }

        public Criteria andOsinstallNotBetween(Date value1, Date value2) {
            addCriterion("osInstall not between", value1, value2, "osinstall");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNull() {
            addCriterion("netWork is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNotNull() {
            addCriterion("netWork is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEqualTo(String value) {
            addCriterion("netWork =", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotEqualTo(String value) {
            addCriterion("netWork <>", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThan(String value) {
            addCriterion("netWork >", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("netWork >=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThan(String value) {
            addCriterion("netWork <", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThanOrEqualTo(String value) {
            addCriterion("netWork <=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLike(String value) {
            addCriterion("netWork like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotLike(String value) {
            addCriterion("netWork not like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkIn(List<String> values) {
            addCriterion("netWork in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotIn(List<String> values) {
            addCriterion("netWork not in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkBetween(String value1, String value2) {
            addCriterion("netWork between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotBetween(String value1, String value2) {
            addCriterion("netWork not between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andSafelevelIsNull() {
            addCriterion("safeLevel is null");
            return (Criteria) this;
        }

        public Criteria andSafelevelIsNotNull() {
            addCriterion("safeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSafelevelEqualTo(Integer value) {
            addCriterion("safeLevel =", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotEqualTo(Integer value) {
            addCriterion("safeLevel <>", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelGreaterThan(Integer value) {
            addCriterion("safeLevel >", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("safeLevel >=", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelLessThan(Integer value) {
            addCriterion("safeLevel <", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelLessThanOrEqualTo(Integer value) {
            addCriterion("safeLevel <=", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelIn(List<Integer> values) {
            addCriterion("safeLevel in", values, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotIn(List<Integer> values) {
            addCriterion("safeLevel not in", values, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelBetween(Integer value1, Integer value2) {
            addCriterion("safeLevel between", value1, value2, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("safeLevel not between", value1, value2, "safelevel");
            return (Criteria) this;
        }

        public Criteria andAttacktimeIsNull() {
            addCriterion("attackTime is null");
            return (Criteria) this;
        }

        public Criteria andAttacktimeIsNotNull() {
            addCriterion("attackTime is not null");
            return (Criteria) this;
        }

        public Criteria andAttacktimeEqualTo(Date value) {
            addCriterion("attackTime =", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeNotEqualTo(Date value) {
            addCriterion("attackTime <>", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeGreaterThan(Date value) {
            addCriterion("attackTime >", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attackTime >=", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeLessThan(Date value) {
            addCriterion("attackTime <", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeLessThanOrEqualTo(Date value) {
            addCriterion("attackTime <=", value, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeIn(List<Date> values) {
            addCriterion("attackTime in", values, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeNotIn(List<Date> values) {
            addCriterion("attackTime not in", values, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeBetween(Date value1, Date value2) {
            addCriterion("attackTime between", value1, value2, "attacktime");
            return (Criteria) this;
        }

        public Criteria andAttacktimeNotBetween(Date value1, Date value2) {
            addCriterion("attackTime not between", value1, value2, "attacktime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeIsNull() {
            addCriterion("protectEndTime is null");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeIsNotNull() {
            addCriterion("protectEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeEqualTo(Date value) {
            addCriterion("protectEndTime =", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeNotEqualTo(Date value) {
            addCriterion("protectEndTime <>", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeGreaterThan(Date value) {
            addCriterion("protectEndTime >", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("protectEndTime >=", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeLessThan(Date value) {
            addCriterion("protectEndTime <", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeLessThanOrEqualTo(Date value) {
            addCriterion("protectEndTime <=", value, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeIn(List<Date> values) {
            addCriterion("protectEndTime in", values, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeNotIn(List<Date> values) {
            addCriterion("protectEndTime not in", values, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeBetween(Date value1, Date value2) {
            addCriterion("protectEndTime between", value1, value2, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andProtectendtimeNotBetween(Date value1, Date value2) {
            addCriterion("protectEndTime not between", value1, value2, "protectendtime");
            return (Criteria) this;
        }

        public Criteria andNetisolationIsNull() {
            addCriterion("netIsolation is null");
            return (Criteria) this;
        }

        public Criteria andNetisolationIsNotNull() {
            addCriterion("netIsolation is not null");
            return (Criteria) this;
        }

        public Criteria andNetisolationEqualTo(Integer value) {
            addCriterion("netIsolation =", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationNotEqualTo(Integer value) {
            addCriterion("netIsolation <>", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationGreaterThan(Integer value) {
            addCriterion("netIsolation >", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationGreaterThanOrEqualTo(Integer value) {
            addCriterion("netIsolation >=", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationLessThan(Integer value) {
            addCriterion("netIsolation <", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationLessThanOrEqualTo(Integer value) {
            addCriterion("netIsolation <=", value, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationIn(List<Integer> values) {
            addCriterion("netIsolation in", values, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationNotIn(List<Integer> values) {
            addCriterion("netIsolation not in", values, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationBetween(Integer value1, Integer value2) {
            addCriterion("netIsolation between", value1, value2, "netisolation");
            return (Criteria) this;
        }

        public Criteria andNetisolationNotBetween(Integer value1, Integer value2) {
            addCriterion("netIsolation not between", value1, value2, "netisolation");
            return (Criteria) this;
        }

        public Criteria andHealthscoreIsNull() {
            addCriterion("healthScore is null");
            return (Criteria) this;
        }

        public Criteria andHealthscoreIsNotNull() {
            addCriterion("healthScore is not null");
            return (Criteria) this;
        }

        public Criteria andHealthscoreEqualTo(Integer value) {
            addCriterion("healthScore =", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreNotEqualTo(Integer value) {
            addCriterion("healthScore <>", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreGreaterThan(Integer value) {
            addCriterion("healthScore >", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthScore >=", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreLessThan(Integer value) {
            addCriterion("healthScore <", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreLessThanOrEqualTo(Integer value) {
            addCriterion("healthScore <=", value, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreIn(List<Integer> values) {
            addCriterion("healthScore in", values, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreNotIn(List<Integer> values) {
            addCriterion("healthScore not in", values, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreBetween(Integer value1, Integer value2) {
            addCriterion("healthScore between", value1, value2, "healthscore");
            return (Criteria) this;
        }

        public Criteria andHealthscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("healthScore not between", value1, value2, "healthscore");
            return (Criteria) this;
        }

        public Criteria andDevonlyidIsNull() {
            addCriterion("devOnlyId is null");
            return (Criteria) this;
        }

        public Criteria andDevonlyidIsNotNull() {
            addCriterion("devOnlyId is not null");
            return (Criteria) this;
        }

        public Criteria andDevonlyidEqualTo(String value) {
            addCriterion("devOnlyId =", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotEqualTo(String value) {
            addCriterion("devOnlyId <>", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidGreaterThan(String value) {
            addCriterion("devOnlyId >", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidGreaterThanOrEqualTo(String value) {
            addCriterion("devOnlyId >=", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLessThan(String value) {
            addCriterion("devOnlyId <", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLessThanOrEqualTo(String value) {
            addCriterion("devOnlyId <=", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLike(String value) {
            addCriterion("devOnlyId like", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotLike(String value) {
            addCriterion("devOnlyId not like", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidIn(List<String> values) {
            addCriterion("devOnlyId in", values, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotIn(List<String> values) {
            addCriterion("devOnlyId not in", values, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidBetween(String value1, String value2) {
            addCriterion("devOnlyId between", value1, value2, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotBetween(String value1, String value2) {
            addCriterion("devOnlyId not between", value1, value2, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andMlevelIsNull() {
            addCriterion("mlevel is null");
            return (Criteria) this;
        }

        public Criteria andMlevelIsNotNull() {
            addCriterion("mlevel is not null");
            return (Criteria) this;
        }

        public Criteria andMlevelEqualTo(Integer value) {
            addCriterion("mlevel =", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotEqualTo(Integer value) {
            addCriterion("mlevel <>", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelGreaterThan(Integer value) {
            addCriterion("mlevel >", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("mlevel >=", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelLessThan(Integer value) {
            addCriterion("mlevel <", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelLessThanOrEqualTo(Integer value) {
            addCriterion("mlevel <=", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelIn(List<Integer> values) {
            addCriterion("mlevel in", values, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotIn(List<Integer> values) {
            addCriterion("mlevel not in", values, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelBetween(Integer value1, Integer value2) {
            addCriterion("mlevel between", value1, value2, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("mlevel not between", value1, value2, "mlevel");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andFloornumberIsNull() {
            addCriterion("floorNumber is null");
            return (Criteria) this;
        }

        public Criteria andFloornumberIsNotNull() {
            addCriterion("floorNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFloornumberEqualTo(String value) {
            addCriterion("floorNumber =", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotEqualTo(String value) {
            addCriterion("floorNumber <>", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberGreaterThan(String value) {
            addCriterion("floorNumber >", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberGreaterThanOrEqualTo(String value) {
            addCriterion("floorNumber >=", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberLessThan(String value) {
            addCriterion("floorNumber <", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberLessThanOrEqualTo(String value) {
            addCriterion("floorNumber <=", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberLike(String value) {
            addCriterion("floorNumber like", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotLike(String value) {
            addCriterion("floorNumber not like", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberIn(List<String> values) {
            addCriterion("floorNumber in", values, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotIn(List<String> values) {
            addCriterion("floorNumber not in", values, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberBetween(String value1, String value2) {
            addCriterion("floorNumber between", value1, value2, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotBetween(String value1, String value2) {
            addCriterion("floorNumber not between", value1, value2, "floornumber");
            return (Criteria) this;
        }

        public Criteria andOfficenameIsNull() {
            addCriterion("officeName is null");
            return (Criteria) this;
        }

        public Criteria andOfficenameIsNotNull() {
            addCriterion("officeName is not null");
            return (Criteria) this;
        }

        public Criteria andOfficenameEqualTo(String value) {
            addCriterion("officeName =", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameNotEqualTo(String value) {
            addCriterion("officeName <>", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameGreaterThan(String value) {
            addCriterion("officeName >", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameGreaterThanOrEqualTo(String value) {
            addCriterion("officeName >=", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameLessThan(String value) {
            addCriterion("officeName <", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameLessThanOrEqualTo(String value) {
            addCriterion("officeName <=", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameLike(String value) {
            addCriterion("officeName like", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameNotLike(String value) {
            addCriterion("officeName not like", value, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameIn(List<String> values) {
            addCriterion("officeName in", values, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameNotIn(List<String> values) {
            addCriterion("officeName not in", values, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameBetween(String value1, String value2) {
            addCriterion("officeName between", value1, value2, "officename");
            return (Criteria) this;
        }

        public Criteria andOfficenameNotBetween(String value1, String value2) {
            addCriterion("officeName not between", value1, value2, "officename");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNull() {
            addCriterion("roomNumber is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNotNull() {
            addCriterion("roomNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberEqualTo(String value) {
            addCriterion("roomNumber =", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotEqualTo(String value) {
            addCriterion("roomNumber <>", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThan(String value) {
            addCriterion("roomNumber >", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThanOrEqualTo(String value) {
            addCriterion("roomNumber >=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThan(String value) {
            addCriterion("roomNumber <", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThanOrEqualTo(String value) {
            addCriterion("roomNumber <=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLike(String value) {
            addCriterion("roomNumber like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotLike(String value) {
            addCriterion("roomNumber not like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIn(List<String> values) {
            addCriterion("roomNumber in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotIn(List<String> values) {
            addCriterion("roomNumber not in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberBetween(String value1, String value2) {
            addCriterion("roomNumber between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotBetween(String value1, String value2) {
            addCriterion("roomNumber not between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andSubofficeIsNull() {
            addCriterion("subOffice is null");
            return (Criteria) this;
        }

        public Criteria andSubofficeIsNotNull() {
            addCriterion("subOffice is not null");
            return (Criteria) this;
        }

        public Criteria andSubofficeEqualTo(String value) {
            addCriterion("subOffice =", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeNotEqualTo(String value) {
            addCriterion("subOffice <>", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeGreaterThan(String value) {
            addCriterion("subOffice >", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeGreaterThanOrEqualTo(String value) {
            addCriterion("subOffice >=", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeLessThan(String value) {
            addCriterion("subOffice <", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeLessThanOrEqualTo(String value) {
            addCriterion("subOffice <=", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeLike(String value) {
            addCriterion("subOffice like", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeNotLike(String value) {
            addCriterion("subOffice not like", value, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeIn(List<String> values) {
            addCriterion("subOffice in", values, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeNotIn(List<String> values) {
            addCriterion("subOffice not in", values, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeBetween(String value1, String value2) {
            addCriterion("subOffice between", value1, value2, "suboffice");
            return (Criteria) this;
        }

        public Criteria andSubofficeNotBetween(String value1, String value2) {
            addCriterion("subOffice not between", value1, value2, "suboffice");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDomainnameIsNull() {
            addCriterion("domainName is null");
            return (Criteria) this;
        }

        public Criteria andDomainnameIsNotNull() {
            addCriterion("domainName is not null");
            return (Criteria) this;
        }

        public Criteria andDomainnameEqualTo(String value) {
            addCriterion("domainName =", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotEqualTo(String value) {
            addCriterion("domainName <>", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameGreaterThan(String value) {
            addCriterion("domainName >", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameGreaterThanOrEqualTo(String value) {
            addCriterion("domainName >=", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLessThan(String value) {
            addCriterion("domainName <", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLessThanOrEqualTo(String value) {
            addCriterion("domainName <=", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLike(String value) {
            addCriterion("domainName like", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotLike(String value) {
            addCriterion("domainName not like", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameIn(List<String> values) {
            addCriterion("domainName in", values, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotIn(List<String> values) {
            addCriterion("domainName not in", values, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameBetween(String value1, String value2) {
            addCriterion("domainName between", value1, value2, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotBetween(String value1, String value2) {
            addCriterion("domainName not between", value1, value2, "domainname");
            return (Criteria) this;
        }

        public Criteria andMigrateregipIsNull() {
            addCriterion("migrateRegIP is null");
            return (Criteria) this;
        }

        public Criteria andMigrateregipIsNotNull() {
            addCriterion("migrateRegIP is not null");
            return (Criteria) this;
        }

        public Criteria andMigrateregipEqualTo(String value) {
            addCriterion("migrateRegIP =", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipNotEqualTo(String value) {
            addCriterion("migrateRegIP <>", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipGreaterThan(String value) {
            addCriterion("migrateRegIP >", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipGreaterThanOrEqualTo(String value) {
            addCriterion("migrateRegIP >=", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipLessThan(String value) {
            addCriterion("migrateRegIP <", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipLessThanOrEqualTo(String value) {
            addCriterion("migrateRegIP <=", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipLike(String value) {
            addCriterion("migrateRegIP like", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipNotLike(String value) {
            addCriterion("migrateRegIP not like", value, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipIn(List<String> values) {
            addCriterion("migrateRegIP in", values, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipNotIn(List<String> values) {
            addCriterion("migrateRegIP not in", values, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipBetween(String value1, String value2) {
            addCriterion("migrateRegIP between", value1, value2, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateregipNotBetween(String value1, String value2) {
            addCriterion("migrateRegIP not between", value1, value2, "migrateregip");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameIsNull() {
            addCriterion("migrateUnitName is null");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameIsNotNull() {
            addCriterion("migrateUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameEqualTo(String value) {
            addCriterion("migrateUnitName =", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameNotEqualTo(String value) {
            addCriterion("migrateUnitName <>", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameGreaterThan(String value) {
            addCriterion("migrateUnitName >", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("migrateUnitName >=", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameLessThan(String value) {
            addCriterion("migrateUnitName <", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameLessThanOrEqualTo(String value) {
            addCriterion("migrateUnitName <=", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameLike(String value) {
            addCriterion("migrateUnitName like", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameNotLike(String value) {
            addCriterion("migrateUnitName not like", value, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameIn(List<String> values) {
            addCriterion("migrateUnitName in", values, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameNotIn(List<String> values) {
            addCriterion("migrateUnitName not in", values, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameBetween(String value1, String value2) {
            addCriterion("migrateUnitName between", value1, value2, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigrateunitnameNotBetween(String value1, String value2) {
            addCriterion("migrateUnitName not between", value1, value2, "migrateunitname");
            return (Criteria) this;
        }

        public Criteria andMigratetimeIsNull() {
            addCriterion("migrateTime is null");
            return (Criteria) this;
        }

        public Criteria andMigratetimeIsNotNull() {
            addCriterion("migrateTime is not null");
            return (Criteria) this;
        }

        public Criteria andMigratetimeEqualTo(Date value) {
            addCriterion("migrateTime =", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeNotEqualTo(Date value) {
            addCriterion("migrateTime <>", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeGreaterThan(Date value) {
            addCriterion("migrateTime >", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("migrateTime >=", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeLessThan(Date value) {
            addCriterion("migrateTime <", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeLessThanOrEqualTo(Date value) {
            addCriterion("migrateTime <=", value, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeIn(List<Date> values) {
            addCriterion("migrateTime in", values, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeNotIn(List<Date> values) {
            addCriterion("migrateTime not in", values, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeBetween(Date value1, Date value2) {
            addCriterion("migrateTime between", value1, value2, "migratetime");
            return (Criteria) this;
        }

        public Criteria andMigratetimeNotBetween(Date value1, Date value2) {
            addCriterion("migrateTime not between", value1, value2, "migratetime");
            return (Criteria) this;
        }

        public Criteria andRoomserialIsNull() {
            addCriterion("roomSerial is null");
            return (Criteria) this;
        }

        public Criteria andRoomserialIsNotNull() {
            addCriterion("roomSerial is not null");
            return (Criteria) this;
        }

        public Criteria andRoomserialEqualTo(String value) {
            addCriterion("roomSerial =", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialNotEqualTo(String value) {
            addCriterion("roomSerial <>", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialGreaterThan(String value) {
            addCriterion("roomSerial >", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialGreaterThanOrEqualTo(String value) {
            addCriterion("roomSerial >=", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialLessThan(String value) {
            addCriterion("roomSerial <", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialLessThanOrEqualTo(String value) {
            addCriterion("roomSerial <=", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialLike(String value) {
            addCriterion("roomSerial like", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialNotLike(String value) {
            addCriterion("roomSerial not like", value, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialIn(List<String> values) {
            addCriterion("roomSerial in", values, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialNotIn(List<String> values) {
            addCriterion("roomSerial not in", values, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialBetween(String value1, String value2) {
            addCriterion("roomSerial between", value1, value2, "roomserial");
            return (Criteria) this;
        }

        public Criteria andRoomserialNotBetween(String value1, String value2) {
            addCriterion("roomSerial not between", value1, value2, "roomserial");
            return (Criteria) this;
        }

        public Criteria andPkiidIsNull() {
            addCriterion("pkiId is null");
            return (Criteria) this;
        }

        public Criteria andPkiidIsNotNull() {
            addCriterion("pkiId is not null");
            return (Criteria) this;
        }

        public Criteria andPkiidEqualTo(String value) {
            addCriterion("pkiId =", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidNotEqualTo(String value) {
            addCriterion("pkiId <>", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidGreaterThan(String value) {
            addCriterion("pkiId >", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidGreaterThanOrEqualTo(String value) {
            addCriterion("pkiId >=", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidLessThan(String value) {
            addCriterion("pkiId <", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidLessThanOrEqualTo(String value) {
            addCriterion("pkiId <=", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidLike(String value) {
            addCriterion("pkiId like", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidNotLike(String value) {
            addCriterion("pkiId not like", value, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidIn(List<String> values) {
            addCriterion("pkiId in", values, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidNotIn(List<String> values) {
            addCriterion("pkiId not in", values, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidBetween(String value1, String value2) {
            addCriterion("pkiId between", value1, value2, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkiidNotBetween(String value1, String value2) {
            addCriterion("pkiId not between", value1, value2, "pkiid");
            return (Criteria) this;
        }

        public Criteria andPkinameIsNull() {
            addCriterion("pkiName is null");
            return (Criteria) this;
        }

        public Criteria andPkinameIsNotNull() {
            addCriterion("pkiName is not null");
            return (Criteria) this;
        }

        public Criteria andPkinameEqualTo(String value) {
            addCriterion("pkiName =", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameNotEqualTo(String value) {
            addCriterion("pkiName <>", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameGreaterThan(String value) {
            addCriterion("pkiName >", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameGreaterThanOrEqualTo(String value) {
            addCriterion("pkiName >=", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameLessThan(String value) {
            addCriterion("pkiName <", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameLessThanOrEqualTo(String value) {
            addCriterion("pkiName <=", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameLike(String value) {
            addCriterion("pkiName like", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameNotLike(String value) {
            addCriterion("pkiName not like", value, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameIn(List<String> values) {
            addCriterion("pkiName in", values, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameNotIn(List<String> values) {
            addCriterion("pkiName not in", values, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameBetween(String value1, String value2) {
            addCriterion("pkiName between", value1, value2, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkinameNotBetween(String value1, String value2) {
            addCriterion("pkiName not between", value1, value2, "pkiname");
            return (Criteria) this;
        }

        public Criteria andPkiunitIsNull() {
            addCriterion("pkiUnit is null");
            return (Criteria) this;
        }

        public Criteria andPkiunitIsNotNull() {
            addCriterion("pkiUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPkiunitEqualTo(String value) {
            addCriterion("pkiUnit =", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitNotEqualTo(String value) {
            addCriterion("pkiUnit <>", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitGreaterThan(String value) {
            addCriterion("pkiUnit >", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitGreaterThanOrEqualTo(String value) {
            addCriterion("pkiUnit >=", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitLessThan(String value) {
            addCriterion("pkiUnit <", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitLessThanOrEqualTo(String value) {
            addCriterion("pkiUnit <=", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitLike(String value) {
            addCriterion("pkiUnit like", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitNotLike(String value) {
            addCriterion("pkiUnit not like", value, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitIn(List<String> values) {
            addCriterion("pkiUnit in", values, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitNotIn(List<String> values) {
            addCriterion("pkiUnit not in", values, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitBetween(String value1, String value2) {
            addCriterion("pkiUnit between", value1, value2, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andPkiunitNotBetween(String value1, String value2) {
            addCriterion("pkiUnit not between", value1, value2, "pkiunit");
            return (Criteria) this;
        }

        public Criteria andAclctrlIsNull() {
            addCriterion("aclCtrl is null");
            return (Criteria) this;
        }

        public Criteria andAclctrlIsNotNull() {
            addCriterion("aclCtrl is not null");
            return (Criteria) this;
        }

        public Criteria andAclctrlEqualTo(String value) {
            addCriterion("aclCtrl =", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlNotEqualTo(String value) {
            addCriterion("aclCtrl <>", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlGreaterThan(String value) {
            addCriterion("aclCtrl >", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlGreaterThanOrEqualTo(String value) {
            addCriterion("aclCtrl >=", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlLessThan(String value) {
            addCriterion("aclCtrl <", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlLessThanOrEqualTo(String value) {
            addCriterion("aclCtrl <=", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlLike(String value) {
            addCriterion("aclCtrl like", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlNotLike(String value) {
            addCriterion("aclCtrl not like", value, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlIn(List<String> values) {
            addCriterion("aclCtrl in", values, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlNotIn(List<String> values) {
            addCriterion("aclCtrl not in", values, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlBetween(String value1, String value2) {
            addCriterion("aclCtrl between", value1, value2, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andAclctrlNotBetween(String value1, String value2) {
            addCriterion("aclCtrl not between", value1, value2, "aclctrl");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindIsNull() {
            addCriterion("policemenKind is null");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindIsNotNull() {
            addCriterion("policemenKind is not null");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindEqualTo(String value) {
            addCriterion("policemenKind =", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindNotEqualTo(String value) {
            addCriterion("policemenKind <>", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindGreaterThan(String value) {
            addCriterion("policemenKind >", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindGreaterThanOrEqualTo(String value) {
            addCriterion("policemenKind >=", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindLessThan(String value) {
            addCriterion("policemenKind <", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindLessThanOrEqualTo(String value) {
            addCriterion("policemenKind <=", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindLike(String value) {
            addCriterion("policemenKind like", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindNotLike(String value) {
            addCriterion("policemenKind not like", value, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindIn(List<String> values) {
            addCriterion("policemenKind in", values, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindNotIn(List<String> values) {
            addCriterion("policemenKind not in", values, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindBetween(String value1, String value2) {
            addCriterion("policemenKind between", value1, value2, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andPolicemenkindNotBetween(String value1, String value2) {
            addCriterion("policemenKind not between", value1, value2, "policemenkind");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("userCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("userCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("userCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("userCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("userCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("userCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("userCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("userCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("userCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("userCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("userCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("userCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNull() {
            addCriterion("deviceCode is null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNotNull() {
            addCriterion("deviceCode is not null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeEqualTo(String value) {
            addCriterion("deviceCode =", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotEqualTo(String value) {
            addCriterion("deviceCode <>", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThan(String value) {
            addCriterion("deviceCode >", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("deviceCode >=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThan(String value) {
            addCriterion("deviceCode <", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThanOrEqualTo(String value) {
            addCriterion("deviceCode <=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLike(String value) {
            addCriterion("deviceCode like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotLike(String value) {
            addCriterion("deviceCode not like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIn(List<String> values) {
            addCriterion("deviceCode in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotIn(List<String> values) {
            addCriterion("deviceCode not in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeBetween(String value1, String value2) {
            addCriterion("deviceCode between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotBetween(String value1, String value2) {
            addCriterion("deviceCode not between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andVmclientipIsNull() {
            addCriterion("vmClientIp is null");
            return (Criteria) this;
        }

        public Criteria andVmclientipIsNotNull() {
            addCriterion("vmClientIp is not null");
            return (Criteria) this;
        }

        public Criteria andVmclientipEqualTo(String value) {
            addCriterion("vmClientIp =", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipNotEqualTo(String value) {
            addCriterion("vmClientIp <>", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipGreaterThan(String value) {
            addCriterion("vmClientIp >", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipGreaterThanOrEqualTo(String value) {
            addCriterion("vmClientIp >=", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipLessThan(String value) {
            addCriterion("vmClientIp <", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipLessThanOrEqualTo(String value) {
            addCriterion("vmClientIp <=", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipLike(String value) {
            addCriterion("vmClientIp like", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipNotLike(String value) {
            addCriterion("vmClientIp not like", value, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipIn(List<String> values) {
            addCriterion("vmClientIp in", values, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipNotIn(List<String> values) {
            addCriterion("vmClientIp not in", values, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipBetween(String value1, String value2) {
            addCriterion("vmClientIp between", value1, value2, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientipNotBetween(String value1, String value2) {
            addCriterion("vmClientIp not between", value1, value2, "vmclientip");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeIsNull() {
            addCriterion("vmClientIPType is null");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeIsNotNull() {
            addCriterion("vmClientIPType is not null");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeEqualTo(Integer value) {
            addCriterion("vmClientIPType =", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeNotEqualTo(Integer value) {
            addCriterion("vmClientIPType <>", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeGreaterThan(Integer value) {
            addCriterion("vmClientIPType >", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vmClientIPType >=", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeLessThan(Integer value) {
            addCriterion("vmClientIPType <", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeLessThanOrEqualTo(Integer value) {
            addCriterion("vmClientIPType <=", value, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeIn(List<Integer> values) {
            addCriterion("vmClientIPType in", values, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeNotIn(List<Integer> values) {
            addCriterion("vmClientIPType not in", values, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeBetween(Integer value1, Integer value2) {
            addCriterion("vmClientIPType between", value1, value2, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientiptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vmClientIPType not between", value1, value2, "vmclientiptype");
            return (Criteria) this;
        }

        public Criteria andVmclientmacIsNull() {
            addCriterion("vmClientMac is null");
            return (Criteria) this;
        }

        public Criteria andVmclientmacIsNotNull() {
            addCriterion("vmClientMac is not null");
            return (Criteria) this;
        }

        public Criteria andVmclientmacEqualTo(String value) {
            addCriterion("vmClientMac =", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacNotEqualTo(String value) {
            addCriterion("vmClientMac <>", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacGreaterThan(String value) {
            addCriterion("vmClientMac >", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacGreaterThanOrEqualTo(String value) {
            addCriterion("vmClientMac >=", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacLessThan(String value) {
            addCriterion("vmClientMac <", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacLessThanOrEqualTo(String value) {
            addCriterion("vmClientMac <=", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacLike(String value) {
            addCriterion("vmClientMac like", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacNotLike(String value) {
            addCriterion("vmClientMac not like", value, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacIn(List<String> values) {
            addCriterion("vmClientMac in", values, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacNotIn(List<String> values) {
            addCriterion("vmClientMac not in", values, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacBetween(String value1, String value2) {
            addCriterion("vmClientMac between", value1, value2, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmclientmacNotBetween(String value1, String value2) {
            addCriterion("vmClientMac not between", value1, value2, "vmclientmac");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameIsNull() {
            addCriterion("vmCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameIsNotNull() {
            addCriterion("vmCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameEqualTo(String value) {
            addCriterion("vmCompanyName =", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameNotEqualTo(String value) {
            addCriterion("vmCompanyName <>", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameGreaterThan(String value) {
            addCriterion("vmCompanyName >", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("vmCompanyName >=", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameLessThan(String value) {
            addCriterion("vmCompanyName <", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameLessThanOrEqualTo(String value) {
            addCriterion("vmCompanyName <=", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameLike(String value) {
            addCriterion("vmCompanyName like", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameNotLike(String value) {
            addCriterion("vmCompanyName not like", value, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameIn(List<String> values) {
            addCriterion("vmCompanyName in", values, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameNotIn(List<String> values) {
            addCriterion("vmCompanyName not in", values, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameBetween(String value1, String value2) {
            addCriterion("vmCompanyName between", value1, value2, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmcompanynameNotBetween(String value1, String value2) {
            addCriterion("vmCompanyName not between", value1, value2, "vmcompanyname");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoIsNull() {
            addCriterion("vmClientDetailInfo is null");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoIsNotNull() {
            addCriterion("vmClientDetailInfo is not null");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoEqualTo(String value) {
            addCriterion("vmClientDetailInfo =", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoNotEqualTo(String value) {
            addCriterion("vmClientDetailInfo <>", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoGreaterThan(String value) {
            addCriterion("vmClientDetailInfo >", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoGreaterThanOrEqualTo(String value) {
            addCriterion("vmClientDetailInfo >=", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoLessThan(String value) {
            addCriterion("vmClientDetailInfo <", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoLessThanOrEqualTo(String value) {
            addCriterion("vmClientDetailInfo <=", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoLike(String value) {
            addCriterion("vmClientDetailInfo like", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoNotLike(String value) {
            addCriterion("vmClientDetailInfo not like", value, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoIn(List<String> values) {
            addCriterion("vmClientDetailInfo in", values, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoNotIn(List<String> values) {
            addCriterion("vmClientDetailInfo not in", values, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoBetween(String value1, String value2) {
            addCriterion("vmClientDetailInfo between", value1, value2, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andVmclientdetailinfoNotBetween(String value1, String value2) {
            addCriterion("vmClientDetailInfo not between", value1, value2, "vmclientdetailinfo");
            return (Criteria) this;
        }

        public Criteria andFreesizeIsNull() {
            addCriterion("freesize is null");
            return (Criteria) this;
        }

        public Criteria andFreesizeIsNotNull() {
            addCriterion("freesize is not null");
            return (Criteria) this;
        }

        public Criteria andFreesizeEqualTo(String value) {
            addCriterion("freesize =", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeNotEqualTo(String value) {
            addCriterion("freesize <>", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeGreaterThan(String value) {
            addCriterion("freesize >", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeGreaterThanOrEqualTo(String value) {
            addCriterion("freesize >=", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeLessThan(String value) {
            addCriterion("freesize <", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeLessThanOrEqualTo(String value) {
            addCriterion("freesize <=", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeLike(String value) {
            addCriterion("freesize like", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeNotLike(String value) {
            addCriterion("freesize not like", value, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeIn(List<String> values) {
            addCriterion("freesize in", values, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeNotIn(List<String> values) {
            addCriterion("freesize not in", values, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeBetween(String value1, String value2) {
            addCriterion("freesize between", value1, value2, "freesize");
            return (Criteria) this;
        }

        public Criteria andFreesizeNotBetween(String value1, String value2) {
            addCriterion("freesize not between", value1, value2, "freesize");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}