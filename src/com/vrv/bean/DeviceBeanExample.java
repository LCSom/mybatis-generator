package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceBeanExample() {
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

        public Criteria andIpnumberIsNull() {
            addCriterion("ipNumber is null");
            return (Criteria) this;
        }

        public Criteria andIpnumberIsNotNull() {
            addCriterion("ipNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIpnumberEqualTo(String value) {
            addCriterion("ipNumber =", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberNotEqualTo(String value) {
            addCriterion("ipNumber <>", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberGreaterThan(String value) {
            addCriterion("ipNumber >", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ipNumber >=", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberLessThan(String value) {
            addCriterion("ipNumber <", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberLessThanOrEqualTo(String value) {
            addCriterion("ipNumber <=", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberLike(String value) {
            addCriterion("ipNumber like", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberNotLike(String value) {
            addCriterion("ipNumber not like", value, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberIn(List<String> values) {
            addCriterion("ipNumber in", values, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberNotIn(List<String> values) {
            addCriterion("ipNumber not in", values, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberBetween(String value1, String value2) {
            addCriterion("ipNumber between", value1, value2, "ipnumber");
            return (Criteria) this;
        }

        public Criteria andIpnumberNotBetween(String value1, String value2) {
            addCriterion("ipNumber not between", value1, value2, "ipnumber");
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
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupName not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOsidIsNull() {
            addCriterion("osId is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("osId is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(String value) {
            addCriterion("osId =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(String value) {
            addCriterion("osId <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(String value) {
            addCriterion("osId >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(String value) {
            addCriterion("osId >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(String value) {
            addCriterion("osId <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(String value) {
            addCriterion("osId <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLike(String value) {
            addCriterion("osId like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotLike(String value) {
            addCriterion("osId not like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<String> values) {
            addCriterion("osId in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<String> values) {
            addCriterion("osId not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(String value1, String value2) {
            addCriterion("osId between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(String value1, String value2) {
            addCriterion("osId not between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIsNull() {
            addCriterion("deviceTypeId is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIsNotNull() {
            addCriterion("deviceTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidEqualTo(String value) {
            addCriterion("deviceTypeId =", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotEqualTo(String value) {
            addCriterion("deviceTypeId <>", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidGreaterThan(String value) {
            addCriterion("deviceTypeId >", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceTypeId >=", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidLessThan(String value) {
            addCriterion("deviceTypeId <", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidLessThanOrEqualTo(String value) {
            addCriterion("deviceTypeId <=", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidLike(String value) {
            addCriterion("deviceTypeId like", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotLike(String value) {
            addCriterion("deviceTypeId not like", value, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidIn(List<String> values) {
            addCriterion("deviceTypeId in", values, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotIn(List<String> values) {
            addCriterion("deviceTypeId not in", values, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidBetween(String value1, String value2) {
            addCriterion("deviceTypeId between", value1, value2, "devicetypeid");
            return (Criteria) this;
        }

        public Criteria andDevicetypeidNotBetween(String value1, String value2) {
            addCriterion("deviceTypeId not between", value1, value2, "devicetypeid");
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

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("organizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("organizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("organizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("organizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("organizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("organizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("organizationId like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("organizationId not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("organizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("organizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("organizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("organizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiIsNull() {
            addCriterion("organizationCodeUI is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiIsNotNull() {
            addCriterion("organizationCodeUI is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiEqualTo(String value) {
            addCriterion("organizationCodeUI =", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiNotEqualTo(String value) {
            addCriterion("organizationCodeUI <>", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiGreaterThan(String value) {
            addCriterion("organizationCodeUI >", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiGreaterThanOrEqualTo(String value) {
            addCriterion("organizationCodeUI >=", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiLessThan(String value) {
            addCriterion("organizationCodeUI <", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiLessThanOrEqualTo(String value) {
            addCriterion("organizationCodeUI <=", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiLike(String value) {
            addCriterion("organizationCodeUI like", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiNotLike(String value) {
            addCriterion("organizationCodeUI not like", value, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiIn(List<String> values) {
            addCriterion("organizationCodeUI in", values, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiNotIn(List<String> values) {
            addCriterion("organizationCodeUI not in", values, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiBetween(String value1, String value2) {
            addCriterion("organizationCodeUI between", value1, value2, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeuiNotBetween(String value1, String value2) {
            addCriterion("organizationCodeUI not between", value1, value2, "organizationcodeui");
            return (Criteria) this;
        }

        public Criteria andApprovalidIsNull() {
            addCriterion("approvalId is null");
            return (Criteria) this;
        }

        public Criteria andApprovalidIsNotNull() {
            addCriterion("approvalId is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalidEqualTo(String value) {
            addCriterion("approvalId =", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidNotEqualTo(String value) {
            addCriterion("approvalId <>", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidGreaterThan(String value) {
            addCriterion("approvalId >", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidGreaterThanOrEqualTo(String value) {
            addCriterion("approvalId >=", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidLessThan(String value) {
            addCriterion("approvalId <", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidLessThanOrEqualTo(String value) {
            addCriterion("approvalId <=", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidLike(String value) {
            addCriterion("approvalId like", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidNotLike(String value) {
            addCriterion("approvalId not like", value, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidIn(List<String> values) {
            addCriterion("approvalId in", values, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidNotIn(List<String> values) {
            addCriterion("approvalId not in", values, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidBetween(String value1, String value2) {
            addCriterion("approvalId between", value1, value2, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalidNotBetween(String value1, String value2) {
            addCriterion("approvalId not between", value1, value2, "approvalid");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNull() {
            addCriterion("approvalState is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNotNull() {
            addCriterion("approvalState is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateEqualTo(Integer value) {
            addCriterion("approvalState =", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotEqualTo(Integer value) {
            addCriterion("approvalState <>", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThan(Integer value) {
            addCriterion("approvalState >", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvalState >=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThan(Integer value) {
            addCriterion("approvalState <", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThanOrEqualTo(Integer value) {
            addCriterion("approvalState <=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIn(List<Integer> values) {
            addCriterion("approvalState in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotIn(List<Integer> values) {
            addCriterion("approvalState not in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateBetween(Integer value1, Integer value2) {
            addCriterion("approvalState between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotBetween(Integer value1, Integer value2) {
            addCriterion("approvalState not between", value1, value2, "approvalstate");
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

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("clientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("clientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("clientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("clientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("clientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("clientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("clientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("clientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("clientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("clientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("clientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("clientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("clientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientsignIsNull() {
            addCriterion("clientSign is null");
            return (Criteria) this;
        }

        public Criteria andClientsignIsNotNull() {
            addCriterion("clientSign is not null");
            return (Criteria) this;
        }

        public Criteria andClientsignEqualTo(String value) {
            addCriterion("clientSign =", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignNotEqualTo(String value) {
            addCriterion("clientSign <>", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignGreaterThan(String value) {
            addCriterion("clientSign >", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignGreaterThanOrEqualTo(String value) {
            addCriterion("clientSign >=", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignLessThan(String value) {
            addCriterion("clientSign <", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignLessThanOrEqualTo(String value) {
            addCriterion("clientSign <=", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignLike(String value) {
            addCriterion("clientSign like", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignNotLike(String value) {
            addCriterion("clientSign not like", value, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignIn(List<String> values) {
            addCriterion("clientSign in", values, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignNotIn(List<String> values) {
            addCriterion("clientSign not in", values, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignBetween(String value1, String value2) {
            addCriterion("clientSign between", value1, value2, "clientsign");
            return (Criteria) this;
        }

        public Criteria andClientsignNotBetween(String value1, String value2) {
            addCriterion("clientSign not between", value1, value2, "clientsign");
            return (Criteria) this;
        }

        public Criteria andSoftversionIsNull() {
            addCriterion("softVersion is null");
            return (Criteria) this;
        }

        public Criteria andSoftversionIsNotNull() {
            addCriterion("softVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSoftversionEqualTo(String value) {
            addCriterion("softVersion =", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionNotEqualTo(String value) {
            addCriterion("softVersion <>", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionGreaterThan(String value) {
            addCriterion("softVersion >", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionGreaterThanOrEqualTo(String value) {
            addCriterion("softVersion >=", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionLessThan(String value) {
            addCriterion("softVersion <", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionLessThanOrEqualTo(String value) {
            addCriterion("softVersion <=", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionLike(String value) {
            addCriterion("softVersion like", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionNotLike(String value) {
            addCriterion("softVersion not like", value, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionIn(List<String> values) {
            addCriterion("softVersion in", values, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionNotIn(List<String> values) {
            addCriterion("softVersion not in", values, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionBetween(String value1, String value2) {
            addCriterion("softVersion between", value1, value2, "softversion");
            return (Criteria) this;
        }

        public Criteria andSoftversionNotBetween(String value1, String value2) {
            addCriterion("softVersion not between", value1, value2, "softversion");
            return (Criteria) this;
        }

        public Criteria andClientversionIsNull() {
            addCriterion("clientVersion is null");
            return (Criteria) this;
        }

        public Criteria andClientversionIsNotNull() {
            addCriterion("clientVersion is not null");
            return (Criteria) this;
        }

        public Criteria andClientversionEqualTo(String value) {
            addCriterion("clientVersion =", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotEqualTo(String value) {
            addCriterion("clientVersion <>", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionGreaterThan(String value) {
            addCriterion("clientVersion >", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionGreaterThanOrEqualTo(String value) {
            addCriterion("clientVersion >=", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLessThan(String value) {
            addCriterion("clientVersion <", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLessThanOrEqualTo(String value) {
            addCriterion("clientVersion <=", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLike(String value) {
            addCriterion("clientVersion like", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotLike(String value) {
            addCriterion("clientVersion not like", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionIn(List<String> values) {
            addCriterion("clientVersion in", values, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotIn(List<String> values) {
            addCriterion("clientVersion not in", values, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionBetween(String value1, String value2) {
            addCriterion("clientVersion between", value1, value2, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotBetween(String value1, String value2) {
            addCriterion("clientVersion not between", value1, value2, "clientversion");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeIsNull() {
            addCriterion("unInstallTime is null");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeIsNotNull() {
            addCriterion("unInstallTime is not null");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeEqualTo(Date value) {
            addCriterion("unInstallTime =", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeNotEqualTo(Date value) {
            addCriterion("unInstallTime <>", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeGreaterThan(Date value) {
            addCriterion("unInstallTime >", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unInstallTime >=", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeLessThan(Date value) {
            addCriterion("unInstallTime <", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeLessThanOrEqualTo(Date value) {
            addCriterion("unInstallTime <=", value, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeIn(List<Date> values) {
            addCriterion("unInstallTime in", values, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeNotIn(List<Date> values) {
            addCriterion("unInstallTime not in", values, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeBetween(Date value1, Date value2) {
            addCriterion("unInstallTime between", value1, value2, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andUninstalltimeNotBetween(Date value1, Date value2) {
            addCriterion("unInstallTime not between", value1, value2, "uninstalltime");
            return (Criteria) this;
        }

        public Criteria andSwitchidIsNull() {
            addCriterion("switchId is null");
            return (Criteria) this;
        }

        public Criteria andSwitchidIsNotNull() {
            addCriterion("switchId is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchidEqualTo(String value) {
            addCriterion("switchId =", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidNotEqualTo(String value) {
            addCriterion("switchId <>", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidGreaterThan(String value) {
            addCriterion("switchId >", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidGreaterThanOrEqualTo(String value) {
            addCriterion("switchId >=", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidLessThan(String value) {
            addCriterion("switchId <", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidLessThanOrEqualTo(String value) {
            addCriterion("switchId <=", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidLike(String value) {
            addCriterion("switchId like", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidNotLike(String value) {
            addCriterion("switchId not like", value, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidIn(List<String> values) {
            addCriterion("switchId in", values, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidNotIn(List<String> values) {
            addCriterion("switchId not in", values, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidBetween(String value1, String value2) {
            addCriterion("switchId between", value1, value2, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchidNotBetween(String value1, String value2) {
            addCriterion("switchId not between", value1, value2, "switchid");
            return (Criteria) this;
        }

        public Criteria andSwitchportIsNull() {
            addCriterion("switchPort is null");
            return (Criteria) this;
        }

        public Criteria andSwitchportIsNotNull() {
            addCriterion("switchPort is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchportEqualTo(String value) {
            addCriterion("switchPort =", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportNotEqualTo(String value) {
            addCriterion("switchPort <>", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportGreaterThan(String value) {
            addCriterion("switchPort >", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportGreaterThanOrEqualTo(String value) {
            addCriterion("switchPort >=", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportLessThan(String value) {
            addCriterion("switchPort <", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportLessThanOrEqualTo(String value) {
            addCriterion("switchPort <=", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportLike(String value) {
            addCriterion("switchPort like", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportNotLike(String value) {
            addCriterion("switchPort not like", value, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportIn(List<String> values) {
            addCriterion("switchPort in", values, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportNotIn(List<String> values) {
            addCriterion("switchPort not in", values, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportBetween(String value1, String value2) {
            addCriterion("switchPort between", value1, value2, "switchport");
            return (Criteria) this;
        }

        public Criteria andSwitchportNotBetween(String value1, String value2) {
            addCriterion("switchPort not between", value1, value2, "switchport");
            return (Criteria) this;
        }

        public Criteria andCputypeIsNull() {
            addCriterion("cpuType is null");
            return (Criteria) this;
        }

        public Criteria andCputypeIsNotNull() {
            addCriterion("cpuType is not null");
            return (Criteria) this;
        }

        public Criteria andCputypeEqualTo(String value) {
            addCriterion("cpuType =", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeNotEqualTo(String value) {
            addCriterion("cpuType <>", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeGreaterThan(String value) {
            addCriterion("cpuType >", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeGreaterThanOrEqualTo(String value) {
            addCriterion("cpuType >=", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeLessThan(String value) {
            addCriterion("cpuType <", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeLessThanOrEqualTo(String value) {
            addCriterion("cpuType <=", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeLike(String value) {
            addCriterion("cpuType like", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeNotLike(String value) {
            addCriterion("cpuType not like", value, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeIn(List<String> values) {
            addCriterion("cpuType in", values, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeNotIn(List<String> values) {
            addCriterion("cpuType not in", values, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeBetween(String value1, String value2) {
            addCriterion("cpuType between", value1, value2, "cputype");
            return (Criteria) this;
        }

        public Criteria andCputypeNotBetween(String value1, String value2) {
            addCriterion("cpuType not between", value1, value2, "cputype");
            return (Criteria) this;
        }

        public Criteria andCpuhzIsNull() {
            addCriterion("cpuHz is null");
            return (Criteria) this;
        }

        public Criteria andCpuhzIsNotNull() {
            addCriterion("cpuHz is not null");
            return (Criteria) this;
        }

        public Criteria andCpuhzEqualTo(Double value) {
            addCriterion("cpuHz =", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzNotEqualTo(Double value) {
            addCriterion("cpuHz <>", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzGreaterThan(Double value) {
            addCriterion("cpuHz >", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzGreaterThanOrEqualTo(Double value) {
            addCriterion("cpuHz >=", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzLessThan(Double value) {
            addCriterion("cpuHz <", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzLessThanOrEqualTo(Double value) {
            addCriterion("cpuHz <=", value, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzIn(List<Double> values) {
            addCriterion("cpuHz in", values, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzNotIn(List<Double> values) {
            addCriterion("cpuHz not in", values, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzBetween(Double value1, Double value2) {
            addCriterion("cpuHz between", value1, value2, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andCpuhzNotBetween(Double value1, Double value2) {
            addCriterion("cpuHz not between", value1, value2, "cpuhz");
            return (Criteria) this;
        }

        public Criteria andMemorysizeIsNull() {
            addCriterion("memorySize is null");
            return (Criteria) this;
        }

        public Criteria andMemorysizeIsNotNull() {
            addCriterion("memorySize is not null");
            return (Criteria) this;
        }

        public Criteria andMemorysizeEqualTo(Double value) {
            addCriterion("memorySize =", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeNotEqualTo(Double value) {
            addCriterion("memorySize <>", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeGreaterThan(Double value) {
            addCriterion("memorySize >", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeGreaterThanOrEqualTo(Double value) {
            addCriterion("memorySize >=", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeLessThan(Double value) {
            addCriterion("memorySize <", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeLessThanOrEqualTo(Double value) {
            addCriterion("memorySize <=", value, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeIn(List<Double> values) {
            addCriterion("memorySize in", values, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeNotIn(List<Double> values) {
            addCriterion("memorySize not in", values, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeBetween(Double value1, Double value2) {
            addCriterion("memorySize between", value1, value2, "memorysize");
            return (Criteria) this;
        }

        public Criteria andMemorysizeNotBetween(Double value1, Double value2) {
            addCriterion("memorySize not between", value1, value2, "memorysize");
            return (Criteria) this;
        }

        public Criteria andDiskmodelIsNull() {
            addCriterion("diskModel is null");
            return (Criteria) this;
        }

        public Criteria andDiskmodelIsNotNull() {
            addCriterion("diskModel is not null");
            return (Criteria) this;
        }

        public Criteria andDiskmodelEqualTo(String value) {
            addCriterion("diskModel =", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelNotEqualTo(String value) {
            addCriterion("diskModel <>", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelGreaterThan(String value) {
            addCriterion("diskModel >", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelGreaterThanOrEqualTo(String value) {
            addCriterion("diskModel >=", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelLessThan(String value) {
            addCriterion("diskModel <", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelLessThanOrEqualTo(String value) {
            addCriterion("diskModel <=", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelLike(String value) {
            addCriterion("diskModel like", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelNotLike(String value) {
            addCriterion("diskModel not like", value, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelIn(List<String> values) {
            addCriterion("diskModel in", values, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelNotIn(List<String> values) {
            addCriterion("diskModel not in", values, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelBetween(String value1, String value2) {
            addCriterion("diskModel between", value1, value2, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDiskmodelNotBetween(String value1, String value2) {
            addCriterion("diskModel not between", value1, value2, "diskmodel");
            return (Criteria) this;
        }

        public Criteria andDisksizeIsNull() {
            addCriterion("diskSize is null");
            return (Criteria) this;
        }

        public Criteria andDisksizeIsNotNull() {
            addCriterion("diskSize is not null");
            return (Criteria) this;
        }

        public Criteria andDisksizeEqualTo(Integer value) {
            addCriterion("diskSize =", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeNotEqualTo(Integer value) {
            addCriterion("diskSize <>", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeGreaterThan(Integer value) {
            addCriterion("diskSize >", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("diskSize >=", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeLessThan(Integer value) {
            addCriterion("diskSize <", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeLessThanOrEqualTo(Integer value) {
            addCriterion("diskSize <=", value, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeIn(List<Integer> values) {
            addCriterion("diskSize in", values, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeNotIn(List<Integer> values) {
            addCriterion("diskSize not in", values, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeBetween(Integer value1, Integer value2) {
            addCriterion("diskSize between", value1, value2, "disksize");
            return (Criteria) this;
        }

        public Criteria andDisksizeNotBetween(Integer value1, Integer value2) {
            addCriterion("diskSize not between", value1, value2, "disksize");
            return (Criteria) this;
        }

        public Criteria andDiskserialIsNull() {
            addCriterion("diskSerial is null");
            return (Criteria) this;
        }

        public Criteria andDiskserialIsNotNull() {
            addCriterion("diskSerial is not null");
            return (Criteria) this;
        }

        public Criteria andDiskserialEqualTo(String value) {
            addCriterion("diskSerial =", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialNotEqualTo(String value) {
            addCriterion("diskSerial <>", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialGreaterThan(String value) {
            addCriterion("diskSerial >", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialGreaterThanOrEqualTo(String value) {
            addCriterion("diskSerial >=", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialLessThan(String value) {
            addCriterion("diskSerial <", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialLessThanOrEqualTo(String value) {
            addCriterion("diskSerial <=", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialLike(String value) {
            addCriterion("diskSerial like", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialNotLike(String value) {
            addCriterion("diskSerial not like", value, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialIn(List<String> values) {
            addCriterion("diskSerial in", values, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialNotIn(List<String> values) {
            addCriterion("diskSerial not in", values, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialBetween(String value1, String value2) {
            addCriterion("diskSerial between", value1, value2, "diskserial");
            return (Criteria) this;
        }

        public Criteria andDiskserialNotBetween(String value1, String value2) {
            addCriterion("diskSerial not between", value1, value2, "diskserial");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerIsNull() {
            addCriterion("computerManufacturer is null");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerIsNotNull() {
            addCriterion("computerManufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerEqualTo(String value) {
            addCriterion("computerManufacturer =", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerNotEqualTo(String value) {
            addCriterion("computerManufacturer <>", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerGreaterThan(String value) {
            addCriterion("computerManufacturer >", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("computerManufacturer >=", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerLessThan(String value) {
            addCriterion("computerManufacturer <", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerLessThanOrEqualTo(String value) {
            addCriterion("computerManufacturer <=", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerLike(String value) {
            addCriterion("computerManufacturer like", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerNotLike(String value) {
            addCriterion("computerManufacturer not like", value, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerIn(List<String> values) {
            addCriterion("computerManufacturer in", values, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerNotIn(List<String> values) {
            addCriterion("computerManufacturer not in", values, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerBetween(String value1, String value2) {
            addCriterion("computerManufacturer between", value1, value2, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermanufacturerNotBetween(String value1, String value2) {
            addCriterion("computerManufacturer not between", value1, value2, "computermanufacturer");
            return (Criteria) this;
        }

        public Criteria andComputermodelIsNull() {
            addCriterion("computerModel is null");
            return (Criteria) this;
        }

        public Criteria andComputermodelIsNotNull() {
            addCriterion("computerModel is not null");
            return (Criteria) this;
        }

        public Criteria andComputermodelEqualTo(String value) {
            addCriterion("computerModel =", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelNotEqualTo(String value) {
            addCriterion("computerModel <>", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelGreaterThan(String value) {
            addCriterion("computerModel >", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelGreaterThanOrEqualTo(String value) {
            addCriterion("computerModel >=", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelLessThan(String value) {
            addCriterion("computerModel <", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelLessThanOrEqualTo(String value) {
            addCriterion("computerModel <=", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelLike(String value) {
            addCriterion("computerModel like", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelNotLike(String value) {
            addCriterion("computerModel not like", value, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelIn(List<String> values) {
            addCriterion("computerModel in", values, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelNotIn(List<String> values) {
            addCriterion("computerModel not in", values, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelBetween(String value1, String value2) {
            addCriterion("computerModel between", value1, value2, "computermodel");
            return (Criteria) this;
        }

        public Criteria andComputermodelNotBetween(String value1, String value2) {
            addCriterion("computerModel not between", value1, value2, "computermodel");
            return (Criteria) this;
        }

        public Criteria andMatherboardidIsNull() {
            addCriterion("matherBoardId is null");
            return (Criteria) this;
        }

        public Criteria andMatherboardidIsNotNull() {
            addCriterion("matherBoardId is not null");
            return (Criteria) this;
        }

        public Criteria andMatherboardidEqualTo(String value) {
            addCriterion("matherBoardId =", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidNotEqualTo(String value) {
            addCriterion("matherBoardId <>", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidGreaterThan(String value) {
            addCriterion("matherBoardId >", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidGreaterThanOrEqualTo(String value) {
            addCriterion("matherBoardId >=", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidLessThan(String value) {
            addCriterion("matherBoardId <", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidLessThanOrEqualTo(String value) {
            addCriterion("matherBoardId <=", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidLike(String value) {
            addCriterion("matherBoardId like", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidNotLike(String value) {
            addCriterion("matherBoardId not like", value, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidIn(List<String> values) {
            addCriterion("matherBoardId in", values, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidNotIn(List<String> values) {
            addCriterion("matherBoardId not in", values, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidBetween(String value1, String value2) {
            addCriterion("matherBoardId between", value1, value2, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andMatherboardidNotBetween(String value1, String value2) {
            addCriterion("matherBoardId not between", value1, value2, "matherboardid");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNull() {
            addCriterion("serviceNo is null");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNotNull() {
            addCriterion("serviceNo is not null");
            return (Criteria) this;
        }

        public Criteria andServicenoEqualTo(String value) {
            addCriterion("serviceNo =", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotEqualTo(String value) {
            addCriterion("serviceNo <>", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThan(String value) {
            addCriterion("serviceNo >", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThanOrEqualTo(String value) {
            addCriterion("serviceNo >=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThan(String value) {
            addCriterion("serviceNo <", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThanOrEqualTo(String value) {
            addCriterion("serviceNo <=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLike(String value) {
            addCriterion("serviceNo like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotLike(String value) {
            addCriterion("serviceNo not like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoIn(List<String> values) {
            addCriterion("serviceNo in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotIn(List<String> values) {
            addCriterion("serviceNo not in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoBetween(String value1, String value2) {
            addCriterion("serviceNo between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotBetween(String value1, String value2) {
            addCriterion("serviceNo not between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andIsmutiosIsNull() {
            addCriterion("isMutiOs is null");
            return (Criteria) this;
        }

        public Criteria andIsmutiosIsNotNull() {
            addCriterion("isMutiOs is not null");
            return (Criteria) this;
        }

        public Criteria andIsmutiosEqualTo(Integer value) {
            addCriterion("isMutiOs =", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosNotEqualTo(Integer value) {
            addCriterion("isMutiOs <>", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosGreaterThan(Integer value) {
            addCriterion("isMutiOs >", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMutiOs >=", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosLessThan(Integer value) {
            addCriterion("isMutiOs <", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosLessThanOrEqualTo(Integer value) {
            addCriterion("isMutiOs <=", value, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosIn(List<Integer> values) {
            addCriterion("isMutiOs in", values, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosNotIn(List<Integer> values) {
            addCriterion("isMutiOs not in", values, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosBetween(Integer value1, Integer value2) {
            addCriterion("isMutiOs between", value1, value2, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsmutiosNotBetween(Integer value1, Integer value2) {
            addCriterion("isMutiOs not between", value1, value2, "ismutios");
            return (Criteria) this;
        }

        public Criteria andIsvmIsNull() {
            addCriterion("isVm is null");
            return (Criteria) this;
        }

        public Criteria andIsvmIsNotNull() {
            addCriterion("isVm is not null");
            return (Criteria) this;
        }

        public Criteria andIsvmEqualTo(Integer value) {
            addCriterion("isVm =", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmNotEqualTo(Integer value) {
            addCriterion("isVm <>", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmGreaterThan(Integer value) {
            addCriterion("isVm >", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmGreaterThanOrEqualTo(Integer value) {
            addCriterion("isVm >=", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmLessThan(Integer value) {
            addCriterion("isVm <", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmLessThanOrEqualTo(Integer value) {
            addCriterion("isVm <=", value, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmIn(List<Integer> values) {
            addCriterion("isVm in", values, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmNotIn(List<Integer> values) {
            addCriterion("isVm not in", values, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmBetween(Integer value1, Integer value2) {
            addCriterion("isVm between", value1, value2, "isvm");
            return (Criteria) this;
        }

        public Criteria andIsvmNotBetween(Integer value1, Integer value2) {
            addCriterion("isVm not between", value1, value2, "isvm");
            return (Criteria) this;
        }

        public Criteria andCommunicateipIsNull() {
            addCriterion("communicateIP is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateipIsNotNull() {
            addCriterion("communicateIP is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateipEqualTo(String value) {
            addCriterion("communicateIP =", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipNotEqualTo(String value) {
            addCriterion("communicateIP <>", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipGreaterThan(String value) {
            addCriterion("communicateIP >", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipGreaterThanOrEqualTo(String value) {
            addCriterion("communicateIP >=", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipLessThan(String value) {
            addCriterion("communicateIP <", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipLessThanOrEqualTo(String value) {
            addCriterion("communicateIP <=", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipLike(String value) {
            addCriterion("communicateIP like", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipNotLike(String value) {
            addCriterion("communicateIP not like", value, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipIn(List<String> values) {
            addCriterion("communicateIP in", values, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipNotIn(List<String> values) {
            addCriterion("communicateIP not in", values, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipBetween(String value1, String value2) {
            addCriterion("communicateIP between", value1, value2, "communicateip");
            return (Criteria) this;
        }

        public Criteria andCommunicateipNotBetween(String value1, String value2) {
            addCriterion("communicateIP not between", value1, value2, "communicateip");
            return (Criteria) this;
        }

        public Criteria andIsopenedIsNull() {
            addCriterion("isOpened is null");
            return (Criteria) this;
        }

        public Criteria andIsopenedIsNotNull() {
            addCriterion("isOpened is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenedEqualTo(Integer value) {
            addCriterion("isOpened =", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedNotEqualTo(Integer value) {
            addCriterion("isOpened <>", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedGreaterThan(Integer value) {
            addCriterion("isOpened >", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOpened >=", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedLessThan(Integer value) {
            addCriterion("isOpened <", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedLessThanOrEqualTo(Integer value) {
            addCriterion("isOpened <=", value, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedIn(List<Integer> values) {
            addCriterion("isOpened in", values, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedNotIn(List<Integer> values) {
            addCriterion("isOpened not in", values, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedBetween(Integer value1, Integer value2) {
            addCriterion("isOpened between", value1, value2, "isopened");
            return (Criteria) this;
        }

        public Criteria andIsopenedNotBetween(Integer value1, Integer value2) {
            addCriterion("isOpened not between", value1, value2, "isopened");
            return (Criteria) this;
        }

        public Criteria andRegstateIsNull() {
            addCriterion("regState is null");
            return (Criteria) this;
        }

        public Criteria andRegstateIsNotNull() {
            addCriterion("regState is not null");
            return (Criteria) this;
        }

        public Criteria andRegstateEqualTo(Integer value) {
            addCriterion("regState =", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateNotEqualTo(Integer value) {
            addCriterion("regState <>", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateGreaterThan(Integer value) {
            addCriterion("regState >", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("regState >=", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateLessThan(Integer value) {
            addCriterion("regState <", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateLessThanOrEqualTo(Integer value) {
            addCriterion("regState <=", value, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateIn(List<Integer> values) {
            addCriterion("regState in", values, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateNotIn(List<Integer> values) {
            addCriterion("regState not in", values, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateBetween(Integer value1, Integer value2) {
            addCriterion("regState between", value1, value2, "regstate");
            return (Criteria) this;
        }

        public Criteria andRegstateNotBetween(Integer value1, Integer value2) {
            addCriterion("regState not between", value1, value2, "regstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateIsNull() {
            addCriterion("protectState is null");
            return (Criteria) this;
        }

        public Criteria andProtectstateIsNotNull() {
            addCriterion("protectState is not null");
            return (Criteria) this;
        }

        public Criteria andProtectstateEqualTo(Integer value) {
            addCriterion("protectState =", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateNotEqualTo(Integer value) {
            addCriterion("protectState <>", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateGreaterThan(Integer value) {
            addCriterion("protectState >", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("protectState >=", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateLessThan(Integer value) {
            addCriterion("protectState <", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateLessThanOrEqualTo(Integer value) {
            addCriterion("protectState <=", value, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateIn(List<Integer> values) {
            addCriterion("protectState in", values, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateNotIn(List<Integer> values) {
            addCriterion("protectState not in", values, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateBetween(Integer value1, Integer value2) {
            addCriterion("protectState between", value1, value2, "protectstate");
            return (Criteria) this;
        }

        public Criteria andProtectstateNotBetween(Integer value1, Integer value2) {
            addCriterion("protectState not between", value1, value2, "protectstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateIsNull() {
            addCriterion("roamState is null");
            return (Criteria) this;
        }

        public Criteria andRoamstateIsNotNull() {
            addCriterion("roamState is not null");
            return (Criteria) this;
        }

        public Criteria andRoamstateEqualTo(Integer value) {
            addCriterion("roamState =", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateNotEqualTo(Integer value) {
            addCriterion("roamState <>", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateGreaterThan(Integer value) {
            addCriterion("roamState >", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("roamState >=", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateLessThan(Integer value) {
            addCriterion("roamState <", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateLessThanOrEqualTo(Integer value) {
            addCriterion("roamState <=", value, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateIn(List<Integer> values) {
            addCriterion("roamState in", values, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateNotIn(List<Integer> values) {
            addCriterion("roamState not in", values, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateBetween(Integer value1, Integer value2) {
            addCriterion("roamState between", value1, value2, "roamstate");
            return (Criteria) this;
        }

        public Criteria andRoamstateNotBetween(Integer value1, Integer value2) {
            addCriterion("roamState not between", value1, value2, "roamstate");
            return (Criteria) this;
        }

        public Criteria andDeletestateIsNull() {
            addCriterion("deleteState is null");
            return (Criteria) this;
        }

        public Criteria andDeletestateIsNotNull() {
            addCriterion("deleteState is not null");
            return (Criteria) this;
        }

        public Criteria andDeletestateEqualTo(Integer value) {
            addCriterion("deleteState =", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotEqualTo(Integer value) {
            addCriterion("deleteState <>", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateGreaterThan(Integer value) {
            addCriterion("deleteState >", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteState >=", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateLessThan(Integer value) {
            addCriterion("deleteState <", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateLessThanOrEqualTo(Integer value) {
            addCriterion("deleteState <=", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateIn(List<Integer> values) {
            addCriterion("deleteState in", values, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotIn(List<Integer> values) {
            addCriterion("deleteState not in", values, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateBetween(Integer value1, Integer value2) {
            addCriterion("deleteState between", value1, value2, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteState not between", value1, value2, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidIsNull() {
            addCriterion("deviceUsefulId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidIsNotNull() {
            addCriterion("deviceUsefulId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidEqualTo(String value) {
            addCriterion("deviceUsefulId =", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidNotEqualTo(String value) {
            addCriterion("deviceUsefulId <>", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidGreaterThan(String value) {
            addCriterion("deviceUsefulId >", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceUsefulId >=", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidLessThan(String value) {
            addCriterion("deviceUsefulId <", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidLessThanOrEqualTo(String value) {
            addCriterion("deviceUsefulId <=", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidLike(String value) {
            addCriterion("deviceUsefulId like", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidNotLike(String value) {
            addCriterion("deviceUsefulId not like", value, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidIn(List<String> values) {
            addCriterion("deviceUsefulId in", values, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidNotIn(List<String> values) {
            addCriterion("deviceUsefulId not in", values, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidBetween(String value1, String value2) {
            addCriterion("deviceUsefulId between", value1, value2, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andDeviceusefulidNotBetween(String value1, String value2) {
            addCriterion("deviceUsefulId not between", value1, value2, "deviceusefulid");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIsNull() {
            addCriterion("lastUpgradeTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIsNotNull() {
            addCriterion("lastUpgradeTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeEqualTo(Date value) {
            addCriterion("lastUpgradeTime =", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotEqualTo(Date value) {
            addCriterion("lastUpgradeTime <>", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeGreaterThan(Date value) {
            addCriterion("lastUpgradeTime >", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpgradeTime >=", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeLessThan(Date value) {
            addCriterion("lastUpgradeTime <", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpgradeTime <=", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIn(List<Date> values) {
            addCriterion("lastUpgradeTime in", values, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotIn(List<Date> values) {
            addCriterion("lastUpgradeTime not in", values, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeBetween(Date value1, Date value2) {
            addCriterion("lastUpgradeTime between", value1, value2, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpgradeTime not between", value1, value2, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidIsNull() {
            addCriterion("oldDevOnlyId is null");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidIsNotNull() {
            addCriterion("oldDevOnlyId is not null");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidEqualTo(String value) {
            addCriterion("oldDevOnlyId =", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidNotEqualTo(String value) {
            addCriterion("oldDevOnlyId <>", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidGreaterThan(String value) {
            addCriterion("oldDevOnlyId >", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidGreaterThanOrEqualTo(String value) {
            addCriterion("oldDevOnlyId >=", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidLessThan(String value) {
            addCriterion("oldDevOnlyId <", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidLessThanOrEqualTo(String value) {
            addCriterion("oldDevOnlyId <=", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidLike(String value) {
            addCriterion("oldDevOnlyId like", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidNotLike(String value) {
            addCriterion("oldDevOnlyId not like", value, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidIn(List<String> values) {
            addCriterion("oldDevOnlyId in", values, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidNotIn(List<String> values) {
            addCriterion("oldDevOnlyId not in", values, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidBetween(String value1, String value2) {
            addCriterion("oldDevOnlyId between", value1, value2, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andOlddevonlyidNotBetween(String value1, String value2) {
            addCriterion("oldDevOnlyId not between", value1, value2, "olddevonlyid");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andHoldernameIsNull() {
            addCriterion("holderName is null");
            return (Criteria) this;
        }

        public Criteria andHoldernameIsNotNull() {
            addCriterion("holderName is not null");
            return (Criteria) this;
        }

        public Criteria andHoldernameEqualTo(String value) {
            addCriterion("holderName =", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotEqualTo(String value) {
            addCriterion("holderName <>", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameGreaterThan(String value) {
            addCriterion("holderName >", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameGreaterThanOrEqualTo(String value) {
            addCriterion("holderName >=", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLessThan(String value) {
            addCriterion("holderName <", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLessThanOrEqualTo(String value) {
            addCriterion("holderName <=", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLike(String value) {
            addCriterion("holderName like", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotLike(String value) {
            addCriterion("holderName not like", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameIn(List<String> values) {
            addCriterion("holderName in", values, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotIn(List<String> values) {
            addCriterion("holderName not in", values, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameBetween(String value1, String value2) {
            addCriterion("holderName between", value1, value2, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotBetween(String value1, String value2) {
            addCriterion("holderName not between", value1, value2, "holdername");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIsNull() {
            addCriterion("assetStatus is null");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIsNotNull() {
            addCriterion("assetStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAssetstatusEqualTo(Integer value) {
            addCriterion("assetStatus =", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotEqualTo(Integer value) {
            addCriterion("assetStatus <>", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusGreaterThan(Integer value) {
            addCriterion("assetStatus >", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("assetStatus >=", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusLessThan(Integer value) {
            addCriterion("assetStatus <", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusLessThanOrEqualTo(Integer value) {
            addCriterion("assetStatus <=", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIn(List<Integer> values) {
            addCriterion("assetStatus in", values, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotIn(List<Integer> values) {
            addCriterion("assetStatus not in", values, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusBetween(Integer value1, Integer value2) {
            addCriterion("assetStatus between", value1, value2, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("assetStatus not between", value1, value2, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeIsNull() {
            addCriterion("effectiveProtectedTime is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeIsNotNull() {
            addCriterion("effectiveProtectedTime is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeEqualTo(Date value) {
            addCriterion("effectiveProtectedTime =", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeNotEqualTo(Date value) {
            addCriterion("effectiveProtectedTime <>", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeGreaterThan(Date value) {
            addCriterion("effectiveProtectedTime >", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effectiveProtectedTime >=", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeLessThan(Date value) {
            addCriterion("effectiveProtectedTime <", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeLessThanOrEqualTo(Date value) {
            addCriterion("effectiveProtectedTime <=", value, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeIn(List<Date> values) {
            addCriterion("effectiveProtectedTime in", values, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeNotIn(List<Date> values) {
            addCriterion("effectiveProtectedTime not in", values, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeBetween(Date value1, Date value2) {
            addCriterion("effectiveProtectedTime between", value1, value2, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveprotectedtimeNotBetween(Date value1, Date value2) {
            addCriterion("effectiveProtectedTime not between", value1, value2, "effectiveprotectedtime");
            return (Criteria) this;
        }

        public Criteria andIssetlockIsNull() {
            addCriterion("isSetLock is null");
            return (Criteria) this;
        }

        public Criteria andIssetlockIsNotNull() {
            addCriterion("isSetLock is not null");
            return (Criteria) this;
        }

        public Criteria andIssetlockEqualTo(Integer value) {
            addCriterion("isSetLock =", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockNotEqualTo(Integer value) {
            addCriterion("isSetLock <>", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockGreaterThan(Integer value) {
            addCriterion("isSetLock >", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSetLock >=", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockLessThan(Integer value) {
            addCriterion("isSetLock <", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockLessThanOrEqualTo(Integer value) {
            addCriterion("isSetLock <=", value, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockIn(List<Integer> values) {
            addCriterion("isSetLock in", values, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockNotIn(List<Integer> values) {
            addCriterion("isSetLock not in", values, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockBetween(Integer value1, Integer value2) {
            addCriterion("isSetLock between", value1, value2, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetlockNotBetween(Integer value1, Integer value2) {
            addCriterion("isSetLock not between", value1, value2, "issetlock");
            return (Criteria) this;
        }

        public Criteria andIssetreregistIsNull() {
            addCriterion("isSetReRegist is null");
            return (Criteria) this;
        }

        public Criteria andIssetreregistIsNotNull() {
            addCriterion("isSetReRegist is not null");
            return (Criteria) this;
        }

        public Criteria andIssetreregistEqualTo(Integer value) {
            addCriterion("isSetReRegist =", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistNotEqualTo(Integer value) {
            addCriterion("isSetReRegist <>", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistGreaterThan(Integer value) {
            addCriterion("isSetReRegist >", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSetReRegist >=", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistLessThan(Integer value) {
            addCriterion("isSetReRegist <", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistLessThanOrEqualTo(Integer value) {
            addCriterion("isSetReRegist <=", value, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistIn(List<Integer> values) {
            addCriterion("isSetReRegist in", values, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistNotIn(List<Integer> values) {
            addCriterion("isSetReRegist not in", values, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistBetween(Integer value1, Integer value2) {
            addCriterion("isSetReRegist between", value1, value2, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetreregistNotBetween(Integer value1, Integer value2) {
            addCriterion("isSetReRegist not between", value1, value2, "issetreregist");
            return (Criteria) this;
        }

        public Criteria andIssetblockIsNull() {
            addCriterion("isSetBlock is null");
            return (Criteria) this;
        }

        public Criteria andIssetblockIsNotNull() {
            addCriterion("isSetBlock is not null");
            return (Criteria) this;
        }

        public Criteria andIssetblockEqualTo(Integer value) {
            addCriterion("isSetBlock =", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockNotEqualTo(Integer value) {
            addCriterion("isSetBlock <>", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockGreaterThan(Integer value) {
            addCriterion("isSetBlock >", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSetBlock >=", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockLessThan(Integer value) {
            addCriterion("isSetBlock <", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockLessThanOrEqualTo(Integer value) {
            addCriterion("isSetBlock <=", value, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockIn(List<Integer> values) {
            addCriterion("isSetBlock in", values, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockNotIn(List<Integer> values) {
            addCriterion("isSetBlock not in", values, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockBetween(Integer value1, Integer value2) {
            addCriterion("isSetBlock between", value1, value2, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetblockNotBetween(Integer value1, Integer value2) {
            addCriterion("isSetBlock not between", value1, value2, "issetblock");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallIsNull() {
            addCriterion("isSetUninstall is null");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallIsNotNull() {
            addCriterion("isSetUninstall is not null");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallEqualTo(Integer value) {
            addCriterion("isSetUninstall =", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallNotEqualTo(Integer value) {
            addCriterion("isSetUninstall <>", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallGreaterThan(Integer value) {
            addCriterion("isSetUninstall >", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSetUninstall >=", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallLessThan(Integer value) {
            addCriterion("isSetUninstall <", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallLessThanOrEqualTo(Integer value) {
            addCriterion("isSetUninstall <=", value, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallIn(List<Integer> values) {
            addCriterion("isSetUninstall in", values, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallNotIn(List<Integer> values) {
            addCriterion("isSetUninstall not in", values, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallBetween(Integer value1, Integer value2) {
            addCriterion("isSetUninstall between", value1, value2, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetuninstallNotBetween(Integer value1, Integer value2) {
            addCriterion("isSetUninstall not between", value1, value2, "issetuninstall");
            return (Criteria) this;
        }

        public Criteria andIssetdisableIsNull() {
            addCriterion("isSetDisable is null");
            return (Criteria) this;
        }

        public Criteria andIssetdisableIsNotNull() {
            addCriterion("isSetDisable is not null");
            return (Criteria) this;
        }

        public Criteria andIssetdisableEqualTo(Integer value) {
            addCriterion("isSetDisable =", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableNotEqualTo(Integer value) {
            addCriterion("isSetDisable <>", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableGreaterThan(Integer value) {
            addCriterion("isSetDisable >", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSetDisable >=", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableLessThan(Integer value) {
            addCriterion("isSetDisable <", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableLessThanOrEqualTo(Integer value) {
            addCriterion("isSetDisable <=", value, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableIn(List<Integer> values) {
            addCriterion("isSetDisable in", values, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableNotIn(List<Integer> values) {
            addCriterion("isSetDisable not in", values, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableBetween(Integer value1, Integer value2) {
            addCriterion("isSetDisable between", value1, value2, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andIssetdisableNotBetween(Integer value1, Integer value2) {
            addCriterion("isSetDisable not between", value1, value2, "issetdisable");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIsNull() {
            addCriterion("agentPackType is null");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIsNotNull() {
            addCriterion("agentPackType is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeEqualTo(Integer value) {
            addCriterion("agentPackType =", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotEqualTo(Integer value) {
            addCriterion("agentPackType <>", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeGreaterThan(Integer value) {
            addCriterion("agentPackType >", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agentPackType >=", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeLessThan(Integer value) {
            addCriterion("agentPackType <", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeLessThanOrEqualTo(Integer value) {
            addCriterion("agentPackType <=", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIn(List<Integer> values) {
            addCriterion("agentPackType in", values, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotIn(List<Integer> values) {
            addCriterion("agentPackType not in", values, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeBetween(Integer value1, Integer value2) {
            addCriterion("agentPackType between", value1, value2, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("agentPackType not between", value1, value2, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameIsNull() {
            addCriterion("loginDomainName is null");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameIsNotNull() {
            addCriterion("loginDomainName is not null");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameEqualTo(String value) {
            addCriterion("loginDomainName =", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameNotEqualTo(String value) {
            addCriterion("loginDomainName <>", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameGreaterThan(String value) {
            addCriterion("loginDomainName >", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginDomainName >=", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameLessThan(String value) {
            addCriterion("loginDomainName <", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameLessThanOrEqualTo(String value) {
            addCriterion("loginDomainName <=", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameLike(String value) {
            addCriterion("loginDomainName like", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameNotLike(String value) {
            addCriterion("loginDomainName not like", value, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameIn(List<String> values) {
            addCriterion("loginDomainName in", values, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameNotIn(List<String> values) {
            addCriterion("loginDomainName not in", values, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameBetween(String value1, String value2) {
            addCriterion("loginDomainName between", value1, value2, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andLogindomainnameNotBetween(String value1, String value2) {
            addCriterion("loginDomainName not between", value1, value2, "logindomainname");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateIsNull() {
            addCriterion("accessNetworkState is null");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateIsNotNull() {
            addCriterion("accessNetworkState is not null");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateEqualTo(Integer value) {
            addCriterion("accessNetworkState =", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateNotEqualTo(Integer value) {
            addCriterion("accessNetworkState <>", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateGreaterThan(Integer value) {
            addCriterion("accessNetworkState >", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("accessNetworkState >=", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateLessThan(Integer value) {
            addCriterion("accessNetworkState <", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateLessThanOrEqualTo(Integer value) {
            addCriterion("accessNetworkState <=", value, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateIn(List<Integer> values) {
            addCriterion("accessNetworkState in", values, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateNotIn(List<Integer> values) {
            addCriterion("accessNetworkState not in", values, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateBetween(Integer value1, Integer value2) {
            addCriterion("accessNetworkState between", value1, value2, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andAccessnetworkstateNotBetween(Integer value1, Integer value2) {
            addCriterion("accessNetworkState not between", value1, value2, "accessnetworkstate");
            return (Criteria) this;
        }

        public Criteria andIsfirewallIsNull() {
            addCriterion("isFireWall is null");
            return (Criteria) this;
        }

        public Criteria andIsfirewallIsNotNull() {
            addCriterion("isFireWall is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirewallEqualTo(Integer value) {
            addCriterion("isFireWall =", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallNotEqualTo(Integer value) {
            addCriterion("isFireWall <>", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallGreaterThan(Integer value) {
            addCriterion("isFireWall >", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFireWall >=", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallLessThan(Integer value) {
            addCriterion("isFireWall <", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallLessThanOrEqualTo(Integer value) {
            addCriterion("isFireWall <=", value, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallIn(List<Integer> values) {
            addCriterion("isFireWall in", values, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallNotIn(List<Integer> values) {
            addCriterion("isFireWall not in", values, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallBetween(Integer value1, Integer value2) {
            addCriterion("isFireWall between", value1, value2, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andIsfirewallNotBetween(Integer value1, Integer value2) {
            addCriterion("isFireWall not between", value1, value2, "isfirewall");
            return (Criteria) this;
        }

        public Criteria andServerareaidIsNull() {
            addCriterion("serverAreaId is null");
            return (Criteria) this;
        }

        public Criteria andServerareaidIsNotNull() {
            addCriterion("serverAreaId is not null");
            return (Criteria) this;
        }

        public Criteria andServerareaidEqualTo(String value) {
            addCriterion("serverAreaId =", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidNotEqualTo(String value) {
            addCriterion("serverAreaId <>", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidGreaterThan(String value) {
            addCriterion("serverAreaId >", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidGreaterThanOrEqualTo(String value) {
            addCriterion("serverAreaId >=", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidLessThan(String value) {
            addCriterion("serverAreaId <", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidLessThanOrEqualTo(String value) {
            addCriterion("serverAreaId <=", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidLike(String value) {
            addCriterion("serverAreaId like", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidNotLike(String value) {
            addCriterion("serverAreaId not like", value, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidIn(List<String> values) {
            addCriterion("serverAreaId in", values, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidNotIn(List<String> values) {
            addCriterion("serverAreaId not in", values, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidBetween(String value1, String value2) {
            addCriterion("serverAreaId between", value1, value2, "serverareaid");
            return (Criteria) this;
        }

        public Criteria andServerareaidNotBetween(String value1, String value2) {
            addCriterion("serverAreaId not between", value1, value2, "serverareaid");
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

        public Criteria andFindtimeIsNull() {
            addCriterion("findTime is null");
            return (Criteria) this;
        }

        public Criteria andFindtimeIsNotNull() {
            addCriterion("findTime is not null");
            return (Criteria) this;
        }

        public Criteria andFindtimeEqualTo(Date value) {
            addCriterion("findTime =", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeNotEqualTo(Date value) {
            addCriterion("findTime <>", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeGreaterThan(Date value) {
            addCriterion("findTime >", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("findTime >=", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeLessThan(Date value) {
            addCriterion("findTime <", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeLessThanOrEqualTo(Date value) {
            addCriterion("findTime <=", value, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeIn(List<Date> values) {
            addCriterion("findTime in", values, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeNotIn(List<Date> values) {
            addCriterion("findTime not in", values, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeBetween(Date value1, Date value2) {
            addCriterion("findTime between", value1, value2, "findtime");
            return (Criteria) this;
        }

        public Criteria andFindtimeNotBetween(Date value1, Date value2) {
            addCriterion("findTime not between", value1, value2, "findtime");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(String value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(String value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(String value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(String value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(String value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLike(String value) {
            addCriterion("classify like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotLike(String value) {
            addCriterion("classify not like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<String> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<String> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(String value1, String value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(String value1, String value2) {
            addCriterion("classify not between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andInforsourceIsNull() {
            addCriterion("inforSource is null");
            return (Criteria) this;
        }

        public Criteria andInforsourceIsNotNull() {
            addCriterion("inforSource is not null");
            return (Criteria) this;
        }

        public Criteria andInforsourceEqualTo(Integer value) {
            addCriterion("inforSource =", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceNotEqualTo(Integer value) {
            addCriterion("inforSource <>", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceGreaterThan(Integer value) {
            addCriterion("inforSource >", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("inforSource >=", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceLessThan(Integer value) {
            addCriterion("inforSource <", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceLessThanOrEqualTo(Integer value) {
            addCriterion("inforSource <=", value, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceIn(List<Integer> values) {
            addCriterion("inforSource in", values, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceNotIn(List<Integer> values) {
            addCriterion("inforSource not in", values, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceBetween(Integer value1, Integer value2) {
            addCriterion("inforSource between", value1, value2, "inforsource");
            return (Criteria) this;
        }

        public Criteria andInforsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("inforSource not between", value1, value2, "inforsource");
            return (Criteria) this;
        }

        public Criteria andIscontrolIsNull() {
            addCriterion("isControl is null");
            return (Criteria) this;
        }

        public Criteria andIscontrolIsNotNull() {
            addCriterion("isControl is not null");
            return (Criteria) this;
        }

        public Criteria andIscontrolEqualTo(Integer value) {
            addCriterion("isControl =", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolNotEqualTo(Integer value) {
            addCriterion("isControl <>", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolGreaterThan(Integer value) {
            addCriterion("isControl >", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("isControl >=", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolLessThan(Integer value) {
            addCriterion("isControl <", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolLessThanOrEqualTo(Integer value) {
            addCriterion("isControl <=", value, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolIn(List<Integer> values) {
            addCriterion("isControl in", values, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolNotIn(List<Integer> values) {
            addCriterion("isControl not in", values, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolBetween(Integer value1, Integer value2) {
            addCriterion("isControl between", value1, value2, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andIscontrolNotBetween(Integer value1, Integer value2) {
            addCriterion("isControl not between", value1, value2, "iscontrol");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeIsNull() {
            addCriterion("lastActiveTime is null");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeIsNotNull() {
            addCriterion("lastActiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeEqualTo(Date value) {
            addCriterion("lastActiveTime =", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeNotEqualTo(Date value) {
            addCriterion("lastActiveTime <>", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeGreaterThan(Date value) {
            addCriterion("lastActiveTime >", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastActiveTime >=", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeLessThan(Date value) {
            addCriterion("lastActiveTime <", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastActiveTime <=", value, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeIn(List<Date> values) {
            addCriterion("lastActiveTime in", values, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeNotIn(List<Date> values) {
            addCriterion("lastActiveTime not in", values, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeBetween(Date value1, Date value2) {
            addCriterion("lastActiveTime between", value1, value2, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andLastactivetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastActiveTime not between", value1, value2, "lastactivetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeIsNull() {
            addCriterion("historyOnlineTime is null");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeIsNotNull() {
            addCriterion("historyOnlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeEqualTo(String value) {
            addCriterion("historyOnlineTime =", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeNotEqualTo(String value) {
            addCriterion("historyOnlineTime <>", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeGreaterThan(String value) {
            addCriterion("historyOnlineTime >", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeGreaterThanOrEqualTo(String value) {
            addCriterion("historyOnlineTime >=", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeLessThan(String value) {
            addCriterion("historyOnlineTime <", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeLessThanOrEqualTo(String value) {
            addCriterion("historyOnlineTime <=", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeLike(String value) {
            addCriterion("historyOnlineTime like", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeNotLike(String value) {
            addCriterion("historyOnlineTime not like", value, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeIn(List<String> values) {
            addCriterion("historyOnlineTime in", values, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeNotIn(List<String> values) {
            addCriterion("historyOnlineTime not in", values, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeBetween(String value1, String value2) {
            addCriterion("historyOnlineTime between", value1, value2, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andHistoryonlinetimeNotBetween(String value1, String value2) {
            addCriterion("historyOnlineTime not between", value1, value2, "historyonlinetime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeIsNull() {
            addCriterion("loseControlTime is null");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeIsNotNull() {
            addCriterion("loseControlTime is not null");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeEqualTo(Integer value) {
            addCriterion("loseControlTime =", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeNotEqualTo(Integer value) {
            addCriterion("loseControlTime <>", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeGreaterThan(Integer value) {
            addCriterion("loseControlTime >", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loseControlTime >=", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeLessThan(Integer value) {
            addCriterion("loseControlTime <", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeLessThanOrEqualTo(Integer value) {
            addCriterion("loseControlTime <=", value, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeIn(List<Integer> values) {
            addCriterion("loseControlTime in", values, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeNotIn(List<Integer> values) {
            addCriterion("loseControlTime not in", values, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeBetween(Integer value1, Integer value2) {
            addCriterion("loseControlTime between", value1, value2, "losecontroltime");
            return (Criteria) this;
        }

        public Criteria andLosecontroltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loseControlTime not between", value1, value2, "losecontroltime");
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