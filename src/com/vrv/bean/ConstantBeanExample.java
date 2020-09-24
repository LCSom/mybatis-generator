package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class ConstantBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstantBeanExample() {
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

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtTypeIsNull() {
            addCriterion("ct_type is null");
            return (Criteria) this;
        }

        public Criteria andCtTypeIsNotNull() {
            addCriterion("ct_type is not null");
            return (Criteria) this;
        }

        public Criteria andCtTypeEqualTo(String value) {
            addCriterion("ct_type =", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeNotEqualTo(String value) {
            addCriterion("ct_type <>", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeGreaterThan(String value) {
            addCriterion("ct_type >", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_type >=", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeLessThan(String value) {
            addCriterion("ct_type <", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeLessThanOrEqualTo(String value) {
            addCriterion("ct_type <=", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeLike(String value) {
            addCriterion("ct_type like", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeNotLike(String value) {
            addCriterion("ct_type not like", value, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeIn(List<String> values) {
            addCriterion("ct_type in", values, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeNotIn(List<String> values) {
            addCriterion("ct_type not in", values, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeBetween(String value1, String value2) {
            addCriterion("ct_type between", value1, value2, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtTypeNotBetween(String value1, String value2) {
            addCriterion("ct_type not between", value1, value2, "ctType");
            return (Criteria) this;
        }

        public Criteria andCtValueIsNull() {
            addCriterion("ct_value is null");
            return (Criteria) this;
        }

        public Criteria andCtValueIsNotNull() {
            addCriterion("ct_value is not null");
            return (Criteria) this;
        }

        public Criteria andCtValueEqualTo(String value) {
            addCriterion("ct_value =", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotEqualTo(String value) {
            addCriterion("ct_value <>", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueGreaterThan(String value) {
            addCriterion("ct_value >", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueGreaterThanOrEqualTo(String value) {
            addCriterion("ct_value >=", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLessThan(String value) {
            addCriterion("ct_value <", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLessThanOrEqualTo(String value) {
            addCriterion("ct_value <=", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLike(String value) {
            addCriterion("ct_value like", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotLike(String value) {
            addCriterion("ct_value not like", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueIn(List<String> values) {
            addCriterion("ct_value in", values, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotIn(List<String> values) {
            addCriterion("ct_value not in", values, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueBetween(String value1, String value2) {
            addCriterion("ct_value between", value1, value2, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotBetween(String value1, String value2) {
            addCriterion("ct_value not between", value1, value2, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNull() {
            addCriterion("ct_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNotNull() {
            addCriterion("ct_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam1EqualTo(String value) {
            addCriterion("ct_param1 =", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotEqualTo(String value) {
            addCriterion("ct_param1 <>", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThan(String value) {
            addCriterion("ct_param1 >", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param1 >=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThan(String value) {
            addCriterion("ct_param1 <", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThanOrEqualTo(String value) {
            addCriterion("ct_param1 <=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Like(String value) {
            addCriterion("ct_param1 like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotLike(String value) {
            addCriterion("ct_param1 not like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1In(List<String> values) {
            addCriterion("ct_param1 in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotIn(List<String> values) {
            addCriterion("ct_param1 not in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Between(String value1, String value2) {
            addCriterion("ct_param1 between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotBetween(String value1, String value2) {
            addCriterion("ct_param1 not between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNull() {
            addCriterion("ct_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNotNull() {
            addCriterion("ct_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam2EqualTo(String value) {
            addCriterion("ct_param2 =", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotEqualTo(String value) {
            addCriterion("ct_param2 <>", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThan(String value) {
            addCriterion("ct_param2 >", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param2 >=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThan(String value) {
            addCriterion("ct_param2 <", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThanOrEqualTo(String value) {
            addCriterion("ct_param2 <=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Like(String value) {
            addCriterion("ct_param2 like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotLike(String value) {
            addCriterion("ct_param2 not like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2In(List<String> values) {
            addCriterion("ct_param2 in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotIn(List<String> values) {
            addCriterion("ct_param2 not in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Between(String value1, String value2) {
            addCriterion("ct_param2 between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotBetween(String value1, String value2) {
            addCriterion("ct_param2 not between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNull() {
            addCriterion("ct_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNotNull() {
            addCriterion("ct_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam3EqualTo(String value) {
            addCriterion("ct_param3 =", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotEqualTo(String value) {
            addCriterion("ct_param3 <>", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThan(String value) {
            addCriterion("ct_param3 >", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param3 >=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThan(String value) {
            addCriterion("ct_param3 <", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThanOrEqualTo(String value) {
            addCriterion("ct_param3 <=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Like(String value) {
            addCriterion("ct_param3 like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotLike(String value) {
            addCriterion("ct_param3 not like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3In(List<String> values) {
            addCriterion("ct_param3 in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotIn(List<String> values) {
            addCriterion("ct_param3 not in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Between(String value1, String value2) {
            addCriterion("ct_param3 between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotBetween(String value1, String value2) {
            addCriterion("ct_param3 not between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNull() {
            addCriterion("ct_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNotNull() {
            addCriterion("ct_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam4EqualTo(String value) {
            addCriterion("ct_param4 =", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotEqualTo(String value) {
            addCriterion("ct_param4 <>", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThan(String value) {
            addCriterion("ct_param4 >", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param4 >=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThan(String value) {
            addCriterion("ct_param4 <", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThanOrEqualTo(String value) {
            addCriterion("ct_param4 <=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Like(String value) {
            addCriterion("ct_param4 like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotLike(String value) {
            addCriterion("ct_param4 not like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4In(List<String> values) {
            addCriterion("ct_param4 in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotIn(List<String> values) {
            addCriterion("ct_param4 not in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Between(String value1, String value2) {
            addCriterion("ct_param4 between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotBetween(String value1, String value2) {
            addCriterion("ct_param4 not between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNull() {
            addCriterion("ct_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNotNull() {
            addCriterion("ct_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam5EqualTo(String value) {
            addCriterion("ct_param5 =", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotEqualTo(String value) {
            addCriterion("ct_param5 <>", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThan(String value) {
            addCriterion("ct_param5 >", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param5 >=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThan(String value) {
            addCriterion("ct_param5 <", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThanOrEqualTo(String value) {
            addCriterion("ct_param5 <=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Like(String value) {
            addCriterion("ct_param5 like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotLike(String value) {
            addCriterion("ct_param5 not like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5In(List<String> values) {
            addCriterion("ct_param5 in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotIn(List<String> values) {
            addCriterion("ct_param5 not in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Between(String value1, String value2) {
            addCriterion("ct_param5 between", value1, value2, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotBetween(String value1, String value2) {
            addCriterion("ct_param5 not between", value1, value2, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam6IsNull() {
            addCriterion("ct_param6 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam6IsNotNull() {
            addCriterion("ct_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam6EqualTo(String value) {
            addCriterion("ct_param6 =", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6NotEqualTo(String value) {
            addCriterion("ct_param6 <>", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6GreaterThan(String value) {
            addCriterion("ct_param6 >", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param6 >=", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6LessThan(String value) {
            addCriterion("ct_param6 <", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6LessThanOrEqualTo(String value) {
            addCriterion("ct_param6 <=", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6Like(String value) {
            addCriterion("ct_param6 like", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6NotLike(String value) {
            addCriterion("ct_param6 not like", value, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6In(List<String> values) {
            addCriterion("ct_param6 in", values, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6NotIn(List<String> values) {
            addCriterion("ct_param6 not in", values, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6Between(String value1, String value2) {
            addCriterion("ct_param6 between", value1, value2, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam6NotBetween(String value1, String value2) {
            addCriterion("ct_param6 not between", value1, value2, "ctParam6");
            return (Criteria) this;
        }

        public Criteria andCtParam7IsNull() {
            addCriterion("ct_param7 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam7IsNotNull() {
            addCriterion("ct_param7 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam7EqualTo(String value) {
            addCriterion("ct_param7 =", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7NotEqualTo(String value) {
            addCriterion("ct_param7 <>", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7GreaterThan(String value) {
            addCriterion("ct_param7 >", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param7 >=", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7LessThan(String value) {
            addCriterion("ct_param7 <", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7LessThanOrEqualTo(String value) {
            addCriterion("ct_param7 <=", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7Like(String value) {
            addCriterion("ct_param7 like", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7NotLike(String value) {
            addCriterion("ct_param7 not like", value, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7In(List<String> values) {
            addCriterion("ct_param7 in", values, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7NotIn(List<String> values) {
            addCriterion("ct_param7 not in", values, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7Between(String value1, String value2) {
            addCriterion("ct_param7 between", value1, value2, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam7NotBetween(String value1, String value2) {
            addCriterion("ct_param7 not between", value1, value2, "ctParam7");
            return (Criteria) this;
        }

        public Criteria andCtParam8IsNull() {
            addCriterion("ct_param8 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam8IsNotNull() {
            addCriterion("ct_param8 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam8EqualTo(String value) {
            addCriterion("ct_param8 =", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8NotEqualTo(String value) {
            addCriterion("ct_param8 <>", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8GreaterThan(String value) {
            addCriterion("ct_param8 >", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param8 >=", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8LessThan(String value) {
            addCriterion("ct_param8 <", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8LessThanOrEqualTo(String value) {
            addCriterion("ct_param8 <=", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8Like(String value) {
            addCriterion("ct_param8 like", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8NotLike(String value) {
            addCriterion("ct_param8 not like", value, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8In(List<String> values) {
            addCriterion("ct_param8 in", values, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8NotIn(List<String> values) {
            addCriterion("ct_param8 not in", values, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8Between(String value1, String value2) {
            addCriterion("ct_param8 between", value1, value2, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam8NotBetween(String value1, String value2) {
            addCriterion("ct_param8 not between", value1, value2, "ctParam8");
            return (Criteria) this;
        }

        public Criteria andCtParam9IsNull() {
            addCriterion("ct_param9 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam9IsNotNull() {
            addCriterion("ct_param9 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam9EqualTo(String value) {
            addCriterion("ct_param9 =", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9NotEqualTo(String value) {
            addCriterion("ct_param9 <>", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9GreaterThan(String value) {
            addCriterion("ct_param9 >", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param9 >=", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9LessThan(String value) {
            addCriterion("ct_param9 <", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9LessThanOrEqualTo(String value) {
            addCriterion("ct_param9 <=", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9Like(String value) {
            addCriterion("ct_param9 like", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9NotLike(String value) {
            addCriterion("ct_param9 not like", value, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9In(List<String> values) {
            addCriterion("ct_param9 in", values, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9NotIn(List<String> values) {
            addCriterion("ct_param9 not in", values, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9Between(String value1, String value2) {
            addCriterion("ct_param9 between", value1, value2, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam9NotBetween(String value1, String value2) {
            addCriterion("ct_param9 not between", value1, value2, "ctParam9");
            return (Criteria) this;
        }

        public Criteria andCtParam10IsNull() {
            addCriterion("ct_param10 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam10IsNotNull() {
            addCriterion("ct_param10 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam10EqualTo(String value) {
            addCriterion("ct_param10 =", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10NotEqualTo(String value) {
            addCriterion("ct_param10 <>", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10GreaterThan(String value) {
            addCriterion("ct_param10 >", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param10 >=", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10LessThan(String value) {
            addCriterion("ct_param10 <", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10LessThanOrEqualTo(String value) {
            addCriterion("ct_param10 <=", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10Like(String value) {
            addCriterion("ct_param10 like", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10NotLike(String value) {
            addCriterion("ct_param10 not like", value, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10In(List<String> values) {
            addCriterion("ct_param10 in", values, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10NotIn(List<String> values) {
            addCriterion("ct_param10 not in", values, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10Between(String value1, String value2) {
            addCriterion("ct_param10 between", value1, value2, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtParam10NotBetween(String value1, String value2) {
            addCriterion("ct_param10 not between", value1, value2, "ctParam10");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNull() {
            addCriterion("ct_status is null");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNotNull() {
            addCriterion("ct_status is not null");
            return (Criteria) this;
        }

        public Criteria andCtStatusEqualTo(Byte value) {
            addCriterion("ct_status =", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotEqualTo(Byte value) {
            addCriterion("ct_status <>", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThan(Byte value) {
            addCriterion("ct_status >", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ct_status >=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThan(Byte value) {
            addCriterion("ct_status <", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ct_status <=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusIn(List<Byte> values) {
            addCriterion("ct_status in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotIn(List<Byte> values) {
            addCriterion("ct_status not in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusBetween(Byte value1, Byte value2) {
            addCriterion("ct_status between", value1, value2, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ct_status not between", value1, value2, "ctStatus");
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