package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogBeanExample() {
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

        public Criteria andLtIdIsNull() {
            addCriterion("lt_id is null");
            return (Criteria) this;
        }

        public Criteria andLtIdIsNotNull() {
            addCriterion("lt_id is not null");
            return (Criteria) this;
        }

        public Criteria andLtIdEqualTo(Integer value) {
            addCriterion("lt_id =", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdNotEqualTo(Integer value) {
            addCriterion("lt_id <>", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdGreaterThan(Integer value) {
            addCriterion("lt_id >", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lt_id >=", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdLessThan(Integer value) {
            addCriterion("lt_id <", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdLessThanOrEqualTo(Integer value) {
            addCriterion("lt_id <=", value, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdIn(List<Integer> values) {
            addCriterion("lt_id in", values, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdNotIn(List<Integer> values) {
            addCriterion("lt_id not in", values, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdBetween(Integer value1, Integer value2) {
            addCriterion("lt_id between", value1, value2, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lt_id not between", value1, value2, "ltId");
            return (Criteria) this;
        }

        public Criteria andLtOprLpIsNull() {
            addCriterion("lt_opr_lp is null");
            return (Criteria) this;
        }

        public Criteria andLtOprLpIsNotNull() {
            addCriterion("lt_opr_lp is not null");
            return (Criteria) this;
        }

        public Criteria andLtOprLpEqualTo(String value) {
            addCriterion("lt_opr_lp =", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpNotEqualTo(String value) {
            addCriterion("lt_opr_lp <>", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpGreaterThan(String value) {
            addCriterion("lt_opr_lp >", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpGreaterThanOrEqualTo(String value) {
            addCriterion("lt_opr_lp >=", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpLessThan(String value) {
            addCriterion("lt_opr_lp <", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpLessThanOrEqualTo(String value) {
            addCriterion("lt_opr_lp <=", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpLike(String value) {
            addCriterion("lt_opr_lp like", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpNotLike(String value) {
            addCriterion("lt_opr_lp not like", value, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpIn(List<String> values) {
            addCriterion("lt_opr_lp in", values, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpNotIn(List<String> values) {
            addCriterion("lt_opr_lp not in", values, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpBetween(String value1, String value2) {
            addCriterion("lt_opr_lp between", value1, value2, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtOprLpNotBetween(String value1, String value2) {
            addCriterion("lt_opr_lp not between", value1, value2, "ltOprLp");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeIsNull() {
            addCriterion("lt_log_type is null");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeIsNotNull() {
            addCriterion("lt_log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeEqualTo(String value) {
            addCriterion("lt_log_type =", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeNotEqualTo(String value) {
            addCriterion("lt_log_type <>", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeGreaterThan(String value) {
            addCriterion("lt_log_type >", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lt_log_type >=", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeLessThan(String value) {
            addCriterion("lt_log_type <", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeLessThanOrEqualTo(String value) {
            addCriterion("lt_log_type <=", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeLike(String value) {
            addCriterion("lt_log_type like", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeNotLike(String value) {
            addCriterion("lt_log_type not like", value, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeIn(List<String> values) {
            addCriterion("lt_log_type in", values, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeNotIn(List<String> values) {
            addCriterion("lt_log_type not in", values, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeBetween(String value1, String value2) {
            addCriterion("lt_log_type between", value1, value2, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtLogTypeNotBetween(String value1, String value2) {
            addCriterion("lt_log_type not between", value1, value2, "ltLogType");
            return (Criteria) this;
        }

        public Criteria andLtParam1IsNull() {
            addCriterion("lt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam1IsNotNull() {
            addCriterion("lt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam1EqualTo(String value) {
            addCriterion("lt_param1 =", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1NotEqualTo(String value) {
            addCriterion("lt_param1 <>", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1GreaterThan(String value) {
            addCriterion("lt_param1 >", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param1 >=", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1LessThan(String value) {
            addCriterion("lt_param1 <", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1LessThanOrEqualTo(String value) {
            addCriterion("lt_param1 <=", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1Like(String value) {
            addCriterion("lt_param1 like", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1NotLike(String value) {
            addCriterion("lt_param1 not like", value, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1In(List<String> values) {
            addCriterion("lt_param1 in", values, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1NotIn(List<String> values) {
            addCriterion("lt_param1 not in", values, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1Between(String value1, String value2) {
            addCriterion("lt_param1 between", value1, value2, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam1NotBetween(String value1, String value2) {
            addCriterion("lt_param1 not between", value1, value2, "ltParam1");
            return (Criteria) this;
        }

        public Criteria andLtParam2IsNull() {
            addCriterion("lt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam2IsNotNull() {
            addCriterion("lt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam2EqualTo(String value) {
            addCriterion("lt_param2 =", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2NotEqualTo(String value) {
            addCriterion("lt_param2 <>", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2GreaterThan(String value) {
            addCriterion("lt_param2 >", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param2 >=", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2LessThan(String value) {
            addCriterion("lt_param2 <", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2LessThanOrEqualTo(String value) {
            addCriterion("lt_param2 <=", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2Like(String value) {
            addCriterion("lt_param2 like", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2NotLike(String value) {
            addCriterion("lt_param2 not like", value, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2In(List<String> values) {
            addCriterion("lt_param2 in", values, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2NotIn(List<String> values) {
            addCriterion("lt_param2 not in", values, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2Between(String value1, String value2) {
            addCriterion("lt_param2 between", value1, value2, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam2NotBetween(String value1, String value2) {
            addCriterion("lt_param2 not between", value1, value2, "ltParam2");
            return (Criteria) this;
        }

        public Criteria andLtParam3IsNull() {
            addCriterion("lt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam3IsNotNull() {
            addCriterion("lt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam3EqualTo(String value) {
            addCriterion("lt_param3 =", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3NotEqualTo(String value) {
            addCriterion("lt_param3 <>", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3GreaterThan(String value) {
            addCriterion("lt_param3 >", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param3 >=", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3LessThan(String value) {
            addCriterion("lt_param3 <", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3LessThanOrEqualTo(String value) {
            addCriterion("lt_param3 <=", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3Like(String value) {
            addCriterion("lt_param3 like", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3NotLike(String value) {
            addCriterion("lt_param3 not like", value, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3In(List<String> values) {
            addCriterion("lt_param3 in", values, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3NotIn(List<String> values) {
            addCriterion("lt_param3 not in", values, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3Between(String value1, String value2) {
            addCriterion("lt_param3 between", value1, value2, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam3NotBetween(String value1, String value2) {
            addCriterion("lt_param3 not between", value1, value2, "ltParam3");
            return (Criteria) this;
        }

        public Criteria andLtParam4IsNull() {
            addCriterion("lt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam4IsNotNull() {
            addCriterion("lt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam4EqualTo(String value) {
            addCriterion("lt_param4 =", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4NotEqualTo(String value) {
            addCriterion("lt_param4 <>", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4GreaterThan(String value) {
            addCriterion("lt_param4 >", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param4 >=", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4LessThan(String value) {
            addCriterion("lt_param4 <", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4LessThanOrEqualTo(String value) {
            addCriterion("lt_param4 <=", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4Like(String value) {
            addCriterion("lt_param4 like", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4NotLike(String value) {
            addCriterion("lt_param4 not like", value, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4In(List<String> values) {
            addCriterion("lt_param4 in", values, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4NotIn(List<String> values) {
            addCriterion("lt_param4 not in", values, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4Between(String value1, String value2) {
            addCriterion("lt_param4 between", value1, value2, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam4NotBetween(String value1, String value2) {
            addCriterion("lt_param4 not between", value1, value2, "ltParam4");
            return (Criteria) this;
        }

        public Criteria andLtParam5IsNull() {
            addCriterion("lt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam5IsNotNull() {
            addCriterion("lt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam5EqualTo(String value) {
            addCriterion("lt_param5 =", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5NotEqualTo(String value) {
            addCriterion("lt_param5 <>", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5GreaterThan(String value) {
            addCriterion("lt_param5 >", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param5 >=", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5LessThan(String value) {
            addCriterion("lt_param5 <", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5LessThanOrEqualTo(String value) {
            addCriterion("lt_param5 <=", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5Like(String value) {
            addCriterion("lt_param5 like", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5NotLike(String value) {
            addCriterion("lt_param5 not like", value, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5In(List<String> values) {
            addCriterion("lt_param5 in", values, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5NotIn(List<String> values) {
            addCriterion("lt_param5 not in", values, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5Between(String value1, String value2) {
            addCriterion("lt_param5 between", value1, value2, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam5NotBetween(String value1, String value2) {
            addCriterion("lt_param5 not between", value1, value2, "ltParam5");
            return (Criteria) this;
        }

        public Criteria andLtParam6IsNull() {
            addCriterion("lt_param6 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam6IsNotNull() {
            addCriterion("lt_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam6EqualTo(String value) {
            addCriterion("lt_param6 =", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6NotEqualTo(String value) {
            addCriterion("lt_param6 <>", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6GreaterThan(String value) {
            addCriterion("lt_param6 >", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param6 >=", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6LessThan(String value) {
            addCriterion("lt_param6 <", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6LessThanOrEqualTo(String value) {
            addCriterion("lt_param6 <=", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6Like(String value) {
            addCriterion("lt_param6 like", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6NotLike(String value) {
            addCriterion("lt_param6 not like", value, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6In(List<String> values) {
            addCriterion("lt_param6 in", values, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6NotIn(List<String> values) {
            addCriterion("lt_param6 not in", values, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6Between(String value1, String value2) {
            addCriterion("lt_param6 between", value1, value2, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam6NotBetween(String value1, String value2) {
            addCriterion("lt_param6 not between", value1, value2, "ltParam6");
            return (Criteria) this;
        }

        public Criteria andLtParam7IsNull() {
            addCriterion("lt_param7 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam7IsNotNull() {
            addCriterion("lt_param7 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam7EqualTo(String value) {
            addCriterion("lt_param7 =", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7NotEqualTo(String value) {
            addCriterion("lt_param7 <>", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7GreaterThan(String value) {
            addCriterion("lt_param7 >", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param7 >=", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7LessThan(String value) {
            addCriterion("lt_param7 <", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7LessThanOrEqualTo(String value) {
            addCriterion("lt_param7 <=", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7Like(String value) {
            addCriterion("lt_param7 like", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7NotLike(String value) {
            addCriterion("lt_param7 not like", value, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7In(List<String> values) {
            addCriterion("lt_param7 in", values, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7NotIn(List<String> values) {
            addCriterion("lt_param7 not in", values, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7Between(String value1, String value2) {
            addCriterion("lt_param7 between", value1, value2, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam7NotBetween(String value1, String value2) {
            addCriterion("lt_param7 not between", value1, value2, "ltParam7");
            return (Criteria) this;
        }

        public Criteria andLtParam8IsNull() {
            addCriterion("lt_param8 is null");
            return (Criteria) this;
        }

        public Criteria andLtParam8IsNotNull() {
            addCriterion("lt_param8 is not null");
            return (Criteria) this;
        }

        public Criteria andLtParam8EqualTo(String value) {
            addCriterion("lt_param8 =", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8NotEqualTo(String value) {
            addCriterion("lt_param8 <>", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8GreaterThan(String value) {
            addCriterion("lt_param8 >", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8GreaterThanOrEqualTo(String value) {
            addCriterion("lt_param8 >=", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8LessThan(String value) {
            addCriterion("lt_param8 <", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8LessThanOrEqualTo(String value) {
            addCriterion("lt_param8 <=", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8Like(String value) {
            addCriterion("lt_param8 like", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8NotLike(String value) {
            addCriterion("lt_param8 not like", value, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8In(List<String> values) {
            addCriterion("lt_param8 in", values, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8NotIn(List<String> values) {
            addCriterion("lt_param8 not in", values, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8Between(String value1, String value2) {
            addCriterion("lt_param8 between", value1, value2, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtParam8NotBetween(String value1, String value2) {
            addCriterion("lt_param8 not between", value1, value2, "ltParam8");
            return (Criteria) this;
        }

        public Criteria andLtStatusIsNull() {
            addCriterion("lt_status is null");
            return (Criteria) this;
        }

        public Criteria andLtStatusIsNotNull() {
            addCriterion("lt_status is not null");
            return (Criteria) this;
        }

        public Criteria andLtStatusEqualTo(Boolean value) {
            addCriterion("lt_status =", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusNotEqualTo(Boolean value) {
            addCriterion("lt_status <>", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusGreaterThan(Boolean value) {
            addCriterion("lt_status >", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lt_status >=", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusLessThan(Boolean value) {
            addCriterion("lt_status <", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("lt_status <=", value, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusIn(List<Boolean> values) {
            addCriterion("lt_status in", values, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusNotIn(List<Boolean> values) {
            addCriterion("lt_status not in", values, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("lt_status between", value1, value2, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lt_status not between", value1, value2, "ltStatus");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeIsNull() {
            addCriterion("lt_created_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeIsNotNull() {
            addCriterion("lt_created_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeEqualTo(Date value) {
            addCriterion("lt_created_datetime =", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("lt_created_datetime <>", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeGreaterThan(Date value) {
            addCriterion("lt_created_datetime >", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lt_created_datetime >=", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeLessThan(Date value) {
            addCriterion("lt_created_datetime <", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lt_created_datetime <=", value, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeIn(List<Date> values) {
            addCriterion("lt_created_datetime in", values, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("lt_created_datetime not in", values, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("lt_created_datetime between", value1, value2, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lt_created_datetime not between", value1, value2, "ltCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeIsNull() {
            addCriterion("lt_updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeIsNotNull() {
            addCriterion("lt_updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeEqualTo(Date value) {
            addCriterion("lt_updated_datetime =", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("lt_updated_datetime <>", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("lt_updated_datetime >", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lt_updated_datetime >=", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeLessThan(Date value) {
            addCriterion("lt_updated_datetime <", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lt_updated_datetime <=", value, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeIn(List<Date> values) {
            addCriterion("lt_updated_datetime in", values, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("lt_updated_datetime not in", values, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("lt_updated_datetime between", value1, value2, "ltUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andLtUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lt_updated_datetime not between", value1, value2, "ltUpdatedDatetime");
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