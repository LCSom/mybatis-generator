package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatchBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatchBeanExample() {
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

        public Criteria andUpdateidIsNull() {
            addCriterion("updateId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(String value) {
            addCriterion("updateId =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(String value) {
            addCriterion("updateId <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(String value) {
            addCriterion("updateId >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(String value) {
            addCriterion("updateId >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(String value) {
            addCriterion("updateId <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(String value) {
            addCriterion("updateId <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLike(String value) {
            addCriterion("updateId like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotLike(String value) {
            addCriterion("updateId not like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<String> values) {
            addCriterion("updateId in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<String> values) {
            addCriterion("updateId not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(String value1, String value2) {
            addCriterion("updateId between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(String value1, String value2) {
            addCriterion("updateId not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andBulletinidIsNull() {
            addCriterion("bulletinId is null");
            return (Criteria) this;
        }

        public Criteria andBulletinidIsNotNull() {
            addCriterion("bulletinId is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinidEqualTo(String value) {
            addCriterion("bulletinId =", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotEqualTo(String value) {
            addCriterion("bulletinId <>", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidGreaterThan(String value) {
            addCriterion("bulletinId >", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidGreaterThanOrEqualTo(String value) {
            addCriterion("bulletinId >=", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidLessThan(String value) {
            addCriterion("bulletinId <", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidLessThanOrEqualTo(String value) {
            addCriterion("bulletinId <=", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidLike(String value) {
            addCriterion("bulletinId like", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotLike(String value) {
            addCriterion("bulletinId not like", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidIn(List<String> values) {
            addCriterion("bulletinId in", values, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotIn(List<String> values) {
            addCriterion("bulletinId not in", values, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidBetween(String value1, String value2) {
            addCriterion("bulletinId between", value1, value2, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotBetween(String value1, String value2) {
            addCriterion("bulletinId not between", value1, value2, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeIsNull() {
            addCriterion("distributeTime is null");
            return (Criteria) this;
        }

        public Criteria andDistributetimeIsNotNull() {
            addCriterion("distributeTime is not null");
            return (Criteria) this;
        }

        public Criteria andDistributetimeEqualTo(Date value) {
            addCriterion("distributeTime =", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeNotEqualTo(Date value) {
            addCriterion("distributeTime <>", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeGreaterThan(Date value) {
            addCriterion("distributeTime >", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distributeTime >=", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeLessThan(Date value) {
            addCriterion("distributeTime <", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeLessThanOrEqualTo(Date value) {
            addCriterion("distributeTime <=", value, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeIn(List<Date> values) {
            addCriterion("distributeTime in", values, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeNotIn(List<Date> values) {
            addCriterion("distributeTime not in", values, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeBetween(Date value1, Date value2) {
            addCriterion("distributeTime between", value1, value2, "distributetime");
            return (Criteria) this;
        }

        public Criteria andDistributetimeNotBetween(Date value1, Date value2) {
            addCriterion("distributeTime not between", value1, value2, "distributetime");
            return (Criteria) this;
        }

        public Criteria andPatchcodeIsNull() {
            addCriterion("patchCode is null");
            return (Criteria) this;
        }

        public Criteria andPatchcodeIsNotNull() {
            addCriterion("patchCode is not null");
            return (Criteria) this;
        }

        public Criteria andPatchcodeEqualTo(String value) {
            addCriterion("patchCode =", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeNotEqualTo(String value) {
            addCriterion("patchCode <>", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeGreaterThan(String value) {
            addCriterion("patchCode >", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("patchCode >=", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeLessThan(String value) {
            addCriterion("patchCode <", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeLessThanOrEqualTo(String value) {
            addCriterion("patchCode <=", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeLike(String value) {
            addCriterion("patchCode like", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeNotLike(String value) {
            addCriterion("patchCode not like", value, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeIn(List<String> values) {
            addCriterion("patchCode in", values, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeNotIn(List<String> values) {
            addCriterion("patchCode not in", values, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeBetween(String value1, String value2) {
            addCriterion("patchCode between", value1, value2, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchcodeNotBetween(String value1, String value2) {
            addCriterion("patchCode not between", value1, value2, "patchcode");
            return (Criteria) this;
        }

        public Criteria andPatchnameIsNull() {
            addCriterion("patchName is null");
            return (Criteria) this;
        }

        public Criteria andPatchnameIsNotNull() {
            addCriterion("patchName is not null");
            return (Criteria) this;
        }

        public Criteria andPatchnameEqualTo(String value) {
            addCriterion("patchName =", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameNotEqualTo(String value) {
            addCriterion("patchName <>", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameGreaterThan(String value) {
            addCriterion("patchName >", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameGreaterThanOrEqualTo(String value) {
            addCriterion("patchName >=", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameLessThan(String value) {
            addCriterion("patchName <", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameLessThanOrEqualTo(String value) {
            addCriterion("patchName <=", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameLike(String value) {
            addCriterion("patchName like", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameNotLike(String value) {
            addCriterion("patchName not like", value, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameIn(List<String> values) {
            addCriterion("patchName in", values, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameNotIn(List<String> values) {
            addCriterion("patchName not in", values, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameBetween(String value1, String value2) {
            addCriterion("patchName between", value1, value2, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchnameNotBetween(String value1, String value2) {
            addCriterion("patchName not between", value1, value2, "patchname");
            return (Criteria) this;
        }

        public Criteria andPatchpathIsNull() {
            addCriterion("patchPath is null");
            return (Criteria) this;
        }

        public Criteria andPatchpathIsNotNull() {
            addCriterion("patchPath is not null");
            return (Criteria) this;
        }

        public Criteria andPatchpathEqualTo(String value) {
            addCriterion("patchPath =", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathNotEqualTo(String value) {
            addCriterion("patchPath <>", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathGreaterThan(String value) {
            addCriterion("patchPath >", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathGreaterThanOrEqualTo(String value) {
            addCriterion("patchPath >=", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathLessThan(String value) {
            addCriterion("patchPath <", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathLessThanOrEqualTo(String value) {
            addCriterion("patchPath <=", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathLike(String value) {
            addCriterion("patchPath like", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathNotLike(String value) {
            addCriterion("patchPath not like", value, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathIn(List<String> values) {
            addCriterion("patchPath in", values, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathNotIn(List<String> values) {
            addCriterion("patchPath not in", values, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathBetween(String value1, String value2) {
            addCriterion("patchPath between", value1, value2, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchpathNotBetween(String value1, String value2) {
            addCriterion("patchPath not between", value1, value2, "patchpath");
            return (Criteria) this;
        }

        public Criteria andPatchlevelIsNull() {
            addCriterion("patchLevel is null");
            return (Criteria) this;
        }

        public Criteria andPatchlevelIsNotNull() {
            addCriterion("patchLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPatchlevelEqualTo(Integer value) {
            addCriterion("patchLevel =", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelNotEqualTo(Integer value) {
            addCriterion("patchLevel <>", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelGreaterThan(Integer value) {
            addCriterion("patchLevel >", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("patchLevel >=", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelLessThan(Integer value) {
            addCriterion("patchLevel <", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelLessThanOrEqualTo(Integer value) {
            addCriterion("patchLevel <=", value, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelIn(List<Integer> values) {
            addCriterion("patchLevel in", values, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelNotIn(List<Integer> values) {
            addCriterion("patchLevel not in", values, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelBetween(Integer value1, Integer value2) {
            addCriterion("patchLevel between", value1, value2, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("patchLevel not between", value1, value2, "patchlevel");
            return (Criteria) this;
        }

        public Criteria andPatchtypeIsNull() {
            addCriterion("patchType is null");
            return (Criteria) this;
        }

        public Criteria andPatchtypeIsNotNull() {
            addCriterion("patchType is not null");
            return (Criteria) this;
        }

        public Criteria andPatchtypeEqualTo(String value) {
            addCriterion("patchType =", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeNotEqualTo(String value) {
            addCriterion("patchType <>", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeGreaterThan(String value) {
            addCriterion("patchType >", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeGreaterThanOrEqualTo(String value) {
            addCriterion("patchType >=", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeLessThan(String value) {
            addCriterion("patchType <", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeLessThanOrEqualTo(String value) {
            addCriterion("patchType <=", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeLike(String value) {
            addCriterion("patchType like", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeNotLike(String value) {
            addCriterion("patchType not like", value, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeIn(List<String> values) {
            addCriterion("patchType in", values, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeNotIn(List<String> values) {
            addCriterion("patchType not in", values, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeBetween(String value1, String value2) {
            addCriterion("patchType between", value1, value2, "patchtype");
            return (Criteria) this;
        }

        public Criteria andPatchtypeNotBetween(String value1, String value2) {
            addCriterion("patchType not between", value1, value2, "patchtype");
            return (Criteria) this;
        }

        public Criteria andIsdistributeIsNull() {
            addCriterion("isDistribute is null");
            return (Criteria) this;
        }

        public Criteria andIsdistributeIsNotNull() {
            addCriterion("isDistribute is not null");
            return (Criteria) this;
        }

        public Criteria andIsdistributeEqualTo(Integer value) {
            addCriterion("isDistribute =", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeNotEqualTo(Integer value) {
            addCriterion("isDistribute <>", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeGreaterThan(Integer value) {
            addCriterion("isDistribute >", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDistribute >=", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeLessThan(Integer value) {
            addCriterion("isDistribute <", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeLessThanOrEqualTo(Integer value) {
            addCriterion("isDistribute <=", value, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeIn(List<Integer> values) {
            addCriterion("isDistribute in", values, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeNotIn(List<Integer> values) {
            addCriterion("isDistribute not in", values, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeBetween(Integer value1, Integer value2) {
            addCriterion("isDistribute between", value1, value2, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andIsdistributeNotBetween(Integer value1, Integer value2) {
            addCriterion("isDistribute not between", value1, value2, "isdistribute");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNull() {
            addCriterion("osType is null");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNotNull() {
            addCriterion("osType is not null");
            return (Criteria) this;
        }

        public Criteria andOstypeEqualTo(String value) {
            addCriterion("osType =", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotEqualTo(String value) {
            addCriterion("osType <>", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThan(String value) {
            addCriterion("osType >", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThanOrEqualTo(String value) {
            addCriterion("osType >=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThan(String value) {
            addCriterion("osType <", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThanOrEqualTo(String value) {
            addCriterion("osType <=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLike(String value) {
            addCriterion("osType like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotLike(String value) {
            addCriterion("osType not like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeIn(List<String> values) {
            addCriterion("osType in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotIn(List<String> values) {
            addCriterion("osType not in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeBetween(String value1, String value2) {
            addCriterion("osType between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotBetween(String value1, String value2) {
            addCriterion("osType not between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andProductfamilyIsNull() {
            addCriterion("productFamily is null");
            return (Criteria) this;
        }

        public Criteria andProductfamilyIsNotNull() {
            addCriterion("productFamily is not null");
            return (Criteria) this;
        }

        public Criteria andProductfamilyEqualTo(String value) {
            addCriterion("productFamily =", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyNotEqualTo(String value) {
            addCriterion("productFamily <>", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyGreaterThan(String value) {
            addCriterion("productFamily >", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyGreaterThanOrEqualTo(String value) {
            addCriterion("productFamily >=", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyLessThan(String value) {
            addCriterion("productFamily <", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyLessThanOrEqualTo(String value) {
            addCriterion("productFamily <=", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyLike(String value) {
            addCriterion("productFamily like", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyNotLike(String value) {
            addCriterion("productFamily not like", value, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyIn(List<String> values) {
            addCriterion("productFamily in", values, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyNotIn(List<String> values) {
            addCriterion("productFamily not in", values, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyBetween(String value1, String value2) {
            addCriterion("productFamily between", value1, value2, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductfamilyNotBetween(String value1, String value2) {
            addCriterion("productFamily not between", value1, value2, "productfamily");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIsNull() {
            addCriterion("updateType is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIsNotNull() {
            addCriterion("updateType is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeEqualTo(String value) {
            addCriterion("updateType =", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotEqualTo(String value) {
            addCriterion("updateType <>", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeGreaterThan(String value) {
            addCriterion("updateType >", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("updateType >=", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeLessThan(String value) {
            addCriterion("updateType <", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeLessThanOrEqualTo(String value) {
            addCriterion("updateType <=", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeLike(String value) {
            addCriterion("updateType like", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotLike(String value) {
            addCriterion("updateType not like", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIn(List<String> values) {
            addCriterion("updateType in", values, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotIn(List<String> values) {
            addCriterion("updateType not in", values, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeBetween(String value1, String value2) {
            addCriterion("updateType between", value1, value2, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotBetween(String value1, String value2) {
            addCriterion("updateType not between", value1, value2, "updatetype");
            return (Criteria) this;
        }

        public Criteria andCrcIsNull() {
            addCriterion("crc is null");
            return (Criteria) this;
        }

        public Criteria andCrcIsNotNull() {
            addCriterion("crc is not null");
            return (Criteria) this;
        }

        public Criteria andCrcEqualTo(String value) {
            addCriterion("crc =", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotEqualTo(String value) {
            addCriterion("crc <>", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcGreaterThan(String value) {
            addCriterion("crc >", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcGreaterThanOrEqualTo(String value) {
            addCriterion("crc >=", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLessThan(String value) {
            addCriterion("crc <", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLessThanOrEqualTo(String value) {
            addCriterion("crc <=", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLike(String value) {
            addCriterion("crc like", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotLike(String value) {
            addCriterion("crc not like", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcIn(List<String> values) {
            addCriterion("crc in", values, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotIn(List<String> values) {
            addCriterion("crc not in", values, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcBetween(String value1, String value2) {
            addCriterion("crc between", value1, value2, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotBetween(String value1, String value2) {
            addCriterion("crc not between", value1, value2, "crc");
            return (Criteria) this;
        }

        public Criteria andCpuarchIsNull() {
            addCriterion("cpuArch is null");
            return (Criteria) this;
        }

        public Criteria andCpuarchIsNotNull() {
            addCriterion("cpuArch is not null");
            return (Criteria) this;
        }

        public Criteria andCpuarchEqualTo(String value) {
            addCriterion("cpuArch =", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchNotEqualTo(String value) {
            addCriterion("cpuArch <>", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchGreaterThan(String value) {
            addCriterion("cpuArch >", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchGreaterThanOrEqualTo(String value) {
            addCriterion("cpuArch >=", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchLessThan(String value) {
            addCriterion("cpuArch <", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchLessThanOrEqualTo(String value) {
            addCriterion("cpuArch <=", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchLike(String value) {
            addCriterion("cpuArch like", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchNotLike(String value) {
            addCriterion("cpuArch not like", value, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchIn(List<String> values) {
            addCriterion("cpuArch in", values, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchNotIn(List<String> values) {
            addCriterion("cpuArch not in", values, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchBetween(String value1, String value2) {
            addCriterion("cpuArch between", value1, value2, "cpuarch");
            return (Criteria) this;
        }

        public Criteria andCpuarchNotBetween(String value1, String value2) {
            addCriterion("cpuArch not between", value1, value2, "cpuarch");
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

        public Criteria andPatchclassIsNull() {
            addCriterion("patchClass is null");
            return (Criteria) this;
        }

        public Criteria andPatchclassIsNotNull() {
            addCriterion("patchClass is not null");
            return (Criteria) this;
        }

        public Criteria andPatchclassEqualTo(String value) {
            addCriterion("patchClass =", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassNotEqualTo(String value) {
            addCriterion("patchClass <>", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassGreaterThan(String value) {
            addCriterion("patchClass >", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassGreaterThanOrEqualTo(String value) {
            addCriterion("patchClass >=", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassLessThan(String value) {
            addCriterion("patchClass <", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassLessThanOrEqualTo(String value) {
            addCriterion("patchClass <=", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassLike(String value) {
            addCriterion("patchClass like", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassNotLike(String value) {
            addCriterion("patchClass not like", value, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassIn(List<String> values) {
            addCriterion("patchClass in", values, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassNotIn(List<String> values) {
            addCriterion("patchClass not in", values, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassBetween(String value1, String value2) {
            addCriterion("patchClass between", value1, value2, "patchclass");
            return (Criteria) this;
        }

        public Criteria andPatchclassNotBetween(String value1, String value2) {
            addCriterion("patchClass not between", value1, value2, "patchclass");
            return (Criteria) this;
        }

        public Criteria andFromindexIsNull() {
            addCriterion("fromIndex is null");
            return (Criteria) this;
        }

        public Criteria andFromindexIsNotNull() {
            addCriterion("fromIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFromindexEqualTo(String value) {
            addCriterion("fromIndex =", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotEqualTo(String value) {
            addCriterion("fromIndex <>", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexGreaterThan(String value) {
            addCriterion("fromIndex >", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexGreaterThanOrEqualTo(String value) {
            addCriterion("fromIndex >=", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLessThan(String value) {
            addCriterion("fromIndex <", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLessThanOrEqualTo(String value) {
            addCriterion("fromIndex <=", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLike(String value) {
            addCriterion("fromIndex like", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotLike(String value) {
            addCriterion("fromIndex not like", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexIn(List<String> values) {
            addCriterion("fromIndex in", values, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotIn(List<String> values) {
            addCriterion("fromIndex not in", values, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexBetween(String value1, String value2) {
            addCriterion("fromIndex between", value1, value2, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotBetween(String value1, String value2) {
            addCriterion("fromIndex not between", value1, value2, "fromindex");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIsNull() {
            addCriterion("isBlacklist is null");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIsNotNull() {
            addCriterion("isBlacklist is not null");
            return (Criteria) this;
        }

        public Criteria andIsblacklistEqualTo(Integer value) {
            addCriterion("isBlacklist =", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotEqualTo(Integer value) {
            addCriterion("isBlacklist <>", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistGreaterThan(Integer value) {
            addCriterion("isBlacklist >", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBlacklist >=", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistLessThan(Integer value) {
            addCriterion("isBlacklist <", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistLessThanOrEqualTo(Integer value) {
            addCriterion("isBlacklist <=", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIn(List<Integer> values) {
            addCriterion("isBlacklist in", values, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotIn(List<Integer> values) {
            addCriterion("isBlacklist not in", values, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistBetween(Integer value1, Integer value2) {
            addCriterion("isBlacklist between", value1, value2, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("isBlacklist not between", value1, value2, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIssyncIsNull() {
            addCriterion("isSync is null");
            return (Criteria) this;
        }

        public Criteria andIssyncIsNotNull() {
            addCriterion("isSync is not null");
            return (Criteria) this;
        }

        public Criteria andIssyncEqualTo(Boolean value) {
            addCriterion("isSync =", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncNotEqualTo(Boolean value) {
            addCriterion("isSync <>", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncGreaterThan(Boolean value) {
            addCriterion("isSync >", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSync >=", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncLessThan(Boolean value) {
            addCriterion("isSync <", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncLessThanOrEqualTo(Boolean value) {
            addCriterion("isSync <=", value, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncIn(List<Boolean> values) {
            addCriterion("isSync in", values, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncNotIn(List<Boolean> values) {
            addCriterion("isSync not in", values, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncBetween(Boolean value1, Boolean value2) {
            addCriterion("isSync between", value1, value2, "issync");
            return (Criteria) this;
        }

        public Criteria andIssyncNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSync not between", value1, value2, "issync");
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