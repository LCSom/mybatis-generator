package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class PaymentUserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentUserBeanExample() {
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

        public Criteria andAutIdIsNull() {
            addCriterion("aut_id is null");
            return (Criteria) this;
        }

        public Criteria andAutIdIsNotNull() {
            addCriterion("aut_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutIdEqualTo(Integer value) {
            addCriterion("aut_id =", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdNotEqualTo(Integer value) {
            addCriterion("aut_id <>", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdGreaterThan(Integer value) {
            addCriterion("aut_id >", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aut_id >=", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdLessThan(Integer value) {
            addCriterion("aut_id <", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdLessThanOrEqualTo(Integer value) {
            addCriterion("aut_id <=", value, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdIn(List<Integer> values) {
            addCriterion("aut_id in", values, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdNotIn(List<Integer> values) {
            addCriterion("aut_id not in", values, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdBetween(Integer value1, Integer value2) {
            addCriterion("aut_id between", value1, value2, "autId");
            return (Criteria) this;
        }

        public Criteria andAutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aut_id not between", value1, value2, "autId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdIsNull() {
            addCriterion("aut_app_id is null");
            return (Criteria) this;
        }

        public Criteria andAutAppIdIsNotNull() {
            addCriterion("aut_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutAppIdEqualTo(String value) {
            addCriterion("aut_app_id =", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdNotEqualTo(String value) {
            addCriterion("aut_app_id <>", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdGreaterThan(String value) {
            addCriterion("aut_app_id >", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("aut_app_id >=", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdLessThan(String value) {
            addCriterion("aut_app_id <", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdLessThanOrEqualTo(String value) {
            addCriterion("aut_app_id <=", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdLike(String value) {
            addCriterion("aut_app_id like", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdNotLike(String value) {
            addCriterion("aut_app_id not like", value, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdIn(List<String> values) {
            addCriterion("aut_app_id in", values, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdNotIn(List<String> values) {
            addCriterion("aut_app_id not in", values, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdBetween(String value1, String value2) {
            addCriterion("aut_app_id between", value1, value2, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppIdNotBetween(String value1, String value2) {
            addCriterion("aut_app_id not between", value1, value2, "autAppId");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretIsNull() {
            addCriterion("aut_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretIsNotNull() {
            addCriterion("aut_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretEqualTo(String value) {
            addCriterion("aut_app_secret =", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretNotEqualTo(String value) {
            addCriterion("aut_app_secret <>", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretGreaterThan(String value) {
            addCriterion("aut_app_secret >", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("aut_app_secret >=", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretLessThan(String value) {
            addCriterion("aut_app_secret <", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretLessThanOrEqualTo(String value) {
            addCriterion("aut_app_secret <=", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretLike(String value) {
            addCriterion("aut_app_secret like", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretNotLike(String value) {
            addCriterion("aut_app_secret not like", value, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretIn(List<String> values) {
            addCriterion("aut_app_secret in", values, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretNotIn(List<String> values) {
            addCriterion("aut_app_secret not in", values, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretBetween(String value1, String value2) {
            addCriterion("aut_app_secret between", value1, value2, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutAppSecretNotBetween(String value1, String value2) {
            addCriterion("aut_app_secret not between", value1, value2, "autAppSecret");
            return (Criteria) this;
        }

        public Criteria andAutRemarkIsNull() {
            addCriterion("aut_remark is null");
            return (Criteria) this;
        }

        public Criteria andAutRemarkIsNotNull() {
            addCriterion("aut_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAutRemarkEqualTo(String value) {
            addCriterion("aut_remark =", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkNotEqualTo(String value) {
            addCriterion("aut_remark <>", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkGreaterThan(String value) {
            addCriterion("aut_remark >", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("aut_remark >=", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkLessThan(String value) {
            addCriterion("aut_remark <", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkLessThanOrEqualTo(String value) {
            addCriterion("aut_remark <=", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkLike(String value) {
            addCriterion("aut_remark like", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkNotLike(String value) {
            addCriterion("aut_remark not like", value, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkIn(List<String> values) {
            addCriterion("aut_remark in", values, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkNotIn(List<String> values) {
            addCriterion("aut_remark not in", values, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkBetween(String value1, String value2) {
            addCriterion("aut_remark between", value1, value2, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutRemarkNotBetween(String value1, String value2) {
            addCriterion("aut_remark not between", value1, value2, "autRemark");
            return (Criteria) this;
        }

        public Criteria andAutDomainIsNull() {
            addCriterion("aut_domain is null");
            return (Criteria) this;
        }

        public Criteria andAutDomainIsNotNull() {
            addCriterion("aut_domain is not null");
            return (Criteria) this;
        }

        public Criteria andAutDomainEqualTo(String value) {
            addCriterion("aut_domain =", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainNotEqualTo(String value) {
            addCriterion("aut_domain <>", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainGreaterThan(String value) {
            addCriterion("aut_domain >", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainGreaterThanOrEqualTo(String value) {
            addCriterion("aut_domain >=", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainLessThan(String value) {
            addCriterion("aut_domain <", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainLessThanOrEqualTo(String value) {
            addCriterion("aut_domain <=", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainLike(String value) {
            addCriterion("aut_domain like", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainNotLike(String value) {
            addCriterion("aut_domain not like", value, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainIn(List<String> values) {
            addCriterion("aut_domain in", values, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainNotIn(List<String> values) {
            addCriterion("aut_domain not in", values, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainBetween(String value1, String value2) {
            addCriterion("aut_domain between", value1, value2, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutDomainNotBetween(String value1, String value2) {
            addCriterion("aut_domain not between", value1, value2, "autDomain");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlIsNull() {
            addCriterion("aut_frontend_url is null");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlIsNotNull() {
            addCriterion("aut_frontend_url is not null");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlEqualTo(String value) {
            addCriterion("aut_frontend_url =", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlNotEqualTo(String value) {
            addCriterion("aut_frontend_url <>", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlGreaterThan(String value) {
            addCriterion("aut_frontend_url >", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlGreaterThanOrEqualTo(String value) {
            addCriterion("aut_frontend_url >=", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlLessThan(String value) {
            addCriterion("aut_frontend_url <", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlLessThanOrEqualTo(String value) {
            addCriterion("aut_frontend_url <=", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlLike(String value) {
            addCriterion("aut_frontend_url like", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlNotLike(String value) {
            addCriterion("aut_frontend_url not like", value, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlIn(List<String> values) {
            addCriterion("aut_frontend_url in", values, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlNotIn(List<String> values) {
            addCriterion("aut_frontend_url not in", values, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlBetween(String value1, String value2) {
            addCriterion("aut_frontend_url between", value1, value2, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutFrontendUrlNotBetween(String value1, String value2) {
            addCriterion("aut_frontend_url not between", value1, value2, "autFrontendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlIsNull() {
            addCriterion("aut_backend_url is null");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlIsNotNull() {
            addCriterion("aut_backend_url is not null");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlEqualTo(String value) {
            addCriterion("aut_backend_url =", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlNotEqualTo(String value) {
            addCriterion("aut_backend_url <>", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlGreaterThan(String value) {
            addCriterion("aut_backend_url >", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlGreaterThanOrEqualTo(String value) {
            addCriterion("aut_backend_url >=", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlLessThan(String value) {
            addCriterion("aut_backend_url <", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlLessThanOrEqualTo(String value) {
            addCriterion("aut_backend_url <=", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlLike(String value) {
            addCriterion("aut_backend_url like", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlNotLike(String value) {
            addCriterion("aut_backend_url not like", value, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlIn(List<String> values) {
            addCriterion("aut_backend_url in", values, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlNotIn(List<String> values) {
            addCriterion("aut_backend_url not in", values, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlBetween(String value1, String value2) {
            addCriterion("aut_backend_url between", value1, value2, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutBackendUrlNotBetween(String value1, String value2) {
            addCriterion("aut_backend_url not between", value1, value2, "autBackendUrl");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierIsNull() {
            addCriterion("aut_identifier is null");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierIsNotNull() {
            addCriterion("aut_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierEqualTo(String value) {
            addCriterion("aut_identifier =", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierNotEqualTo(String value) {
            addCriterion("aut_identifier <>", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierGreaterThan(String value) {
            addCriterion("aut_identifier >", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("aut_identifier >=", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierLessThan(String value) {
            addCriterion("aut_identifier <", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierLessThanOrEqualTo(String value) {
            addCriterion("aut_identifier <=", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierLike(String value) {
            addCriterion("aut_identifier like", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierNotLike(String value) {
            addCriterion("aut_identifier not like", value, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierIn(List<String> values) {
            addCriterion("aut_identifier in", values, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierNotIn(List<String> values) {
            addCriterion("aut_identifier not in", values, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierBetween(String value1, String value2) {
            addCriterion("aut_identifier between", value1, value2, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutIdentifierNotBetween(String value1, String value2) {
            addCriterion("aut_identifier not between", value1, value2, "autIdentifier");
            return (Criteria) this;
        }

        public Criteria andAutStatusIsNull() {
            addCriterion("aut_status is null");
            return (Criteria) this;
        }

        public Criteria andAutStatusIsNotNull() {
            addCriterion("aut_status is not null");
            return (Criteria) this;
        }

        public Criteria andAutStatusEqualTo(String value) {
            addCriterion("aut_status =", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusNotEqualTo(String value) {
            addCriterion("aut_status <>", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusGreaterThan(String value) {
            addCriterion("aut_status >", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("aut_status >=", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusLessThan(String value) {
            addCriterion("aut_status <", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusLessThanOrEqualTo(String value) {
            addCriterion("aut_status <=", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusLike(String value) {
            addCriterion("aut_status like", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusNotLike(String value) {
            addCriterion("aut_status not like", value, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusIn(List<String> values) {
            addCriterion("aut_status in", values, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusNotIn(List<String> values) {
            addCriterion("aut_status not in", values, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusBetween(String value1, String value2) {
            addCriterion("aut_status between", value1, value2, "autStatus");
            return (Criteria) this;
        }

        public Criteria andAutStatusNotBetween(String value1, String value2) {
            addCriterion("aut_status not between", value1, value2, "autStatus");
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