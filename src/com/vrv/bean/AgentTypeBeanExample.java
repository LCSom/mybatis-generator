package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class AgentTypeBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentTypeBeanExample() {
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

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("typeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typeCode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typeCode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIsNull() {
            addCriterion("agentPackType is null");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIsNotNull() {
            addCriterion("agentPackType is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeEqualTo(Integer value) {
            addCriterion("agentPackType =", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotEqualTo(Integer value) {
            addCriterion("agentPackType <>", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeGreaterThan(Integer value) {
            addCriterion("agentPackType >", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agentPackType >=", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeLessThan(Integer value) {
            addCriterion("agentPackType <", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeLessThanOrEqualTo(Integer value) {
            addCriterion("agentPackType <=", value, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeIn(List<Integer> values) {
            addCriterion("agentPackType in", values, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotIn(List<Integer> values) {
            addCriterion("agentPackType not in", values, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeBetween(Integer value1, Integer value2) {
            addCriterion("agentPackType between", value1, value2, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andAgentpacktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("agentPackType not between", value1, value2, "agentpacktype");
            return (Criteria) this;
        }

        public Criteria andParentclassIsNull() {
            addCriterion("parentClass is null");
            return (Criteria) this;
        }

        public Criteria andParentclassIsNotNull() {
            addCriterion("parentClass is not null");
            return (Criteria) this;
        }

        public Criteria andParentclassEqualTo(String value) {
            addCriterion("parentClass =", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassNotEqualTo(String value) {
            addCriterion("parentClass <>", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassGreaterThan(String value) {
            addCriterion("parentClass >", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassGreaterThanOrEqualTo(String value) {
            addCriterion("parentClass >=", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassLessThan(String value) {
            addCriterion("parentClass <", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassLessThanOrEqualTo(String value) {
            addCriterion("parentClass <=", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassLike(String value) {
            addCriterion("parentClass like", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassNotLike(String value) {
            addCriterion("parentClass not like", value, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassIn(List<String> values) {
            addCriterion("parentClass in", values, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassNotIn(List<String> values) {
            addCriterion("parentClass not in", values, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassBetween(String value1, String value2) {
            addCriterion("parentClass between", value1, value2, "parentclass");
            return (Criteria) this;
        }

        public Criteria andParentclassNotBetween(String value1, String value2) {
            addCriterion("parentClass not between", value1, value2, "parentclass");
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