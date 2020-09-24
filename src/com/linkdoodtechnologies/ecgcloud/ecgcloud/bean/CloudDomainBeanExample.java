package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CloudDomainBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloudDomainBeanExample() {
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

        public Criteria andCdtIdIsNull() {
            addCriterion("cdt_id is null");
            return (Criteria) this;
        }

        public Criteria andCdtIdIsNotNull() {
            addCriterion("cdt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCdtIdEqualTo(Integer value) {
            addCriterion("cdt_id =", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdNotEqualTo(Integer value) {
            addCriterion("cdt_id <>", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdGreaterThan(Integer value) {
            addCriterion("cdt_id >", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdt_id >=", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdLessThan(Integer value) {
            addCriterion("cdt_id <", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("cdt_id <=", value, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdIn(List<Integer> values) {
            addCriterion("cdt_id in", values, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdNotIn(List<Integer> values) {
            addCriterion("cdt_id not in", values, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdBetween(Integer value1, Integer value2) {
            addCriterion("cdt_id between", value1, value2, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cdt_id not between", value1, value2, "cdtId");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameIsNull() {
            addCriterion("cdt_domain_name is null");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameIsNotNull() {
            addCriterion("cdt_domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameEqualTo(String value) {
            addCriterion("cdt_domain_name =", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameNotEqualTo(String value) {
            addCriterion("cdt_domain_name <>", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameGreaterThan(String value) {
            addCriterion("cdt_domain_name >", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("cdt_domain_name >=", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameLessThan(String value) {
            addCriterion("cdt_domain_name <", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameLessThanOrEqualTo(String value) {
            addCriterion("cdt_domain_name <=", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameLike(String value) {
            addCriterion("cdt_domain_name like", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameNotLike(String value) {
            addCriterion("cdt_domain_name not like", value, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameIn(List<String> values) {
            addCriterion("cdt_domain_name in", values, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameNotIn(List<String> values) {
            addCriterion("cdt_domain_name not in", values, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameBetween(String value1, String value2) {
            addCriterion("cdt_domain_name between", value1, value2, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtDomainNameNotBetween(String value1, String value2) {
            addCriterion("cdt_domain_name not between", value1, value2, "cdtDomainName");
            return (Criteria) this;
        }

        public Criteria andCdtIpIsNull() {
            addCriterion("cdt_ip is null");
            return (Criteria) this;
        }

        public Criteria andCdtIpIsNotNull() {
            addCriterion("cdt_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCdtIpEqualTo(String value) {
            addCriterion("cdt_ip =", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpNotEqualTo(String value) {
            addCriterion("cdt_ip <>", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpGreaterThan(String value) {
            addCriterion("cdt_ip >", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpGreaterThanOrEqualTo(String value) {
            addCriterion("cdt_ip >=", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpLessThan(String value) {
            addCriterion("cdt_ip <", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpLessThanOrEqualTo(String value) {
            addCriterion("cdt_ip <=", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpLike(String value) {
            addCriterion("cdt_ip like", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpNotLike(String value) {
            addCriterion("cdt_ip not like", value, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpIn(List<String> values) {
            addCriterion("cdt_ip in", values, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpNotIn(List<String> values) {
            addCriterion("cdt_ip not in", values, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpBetween(String value1, String value2) {
            addCriterion("cdt_ip between", value1, value2, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtIpNotBetween(String value1, String value2) {
            addCriterion("cdt_ip not between", value1, value2, "cdtIp");
            return (Criteria) this;
        }

        public Criteria andCdtVersionIsNull() {
            addCriterion("cdt_version is null");
            return (Criteria) this;
        }

        public Criteria andCdtVersionIsNotNull() {
            addCriterion("cdt_version is not null");
            return (Criteria) this;
        }

        public Criteria andCdtVersionEqualTo(String value) {
            addCriterion("cdt_version =", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionNotEqualTo(String value) {
            addCriterion("cdt_version <>", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionGreaterThan(String value) {
            addCriterion("cdt_version >", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionGreaterThanOrEqualTo(String value) {
            addCriterion("cdt_version >=", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionLessThan(String value) {
            addCriterion("cdt_version <", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionLessThanOrEqualTo(String value) {
            addCriterion("cdt_version <=", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionLike(String value) {
            addCriterion("cdt_version like", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionNotLike(String value) {
            addCriterion("cdt_version not like", value, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionIn(List<String> values) {
            addCriterion("cdt_version in", values, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionNotIn(List<String> values) {
            addCriterion("cdt_version not in", values, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionBetween(String value1, String value2) {
            addCriterion("cdt_version between", value1, value2, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtVersionNotBetween(String value1, String value2) {
            addCriterion("cdt_version not between", value1, value2, "cdtVersion");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeIsNull() {
            addCriterion("cdt_created_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeIsNotNull() {
            addCriterion("cdt_created_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeEqualTo(Date value) {
            addCriterion("cdt_created_datetime =", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("cdt_created_datetime <>", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeGreaterThan(Date value) {
            addCriterion("cdt_created_datetime >", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cdt_created_datetime >=", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeLessThan(Date value) {
            addCriterion("cdt_created_datetime <", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cdt_created_datetime <=", value, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeIn(List<Date> values) {
            addCriterion("cdt_created_datetime in", values, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("cdt_created_datetime not in", values, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("cdt_created_datetime between", value1, value2, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cdt_created_datetime not between", value1, value2, "cdtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeIsNull() {
            addCriterion("cdt_updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeIsNotNull() {
            addCriterion("cdt_updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeEqualTo(Date value) {
            addCriterion("cdt_updated_datetime =", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("cdt_updated_datetime <>", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("cdt_updated_datetime >", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cdt_updated_datetime >=", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeLessThan(Date value) {
            addCriterion("cdt_updated_datetime <", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cdt_updated_datetime <=", value, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeIn(List<Date> values) {
            addCriterion("cdt_updated_datetime in", values, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("cdt_updated_datetime not in", values, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("cdt_updated_datetime between", value1, value2, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cdt_updated_datetime not between", value1, value2, "cdtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andCdtStatusIsNull() {
            addCriterion("cdt_status is null");
            return (Criteria) this;
        }

        public Criteria andCdtStatusIsNotNull() {
            addCriterion("cdt_status is not null");
            return (Criteria) this;
        }

        public Criteria andCdtStatusEqualTo(Integer value) {
            addCriterion("cdt_status =", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusNotEqualTo(Integer value) {
            addCriterion("cdt_status <>", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusGreaterThan(Integer value) {
            addCriterion("cdt_status >", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdt_status >=", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusLessThan(Integer value) {
            addCriterion("cdt_status <", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cdt_status <=", value, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusIn(List<Integer> values) {
            addCriterion("cdt_status in", values, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusNotIn(List<Integer> values) {
            addCriterion("cdt_status not in", values, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusBetween(Integer value1, Integer value2) {
            addCriterion("cdt_status between", value1, value2, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cdt_status not between", value1, value2, "cdtStatus");
            return (Criteria) this;
        }

        public Criteria andCdtParam1IsNull() {
            addCriterion("cdt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCdtParam1IsNotNull() {
            addCriterion("cdt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCdtParam1EqualTo(String value) {
            addCriterion("cdt_param1 =", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1NotEqualTo(String value) {
            addCriterion("cdt_param1 <>", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1GreaterThan(String value) {
            addCriterion("cdt_param1 >", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("cdt_param1 >=", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1LessThan(String value) {
            addCriterion("cdt_param1 <", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1LessThanOrEqualTo(String value) {
            addCriterion("cdt_param1 <=", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1Like(String value) {
            addCriterion("cdt_param1 like", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1NotLike(String value) {
            addCriterion("cdt_param1 not like", value, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1In(List<String> values) {
            addCriterion("cdt_param1 in", values, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1NotIn(List<String> values) {
            addCriterion("cdt_param1 not in", values, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1Between(String value1, String value2) {
            addCriterion("cdt_param1 between", value1, value2, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam1NotBetween(String value1, String value2) {
            addCriterion("cdt_param1 not between", value1, value2, "cdtParam1");
            return (Criteria) this;
        }

        public Criteria andCdtParam2IsNull() {
            addCriterion("cdt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCdtParam2IsNotNull() {
            addCriterion("cdt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCdtParam2EqualTo(String value) {
            addCriterion("cdt_param2 =", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2NotEqualTo(String value) {
            addCriterion("cdt_param2 <>", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2GreaterThan(String value) {
            addCriterion("cdt_param2 >", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("cdt_param2 >=", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2LessThan(String value) {
            addCriterion("cdt_param2 <", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2LessThanOrEqualTo(String value) {
            addCriterion("cdt_param2 <=", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2Like(String value) {
            addCriterion("cdt_param2 like", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2NotLike(String value) {
            addCriterion("cdt_param2 not like", value, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2In(List<String> values) {
            addCriterion("cdt_param2 in", values, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2NotIn(List<String> values) {
            addCriterion("cdt_param2 not in", values, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2Between(String value1, String value2) {
            addCriterion("cdt_param2 between", value1, value2, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam2NotBetween(String value1, String value2) {
            addCriterion("cdt_param2 not between", value1, value2, "cdtParam2");
            return (Criteria) this;
        }

        public Criteria andCdtParam3IsNull() {
            addCriterion("cdt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCdtParam3IsNotNull() {
            addCriterion("cdt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCdtParam3EqualTo(String value) {
            addCriterion("cdt_param3 =", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3NotEqualTo(String value) {
            addCriterion("cdt_param3 <>", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3GreaterThan(String value) {
            addCriterion("cdt_param3 >", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("cdt_param3 >=", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3LessThan(String value) {
            addCriterion("cdt_param3 <", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3LessThanOrEqualTo(String value) {
            addCriterion("cdt_param3 <=", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3Like(String value) {
            addCriterion("cdt_param3 like", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3NotLike(String value) {
            addCriterion("cdt_param3 not like", value, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3In(List<String> values) {
            addCriterion("cdt_param3 in", values, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3NotIn(List<String> values) {
            addCriterion("cdt_param3 not in", values, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3Between(String value1, String value2) {
            addCriterion("cdt_param3 between", value1, value2, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam3NotBetween(String value1, String value2) {
            addCriterion("cdt_param3 not between", value1, value2, "cdtParam3");
            return (Criteria) this;
        }

        public Criteria andCdtParam4IsNull() {
            addCriterion("cdt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCdtParam4IsNotNull() {
            addCriterion("cdt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCdtParam4EqualTo(String value) {
            addCriterion("cdt_param4 =", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4NotEqualTo(String value) {
            addCriterion("cdt_param4 <>", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4GreaterThan(String value) {
            addCriterion("cdt_param4 >", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("cdt_param4 >=", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4LessThan(String value) {
            addCriterion("cdt_param4 <", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4LessThanOrEqualTo(String value) {
            addCriterion("cdt_param4 <=", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4Like(String value) {
            addCriterion("cdt_param4 like", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4NotLike(String value) {
            addCriterion("cdt_param4 not like", value, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4In(List<String> values) {
            addCriterion("cdt_param4 in", values, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4NotIn(List<String> values) {
            addCriterion("cdt_param4 not in", values, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4Between(String value1, String value2) {
            addCriterion("cdt_param4 between", value1, value2, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam4NotBetween(String value1, String value2) {
            addCriterion("cdt_param4 not between", value1, value2, "cdtParam4");
            return (Criteria) this;
        }

        public Criteria andCdtParam5IsNull() {
            addCriterion("cdt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCdtParam5IsNotNull() {
            addCriterion("cdt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCdtParam5EqualTo(String value) {
            addCriterion("cdt_param5 =", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5NotEqualTo(String value) {
            addCriterion("cdt_param5 <>", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5GreaterThan(String value) {
            addCriterion("cdt_param5 >", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("cdt_param5 >=", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5LessThan(String value) {
            addCriterion("cdt_param5 <", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5LessThanOrEqualTo(String value) {
            addCriterion("cdt_param5 <=", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5Like(String value) {
            addCriterion("cdt_param5 like", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5NotLike(String value) {
            addCriterion("cdt_param5 not like", value, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5In(List<String> values) {
            addCriterion("cdt_param5 in", values, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5NotIn(List<String> values) {
            addCriterion("cdt_param5 not in", values, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5Between(String value1, String value2) {
            addCriterion("cdt_param5 between", value1, value2, "cdtParam5");
            return (Criteria) this;
        }

        public Criteria andCdtParam5NotBetween(String value1, String value2) {
            addCriterion("cdt_param5 not between", value1, value2, "cdtParam5");
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