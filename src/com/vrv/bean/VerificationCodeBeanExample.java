package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VerificationCodeBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VerificationCodeBeanExample() {
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

        public Criteria andVctIdIsNull() {
            addCriterion("vct_id is null");
            return (Criteria) this;
        }

        public Criteria andVctIdIsNotNull() {
            addCriterion("vct_id is not null");
            return (Criteria) this;
        }

        public Criteria andVctIdEqualTo(Integer value) {
            addCriterion("vct_id =", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdNotEqualTo(Integer value) {
            addCriterion("vct_id <>", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdGreaterThan(Integer value) {
            addCriterion("vct_id >", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vct_id >=", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdLessThan(Integer value) {
            addCriterion("vct_id <", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdLessThanOrEqualTo(Integer value) {
            addCriterion("vct_id <=", value, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdIn(List<Integer> values) {
            addCriterion("vct_id in", values, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdNotIn(List<Integer> values) {
            addCriterion("vct_id not in", values, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdBetween(Integer value1, Integer value2) {
            addCriterion("vct_id between", value1, value2, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vct_id not between", value1, value2, "vctId");
            return (Criteria) this;
        }

        public Criteria andVctTypeIsNull() {
            addCriterion("vct_type is null");
            return (Criteria) this;
        }

        public Criteria andVctTypeIsNotNull() {
            addCriterion("vct_type is not null");
            return (Criteria) this;
        }

        public Criteria andVctTypeEqualTo(String value) {
            addCriterion("vct_type =", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeNotEqualTo(String value) {
            addCriterion("vct_type <>", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeGreaterThan(String value) {
            addCriterion("vct_type >", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vct_type >=", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeLessThan(String value) {
            addCriterion("vct_type <", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeLessThanOrEqualTo(String value) {
            addCriterion("vct_type <=", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeLike(String value) {
            addCriterion("vct_type like", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeNotLike(String value) {
            addCriterion("vct_type not like", value, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeIn(List<String> values) {
            addCriterion("vct_type in", values, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeNotIn(List<String> values) {
            addCriterion("vct_type not in", values, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeBetween(String value1, String value2) {
            addCriterion("vct_type between", value1, value2, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctTypeNotBetween(String value1, String value2) {
            addCriterion("vct_type not between", value1, value2, "vctType");
            return (Criteria) this;
        }

        public Criteria andVctContactIsNull() {
            addCriterion("vct_contact is null");
            return (Criteria) this;
        }

        public Criteria andVctContactIsNotNull() {
            addCriterion("vct_contact is not null");
            return (Criteria) this;
        }

        public Criteria andVctContactEqualTo(String value) {
            addCriterion("vct_contact =", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactNotEqualTo(String value) {
            addCriterion("vct_contact <>", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactGreaterThan(String value) {
            addCriterion("vct_contact >", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactGreaterThanOrEqualTo(String value) {
            addCriterion("vct_contact >=", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactLessThan(String value) {
            addCriterion("vct_contact <", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactLessThanOrEqualTo(String value) {
            addCriterion("vct_contact <=", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactLike(String value) {
            addCriterion("vct_contact like", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactNotLike(String value) {
            addCriterion("vct_contact not like", value, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactIn(List<String> values) {
            addCriterion("vct_contact in", values, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactNotIn(List<String> values) {
            addCriterion("vct_contact not in", values, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactBetween(String value1, String value2) {
            addCriterion("vct_contact between", value1, value2, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctContactNotBetween(String value1, String value2) {
            addCriterion("vct_contact not between", value1, value2, "vctContact");
            return (Criteria) this;
        }

        public Criteria andVctValueIsNull() {
            addCriterion("vct_value is null");
            return (Criteria) this;
        }

        public Criteria andVctValueIsNotNull() {
            addCriterion("vct_value is not null");
            return (Criteria) this;
        }

        public Criteria andVctValueEqualTo(String value) {
            addCriterion("vct_value =", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueNotEqualTo(String value) {
            addCriterion("vct_value <>", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueGreaterThan(String value) {
            addCriterion("vct_value >", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueGreaterThanOrEqualTo(String value) {
            addCriterion("vct_value >=", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueLessThan(String value) {
            addCriterion("vct_value <", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueLessThanOrEqualTo(String value) {
            addCriterion("vct_value <=", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueLike(String value) {
            addCriterion("vct_value like", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueNotLike(String value) {
            addCriterion("vct_value not like", value, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueIn(List<String> values) {
            addCriterion("vct_value in", values, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueNotIn(List<String> values) {
            addCriterion("vct_value not in", values, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueBetween(String value1, String value2) {
            addCriterion("vct_value between", value1, value2, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctValueNotBetween(String value1, String value2) {
            addCriterion("vct_value not between", value1, value2, "vctValue");
            return (Criteria) this;
        }

        public Criteria andVctParam1IsNull() {
            addCriterion("vct_param1 is null");
            return (Criteria) this;
        }

        public Criteria andVctParam1IsNotNull() {
            addCriterion("vct_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andVctParam1EqualTo(String value) {
            addCriterion("vct_param1 =", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1NotEqualTo(String value) {
            addCriterion("vct_param1 <>", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1GreaterThan(String value) {
            addCriterion("vct_param1 >", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1GreaterThanOrEqualTo(String value) {
            addCriterion("vct_param1 >=", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1LessThan(String value) {
            addCriterion("vct_param1 <", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1LessThanOrEqualTo(String value) {
            addCriterion("vct_param1 <=", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1Like(String value) {
            addCriterion("vct_param1 like", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1NotLike(String value) {
            addCriterion("vct_param1 not like", value, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1In(List<String> values) {
            addCriterion("vct_param1 in", values, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1NotIn(List<String> values) {
            addCriterion("vct_param1 not in", values, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1Between(String value1, String value2) {
            addCriterion("vct_param1 between", value1, value2, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam1NotBetween(String value1, String value2) {
            addCriterion("vct_param1 not between", value1, value2, "vctParam1");
            return (Criteria) this;
        }

        public Criteria andVctParam2IsNull() {
            addCriterion("vct_param2 is null");
            return (Criteria) this;
        }

        public Criteria andVctParam2IsNotNull() {
            addCriterion("vct_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andVctParam2EqualTo(String value) {
            addCriterion("vct_param2 =", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2NotEqualTo(String value) {
            addCriterion("vct_param2 <>", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2GreaterThan(String value) {
            addCriterion("vct_param2 >", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2GreaterThanOrEqualTo(String value) {
            addCriterion("vct_param2 >=", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2LessThan(String value) {
            addCriterion("vct_param2 <", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2LessThanOrEqualTo(String value) {
            addCriterion("vct_param2 <=", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2Like(String value) {
            addCriterion("vct_param2 like", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2NotLike(String value) {
            addCriterion("vct_param2 not like", value, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2In(List<String> values) {
            addCriterion("vct_param2 in", values, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2NotIn(List<String> values) {
            addCriterion("vct_param2 not in", values, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2Between(String value1, String value2) {
            addCriterion("vct_param2 between", value1, value2, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam2NotBetween(String value1, String value2) {
            addCriterion("vct_param2 not between", value1, value2, "vctParam2");
            return (Criteria) this;
        }

        public Criteria andVctParam3IsNull() {
            addCriterion("vct_param3 is null");
            return (Criteria) this;
        }

        public Criteria andVctParam3IsNotNull() {
            addCriterion("vct_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andVctParam3EqualTo(String value) {
            addCriterion("vct_param3 =", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3NotEqualTo(String value) {
            addCriterion("vct_param3 <>", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3GreaterThan(String value) {
            addCriterion("vct_param3 >", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3GreaterThanOrEqualTo(String value) {
            addCriterion("vct_param3 >=", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3LessThan(String value) {
            addCriterion("vct_param3 <", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3LessThanOrEqualTo(String value) {
            addCriterion("vct_param3 <=", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3Like(String value) {
            addCriterion("vct_param3 like", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3NotLike(String value) {
            addCriterion("vct_param3 not like", value, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3In(List<String> values) {
            addCriterion("vct_param3 in", values, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3NotIn(List<String> values) {
            addCriterion("vct_param3 not in", values, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3Between(String value1, String value2) {
            addCriterion("vct_param3 between", value1, value2, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam3NotBetween(String value1, String value2) {
            addCriterion("vct_param3 not between", value1, value2, "vctParam3");
            return (Criteria) this;
        }

        public Criteria andVctParam4IsNull() {
            addCriterion("vct_param4 is null");
            return (Criteria) this;
        }

        public Criteria andVctParam4IsNotNull() {
            addCriterion("vct_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andVctParam4EqualTo(String value) {
            addCriterion("vct_param4 =", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4NotEqualTo(String value) {
            addCriterion("vct_param4 <>", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4GreaterThan(String value) {
            addCriterion("vct_param4 >", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4GreaterThanOrEqualTo(String value) {
            addCriterion("vct_param4 >=", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4LessThan(String value) {
            addCriterion("vct_param4 <", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4LessThanOrEqualTo(String value) {
            addCriterion("vct_param4 <=", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4Like(String value) {
            addCriterion("vct_param4 like", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4NotLike(String value) {
            addCriterion("vct_param4 not like", value, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4In(List<String> values) {
            addCriterion("vct_param4 in", values, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4NotIn(List<String> values) {
            addCriterion("vct_param4 not in", values, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4Between(String value1, String value2) {
            addCriterion("vct_param4 between", value1, value2, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam4NotBetween(String value1, String value2) {
            addCriterion("vct_param4 not between", value1, value2, "vctParam4");
            return (Criteria) this;
        }

        public Criteria andVctParam5IsNull() {
            addCriterion("vct_param5 is null");
            return (Criteria) this;
        }

        public Criteria andVctParam5IsNotNull() {
            addCriterion("vct_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andVctParam5EqualTo(String value) {
            addCriterion("vct_param5 =", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5NotEqualTo(String value) {
            addCriterion("vct_param5 <>", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5GreaterThan(String value) {
            addCriterion("vct_param5 >", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5GreaterThanOrEqualTo(String value) {
            addCriterion("vct_param5 >=", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5LessThan(String value) {
            addCriterion("vct_param5 <", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5LessThanOrEqualTo(String value) {
            addCriterion("vct_param5 <=", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5Like(String value) {
            addCriterion("vct_param5 like", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5NotLike(String value) {
            addCriterion("vct_param5 not like", value, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5In(List<String> values) {
            addCriterion("vct_param5 in", values, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5NotIn(List<String> values) {
            addCriterion("vct_param5 not in", values, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5Between(String value1, String value2) {
            addCriterion("vct_param5 between", value1, value2, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctParam5NotBetween(String value1, String value2) {
            addCriterion("vct_param5 not between", value1, value2, "vctParam5");
            return (Criteria) this;
        }

        public Criteria andVctStatusIsNull() {
            addCriterion("vct_status is null");
            return (Criteria) this;
        }

        public Criteria andVctStatusIsNotNull() {
            addCriterion("vct_status is not null");
            return (Criteria) this;
        }

        public Criteria andVctStatusEqualTo(Integer value) {
            addCriterion("vct_status =", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusNotEqualTo(Integer value) {
            addCriterion("vct_status <>", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusGreaterThan(Integer value) {
            addCriterion("vct_status >", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vct_status >=", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusLessThan(Integer value) {
            addCriterion("vct_status <", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusLessThanOrEqualTo(Integer value) {
            addCriterion("vct_status <=", value, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusIn(List<Integer> values) {
            addCriterion("vct_status in", values, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusNotIn(List<Integer> values) {
            addCriterion("vct_status not in", values, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusBetween(Integer value1, Integer value2) {
            addCriterion("vct_status between", value1, value2, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vct_status not between", value1, value2, "vctStatus");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeIsNull() {
            addCriterion("vct_expired_datetime is null");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeIsNotNull() {
            addCriterion("vct_expired_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeEqualTo(Date value) {
            addCriterion("vct_expired_datetime =", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeNotEqualTo(Date value) {
            addCriterion("vct_expired_datetime <>", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeGreaterThan(Date value) {
            addCriterion("vct_expired_datetime >", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vct_expired_datetime >=", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeLessThan(Date value) {
            addCriterion("vct_expired_datetime <", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("vct_expired_datetime <=", value, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeIn(List<Date> values) {
            addCriterion("vct_expired_datetime in", values, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeNotIn(List<Date> values) {
            addCriterion("vct_expired_datetime not in", values, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeBetween(Date value1, Date value2) {
            addCriterion("vct_expired_datetime between", value1, value2, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctExpiredDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("vct_expired_datetime not between", value1, value2, "vctExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeIsNull() {
            addCriterion("vct_created_datetime is null");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeIsNotNull() {
            addCriterion("vct_created_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeEqualTo(Date value) {
            addCriterion("vct_created_datetime =", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("vct_created_datetime <>", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeGreaterThan(Date value) {
            addCriterion("vct_created_datetime >", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vct_created_datetime >=", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeLessThan(Date value) {
            addCriterion("vct_created_datetime <", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("vct_created_datetime <=", value, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeIn(List<Date> values) {
            addCriterion("vct_created_datetime in", values, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("vct_created_datetime not in", values, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("vct_created_datetime between", value1, value2, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("vct_created_datetime not between", value1, value2, "vctCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeIsNull() {
            addCriterion("vct_updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeIsNotNull() {
            addCriterion("vct_updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeEqualTo(Date value) {
            addCriterion("vct_updated_datetime =", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("vct_updated_datetime <>", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("vct_updated_datetime >", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vct_updated_datetime >=", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeLessThan(Date value) {
            addCriterion("vct_updated_datetime <", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("vct_updated_datetime <=", value, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeIn(List<Date> values) {
            addCriterion("vct_updated_datetime in", values, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("vct_updated_datetime not in", values, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("vct_updated_datetime between", value1, value2, "vctUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andVctUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("vct_updated_datetime not between", value1, value2, "vctUpdatedDatetime");
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