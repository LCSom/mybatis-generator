package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceNetworkBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceNetworkBeanExample() {
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

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andGateIsNull() {
            addCriterion("gate is null");
            return (Criteria) this;
        }

        public Criteria andGateIsNotNull() {
            addCriterion("gate is not null");
            return (Criteria) this;
        }

        public Criteria andGateEqualTo(String value) {
            addCriterion("gate =", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateNotEqualTo(String value) {
            addCriterion("gate <>", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateGreaterThan(String value) {
            addCriterion("gate >", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateGreaterThanOrEqualTo(String value) {
            addCriterion("gate >=", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateLessThan(String value) {
            addCriterion("gate <", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateLessThanOrEqualTo(String value) {
            addCriterion("gate <=", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateLike(String value) {
            addCriterion("gate like", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateNotLike(String value) {
            addCriterion("gate not like", value, "gate");
            return (Criteria) this;
        }

        public Criteria andGateIn(List<String> values) {
            addCriterion("gate in", values, "gate");
            return (Criteria) this;
        }

        public Criteria andGateNotIn(List<String> values) {
            addCriterion("gate not in", values, "gate");
            return (Criteria) this;
        }

        public Criteria andGateBetween(String value1, String value2) {
            addCriterion("gate between", value1, value2, "gate");
            return (Criteria) this;
        }

        public Criteria andGateNotBetween(String value1, String value2) {
            addCriterion("gate not between", value1, value2, "gate");
            return (Criteria) this;
        }

        public Criteria andGatewaysIsNull() {
            addCriterion("gateways is null");
            return (Criteria) this;
        }

        public Criteria andGatewaysIsNotNull() {
            addCriterion("gateways is not null");
            return (Criteria) this;
        }

        public Criteria andGatewaysEqualTo(String value) {
            addCriterion("gateways =", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysNotEqualTo(String value) {
            addCriterion("gateways <>", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysGreaterThan(String value) {
            addCriterion("gateways >", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysGreaterThanOrEqualTo(String value) {
            addCriterion("gateways >=", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysLessThan(String value) {
            addCriterion("gateways <", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysLessThanOrEqualTo(String value) {
            addCriterion("gateways <=", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysLike(String value) {
            addCriterion("gateways like", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysNotLike(String value) {
            addCriterion("gateways not like", value, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysIn(List<String> values) {
            addCriterion("gateways in", values, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysNotIn(List<String> values) {
            addCriterion("gateways not in", values, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysBetween(String value1, String value2) {
            addCriterion("gateways between", value1, value2, "gateways");
            return (Criteria) this;
        }

        public Criteria andGatewaysNotBetween(String value1, String value2) {
            addCriterion("gateways not between", value1, value2, "gateways");
            return (Criteria) this;
        }

        public Criteria andDnsIsNull() {
            addCriterion("dns is null");
            return (Criteria) this;
        }

        public Criteria andDnsIsNotNull() {
            addCriterion("dns is not null");
            return (Criteria) this;
        }

        public Criteria andDnsEqualTo(String value) {
            addCriterion("dns =", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotEqualTo(String value) {
            addCriterion("dns <>", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThan(String value) {
            addCriterion("dns >", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThanOrEqualTo(String value) {
            addCriterion("dns >=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThan(String value) {
            addCriterion("dns <", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThanOrEqualTo(String value) {
            addCriterion("dns <=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLike(String value) {
            addCriterion("dns like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotLike(String value) {
            addCriterion("dns not like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsIn(List<String> values) {
            addCriterion("dns in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotIn(List<String> values) {
            addCriterion("dns not in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsBetween(String value1, String value2) {
            addCriterion("dns between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotBetween(String value1, String value2) {
            addCriterion("dns not between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andMactypeIsNull() {
            addCriterion("macType is null");
            return (Criteria) this;
        }

        public Criteria andMactypeIsNotNull() {
            addCriterion("macType is not null");
            return (Criteria) this;
        }

        public Criteria andMactypeEqualTo(String value) {
            addCriterion("macType =", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeNotEqualTo(String value) {
            addCriterion("macType <>", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeGreaterThan(String value) {
            addCriterion("macType >", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeGreaterThanOrEqualTo(String value) {
            addCriterion("macType >=", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeLessThan(String value) {
            addCriterion("macType <", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeLessThanOrEqualTo(String value) {
            addCriterion("macType <=", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeLike(String value) {
            addCriterion("macType like", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeNotLike(String value) {
            addCriterion("macType not like", value, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeIn(List<String> values) {
            addCriterion("macType in", values, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeNotIn(List<String> values) {
            addCriterion("macType not in", values, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeBetween(String value1, String value2) {
            addCriterion("macType between", value1, value2, "mactype");
            return (Criteria) this;
        }

        public Criteria andMactypeNotBetween(String value1, String value2) {
            addCriterion("macType not between", value1, value2, "mactype");
            return (Criteria) this;
        }

        public Criteria andNetcardnameIsNull() {
            addCriterion("netCardName is null");
            return (Criteria) this;
        }

        public Criteria andNetcardnameIsNotNull() {
            addCriterion("netCardName is not null");
            return (Criteria) this;
        }

        public Criteria andNetcardnameEqualTo(String value) {
            addCriterion("netCardName =", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameNotEqualTo(String value) {
            addCriterion("netCardName <>", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameGreaterThan(String value) {
            addCriterion("netCardName >", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameGreaterThanOrEqualTo(String value) {
            addCriterion("netCardName >=", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameLessThan(String value) {
            addCriterion("netCardName <", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameLessThanOrEqualTo(String value) {
            addCriterion("netCardName <=", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameLike(String value) {
            addCriterion("netCardName like", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameNotLike(String value) {
            addCriterion("netCardName not like", value, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameIn(List<String> values) {
            addCriterion("netCardName in", values, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameNotIn(List<String> values) {
            addCriterion("netCardName not in", values, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameBetween(String value1, String value2) {
            addCriterion("netCardName between", value1, value2, "netcardname");
            return (Criteria) this;
        }

        public Criteria andNetcardnameNotBetween(String value1, String value2) {
            addCriterion("netCardName not between", value1, value2, "netcardname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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