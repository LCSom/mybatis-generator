package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class HolidayUserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolidayUserBeanExample() {
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

        public Criteria andHutIdIsNull() {
            addCriterion("hut_id is null");
            return (Criteria) this;
        }

        public Criteria andHutIdIsNotNull() {
            addCriterion("hut_id is not null");
            return (Criteria) this;
        }

        public Criteria andHutIdEqualTo(Integer value) {
            addCriterion("hut_id =", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdNotEqualTo(Integer value) {
            addCriterion("hut_id <>", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdGreaterThan(Integer value) {
            addCriterion("hut_id >", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_id >=", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdLessThan(Integer value) {
            addCriterion("hut_id <", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdLessThanOrEqualTo(Integer value) {
            addCriterion("hut_id <=", value, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdIn(List<Integer> values) {
            addCriterion("hut_id in", values, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdNotIn(List<Integer> values) {
            addCriterion("hut_id not in", values, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdBetween(Integer value1, Integer value2) {
            addCriterion("hut_id between", value1, value2, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_id not between", value1, value2, "hutId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdIsNull() {
            addCriterion("hut_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andHutUtIdIsNotNull() {
            addCriterion("hut_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andHutUtIdEqualTo(Integer value) {
            addCriterion("hut_ut_id =", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdNotEqualTo(Integer value) {
            addCriterion("hut_ut_id <>", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdGreaterThan(Integer value) {
            addCriterion("hut_ut_id >", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_ut_id >=", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdLessThan(Integer value) {
            addCriterion("hut_ut_id <", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("hut_ut_id <=", value, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdIn(List<Integer> values) {
            addCriterion("hut_ut_id in", values, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdNotIn(List<Integer> values) {
            addCriterion("hut_ut_id not in", values, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdBetween(Integer value1, Integer value2) {
            addCriterion("hut_ut_id between", value1, value2, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_ut_id not between", value1, value2, "hutUtId");
            return (Criteria) this;
        }

        public Criteria andHutNameIsNull() {
            addCriterion("hut_name is null");
            return (Criteria) this;
        }

        public Criteria andHutNameIsNotNull() {
            addCriterion("hut_name is not null");
            return (Criteria) this;
        }

        public Criteria andHutNameEqualTo(String value) {
            addCriterion("hut_name =", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameNotEqualTo(String value) {
            addCriterion("hut_name <>", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameGreaterThan(String value) {
            addCriterion("hut_name >", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameGreaterThanOrEqualTo(String value) {
            addCriterion("hut_name >=", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameLessThan(String value) {
            addCriterion("hut_name <", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameLessThanOrEqualTo(String value) {
            addCriterion("hut_name <=", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameLike(String value) {
            addCriterion("hut_name like", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameNotLike(String value) {
            addCriterion("hut_name not like", value, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameIn(List<String> values) {
            addCriterion("hut_name in", values, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameNotIn(List<String> values) {
            addCriterion("hut_name not in", values, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameBetween(String value1, String value2) {
            addCriterion("hut_name between", value1, value2, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutNameNotBetween(String value1, String value2) {
            addCriterion("hut_name not between", value1, value2, "hutName");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionIsNull() {
            addCriterion("hut_description is null");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionIsNotNull() {
            addCriterion("hut_description is not null");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionEqualTo(String value) {
            addCriterion("hut_description =", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionNotEqualTo(String value) {
            addCriterion("hut_description <>", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionGreaterThan(String value) {
            addCriterion("hut_description >", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("hut_description >=", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionLessThan(String value) {
            addCriterion("hut_description <", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionLessThanOrEqualTo(String value) {
            addCriterion("hut_description <=", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionLike(String value) {
            addCriterion("hut_description like", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionNotLike(String value) {
            addCriterion("hut_description not like", value, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionIn(List<String> values) {
            addCriterion("hut_description in", values, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionNotIn(List<String> values) {
            addCriterion("hut_description not in", values, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionBetween(String value1, String value2) {
            addCriterion("hut_description between", value1, value2, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDescriptionNotBetween(String value1, String value2) {
            addCriterion("hut_description not between", value1, value2, "hutDescription");
            return (Criteria) this;
        }

        public Criteria andHutDateIsNull() {
            addCriterion("hut_date is null");
            return (Criteria) this;
        }

        public Criteria andHutDateIsNotNull() {
            addCriterion("hut_date is not null");
            return (Criteria) this;
        }

        public Criteria andHutDateEqualTo(String value) {
            addCriterion("hut_date =", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateNotEqualTo(String value) {
            addCriterion("hut_date <>", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateGreaterThan(String value) {
            addCriterion("hut_date >", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateGreaterThanOrEqualTo(String value) {
            addCriterion("hut_date >=", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateLessThan(String value) {
            addCriterion("hut_date <", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateLessThanOrEqualTo(String value) {
            addCriterion("hut_date <=", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateLike(String value) {
            addCriterion("hut_date like", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateNotLike(String value) {
            addCriterion("hut_date not like", value, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateIn(List<String> values) {
            addCriterion("hut_date in", values, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateNotIn(List<String> values) {
            addCriterion("hut_date not in", values, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateBetween(String value1, String value2) {
            addCriterion("hut_date between", value1, value2, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutDateNotBetween(String value1, String value2) {
            addCriterion("hut_date not between", value1, value2, "hutDate");
            return (Criteria) this;
        }

        public Criteria andHutYearIsNull() {
            addCriterion("hut_year is null");
            return (Criteria) this;
        }

        public Criteria andHutYearIsNotNull() {
            addCriterion("hut_year is not null");
            return (Criteria) this;
        }

        public Criteria andHutYearEqualTo(Integer value) {
            addCriterion("hut_year =", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearNotEqualTo(Integer value) {
            addCriterion("hut_year <>", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearGreaterThan(Integer value) {
            addCriterion("hut_year >", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_year >=", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearLessThan(Integer value) {
            addCriterion("hut_year <", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearLessThanOrEqualTo(Integer value) {
            addCriterion("hut_year <=", value, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearIn(List<Integer> values) {
            addCriterion("hut_year in", values, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearNotIn(List<Integer> values) {
            addCriterion("hut_year not in", values, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearBetween(Integer value1, Integer value2) {
            addCriterion("hut_year between", value1, value2, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutYearNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_year not between", value1, value2, "hutYear");
            return (Criteria) this;
        }

        public Criteria andHutMonthIsNull() {
            addCriterion("hut_month is null");
            return (Criteria) this;
        }

        public Criteria andHutMonthIsNotNull() {
            addCriterion("hut_month is not null");
            return (Criteria) this;
        }

        public Criteria andHutMonthEqualTo(Integer value) {
            addCriterion("hut_month =", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthNotEqualTo(Integer value) {
            addCriterion("hut_month <>", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthGreaterThan(Integer value) {
            addCriterion("hut_month >", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_month >=", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthLessThan(Integer value) {
            addCriterion("hut_month <", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthLessThanOrEqualTo(Integer value) {
            addCriterion("hut_month <=", value, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthIn(List<Integer> values) {
            addCriterion("hut_month in", values, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthNotIn(List<Integer> values) {
            addCriterion("hut_month not in", values, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthBetween(Integer value1, Integer value2) {
            addCriterion("hut_month between", value1, value2, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_month not between", value1, value2, "hutMonth");
            return (Criteria) this;
        }

        public Criteria andHutDayIsNull() {
            addCriterion("hut_day is null");
            return (Criteria) this;
        }

        public Criteria andHutDayIsNotNull() {
            addCriterion("hut_day is not null");
            return (Criteria) this;
        }

        public Criteria andHutDayEqualTo(Integer value) {
            addCriterion("hut_day =", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayNotEqualTo(Integer value) {
            addCriterion("hut_day <>", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayGreaterThan(Integer value) {
            addCriterion("hut_day >", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_day >=", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayLessThan(Integer value) {
            addCriterion("hut_day <", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayLessThanOrEqualTo(Integer value) {
            addCriterion("hut_day <=", value, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayIn(List<Integer> values) {
            addCriterion("hut_day in", values, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayNotIn(List<Integer> values) {
            addCriterion("hut_day not in", values, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayBetween(Integer value1, Integer value2) {
            addCriterion("hut_day between", value1, value2, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutDayNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_day not between", value1, value2, "hutDay");
            return (Criteria) this;
        }

        public Criteria andHutTypeIsNull() {
            addCriterion("hut_type is null");
            return (Criteria) this;
        }

        public Criteria andHutTypeIsNotNull() {
            addCriterion("hut_type is not null");
            return (Criteria) this;
        }

        public Criteria andHutTypeEqualTo(String value) {
            addCriterion("hut_type =", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeNotEqualTo(String value) {
            addCriterion("hut_type <>", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeGreaterThan(String value) {
            addCriterion("hut_type >", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hut_type >=", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeLessThan(String value) {
            addCriterion("hut_type <", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeLessThanOrEqualTo(String value) {
            addCriterion("hut_type <=", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeLike(String value) {
            addCriterion("hut_type like", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeNotLike(String value) {
            addCriterion("hut_type not like", value, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeIn(List<String> values) {
            addCriterion("hut_type in", values, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeNotIn(List<String> values) {
            addCriterion("hut_type not in", values, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeBetween(String value1, String value2) {
            addCriterion("hut_type between", value1, value2, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutTypeNotBetween(String value1, String value2) {
            addCriterion("hut_type not between", value1, value2, "hutType");
            return (Criteria) this;
        }

        public Criteria andHutLocationIsNull() {
            addCriterion("hut_location is null");
            return (Criteria) this;
        }

        public Criteria andHutLocationIsNotNull() {
            addCriterion("hut_location is not null");
            return (Criteria) this;
        }

        public Criteria andHutLocationEqualTo(String value) {
            addCriterion("hut_location =", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationNotEqualTo(String value) {
            addCriterion("hut_location <>", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationGreaterThan(String value) {
            addCriterion("hut_location >", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationGreaterThanOrEqualTo(String value) {
            addCriterion("hut_location >=", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationLessThan(String value) {
            addCriterion("hut_location <", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationLessThanOrEqualTo(String value) {
            addCriterion("hut_location <=", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationLike(String value) {
            addCriterion("hut_location like", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationNotLike(String value) {
            addCriterion("hut_location not like", value, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationIn(List<String> values) {
            addCriterion("hut_location in", values, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationNotIn(List<String> values) {
            addCriterion("hut_location not in", values, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationBetween(String value1, String value2) {
            addCriterion("hut_location between", value1, value2, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutLocationNotBetween(String value1, String value2) {
            addCriterion("hut_location not between", value1, value2, "hutLocation");
            return (Criteria) this;
        }

        public Criteria andHutStatusIsNull() {
            addCriterion("hut_status is null");
            return (Criteria) this;
        }

        public Criteria andHutStatusIsNotNull() {
            addCriterion("hut_status is not null");
            return (Criteria) this;
        }

        public Criteria andHutStatusEqualTo(Integer value) {
            addCriterion("hut_status =", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusNotEqualTo(Integer value) {
            addCriterion("hut_status <>", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusGreaterThan(Integer value) {
            addCriterion("hut_status >", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hut_status >=", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusLessThan(Integer value) {
            addCriterion("hut_status <", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hut_status <=", value, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusIn(List<Integer> values) {
            addCriterion("hut_status in", values, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusNotIn(List<Integer> values) {
            addCriterion("hut_status not in", values, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusBetween(Integer value1, Integer value2) {
            addCriterion("hut_status between", value1, value2, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hut_status not between", value1, value2, "hutStatus");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeIsNull() {
            addCriterion("hut_created_time is null");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeIsNotNull() {
            addCriterion("hut_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeEqualTo(String value) {
            addCriterion("hut_created_time =", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeNotEqualTo(String value) {
            addCriterion("hut_created_time <>", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeGreaterThan(String value) {
            addCriterion("hut_created_time >", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("hut_created_time >=", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeLessThan(String value) {
            addCriterion("hut_created_time <", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("hut_created_time <=", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeLike(String value) {
            addCriterion("hut_created_time like", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeNotLike(String value) {
            addCriterion("hut_created_time not like", value, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeIn(List<String> values) {
            addCriterion("hut_created_time in", values, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeNotIn(List<String> values) {
            addCriterion("hut_created_time not in", values, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeBetween(String value1, String value2) {
            addCriterion("hut_created_time between", value1, value2, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("hut_created_time not between", value1, value2, "hutCreatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeIsNull() {
            addCriterion("hut_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeIsNotNull() {
            addCriterion("hut_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeEqualTo(String value) {
            addCriterion("hut_updated_time =", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeNotEqualTo(String value) {
            addCriterion("hut_updated_time <>", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeGreaterThan(String value) {
            addCriterion("hut_updated_time >", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("hut_updated_time >=", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeLessThan(String value) {
            addCriterion("hut_updated_time <", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeLessThanOrEqualTo(String value) {
            addCriterion("hut_updated_time <=", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeLike(String value) {
            addCriterion("hut_updated_time like", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeNotLike(String value) {
            addCriterion("hut_updated_time not like", value, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeIn(List<String> values) {
            addCriterion("hut_updated_time in", values, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeNotIn(List<String> values) {
            addCriterion("hut_updated_time not in", values, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeBetween(String value1, String value2) {
            addCriterion("hut_updated_time between", value1, value2, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutUpdatedTimeNotBetween(String value1, String value2) {
            addCriterion("hut_updated_time not between", value1, value2, "hutUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andHutParam1IsNull() {
            addCriterion("hut_param1 is null");
            return (Criteria) this;
        }

        public Criteria andHutParam1IsNotNull() {
            addCriterion("hut_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andHutParam1EqualTo(String value) {
            addCriterion("hut_param1 =", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1NotEqualTo(String value) {
            addCriterion("hut_param1 <>", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1GreaterThan(String value) {
            addCriterion("hut_param1 >", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1GreaterThanOrEqualTo(String value) {
            addCriterion("hut_param1 >=", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1LessThan(String value) {
            addCriterion("hut_param1 <", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1LessThanOrEqualTo(String value) {
            addCriterion("hut_param1 <=", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1Like(String value) {
            addCriterion("hut_param1 like", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1NotLike(String value) {
            addCriterion("hut_param1 not like", value, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1In(List<String> values) {
            addCriterion("hut_param1 in", values, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1NotIn(List<String> values) {
            addCriterion("hut_param1 not in", values, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1Between(String value1, String value2) {
            addCriterion("hut_param1 between", value1, value2, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam1NotBetween(String value1, String value2) {
            addCriterion("hut_param1 not between", value1, value2, "hutParam1");
            return (Criteria) this;
        }

        public Criteria andHutParam2IsNull() {
            addCriterion("hut_param2 is null");
            return (Criteria) this;
        }

        public Criteria andHutParam2IsNotNull() {
            addCriterion("hut_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andHutParam2EqualTo(String value) {
            addCriterion("hut_param2 =", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2NotEqualTo(String value) {
            addCriterion("hut_param2 <>", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2GreaterThan(String value) {
            addCriterion("hut_param2 >", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2GreaterThanOrEqualTo(String value) {
            addCriterion("hut_param2 >=", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2LessThan(String value) {
            addCriterion("hut_param2 <", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2LessThanOrEqualTo(String value) {
            addCriterion("hut_param2 <=", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2Like(String value) {
            addCriterion("hut_param2 like", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2NotLike(String value) {
            addCriterion("hut_param2 not like", value, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2In(List<String> values) {
            addCriterion("hut_param2 in", values, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2NotIn(List<String> values) {
            addCriterion("hut_param2 not in", values, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2Between(String value1, String value2) {
            addCriterion("hut_param2 between", value1, value2, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam2NotBetween(String value1, String value2) {
            addCriterion("hut_param2 not between", value1, value2, "hutParam2");
            return (Criteria) this;
        }

        public Criteria andHutParam3IsNull() {
            addCriterion("hut_param3 is null");
            return (Criteria) this;
        }

        public Criteria andHutParam3IsNotNull() {
            addCriterion("hut_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andHutParam3EqualTo(String value) {
            addCriterion("hut_param3 =", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3NotEqualTo(String value) {
            addCriterion("hut_param3 <>", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3GreaterThan(String value) {
            addCriterion("hut_param3 >", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3GreaterThanOrEqualTo(String value) {
            addCriterion("hut_param3 >=", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3LessThan(String value) {
            addCriterion("hut_param3 <", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3LessThanOrEqualTo(String value) {
            addCriterion("hut_param3 <=", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3Like(String value) {
            addCriterion("hut_param3 like", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3NotLike(String value) {
            addCriterion("hut_param3 not like", value, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3In(List<String> values) {
            addCriterion("hut_param3 in", values, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3NotIn(List<String> values) {
            addCriterion("hut_param3 not in", values, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3Between(String value1, String value2) {
            addCriterion("hut_param3 between", value1, value2, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam3NotBetween(String value1, String value2) {
            addCriterion("hut_param3 not between", value1, value2, "hutParam3");
            return (Criteria) this;
        }

        public Criteria andHutParam4IsNull() {
            addCriterion("hut_param4 is null");
            return (Criteria) this;
        }

        public Criteria andHutParam4IsNotNull() {
            addCriterion("hut_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andHutParam4EqualTo(String value) {
            addCriterion("hut_param4 =", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4NotEqualTo(String value) {
            addCriterion("hut_param4 <>", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4GreaterThan(String value) {
            addCriterion("hut_param4 >", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4GreaterThanOrEqualTo(String value) {
            addCriterion("hut_param4 >=", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4LessThan(String value) {
            addCriterion("hut_param4 <", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4LessThanOrEqualTo(String value) {
            addCriterion("hut_param4 <=", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4Like(String value) {
            addCriterion("hut_param4 like", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4NotLike(String value) {
            addCriterion("hut_param4 not like", value, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4In(List<String> values) {
            addCriterion("hut_param4 in", values, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4NotIn(List<String> values) {
            addCriterion("hut_param4 not in", values, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4Between(String value1, String value2) {
            addCriterion("hut_param4 between", value1, value2, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam4NotBetween(String value1, String value2) {
            addCriterion("hut_param4 not between", value1, value2, "hutParam4");
            return (Criteria) this;
        }

        public Criteria andHutParam5IsNull() {
            addCriterion("hut_param5 is null");
            return (Criteria) this;
        }

        public Criteria andHutParam5IsNotNull() {
            addCriterion("hut_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andHutParam5EqualTo(String value) {
            addCriterion("hut_param5 =", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5NotEqualTo(String value) {
            addCriterion("hut_param5 <>", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5GreaterThan(String value) {
            addCriterion("hut_param5 >", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5GreaterThanOrEqualTo(String value) {
            addCriterion("hut_param5 >=", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5LessThan(String value) {
            addCriterion("hut_param5 <", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5LessThanOrEqualTo(String value) {
            addCriterion("hut_param5 <=", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5Like(String value) {
            addCriterion("hut_param5 like", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5NotLike(String value) {
            addCriterion("hut_param5 not like", value, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5In(List<String> values) {
            addCriterion("hut_param5 in", values, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5NotIn(List<String> values) {
            addCriterion("hut_param5 not in", values, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5Between(String value1, String value2) {
            addCriterion("hut_param5 between", value1, value2, "hutParam5");
            return (Criteria) this;
        }

        public Criteria andHutParam5NotBetween(String value1, String value2) {
            addCriterion("hut_param5 not between", value1, value2, "hutParam5");
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