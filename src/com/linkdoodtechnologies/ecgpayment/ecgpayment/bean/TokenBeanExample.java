package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class TokenBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TokenBeanExample() {
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

        public Criteria andAttTokenIdIsNull() {
            addCriterion("att_token_id is null");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdIsNotNull() {
            addCriterion("att_token_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdEqualTo(Integer value) {
            addCriterion("att_token_id =", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdNotEqualTo(Integer value) {
            addCriterion("att_token_id <>", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdGreaterThan(Integer value) {
            addCriterion("att_token_id >", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("att_token_id >=", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdLessThan(Integer value) {
            addCriterion("att_token_id <", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdLessThanOrEqualTo(Integer value) {
            addCriterion("att_token_id <=", value, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdIn(List<Integer> values) {
            addCriterion("att_token_id in", values, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdNotIn(List<Integer> values) {
            addCriterion("att_token_id not in", values, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdBetween(Integer value1, Integer value2) {
            addCriterion("att_token_id between", value1, value2, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttTokenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("att_token_id not between", value1, value2, "attTokenId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdIsNull() {
            addCriterion("att_aut_id is null");
            return (Criteria) this;
        }

        public Criteria andAttAutIdIsNotNull() {
            addCriterion("att_aut_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttAutIdEqualTo(String value) {
            addCriterion("att_aut_id =", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdNotEqualTo(String value) {
            addCriterion("att_aut_id <>", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdGreaterThan(String value) {
            addCriterion("att_aut_id >", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdGreaterThanOrEqualTo(String value) {
            addCriterion("att_aut_id >=", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdLessThan(String value) {
            addCriterion("att_aut_id <", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdLessThanOrEqualTo(String value) {
            addCriterion("att_aut_id <=", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdLike(String value) {
            addCriterion("att_aut_id like", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdNotLike(String value) {
            addCriterion("att_aut_id not like", value, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdIn(List<String> values) {
            addCriterion("att_aut_id in", values, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdNotIn(List<String> values) {
            addCriterion("att_aut_id not in", values, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdBetween(String value1, String value2) {
            addCriterion("att_aut_id between", value1, value2, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttAutIdNotBetween(String value1, String value2) {
            addCriterion("att_aut_id not between", value1, value2, "attAutId");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyIsNull() {
            addCriterion("att_token_key is null");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyIsNotNull() {
            addCriterion("att_token_key is not null");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyEqualTo(String value) {
            addCriterion("att_token_key =", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyNotEqualTo(String value) {
            addCriterion("att_token_key <>", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyGreaterThan(String value) {
            addCriterion("att_token_key >", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyGreaterThanOrEqualTo(String value) {
            addCriterion("att_token_key >=", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyLessThan(String value) {
            addCriterion("att_token_key <", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyLessThanOrEqualTo(String value) {
            addCriterion("att_token_key <=", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyLike(String value) {
            addCriterion("att_token_key like", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyNotLike(String value) {
            addCriterion("att_token_key not like", value, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyIn(List<String> values) {
            addCriterion("att_token_key in", values, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyNotIn(List<String> values) {
            addCriterion("att_token_key not in", values, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyBetween(String value1, String value2) {
            addCriterion("att_token_key between", value1, value2, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenKeyNotBetween(String value1, String value2) {
            addCriterion("att_token_key not between", value1, value2, "attTokenKey");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusIsNull() {
            addCriterion("att_token_status is null");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusIsNotNull() {
            addCriterion("att_token_status is not null");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusEqualTo(Boolean value) {
            addCriterion("att_token_status =", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusNotEqualTo(Boolean value) {
            addCriterion("att_token_status <>", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusGreaterThan(Boolean value) {
            addCriterion("att_token_status >", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("att_token_status >=", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusLessThan(Boolean value) {
            addCriterion("att_token_status <", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("att_token_status <=", value, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusIn(List<Boolean> values) {
            addCriterion("att_token_status in", values, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusNotIn(List<Boolean> values) {
            addCriterion("att_token_status not in", values, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("att_token_status between", value1, value2, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("att_token_status not between", value1, value2, "attTokenStatus");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateIsNull() {
            addCriterion("att_token_expire_date is null");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateIsNotNull() {
            addCriterion("att_token_expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateEqualTo(String value) {
            addCriterion("att_token_expire_date =", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateNotEqualTo(String value) {
            addCriterion("att_token_expire_date <>", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateGreaterThan(String value) {
            addCriterion("att_token_expire_date >", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("att_token_expire_date >=", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateLessThan(String value) {
            addCriterion("att_token_expire_date <", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateLessThanOrEqualTo(String value) {
            addCriterion("att_token_expire_date <=", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateLike(String value) {
            addCriterion("att_token_expire_date like", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateNotLike(String value) {
            addCriterion("att_token_expire_date not like", value, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateIn(List<String> values) {
            addCriterion("att_token_expire_date in", values, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateNotIn(List<String> values) {
            addCriterion("att_token_expire_date not in", values, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateBetween(String value1, String value2) {
            addCriterion("att_token_expire_date between", value1, value2, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenExpireDateNotBetween(String value1, String value2) {
            addCriterion("att_token_expire_date not between", value1, value2, "attTokenExpireDate");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeIsNull() {
            addCriterion("att_token_access_type is null");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeIsNotNull() {
            addCriterion("att_token_access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeEqualTo(String value) {
            addCriterion("att_token_access_type =", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeNotEqualTo(String value) {
            addCriterion("att_token_access_type <>", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeGreaterThan(String value) {
            addCriterion("att_token_access_type >", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("att_token_access_type >=", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeLessThan(String value) {
            addCriterion("att_token_access_type <", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("att_token_access_type <=", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeLike(String value) {
            addCriterion("att_token_access_type like", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeNotLike(String value) {
            addCriterion("att_token_access_type not like", value, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeIn(List<String> values) {
            addCriterion("att_token_access_type in", values, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeNotIn(List<String> values) {
            addCriterion("att_token_access_type not in", values, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeBetween(String value1, String value2) {
            addCriterion("att_token_access_type between", value1, value2, "attTokenAccessType");
            return (Criteria) this;
        }

        public Criteria andAttTokenAccessTypeNotBetween(String value1, String value2) {
            addCriterion("att_token_access_type not between", value1, value2, "attTokenAccessType");
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