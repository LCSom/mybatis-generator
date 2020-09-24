package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgBeanExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipCode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipCode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipCode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipCode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipCode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipCode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipCode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipCode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipCode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipCode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipCode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipCode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipCode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNull() {
            addCriterion("orgLevel is null");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNotNull() {
            addCriterion("orgLevel is not null");
            return (Criteria) this;
        }

        public Criteria andOrglevelEqualTo(String value) {
            addCriterion("orgLevel =", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotEqualTo(String value) {
            addCriterion("orgLevel <>", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThan(String value) {
            addCriterion("orgLevel >", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThanOrEqualTo(String value) {
            addCriterion("orgLevel >=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThan(String value) {
            addCriterion("orgLevel <", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThanOrEqualTo(String value) {
            addCriterion("orgLevel <=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLike(String value) {
            addCriterion("orgLevel like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotLike(String value) {
            addCriterion("orgLevel not like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelIn(List<String> values) {
            addCriterion("orgLevel in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotIn(List<String> values) {
            addCriterion("orgLevel not in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelBetween(String value1, String value2) {
            addCriterion("orgLevel between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotBetween(String value1, String value2) {
            addCriterion("orgLevel not between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andTierIsNull() {
            addCriterion("tier is null");
            return (Criteria) this;
        }

        public Criteria andTierIsNotNull() {
            addCriterion("tier is not null");
            return (Criteria) this;
        }

        public Criteria andTierEqualTo(Integer value) {
            addCriterion("tier =", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotEqualTo(Integer value) {
            addCriterion("tier <>", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierGreaterThan(Integer value) {
            addCriterion("tier >", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierGreaterThanOrEqualTo(Integer value) {
            addCriterion("tier >=", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierLessThan(Integer value) {
            addCriterion("tier <", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierLessThanOrEqualTo(Integer value) {
            addCriterion("tier <=", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierIn(List<Integer> values) {
            addCriterion("tier in", values, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotIn(List<Integer> values) {
            addCriterion("tier not in", values, "tier");
            return (Criteria) this;
        }

        public Criteria andTierBetween(Integer value1, Integer value2) {
            addCriterion("tier between", value1, value2, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotBetween(Integer value1, Integer value2) {
            addCriterion("tier not between", value1, value2, "tier");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCodeuiIsNull() {
            addCriterion("codeUI is null");
            return (Criteria) this;
        }

        public Criteria andCodeuiIsNotNull() {
            addCriterion("codeUI is not null");
            return (Criteria) this;
        }

        public Criteria andCodeuiEqualTo(String value) {
            addCriterion("codeUI =", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiNotEqualTo(String value) {
            addCriterion("codeUI <>", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiGreaterThan(String value) {
            addCriterion("codeUI >", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiGreaterThanOrEqualTo(String value) {
            addCriterion("codeUI >=", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiLessThan(String value) {
            addCriterion("codeUI <", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiLessThanOrEqualTo(String value) {
            addCriterion("codeUI <=", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiLike(String value) {
            addCriterion("codeUI like", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiNotLike(String value) {
            addCriterion("codeUI not like", value, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiIn(List<String> values) {
            addCriterion("codeUI in", values, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiNotIn(List<String> values) {
            addCriterion("codeUI not in", values, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiBetween(String value1, String value2) {
            addCriterion("codeUI between", value1, value2, "codeui");
            return (Criteria) this;
        }

        public Criteria andCodeuiNotBetween(String value1, String value2) {
            addCriterion("codeUI not between", value1, value2, "codeui");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("creatorId =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("creatorId <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("creatorId >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("creatorId >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("creatorId <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("creatorId <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("creatorId like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("creatorId not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("creatorId in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("creatorId not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("creatorId between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("creatorId not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateridIsNull() {
            addCriterion("updaterId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateridIsNotNull() {
            addCriterion("updaterId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateridEqualTo(String value) {
            addCriterion("updaterId =", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridNotEqualTo(String value) {
            addCriterion("updaterId <>", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridGreaterThan(String value) {
            addCriterion("updaterId >", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridGreaterThanOrEqualTo(String value) {
            addCriterion("updaterId >=", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridLessThan(String value) {
            addCriterion("updaterId <", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridLessThanOrEqualTo(String value) {
            addCriterion("updaterId <=", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridLike(String value) {
            addCriterion("updaterId like", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridNotLike(String value) {
            addCriterion("updaterId not like", value, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridIn(List<String> values) {
            addCriterion("updaterId in", values, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridNotIn(List<String> values) {
            addCriterion("updaterId not in", values, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridBetween(String value1, String value2) {
            addCriterion("updaterId between", value1, value2, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdateridNotBetween(String value1, String value2) {
            addCriterion("updaterId not between", value1, value2, "updaterid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorIsNull() {
            addCriterion("defaultAuthor is null");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorIsNotNull() {
            addCriterion("defaultAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorEqualTo(String value) {
            addCriterion("defaultAuthor =", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorNotEqualTo(String value) {
            addCriterion("defaultAuthor <>", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorGreaterThan(String value) {
            addCriterion("defaultAuthor >", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorGreaterThanOrEqualTo(String value) {
            addCriterion("defaultAuthor >=", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorLessThan(String value) {
            addCriterion("defaultAuthor <", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorLessThanOrEqualTo(String value) {
            addCriterion("defaultAuthor <=", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorLike(String value) {
            addCriterion("defaultAuthor like", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorNotLike(String value) {
            addCriterion("defaultAuthor not like", value, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorIn(List<String> values) {
            addCriterion("defaultAuthor in", values, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorNotIn(List<String> values) {
            addCriterion("defaultAuthor not in", values, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorBetween(String value1, String value2) {
            addCriterion("defaultAuthor between", value1, value2, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andDefaultauthorNotBetween(String value1, String value2) {
            addCriterion("defaultAuthor not between", value1, value2, "defaultauthor");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneIsNull() {
            addCriterion("maintainerPhone is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneIsNotNull() {
            addCriterion("maintainerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneEqualTo(String value) {
            addCriterion("maintainerPhone =", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneNotEqualTo(String value) {
            addCriterion("maintainerPhone <>", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneGreaterThan(String value) {
            addCriterion("maintainerPhone >", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("maintainerPhone >=", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneLessThan(String value) {
            addCriterion("maintainerPhone <", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneLessThanOrEqualTo(String value) {
            addCriterion("maintainerPhone <=", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneLike(String value) {
            addCriterion("maintainerPhone like", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneNotLike(String value) {
            addCriterion("maintainerPhone not like", value, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneIn(List<String> values) {
            addCriterion("maintainerPhone in", values, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneNotIn(List<String> values) {
            addCriterion("maintainerPhone not in", values, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneBetween(String value1, String value2) {
            addCriterion("maintainerPhone between", value1, value2, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainerphoneNotBetween(String value1, String value2) {
            addCriterion("maintainerPhone not between", value1, value2, "maintainerphone");
            return (Criteria) this;
        }

        public Criteria andMaintainertelIsNull() {
            addCriterion("maintainerTel is null");
            return (Criteria) this;
        }

        public Criteria andMaintainertelIsNotNull() {
            addCriterion("maintainerTel is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainertelEqualTo(String value) {
            addCriterion("maintainerTel =", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelNotEqualTo(String value) {
            addCriterion("maintainerTel <>", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelGreaterThan(String value) {
            addCriterion("maintainerTel >", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelGreaterThanOrEqualTo(String value) {
            addCriterion("maintainerTel >=", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelLessThan(String value) {
            addCriterion("maintainerTel <", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelLessThanOrEqualTo(String value) {
            addCriterion("maintainerTel <=", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelLike(String value) {
            addCriterion("maintainerTel like", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelNotLike(String value) {
            addCriterion("maintainerTel not like", value, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelIn(List<String> values) {
            addCriterion("maintainerTel in", values, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelNotIn(List<String> values) {
            addCriterion("maintainerTel not in", values, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelBetween(String value1, String value2) {
            addCriterion("maintainerTel between", value1, value2, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintainertelNotBetween(String value1, String value2) {
            addCriterion("maintainerTel not between", value1, value2, "maintainertel");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailIsNull() {
            addCriterion("maintainerEmail is null");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailIsNotNull() {
            addCriterion("maintainerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailEqualTo(String value) {
            addCriterion("maintainerEmail =", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailNotEqualTo(String value) {
            addCriterion("maintainerEmail <>", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailGreaterThan(String value) {
            addCriterion("maintainerEmail >", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailGreaterThanOrEqualTo(String value) {
            addCriterion("maintainerEmail >=", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailLessThan(String value) {
            addCriterion("maintainerEmail <", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailLessThanOrEqualTo(String value) {
            addCriterion("maintainerEmail <=", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailLike(String value) {
            addCriterion("maintainerEmail like", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailNotLike(String value) {
            addCriterion("maintainerEmail not like", value, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailIn(List<String> values) {
            addCriterion("maintainerEmail in", values, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailNotIn(List<String> values) {
            addCriterion("maintainerEmail not in", values, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailBetween(String value1, String value2) {
            addCriterion("maintainerEmail between", value1, value2, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andMaintaineremailNotBetween(String value1, String value2) {
            addCriterion("maintainerEmail not between", value1, value2, "maintaineremail");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Long value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Long value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Long value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Long> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andAbbrnameIsNull() {
            addCriterion("abbrName is null");
            return (Criteria) this;
        }

        public Criteria andAbbrnameIsNotNull() {
            addCriterion("abbrName is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrnameEqualTo(String value) {
            addCriterion("abbrName =", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameNotEqualTo(String value) {
            addCriterion("abbrName <>", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameGreaterThan(String value) {
            addCriterion("abbrName >", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameGreaterThanOrEqualTo(String value) {
            addCriterion("abbrName >=", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameLessThan(String value) {
            addCriterion("abbrName <", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameLessThanOrEqualTo(String value) {
            addCriterion("abbrName <=", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameLike(String value) {
            addCriterion("abbrName like", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameNotLike(String value) {
            addCriterion("abbrName not like", value, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameIn(List<String> values) {
            addCriterion("abbrName in", values, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameNotIn(List<String> values) {
            addCriterion("abbrName not in", values, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameBetween(String value1, String value2) {
            addCriterion("abbrName between", value1, value2, "abbrname");
            return (Criteria) this;
        }

        public Criteria andAbbrnameNotBetween(String value1, String value2) {
            addCriterion("abbrName not between", value1, value2, "abbrname");
            return (Criteria) this;
        }

        public Criteria andShortidIsNull() {
            addCriterion("shortId is null");
            return (Criteria) this;
        }

        public Criteria andShortidIsNotNull() {
            addCriterion("shortId is not null");
            return (Criteria) this;
        }

        public Criteria andShortidEqualTo(String value) {
            addCriterion("shortId =", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidNotEqualTo(String value) {
            addCriterion("shortId <>", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidGreaterThan(String value) {
            addCriterion("shortId >", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidGreaterThanOrEqualTo(String value) {
            addCriterion("shortId >=", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidLessThan(String value) {
            addCriterion("shortId <", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidLessThanOrEqualTo(String value) {
            addCriterion("shortId <=", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidLike(String value) {
            addCriterion("shortId like", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidNotLike(String value) {
            addCriterion("shortId not like", value, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidIn(List<String> values) {
            addCriterion("shortId in", values, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidNotIn(List<String> values) {
            addCriterion("shortId not in", values, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidBetween(String value1, String value2) {
            addCriterion("shortId between", value1, value2, "shortid");
            return (Criteria) this;
        }

        public Criteria andShortidNotBetween(String value1, String value2) {
            addCriterion("shortId not between", value1, value2, "shortid");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNull() {
            addCriterion("parentPath is null");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNotNull() {
            addCriterion("parentPath is not null");
            return (Criteria) this;
        }

        public Criteria andParentpathEqualTo(String value) {
            addCriterion("parentPath =", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotEqualTo(String value) {
            addCriterion("parentPath <>", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThan(String value) {
            addCriterion("parentPath >", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThanOrEqualTo(String value) {
            addCriterion("parentPath >=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThan(String value) {
            addCriterion("parentPath <", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThanOrEqualTo(String value) {
            addCriterion("parentPath <=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLike(String value) {
            addCriterion("parentPath like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotLike(String value) {
            addCriterion("parentPath not like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathIn(List<String> values) {
            addCriterion("parentPath in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotIn(List<String> values) {
            addCriterion("parentPath not in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathBetween(String value1, String value2) {
            addCriterion("parentPath between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotBetween(String value1, String value2) {
            addCriterion("parentPath not between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNull() {
            addCriterion("deptType is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("deptType is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(String value) {
            addCriterion("deptType =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(String value) {
            addCriterion("deptType <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(String value) {
            addCriterion("deptType >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("deptType >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(String value) {
            addCriterion("deptType <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(String value) {
            addCriterion("deptType <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLike(String value) {
            addCriterion("deptType like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotLike(String value) {
            addCriterion("deptType not like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<String> values) {
            addCriterion("deptType in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<String> values) {
            addCriterion("deptType not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(String value1, String value2) {
            addCriterion("deptType between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(String value1, String value2) {
            addCriterion("deptType not between", value1, value2, "depttype");
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