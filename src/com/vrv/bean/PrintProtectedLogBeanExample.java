package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintProtectedLogBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrintProtectedLogBeanExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgId like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgId not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgName =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgName <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgName >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgName >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgName <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgName <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgName like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgName not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgName in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgName not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgName between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgName not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidIsNull() {
            addCriterion("regUserOnlyId is null");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidIsNotNull() {
            addCriterion("regUserOnlyId is not null");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidEqualTo(String value) {
            addCriterion("regUserOnlyId =", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidNotEqualTo(String value) {
            addCriterion("regUserOnlyId <>", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidGreaterThan(String value) {
            addCriterion("regUserOnlyId >", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidGreaterThanOrEqualTo(String value) {
            addCriterion("regUserOnlyId >=", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidLessThan(String value) {
            addCriterion("regUserOnlyId <", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidLessThanOrEqualTo(String value) {
            addCriterion("regUserOnlyId <=", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidLike(String value) {
            addCriterion("regUserOnlyId like", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidNotLike(String value) {
            addCriterion("regUserOnlyId not like", value, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidIn(List<String> values) {
            addCriterion("regUserOnlyId in", values, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidNotIn(List<String> values) {
            addCriterion("regUserOnlyId not in", values, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidBetween(String value1, String value2) {
            addCriterion("regUserOnlyId between", value1, value2, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseronlyidNotBetween(String value1, String value2) {
            addCriterion("regUserOnlyId not between", value1, value2, "reguseronlyid");
            return (Criteria) this;
        }

        public Criteria andReguseraccountIsNull() {
            addCriterion("regUserAccount is null");
            return (Criteria) this;
        }

        public Criteria andReguseraccountIsNotNull() {
            addCriterion("regUserAccount is not null");
            return (Criteria) this;
        }

        public Criteria andReguseraccountEqualTo(String value) {
            addCriterion("regUserAccount =", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountNotEqualTo(String value) {
            addCriterion("regUserAccount <>", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountGreaterThan(String value) {
            addCriterion("regUserAccount >", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("regUserAccount >=", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountLessThan(String value) {
            addCriterion("regUserAccount <", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountLessThanOrEqualTo(String value) {
            addCriterion("regUserAccount <=", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountLike(String value) {
            addCriterion("regUserAccount like", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountNotLike(String value) {
            addCriterion("regUserAccount not like", value, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountIn(List<String> values) {
            addCriterion("regUserAccount in", values, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountNotIn(List<String> values) {
            addCriterion("regUserAccount not in", values, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountBetween(String value1, String value2) {
            addCriterion("regUserAccount between", value1, value2, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andReguseraccountNotBetween(String value1, String value2) {
            addCriterion("regUserAccount not between", value1, value2, "reguseraccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountIsNull() {
            addCriterion("osLoginAccount is null");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountIsNotNull() {
            addCriterion("osLoginAccount is not null");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountEqualTo(String value) {
            addCriterion("osLoginAccount =", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountNotEqualTo(String value) {
            addCriterion("osLoginAccount <>", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountGreaterThan(String value) {
            addCriterion("osLoginAccount >", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountGreaterThanOrEqualTo(String value) {
            addCriterion("osLoginAccount >=", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountLessThan(String value) {
            addCriterion("osLoginAccount <", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountLessThanOrEqualTo(String value) {
            addCriterion("osLoginAccount <=", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountLike(String value) {
            addCriterion("osLoginAccount like", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountNotLike(String value) {
            addCriterion("osLoginAccount not like", value, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountIn(List<String> values) {
            addCriterion("osLoginAccount in", values, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountNotIn(List<String> values) {
            addCriterion("osLoginAccount not in", values, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountBetween(String value1, String value2) {
            addCriterion("osLoginAccount between", value1, value2, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andOsloginaccountNotBetween(String value1, String value2) {
            addCriterion("osLoginAccount not between", value1, value2, "osloginaccount");
            return (Criteria) this;
        }

        public Criteria andUseronlyidIsNull() {
            addCriterion("userOnlyId is null");
            return (Criteria) this;
        }

        public Criteria andUseronlyidIsNotNull() {
            addCriterion("userOnlyId is not null");
            return (Criteria) this;
        }

        public Criteria andUseronlyidEqualTo(String value) {
            addCriterion("userOnlyId =", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidNotEqualTo(String value) {
            addCriterion("userOnlyId <>", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidGreaterThan(String value) {
            addCriterion("userOnlyId >", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidGreaterThanOrEqualTo(String value) {
            addCriterion("userOnlyId >=", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidLessThan(String value) {
            addCriterion("userOnlyId <", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidLessThanOrEqualTo(String value) {
            addCriterion("userOnlyId <=", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidLike(String value) {
            addCriterion("userOnlyId like", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidNotLike(String value) {
            addCriterion("userOnlyId not like", value, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidIn(List<String> values) {
            addCriterion("userOnlyId in", values, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidNotIn(List<String> values) {
            addCriterion("userOnlyId not in", values, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidBetween(String value1, String value2) {
            addCriterion("userOnlyId between", value1, value2, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseronlyidNotBetween(String value1, String value2) {
            addCriterion("userOnlyId not between", value1, value2, "useronlyid");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNull() {
            addCriterion("userAccount is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNotNull() {
            addCriterion("userAccount is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountEqualTo(String value) {
            addCriterion("userAccount =", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotEqualTo(String value) {
            addCriterion("userAccount <>", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThan(String value) {
            addCriterion("userAccount >", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("userAccount >=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThan(String value) {
            addCriterion("userAccount <", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThanOrEqualTo(String value) {
            addCriterion("userAccount <=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLike(String value) {
            addCriterion("userAccount like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotLike(String value) {
            addCriterion("userAccount not like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountIn(List<String> values) {
            addCriterion("userAccount in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotIn(List<String> values) {
            addCriterion("userAccount not in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountBetween(String value1, String value2) {
            addCriterion("userAccount between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotBetween(String value1, String value2) {
            addCriterion("userAccount not between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andClienttimeIsNull() {
            addCriterion("clientTime is null");
            return (Criteria) this;
        }

        public Criteria andClienttimeIsNotNull() {
            addCriterion("clientTime is not null");
            return (Criteria) this;
        }

        public Criteria andClienttimeEqualTo(Date value) {
            addCriterion("clientTime =", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeNotEqualTo(Date value) {
            addCriterion("clientTime <>", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeGreaterThan(Date value) {
            addCriterion("clientTime >", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clientTime >=", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeLessThan(Date value) {
            addCriterion("clientTime <", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeLessThanOrEqualTo(Date value) {
            addCriterion("clientTime <=", value, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeIn(List<Date> values) {
            addCriterion("clientTime in", values, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeNotIn(List<Date> values) {
            addCriterion("clientTime not in", values, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeBetween(Date value1, Date value2) {
            addCriterion("clientTime between", value1, value2, "clienttime");
            return (Criteria) this;
        }

        public Criteria andClienttimeNotBetween(Date value1, Date value2) {
            addCriterion("clientTime not between", value1, value2, "clienttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("reportTime is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("reportTime is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterion("reportTime =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterion("reportTime <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterion("reportTime >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reportTime >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterion("reportTime <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("reportTime <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterion("reportTime in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterion("reportTime not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterion("reportTime between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("reportTime not between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andPolicyidIsNull() {
            addCriterion("policyId is null");
            return (Criteria) this;
        }

        public Criteria andPolicyidIsNotNull() {
            addCriterion("policyId is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyidEqualTo(String value) {
            addCriterion("policyId =", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotEqualTo(String value) {
            addCriterion("policyId <>", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidGreaterThan(String value) {
            addCriterion("policyId >", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidGreaterThanOrEqualTo(String value) {
            addCriterion("policyId >=", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidLessThan(String value) {
            addCriterion("policyId <", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidLessThanOrEqualTo(String value) {
            addCriterion("policyId <=", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidLike(String value) {
            addCriterion("policyId like", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotLike(String value) {
            addCriterion("policyId not like", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidIn(List<String> values) {
            addCriterion("policyId in", values, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotIn(List<String> values) {
            addCriterion("policyId not in", values, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidBetween(String value1, String value2) {
            addCriterion("policyId between", value1, value2, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotBetween(String value1, String value2) {
            addCriterion("policyId not between", value1, value2, "policyid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("fileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("fileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("fileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("fileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("fileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("fileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("fileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("fileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("fileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("fileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("fileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("fileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("fileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("fileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("fileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("fileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("fileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("fileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("fileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("fileType like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("fileType not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("fileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("fileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("fileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("fileType not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andLogicIsNull() {
            addCriterion("logic is null");
            return (Criteria) this;
        }

        public Criteria andLogicIsNotNull() {
            addCriterion("logic is not null");
            return (Criteria) this;
        }

        public Criteria andLogicEqualTo(Integer value) {
            addCriterion("logic =", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicNotEqualTo(Integer value) {
            addCriterion("logic <>", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicGreaterThan(Integer value) {
            addCriterion("logic >", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic >=", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicLessThan(Integer value) {
            addCriterion("logic <", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicLessThanOrEqualTo(Integer value) {
            addCriterion("logic <=", value, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicIn(List<Integer> values) {
            addCriterion("logic in", values, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicNotIn(List<Integer> values) {
            addCriterion("logic not in", values, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicBetween(Integer value1, Integer value2) {
            addCriterion("logic between", value1, value2, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicNotBetween(Integer value1, Integer value2) {
            addCriterion("logic not between", value1, value2, "logic");
            return (Criteria) this;
        }

        public Criteria andLogicdataIsNull() {
            addCriterion("logicData is null");
            return (Criteria) this;
        }

        public Criteria andLogicdataIsNotNull() {
            addCriterion("logicData is not null");
            return (Criteria) this;
        }

        public Criteria andLogicdataEqualTo(String value) {
            addCriterion("logicData =", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataNotEqualTo(String value) {
            addCriterion("logicData <>", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataGreaterThan(String value) {
            addCriterion("logicData >", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataGreaterThanOrEqualTo(String value) {
            addCriterion("logicData >=", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataLessThan(String value) {
            addCriterion("logicData <", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataLessThanOrEqualTo(String value) {
            addCriterion("logicData <=", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataLike(String value) {
            addCriterion("logicData like", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataNotLike(String value) {
            addCriterion("logicData not like", value, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataIn(List<String> values) {
            addCriterion("logicData in", values, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataNotIn(List<String> values) {
            addCriterion("logicData not in", values, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataBetween(String value1, String value2) {
            addCriterion("logicData between", value1, value2, "logicdata");
            return (Criteria) this;
        }

        public Criteria andLogicdataNotBetween(String value1, String value2) {
            addCriterion("logicData not between", value1, value2, "logicdata");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andPagenumIsNull() {
            addCriterion("pageNum is null");
            return (Criteria) this;
        }

        public Criteria andPagenumIsNotNull() {
            addCriterion("pageNum is not null");
            return (Criteria) this;
        }

        public Criteria andPagenumEqualTo(Integer value) {
            addCriterion("pageNum =", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotEqualTo(Integer value) {
            addCriterion("pageNum <>", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumGreaterThan(Integer value) {
            addCriterion("pageNum >", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageNum >=", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumLessThan(Integer value) {
            addCriterion("pageNum <", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumLessThanOrEqualTo(Integer value) {
            addCriterion("pageNum <=", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumIn(List<Integer> values) {
            addCriterion("pageNum in", values, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotIn(List<Integer> values) {
            addCriterion("pageNum not in", values, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumBetween(Integer value1, Integer value2) {
            addCriterion("pageNum between", value1, value2, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotBetween(Integer value1, Integer value2) {
            addCriterion("pageNum not between", value1, value2, "pagenum");
            return (Criteria) this;
        }

        public Criteria andCopynumIsNull() {
            addCriterion("copyNum is null");
            return (Criteria) this;
        }

        public Criteria andCopynumIsNotNull() {
            addCriterion("copyNum is not null");
            return (Criteria) this;
        }

        public Criteria andCopynumEqualTo(Integer value) {
            addCriterion("copyNum =", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotEqualTo(Integer value) {
            addCriterion("copyNum <>", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumGreaterThan(Integer value) {
            addCriterion("copyNum >", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyNum >=", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumLessThan(Integer value) {
            addCriterion("copyNum <", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumLessThanOrEqualTo(Integer value) {
            addCriterion("copyNum <=", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumIn(List<Integer> values) {
            addCriterion("copyNum in", values, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotIn(List<Integer> values) {
            addCriterion("copyNum not in", values, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumBetween(Integer value1, Integer value2) {
            addCriterion("copyNum between", value1, value2, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotBetween(Integer value1, Integer value2) {
            addCriterion("copyNum not between", value1, value2, "copynum");
            return (Criteria) this;
        }

        public Criteria andPrinternameIsNull() {
            addCriterion("printerNAME is null");
            return (Criteria) this;
        }

        public Criteria andPrinternameIsNotNull() {
            addCriterion("printerNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrinternameEqualTo(String value) {
            addCriterion("printerNAME =", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotEqualTo(String value) {
            addCriterion("printerNAME <>", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameGreaterThan(String value) {
            addCriterion("printerNAME >", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameGreaterThanOrEqualTo(String value) {
            addCriterion("printerNAME >=", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLessThan(String value) {
            addCriterion("printerNAME <", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLessThanOrEqualTo(String value) {
            addCriterion("printerNAME <=", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLike(String value) {
            addCriterion("printerNAME like", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotLike(String value) {
            addCriterion("printerNAME not like", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameIn(List<String> values) {
            addCriterion("printerNAME in", values, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotIn(List<String> values) {
            addCriterion("printerNAME not in", values, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameBetween(String value1, String value2) {
            addCriterion("printerNAME between", value1, value2, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotBetween(String value1, String value2) {
            addCriterion("printerNAME not between", value1, value2, "printername");
            return (Criteria) this;
        }

        public Criteria andRegusernameIsNull() {
            addCriterion("regUserName is null");
            return (Criteria) this;
        }

        public Criteria andRegusernameIsNotNull() {
            addCriterion("regUserName is not null");
            return (Criteria) this;
        }

        public Criteria andRegusernameEqualTo(String value) {
            addCriterion("regUserName =", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameNotEqualTo(String value) {
            addCriterion("regUserName <>", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameGreaterThan(String value) {
            addCriterion("regUserName >", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameGreaterThanOrEqualTo(String value) {
            addCriterion("regUserName >=", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameLessThan(String value) {
            addCriterion("regUserName <", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameLessThanOrEqualTo(String value) {
            addCriterion("regUserName <=", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameLike(String value) {
            addCriterion("regUserName like", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameNotLike(String value) {
            addCriterion("regUserName not like", value, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameIn(List<String> values) {
            addCriterion("regUserName in", values, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameNotIn(List<String> values) {
            addCriterion("regUserName not in", values, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameBetween(String value1, String value2) {
            addCriterion("regUserName between", value1, value2, "regusername");
            return (Criteria) this;
        }

        public Criteria andRegusernameNotBetween(String value1, String value2) {
            addCriterion("regUserName not between", value1, value2, "regusername");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserorgidIsNull() {
            addCriterion("userOrgId is null");
            return (Criteria) this;
        }

        public Criteria andUserorgidIsNotNull() {
            addCriterion("userOrgId is not null");
            return (Criteria) this;
        }

        public Criteria andUserorgidEqualTo(String value) {
            addCriterion("userOrgId =", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidNotEqualTo(String value) {
            addCriterion("userOrgId <>", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidGreaterThan(String value) {
            addCriterion("userOrgId >", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidGreaterThanOrEqualTo(String value) {
            addCriterion("userOrgId >=", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidLessThan(String value) {
            addCriterion("userOrgId <", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidLessThanOrEqualTo(String value) {
            addCriterion("userOrgId <=", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidLike(String value) {
            addCriterion("userOrgId like", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidNotLike(String value) {
            addCriterion("userOrgId not like", value, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidIn(List<String> values) {
            addCriterion("userOrgId in", values, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidNotIn(List<String> values) {
            addCriterion("userOrgId not in", values, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidBetween(String value1, String value2) {
            addCriterion("userOrgId between", value1, value2, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgidNotBetween(String value1, String value2) {
            addCriterion("userOrgId not between", value1, value2, "userorgid");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiIsNull() {
            addCriterion("userOrgCodeUI is null");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiIsNotNull() {
            addCriterion("userOrgCodeUI is not null");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiEqualTo(String value) {
            addCriterion("userOrgCodeUI =", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiNotEqualTo(String value) {
            addCriterion("userOrgCodeUI <>", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiGreaterThan(String value) {
            addCriterion("userOrgCodeUI >", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiGreaterThanOrEqualTo(String value) {
            addCriterion("userOrgCodeUI >=", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiLessThan(String value) {
            addCriterion("userOrgCodeUI <", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiLessThanOrEqualTo(String value) {
            addCriterion("userOrgCodeUI <=", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiLike(String value) {
            addCriterion("userOrgCodeUI like", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiNotLike(String value) {
            addCriterion("userOrgCodeUI not like", value, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiIn(List<String> values) {
            addCriterion("userOrgCodeUI in", values, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiNotIn(List<String> values) {
            addCriterion("userOrgCodeUI not in", values, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiBetween(String value1, String value2) {
            addCriterion("userOrgCodeUI between", value1, value2, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andUserorgcodeuiNotBetween(String value1, String value2) {
            addCriterion("userOrgCodeUI not between", value1, value2, "userorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiIsNull() {
            addCriterion("devOrgCodeUI is null");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiIsNotNull() {
            addCriterion("devOrgCodeUI is not null");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiEqualTo(String value) {
            addCriterion("devOrgCodeUI =", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiNotEqualTo(String value) {
            addCriterion("devOrgCodeUI <>", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiGreaterThan(String value) {
            addCriterion("devOrgCodeUI >", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiGreaterThanOrEqualTo(String value) {
            addCriterion("devOrgCodeUI >=", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiLessThan(String value) {
            addCriterion("devOrgCodeUI <", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiLessThanOrEqualTo(String value) {
            addCriterion("devOrgCodeUI <=", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiLike(String value) {
            addCriterion("devOrgCodeUI like", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiNotLike(String value) {
            addCriterion("devOrgCodeUI not like", value, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiIn(List<String> values) {
            addCriterion("devOrgCodeUI in", values, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiNotIn(List<String> values) {
            addCriterion("devOrgCodeUI not in", values, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiBetween(String value1, String value2) {
            addCriterion("devOrgCodeUI between", value1, value2, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgcodeuiNotBetween(String value1, String value2) {
            addCriterion("devOrgCodeUI not between", value1, value2, "devorgcodeui");
            return (Criteria) this;
        }

        public Criteria andDevorgpathIsNull() {
            addCriterion("devOrgPath is null");
            return (Criteria) this;
        }

        public Criteria andDevorgpathIsNotNull() {
            addCriterion("devOrgPath is not null");
            return (Criteria) this;
        }

        public Criteria andDevorgpathEqualTo(String value) {
            addCriterion("devOrgPath =", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathNotEqualTo(String value) {
            addCriterion("devOrgPath <>", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathGreaterThan(String value) {
            addCriterion("devOrgPath >", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathGreaterThanOrEqualTo(String value) {
            addCriterion("devOrgPath >=", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathLessThan(String value) {
            addCriterion("devOrgPath <", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathLessThanOrEqualTo(String value) {
            addCriterion("devOrgPath <=", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathLike(String value) {
            addCriterion("devOrgPath like", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathNotLike(String value) {
            addCriterion("devOrgPath not like", value, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathIn(List<String> values) {
            addCriterion("devOrgPath in", values, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathNotIn(List<String> values) {
            addCriterion("devOrgPath not in", values, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathBetween(String value1, String value2) {
            addCriterion("devOrgPath between", value1, value2, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andDevorgpathNotBetween(String value1, String value2) {
            addCriterion("devOrgPath not between", value1, value2, "devorgpath");
            return (Criteria) this;
        }

        public Criteria andIptypeIsNull() {
            addCriterion("ipType is null");
            return (Criteria) this;
        }

        public Criteria andIptypeIsNotNull() {
            addCriterion("ipType is not null");
            return (Criteria) this;
        }

        public Criteria andIptypeEqualTo(Integer value) {
            addCriterion("ipType =", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeNotEqualTo(Integer value) {
            addCriterion("ipType <>", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeGreaterThan(Integer value) {
            addCriterion("ipType >", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ipType >=", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeLessThan(Integer value) {
            addCriterion("ipType <", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeLessThanOrEqualTo(Integer value) {
            addCriterion("ipType <=", value, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeIn(List<Integer> values) {
            addCriterion("ipType in", values, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeNotIn(List<Integer> values) {
            addCriterion("ipType not in", values, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeBetween(Integer value1, Integer value2) {
            addCriterion("ipType between", value1, value2, "iptype");
            return (Criteria) this;
        }

        public Criteria andIptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ipType not between", value1, value2, "iptype");
            return (Criteria) this;
        }

        public Criteria andHoldnameIsNull() {
            addCriterion("holdName is null");
            return (Criteria) this;
        }

        public Criteria andHoldnameIsNotNull() {
            addCriterion("holdName is not null");
            return (Criteria) this;
        }

        public Criteria andHoldnameEqualTo(String value) {
            addCriterion("holdName =", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameNotEqualTo(String value) {
            addCriterion("holdName <>", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameGreaterThan(String value) {
            addCriterion("holdName >", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameGreaterThanOrEqualTo(String value) {
            addCriterion("holdName >=", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameLessThan(String value) {
            addCriterion("holdName <", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameLessThanOrEqualTo(String value) {
            addCriterion("holdName <=", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameLike(String value) {
            addCriterion("holdName like", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameNotLike(String value) {
            addCriterion("holdName not like", value, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameIn(List<String> values) {
            addCriterion("holdName in", values, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameNotIn(List<String> values) {
            addCriterion("holdName not in", values, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameBetween(String value1, String value2) {
            addCriterion("holdName between", value1, value2, "holdname");
            return (Criteria) this;
        }

        public Criteria andHoldnameNotBetween(String value1, String value2) {
            addCriterion("holdName not between", value1, value2, "holdname");
            return (Criteria) this;
        }

        public Criteria andBreadIsNull() {
            addCriterion("bread is null");
            return (Criteria) this;
        }

        public Criteria andBreadIsNotNull() {
            addCriterion("bread is not null");
            return (Criteria) this;
        }

        public Criteria andBreadEqualTo(Integer value) {
            addCriterion("bread =", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotEqualTo(Integer value) {
            addCriterion("bread <>", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadGreaterThan(Integer value) {
            addCriterion("bread >", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("bread >=", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadLessThan(Integer value) {
            addCriterion("bread <", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadLessThanOrEqualTo(Integer value) {
            addCriterion("bread <=", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadIn(List<Integer> values) {
            addCriterion("bread in", values, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotIn(List<Integer> values) {
            addCriterion("bread not in", values, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadBetween(Integer value1, Integer value2) {
            addCriterion("bread between", value1, value2, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotBetween(Integer value1, Integer value2) {
            addCriterion("bread not between", value1, value2, "bread");
            return (Criteria) this;
        }

        public Criteria andCyripIsNull() {
            addCriterion("cyrip is null");
            return (Criteria) this;
        }

        public Criteria andCyripIsNotNull() {
            addCriterion("cyrip is not null");
            return (Criteria) this;
        }

        public Criteria andCyripEqualTo(String value) {
            addCriterion("cyrip =", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripNotEqualTo(String value) {
            addCriterion("cyrip <>", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripGreaterThan(String value) {
            addCriterion("cyrip >", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripGreaterThanOrEqualTo(String value) {
            addCriterion("cyrip >=", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripLessThan(String value) {
            addCriterion("cyrip <", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripLessThanOrEqualTo(String value) {
            addCriterion("cyrip <=", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripLike(String value) {
            addCriterion("cyrip like", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripNotLike(String value) {
            addCriterion("cyrip not like", value, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripIn(List<String> values) {
            addCriterion("cyrip in", values, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripNotIn(List<String> values) {
            addCriterion("cyrip not in", values, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripBetween(String value1, String value2) {
            addCriterion("cyrip between", value1, value2, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCyripNotBetween(String value1, String value2) {
            addCriterion("cyrip not between", value1, value2, "cyrip");
            return (Criteria) this;
        }

        public Criteria andCurmacIsNull() {
            addCriterion("curmac is null");
            return (Criteria) this;
        }

        public Criteria andCurmacIsNotNull() {
            addCriterion("curmac is not null");
            return (Criteria) this;
        }

        public Criteria andCurmacEqualTo(String value) {
            addCriterion("curmac =", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacNotEqualTo(String value) {
            addCriterion("curmac <>", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacGreaterThan(String value) {
            addCriterion("curmac >", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacGreaterThanOrEqualTo(String value) {
            addCriterion("curmac >=", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacLessThan(String value) {
            addCriterion("curmac <", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacLessThanOrEqualTo(String value) {
            addCriterion("curmac <=", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacLike(String value) {
            addCriterion("curmac like", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacNotLike(String value) {
            addCriterion("curmac not like", value, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacIn(List<String> values) {
            addCriterion("curmac in", values, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacNotIn(List<String> values) {
            addCriterion("curmac not in", values, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacBetween(String value1, String value2) {
            addCriterion("curmac between", value1, value2, "curmac");
            return (Criteria) this;
        }

        public Criteria andCurmacNotBetween(String value1, String value2) {
            addCriterion("curmac not between", value1, value2, "curmac");
            return (Criteria) this;
        }

        public Criteria andOptauditIsNull() {
            addCriterion("optAudit is null");
            return (Criteria) this;
        }

        public Criteria andOptauditIsNotNull() {
            addCriterion("optAudit is not null");
            return (Criteria) this;
        }

        public Criteria andOptauditEqualTo(Integer value) {
            addCriterion("optAudit =", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditNotEqualTo(Integer value) {
            addCriterion("optAudit <>", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditGreaterThan(Integer value) {
            addCriterion("optAudit >", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("optAudit >=", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditLessThan(Integer value) {
            addCriterion("optAudit <", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditLessThanOrEqualTo(Integer value) {
            addCriterion("optAudit <=", value, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditIn(List<Integer> values) {
            addCriterion("optAudit in", values, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditNotIn(List<Integer> values) {
            addCriterion("optAudit not in", values, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditBetween(Integer value1, Integer value2) {
            addCriterion("optAudit between", value1, value2, "optaudit");
            return (Criteria) this;
        }

        public Criteria andOptauditNotBetween(Integer value1, Integer value2) {
            addCriterion("optAudit not between", value1, value2, "optaudit");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupid like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupid not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNull() {
            addCriterion("policyName is null");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNotNull() {
            addCriterion("policyName is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynameEqualTo(String value) {
            addCriterion("policyName =", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotEqualTo(String value) {
            addCriterion("policyName <>", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThan(String value) {
            addCriterion("policyName >", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThanOrEqualTo(String value) {
            addCriterion("policyName >=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThan(String value) {
            addCriterion("policyName <", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThanOrEqualTo(String value) {
            addCriterion("policyName <=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLike(String value) {
            addCriterion("policyName like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotLike(String value) {
            addCriterion("policyName not like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameIn(List<String> values) {
            addCriterion("policyName in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotIn(List<String> values) {
            addCriterion("policyName not in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameBetween(String value1, String value2) {
            addCriterion("policyName between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotBetween(String value1, String value2) {
            addCriterion("policyName not between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andNetstateIsNull() {
            addCriterion("netState is null");
            return (Criteria) this;
        }

        public Criteria andNetstateIsNotNull() {
            addCriterion("netState is not null");
            return (Criteria) this;
        }

        public Criteria andNetstateEqualTo(Integer value) {
            addCriterion("netState =", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotEqualTo(Integer value) {
            addCriterion("netState <>", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateGreaterThan(Integer value) {
            addCriterion("netState >", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("netState >=", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateLessThan(Integer value) {
            addCriterion("netState <", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateLessThanOrEqualTo(Integer value) {
            addCriterion("netState <=", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateIn(List<Integer> values) {
            addCriterion("netState in", values, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotIn(List<Integer> values) {
            addCriterion("netState not in", values, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateBetween(Integer value1, Integer value2) {
            addCriterion("netState between", value1, value2, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotBetween(Integer value1, Integer value2) {
            addCriterion("netState not between", value1, value2, "netstate");
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