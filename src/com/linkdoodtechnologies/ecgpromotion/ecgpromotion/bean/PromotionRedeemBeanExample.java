package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean;

import java.util.ArrayList;
import java.util.List;

public class PromotionRedeemBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionRedeemBeanExample() {
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

        public Criteria andPrrtIdIsNull() {
            addCriterion("prrt_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrtIdIsNotNull() {
            addCriterion("prrt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtIdEqualTo(Integer value) {
            addCriterion("prrt_id =", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdNotEqualTo(Integer value) {
            addCriterion("prrt_id <>", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdGreaterThan(Integer value) {
            addCriterion("prrt_id >", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prrt_id >=", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdLessThan(Integer value) {
            addCriterion("prrt_id <", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdLessThanOrEqualTo(Integer value) {
            addCriterion("prrt_id <=", value, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdIn(List<Integer> values) {
            addCriterion("prrt_id in", values, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdNotIn(List<Integer> values) {
            addCriterion("prrt_id not in", values, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdBetween(Integer value1, Integer value2) {
            addCriterion("prrt_id between", value1, value2, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prrt_id not between", value1, value2, "prrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdIsNull() {
            addCriterion("prrt_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdIsNotNull() {
            addCriterion("prrt_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdEqualTo(String value) {
            addCriterion("prrt_att_id =", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdNotEqualTo(String value) {
            addCriterion("prrt_att_id <>", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdGreaterThan(String value) {
            addCriterion("prrt_att_id >", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("prrt_att_id >=", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdLessThan(String value) {
            addCriterion("prrt_att_id <", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdLessThanOrEqualTo(String value) {
            addCriterion("prrt_att_id <=", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdLike(String value) {
            addCriterion("prrt_att_id like", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdNotLike(String value) {
            addCriterion("prrt_att_id not like", value, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdIn(List<String> values) {
            addCriterion("prrt_att_id in", values, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdNotIn(List<String> values) {
            addCriterion("prrt_att_id not in", values, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdBetween(String value1, String value2) {
            addCriterion("prrt_att_id between", value1, value2, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtAttIdNotBetween(String value1, String value2) {
            addCriterion("prrt_att_id not between", value1, value2, "prrtAttId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdIsNull() {
            addCriterion("prrt_unique_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdIsNotNull() {
            addCriterion("prrt_unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdEqualTo(String value) {
            addCriterion("prrt_unique_id =", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdNotEqualTo(String value) {
            addCriterion("prrt_unique_id <>", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdGreaterThan(String value) {
            addCriterion("prrt_unique_id >", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("prrt_unique_id >=", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdLessThan(String value) {
            addCriterion("prrt_unique_id <", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("prrt_unique_id <=", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdLike(String value) {
            addCriterion("prrt_unique_id like", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdNotLike(String value) {
            addCriterion("prrt_unique_id not like", value, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdIn(List<String> values) {
            addCriterion("prrt_unique_id in", values, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdNotIn(List<String> values) {
            addCriterion("prrt_unique_id not in", values, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdBetween(String value1, String value2) {
            addCriterion("prrt_unique_id between", value1, value2, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUniqueIdNotBetween(String value1, String value2) {
            addCriterion("prrt_unique_id not between", value1, value2, "prrtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdIsNull() {
            addCriterion("prrt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdIsNotNull() {
            addCriterion("prrt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdEqualTo(String value) {
            addCriterion("prrt_user_id =", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdNotEqualTo(String value) {
            addCriterion("prrt_user_id <>", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdGreaterThan(String value) {
            addCriterion("prrt_user_id >", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("prrt_user_id >=", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdLessThan(String value) {
            addCriterion("prrt_user_id <", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdLessThanOrEqualTo(String value) {
            addCriterion("prrt_user_id <=", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdLike(String value) {
            addCriterion("prrt_user_id like", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdNotLike(String value) {
            addCriterion("prrt_user_id not like", value, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdIn(List<String> values) {
            addCriterion("prrt_user_id in", values, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdNotIn(List<String> values) {
            addCriterion("prrt_user_id not in", values, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdBetween(String value1, String value2) {
            addCriterion("prrt_user_id between", value1, value2, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtUserIdNotBetween(String value1, String value2) {
            addCriterion("prrt_user_id not between", value1, value2, "prrtUserId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdIsNull() {
            addCriterion("prrt_prt_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdIsNotNull() {
            addCriterion("prrt_prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdEqualTo(String value) {
            addCriterion("prrt_prt_id =", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdNotEqualTo(String value) {
            addCriterion("prrt_prt_id <>", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdGreaterThan(String value) {
            addCriterion("prrt_prt_id >", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdGreaterThanOrEqualTo(String value) {
            addCriterion("prrt_prt_id >=", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdLessThan(String value) {
            addCriterion("prrt_prt_id <", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdLessThanOrEqualTo(String value) {
            addCriterion("prrt_prt_id <=", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdLike(String value) {
            addCriterion("prrt_prt_id like", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdNotLike(String value) {
            addCriterion("prrt_prt_id not like", value, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdIn(List<String> values) {
            addCriterion("prrt_prt_id in", values, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdNotIn(List<String> values) {
            addCriterion("prrt_prt_id not in", values, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdBetween(String value1, String value2) {
            addCriterion("prrt_prt_id between", value1, value2, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtPrtIdNotBetween(String value1, String value2) {
            addCriterion("prrt_prt_id not between", value1, value2, "prrtPrtId");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusIsNull() {
            addCriterion("prrt_status is null");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusIsNotNull() {
            addCriterion("prrt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusEqualTo(String value) {
            addCriterion("prrt_status =", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusNotEqualTo(String value) {
            addCriterion("prrt_status <>", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusGreaterThan(String value) {
            addCriterion("prrt_status >", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("prrt_status >=", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusLessThan(String value) {
            addCriterion("prrt_status <", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusLessThanOrEqualTo(String value) {
            addCriterion("prrt_status <=", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusLike(String value) {
            addCriterion("prrt_status like", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusNotLike(String value) {
            addCriterion("prrt_status not like", value, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusIn(List<String> values) {
            addCriterion("prrt_status in", values, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusNotIn(List<String> values) {
            addCriterion("prrt_status not in", values, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusBetween(String value1, String value2) {
            addCriterion("prrt_status between", value1, value2, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtStatusNotBetween(String value1, String value2) {
            addCriterion("prrt_status not between", value1, value2, "prrtStatus");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1IsNull() {
            addCriterion("prrt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1IsNotNull() {
            addCriterion("prrt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1EqualTo(String value) {
            addCriterion("prrt_param1 =", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1NotEqualTo(String value) {
            addCriterion("prrt_param1 <>", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1GreaterThan(String value) {
            addCriterion("prrt_param1 >", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("prrt_param1 >=", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1LessThan(String value) {
            addCriterion("prrt_param1 <", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1LessThanOrEqualTo(String value) {
            addCriterion("prrt_param1 <=", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1Like(String value) {
            addCriterion("prrt_param1 like", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1NotLike(String value) {
            addCriterion("prrt_param1 not like", value, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1In(List<String> values) {
            addCriterion("prrt_param1 in", values, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1NotIn(List<String> values) {
            addCriterion("prrt_param1 not in", values, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1Between(String value1, String value2) {
            addCriterion("prrt_param1 between", value1, value2, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam1NotBetween(String value1, String value2) {
            addCriterion("prrt_param1 not between", value1, value2, "prrtParam1");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2IsNull() {
            addCriterion("prrt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2IsNotNull() {
            addCriterion("prrt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2EqualTo(String value) {
            addCriterion("prrt_param2 =", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2NotEqualTo(String value) {
            addCriterion("prrt_param2 <>", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2GreaterThan(String value) {
            addCriterion("prrt_param2 >", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("prrt_param2 >=", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2LessThan(String value) {
            addCriterion("prrt_param2 <", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2LessThanOrEqualTo(String value) {
            addCriterion("prrt_param2 <=", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2Like(String value) {
            addCriterion("prrt_param2 like", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2NotLike(String value) {
            addCriterion("prrt_param2 not like", value, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2In(List<String> values) {
            addCriterion("prrt_param2 in", values, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2NotIn(List<String> values) {
            addCriterion("prrt_param2 not in", values, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2Between(String value1, String value2) {
            addCriterion("prrt_param2 between", value1, value2, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam2NotBetween(String value1, String value2) {
            addCriterion("prrt_param2 not between", value1, value2, "prrtParam2");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3IsNull() {
            addCriterion("prrt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3IsNotNull() {
            addCriterion("prrt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3EqualTo(String value) {
            addCriterion("prrt_param3 =", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3NotEqualTo(String value) {
            addCriterion("prrt_param3 <>", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3GreaterThan(String value) {
            addCriterion("prrt_param3 >", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("prrt_param3 >=", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3LessThan(String value) {
            addCriterion("prrt_param3 <", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3LessThanOrEqualTo(String value) {
            addCriterion("prrt_param3 <=", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3Like(String value) {
            addCriterion("prrt_param3 like", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3NotLike(String value) {
            addCriterion("prrt_param3 not like", value, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3In(List<String> values) {
            addCriterion("prrt_param3 in", values, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3NotIn(List<String> values) {
            addCriterion("prrt_param3 not in", values, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3Between(String value1, String value2) {
            addCriterion("prrt_param3 between", value1, value2, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam3NotBetween(String value1, String value2) {
            addCriterion("prrt_param3 not between", value1, value2, "prrtParam3");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4IsNull() {
            addCriterion("prrt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4IsNotNull() {
            addCriterion("prrt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4EqualTo(String value) {
            addCriterion("prrt_param4 =", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4NotEqualTo(String value) {
            addCriterion("prrt_param4 <>", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4GreaterThan(String value) {
            addCriterion("prrt_param4 >", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("prrt_param4 >=", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4LessThan(String value) {
            addCriterion("prrt_param4 <", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4LessThanOrEqualTo(String value) {
            addCriterion("prrt_param4 <=", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4Like(String value) {
            addCriterion("prrt_param4 like", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4NotLike(String value) {
            addCriterion("prrt_param4 not like", value, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4In(List<String> values) {
            addCriterion("prrt_param4 in", values, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4NotIn(List<String> values) {
            addCriterion("prrt_param4 not in", values, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4Between(String value1, String value2) {
            addCriterion("prrt_param4 between", value1, value2, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam4NotBetween(String value1, String value2) {
            addCriterion("prrt_param4 not between", value1, value2, "prrtParam4");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5IsNull() {
            addCriterion("prrt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5IsNotNull() {
            addCriterion("prrt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5EqualTo(String value) {
            addCriterion("prrt_param5 =", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5NotEqualTo(String value) {
            addCriterion("prrt_param5 <>", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5GreaterThan(String value) {
            addCriterion("prrt_param5 >", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("prrt_param5 >=", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5LessThan(String value) {
            addCriterion("prrt_param5 <", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5LessThanOrEqualTo(String value) {
            addCriterion("prrt_param5 <=", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5Like(String value) {
            addCriterion("prrt_param5 like", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5NotLike(String value) {
            addCriterion("prrt_param5 not like", value, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5In(List<String> values) {
            addCriterion("prrt_param5 in", values, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5NotIn(List<String> values) {
            addCriterion("prrt_param5 not in", values, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5Between(String value1, String value2) {
            addCriterion("prrt_param5 between", value1, value2, "prrtParam5");
            return (Criteria) this;
        }

        public Criteria andPrrtParam5NotBetween(String value1, String value2) {
            addCriterion("prrt_param5 not between", value1, value2, "prrtParam5");
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