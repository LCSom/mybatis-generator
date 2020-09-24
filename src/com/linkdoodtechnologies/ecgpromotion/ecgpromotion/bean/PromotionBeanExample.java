package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean;

import java.util.ArrayList;
import java.util.List;

public class PromotionBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionBeanExample() {
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

        public Criteria andPrtIdIsNull() {
            addCriterion("prt_id is null");
            return (Criteria) this;
        }

        public Criteria andPrtIdIsNotNull() {
            addCriterion("prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrtIdEqualTo(Integer value) {
            addCriterion("prt_id =", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotEqualTo(Integer value) {
            addCriterion("prt_id <>", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThan(Integer value) {
            addCriterion("prt_id >", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prt_id >=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThan(Integer value) {
            addCriterion("prt_id <", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThanOrEqualTo(Integer value) {
            addCriterion("prt_id <=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdIn(List<Integer> values) {
            addCriterion("prt_id in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotIn(List<Integer> values) {
            addCriterion("prt_id not in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdBetween(Integer value1, Integer value2) {
            addCriterion("prt_id between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prt_id not between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdIsNull() {
            addCriterion("prt_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdIsNotNull() {
            addCriterion("prt_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdEqualTo(String value) {
            addCriterion("prt_att_id =", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdNotEqualTo(String value) {
            addCriterion("prt_att_id <>", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdGreaterThan(String value) {
            addCriterion("prt_att_id >", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("prt_att_id >=", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdLessThan(String value) {
            addCriterion("prt_att_id <", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdLessThanOrEqualTo(String value) {
            addCriterion("prt_att_id <=", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdLike(String value) {
            addCriterion("prt_att_id like", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdNotLike(String value) {
            addCriterion("prt_att_id not like", value, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdIn(List<String> values) {
            addCriterion("prt_att_id in", values, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdNotIn(List<String> values) {
            addCriterion("prt_att_id not in", values, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdBetween(String value1, String value2) {
            addCriterion("prt_att_id between", value1, value2, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtAttIdNotBetween(String value1, String value2) {
            addCriterion("prt_att_id not between", value1, value2, "prtAttId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdIsNull() {
            addCriterion("prt_unique_id is null");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdIsNotNull() {
            addCriterion("prt_unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdEqualTo(String value) {
            addCriterion("prt_unique_id =", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdNotEqualTo(String value) {
            addCriterion("prt_unique_id <>", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdGreaterThan(String value) {
            addCriterion("prt_unique_id >", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("prt_unique_id >=", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdLessThan(String value) {
            addCriterion("prt_unique_id <", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("prt_unique_id <=", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdLike(String value) {
            addCriterion("prt_unique_id like", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdNotLike(String value) {
            addCriterion("prt_unique_id not like", value, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdIn(List<String> values) {
            addCriterion("prt_unique_id in", values, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdNotIn(List<String> values) {
            addCriterion("prt_unique_id not in", values, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdBetween(String value1, String value2) {
            addCriterion("prt_unique_id between", value1, value2, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtUniqueIdNotBetween(String value1, String value2) {
            addCriterion("prt_unique_id not between", value1, value2, "prtUniqueId");
            return (Criteria) this;
        }

        public Criteria andPrtNameIsNull() {
            addCriterion("prt_name is null");
            return (Criteria) this;
        }

        public Criteria andPrtNameIsNotNull() {
            addCriterion("prt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrtNameEqualTo(String value) {
            addCriterion("prt_name =", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotEqualTo(String value) {
            addCriterion("prt_name <>", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThan(String value) {
            addCriterion("prt_name >", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("prt_name >=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThan(String value) {
            addCriterion("prt_name <", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThanOrEqualTo(String value) {
            addCriterion("prt_name <=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLike(String value) {
            addCriterion("prt_name like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotLike(String value) {
            addCriterion("prt_name not like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameIn(List<String> values) {
            addCriterion("prt_name in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotIn(List<String> values) {
            addCriterion("prt_name not in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameBetween(String value1, String value2) {
            addCriterion("prt_name between", value1, value2, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotBetween(String value1, String value2) {
            addCriterion("prt_name not between", value1, value2, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionIsNull() {
            addCriterion("prt_description is null");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionIsNotNull() {
            addCriterion("prt_description is not null");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionEqualTo(String value) {
            addCriterion("prt_description =", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionNotEqualTo(String value) {
            addCriterion("prt_description <>", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionGreaterThan(String value) {
            addCriterion("prt_description >", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("prt_description >=", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionLessThan(String value) {
            addCriterion("prt_description <", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionLessThanOrEqualTo(String value) {
            addCriterion("prt_description <=", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionLike(String value) {
            addCriterion("prt_description like", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionNotLike(String value) {
            addCriterion("prt_description not like", value, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionIn(List<String> values) {
            addCriterion("prt_description in", values, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionNotIn(List<String> values) {
            addCriterion("prt_description not in", values, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionBetween(String value1, String value2) {
            addCriterion("prt_description between", value1, value2, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtDescriptionNotBetween(String value1, String value2) {
            addCriterion("prt_description not between", value1, value2, "prtDescription");
            return (Criteria) this;
        }

        public Criteria andPrtTypeIsNull() {
            addCriterion("prt_type is null");
            return (Criteria) this;
        }

        public Criteria andPrtTypeIsNotNull() {
            addCriterion("prt_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrtTypeEqualTo(String value) {
            addCriterion("prt_type =", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeNotEqualTo(String value) {
            addCriterion("prt_type <>", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeGreaterThan(String value) {
            addCriterion("prt_type >", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prt_type >=", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeLessThan(String value) {
            addCriterion("prt_type <", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeLessThanOrEqualTo(String value) {
            addCriterion("prt_type <=", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeLike(String value) {
            addCriterion("prt_type like", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeNotLike(String value) {
            addCriterion("prt_type not like", value, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeIn(List<String> values) {
            addCriterion("prt_type in", values, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeNotIn(List<String> values) {
            addCriterion("prt_type not in", values, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeBetween(String value1, String value2) {
            addCriterion("prt_type between", value1, value2, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtTypeNotBetween(String value1, String value2) {
            addCriterion("prt_type not between", value1, value2, "prtType");
            return (Criteria) this;
        }

        public Criteria andPrtAmountIsNull() {
            addCriterion("prt_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrtAmountIsNotNull() {
            addCriterion("prt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrtAmountEqualTo(String value) {
            addCriterion("prt_amount =", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountNotEqualTo(String value) {
            addCriterion("prt_amount <>", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountGreaterThan(String value) {
            addCriterion("prt_amount >", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountGreaterThanOrEqualTo(String value) {
            addCriterion("prt_amount >=", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountLessThan(String value) {
            addCriterion("prt_amount <", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountLessThanOrEqualTo(String value) {
            addCriterion("prt_amount <=", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountLike(String value) {
            addCriterion("prt_amount like", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountNotLike(String value) {
            addCriterion("prt_amount not like", value, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountIn(List<String> values) {
            addCriterion("prt_amount in", values, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountNotIn(List<String> values) {
            addCriterion("prt_amount not in", values, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountBetween(String value1, String value2) {
            addCriterion("prt_amount between", value1, value2, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtAmountNotBetween(String value1, String value2) {
            addCriterion("prt_amount not between", value1, value2, "prtAmount");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeIsNull() {
            addCriterion("prt_max_use_time is null");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeIsNotNull() {
            addCriterion("prt_max_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeEqualTo(String value) {
            addCriterion("prt_max_use_time =", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeNotEqualTo(String value) {
            addCriterion("prt_max_use_time <>", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeGreaterThan(String value) {
            addCriterion("prt_max_use_time >", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("prt_max_use_time >=", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeLessThan(String value) {
            addCriterion("prt_max_use_time <", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeLessThanOrEqualTo(String value) {
            addCriterion("prt_max_use_time <=", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeLike(String value) {
            addCriterion("prt_max_use_time like", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeNotLike(String value) {
            addCriterion("prt_max_use_time not like", value, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeIn(List<String> values) {
            addCriterion("prt_max_use_time in", values, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeNotIn(List<String> values) {
            addCriterion("prt_max_use_time not in", values, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeBetween(String value1, String value2) {
            addCriterion("prt_max_use_time between", value1, value2, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtMaxUseTimeNotBetween(String value1, String value2) {
            addCriterion("prt_max_use_time not between", value1, value2, "prtMaxUseTime");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneIsNull() {
            addCriterion("prt_one_account_one is null");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneIsNotNull() {
            addCriterion("prt_one_account_one is not null");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneEqualTo(String value) {
            addCriterion("prt_one_account_one =", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneNotEqualTo(String value) {
            addCriterion("prt_one_account_one <>", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneGreaterThan(String value) {
            addCriterion("prt_one_account_one >", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneGreaterThanOrEqualTo(String value) {
            addCriterion("prt_one_account_one >=", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneLessThan(String value) {
            addCriterion("prt_one_account_one <", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneLessThanOrEqualTo(String value) {
            addCriterion("prt_one_account_one <=", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneLike(String value) {
            addCriterion("prt_one_account_one like", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneNotLike(String value) {
            addCriterion("prt_one_account_one not like", value, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneIn(List<String> values) {
            addCriterion("prt_one_account_one in", values, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneNotIn(List<String> values) {
            addCriterion("prt_one_account_one not in", values, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneBetween(String value1, String value2) {
            addCriterion("prt_one_account_one between", value1, value2, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtOneAccountOneNotBetween(String value1, String value2) {
            addCriterion("prt_one_account_one not between", value1, value2, "prtOneAccountOne");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseIsNull() {
            addCriterion("prt_min_purchase is null");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseIsNotNull() {
            addCriterion("prt_min_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseEqualTo(String value) {
            addCriterion("prt_min_purchase =", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseNotEqualTo(String value) {
            addCriterion("prt_min_purchase <>", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseGreaterThan(String value) {
            addCriterion("prt_min_purchase >", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("prt_min_purchase >=", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseLessThan(String value) {
            addCriterion("prt_min_purchase <", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseLessThanOrEqualTo(String value) {
            addCriterion("prt_min_purchase <=", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseLike(String value) {
            addCriterion("prt_min_purchase like", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseNotLike(String value) {
            addCriterion("prt_min_purchase not like", value, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseIn(List<String> values) {
            addCriterion("prt_min_purchase in", values, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseNotIn(List<String> values) {
            addCriterion("prt_min_purchase not in", values, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseBetween(String value1, String value2) {
            addCriterion("prt_min_purchase between", value1, value2, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMinPurchaseNotBetween(String value1, String value2) {
            addCriterion("prt_min_purchase not between", value1, value2, "prtMinPurchase");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackIsNull() {
            addCriterion("prt_max_cashback is null");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackIsNotNull() {
            addCriterion("prt_max_cashback is not null");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackEqualTo(String value) {
            addCriterion("prt_max_cashback =", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackNotEqualTo(String value) {
            addCriterion("prt_max_cashback <>", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackGreaterThan(String value) {
            addCriterion("prt_max_cashback >", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackGreaterThanOrEqualTo(String value) {
            addCriterion("prt_max_cashback >=", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackLessThan(String value) {
            addCriterion("prt_max_cashback <", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackLessThanOrEqualTo(String value) {
            addCriterion("prt_max_cashback <=", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackLike(String value) {
            addCriterion("prt_max_cashback like", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackNotLike(String value) {
            addCriterion("prt_max_cashback not like", value, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackIn(List<String> values) {
            addCriterion("prt_max_cashback in", values, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackNotIn(List<String> values) {
            addCriterion("prt_max_cashback not in", values, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackBetween(String value1, String value2) {
            addCriterion("prt_max_cashback between", value1, value2, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtMaxCashbackNotBetween(String value1, String value2) {
            addCriterion("prt_max_cashback not between", value1, value2, "prtMaxCashback");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramIsNull() {
            addCriterion("prt_affiliate_program is null");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramIsNotNull() {
            addCriterion("prt_affiliate_program is not null");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramEqualTo(String value) {
            addCriterion("prt_affiliate_program =", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramNotEqualTo(String value) {
            addCriterion("prt_affiliate_program <>", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramGreaterThan(String value) {
            addCriterion("prt_affiliate_program >", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramGreaterThanOrEqualTo(String value) {
            addCriterion("prt_affiliate_program >=", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramLessThan(String value) {
            addCriterion("prt_affiliate_program <", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramLessThanOrEqualTo(String value) {
            addCriterion("prt_affiliate_program <=", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramLike(String value) {
            addCriterion("prt_affiliate_program like", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramNotLike(String value) {
            addCriterion("prt_affiliate_program not like", value, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramIn(List<String> values) {
            addCriterion("prt_affiliate_program in", values, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramNotIn(List<String> values) {
            addCriterion("prt_affiliate_program not in", values, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramBetween(String value1, String value2) {
            addCriterion("prt_affiliate_program between", value1, value2, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtAffiliateProgramNotBetween(String value1, String value2) {
            addCriterion("prt_affiliate_program not between", value1, value2, "prtAffiliateProgram");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeIsNull() {
            addCriterion("prt_expired_datetime is null");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeIsNotNull() {
            addCriterion("prt_expired_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeEqualTo(String value) {
            addCriterion("prt_expired_datetime =", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeNotEqualTo(String value) {
            addCriterion("prt_expired_datetime <>", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeGreaterThan(String value) {
            addCriterion("prt_expired_datetime >", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("prt_expired_datetime >=", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeLessThan(String value) {
            addCriterion("prt_expired_datetime <", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeLessThanOrEqualTo(String value) {
            addCriterion("prt_expired_datetime <=", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeLike(String value) {
            addCriterion("prt_expired_datetime like", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeNotLike(String value) {
            addCriterion("prt_expired_datetime not like", value, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeIn(List<String> values) {
            addCriterion("prt_expired_datetime in", values, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeNotIn(List<String> values) {
            addCriterion("prt_expired_datetime not in", values, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeBetween(String value1, String value2) {
            addCriterion("prt_expired_datetime between", value1, value2, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtExpiredDatetimeNotBetween(String value1, String value2) {
            addCriterion("prt_expired_datetime not between", value1, value2, "prtExpiredDatetime");
            return (Criteria) this;
        }

        public Criteria andPrtParam1IsNull() {
            addCriterion("prt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPrtParam1IsNotNull() {
            addCriterion("prt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtParam1EqualTo(String value) {
            addCriterion("prt_param1 =", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1NotEqualTo(String value) {
            addCriterion("prt_param1 <>", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1GreaterThan(String value) {
            addCriterion("prt_param1 >", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("prt_param1 >=", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1LessThan(String value) {
            addCriterion("prt_param1 <", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1LessThanOrEqualTo(String value) {
            addCriterion("prt_param1 <=", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1Like(String value) {
            addCriterion("prt_param1 like", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1NotLike(String value) {
            addCriterion("prt_param1 not like", value, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1In(List<String> values) {
            addCriterion("prt_param1 in", values, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1NotIn(List<String> values) {
            addCriterion("prt_param1 not in", values, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1Between(String value1, String value2) {
            addCriterion("prt_param1 between", value1, value2, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam1NotBetween(String value1, String value2) {
            addCriterion("prt_param1 not between", value1, value2, "prtParam1");
            return (Criteria) this;
        }

        public Criteria andPrtParam2IsNull() {
            addCriterion("prt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPrtParam2IsNotNull() {
            addCriterion("prt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtParam2EqualTo(String value) {
            addCriterion("prt_param2 =", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2NotEqualTo(String value) {
            addCriterion("prt_param2 <>", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2GreaterThan(String value) {
            addCriterion("prt_param2 >", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("prt_param2 >=", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2LessThan(String value) {
            addCriterion("prt_param2 <", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2LessThanOrEqualTo(String value) {
            addCriterion("prt_param2 <=", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2Like(String value) {
            addCriterion("prt_param2 like", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2NotLike(String value) {
            addCriterion("prt_param2 not like", value, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2In(List<String> values) {
            addCriterion("prt_param2 in", values, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2NotIn(List<String> values) {
            addCriterion("prt_param2 not in", values, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2Between(String value1, String value2) {
            addCriterion("prt_param2 between", value1, value2, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam2NotBetween(String value1, String value2) {
            addCriterion("prt_param2 not between", value1, value2, "prtParam2");
            return (Criteria) this;
        }

        public Criteria andPrtParam3IsNull() {
            addCriterion("prt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPrtParam3IsNotNull() {
            addCriterion("prt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtParam3EqualTo(String value) {
            addCriterion("prt_param3 =", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3NotEqualTo(String value) {
            addCriterion("prt_param3 <>", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3GreaterThan(String value) {
            addCriterion("prt_param3 >", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("prt_param3 >=", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3LessThan(String value) {
            addCriterion("prt_param3 <", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3LessThanOrEqualTo(String value) {
            addCriterion("prt_param3 <=", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3Like(String value) {
            addCriterion("prt_param3 like", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3NotLike(String value) {
            addCriterion("prt_param3 not like", value, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3In(List<String> values) {
            addCriterion("prt_param3 in", values, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3NotIn(List<String> values) {
            addCriterion("prt_param3 not in", values, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3Between(String value1, String value2) {
            addCriterion("prt_param3 between", value1, value2, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam3NotBetween(String value1, String value2) {
            addCriterion("prt_param3 not between", value1, value2, "prtParam3");
            return (Criteria) this;
        }

        public Criteria andPrtParam4IsNull() {
            addCriterion("prt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPrtParam4IsNotNull() {
            addCriterion("prt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtParam4EqualTo(String value) {
            addCriterion("prt_param4 =", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4NotEqualTo(String value) {
            addCriterion("prt_param4 <>", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4GreaterThan(String value) {
            addCriterion("prt_param4 >", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("prt_param4 >=", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4LessThan(String value) {
            addCriterion("prt_param4 <", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4LessThanOrEqualTo(String value) {
            addCriterion("prt_param4 <=", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4Like(String value) {
            addCriterion("prt_param4 like", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4NotLike(String value) {
            addCriterion("prt_param4 not like", value, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4In(List<String> values) {
            addCriterion("prt_param4 in", values, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4NotIn(List<String> values) {
            addCriterion("prt_param4 not in", values, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4Between(String value1, String value2) {
            addCriterion("prt_param4 between", value1, value2, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam4NotBetween(String value1, String value2) {
            addCriterion("prt_param4 not between", value1, value2, "prtParam4");
            return (Criteria) this;
        }

        public Criteria andPrtParam5IsNull() {
            addCriterion("prt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPrtParam5IsNotNull() {
            addCriterion("prt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtParam5EqualTo(String value) {
            addCriterion("prt_param5 =", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5NotEqualTo(String value) {
            addCriterion("prt_param5 <>", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5GreaterThan(String value) {
            addCriterion("prt_param5 >", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("prt_param5 >=", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5LessThan(String value) {
            addCriterion("prt_param5 <", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5LessThanOrEqualTo(String value) {
            addCriterion("prt_param5 <=", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5Like(String value) {
            addCriterion("prt_param5 like", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5NotLike(String value) {
            addCriterion("prt_param5 not like", value, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5In(List<String> values) {
            addCriterion("prt_param5 in", values, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5NotIn(List<String> values) {
            addCriterion("prt_param5 not in", values, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5Between(String value1, String value2) {
            addCriterion("prt_param5 between", value1, value2, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtParam5NotBetween(String value1, String value2) {
            addCriterion("prt_param5 not between", value1, value2, "prtParam5");
            return (Criteria) this;
        }

        public Criteria andPrtStatusIsNull() {
            addCriterion("prt_status is null");
            return (Criteria) this;
        }

        public Criteria andPrtStatusIsNotNull() {
            addCriterion("prt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrtStatusEqualTo(String value) {
            addCriterion("prt_status =", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusNotEqualTo(String value) {
            addCriterion("prt_status <>", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusGreaterThan(String value) {
            addCriterion("prt_status >", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("prt_status >=", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusLessThan(String value) {
            addCriterion("prt_status <", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusLessThanOrEqualTo(String value) {
            addCriterion("prt_status <=", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusLike(String value) {
            addCriterion("prt_status like", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusNotLike(String value) {
            addCriterion("prt_status not like", value, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusIn(List<String> values) {
            addCriterion("prt_status in", values, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusNotIn(List<String> values) {
            addCriterion("prt_status not in", values, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusBetween(String value1, String value2) {
            addCriterion("prt_status between", value1, value2, "prtStatus");
            return (Criteria) this;
        }

        public Criteria andPrtStatusNotBetween(String value1, String value2) {
            addCriterion("prt_status not between", value1, value2, "prtStatus");
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