package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KvsSoftBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KvsSoftBeanExample() {
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
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andSoftengineverIsNull() {
            addCriterion("softEngineVer is null");
            return (Criteria) this;
        }

        public Criteria andSoftengineverIsNotNull() {
            addCriterion("softEngineVer is not null");
            return (Criteria) this;
        }

        public Criteria andSoftengineverEqualTo(String value) {
            addCriterion("softEngineVer =", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverNotEqualTo(String value) {
            addCriterion("softEngineVer <>", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverGreaterThan(String value) {
            addCriterion("softEngineVer >", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverGreaterThanOrEqualTo(String value) {
            addCriterion("softEngineVer >=", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverLessThan(String value) {
            addCriterion("softEngineVer <", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverLessThanOrEqualTo(String value) {
            addCriterion("softEngineVer <=", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverLike(String value) {
            addCriterion("softEngineVer like", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverNotLike(String value) {
            addCriterion("softEngineVer not like", value, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverIn(List<String> values) {
            addCriterion("softEngineVer in", values, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverNotIn(List<String> values) {
            addCriterion("softEngineVer not in", values, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverBetween(String value1, String value2) {
            addCriterion("softEngineVer between", value1, value2, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftengineverNotBetween(String value1, String value2) {
            addCriterion("softEngineVer not between", value1, value2, "softenginever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverIsNull() {
            addCriterion("softVirusBaseVer is null");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverIsNotNull() {
            addCriterion("softVirusBaseVer is not null");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverEqualTo(String value) {
            addCriterion("softVirusBaseVer =", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverNotEqualTo(String value) {
            addCriterion("softVirusBaseVer <>", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverGreaterThan(String value) {
            addCriterion("softVirusBaseVer >", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverGreaterThanOrEqualTo(String value) {
            addCriterion("softVirusBaseVer >=", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverLessThan(String value) {
            addCriterion("softVirusBaseVer <", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverLessThanOrEqualTo(String value) {
            addCriterion("softVirusBaseVer <=", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverLike(String value) {
            addCriterion("softVirusBaseVer like", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverNotLike(String value) {
            addCriterion("softVirusBaseVer not like", value, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverIn(List<String> values) {
            addCriterion("softVirusBaseVer in", values, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverNotIn(List<String> values) {
            addCriterion("softVirusBaseVer not in", values, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverBetween(String value1, String value2) {
            addCriterion("softVirusBaseVer between", value1, value2, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andSoftvirusbaseverNotBetween(String value1, String value2) {
            addCriterion("softVirusBaseVer not between", value1, value2, "softvirusbasever");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andEngineverIsNull() {
            addCriterion("engineVer is null");
            return (Criteria) this;
        }

        public Criteria andEngineverIsNotNull() {
            addCriterion("engineVer is not null");
            return (Criteria) this;
        }

        public Criteria andEngineverEqualTo(String value) {
            addCriterion("engineVer =", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverNotEqualTo(String value) {
            addCriterion("engineVer <>", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverGreaterThan(String value) {
            addCriterion("engineVer >", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverGreaterThanOrEqualTo(String value) {
            addCriterion("engineVer >=", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverLessThan(String value) {
            addCriterion("engineVer <", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverLessThanOrEqualTo(String value) {
            addCriterion("engineVer <=", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverLike(String value) {
            addCriterion("engineVer like", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverNotLike(String value) {
            addCriterion("engineVer not like", value, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverIn(List<String> values) {
            addCriterion("engineVer in", values, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverNotIn(List<String> values) {
            addCriterion("engineVer not in", values, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverBetween(String value1, String value2) {
            addCriterion("engineVer between", value1, value2, "enginever");
            return (Criteria) this;
        }

        public Criteria andEngineverNotBetween(String value1, String value2) {
            addCriterion("engineVer not between", value1, value2, "enginever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverIsNull() {
            addCriterion("virusBaseVer is null");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverIsNotNull() {
            addCriterion("virusBaseVer is not null");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverEqualTo(String value) {
            addCriterion("virusBaseVer =", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverNotEqualTo(String value) {
            addCriterion("virusBaseVer <>", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverGreaterThan(String value) {
            addCriterion("virusBaseVer >", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverGreaterThanOrEqualTo(String value) {
            addCriterion("virusBaseVer >=", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverLessThan(String value) {
            addCriterion("virusBaseVer <", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverLessThanOrEqualTo(String value) {
            addCriterion("virusBaseVer <=", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverLike(String value) {
            addCriterion("virusBaseVer like", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverNotLike(String value) {
            addCriterion("virusBaseVer not like", value, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverIn(List<String> values) {
            addCriterion("virusBaseVer in", values, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverNotIn(List<String> values) {
            addCriterion("virusBaseVer not in", values, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverBetween(String value1, String value2) {
            addCriterion("virusBaseVer between", value1, value2, "virusbasever");
            return (Criteria) this;
        }

        public Criteria andVirusbaseverNotBetween(String value1, String value2) {
            addCriterion("virusBaseVer not between", value1, value2, "virusbasever");
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