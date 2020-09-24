package com.linkdoodtechnologies.ecgpromotion.ecgpromotion.bean;

import java.util.ArrayList;
import java.util.List;

public class AffiliateBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AffiliateBeanExample() {
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

        public Criteria andAftIdIsNull() {
            addCriterion("aft_id is null");
            return (Criteria) this;
        }

        public Criteria andAftIdIsNotNull() {
            addCriterion("aft_id is not null");
            return (Criteria) this;
        }

        public Criteria andAftIdEqualTo(Integer value) {
            addCriterion("aft_id =", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdNotEqualTo(Integer value) {
            addCriterion("aft_id <>", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdGreaterThan(Integer value) {
            addCriterion("aft_id >", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aft_id >=", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdLessThan(Integer value) {
            addCriterion("aft_id <", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdLessThanOrEqualTo(Integer value) {
            addCriterion("aft_id <=", value, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdIn(List<Integer> values) {
            addCriterion("aft_id in", values, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdNotIn(List<Integer> values) {
            addCriterion("aft_id not in", values, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdBetween(Integer value1, Integer value2) {
            addCriterion("aft_id between", value1, value2, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aft_id not between", value1, value2, "aftId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdIsNull() {
            addCriterion("aft_att_id is null");
            return (Criteria) this;
        }

        public Criteria andAftAttIdIsNotNull() {
            addCriterion("aft_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andAftAttIdEqualTo(String value) {
            addCriterion("aft_att_id =", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdNotEqualTo(String value) {
            addCriterion("aft_att_id <>", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdGreaterThan(String value) {
            addCriterion("aft_att_id >", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("aft_att_id >=", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdLessThan(String value) {
            addCriterion("aft_att_id <", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdLessThanOrEqualTo(String value) {
            addCriterion("aft_att_id <=", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdLike(String value) {
            addCriterion("aft_att_id like", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdNotLike(String value) {
            addCriterion("aft_att_id not like", value, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdIn(List<String> values) {
            addCriterion("aft_att_id in", values, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdNotIn(List<String> values) {
            addCriterion("aft_att_id not in", values, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdBetween(String value1, String value2) {
            addCriterion("aft_att_id between", value1, value2, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftAttIdNotBetween(String value1, String value2) {
            addCriterion("aft_att_id not between", value1, value2, "aftAttId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdIsNull() {
            addCriterion("aft_unique_id is null");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdIsNotNull() {
            addCriterion("aft_unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdEqualTo(String value) {
            addCriterion("aft_unique_id =", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdNotEqualTo(String value) {
            addCriterion("aft_unique_id <>", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdGreaterThan(String value) {
            addCriterion("aft_unique_id >", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("aft_unique_id >=", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdLessThan(String value) {
            addCriterion("aft_unique_id <", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("aft_unique_id <=", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdLike(String value) {
            addCriterion("aft_unique_id like", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdNotLike(String value) {
            addCriterion("aft_unique_id not like", value, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdIn(List<String> values) {
            addCriterion("aft_unique_id in", values, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdNotIn(List<String> values) {
            addCriterion("aft_unique_id not in", values, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdBetween(String value1, String value2) {
            addCriterion("aft_unique_id between", value1, value2, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftUniqueIdNotBetween(String value1, String value2) {
            addCriterion("aft_unique_id not between", value1, value2, "aftUniqueId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdIsNull() {
            addCriterion("aft_prt_id is null");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdIsNotNull() {
            addCriterion("aft_prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdEqualTo(String value) {
            addCriterion("aft_prt_id =", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdNotEqualTo(String value) {
            addCriterion("aft_prt_id <>", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdGreaterThan(String value) {
            addCriterion("aft_prt_id >", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdGreaterThanOrEqualTo(String value) {
            addCriterion("aft_prt_id >=", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdLessThan(String value) {
            addCriterion("aft_prt_id <", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdLessThanOrEqualTo(String value) {
            addCriterion("aft_prt_id <=", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdLike(String value) {
            addCriterion("aft_prt_id like", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdNotLike(String value) {
            addCriterion("aft_prt_id not like", value, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdIn(List<String> values) {
            addCriterion("aft_prt_id in", values, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdNotIn(List<String> values) {
            addCriterion("aft_prt_id not in", values, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdBetween(String value1, String value2) {
            addCriterion("aft_prt_id between", value1, value2, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPrtIdNotBetween(String value1, String value2) {
            addCriterion("aft_prt_id not between", value1, value2, "aftPrtId");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameIsNull() {
            addCriterion("aft_partner_name is null");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameIsNotNull() {
            addCriterion("aft_partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameEqualTo(String value) {
            addCriterion("aft_partner_name =", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameNotEqualTo(String value) {
            addCriterion("aft_partner_name <>", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameGreaterThan(String value) {
            addCriterion("aft_partner_name >", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("aft_partner_name >=", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameLessThan(String value) {
            addCriterion("aft_partner_name <", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("aft_partner_name <=", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameLike(String value) {
            addCriterion("aft_partner_name like", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameNotLike(String value) {
            addCriterion("aft_partner_name not like", value, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameIn(List<String> values) {
            addCriterion("aft_partner_name in", values, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameNotIn(List<String> values) {
            addCriterion("aft_partner_name not in", values, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameBetween(String value1, String value2) {
            addCriterion("aft_partner_name between", value1, value2, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerNameNotBetween(String value1, String value2) {
            addCriterion("aft_partner_name not between", value1, value2, "aftPartnerName");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlIsNull() {
            addCriterion("aft_partner_website_url is null");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlIsNotNull() {
            addCriterion("aft_partner_website_url is not null");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlEqualTo(String value) {
            addCriterion("aft_partner_website_url =", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlNotEqualTo(String value) {
            addCriterion("aft_partner_website_url <>", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlGreaterThan(String value) {
            addCriterion("aft_partner_website_url >", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("aft_partner_website_url >=", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlLessThan(String value) {
            addCriterion("aft_partner_website_url <", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlLessThanOrEqualTo(String value) {
            addCriterion("aft_partner_website_url <=", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlLike(String value) {
            addCriterion("aft_partner_website_url like", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlNotLike(String value) {
            addCriterion("aft_partner_website_url not like", value, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlIn(List<String> values) {
            addCriterion("aft_partner_website_url in", values, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlNotIn(List<String> values) {
            addCriterion("aft_partner_website_url not in", values, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlBetween(String value1, String value2) {
            addCriterion("aft_partner_website_url between", value1, value2, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftPartnerWebsiteUrlNotBetween(String value1, String value2) {
            addCriterion("aft_partner_website_url not between", value1, value2, "aftPartnerWebsiteUrl");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionIsNull() {
            addCriterion("aft_description is null");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionIsNotNull() {
            addCriterion("aft_description is not null");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionEqualTo(String value) {
            addCriterion("aft_description =", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionNotEqualTo(String value) {
            addCriterion("aft_description <>", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionGreaterThan(String value) {
            addCriterion("aft_description >", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("aft_description >=", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionLessThan(String value) {
            addCriterion("aft_description <", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionLessThanOrEqualTo(String value) {
            addCriterion("aft_description <=", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionLike(String value) {
            addCriterion("aft_description like", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionNotLike(String value) {
            addCriterion("aft_description not like", value, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionIn(List<String> values) {
            addCriterion("aft_description in", values, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionNotIn(List<String> values) {
            addCriterion("aft_description not in", values, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionBetween(String value1, String value2) {
            addCriterion("aft_description between", value1, value2, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftDescriptionNotBetween(String value1, String value2) {
            addCriterion("aft_description not between", value1, value2, "aftDescription");
            return (Criteria) this;
        }

        public Criteria andAftParam1IsNull() {
            addCriterion("aft_param1 is null");
            return (Criteria) this;
        }

        public Criteria andAftParam1IsNotNull() {
            addCriterion("aft_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andAftParam1EqualTo(String value) {
            addCriterion("aft_param1 =", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1NotEqualTo(String value) {
            addCriterion("aft_param1 <>", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1GreaterThan(String value) {
            addCriterion("aft_param1 >", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1GreaterThanOrEqualTo(String value) {
            addCriterion("aft_param1 >=", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1LessThan(String value) {
            addCriterion("aft_param1 <", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1LessThanOrEqualTo(String value) {
            addCriterion("aft_param1 <=", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1Like(String value) {
            addCriterion("aft_param1 like", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1NotLike(String value) {
            addCriterion("aft_param1 not like", value, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1In(List<String> values) {
            addCriterion("aft_param1 in", values, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1NotIn(List<String> values) {
            addCriterion("aft_param1 not in", values, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1Between(String value1, String value2) {
            addCriterion("aft_param1 between", value1, value2, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam1NotBetween(String value1, String value2) {
            addCriterion("aft_param1 not between", value1, value2, "aftParam1");
            return (Criteria) this;
        }

        public Criteria andAftParam2IsNull() {
            addCriterion("aft_param2 is null");
            return (Criteria) this;
        }

        public Criteria andAftParam2IsNotNull() {
            addCriterion("aft_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andAftParam2EqualTo(String value) {
            addCriterion("aft_param2 =", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2NotEqualTo(String value) {
            addCriterion("aft_param2 <>", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2GreaterThan(String value) {
            addCriterion("aft_param2 >", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2GreaterThanOrEqualTo(String value) {
            addCriterion("aft_param2 >=", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2LessThan(String value) {
            addCriterion("aft_param2 <", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2LessThanOrEqualTo(String value) {
            addCriterion("aft_param2 <=", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2Like(String value) {
            addCriterion("aft_param2 like", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2NotLike(String value) {
            addCriterion("aft_param2 not like", value, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2In(List<String> values) {
            addCriterion("aft_param2 in", values, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2NotIn(List<String> values) {
            addCriterion("aft_param2 not in", values, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2Between(String value1, String value2) {
            addCriterion("aft_param2 between", value1, value2, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam2NotBetween(String value1, String value2) {
            addCriterion("aft_param2 not between", value1, value2, "aftParam2");
            return (Criteria) this;
        }

        public Criteria andAftParam3IsNull() {
            addCriterion("aft_param3 is null");
            return (Criteria) this;
        }

        public Criteria andAftParam3IsNotNull() {
            addCriterion("aft_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andAftParam3EqualTo(String value) {
            addCriterion("aft_param3 =", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3NotEqualTo(String value) {
            addCriterion("aft_param3 <>", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3GreaterThan(String value) {
            addCriterion("aft_param3 >", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3GreaterThanOrEqualTo(String value) {
            addCriterion("aft_param3 >=", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3LessThan(String value) {
            addCriterion("aft_param3 <", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3LessThanOrEqualTo(String value) {
            addCriterion("aft_param3 <=", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3Like(String value) {
            addCriterion("aft_param3 like", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3NotLike(String value) {
            addCriterion("aft_param3 not like", value, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3In(List<String> values) {
            addCriterion("aft_param3 in", values, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3NotIn(List<String> values) {
            addCriterion("aft_param3 not in", values, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3Between(String value1, String value2) {
            addCriterion("aft_param3 between", value1, value2, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam3NotBetween(String value1, String value2) {
            addCriterion("aft_param3 not between", value1, value2, "aftParam3");
            return (Criteria) this;
        }

        public Criteria andAftParam4IsNull() {
            addCriterion("aft_param4 is null");
            return (Criteria) this;
        }

        public Criteria andAftParam4IsNotNull() {
            addCriterion("aft_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andAftParam4EqualTo(String value) {
            addCriterion("aft_param4 =", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4NotEqualTo(String value) {
            addCriterion("aft_param4 <>", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4GreaterThan(String value) {
            addCriterion("aft_param4 >", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4GreaterThanOrEqualTo(String value) {
            addCriterion("aft_param4 >=", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4LessThan(String value) {
            addCriterion("aft_param4 <", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4LessThanOrEqualTo(String value) {
            addCriterion("aft_param4 <=", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4Like(String value) {
            addCriterion("aft_param4 like", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4NotLike(String value) {
            addCriterion("aft_param4 not like", value, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4In(List<String> values) {
            addCriterion("aft_param4 in", values, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4NotIn(List<String> values) {
            addCriterion("aft_param4 not in", values, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4Between(String value1, String value2) {
            addCriterion("aft_param4 between", value1, value2, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam4NotBetween(String value1, String value2) {
            addCriterion("aft_param4 not between", value1, value2, "aftParam4");
            return (Criteria) this;
        }

        public Criteria andAftParam5IsNull() {
            addCriterion("aft_param5 is null");
            return (Criteria) this;
        }

        public Criteria andAftParam5IsNotNull() {
            addCriterion("aft_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andAftParam5EqualTo(String value) {
            addCriterion("aft_param5 =", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5NotEqualTo(String value) {
            addCriterion("aft_param5 <>", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5GreaterThan(String value) {
            addCriterion("aft_param5 >", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5GreaterThanOrEqualTo(String value) {
            addCriterion("aft_param5 >=", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5LessThan(String value) {
            addCriterion("aft_param5 <", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5LessThanOrEqualTo(String value) {
            addCriterion("aft_param5 <=", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5Like(String value) {
            addCriterion("aft_param5 like", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5NotLike(String value) {
            addCriterion("aft_param5 not like", value, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5In(List<String> values) {
            addCriterion("aft_param5 in", values, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5NotIn(List<String> values) {
            addCriterion("aft_param5 not in", values, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5Between(String value1, String value2) {
            addCriterion("aft_param5 between", value1, value2, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftParam5NotBetween(String value1, String value2) {
            addCriterion("aft_param5 not between", value1, value2, "aftParam5");
            return (Criteria) this;
        }

        public Criteria andAftStatusIsNull() {
            addCriterion("aft_status is null");
            return (Criteria) this;
        }

        public Criteria andAftStatusIsNotNull() {
            addCriterion("aft_status is not null");
            return (Criteria) this;
        }

        public Criteria andAftStatusEqualTo(String value) {
            addCriterion("aft_status =", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusNotEqualTo(String value) {
            addCriterion("aft_status <>", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusGreaterThan(String value) {
            addCriterion("aft_status >", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusGreaterThanOrEqualTo(String value) {
            addCriterion("aft_status >=", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusLessThan(String value) {
            addCriterion("aft_status <", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusLessThanOrEqualTo(String value) {
            addCriterion("aft_status <=", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusLike(String value) {
            addCriterion("aft_status like", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusNotLike(String value) {
            addCriterion("aft_status not like", value, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusIn(List<String> values) {
            addCriterion("aft_status in", values, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusNotIn(List<String> values) {
            addCriterion("aft_status not in", values, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusBetween(String value1, String value2) {
            addCriterion("aft_status between", value1, value2, "aftStatus");
            return (Criteria) this;
        }

        public Criteria andAftStatusNotBetween(String value1, String value2) {
            addCriterion("aft_status not between", value1, value2, "aftStatus");
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