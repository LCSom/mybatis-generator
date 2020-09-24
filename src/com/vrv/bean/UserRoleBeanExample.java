package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class UserRoleBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleBeanExample() {
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

        public Criteria andUrtIdIsNull() {
            addCriterion("urt_id is null");
            return (Criteria) this;
        }

        public Criteria andUrtIdIsNotNull() {
            addCriterion("urt_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrtIdEqualTo(Integer value) {
            addCriterion("urt_id =", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdNotEqualTo(Integer value) {
            addCriterion("urt_id <>", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdGreaterThan(Integer value) {
            addCriterion("urt_id >", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("urt_id >=", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdLessThan(Integer value) {
            addCriterion("urt_id <", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdLessThanOrEqualTo(Integer value) {
            addCriterion("urt_id <=", value, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdIn(List<Integer> values) {
            addCriterion("urt_id in", values, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdNotIn(List<Integer> values) {
            addCriterion("urt_id not in", values, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdBetween(Integer value1, Integer value2) {
            addCriterion("urt_id between", value1, value2, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("urt_id not between", value1, value2, "urtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdIsNull() {
            addCriterion("urt_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdIsNotNull() {
            addCriterion("urt_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdEqualTo(Integer value) {
            addCriterion("urt_ut_id =", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdNotEqualTo(Integer value) {
            addCriterion("urt_ut_id <>", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdGreaterThan(Integer value) {
            addCriterion("urt_ut_id >", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("urt_ut_id >=", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdLessThan(Integer value) {
            addCriterion("urt_ut_id <", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("urt_ut_id <=", value, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdIn(List<Integer> values) {
            addCriterion("urt_ut_id in", values, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdNotIn(List<Integer> values) {
            addCriterion("urt_ut_id not in", values, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdBetween(Integer value1, Integer value2) {
            addCriterion("urt_ut_id between", value1, value2, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("urt_ut_id not between", value1, value2, "urtUtId");
            return (Criteria) this;
        }

        public Criteria andUrtNameIsNull() {
            addCriterion("urt_name is null");
            return (Criteria) this;
        }

        public Criteria andUrtNameIsNotNull() {
            addCriterion("urt_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrtNameEqualTo(String value) {
            addCriterion("urt_name =", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameNotEqualTo(String value) {
            addCriterion("urt_name <>", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameGreaterThan(String value) {
            addCriterion("urt_name >", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("urt_name >=", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameLessThan(String value) {
            addCriterion("urt_name <", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameLessThanOrEqualTo(String value) {
            addCriterion("urt_name <=", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameLike(String value) {
            addCriterion("urt_name like", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameNotLike(String value) {
            addCriterion("urt_name not like", value, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameIn(List<String> values) {
            addCriterion("urt_name in", values, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameNotIn(List<String> values) {
            addCriterion("urt_name not in", values, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameBetween(String value1, String value2) {
            addCriterion("urt_name between", value1, value2, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtNameNotBetween(String value1, String value2) {
            addCriterion("urt_name not between", value1, value2, "urtName");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionIsNull() {
            addCriterion("urt_description is null");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionIsNotNull() {
            addCriterion("urt_description is not null");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionEqualTo(String value) {
            addCriterion("urt_description =", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionNotEqualTo(String value) {
            addCriterion("urt_description <>", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionGreaterThan(String value) {
            addCriterion("urt_description >", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("urt_description >=", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionLessThan(String value) {
            addCriterion("urt_description <", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionLessThanOrEqualTo(String value) {
            addCriterion("urt_description <=", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionLike(String value) {
            addCriterion("urt_description like", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionNotLike(String value) {
            addCriterion("urt_description not like", value, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionIn(List<String> values) {
            addCriterion("urt_description in", values, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionNotIn(List<String> values) {
            addCriterion("urt_description not in", values, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionBetween(String value1, String value2) {
            addCriterion("urt_description between", value1, value2, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtDescriptionNotBetween(String value1, String value2) {
            addCriterion("urt_description not between", value1, value2, "urtDescription");
            return (Criteria) this;
        }

        public Criteria andUrtParam1IsNull() {
            addCriterion("urt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andUrtParam1IsNotNull() {
            addCriterion("urt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andUrtParam1EqualTo(String value) {
            addCriterion("urt_param1 =", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1NotEqualTo(String value) {
            addCriterion("urt_param1 <>", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1GreaterThan(String value) {
            addCriterion("urt_param1 >", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("urt_param1 >=", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1LessThan(String value) {
            addCriterion("urt_param1 <", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1LessThanOrEqualTo(String value) {
            addCriterion("urt_param1 <=", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1Like(String value) {
            addCriterion("urt_param1 like", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1NotLike(String value) {
            addCriterion("urt_param1 not like", value, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1In(List<String> values) {
            addCriterion("urt_param1 in", values, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1NotIn(List<String> values) {
            addCriterion("urt_param1 not in", values, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1Between(String value1, String value2) {
            addCriterion("urt_param1 between", value1, value2, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam1NotBetween(String value1, String value2) {
            addCriterion("urt_param1 not between", value1, value2, "urtParam1");
            return (Criteria) this;
        }

        public Criteria andUrtParam2IsNull() {
            addCriterion("urt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andUrtParam2IsNotNull() {
            addCriterion("urt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andUrtParam2EqualTo(String value) {
            addCriterion("urt_param2 =", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2NotEqualTo(String value) {
            addCriterion("urt_param2 <>", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2GreaterThan(String value) {
            addCriterion("urt_param2 >", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("urt_param2 >=", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2LessThan(String value) {
            addCriterion("urt_param2 <", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2LessThanOrEqualTo(String value) {
            addCriterion("urt_param2 <=", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2Like(String value) {
            addCriterion("urt_param2 like", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2NotLike(String value) {
            addCriterion("urt_param2 not like", value, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2In(List<String> values) {
            addCriterion("urt_param2 in", values, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2NotIn(List<String> values) {
            addCriterion("urt_param2 not in", values, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2Between(String value1, String value2) {
            addCriterion("urt_param2 between", value1, value2, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam2NotBetween(String value1, String value2) {
            addCriterion("urt_param2 not between", value1, value2, "urtParam2");
            return (Criteria) this;
        }

        public Criteria andUrtParam3IsNull() {
            addCriterion("urt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andUrtParam3IsNotNull() {
            addCriterion("urt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andUrtParam3EqualTo(String value) {
            addCriterion("urt_param3 =", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3NotEqualTo(String value) {
            addCriterion("urt_param3 <>", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3GreaterThan(String value) {
            addCriterion("urt_param3 >", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("urt_param3 >=", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3LessThan(String value) {
            addCriterion("urt_param3 <", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3LessThanOrEqualTo(String value) {
            addCriterion("urt_param3 <=", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3Like(String value) {
            addCriterion("urt_param3 like", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3NotLike(String value) {
            addCriterion("urt_param3 not like", value, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3In(List<String> values) {
            addCriterion("urt_param3 in", values, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3NotIn(List<String> values) {
            addCriterion("urt_param3 not in", values, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3Between(String value1, String value2) {
            addCriterion("urt_param3 between", value1, value2, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam3NotBetween(String value1, String value2) {
            addCriterion("urt_param3 not between", value1, value2, "urtParam3");
            return (Criteria) this;
        }

        public Criteria andUrtParam4IsNull() {
            addCriterion("urt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andUrtParam4IsNotNull() {
            addCriterion("urt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andUrtParam4EqualTo(String value) {
            addCriterion("urt_param4 =", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4NotEqualTo(String value) {
            addCriterion("urt_param4 <>", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4GreaterThan(String value) {
            addCriterion("urt_param4 >", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("urt_param4 >=", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4LessThan(String value) {
            addCriterion("urt_param4 <", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4LessThanOrEqualTo(String value) {
            addCriterion("urt_param4 <=", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4Like(String value) {
            addCriterion("urt_param4 like", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4NotLike(String value) {
            addCriterion("urt_param4 not like", value, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4In(List<String> values) {
            addCriterion("urt_param4 in", values, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4NotIn(List<String> values) {
            addCriterion("urt_param4 not in", values, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4Between(String value1, String value2) {
            addCriterion("urt_param4 between", value1, value2, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam4NotBetween(String value1, String value2) {
            addCriterion("urt_param4 not between", value1, value2, "urtParam4");
            return (Criteria) this;
        }

        public Criteria andUrtParam5IsNull() {
            addCriterion("urt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andUrtParam5IsNotNull() {
            addCriterion("urt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andUrtParam5EqualTo(String value) {
            addCriterion("urt_param5 =", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5NotEqualTo(String value) {
            addCriterion("urt_param5 <>", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5GreaterThan(String value) {
            addCriterion("urt_param5 >", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("urt_param5 >=", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5LessThan(String value) {
            addCriterion("urt_param5 <", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5LessThanOrEqualTo(String value) {
            addCriterion("urt_param5 <=", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5Like(String value) {
            addCriterion("urt_param5 like", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5NotLike(String value) {
            addCriterion("urt_param5 not like", value, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5In(List<String> values) {
            addCriterion("urt_param5 in", values, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5NotIn(List<String> values) {
            addCriterion("urt_param5 not in", values, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5Between(String value1, String value2) {
            addCriterion("urt_param5 between", value1, value2, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtParam5NotBetween(String value1, String value2) {
            addCriterion("urt_param5 not between", value1, value2, "urtParam5");
            return (Criteria) this;
        }

        public Criteria andUrtStatusIsNull() {
            addCriterion("urt_status is null");
            return (Criteria) this;
        }

        public Criteria andUrtStatusIsNotNull() {
            addCriterion("urt_status is not null");
            return (Criteria) this;
        }

        public Criteria andUrtStatusEqualTo(Integer value) {
            addCriterion("urt_status =", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusNotEqualTo(Integer value) {
            addCriterion("urt_status <>", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusGreaterThan(Integer value) {
            addCriterion("urt_status >", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("urt_status >=", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusLessThan(Integer value) {
            addCriterion("urt_status <", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("urt_status <=", value, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusIn(List<Integer> values) {
            addCriterion("urt_status in", values, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusNotIn(List<Integer> values) {
            addCriterion("urt_status not in", values, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusBetween(Integer value1, Integer value2) {
            addCriterion("urt_status between", value1, value2, "urtStatus");
            return (Criteria) this;
        }

        public Criteria andUrtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("urt_status not between", value1, value2, "urtStatus");
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