package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HardwareBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardwareBeanExample() {
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

        public Criteria andDevonlyidIsNull() {
            addCriterion("devOnlyId is null");
            return (Criteria) this;
        }

        public Criteria andDevonlyidIsNotNull() {
            addCriterion("devOnlyId is not null");
            return (Criteria) this;
        }

        public Criteria andDevonlyidEqualTo(String value) {
            addCriterion("devOnlyId =", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotEqualTo(String value) {
            addCriterion("devOnlyId <>", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidGreaterThan(String value) {
            addCriterion("devOnlyId >", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidGreaterThanOrEqualTo(String value) {
            addCriterion("devOnlyId >=", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLessThan(String value) {
            addCriterion("devOnlyId <", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLessThanOrEqualTo(String value) {
            addCriterion("devOnlyId <=", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidLike(String value) {
            addCriterion("devOnlyId like", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotLike(String value) {
            addCriterion("devOnlyId not like", value, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidIn(List<String> values) {
            addCriterion("devOnlyId in", values, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotIn(List<String> values) {
            addCriterion("devOnlyId not in", values, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidBetween(String value1, String value2) {
            addCriterion("devOnlyId between", value1, value2, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andDevonlyidNotBetween(String value1, String value2) {
            addCriterion("devOnlyId not between", value1, value2, "devonlyid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidIsNull() {
            addCriterion("hardwareTypeId is null");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidIsNotNull() {
            addCriterion("hardwareTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidEqualTo(String value) {
            addCriterion("hardwareTypeId =", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidNotEqualTo(String value) {
            addCriterion("hardwareTypeId <>", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidGreaterThan(String value) {
            addCriterion("hardwareTypeId >", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidGreaterThanOrEqualTo(String value) {
            addCriterion("hardwareTypeId >=", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidLessThan(String value) {
            addCriterion("hardwareTypeId <", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidLessThanOrEqualTo(String value) {
            addCriterion("hardwareTypeId <=", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidLike(String value) {
            addCriterion("hardwareTypeId like", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidNotLike(String value) {
            addCriterion("hardwareTypeId not like", value, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidIn(List<String> values) {
            addCriterion("hardwareTypeId in", values, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidNotIn(List<String> values) {
            addCriterion("hardwareTypeId not in", values, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidBetween(String value1, String value2) {
            addCriterion("hardwareTypeId between", value1, value2, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwaretypeidNotBetween(String value1, String value2) {
            addCriterion("hardwareTypeId not between", value1, value2, "hardwaretypeid");
            return (Criteria) this;
        }

        public Criteria andHardwarenameIsNull() {
            addCriterion("hardwareName is null");
            return (Criteria) this;
        }

        public Criteria andHardwarenameIsNotNull() {
            addCriterion("hardwareName is not null");
            return (Criteria) this;
        }

        public Criteria andHardwarenameEqualTo(String value) {
            addCriterion("hardwareName =", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameNotEqualTo(String value) {
            addCriterion("hardwareName <>", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameGreaterThan(String value) {
            addCriterion("hardwareName >", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameGreaterThanOrEqualTo(String value) {
            addCriterion("hardwareName >=", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameLessThan(String value) {
            addCriterion("hardwareName <", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameLessThanOrEqualTo(String value) {
            addCriterion("hardwareName <=", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameLike(String value) {
            addCriterion("hardwareName like", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameNotLike(String value) {
            addCriterion("hardwareName not like", value, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameIn(List<String> values) {
            addCriterion("hardwareName in", values, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameNotIn(List<String> values) {
            addCriterion("hardwareName not in", values, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameBetween(String value1, String value2) {
            addCriterion("hardwareName between", value1, value2, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarenameNotBetween(String value1, String value2) {
            addCriterion("hardwareName not between", value1, value2, "hardwarename");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyIsNull() {
            addCriterion("hardwareCompany is null");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyIsNotNull() {
            addCriterion("hardwareCompany is not null");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyEqualTo(String value) {
            addCriterion("hardwareCompany =", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyNotEqualTo(String value) {
            addCriterion("hardwareCompany <>", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyGreaterThan(String value) {
            addCriterion("hardwareCompany >", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("hardwareCompany >=", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyLessThan(String value) {
            addCriterion("hardwareCompany <", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyLessThanOrEqualTo(String value) {
            addCriterion("hardwareCompany <=", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyLike(String value) {
            addCriterion("hardwareCompany like", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyNotLike(String value) {
            addCriterion("hardwareCompany not like", value, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyIn(List<String> values) {
            addCriterion("hardwareCompany in", values, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyNotIn(List<String> values) {
            addCriterion("hardwareCompany not in", values, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyBetween(String value1, String value2) {
            addCriterion("hardwareCompany between", value1, value2, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarecompanyNotBetween(String value1, String value2) {
            addCriterion("hardwareCompany not between", value1, value2, "hardwarecompany");
            return (Criteria) this;
        }

        public Criteria andHardwarevidIsNull() {
            addCriterion("hardwareVId is null");
            return (Criteria) this;
        }

        public Criteria andHardwarevidIsNotNull() {
            addCriterion("hardwareVId is not null");
            return (Criteria) this;
        }

        public Criteria andHardwarevidEqualTo(String value) {
            addCriterion("hardwareVId =", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidNotEqualTo(String value) {
            addCriterion("hardwareVId <>", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidGreaterThan(String value) {
            addCriterion("hardwareVId >", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidGreaterThanOrEqualTo(String value) {
            addCriterion("hardwareVId >=", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidLessThan(String value) {
            addCriterion("hardwareVId <", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidLessThanOrEqualTo(String value) {
            addCriterion("hardwareVId <=", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidLike(String value) {
            addCriterion("hardwareVId like", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidNotLike(String value) {
            addCriterion("hardwareVId not like", value, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidIn(List<String> values) {
            addCriterion("hardwareVId in", values, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidNotIn(List<String> values) {
            addCriterion("hardwareVId not in", values, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidBetween(String value1, String value2) {
            addCriterion("hardwareVId between", value1, value2, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarevidNotBetween(String value1, String value2) {
            addCriterion("hardwareVId not between", value1, value2, "hardwarevid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidIsNull() {
            addCriterion("hardwarePId is null");
            return (Criteria) this;
        }

        public Criteria andHardwarepidIsNotNull() {
            addCriterion("hardwarePId is not null");
            return (Criteria) this;
        }

        public Criteria andHardwarepidEqualTo(String value) {
            addCriterion("hardwarePId =", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidNotEqualTo(String value) {
            addCriterion("hardwarePId <>", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidGreaterThan(String value) {
            addCriterion("hardwarePId >", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidGreaterThanOrEqualTo(String value) {
            addCriterion("hardwarePId >=", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidLessThan(String value) {
            addCriterion("hardwarePId <", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidLessThanOrEqualTo(String value) {
            addCriterion("hardwarePId <=", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidLike(String value) {
            addCriterion("hardwarePId like", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidNotLike(String value) {
            addCriterion("hardwarePId not like", value, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidIn(List<String> values) {
            addCriterion("hardwarePId in", values, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidNotIn(List<String> values) {
            addCriterion("hardwarePId not in", values, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidBetween(String value1, String value2) {
            addCriterion("hardwarePId between", value1, value2, "hardwarepid");
            return (Criteria) this;
        }

        public Criteria andHardwarepidNotBetween(String value1, String value2) {
            addCriterion("hardwarePId not between", value1, value2, "hardwarepid");
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

        public Criteria andReporttimeIsNull() {
            addCriterion("reportTime is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("reportTime is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterion("reportTime =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterion("reportTime <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterion("reportTime >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reportTime >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterion("reportTime <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("reportTime <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterion("reportTime in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterion("reportTime not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterion("reportTime between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("reportTime not between", value1, value2, "reporttime");
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