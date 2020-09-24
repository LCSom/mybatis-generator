package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

import java.util.ArrayList;
import java.util.List;

public class NotificationBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationBeanExample() {
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

        public Criteria andNtIdIsNull() {
            addCriterion("nt_id is null");
            return (Criteria) this;
        }

        public Criteria andNtIdIsNotNull() {
            addCriterion("nt_id is not null");
            return (Criteria) this;
        }

        public Criteria andNtIdEqualTo(Integer value) {
            addCriterion("nt_id =", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotEqualTo(Integer value) {
            addCriterion("nt_id <>", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThan(Integer value) {
            addCriterion("nt_id >", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_id >=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThan(Integer value) {
            addCriterion("nt_id <", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThanOrEqualTo(Integer value) {
            addCriterion("nt_id <=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdIn(List<Integer> values) {
            addCriterion("nt_id in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotIn(List<Integer> values) {
            addCriterion("nt_id not in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdBetween(Integer value1, Integer value2) {
            addCriterion("nt_id between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_id not between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdIsNull() {
            addCriterion("nt_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andNtUtIdIsNotNull() {
            addCriterion("nt_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andNtUtIdEqualTo(Integer value) {
            addCriterion("nt_ut_id =", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdNotEqualTo(Integer value) {
            addCriterion("nt_ut_id <>", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdGreaterThan(Integer value) {
            addCriterion("nt_ut_id >", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_ut_id >=", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdLessThan(Integer value) {
            addCriterion("nt_ut_id <", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("nt_ut_id <=", value, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdIn(List<Integer> values) {
            addCriterion("nt_ut_id in", values, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdNotIn(List<Integer> values) {
            addCriterion("nt_ut_id not in", values, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdBetween(Integer value1, Integer value2) {
            addCriterion("nt_ut_id between", value1, value2, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_ut_id not between", value1, value2, "ntUtId");
            return (Criteria) this;
        }

        public Criteria andNtTypeIsNull() {
            addCriterion("nt_type is null");
            return (Criteria) this;
        }

        public Criteria andNtTypeIsNotNull() {
            addCriterion("nt_type is not null");
            return (Criteria) this;
        }

        public Criteria andNtTypeEqualTo(String value) {
            addCriterion("nt_type =", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeNotEqualTo(String value) {
            addCriterion("nt_type <>", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeGreaterThan(String value) {
            addCriterion("nt_type >", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("nt_type >=", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeLessThan(String value) {
            addCriterion("nt_type <", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeLessThanOrEqualTo(String value) {
            addCriterion("nt_type <=", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeLike(String value) {
            addCriterion("nt_type like", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeNotLike(String value) {
            addCriterion("nt_type not like", value, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeIn(List<String> values) {
            addCriterion("nt_type in", values, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeNotIn(List<String> values) {
            addCriterion("nt_type not in", values, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeBetween(String value1, String value2) {
            addCriterion("nt_type between", value1, value2, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtTypeNotBetween(String value1, String value2) {
            addCriterion("nt_type not between", value1, value2, "ntType");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailIsNull() {
            addCriterion("nt_phone_email is null");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailIsNotNull() {
            addCriterion("nt_phone_email is not null");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailEqualTo(String value) {
            addCriterion("nt_phone_email =", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailNotEqualTo(String value) {
            addCriterion("nt_phone_email <>", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailGreaterThan(String value) {
            addCriterion("nt_phone_email >", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailGreaterThanOrEqualTo(String value) {
            addCriterion("nt_phone_email >=", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailLessThan(String value) {
            addCriterion("nt_phone_email <", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailLessThanOrEqualTo(String value) {
            addCriterion("nt_phone_email <=", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailLike(String value) {
            addCriterion("nt_phone_email like", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailNotLike(String value) {
            addCriterion("nt_phone_email not like", value, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailIn(List<String> values) {
            addCriterion("nt_phone_email in", values, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailNotIn(List<String> values) {
            addCriterion("nt_phone_email not in", values, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailBetween(String value1, String value2) {
            addCriterion("nt_phone_email between", value1, value2, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtPhoneEmailNotBetween(String value1, String value2) {
            addCriterion("nt_phone_email not between", value1, value2, "ntPhoneEmail");
            return (Criteria) this;
        }

        public Criteria andNtMessageIsNull() {
            addCriterion("nt_message is null");
            return (Criteria) this;
        }

        public Criteria andNtMessageIsNotNull() {
            addCriterion("nt_message is not null");
            return (Criteria) this;
        }

        public Criteria andNtMessageEqualTo(String value) {
            addCriterion("nt_message =", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageNotEqualTo(String value) {
            addCriterion("nt_message <>", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageGreaterThan(String value) {
            addCriterion("nt_message >", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageGreaterThanOrEqualTo(String value) {
            addCriterion("nt_message >=", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageLessThan(String value) {
            addCriterion("nt_message <", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageLessThanOrEqualTo(String value) {
            addCriterion("nt_message <=", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageLike(String value) {
            addCriterion("nt_message like", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageNotLike(String value) {
            addCriterion("nt_message not like", value, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageIn(List<String> values) {
            addCriterion("nt_message in", values, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageNotIn(List<String> values) {
            addCriterion("nt_message not in", values, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageBetween(String value1, String value2) {
            addCriterion("nt_message between", value1, value2, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtMessageNotBetween(String value1, String value2) {
            addCriterion("nt_message not between", value1, value2, "ntMessage");
            return (Criteria) this;
        }

        public Criteria andNtParam1IsNull() {
            addCriterion("nt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam1IsNotNull() {
            addCriterion("nt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam1EqualTo(String value) {
            addCriterion("nt_param1 =", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1NotEqualTo(String value) {
            addCriterion("nt_param1 <>", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1GreaterThan(String value) {
            addCriterion("nt_param1 >", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param1 >=", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1LessThan(String value) {
            addCriterion("nt_param1 <", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1LessThanOrEqualTo(String value) {
            addCriterion("nt_param1 <=", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1Like(String value) {
            addCriterion("nt_param1 like", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1NotLike(String value) {
            addCriterion("nt_param1 not like", value, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1In(List<String> values) {
            addCriterion("nt_param1 in", values, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1NotIn(List<String> values) {
            addCriterion("nt_param1 not in", values, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1Between(String value1, String value2) {
            addCriterion("nt_param1 between", value1, value2, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam1NotBetween(String value1, String value2) {
            addCriterion("nt_param1 not between", value1, value2, "ntParam1");
            return (Criteria) this;
        }

        public Criteria andNtParam2IsNull() {
            addCriterion("nt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam2IsNotNull() {
            addCriterion("nt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam2EqualTo(String value) {
            addCriterion("nt_param2 =", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2NotEqualTo(String value) {
            addCriterion("nt_param2 <>", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2GreaterThan(String value) {
            addCriterion("nt_param2 >", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param2 >=", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2LessThan(String value) {
            addCriterion("nt_param2 <", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2LessThanOrEqualTo(String value) {
            addCriterion("nt_param2 <=", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2Like(String value) {
            addCriterion("nt_param2 like", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2NotLike(String value) {
            addCriterion("nt_param2 not like", value, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2In(List<String> values) {
            addCriterion("nt_param2 in", values, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2NotIn(List<String> values) {
            addCriterion("nt_param2 not in", values, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2Between(String value1, String value2) {
            addCriterion("nt_param2 between", value1, value2, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam2NotBetween(String value1, String value2) {
            addCriterion("nt_param2 not between", value1, value2, "ntParam2");
            return (Criteria) this;
        }

        public Criteria andNtParam3IsNull() {
            addCriterion("nt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam3IsNotNull() {
            addCriterion("nt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam3EqualTo(String value) {
            addCriterion("nt_param3 =", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3NotEqualTo(String value) {
            addCriterion("nt_param3 <>", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3GreaterThan(String value) {
            addCriterion("nt_param3 >", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param3 >=", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3LessThan(String value) {
            addCriterion("nt_param3 <", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3LessThanOrEqualTo(String value) {
            addCriterion("nt_param3 <=", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3Like(String value) {
            addCriterion("nt_param3 like", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3NotLike(String value) {
            addCriterion("nt_param3 not like", value, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3In(List<String> values) {
            addCriterion("nt_param3 in", values, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3NotIn(List<String> values) {
            addCriterion("nt_param3 not in", values, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3Between(String value1, String value2) {
            addCriterion("nt_param3 between", value1, value2, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam3NotBetween(String value1, String value2) {
            addCriterion("nt_param3 not between", value1, value2, "ntParam3");
            return (Criteria) this;
        }

        public Criteria andNtParam4IsNull() {
            addCriterion("nt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam4IsNotNull() {
            addCriterion("nt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam4EqualTo(String value) {
            addCriterion("nt_param4 =", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4NotEqualTo(String value) {
            addCriterion("nt_param4 <>", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4GreaterThan(String value) {
            addCriterion("nt_param4 >", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param4 >=", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4LessThan(String value) {
            addCriterion("nt_param4 <", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4LessThanOrEqualTo(String value) {
            addCriterion("nt_param4 <=", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4Like(String value) {
            addCriterion("nt_param4 like", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4NotLike(String value) {
            addCriterion("nt_param4 not like", value, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4In(List<String> values) {
            addCriterion("nt_param4 in", values, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4NotIn(List<String> values) {
            addCriterion("nt_param4 not in", values, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4Between(String value1, String value2) {
            addCriterion("nt_param4 between", value1, value2, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam4NotBetween(String value1, String value2) {
            addCriterion("nt_param4 not between", value1, value2, "ntParam4");
            return (Criteria) this;
        }

        public Criteria andNtParam5IsNull() {
            addCriterion("nt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam5IsNotNull() {
            addCriterion("nt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam5EqualTo(String value) {
            addCriterion("nt_param5 =", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5NotEqualTo(String value) {
            addCriterion("nt_param5 <>", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5GreaterThan(String value) {
            addCriterion("nt_param5 >", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param5 >=", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5LessThan(String value) {
            addCriterion("nt_param5 <", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5LessThanOrEqualTo(String value) {
            addCriterion("nt_param5 <=", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5Like(String value) {
            addCriterion("nt_param5 like", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5NotLike(String value) {
            addCriterion("nt_param5 not like", value, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5In(List<String> values) {
            addCriterion("nt_param5 in", values, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5NotIn(List<String> values) {
            addCriterion("nt_param5 not in", values, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5Between(String value1, String value2) {
            addCriterion("nt_param5 between", value1, value2, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam5NotBetween(String value1, String value2) {
            addCriterion("nt_param5 not between", value1, value2, "ntParam5");
            return (Criteria) this;
        }

        public Criteria andNtParam6IsNull() {
            addCriterion("nt_param6 is null");
            return (Criteria) this;
        }

        public Criteria andNtParam6IsNotNull() {
            addCriterion("nt_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andNtParam6EqualTo(String value) {
            addCriterion("nt_param6 =", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6NotEqualTo(String value) {
            addCriterion("nt_param6 <>", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6GreaterThan(String value) {
            addCriterion("nt_param6 >", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6GreaterThanOrEqualTo(String value) {
            addCriterion("nt_param6 >=", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6LessThan(String value) {
            addCriterion("nt_param6 <", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6LessThanOrEqualTo(String value) {
            addCriterion("nt_param6 <=", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6Like(String value) {
            addCriterion("nt_param6 like", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6NotLike(String value) {
            addCriterion("nt_param6 not like", value, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6In(List<String> values) {
            addCriterion("nt_param6 in", values, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6NotIn(List<String> values) {
            addCriterion("nt_param6 not in", values, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6Between(String value1, String value2) {
            addCriterion("nt_param6 between", value1, value2, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtParam6NotBetween(String value1, String value2) {
            addCriterion("nt_param6 not between", value1, value2, "ntParam6");
            return (Criteria) this;
        }

        public Criteria andNtStatusIsNull() {
            addCriterion("nt_status is null");
            return (Criteria) this;
        }

        public Criteria andNtStatusIsNotNull() {
            addCriterion("nt_status is not null");
            return (Criteria) this;
        }

        public Criteria andNtStatusEqualTo(Integer value) {
            addCriterion("nt_status =", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusNotEqualTo(Integer value) {
            addCriterion("nt_status <>", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusGreaterThan(Integer value) {
            addCriterion("nt_status >", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_status >=", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusLessThan(Integer value) {
            addCriterion("nt_status <", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("nt_status <=", value, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusIn(List<Integer> values) {
            addCriterion("nt_status in", values, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusNotIn(List<Integer> values) {
            addCriterion("nt_status not in", values, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusBetween(Integer value1, Integer value2) {
            addCriterion("nt_status between", value1, value2, "ntStatus");
            return (Criteria) this;
        }

        public Criteria andNtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_status not between", value1, value2, "ntStatus");
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