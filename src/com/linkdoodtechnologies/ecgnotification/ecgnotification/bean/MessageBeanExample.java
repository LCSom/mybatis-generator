package com.linkdoodtechnologies.ecgnotification.ecgnotification.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageBeanExample() {
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

        public Criteria andMtIdIsNull() {
            addCriterion("mt_id is null");
            return (Criteria) this;
        }

        public Criteria andMtIdIsNotNull() {
            addCriterion("mt_id is not null");
            return (Criteria) this;
        }

        public Criteria andMtIdEqualTo(Integer value) {
            addCriterion("mt_id =", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotEqualTo(Integer value) {
            addCriterion("mt_id <>", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThan(Integer value) {
            addCriterion("mt_id >", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_id >=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThan(Integer value) {
            addCriterion("mt_id <", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThanOrEqualTo(Integer value) {
            addCriterion("mt_id <=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdIn(List<Integer> values) {
            addCriterion("mt_id in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotIn(List<Integer> values) {
            addCriterion("mt_id not in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdBetween(Integer value1, Integer value2) {
            addCriterion("mt_id between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_id not between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtStIdIsNull() {
            addCriterion("mt_st_id is null");
            return (Criteria) this;
        }

        public Criteria andMtStIdIsNotNull() {
            addCriterion("mt_st_id is not null");
            return (Criteria) this;
        }

        public Criteria andMtStIdEqualTo(Integer value) {
            addCriterion("mt_st_id =", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdNotEqualTo(Integer value) {
            addCriterion("mt_st_id <>", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdGreaterThan(Integer value) {
            addCriterion("mt_st_id >", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_st_id >=", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdLessThan(Integer value) {
            addCriterion("mt_st_id <", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdLessThanOrEqualTo(Integer value) {
            addCriterion("mt_st_id <=", value, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdIn(List<Integer> values) {
            addCriterion("mt_st_id in", values, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdNotIn(List<Integer> values) {
            addCriterion("mt_st_id not in", values, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdBetween(Integer value1, Integer value2) {
            addCriterion("mt_st_id between", value1, value2, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_st_id not between", value1, value2, "mtStId");
            return (Criteria) this;
        }

        public Criteria andMtMessageIsNull() {
            addCriterion("mt_message is null");
            return (Criteria) this;
        }

        public Criteria andMtMessageIsNotNull() {
            addCriterion("mt_message is not null");
            return (Criteria) this;
        }

        public Criteria andMtMessageEqualTo(String value) {
            addCriterion("mt_message =", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageNotEqualTo(String value) {
            addCriterion("mt_message <>", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageGreaterThan(String value) {
            addCriterion("mt_message >", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageGreaterThanOrEqualTo(String value) {
            addCriterion("mt_message >=", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageLessThan(String value) {
            addCriterion("mt_message <", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageLessThanOrEqualTo(String value) {
            addCriterion("mt_message <=", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageLike(String value) {
            addCriterion("mt_message like", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageNotLike(String value) {
            addCriterion("mt_message not like", value, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageIn(List<String> values) {
            addCriterion("mt_message in", values, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageNotIn(List<String> values) {
            addCriterion("mt_message not in", values, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageBetween(String value1, String value2) {
            addCriterion("mt_message between", value1, value2, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtMessageNotBetween(String value1, String value2) {
            addCriterion("mt_message not between", value1, value2, "mtMessage");
            return (Criteria) this;
        }

        public Criteria andMtReadIsNull() {
            addCriterion("mt_read is null");
            return (Criteria) this;
        }

        public Criteria andMtReadIsNotNull() {
            addCriterion("mt_read is not null");
            return (Criteria) this;
        }

        public Criteria andMtReadEqualTo(Integer value) {
            addCriterion("mt_read =", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadNotEqualTo(Integer value) {
            addCriterion("mt_read <>", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadGreaterThan(Integer value) {
            addCriterion("mt_read >", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_read >=", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadLessThan(Integer value) {
            addCriterion("mt_read <", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadLessThanOrEqualTo(Integer value) {
            addCriterion("mt_read <=", value, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadIn(List<Integer> values) {
            addCriterion("mt_read in", values, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadNotIn(List<Integer> values) {
            addCriterion("mt_read not in", values, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadBetween(Integer value1, Integer value2) {
            addCriterion("mt_read between", value1, value2, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtReadNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_read not between", value1, value2, "mtRead");
            return (Criteria) this;
        }

        public Criteria andMtStatusIsNull() {
            addCriterion("mt_status is null");
            return (Criteria) this;
        }

        public Criteria andMtStatusIsNotNull() {
            addCriterion("mt_status is not null");
            return (Criteria) this;
        }

        public Criteria andMtStatusEqualTo(Integer value) {
            addCriterion("mt_status =", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusNotEqualTo(Integer value) {
            addCriterion("mt_status <>", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusGreaterThan(Integer value) {
            addCriterion("mt_status >", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_status >=", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusLessThan(Integer value) {
            addCriterion("mt_status <", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mt_status <=", value, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusIn(List<Integer> values) {
            addCriterion("mt_status in", values, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusNotIn(List<Integer> values) {
            addCriterion("mt_status not in", values, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusBetween(Integer value1, Integer value2) {
            addCriterion("mt_status between", value1, value2, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_status not between", value1, value2, "mtStatus");
            return (Criteria) this;
        }

        public Criteria andMtParam1IsNull() {
            addCriterion("mt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andMtParam1IsNotNull() {
            addCriterion("mt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andMtParam1EqualTo(String value) {
            addCriterion("mt_param1 =", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1NotEqualTo(String value) {
            addCriterion("mt_param1 <>", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1GreaterThan(String value) {
            addCriterion("mt_param1 >", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("mt_param1 >=", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1LessThan(String value) {
            addCriterion("mt_param1 <", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1LessThanOrEqualTo(String value) {
            addCriterion("mt_param1 <=", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1Like(String value) {
            addCriterion("mt_param1 like", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1NotLike(String value) {
            addCriterion("mt_param1 not like", value, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1In(List<String> values) {
            addCriterion("mt_param1 in", values, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1NotIn(List<String> values) {
            addCriterion("mt_param1 not in", values, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1Between(String value1, String value2) {
            addCriterion("mt_param1 between", value1, value2, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam1NotBetween(String value1, String value2) {
            addCriterion("mt_param1 not between", value1, value2, "mtParam1");
            return (Criteria) this;
        }

        public Criteria andMtParam2IsNull() {
            addCriterion("mt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andMtParam2IsNotNull() {
            addCriterion("mt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andMtParam2EqualTo(String value) {
            addCriterion("mt_param2 =", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2NotEqualTo(String value) {
            addCriterion("mt_param2 <>", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2GreaterThan(String value) {
            addCriterion("mt_param2 >", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("mt_param2 >=", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2LessThan(String value) {
            addCriterion("mt_param2 <", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2LessThanOrEqualTo(String value) {
            addCriterion("mt_param2 <=", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2Like(String value) {
            addCriterion("mt_param2 like", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2NotLike(String value) {
            addCriterion("mt_param2 not like", value, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2In(List<String> values) {
            addCriterion("mt_param2 in", values, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2NotIn(List<String> values) {
            addCriterion("mt_param2 not in", values, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2Between(String value1, String value2) {
            addCriterion("mt_param2 between", value1, value2, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam2NotBetween(String value1, String value2) {
            addCriterion("mt_param2 not between", value1, value2, "mtParam2");
            return (Criteria) this;
        }

        public Criteria andMtParam3IsNull() {
            addCriterion("mt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andMtParam3IsNotNull() {
            addCriterion("mt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andMtParam3EqualTo(String value) {
            addCriterion("mt_param3 =", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3NotEqualTo(String value) {
            addCriterion("mt_param3 <>", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3GreaterThan(String value) {
            addCriterion("mt_param3 >", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("mt_param3 >=", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3LessThan(String value) {
            addCriterion("mt_param3 <", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3LessThanOrEqualTo(String value) {
            addCriterion("mt_param3 <=", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3Like(String value) {
            addCriterion("mt_param3 like", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3NotLike(String value) {
            addCriterion("mt_param3 not like", value, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3In(List<String> values) {
            addCriterion("mt_param3 in", values, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3NotIn(List<String> values) {
            addCriterion("mt_param3 not in", values, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3Between(String value1, String value2) {
            addCriterion("mt_param3 between", value1, value2, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam3NotBetween(String value1, String value2) {
            addCriterion("mt_param3 not between", value1, value2, "mtParam3");
            return (Criteria) this;
        }

        public Criteria andMtParam4IsNull() {
            addCriterion("mt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andMtParam4IsNotNull() {
            addCriterion("mt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andMtParam4EqualTo(String value) {
            addCriterion("mt_param4 =", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4NotEqualTo(String value) {
            addCriterion("mt_param4 <>", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4GreaterThan(String value) {
            addCriterion("mt_param4 >", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("mt_param4 >=", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4LessThan(String value) {
            addCriterion("mt_param4 <", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4LessThanOrEqualTo(String value) {
            addCriterion("mt_param4 <=", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4Like(String value) {
            addCriterion("mt_param4 like", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4NotLike(String value) {
            addCriterion("mt_param4 not like", value, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4In(List<String> values) {
            addCriterion("mt_param4 in", values, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4NotIn(List<String> values) {
            addCriterion("mt_param4 not in", values, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4Between(String value1, String value2) {
            addCriterion("mt_param4 between", value1, value2, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam4NotBetween(String value1, String value2) {
            addCriterion("mt_param4 not between", value1, value2, "mtParam4");
            return (Criteria) this;
        }

        public Criteria andMtParam5IsNull() {
            addCriterion("mt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andMtParam5IsNotNull() {
            addCriterion("mt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andMtParam5EqualTo(String value) {
            addCriterion("mt_param5 =", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5NotEqualTo(String value) {
            addCriterion("mt_param5 <>", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5GreaterThan(String value) {
            addCriterion("mt_param5 >", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("mt_param5 >=", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5LessThan(String value) {
            addCriterion("mt_param5 <", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5LessThanOrEqualTo(String value) {
            addCriterion("mt_param5 <=", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5Like(String value) {
            addCriterion("mt_param5 like", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5NotLike(String value) {
            addCriterion("mt_param5 not like", value, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5In(List<String> values) {
            addCriterion("mt_param5 in", values, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5NotIn(List<String> values) {
            addCriterion("mt_param5 not in", values, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5Between(String value1, String value2) {
            addCriterion("mt_param5 between", value1, value2, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtParam5NotBetween(String value1, String value2) {
            addCriterion("mt_param5 not between", value1, value2, "mtParam5");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeIsNull() {
            addCriterion("mt_created_datetime is null");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeIsNotNull() {
            addCriterion("mt_created_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeEqualTo(Date value) {
            addCriterion("mt_created_datetime =", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("mt_created_datetime <>", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeGreaterThan(Date value) {
            addCriterion("mt_created_datetime >", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mt_created_datetime >=", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeLessThan(Date value) {
            addCriterion("mt_created_datetime <", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("mt_created_datetime <=", value, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeIn(List<Date> values) {
            addCriterion("mt_created_datetime in", values, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("mt_created_datetime not in", values, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("mt_created_datetime between", value1, value2, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("mt_created_datetime not between", value1, value2, "mtCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeIsNull() {
            addCriterion("mt_updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeIsNotNull() {
            addCriterion("mt_updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeEqualTo(Date value) {
            addCriterion("mt_updated_datetime =", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("mt_updated_datetime <>", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("mt_updated_datetime >", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mt_updated_datetime >=", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeLessThan(Date value) {
            addCriterion("mt_updated_datetime <", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("mt_updated_datetime <=", value, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeIn(List<Date> values) {
            addCriterion("mt_updated_datetime in", values, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("mt_updated_datetime not in", values, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("mt_updated_datetime between", value1, value2, "mtUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andMtUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("mt_updated_datetime not between", value1, value2, "mtUpdatedDatetime");
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