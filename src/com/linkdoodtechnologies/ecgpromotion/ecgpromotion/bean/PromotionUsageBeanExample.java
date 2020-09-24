package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean;

import java.util.ArrayList;
import java.util.List;

public class PromotionUsageBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionUsageBeanExample() {
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

        public Criteria andPutIdIsNull() {
            addCriterion("put_id is null");
            return (Criteria) this;
        }

        public Criteria andPutIdIsNotNull() {
            addCriterion("put_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutIdEqualTo(Integer value) {
            addCriterion("put_id =", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdNotEqualTo(Integer value) {
            addCriterion("put_id <>", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdGreaterThan(Integer value) {
            addCriterion("put_id >", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("put_id >=", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdLessThan(Integer value) {
            addCriterion("put_id <", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdLessThanOrEqualTo(Integer value) {
            addCriterion("put_id <=", value, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdIn(List<Integer> values) {
            addCriterion("put_id in", values, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdNotIn(List<Integer> values) {
            addCriterion("put_id not in", values, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdBetween(Integer value1, Integer value2) {
            addCriterion("put_id between", value1, value2, "putId");
            return (Criteria) this;
        }

        public Criteria andPutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("put_id not between", value1, value2, "putId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdIsNull() {
            addCriterion("put_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPutAttIdIsNotNull() {
            addCriterion("put_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutAttIdEqualTo(String value) {
            addCriterion("put_att_id =", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdNotEqualTo(String value) {
            addCriterion("put_att_id <>", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdGreaterThan(String value) {
            addCriterion("put_att_id >", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("put_att_id >=", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdLessThan(String value) {
            addCriterion("put_att_id <", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdLessThanOrEqualTo(String value) {
            addCriterion("put_att_id <=", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdLike(String value) {
            addCriterion("put_att_id like", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdNotLike(String value) {
            addCriterion("put_att_id not like", value, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdIn(List<String> values) {
            addCriterion("put_att_id in", values, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdNotIn(List<String> values) {
            addCriterion("put_att_id not in", values, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdBetween(String value1, String value2) {
            addCriterion("put_att_id between", value1, value2, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutAttIdNotBetween(String value1, String value2) {
            addCriterion("put_att_id not between", value1, value2, "putAttId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdIsNull() {
            addCriterion("put_unique_id is null");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdIsNotNull() {
            addCriterion("put_unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdEqualTo(String value) {
            addCriterion("put_unique_id =", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdNotEqualTo(String value) {
            addCriterion("put_unique_id <>", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdGreaterThan(String value) {
            addCriterion("put_unique_id >", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("put_unique_id >=", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdLessThan(String value) {
            addCriterion("put_unique_id <", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("put_unique_id <=", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdLike(String value) {
            addCriterion("put_unique_id like", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdNotLike(String value) {
            addCriterion("put_unique_id not like", value, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdIn(List<String> values) {
            addCriterion("put_unique_id in", values, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdNotIn(List<String> values) {
            addCriterion("put_unique_id not in", values, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdBetween(String value1, String value2) {
            addCriterion("put_unique_id between", value1, value2, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutUniqueIdNotBetween(String value1, String value2) {
            addCriterion("put_unique_id not between", value1, value2, "putUniqueId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdIsNull() {
            addCriterion("put_prt_id is null");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdIsNotNull() {
            addCriterion("put_prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdEqualTo(String value) {
            addCriterion("put_prt_id =", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdNotEqualTo(String value) {
            addCriterion("put_prt_id <>", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdGreaterThan(String value) {
            addCriterion("put_prt_id >", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdGreaterThanOrEqualTo(String value) {
            addCriterion("put_prt_id >=", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdLessThan(String value) {
            addCriterion("put_prt_id <", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdLessThanOrEqualTo(String value) {
            addCriterion("put_prt_id <=", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdLike(String value) {
            addCriterion("put_prt_id like", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdNotLike(String value) {
            addCriterion("put_prt_id not like", value, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdIn(List<String> values) {
            addCriterion("put_prt_id in", values, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdNotIn(List<String> values) {
            addCriterion("put_prt_id not in", values, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdBetween(String value1, String value2) {
            addCriterion("put_prt_id between", value1, value2, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutPrtIdNotBetween(String value1, String value2) {
            addCriterion("put_prt_id not between", value1, value2, "putPrtId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdIsNull() {
            addCriterion("put_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdIsNotNull() {
            addCriterion("put_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdEqualTo(String value) {
            addCriterion("put_order_id =", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdNotEqualTo(String value) {
            addCriterion("put_order_id <>", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdGreaterThan(String value) {
            addCriterion("put_order_id >", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("put_order_id >=", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdLessThan(String value) {
            addCriterion("put_order_id <", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdLessThanOrEqualTo(String value) {
            addCriterion("put_order_id <=", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdLike(String value) {
            addCriterion("put_order_id like", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdNotLike(String value) {
            addCriterion("put_order_id not like", value, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdIn(List<String> values) {
            addCriterion("put_order_id in", values, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdNotIn(List<String> values) {
            addCriterion("put_order_id not in", values, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdBetween(String value1, String value2) {
            addCriterion("put_order_id between", value1, value2, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutOrderIdNotBetween(String value1, String value2) {
            addCriterion("put_order_id not between", value1, value2, "putOrderId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdIsNull() {
            addCriterion("put_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPutUserIdIsNotNull() {
            addCriterion("put_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutUserIdEqualTo(String value) {
            addCriterion("put_user_id =", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdNotEqualTo(String value) {
            addCriterion("put_user_id <>", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdGreaterThan(String value) {
            addCriterion("put_user_id >", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("put_user_id >=", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdLessThan(String value) {
            addCriterion("put_user_id <", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdLessThanOrEqualTo(String value) {
            addCriterion("put_user_id <=", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdLike(String value) {
            addCriterion("put_user_id like", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdNotLike(String value) {
            addCriterion("put_user_id not like", value, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdIn(List<String> values) {
            addCriterion("put_user_id in", values, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdNotIn(List<String> values) {
            addCriterion("put_user_id not in", values, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdBetween(String value1, String value2) {
            addCriterion("put_user_id between", value1, value2, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutUserIdNotBetween(String value1, String value2) {
            addCriterion("put_user_id not between", value1, value2, "putUserId");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountIsNull() {
            addCriterion("put_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountIsNotNull() {
            addCriterion("put_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountEqualTo(String value) {
            addCriterion("put_discount_amount =", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountNotEqualTo(String value) {
            addCriterion("put_discount_amount <>", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountGreaterThan(String value) {
            addCriterion("put_discount_amount >", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountGreaterThanOrEqualTo(String value) {
            addCriterion("put_discount_amount >=", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountLessThan(String value) {
            addCriterion("put_discount_amount <", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountLessThanOrEqualTo(String value) {
            addCriterion("put_discount_amount <=", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountLike(String value) {
            addCriterion("put_discount_amount like", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountNotLike(String value) {
            addCriterion("put_discount_amount not like", value, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountIn(List<String> values) {
            addCriterion("put_discount_amount in", values, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountNotIn(List<String> values) {
            addCriterion("put_discount_amount not in", values, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountBetween(String value1, String value2) {
            addCriterion("put_discount_amount between", value1, value2, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutDiscountAmountNotBetween(String value1, String value2) {
            addCriterion("put_discount_amount not between", value1, value2, "putDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPutParam1IsNull() {
            addCriterion("put_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPutParam1IsNotNull() {
            addCriterion("put_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPutParam1EqualTo(String value) {
            addCriterion("put_param1 =", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1NotEqualTo(String value) {
            addCriterion("put_param1 <>", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1GreaterThan(String value) {
            addCriterion("put_param1 >", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1GreaterThanOrEqualTo(String value) {
            addCriterion("put_param1 >=", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1LessThan(String value) {
            addCriterion("put_param1 <", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1LessThanOrEqualTo(String value) {
            addCriterion("put_param1 <=", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1Like(String value) {
            addCriterion("put_param1 like", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1NotLike(String value) {
            addCriterion("put_param1 not like", value, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1In(List<String> values) {
            addCriterion("put_param1 in", values, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1NotIn(List<String> values) {
            addCriterion("put_param1 not in", values, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1Between(String value1, String value2) {
            addCriterion("put_param1 between", value1, value2, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam1NotBetween(String value1, String value2) {
            addCriterion("put_param1 not between", value1, value2, "putParam1");
            return (Criteria) this;
        }

        public Criteria andPutParam2IsNull() {
            addCriterion("put_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPutParam2IsNotNull() {
            addCriterion("put_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPutParam2EqualTo(String value) {
            addCriterion("put_param2 =", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2NotEqualTo(String value) {
            addCriterion("put_param2 <>", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2GreaterThan(String value) {
            addCriterion("put_param2 >", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2GreaterThanOrEqualTo(String value) {
            addCriterion("put_param2 >=", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2LessThan(String value) {
            addCriterion("put_param2 <", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2LessThanOrEqualTo(String value) {
            addCriterion("put_param2 <=", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2Like(String value) {
            addCriterion("put_param2 like", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2NotLike(String value) {
            addCriterion("put_param2 not like", value, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2In(List<String> values) {
            addCriterion("put_param2 in", values, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2NotIn(List<String> values) {
            addCriterion("put_param2 not in", values, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2Between(String value1, String value2) {
            addCriterion("put_param2 between", value1, value2, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam2NotBetween(String value1, String value2) {
            addCriterion("put_param2 not between", value1, value2, "putParam2");
            return (Criteria) this;
        }

        public Criteria andPutParam3IsNull() {
            addCriterion("put_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPutParam3IsNotNull() {
            addCriterion("put_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPutParam3EqualTo(String value) {
            addCriterion("put_param3 =", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3NotEqualTo(String value) {
            addCriterion("put_param3 <>", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3GreaterThan(String value) {
            addCriterion("put_param3 >", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3GreaterThanOrEqualTo(String value) {
            addCriterion("put_param3 >=", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3LessThan(String value) {
            addCriterion("put_param3 <", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3LessThanOrEqualTo(String value) {
            addCriterion("put_param3 <=", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3Like(String value) {
            addCriterion("put_param3 like", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3NotLike(String value) {
            addCriterion("put_param3 not like", value, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3In(List<String> values) {
            addCriterion("put_param3 in", values, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3NotIn(List<String> values) {
            addCriterion("put_param3 not in", values, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3Between(String value1, String value2) {
            addCriterion("put_param3 between", value1, value2, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam3NotBetween(String value1, String value2) {
            addCriterion("put_param3 not between", value1, value2, "putParam3");
            return (Criteria) this;
        }

        public Criteria andPutParam4IsNull() {
            addCriterion("put_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPutParam4IsNotNull() {
            addCriterion("put_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPutParam4EqualTo(String value) {
            addCriterion("put_param4 =", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4NotEqualTo(String value) {
            addCriterion("put_param4 <>", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4GreaterThan(String value) {
            addCriterion("put_param4 >", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4GreaterThanOrEqualTo(String value) {
            addCriterion("put_param4 >=", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4LessThan(String value) {
            addCriterion("put_param4 <", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4LessThanOrEqualTo(String value) {
            addCriterion("put_param4 <=", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4Like(String value) {
            addCriterion("put_param4 like", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4NotLike(String value) {
            addCriterion("put_param4 not like", value, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4In(List<String> values) {
            addCriterion("put_param4 in", values, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4NotIn(List<String> values) {
            addCriterion("put_param4 not in", values, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4Between(String value1, String value2) {
            addCriterion("put_param4 between", value1, value2, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam4NotBetween(String value1, String value2) {
            addCriterion("put_param4 not between", value1, value2, "putParam4");
            return (Criteria) this;
        }

        public Criteria andPutParam5IsNull() {
            addCriterion("put_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPutParam5IsNotNull() {
            addCriterion("put_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPutParam5EqualTo(String value) {
            addCriterion("put_param5 =", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5NotEqualTo(String value) {
            addCriterion("put_param5 <>", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5GreaterThan(String value) {
            addCriterion("put_param5 >", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5GreaterThanOrEqualTo(String value) {
            addCriterion("put_param5 >=", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5LessThan(String value) {
            addCriterion("put_param5 <", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5LessThanOrEqualTo(String value) {
            addCriterion("put_param5 <=", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5Like(String value) {
            addCriterion("put_param5 like", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5NotLike(String value) {
            addCriterion("put_param5 not like", value, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5In(List<String> values) {
            addCriterion("put_param5 in", values, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5NotIn(List<String> values) {
            addCriterion("put_param5 not in", values, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5Between(String value1, String value2) {
            addCriterion("put_param5 between", value1, value2, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutParam5NotBetween(String value1, String value2) {
            addCriterion("put_param5 not between", value1, value2, "putParam5");
            return (Criteria) this;
        }

        public Criteria andPutStatusIsNull() {
            addCriterion("put_status is null");
            return (Criteria) this;
        }

        public Criteria andPutStatusIsNotNull() {
            addCriterion("put_status is not null");
            return (Criteria) this;
        }

        public Criteria andPutStatusEqualTo(String value) {
            addCriterion("put_status =", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusNotEqualTo(String value) {
            addCriterion("put_status <>", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusGreaterThan(String value) {
            addCriterion("put_status >", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("put_status >=", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusLessThan(String value) {
            addCriterion("put_status <", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusLessThanOrEqualTo(String value) {
            addCriterion("put_status <=", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusLike(String value) {
            addCriterion("put_status like", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusNotLike(String value) {
            addCriterion("put_status not like", value, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusIn(List<String> values) {
            addCriterion("put_status in", values, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusNotIn(List<String> values) {
            addCriterion("put_status not in", values, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusBetween(String value1, String value2) {
            addCriterion("put_status between", value1, value2, "putStatus");
            return (Criteria) this;
        }

        public Criteria andPutStatusNotBetween(String value1, String value2) {
            addCriterion("put_status not between", value1, value2, "putStatus");
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