package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

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

        public Criteria andConstIdIsNull() {
            addCriterion("const_id is null");
            return (Criteria) this;
        }

        public Criteria andConstIdIsNotNull() {
            addCriterion("const_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstIdEqualTo(Integer value) {
            addCriterion("const_id =", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdNotEqualTo(Integer value) {
            addCriterion("const_id <>", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdGreaterThan(Integer value) {
            addCriterion("const_id >", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("const_id >=", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdLessThan(Integer value) {
            addCriterion("const_id <", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdLessThanOrEqualTo(Integer value) {
            addCriterion("const_id <=", value, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdIn(List<Integer> values) {
            addCriterion("const_id in", values, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdNotIn(List<Integer> values) {
            addCriterion("const_id not in", values, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdBetween(Integer value1, Integer value2) {
            addCriterion("const_id between", value1, value2, "constId");
            return (Criteria) this;
        }

        public Criteria andConstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("const_id not between", value1, value2, "constId");
            return (Criteria) this;
        }

        public Criteria andConstTypeIsNull() {
            addCriterion("const_type is null");
            return (Criteria) this;
        }

        public Criteria andConstTypeIsNotNull() {
            addCriterion("const_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstTypeEqualTo(String value) {
            addCriterion("const_type =", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeNotEqualTo(String value) {
            addCriterion("const_type <>", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeGreaterThan(String value) {
            addCriterion("const_type >", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("const_type >=", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeLessThan(String value) {
            addCriterion("const_type <", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeLessThanOrEqualTo(String value) {
            addCriterion("const_type <=", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeLike(String value) {
            addCriterion("const_type like", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeNotLike(String value) {
            addCriterion("const_type not like", value, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeIn(List<String> values) {
            addCriterion("const_type in", values, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeNotIn(List<String> values) {
            addCriterion("const_type not in", values, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeBetween(String value1, String value2) {
            addCriterion("const_type between", value1, value2, "constType");
            return (Criteria) this;
        }

        public Criteria andConstTypeNotBetween(String value1, String value2) {
            addCriterion("const_type not between", value1, value2, "constType");
            return (Criteria) this;
        }

        public Criteria andConstValueIsNull() {
            addCriterion("const_value is null");
            return (Criteria) this;
        }

        public Criteria andConstValueIsNotNull() {
            addCriterion("const_value is not null");
            return (Criteria) this;
        }

        public Criteria andConstValueEqualTo(String value) {
            addCriterion("const_value =", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueNotEqualTo(String value) {
            addCriterion("const_value <>", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueGreaterThan(String value) {
            addCriterion("const_value >", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueGreaterThanOrEqualTo(String value) {
            addCriterion("const_value >=", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueLessThan(String value) {
            addCriterion("const_value <", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueLessThanOrEqualTo(String value) {
            addCriterion("const_value <=", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueLike(String value) {
            addCriterion("const_value like", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueNotLike(String value) {
            addCriterion("const_value not like", value, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueIn(List<String> values) {
            addCriterion("const_value in", values, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueNotIn(List<String> values) {
            addCriterion("const_value not in", values, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueBetween(String value1, String value2) {
            addCriterion("const_value between", value1, value2, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstValueNotBetween(String value1, String value2) {
            addCriterion("const_value not between", value1, value2, "constValue");
            return (Criteria) this;
        }

        public Criteria andConstParam1IsNull() {
            addCriterion("const_param1 is null");
            return (Criteria) this;
        }

        public Criteria andConstParam1IsNotNull() {
            addCriterion("const_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andConstParam1EqualTo(String value) {
            addCriterion("const_param1 =", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1NotEqualTo(String value) {
            addCriterion("const_param1 <>", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1GreaterThan(String value) {
            addCriterion("const_param1 >", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1GreaterThanOrEqualTo(String value) {
            addCriterion("const_param1 >=", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1LessThan(String value) {
            addCriterion("const_param1 <", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1LessThanOrEqualTo(String value) {
            addCriterion("const_param1 <=", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1Like(String value) {
            addCriterion("const_param1 like", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1NotLike(String value) {
            addCriterion("const_param1 not like", value, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1In(List<String> values) {
            addCriterion("const_param1 in", values, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1NotIn(List<String> values) {
            addCriterion("const_param1 not in", values, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1Between(String value1, String value2) {
            addCriterion("const_param1 between", value1, value2, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam1NotBetween(String value1, String value2) {
            addCriterion("const_param1 not between", value1, value2, "constParam1");
            return (Criteria) this;
        }

        public Criteria andConstParam2IsNull() {
            addCriterion("const_param2 is null");
            return (Criteria) this;
        }

        public Criteria andConstParam2IsNotNull() {
            addCriterion("const_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andConstParam2EqualTo(String value) {
            addCriterion("const_param2 =", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2NotEqualTo(String value) {
            addCriterion("const_param2 <>", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2GreaterThan(String value) {
            addCriterion("const_param2 >", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2GreaterThanOrEqualTo(String value) {
            addCriterion("const_param2 >=", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2LessThan(String value) {
            addCriterion("const_param2 <", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2LessThanOrEqualTo(String value) {
            addCriterion("const_param2 <=", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2Like(String value) {
            addCriterion("const_param2 like", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2NotLike(String value) {
            addCriterion("const_param2 not like", value, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2In(List<String> values) {
            addCriterion("const_param2 in", values, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2NotIn(List<String> values) {
            addCriterion("const_param2 not in", values, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2Between(String value1, String value2) {
            addCriterion("const_param2 between", value1, value2, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam2NotBetween(String value1, String value2) {
            addCriterion("const_param2 not between", value1, value2, "constParam2");
            return (Criteria) this;
        }

        public Criteria andConstParam3IsNull() {
            addCriterion("const_param3 is null");
            return (Criteria) this;
        }

        public Criteria andConstParam3IsNotNull() {
            addCriterion("const_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andConstParam3EqualTo(String value) {
            addCriterion("const_param3 =", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3NotEqualTo(String value) {
            addCriterion("const_param3 <>", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3GreaterThan(String value) {
            addCriterion("const_param3 >", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3GreaterThanOrEqualTo(String value) {
            addCriterion("const_param3 >=", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3LessThan(String value) {
            addCriterion("const_param3 <", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3LessThanOrEqualTo(String value) {
            addCriterion("const_param3 <=", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3Like(String value) {
            addCriterion("const_param3 like", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3NotLike(String value) {
            addCriterion("const_param3 not like", value, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3In(List<String> values) {
            addCriterion("const_param3 in", values, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3NotIn(List<String> values) {
            addCriterion("const_param3 not in", values, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3Between(String value1, String value2) {
            addCriterion("const_param3 between", value1, value2, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam3NotBetween(String value1, String value2) {
            addCriterion("const_param3 not between", value1, value2, "constParam3");
            return (Criteria) this;
        }

        public Criteria andConstParam4IsNull() {
            addCriterion("const_param4 is null");
            return (Criteria) this;
        }

        public Criteria andConstParam4IsNotNull() {
            addCriterion("const_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andConstParam4EqualTo(String value) {
            addCriterion("const_param4 =", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4NotEqualTo(String value) {
            addCriterion("const_param4 <>", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4GreaterThan(String value) {
            addCriterion("const_param4 >", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4GreaterThanOrEqualTo(String value) {
            addCriterion("const_param4 >=", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4LessThan(String value) {
            addCriterion("const_param4 <", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4LessThanOrEqualTo(String value) {
            addCriterion("const_param4 <=", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4Like(String value) {
            addCriterion("const_param4 like", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4NotLike(String value) {
            addCriterion("const_param4 not like", value, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4In(List<String> values) {
            addCriterion("const_param4 in", values, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4NotIn(List<String> values) {
            addCriterion("const_param4 not in", values, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4Between(String value1, String value2) {
            addCriterion("const_param4 between", value1, value2, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam4NotBetween(String value1, String value2) {
            addCriterion("const_param4 not between", value1, value2, "constParam4");
            return (Criteria) this;
        }

        public Criteria andConstParam5IsNull() {
            addCriterion("const_param5 is null");
            return (Criteria) this;
        }

        public Criteria andConstParam5IsNotNull() {
            addCriterion("const_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andConstParam5EqualTo(String value) {
            addCriterion("const_param5 =", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5NotEqualTo(String value) {
            addCriterion("const_param5 <>", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5GreaterThan(String value) {
            addCriterion("const_param5 >", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5GreaterThanOrEqualTo(String value) {
            addCriterion("const_param5 >=", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5LessThan(String value) {
            addCriterion("const_param5 <", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5LessThanOrEqualTo(String value) {
            addCriterion("const_param5 <=", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5Like(String value) {
            addCriterion("const_param5 like", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5NotLike(String value) {
            addCriterion("const_param5 not like", value, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5In(List<String> values) {
            addCriterion("const_param5 in", values, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5NotIn(List<String> values) {
            addCriterion("const_param5 not in", values, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5Between(String value1, String value2) {
            addCriterion("const_param5 between", value1, value2, "constParam5");
            return (Criteria) this;
        }

        public Criteria andConstParam5NotBetween(String value1, String value2) {
            addCriterion("const_param5 not between", value1, value2, "constParam5");
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