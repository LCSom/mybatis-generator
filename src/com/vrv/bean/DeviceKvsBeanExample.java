package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceKvsBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceKvsBeanExample() {
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

        public Criteria andKvsnameIsNull() {
            addCriterion("kvsName is null");
            return (Criteria) this;
        }

        public Criteria andKvsnameIsNotNull() {
            addCriterion("kvsName is not null");
            return (Criteria) this;
        }

        public Criteria andKvsnameEqualTo(String value) {
            addCriterion("kvsName =", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameNotEqualTo(String value) {
            addCriterion("kvsName <>", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameGreaterThan(String value) {
            addCriterion("kvsName >", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameGreaterThanOrEqualTo(String value) {
            addCriterion("kvsName >=", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameLessThan(String value) {
            addCriterion("kvsName <", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameLessThanOrEqualTo(String value) {
            addCriterion("kvsName <=", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameLike(String value) {
            addCriterion("kvsName like", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameNotLike(String value) {
            addCriterion("kvsName not like", value, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameIn(List<String> values) {
            addCriterion("kvsName in", values, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameNotIn(List<String> values) {
            addCriterion("kvsName not in", values, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameBetween(String value1, String value2) {
            addCriterion("kvsName between", value1, value2, "kvsname");
            return (Criteria) this;
        }

        public Criteria andKvsnameNotBetween(String value1, String value2) {
            addCriterion("kvsName not between", value1, value2, "kvsname");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andDesinfoIsNull() {
            addCriterion("desInfo is null");
            return (Criteria) this;
        }

        public Criteria andDesinfoIsNotNull() {
            addCriterion("desInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDesinfoEqualTo(String value) {
            addCriterion("desInfo =", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoNotEqualTo(String value) {
            addCriterion("desInfo <>", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoGreaterThan(String value) {
            addCriterion("desInfo >", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoGreaterThanOrEqualTo(String value) {
            addCriterion("desInfo >=", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoLessThan(String value) {
            addCriterion("desInfo <", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoLessThanOrEqualTo(String value) {
            addCriterion("desInfo <=", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoLike(String value) {
            addCriterion("desInfo like", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoNotLike(String value) {
            addCriterion("desInfo not like", value, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoIn(List<String> values) {
            addCriterion("desInfo in", values, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoNotIn(List<String> values) {
            addCriterion("desInfo not in", values, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoBetween(String value1, String value2) {
            addCriterion("desInfo between", value1, value2, "desinfo");
            return (Criteria) this;
        }

        public Criteria andDesinfoNotBetween(String value1, String value2) {
            addCriterion("desInfo not between", value1, value2, "desinfo");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKvsversionIsNull() {
            addCriterion("kvsVersion is null");
            return (Criteria) this;
        }

        public Criteria andKvsversionIsNotNull() {
            addCriterion("kvsVersion is not null");
            return (Criteria) this;
        }

        public Criteria andKvsversionEqualTo(String value) {
            addCriterion("kvsVersion =", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionNotEqualTo(String value) {
            addCriterion("kvsVersion <>", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionGreaterThan(String value) {
            addCriterion("kvsVersion >", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionGreaterThanOrEqualTo(String value) {
            addCriterion("kvsVersion >=", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionLessThan(String value) {
            addCriterion("kvsVersion <", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionLessThanOrEqualTo(String value) {
            addCriterion("kvsVersion <=", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionLike(String value) {
            addCriterion("kvsVersion like", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionNotLike(String value) {
            addCriterion("kvsVersion not like", value, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionIn(List<String> values) {
            addCriterion("kvsVersion in", values, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionNotIn(List<String> values) {
            addCriterion("kvsVersion not in", values, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionBetween(String value1, String value2) {
            addCriterion("kvsVersion between", value1, value2, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsversionNotBetween(String value1, String value2) {
            addCriterion("kvsVersion not between", value1, value2, "kvsversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionIsNull() {
            addCriterion("kvsEngineVersion is null");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionIsNotNull() {
            addCriterion("kvsEngineVersion is not null");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionEqualTo(String value) {
            addCriterion("kvsEngineVersion =", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionNotEqualTo(String value) {
            addCriterion("kvsEngineVersion <>", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionGreaterThan(String value) {
            addCriterion("kvsEngineVersion >", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionGreaterThanOrEqualTo(String value) {
            addCriterion("kvsEngineVersion >=", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionLessThan(String value) {
            addCriterion("kvsEngineVersion <", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionLessThanOrEqualTo(String value) {
            addCriterion("kvsEngineVersion <=", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionLike(String value) {
            addCriterion("kvsEngineVersion like", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionNotLike(String value) {
            addCriterion("kvsEngineVersion not like", value, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionIn(List<String> values) {
            addCriterion("kvsEngineVersion in", values, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionNotIn(List<String> values) {
            addCriterion("kvsEngineVersion not in", values, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionBetween(String value1, String value2) {
            addCriterion("kvsEngineVersion between", value1, value2, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvsengineversionNotBetween(String value1, String value2) {
            addCriterion("kvsEngineVersion not between", value1, value2, "kvsengineversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionIsNull() {
            addCriterion("kvsLibVersion is null");
            return (Criteria) this;
        }

        public Criteria andKvslibversionIsNotNull() {
            addCriterion("kvsLibVersion is not null");
            return (Criteria) this;
        }

        public Criteria andKvslibversionEqualTo(String value) {
            addCriterion("kvsLibVersion =", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionNotEqualTo(String value) {
            addCriterion("kvsLibVersion <>", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionGreaterThan(String value) {
            addCriterion("kvsLibVersion >", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionGreaterThanOrEqualTo(String value) {
            addCriterion("kvsLibVersion >=", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionLessThan(String value) {
            addCriterion("kvsLibVersion <", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionLessThanOrEqualTo(String value) {
            addCriterion("kvsLibVersion <=", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionLike(String value) {
            addCriterion("kvsLibVersion like", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionNotLike(String value) {
            addCriterion("kvsLibVersion not like", value, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionIn(List<String> values) {
            addCriterion("kvsLibVersion in", values, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionNotIn(List<String> values) {
            addCriterion("kvsLibVersion not in", values, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionBetween(String value1, String value2) {
            addCriterion("kvsLibVersion between", value1, value2, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andKvslibversionNotBetween(String value1, String value2) {
            addCriterion("kvsLibVersion not between", value1, value2, "kvslibversion");
            return (Criteria) this;
        }

        public Criteria andInstallpathIsNull() {
            addCriterion("installPath is null");
            return (Criteria) this;
        }

        public Criteria andInstallpathIsNotNull() {
            addCriterion("installPath is not null");
            return (Criteria) this;
        }

        public Criteria andInstallpathEqualTo(String value) {
            addCriterion("installPath =", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathNotEqualTo(String value) {
            addCriterion("installPath <>", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathGreaterThan(String value) {
            addCriterion("installPath >", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathGreaterThanOrEqualTo(String value) {
            addCriterion("installPath >=", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathLessThan(String value) {
            addCriterion("installPath <", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathLessThanOrEqualTo(String value) {
            addCriterion("installPath <=", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathLike(String value) {
            addCriterion("installPath like", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathNotLike(String value) {
            addCriterion("installPath not like", value, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathIn(List<String> values) {
            addCriterion("installPath in", values, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathNotIn(List<String> values) {
            addCriterion("installPath not in", values, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathBetween(String value1, String value2) {
            addCriterion("installPath between", value1, value2, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstallpathNotBetween(String value1, String value2) {
            addCriterion("installPath not between", value1, value2, "installpath");
            return (Criteria) this;
        }

        public Criteria andInstalltimeIsNull() {
            addCriterion("installTIME is null");
            return (Criteria) this;
        }

        public Criteria andInstalltimeIsNotNull() {
            addCriterion("installTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInstalltimeEqualTo(Date value) {
            addCriterion("installTIME =", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotEqualTo(Date value) {
            addCriterion("installTIME <>", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeGreaterThan(Date value) {
            addCriterion("installTIME >", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("installTIME >=", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeLessThan(Date value) {
            addCriterion("installTIME <", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeLessThanOrEqualTo(Date value) {
            addCriterion("installTIME <=", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeIn(List<Date> values) {
            addCriterion("installTIME in", values, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotIn(List<Date> values) {
            addCriterion("installTIME not in", values, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeBetween(Date value1, Date value2) {
            addCriterion("installTIME between", value1, value2, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotBetween(Date value1, Date value2) {
            addCriterion("installTIME not between", value1, value2, "installtime");
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