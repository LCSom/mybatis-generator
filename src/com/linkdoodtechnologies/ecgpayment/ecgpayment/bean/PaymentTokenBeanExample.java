package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class PaymentTokenBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentTokenBeanExample() {
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

        public Criteria andPttIdIsNull() {
            addCriterion("ptt_id is null");
            return (Criteria) this;
        }

        public Criteria andPttIdIsNotNull() {
            addCriterion("ptt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPttIdEqualTo(Integer value) {
            addCriterion("ptt_id =", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdNotEqualTo(Integer value) {
            addCriterion("ptt_id <>", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdGreaterThan(Integer value) {
            addCriterion("ptt_id >", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptt_id >=", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdLessThan(Integer value) {
            addCriterion("ptt_id <", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdLessThanOrEqualTo(Integer value) {
            addCriterion("ptt_id <=", value, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdIn(List<Integer> values) {
            addCriterion("ptt_id in", values, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdNotIn(List<Integer> values) {
            addCriterion("ptt_id not in", values, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdBetween(Integer value1, Integer value2) {
            addCriterion("ptt_id between", value1, value2, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ptt_id not between", value1, value2, "pttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdIsNull() {
            addCriterion("ptt_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPttAttIdIsNotNull() {
            addCriterion("ptt_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPttAttIdEqualTo(String value) {
            addCriterion("ptt_att_id =", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdNotEqualTo(String value) {
            addCriterion("ptt_att_id <>", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdGreaterThan(String value) {
            addCriterion("ptt_att_id >", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("ptt_att_id >=", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdLessThan(String value) {
            addCriterion("ptt_att_id <", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdLessThanOrEqualTo(String value) {
            addCriterion("ptt_att_id <=", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdLike(String value) {
            addCriterion("ptt_att_id like", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdNotLike(String value) {
            addCriterion("ptt_att_id not like", value, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdIn(List<String> values) {
            addCriterion("ptt_att_id in", values, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdNotIn(List<String> values) {
            addCriterion("ptt_att_id not in", values, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdBetween(String value1, String value2) {
            addCriterion("ptt_att_id between", value1, value2, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttAttIdNotBetween(String value1, String value2) {
            addCriterion("ptt_att_id not between", value1, value2, "pttAttId");
            return (Criteria) this;
        }

        public Criteria andPttTokenIsNull() {
            addCriterion("ptt_token is null");
            return (Criteria) this;
        }

        public Criteria andPttTokenIsNotNull() {
            addCriterion("ptt_token is not null");
            return (Criteria) this;
        }

        public Criteria andPttTokenEqualTo(String value) {
            addCriterion("ptt_token =", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenNotEqualTo(String value) {
            addCriterion("ptt_token <>", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenGreaterThan(String value) {
            addCriterion("ptt_token >", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenGreaterThanOrEqualTo(String value) {
            addCriterion("ptt_token >=", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenLessThan(String value) {
            addCriterion("ptt_token <", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenLessThanOrEqualTo(String value) {
            addCriterion("ptt_token <=", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenLike(String value) {
            addCriterion("ptt_token like", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenNotLike(String value) {
            addCriterion("ptt_token not like", value, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenIn(List<String> values) {
            addCriterion("ptt_token in", values, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenNotIn(List<String> values) {
            addCriterion("ptt_token not in", values, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenBetween(String value1, String value2) {
            addCriterion("ptt_token between", value1, value2, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttTokenNotBetween(String value1, String value2) {
            addCriterion("ptt_token not between", value1, value2, "pttToken");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeIsNull() {
            addCriterion("ptt_generated_time is null");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeIsNotNull() {
            addCriterion("ptt_generated_time is not null");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeEqualTo(String value) {
            addCriterion("ptt_generated_time =", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeNotEqualTo(String value) {
            addCriterion("ptt_generated_time <>", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeGreaterThan(String value) {
            addCriterion("ptt_generated_time >", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ptt_generated_time >=", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeLessThan(String value) {
            addCriterion("ptt_generated_time <", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeLessThanOrEqualTo(String value) {
            addCriterion("ptt_generated_time <=", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeLike(String value) {
            addCriterion("ptt_generated_time like", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeNotLike(String value) {
            addCriterion("ptt_generated_time not like", value, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeIn(List<String> values) {
            addCriterion("ptt_generated_time in", values, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeNotIn(List<String> values) {
            addCriterion("ptt_generated_time not in", values, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeBetween(String value1, String value2) {
            addCriterion("ptt_generated_time between", value1, value2, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttGeneratedTimeNotBetween(String value1, String value2) {
            addCriterion("ptt_generated_time not between", value1, value2, "pttGeneratedTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeIsNull() {
            addCriterion("ptt_expired_time is null");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeIsNotNull() {
            addCriterion("ptt_expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeEqualTo(String value) {
            addCriterion("ptt_expired_time =", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeNotEqualTo(String value) {
            addCriterion("ptt_expired_time <>", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeGreaterThan(String value) {
            addCriterion("ptt_expired_time >", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ptt_expired_time >=", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeLessThan(String value) {
            addCriterion("ptt_expired_time <", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeLessThanOrEqualTo(String value) {
            addCriterion("ptt_expired_time <=", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeLike(String value) {
            addCriterion("ptt_expired_time like", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeNotLike(String value) {
            addCriterion("ptt_expired_time not like", value, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeIn(List<String> values) {
            addCriterion("ptt_expired_time in", values, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeNotIn(List<String> values) {
            addCriterion("ptt_expired_time not in", values, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeBetween(String value1, String value2) {
            addCriterion("ptt_expired_time between", value1, value2, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttExpiredTimeNotBetween(String value1, String value2) {
            addCriterion("ptt_expired_time not between", value1, value2, "pttExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPttStatusIsNull() {
            addCriterion("ptt_status is null");
            return (Criteria) this;
        }

        public Criteria andPttStatusIsNotNull() {
            addCriterion("ptt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPttStatusEqualTo(Integer value) {
            addCriterion("ptt_status =", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusNotEqualTo(Integer value) {
            addCriterion("ptt_status <>", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusGreaterThan(Integer value) {
            addCriterion("ptt_status >", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptt_status >=", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusLessThan(Integer value) {
            addCriterion("ptt_status <", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ptt_status <=", value, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusIn(List<Integer> values) {
            addCriterion("ptt_status in", values, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusNotIn(List<Integer> values) {
            addCriterion("ptt_status not in", values, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusBetween(Integer value1, Integer value2) {
            addCriterion("ptt_status between", value1, value2, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ptt_status not between", value1, value2, "pttStatus");
            return (Criteria) this;
        }

        public Criteria andPttParam1IsNull() {
            addCriterion("ptt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPttParam1IsNotNull() {
            addCriterion("ptt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPttParam1EqualTo(String value) {
            addCriterion("ptt_param1 =", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1NotEqualTo(String value) {
            addCriterion("ptt_param1 <>", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1GreaterThan(String value) {
            addCriterion("ptt_param1 >", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ptt_param1 >=", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1LessThan(String value) {
            addCriterion("ptt_param1 <", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1LessThanOrEqualTo(String value) {
            addCriterion("ptt_param1 <=", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1Like(String value) {
            addCriterion("ptt_param1 like", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1NotLike(String value) {
            addCriterion("ptt_param1 not like", value, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1In(List<String> values) {
            addCriterion("ptt_param1 in", values, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1NotIn(List<String> values) {
            addCriterion("ptt_param1 not in", values, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1Between(String value1, String value2) {
            addCriterion("ptt_param1 between", value1, value2, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam1NotBetween(String value1, String value2) {
            addCriterion("ptt_param1 not between", value1, value2, "pttParam1");
            return (Criteria) this;
        }

        public Criteria andPttParam2IsNull() {
            addCriterion("ptt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPttParam2IsNotNull() {
            addCriterion("ptt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPttParam2EqualTo(String value) {
            addCriterion("ptt_param2 =", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2NotEqualTo(String value) {
            addCriterion("ptt_param2 <>", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2GreaterThan(String value) {
            addCriterion("ptt_param2 >", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ptt_param2 >=", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2LessThan(String value) {
            addCriterion("ptt_param2 <", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2LessThanOrEqualTo(String value) {
            addCriterion("ptt_param2 <=", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2Like(String value) {
            addCriterion("ptt_param2 like", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2NotLike(String value) {
            addCriterion("ptt_param2 not like", value, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2In(List<String> values) {
            addCriterion("ptt_param2 in", values, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2NotIn(List<String> values) {
            addCriterion("ptt_param2 not in", values, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2Between(String value1, String value2) {
            addCriterion("ptt_param2 between", value1, value2, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam2NotBetween(String value1, String value2) {
            addCriterion("ptt_param2 not between", value1, value2, "pttParam2");
            return (Criteria) this;
        }

        public Criteria andPttParam3IsNull() {
            addCriterion("ptt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPttParam3IsNotNull() {
            addCriterion("ptt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPttParam3EqualTo(String value) {
            addCriterion("ptt_param3 =", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3NotEqualTo(String value) {
            addCriterion("ptt_param3 <>", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3GreaterThan(String value) {
            addCriterion("ptt_param3 >", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ptt_param3 >=", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3LessThan(String value) {
            addCriterion("ptt_param3 <", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3LessThanOrEqualTo(String value) {
            addCriterion("ptt_param3 <=", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3Like(String value) {
            addCriterion("ptt_param3 like", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3NotLike(String value) {
            addCriterion("ptt_param3 not like", value, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3In(List<String> values) {
            addCriterion("ptt_param3 in", values, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3NotIn(List<String> values) {
            addCriterion("ptt_param3 not in", values, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3Between(String value1, String value2) {
            addCriterion("ptt_param3 between", value1, value2, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam3NotBetween(String value1, String value2) {
            addCriterion("ptt_param3 not between", value1, value2, "pttParam3");
            return (Criteria) this;
        }

        public Criteria andPttParam4IsNull() {
            addCriterion("ptt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPttParam4IsNotNull() {
            addCriterion("ptt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPttParam4EqualTo(String value) {
            addCriterion("ptt_param4 =", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4NotEqualTo(String value) {
            addCriterion("ptt_param4 <>", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4GreaterThan(String value) {
            addCriterion("ptt_param4 >", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ptt_param4 >=", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4LessThan(String value) {
            addCriterion("ptt_param4 <", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4LessThanOrEqualTo(String value) {
            addCriterion("ptt_param4 <=", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4Like(String value) {
            addCriterion("ptt_param4 like", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4NotLike(String value) {
            addCriterion("ptt_param4 not like", value, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4In(List<String> values) {
            addCriterion("ptt_param4 in", values, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4NotIn(List<String> values) {
            addCriterion("ptt_param4 not in", values, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4Between(String value1, String value2) {
            addCriterion("ptt_param4 between", value1, value2, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam4NotBetween(String value1, String value2) {
            addCriterion("ptt_param4 not between", value1, value2, "pttParam4");
            return (Criteria) this;
        }

        public Criteria andPttParam5IsNull() {
            addCriterion("ptt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPttParam5IsNotNull() {
            addCriterion("ptt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPttParam5EqualTo(String value) {
            addCriterion("ptt_param5 =", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5NotEqualTo(String value) {
            addCriterion("ptt_param5 <>", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5GreaterThan(String value) {
            addCriterion("ptt_param5 >", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5GreaterThanOrEqualTo(String value) {
            addCriterion("ptt_param5 >=", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5LessThan(String value) {
            addCriterion("ptt_param5 <", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5LessThanOrEqualTo(String value) {
            addCriterion("ptt_param5 <=", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5Like(String value) {
            addCriterion("ptt_param5 like", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5NotLike(String value) {
            addCriterion("ptt_param5 not like", value, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5In(List<String> values) {
            addCriterion("ptt_param5 in", values, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5NotIn(List<String> values) {
            addCriterion("ptt_param5 not in", values, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5Between(String value1, String value2) {
            addCriterion("ptt_param5 between", value1, value2, "pttParam5");
            return (Criteria) this;
        }

        public Criteria andPttParam5NotBetween(String value1, String value2) {
            addCriterion("ptt_param5 not between", value1, value2, "pttParam5");
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