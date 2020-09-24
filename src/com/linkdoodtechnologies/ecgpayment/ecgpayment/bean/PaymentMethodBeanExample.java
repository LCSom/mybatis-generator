package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentMethodBeanExample() {
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

        public Criteria andPmtIdIsNull() {
            addCriterion("pmt_id is null");
            return (Criteria) this;
        }

        public Criteria andPmtIdIsNotNull() {
            addCriterion("pmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmtIdEqualTo(Integer value) {
            addCriterion("pmt_id =", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdNotEqualTo(Integer value) {
            addCriterion("pmt_id <>", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdGreaterThan(Integer value) {
            addCriterion("pmt_id >", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmt_id >=", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdLessThan(Integer value) {
            addCriterion("pmt_id <", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pmt_id <=", value, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdIn(List<Integer> values) {
            addCriterion("pmt_id in", values, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdNotIn(List<Integer> values) {
            addCriterion("pmt_id not in", values, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdBetween(Integer value1, Integer value2) {
            addCriterion("pmt_id between", value1, value2, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pmt_id not between", value1, value2, "pmtId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdIsNull() {
            addCriterion("pmt_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdIsNotNull() {
            addCriterion("pmt_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdEqualTo(String value) {
            addCriterion("pmt_att_id =", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdNotEqualTo(String value) {
            addCriterion("pmt_att_id <>", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdGreaterThan(String value) {
            addCriterion("pmt_att_id >", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_att_id >=", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdLessThan(String value) {
            addCriterion("pmt_att_id <", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdLessThanOrEqualTo(String value) {
            addCriterion("pmt_att_id <=", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdLike(String value) {
            addCriterion("pmt_att_id like", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdNotLike(String value) {
            addCriterion("pmt_att_id not like", value, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdIn(List<String> values) {
            addCriterion("pmt_att_id in", values, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdNotIn(List<String> values) {
            addCriterion("pmt_att_id not in", values, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdBetween(String value1, String value2) {
            addCriterion("pmt_att_id between", value1, value2, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtAttIdNotBetween(String value1, String value2) {
            addCriterion("pmt_att_id not between", value1, value2, "pmtAttId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdIsNull() {
            addCriterion("pmt_unique_id is null");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdIsNotNull() {
            addCriterion("pmt_unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdEqualTo(String value) {
            addCriterion("pmt_unique_id =", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdNotEqualTo(String value) {
            addCriterion("pmt_unique_id <>", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdGreaterThan(String value) {
            addCriterion("pmt_unique_id >", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_unique_id >=", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdLessThan(String value) {
            addCriterion("pmt_unique_id <", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("pmt_unique_id <=", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdLike(String value) {
            addCriterion("pmt_unique_id like", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdNotLike(String value) {
            addCriterion("pmt_unique_id not like", value, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdIn(List<String> values) {
            addCriterion("pmt_unique_id in", values, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdNotIn(List<String> values) {
            addCriterion("pmt_unique_id not in", values, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdBetween(String value1, String value2) {
            addCriterion("pmt_unique_id between", value1, value2, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtUniqueIdNotBetween(String value1, String value2) {
            addCriterion("pmt_unique_id not between", value1, value2, "pmtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPmtTypeIsNull() {
            addCriterion("pmt_type is null");
            return (Criteria) this;
        }

        public Criteria andPmtTypeIsNotNull() {
            addCriterion("pmt_type is not null");
            return (Criteria) this;
        }

        public Criteria andPmtTypeEqualTo(String value) {
            addCriterion("pmt_type =", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeNotEqualTo(String value) {
            addCriterion("pmt_type <>", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeGreaterThan(String value) {
            addCriterion("pmt_type >", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_type >=", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeLessThan(String value) {
            addCriterion("pmt_type <", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeLessThanOrEqualTo(String value) {
            addCriterion("pmt_type <=", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeLike(String value) {
            addCriterion("pmt_type like", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeNotLike(String value) {
            addCriterion("pmt_type not like", value, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeIn(List<String> values) {
            addCriterion("pmt_type in", values, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeNotIn(List<String> values) {
            addCriterion("pmt_type not in", values, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeBetween(String value1, String value2) {
            addCriterion("pmt_type between", value1, value2, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtTypeNotBetween(String value1, String value2) {
            addCriterion("pmt_type not between", value1, value2, "pmtType");
            return (Criteria) this;
        }

        public Criteria andPmtNameIsNull() {
            addCriterion("pmt_name is null");
            return (Criteria) this;
        }

        public Criteria andPmtNameIsNotNull() {
            addCriterion("pmt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPmtNameEqualTo(String value) {
            addCriterion("pmt_name =", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameNotEqualTo(String value) {
            addCriterion("pmt_name <>", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameGreaterThan(String value) {
            addCriterion("pmt_name >", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_name >=", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameLessThan(String value) {
            addCriterion("pmt_name <", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameLessThanOrEqualTo(String value) {
            addCriterion("pmt_name <=", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameLike(String value) {
            addCriterion("pmt_name like", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameNotLike(String value) {
            addCriterion("pmt_name not like", value, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameIn(List<String> values) {
            addCriterion("pmt_name in", values, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameNotIn(List<String> values) {
            addCriterion("pmt_name not in", values, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameBetween(String value1, String value2) {
            addCriterion("pmt_name between", value1, value2, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtNameNotBetween(String value1, String value2) {
            addCriterion("pmt_name not between", value1, value2, "pmtName");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdIsNull() {
            addCriterion("pmt_app_id is null");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdIsNotNull() {
            addCriterion("pmt_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdEqualTo(String value) {
            addCriterion("pmt_app_id =", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdNotEqualTo(String value) {
            addCriterion("pmt_app_id <>", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdGreaterThan(String value) {
            addCriterion("pmt_app_id >", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_app_id >=", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdLessThan(String value) {
            addCriterion("pmt_app_id <", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdLessThanOrEqualTo(String value) {
            addCriterion("pmt_app_id <=", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdLike(String value) {
            addCriterion("pmt_app_id like", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdNotLike(String value) {
            addCriterion("pmt_app_id not like", value, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdIn(List<String> values) {
            addCriterion("pmt_app_id in", values, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdNotIn(List<String> values) {
            addCriterion("pmt_app_id not in", values, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdBetween(String value1, String value2) {
            addCriterion("pmt_app_id between", value1, value2, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppIdNotBetween(String value1, String value2) {
            addCriterion("pmt_app_id not between", value1, value2, "pmtAppId");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretIsNull() {
            addCriterion("pmt_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretIsNotNull() {
            addCriterion("pmt_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretEqualTo(String value) {
            addCriterion("pmt_app_secret =", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretNotEqualTo(String value) {
            addCriterion("pmt_app_secret <>", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretGreaterThan(String value) {
            addCriterion("pmt_app_secret >", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_app_secret >=", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretLessThan(String value) {
            addCriterion("pmt_app_secret <", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretLessThanOrEqualTo(String value) {
            addCriterion("pmt_app_secret <=", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretLike(String value) {
            addCriterion("pmt_app_secret like", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretNotLike(String value) {
            addCriterion("pmt_app_secret not like", value, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretIn(List<String> values) {
            addCriterion("pmt_app_secret in", values, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretNotIn(List<String> values) {
            addCriterion("pmt_app_secret not in", values, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretBetween(String value1, String value2) {
            addCriterion("pmt_app_secret between", value1, value2, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtAppSecretNotBetween(String value1, String value2) {
            addCriterion("pmt_app_secret not between", value1, value2, "pmtAppSecret");
            return (Criteria) this;
        }

        public Criteria andPmtUrlIsNull() {
            addCriterion("pmt_url is null");
            return (Criteria) this;
        }

        public Criteria andPmtUrlIsNotNull() {
            addCriterion("pmt_url is not null");
            return (Criteria) this;
        }

        public Criteria andPmtUrlEqualTo(String value) {
            addCriterion("pmt_url =", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlNotEqualTo(String value) {
            addCriterion("pmt_url <>", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlGreaterThan(String value) {
            addCriterion("pmt_url >", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_url >=", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlLessThan(String value) {
            addCriterion("pmt_url <", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlLessThanOrEqualTo(String value) {
            addCriterion("pmt_url <=", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlLike(String value) {
            addCriterion("pmt_url like", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlNotLike(String value) {
            addCriterion("pmt_url not like", value, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlIn(List<String> values) {
            addCriterion("pmt_url in", values, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlNotIn(List<String> values) {
            addCriterion("pmt_url not in", values, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlBetween(String value1, String value2) {
            addCriterion("pmt_url between", value1, value2, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtUrlNotBetween(String value1, String value2) {
            addCriterion("pmt_url not between", value1, value2, "pmtUrl");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkIsNull() {
            addCriterion("pmt_remark is null");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkIsNotNull() {
            addCriterion("pmt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkEqualTo(String value) {
            addCriterion("pmt_remark =", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkNotEqualTo(String value) {
            addCriterion("pmt_remark <>", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkGreaterThan(String value) {
            addCriterion("pmt_remark >", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_remark >=", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkLessThan(String value) {
            addCriterion("pmt_remark <", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkLessThanOrEqualTo(String value) {
            addCriterion("pmt_remark <=", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkLike(String value) {
            addCriterion("pmt_remark like", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkNotLike(String value) {
            addCriterion("pmt_remark not like", value, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkIn(List<String> values) {
            addCriterion("pmt_remark in", values, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkNotIn(List<String> values) {
            addCriterion("pmt_remark not in", values, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkBetween(String value1, String value2) {
            addCriterion("pmt_remark between", value1, value2, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtRemarkNotBetween(String value1, String value2) {
            addCriterion("pmt_remark not between", value1, value2, "pmtRemark");
            return (Criteria) this;
        }

        public Criteria andPmtParam1IsNull() {
            addCriterion("pmt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPmtParam1IsNotNull() {
            addCriterion("pmt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPmtParam1EqualTo(String value) {
            addCriterion("pmt_param1 =", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1NotEqualTo(String value) {
            addCriterion("pmt_param1 <>", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1GreaterThan(String value) {
            addCriterion("pmt_param1 >", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("pmt_param1 >=", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1LessThan(String value) {
            addCriterion("pmt_param1 <", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1LessThanOrEqualTo(String value) {
            addCriterion("pmt_param1 <=", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1Like(String value) {
            addCriterion("pmt_param1 like", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1NotLike(String value) {
            addCriterion("pmt_param1 not like", value, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1In(List<String> values) {
            addCriterion("pmt_param1 in", values, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1NotIn(List<String> values) {
            addCriterion("pmt_param1 not in", values, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1Between(String value1, String value2) {
            addCriterion("pmt_param1 between", value1, value2, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam1NotBetween(String value1, String value2) {
            addCriterion("pmt_param1 not between", value1, value2, "pmtParam1");
            return (Criteria) this;
        }

        public Criteria andPmtParam2IsNull() {
            addCriterion("pmt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPmtParam2IsNotNull() {
            addCriterion("pmt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPmtParam2EqualTo(String value) {
            addCriterion("pmt_param2 =", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2NotEqualTo(String value) {
            addCriterion("pmt_param2 <>", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2GreaterThan(String value) {
            addCriterion("pmt_param2 >", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("pmt_param2 >=", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2LessThan(String value) {
            addCriterion("pmt_param2 <", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2LessThanOrEqualTo(String value) {
            addCriterion("pmt_param2 <=", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2Like(String value) {
            addCriterion("pmt_param2 like", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2NotLike(String value) {
            addCriterion("pmt_param2 not like", value, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2In(List<String> values) {
            addCriterion("pmt_param2 in", values, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2NotIn(List<String> values) {
            addCriterion("pmt_param2 not in", values, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2Between(String value1, String value2) {
            addCriterion("pmt_param2 between", value1, value2, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam2NotBetween(String value1, String value2) {
            addCriterion("pmt_param2 not between", value1, value2, "pmtParam2");
            return (Criteria) this;
        }

        public Criteria andPmtParam3IsNull() {
            addCriterion("pmt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPmtParam3IsNotNull() {
            addCriterion("pmt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPmtParam3EqualTo(String value) {
            addCriterion("pmt_param3 =", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3NotEqualTo(String value) {
            addCriterion("pmt_param3 <>", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3GreaterThan(String value) {
            addCriterion("pmt_param3 >", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("pmt_param3 >=", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3LessThan(String value) {
            addCriterion("pmt_param3 <", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3LessThanOrEqualTo(String value) {
            addCriterion("pmt_param3 <=", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3Like(String value) {
            addCriterion("pmt_param3 like", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3NotLike(String value) {
            addCriterion("pmt_param3 not like", value, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3In(List<String> values) {
            addCriterion("pmt_param3 in", values, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3NotIn(List<String> values) {
            addCriterion("pmt_param3 not in", values, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3Between(String value1, String value2) {
            addCriterion("pmt_param3 between", value1, value2, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam3NotBetween(String value1, String value2) {
            addCriterion("pmt_param3 not between", value1, value2, "pmtParam3");
            return (Criteria) this;
        }

        public Criteria andPmtParam4IsNull() {
            addCriterion("pmt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPmtParam4IsNotNull() {
            addCriterion("pmt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPmtParam4EqualTo(String value) {
            addCriterion("pmt_param4 =", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4NotEqualTo(String value) {
            addCriterion("pmt_param4 <>", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4GreaterThan(String value) {
            addCriterion("pmt_param4 >", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("pmt_param4 >=", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4LessThan(String value) {
            addCriterion("pmt_param4 <", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4LessThanOrEqualTo(String value) {
            addCriterion("pmt_param4 <=", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4Like(String value) {
            addCriterion("pmt_param4 like", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4NotLike(String value) {
            addCriterion("pmt_param4 not like", value, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4In(List<String> values) {
            addCriterion("pmt_param4 in", values, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4NotIn(List<String> values) {
            addCriterion("pmt_param4 not in", values, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4Between(String value1, String value2) {
            addCriterion("pmt_param4 between", value1, value2, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam4NotBetween(String value1, String value2) {
            addCriterion("pmt_param4 not between", value1, value2, "pmtParam4");
            return (Criteria) this;
        }

        public Criteria andPmtParam5IsNull() {
            addCriterion("pmt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPmtParam5IsNotNull() {
            addCriterion("pmt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPmtParam5EqualTo(String value) {
            addCriterion("pmt_param5 =", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5NotEqualTo(String value) {
            addCriterion("pmt_param5 <>", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5GreaterThan(String value) {
            addCriterion("pmt_param5 >", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("pmt_param5 >=", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5LessThan(String value) {
            addCriterion("pmt_param5 <", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5LessThanOrEqualTo(String value) {
            addCriterion("pmt_param5 <=", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5Like(String value) {
            addCriterion("pmt_param5 like", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5NotLike(String value) {
            addCriterion("pmt_param5 not like", value, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5In(List<String> values) {
            addCriterion("pmt_param5 in", values, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5NotIn(List<String> values) {
            addCriterion("pmt_param5 not in", values, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5Between(String value1, String value2) {
            addCriterion("pmt_param5 between", value1, value2, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtParam5NotBetween(String value1, String value2) {
            addCriterion("pmt_param5 not between", value1, value2, "pmtParam5");
            return (Criteria) this;
        }

        public Criteria andPmtStatusIsNull() {
            addCriterion("pmt_status is null");
            return (Criteria) this;
        }

        public Criteria andPmtStatusIsNotNull() {
            addCriterion("pmt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPmtStatusEqualTo(String value) {
            addCriterion("pmt_status =", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusNotEqualTo(String value) {
            addCriterion("pmt_status <>", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusGreaterThan(String value) {
            addCriterion("pmt_status >", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pmt_status >=", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusLessThan(String value) {
            addCriterion("pmt_status <", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusLessThanOrEqualTo(String value) {
            addCriterion("pmt_status <=", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusLike(String value) {
            addCriterion("pmt_status like", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusNotLike(String value) {
            addCriterion("pmt_status not like", value, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusIn(List<String> values) {
            addCriterion("pmt_status in", values, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusNotIn(List<String> values) {
            addCriterion("pmt_status not in", values, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusBetween(String value1, String value2) {
            addCriterion("pmt_status between", value1, value2, "pmtStatus");
            return (Criteria) this;
        }

        public Criteria andPmtStatusNotBetween(String value1, String value2) {
            addCriterion("pmt_status not between", value1, value2, "pmtStatus");
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