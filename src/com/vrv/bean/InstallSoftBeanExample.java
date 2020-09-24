package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstallSoftBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstallSoftBeanExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sId =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sId <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sId >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sId >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sId <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sId <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sId like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sId not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sId in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sId not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sId between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sId not between", value1, value2, "sid");
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

        public Criteria andWow64IsNull() {
            addCriterion("wow64 is null");
            return (Criteria) this;
        }

        public Criteria andWow64IsNotNull() {
            addCriterion("wow64 is not null");
            return (Criteria) this;
        }

        public Criteria andWow64EqualTo(Integer value) {
            addCriterion("wow64 =", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64NotEqualTo(Integer value) {
            addCriterion("wow64 <>", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64GreaterThan(Integer value) {
            addCriterion("wow64 >", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64GreaterThanOrEqualTo(Integer value) {
            addCriterion("wow64 >=", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64LessThan(Integer value) {
            addCriterion("wow64 <", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64LessThanOrEqualTo(Integer value) {
            addCriterion("wow64 <=", value, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64In(List<Integer> values) {
            addCriterion("wow64 in", values, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64NotIn(List<Integer> values) {
            addCriterion("wow64 not in", values, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64Between(Integer value1, Integer value2) {
            addCriterion("wow64 between", value1, value2, "wow64");
            return (Criteria) this;
        }

        public Criteria andWow64NotBetween(Integer value1, Integer value2) {
            addCriterion("wow64 not between", value1, value2, "wow64");
            return (Criteria) this;
        }

        public Criteria andRegguidIsNull() {
            addCriterion("regguid is null");
            return (Criteria) this;
        }

        public Criteria andRegguidIsNotNull() {
            addCriterion("regguid is not null");
            return (Criteria) this;
        }

        public Criteria andRegguidEqualTo(String value) {
            addCriterion("regguid =", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidNotEqualTo(String value) {
            addCriterion("regguid <>", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidGreaterThan(String value) {
            addCriterion("regguid >", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidGreaterThanOrEqualTo(String value) {
            addCriterion("regguid >=", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidLessThan(String value) {
            addCriterion("regguid <", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidLessThanOrEqualTo(String value) {
            addCriterion("regguid <=", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidLike(String value) {
            addCriterion("regguid like", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidNotLike(String value) {
            addCriterion("regguid not like", value, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidIn(List<String> values) {
            addCriterion("regguid in", values, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidNotIn(List<String> values) {
            addCriterion("regguid not in", values, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidBetween(String value1, String value2) {
            addCriterion("regguid between", value1, value2, "regguid");
            return (Criteria) this;
        }

        public Criteria andRegguidNotBetween(String value1, String value2) {
            addCriterion("regguid not between", value1, value2, "regguid");
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
            addCriterion("installTime is null");
            return (Criteria) this;
        }

        public Criteria andInstalltimeIsNotNull() {
            addCriterion("installTime is not null");
            return (Criteria) this;
        }

        public Criteria andInstalltimeEqualTo(Date value) {
            addCriterion("installTime =", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotEqualTo(Date value) {
            addCriterion("installTime <>", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeGreaterThan(Date value) {
            addCriterion("installTime >", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("installTime >=", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeLessThan(Date value) {
            addCriterion("installTime <", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeLessThanOrEqualTo(Date value) {
            addCriterion("installTime <=", value, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeIn(List<Date> values) {
            addCriterion("installTime in", values, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotIn(List<Date> values) {
            addCriterion("installTime not in", values, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeBetween(Date value1, Date value2) {
            addCriterion("installTime between", value1, value2, "installtime");
            return (Criteria) this;
        }

        public Criteria andInstalltimeNotBetween(Date value1, Date value2) {
            addCriterion("installTime not between", value1, value2, "installtime");
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

        public Criteria andUninstallpathIsNull() {
            addCriterion("uninstallPath is null");
            return (Criteria) this;
        }

        public Criteria andUninstallpathIsNotNull() {
            addCriterion("uninstallPath is not null");
            return (Criteria) this;
        }

        public Criteria andUninstallpathEqualTo(String value) {
            addCriterion("uninstallPath =", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathNotEqualTo(String value) {
            addCriterion("uninstallPath <>", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathGreaterThan(String value) {
            addCriterion("uninstallPath >", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathGreaterThanOrEqualTo(String value) {
            addCriterion("uninstallPath >=", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathLessThan(String value) {
            addCriterion("uninstallPath <", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathLessThanOrEqualTo(String value) {
            addCriterion("uninstallPath <=", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathLike(String value) {
            addCriterion("uninstallPath like", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathNotLike(String value) {
            addCriterion("uninstallPath not like", value, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathIn(List<String> values) {
            addCriterion("uninstallPath in", values, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathNotIn(List<String> values) {
            addCriterion("uninstallPath not in", values, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathBetween(String value1, String value2) {
            addCriterion("uninstallPath between", value1, value2, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andUninstallpathNotBetween(String value1, String value2) {
            addCriterion("uninstallPath not between", value1, value2, "uninstallpath");
            return (Criteria) this;
        }

        public Criteria andStandardflagIsNull() {
            addCriterion("standardFlag is null");
            return (Criteria) this;
        }

        public Criteria andStandardflagIsNotNull() {
            addCriterion("standardFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStandardflagEqualTo(Integer value) {
            addCriterion("standardFlag =", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagNotEqualTo(Integer value) {
            addCriterion("standardFlag <>", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagGreaterThan(Integer value) {
            addCriterion("standardFlag >", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("standardFlag >=", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagLessThan(Integer value) {
            addCriterion("standardFlag <", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagLessThanOrEqualTo(Integer value) {
            addCriterion("standardFlag <=", value, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagIn(List<Integer> values) {
            addCriterion("standardFlag in", values, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagNotIn(List<Integer> values) {
            addCriterion("standardFlag not in", values, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagBetween(Integer value1, Integer value2) {
            addCriterion("standardFlag between", value1, value2, "standardflag");
            return (Criteria) this;
        }

        public Criteria andStandardflagNotBetween(Integer value1, Integer value2) {
            addCriterion("standardFlag not between", value1, value2, "standardflag");
            return (Criteria) this;
        }

        public Criteria andSoftidIsNull() {
            addCriterion("softId is null");
            return (Criteria) this;
        }

        public Criteria andSoftidIsNotNull() {
            addCriterion("softId is not null");
            return (Criteria) this;
        }

        public Criteria andSoftidEqualTo(String value) {
            addCriterion("softId =", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotEqualTo(String value) {
            addCriterion("softId <>", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidGreaterThan(String value) {
            addCriterion("softId >", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidGreaterThanOrEqualTo(String value) {
            addCriterion("softId >=", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLessThan(String value) {
            addCriterion("softId <", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLessThanOrEqualTo(String value) {
            addCriterion("softId <=", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLike(String value) {
            addCriterion("softId like", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotLike(String value) {
            addCriterion("softId not like", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidIn(List<String> values) {
            addCriterion("softId in", values, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotIn(List<String> values) {
            addCriterion("softId not in", values, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidBetween(String value1, String value2) {
            addCriterion("softId between", value1, value2, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotBetween(String value1, String value2) {
            addCriterion("softId not between", value1, value2, "softid");
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