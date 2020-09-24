package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

import java.util.ArrayList;
import java.util.List;

public class ServerBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerBeanExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStDomainIsNull() {
            addCriterion("st_domain is null");
            return (Criteria) this;
        }

        public Criteria andStDomainIsNotNull() {
            addCriterion("st_domain is not null");
            return (Criteria) this;
        }

        public Criteria andStDomainEqualTo(String value) {
            addCriterion("st_domain =", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainNotEqualTo(String value) {
            addCriterion("st_domain <>", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainGreaterThan(String value) {
            addCriterion("st_domain >", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainGreaterThanOrEqualTo(String value) {
            addCriterion("st_domain >=", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainLessThan(String value) {
            addCriterion("st_domain <", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainLessThanOrEqualTo(String value) {
            addCriterion("st_domain <=", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainLike(String value) {
            addCriterion("st_domain like", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainNotLike(String value) {
            addCriterion("st_domain not like", value, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainIn(List<String> values) {
            addCriterion("st_domain in", values, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainNotIn(List<String> values) {
            addCriterion("st_domain not in", values, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainBetween(String value1, String value2) {
            addCriterion("st_domain between", value1, value2, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDomainNotBetween(String value1, String value2) {
            addCriterion("st_domain not between", value1, value2, "stDomain");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdIsNull() {
            addCriterion("st_ddio1_app_id is null");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdIsNotNull() {
            addCriterion("st_ddio1_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdEqualTo(String value) {
            addCriterion("st_ddio1_app_id =", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdNotEqualTo(String value) {
            addCriterion("st_ddio1_app_id <>", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdGreaterThan(String value) {
            addCriterion("st_ddio1_app_id >", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdGreaterThanOrEqualTo(String value) {
            addCriterion("st_ddio1_app_id >=", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdLessThan(String value) {
            addCriterion("st_ddio1_app_id <", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdLessThanOrEqualTo(String value) {
            addCriterion("st_ddio1_app_id <=", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdLike(String value) {
            addCriterion("st_ddio1_app_id like", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdNotLike(String value) {
            addCriterion("st_ddio1_app_id not like", value, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdIn(List<String> values) {
            addCriterion("st_ddio1_app_id in", values, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdNotIn(List<String> values) {
            addCriterion("st_ddio1_app_id not in", values, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdBetween(String value1, String value2) {
            addCriterion("st_ddio1_app_id between", value1, value2, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppIdNotBetween(String value1, String value2) {
            addCriterion("st_ddio1_app_id not between", value1, value2, "stDdio1AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretIsNull() {
            addCriterion("st_ddio1_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretIsNotNull() {
            addCriterion("st_ddio1_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretEqualTo(String value) {
            addCriterion("st_ddio1_app_secret =", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretNotEqualTo(String value) {
            addCriterion("st_ddio1_app_secret <>", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretGreaterThan(String value) {
            addCriterion("st_ddio1_app_secret >", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("st_ddio1_app_secret >=", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretLessThan(String value) {
            addCriterion("st_ddio1_app_secret <", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretLessThanOrEqualTo(String value) {
            addCriterion("st_ddio1_app_secret <=", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretLike(String value) {
            addCriterion("st_ddio1_app_secret like", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretNotLike(String value) {
            addCriterion("st_ddio1_app_secret not like", value, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretIn(List<String> values) {
            addCriterion("st_ddio1_app_secret in", values, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretNotIn(List<String> values) {
            addCriterion("st_ddio1_app_secret not in", values, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretBetween(String value1, String value2) {
            addCriterion("st_ddio1_app_secret between", value1, value2, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio1AppSecretNotBetween(String value1, String value2) {
            addCriterion("st_ddio1_app_secret not between", value1, value2, "stDdio1AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdIsNull() {
            addCriterion("st_ddio2_app_id is null");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdIsNotNull() {
            addCriterion("st_ddio2_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdEqualTo(String value) {
            addCriterion("st_ddio2_app_id =", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdNotEqualTo(String value) {
            addCriterion("st_ddio2_app_id <>", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdGreaterThan(String value) {
            addCriterion("st_ddio2_app_id >", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdGreaterThanOrEqualTo(String value) {
            addCriterion("st_ddio2_app_id >=", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdLessThan(String value) {
            addCriterion("st_ddio2_app_id <", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdLessThanOrEqualTo(String value) {
            addCriterion("st_ddio2_app_id <=", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdLike(String value) {
            addCriterion("st_ddio2_app_id like", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdNotLike(String value) {
            addCriterion("st_ddio2_app_id not like", value, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdIn(List<String> values) {
            addCriterion("st_ddio2_app_id in", values, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdNotIn(List<String> values) {
            addCriterion("st_ddio2_app_id not in", values, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdBetween(String value1, String value2) {
            addCriterion("st_ddio2_app_id between", value1, value2, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppIdNotBetween(String value1, String value2) {
            addCriterion("st_ddio2_app_id not between", value1, value2, "stDdio2AppId");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretIsNull() {
            addCriterion("st_ddio2_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretIsNotNull() {
            addCriterion("st_ddio2_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretEqualTo(String value) {
            addCriterion("st_ddio2_app_secret =", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretNotEqualTo(String value) {
            addCriterion("st_ddio2_app_secret <>", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretGreaterThan(String value) {
            addCriterion("st_ddio2_app_secret >", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("st_ddio2_app_secret >=", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretLessThan(String value) {
            addCriterion("st_ddio2_app_secret <", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretLessThanOrEqualTo(String value) {
            addCriterion("st_ddio2_app_secret <=", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretLike(String value) {
            addCriterion("st_ddio2_app_secret like", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretNotLike(String value) {
            addCriterion("st_ddio2_app_secret not like", value, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretIn(List<String> values) {
            addCriterion("st_ddio2_app_secret in", values, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretNotIn(List<String> values) {
            addCriterion("st_ddio2_app_secret not in", values, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretBetween(String value1, String value2) {
            addCriterion("st_ddio2_app_secret between", value1, value2, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStDdio2AppSecretNotBetween(String value1, String value2) {
            addCriterion("st_ddio2_app_secret not between", value1, value2, "stDdio2AppSecret");
            return (Criteria) this;
        }

        public Criteria andStParam1IsNull() {
            addCriterion("st_param1 is null");
            return (Criteria) this;
        }

        public Criteria andStParam1IsNotNull() {
            addCriterion("st_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andStParam1EqualTo(String value) {
            addCriterion("st_param1 =", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1NotEqualTo(String value) {
            addCriterion("st_param1 <>", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1GreaterThan(String value) {
            addCriterion("st_param1 >", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1GreaterThanOrEqualTo(String value) {
            addCriterion("st_param1 >=", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1LessThan(String value) {
            addCriterion("st_param1 <", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1LessThanOrEqualTo(String value) {
            addCriterion("st_param1 <=", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1Like(String value) {
            addCriterion("st_param1 like", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1NotLike(String value) {
            addCriterion("st_param1 not like", value, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1In(List<String> values) {
            addCriterion("st_param1 in", values, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1NotIn(List<String> values) {
            addCriterion("st_param1 not in", values, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1Between(String value1, String value2) {
            addCriterion("st_param1 between", value1, value2, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam1NotBetween(String value1, String value2) {
            addCriterion("st_param1 not between", value1, value2, "stParam1");
            return (Criteria) this;
        }

        public Criteria andStParam2IsNull() {
            addCriterion("st_param2 is null");
            return (Criteria) this;
        }

        public Criteria andStParam2IsNotNull() {
            addCriterion("st_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andStParam2EqualTo(String value) {
            addCriterion("st_param2 =", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2NotEqualTo(String value) {
            addCriterion("st_param2 <>", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2GreaterThan(String value) {
            addCriterion("st_param2 >", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2GreaterThanOrEqualTo(String value) {
            addCriterion("st_param2 >=", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2LessThan(String value) {
            addCriterion("st_param2 <", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2LessThanOrEqualTo(String value) {
            addCriterion("st_param2 <=", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2Like(String value) {
            addCriterion("st_param2 like", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2NotLike(String value) {
            addCriterion("st_param2 not like", value, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2In(List<String> values) {
            addCriterion("st_param2 in", values, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2NotIn(List<String> values) {
            addCriterion("st_param2 not in", values, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2Between(String value1, String value2) {
            addCriterion("st_param2 between", value1, value2, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam2NotBetween(String value1, String value2) {
            addCriterion("st_param2 not between", value1, value2, "stParam2");
            return (Criteria) this;
        }

        public Criteria andStParam3IsNull() {
            addCriterion("st_param3 is null");
            return (Criteria) this;
        }

        public Criteria andStParam3IsNotNull() {
            addCriterion("st_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andStParam3EqualTo(String value) {
            addCriterion("st_param3 =", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3NotEqualTo(String value) {
            addCriterion("st_param3 <>", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3GreaterThan(String value) {
            addCriterion("st_param3 >", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3GreaterThanOrEqualTo(String value) {
            addCriterion("st_param3 >=", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3LessThan(String value) {
            addCriterion("st_param3 <", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3LessThanOrEqualTo(String value) {
            addCriterion("st_param3 <=", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3Like(String value) {
            addCriterion("st_param3 like", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3NotLike(String value) {
            addCriterion("st_param3 not like", value, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3In(List<String> values) {
            addCriterion("st_param3 in", values, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3NotIn(List<String> values) {
            addCriterion("st_param3 not in", values, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3Between(String value1, String value2) {
            addCriterion("st_param3 between", value1, value2, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam3NotBetween(String value1, String value2) {
            addCriterion("st_param3 not between", value1, value2, "stParam3");
            return (Criteria) this;
        }

        public Criteria andStParam4IsNull() {
            addCriterion("st_param4 is null");
            return (Criteria) this;
        }

        public Criteria andStParam4IsNotNull() {
            addCriterion("st_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andStParam4EqualTo(String value) {
            addCriterion("st_param4 =", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4NotEqualTo(String value) {
            addCriterion("st_param4 <>", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4GreaterThan(String value) {
            addCriterion("st_param4 >", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4GreaterThanOrEqualTo(String value) {
            addCriterion("st_param4 >=", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4LessThan(String value) {
            addCriterion("st_param4 <", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4LessThanOrEqualTo(String value) {
            addCriterion("st_param4 <=", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4Like(String value) {
            addCriterion("st_param4 like", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4NotLike(String value) {
            addCriterion("st_param4 not like", value, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4In(List<String> values) {
            addCriterion("st_param4 in", values, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4NotIn(List<String> values) {
            addCriterion("st_param4 not in", values, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4Between(String value1, String value2) {
            addCriterion("st_param4 between", value1, value2, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam4NotBetween(String value1, String value2) {
            addCriterion("st_param4 not between", value1, value2, "stParam4");
            return (Criteria) this;
        }

        public Criteria andStParam5IsNull() {
            addCriterion("st_param5 is null");
            return (Criteria) this;
        }

        public Criteria andStParam5IsNotNull() {
            addCriterion("st_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andStParam5EqualTo(String value) {
            addCriterion("st_param5 =", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5NotEqualTo(String value) {
            addCriterion("st_param5 <>", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5GreaterThan(String value) {
            addCriterion("st_param5 >", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5GreaterThanOrEqualTo(String value) {
            addCriterion("st_param5 >=", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5LessThan(String value) {
            addCriterion("st_param5 <", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5LessThanOrEqualTo(String value) {
            addCriterion("st_param5 <=", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5Like(String value) {
            addCriterion("st_param5 like", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5NotLike(String value) {
            addCriterion("st_param5 not like", value, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5In(List<String> values) {
            addCriterion("st_param5 in", values, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5NotIn(List<String> values) {
            addCriterion("st_param5 not in", values, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5Between(String value1, String value2) {
            addCriterion("st_param5 between", value1, value2, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStParam5NotBetween(String value1, String value2) {
            addCriterion("st_param5 not between", value1, value2, "stParam5");
            return (Criteria) this;
        }

        public Criteria andStStatusIsNull() {
            addCriterion("st_status is null");
            return (Criteria) this;
        }

        public Criteria andStStatusIsNotNull() {
            addCriterion("st_status is not null");
            return (Criteria) this;
        }

        public Criteria andStStatusEqualTo(Integer value) {
            addCriterion("st_status =", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusNotEqualTo(Integer value) {
            addCriterion("st_status <>", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusGreaterThan(Integer value) {
            addCriterion("st_status >", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_status >=", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusLessThan(Integer value) {
            addCriterion("st_status <", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusLessThanOrEqualTo(Integer value) {
            addCriterion("st_status <=", value, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusIn(List<Integer> values) {
            addCriterion("st_status in", values, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusNotIn(List<Integer> values) {
            addCriterion("st_status not in", values, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusBetween(Integer value1, Integer value2) {
            addCriterion("st_status between", value1, value2, "stStatus");
            return (Criteria) this;
        }

        public Criteria andStStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("st_status not between", value1, value2, "stStatus");
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