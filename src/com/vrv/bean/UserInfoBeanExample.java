package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoBeanExample() {
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

        public Criteria andUitIdIsNull() {
            addCriterion("uit_id is null");
            return (Criteria) this;
        }

        public Criteria andUitIdIsNotNull() {
            addCriterion("uit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUitIdEqualTo(Integer value) {
            addCriterion("uit_id =", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdNotEqualTo(Integer value) {
            addCriterion("uit_id <>", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdGreaterThan(Integer value) {
            addCriterion("uit_id >", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uit_id >=", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdLessThan(Integer value) {
            addCriterion("uit_id <", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdLessThanOrEqualTo(Integer value) {
            addCriterion("uit_id <=", value, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdIn(List<Integer> values) {
            addCriterion("uit_id in", values, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdNotIn(List<Integer> values) {
            addCriterion("uit_id not in", values, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdBetween(Integer value1, Integer value2) {
            addCriterion("uit_id between", value1, value2, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uit_id not between", value1, value2, "uitId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdIsNull() {
            addCriterion("uit_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andUitUtIdIsNotNull() {
            addCriterion("uit_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andUitUtIdEqualTo(Integer value) {
            addCriterion("uit_ut_id =", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdNotEqualTo(Integer value) {
            addCriterion("uit_ut_id <>", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdGreaterThan(Integer value) {
            addCriterion("uit_ut_id >", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uit_ut_id >=", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdLessThan(Integer value) {
            addCriterion("uit_ut_id <", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("uit_ut_id <=", value, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdIn(List<Integer> values) {
            addCriterion("uit_ut_id in", values, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdNotIn(List<Integer> values) {
            addCriterion("uit_ut_id not in", values, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdBetween(Integer value1, Integer value2) {
            addCriterion("uit_ut_id between", value1, value2, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uit_ut_id not between", value1, value2, "uitUtId");
            return (Criteria) this;
        }

        public Criteria andUitNameIsNull() {
            addCriterion("uit_name is null");
            return (Criteria) this;
        }

        public Criteria andUitNameIsNotNull() {
            addCriterion("uit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUitNameEqualTo(String value) {
            addCriterion("uit_name =", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameNotEqualTo(String value) {
            addCriterion("uit_name <>", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameGreaterThan(String value) {
            addCriterion("uit_name >", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameGreaterThanOrEqualTo(String value) {
            addCriterion("uit_name >=", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameLessThan(String value) {
            addCriterion("uit_name <", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameLessThanOrEqualTo(String value) {
            addCriterion("uit_name <=", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameLike(String value) {
            addCriterion("uit_name like", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameNotLike(String value) {
            addCriterion("uit_name not like", value, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameIn(List<String> values) {
            addCriterion("uit_name in", values, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameNotIn(List<String> values) {
            addCriterion("uit_name not in", values, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameBetween(String value1, String value2) {
            addCriterion("uit_name between", value1, value2, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitNameNotBetween(String value1, String value2) {
            addCriterion("uit_name not between", value1, value2, "uitName");
            return (Criteria) this;
        }

        public Criteria andUitEmailIsNull() {
            addCriterion("uit_email is null");
            return (Criteria) this;
        }

        public Criteria andUitEmailIsNotNull() {
            addCriterion("uit_email is not null");
            return (Criteria) this;
        }

        public Criteria andUitEmailEqualTo(String value) {
            addCriterion("uit_email =", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailNotEqualTo(String value) {
            addCriterion("uit_email <>", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailGreaterThan(String value) {
            addCriterion("uit_email >", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailGreaterThanOrEqualTo(String value) {
            addCriterion("uit_email >=", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailLessThan(String value) {
            addCriterion("uit_email <", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailLessThanOrEqualTo(String value) {
            addCriterion("uit_email <=", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailLike(String value) {
            addCriterion("uit_email like", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailNotLike(String value) {
            addCriterion("uit_email not like", value, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailIn(List<String> values) {
            addCriterion("uit_email in", values, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailNotIn(List<String> values) {
            addCriterion("uit_email not in", values, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailBetween(String value1, String value2) {
            addCriterion("uit_email between", value1, value2, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitEmailNotBetween(String value1, String value2) {
            addCriterion("uit_email not between", value1, value2, "uitEmail");
            return (Criteria) this;
        }

        public Criteria andUitTelIsNull() {
            addCriterion("uit_tel is null");
            return (Criteria) this;
        }

        public Criteria andUitTelIsNotNull() {
            addCriterion("uit_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUitTelEqualTo(String value) {
            addCriterion("uit_tel =", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelNotEqualTo(String value) {
            addCriterion("uit_tel <>", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelGreaterThan(String value) {
            addCriterion("uit_tel >", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelGreaterThanOrEqualTo(String value) {
            addCriterion("uit_tel >=", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelLessThan(String value) {
            addCriterion("uit_tel <", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelLessThanOrEqualTo(String value) {
            addCriterion("uit_tel <=", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelLike(String value) {
            addCriterion("uit_tel like", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelNotLike(String value) {
            addCriterion("uit_tel not like", value, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelIn(List<String> values) {
            addCriterion("uit_tel in", values, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelNotIn(List<String> values) {
            addCriterion("uit_tel not in", values, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelBetween(String value1, String value2) {
            addCriterion("uit_tel between", value1, value2, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitTelNotBetween(String value1, String value2) {
            addCriterion("uit_tel not between", value1, value2, "uitTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelIsNull() {
            addCriterion("uit_office_tel is null");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelIsNotNull() {
            addCriterion("uit_office_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelEqualTo(String value) {
            addCriterion("uit_office_tel =", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelNotEqualTo(String value) {
            addCriterion("uit_office_tel <>", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelGreaterThan(String value) {
            addCriterion("uit_office_tel >", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("uit_office_tel >=", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelLessThan(String value) {
            addCriterion("uit_office_tel <", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("uit_office_tel <=", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelLike(String value) {
            addCriterion("uit_office_tel like", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelNotLike(String value) {
            addCriterion("uit_office_tel not like", value, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelIn(List<String> values) {
            addCriterion("uit_office_tel in", values, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelNotIn(List<String> values) {
            addCriterion("uit_office_tel not in", values, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelBetween(String value1, String value2) {
            addCriterion("uit_office_tel between", value1, value2, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitOfficeTelNotBetween(String value1, String value2) {
            addCriterion("uit_office_tel not between", value1, value2, "uitOfficeTel");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionIsNull() {
            addCriterion("uit_description is null");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionIsNotNull() {
            addCriterion("uit_description is not null");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionEqualTo(String value) {
            addCriterion("uit_description =", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionNotEqualTo(String value) {
            addCriterion("uit_description <>", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionGreaterThan(String value) {
            addCriterion("uit_description >", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("uit_description >=", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionLessThan(String value) {
            addCriterion("uit_description <", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionLessThanOrEqualTo(String value) {
            addCriterion("uit_description <=", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionLike(String value) {
            addCriterion("uit_description like", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionNotLike(String value) {
            addCriterion("uit_description not like", value, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionIn(List<String> values) {
            addCriterion("uit_description in", values, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionNotIn(List<String> values) {
            addCriterion("uit_description not in", values, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionBetween(String value1, String value2) {
            addCriterion("uit_description between", value1, value2, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitDescriptionNotBetween(String value1, String value2) {
            addCriterion("uit_description not between", value1, value2, "uitDescription");
            return (Criteria) this;
        }

        public Criteria andUitGenderIsNull() {
            addCriterion("uit_gender is null");
            return (Criteria) this;
        }

        public Criteria andUitGenderIsNotNull() {
            addCriterion("uit_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUitGenderEqualTo(Integer value) {
            addCriterion("uit_gender =", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderNotEqualTo(Integer value) {
            addCriterion("uit_gender <>", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderGreaterThan(Integer value) {
            addCriterion("uit_gender >", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("uit_gender >=", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderLessThan(Integer value) {
            addCriterion("uit_gender <", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderLessThanOrEqualTo(Integer value) {
            addCriterion("uit_gender <=", value, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderIn(List<Integer> values) {
            addCriterion("uit_gender in", values, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderNotIn(List<Integer> values) {
            addCriterion("uit_gender not in", values, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderBetween(Integer value1, Integer value2) {
            addCriterion("uit_gender between", value1, value2, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("uit_gender not between", value1, value2, "uitGender");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayIsNull() {
            addCriterion("uit_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayIsNotNull() {
            addCriterion("uit_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayEqualTo(String value) {
            addCriterion("uit_birthday =", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayNotEqualTo(String value) {
            addCriterion("uit_birthday <>", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayGreaterThan(String value) {
            addCriterion("uit_birthday >", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("uit_birthday >=", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayLessThan(String value) {
            addCriterion("uit_birthday <", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayLessThanOrEqualTo(String value) {
            addCriterion("uit_birthday <=", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayLike(String value) {
            addCriterion("uit_birthday like", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayNotLike(String value) {
            addCriterion("uit_birthday not like", value, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayIn(List<String> values) {
            addCriterion("uit_birthday in", values, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayNotIn(List<String> values) {
            addCriterion("uit_birthday not in", values, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayBetween(String value1, String value2) {
            addCriterion("uit_birthday between", value1, value2, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitBirthdayNotBetween(String value1, String value2) {
            addCriterion("uit_birthday not between", value1, value2, "uitBirthday");
            return (Criteria) this;
        }

        public Criteria andUitLocationIsNull() {
            addCriterion("uit_location is null");
            return (Criteria) this;
        }

        public Criteria andUitLocationIsNotNull() {
            addCriterion("uit_location is not null");
            return (Criteria) this;
        }

        public Criteria andUitLocationEqualTo(String value) {
            addCriterion("uit_location =", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationNotEqualTo(String value) {
            addCriterion("uit_location <>", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationGreaterThan(String value) {
            addCriterion("uit_location >", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationGreaterThanOrEqualTo(String value) {
            addCriterion("uit_location >=", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationLessThan(String value) {
            addCriterion("uit_location <", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationLessThanOrEqualTo(String value) {
            addCriterion("uit_location <=", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationLike(String value) {
            addCriterion("uit_location like", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationNotLike(String value) {
            addCriterion("uit_location not like", value, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationIn(List<String> values) {
            addCriterion("uit_location in", values, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationNotIn(List<String> values) {
            addCriterion("uit_location not in", values, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationBetween(String value1, String value2) {
            addCriterion("uit_location between", value1, value2, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitLocationNotBetween(String value1, String value2) {
            addCriterion("uit_location not between", value1, value2, "uitLocation");
            return (Criteria) this;
        }

        public Criteria andUitImageIsNull() {
            addCriterion("uit_image is null");
            return (Criteria) this;
        }

        public Criteria andUitImageIsNotNull() {
            addCriterion("uit_image is not null");
            return (Criteria) this;
        }

        public Criteria andUitImageEqualTo(String value) {
            addCriterion("uit_image =", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageNotEqualTo(String value) {
            addCriterion("uit_image <>", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageGreaterThan(String value) {
            addCriterion("uit_image >", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageGreaterThanOrEqualTo(String value) {
            addCriterion("uit_image >=", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageLessThan(String value) {
            addCriterion("uit_image <", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageLessThanOrEqualTo(String value) {
            addCriterion("uit_image <=", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageLike(String value) {
            addCriterion("uit_image like", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageNotLike(String value) {
            addCriterion("uit_image not like", value, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageIn(List<String> values) {
            addCriterion("uit_image in", values, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageNotIn(List<String> values) {
            addCriterion("uit_image not in", values, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageBetween(String value1, String value2) {
            addCriterion("uit_image between", value1, value2, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitImageNotBetween(String value1, String value2) {
            addCriterion("uit_image not between", value1, value2, "uitImage");
            return (Criteria) this;
        }

        public Criteria andUitPositionIsNull() {
            addCriterion("uit_position is null");
            return (Criteria) this;
        }

        public Criteria andUitPositionIsNotNull() {
            addCriterion("uit_position is not null");
            return (Criteria) this;
        }

        public Criteria andUitPositionEqualTo(String value) {
            addCriterion("uit_position =", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionNotEqualTo(String value) {
            addCriterion("uit_position <>", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionGreaterThan(String value) {
            addCriterion("uit_position >", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionGreaterThanOrEqualTo(String value) {
            addCriterion("uit_position >=", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionLessThan(String value) {
            addCriterion("uit_position <", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionLessThanOrEqualTo(String value) {
            addCriterion("uit_position <=", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionLike(String value) {
            addCriterion("uit_position like", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionNotLike(String value) {
            addCriterion("uit_position not like", value, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionIn(List<String> values) {
            addCriterion("uit_position in", values, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionNotIn(List<String> values) {
            addCriterion("uit_position not in", values, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionBetween(String value1, String value2) {
            addCriterion("uit_position between", value1, value2, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitPositionNotBetween(String value1, String value2) {
            addCriterion("uit_position not between", value1, value2, "uitPosition");
            return (Criteria) this;
        }

        public Criteria andUitCompanyIsNull() {
            addCriterion("uit_company is null");
            return (Criteria) this;
        }

        public Criteria andUitCompanyIsNotNull() {
            addCriterion("uit_company is not null");
            return (Criteria) this;
        }

        public Criteria andUitCompanyEqualTo(String value) {
            addCriterion("uit_company =", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyNotEqualTo(String value) {
            addCriterion("uit_company <>", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyGreaterThan(String value) {
            addCriterion("uit_company >", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("uit_company >=", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyLessThan(String value) {
            addCriterion("uit_company <", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyLessThanOrEqualTo(String value) {
            addCriterion("uit_company <=", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyLike(String value) {
            addCriterion("uit_company like", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyNotLike(String value) {
            addCriterion("uit_company not like", value, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyIn(List<String> values) {
            addCriterion("uit_company in", values, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyNotIn(List<String> values) {
            addCriterion("uit_company not in", values, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyBetween(String value1, String value2) {
            addCriterion("uit_company between", value1, value2, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitCompanyNotBetween(String value1, String value2) {
            addCriterion("uit_company not between", value1, value2, "uitCompany");
            return (Criteria) this;
        }

        public Criteria andUitStaffIsNull() {
            addCriterion("uit_staff is null");
            return (Criteria) this;
        }

        public Criteria andUitStaffIsNotNull() {
            addCriterion("uit_staff is not null");
            return (Criteria) this;
        }

        public Criteria andUitStaffEqualTo(String value) {
            addCriterion("uit_staff =", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffNotEqualTo(String value) {
            addCriterion("uit_staff <>", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffGreaterThan(String value) {
            addCriterion("uit_staff >", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffGreaterThanOrEqualTo(String value) {
            addCriterion("uit_staff >=", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffLessThan(String value) {
            addCriterion("uit_staff <", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffLessThanOrEqualTo(String value) {
            addCriterion("uit_staff <=", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffLike(String value) {
            addCriterion("uit_staff like", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffNotLike(String value) {
            addCriterion("uit_staff not like", value, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffIn(List<String> values) {
            addCriterion("uit_staff in", values, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffNotIn(List<String> values) {
            addCriterion("uit_staff not in", values, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffBetween(String value1, String value2) {
            addCriterion("uit_staff between", value1, value2, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStaffNotBetween(String value1, String value2) {
            addCriterion("uit_staff not between", value1, value2, "uitStaff");
            return (Criteria) this;
        }

        public Criteria andUitStatusIsNull() {
            addCriterion("uit_status is null");
            return (Criteria) this;
        }

        public Criteria andUitStatusIsNotNull() {
            addCriterion("uit_status is not null");
            return (Criteria) this;
        }

        public Criteria andUitStatusEqualTo(Integer value) {
            addCriterion("uit_status =", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusNotEqualTo(Integer value) {
            addCriterion("uit_status <>", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusGreaterThan(Integer value) {
            addCriterion("uit_status >", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("uit_status >=", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusLessThan(Integer value) {
            addCriterion("uit_status <", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("uit_status <=", value, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusIn(List<Integer> values) {
            addCriterion("uit_status in", values, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusNotIn(List<Integer> values) {
            addCriterion("uit_status not in", values, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusBetween(Integer value1, Integer value2) {
            addCriterion("uit_status between", value1, value2, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("uit_status not between", value1, value2, "uitStatus");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeIsNull() {
            addCriterion("uit_registerType is null");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeIsNotNull() {
            addCriterion("uit_registerType is not null");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeEqualTo(Integer value) {
            addCriterion("uit_registerType =", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeNotEqualTo(Integer value) {
            addCriterion("uit_registerType <>", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeGreaterThan(Integer value) {
            addCriterion("uit_registerType >", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uit_registerType >=", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeLessThan(Integer value) {
            addCriterion("uit_registerType <", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeLessThanOrEqualTo(Integer value) {
            addCriterion("uit_registerType <=", value, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeIn(List<Integer> values) {
            addCriterion("uit_registerType in", values, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeNotIn(List<Integer> values) {
            addCriterion("uit_registerType not in", values, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeBetween(Integer value1, Integer value2) {
            addCriterion("uit_registerType between", value1, value2, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uit_registerType not between", value1, value2, "uitRegistertype");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeIsNull() {
            addCriterion("uit_registerTime is null");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeIsNotNull() {
            addCriterion("uit_registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeEqualTo(String value) {
            addCriterion("uit_registerTime =", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeNotEqualTo(String value) {
            addCriterion("uit_registerTime <>", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeGreaterThan(String value) {
            addCriterion("uit_registerTime >", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeGreaterThanOrEqualTo(String value) {
            addCriterion("uit_registerTime >=", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeLessThan(String value) {
            addCriterion("uit_registerTime <", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeLessThanOrEqualTo(String value) {
            addCriterion("uit_registerTime <=", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeLike(String value) {
            addCriterion("uit_registerTime like", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeNotLike(String value) {
            addCriterion("uit_registerTime not like", value, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeIn(List<String> values) {
            addCriterion("uit_registerTime in", values, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeNotIn(List<String> values) {
            addCriterion("uit_registerTime not in", values, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeBetween(String value1, String value2) {
            addCriterion("uit_registerTime between", value1, value2, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitRegistertimeNotBetween(String value1, String value2) {
            addCriterion("uit_registerTime not between", value1, value2, "uitRegistertime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeIsNull() {
            addCriterion("uit_lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeIsNotNull() {
            addCriterion("uit_lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeEqualTo(String value) {
            addCriterion("uit_lastLoginTime =", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeNotEqualTo(String value) {
            addCriterion("uit_lastLoginTime <>", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeGreaterThan(String value) {
            addCriterion("uit_lastLoginTime >", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("uit_lastLoginTime >=", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeLessThan(String value) {
            addCriterion("uit_lastLoginTime <", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeLessThanOrEqualTo(String value) {
            addCriterion("uit_lastLoginTime <=", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeLike(String value) {
            addCriterion("uit_lastLoginTime like", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeNotLike(String value) {
            addCriterion("uit_lastLoginTime not like", value, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeIn(List<String> values) {
            addCriterion("uit_lastLoginTime in", values, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeNotIn(List<String> values) {
            addCriterion("uit_lastLoginTime not in", values, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeBetween(String value1, String value2) {
            addCriterion("uit_lastLoginTime between", value1, value2, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLastlogintimeNotBetween(String value1, String value2) {
            addCriterion("uit_lastLoginTime not between", value1, value2, "uitLastlogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeIsNull() {
            addCriterion("uit_loginTime is null");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeIsNotNull() {
            addCriterion("uit_loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeEqualTo(String value) {
            addCriterion("uit_loginTime =", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeNotEqualTo(String value) {
            addCriterion("uit_loginTime <>", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeGreaterThan(String value) {
            addCriterion("uit_loginTime >", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("uit_loginTime >=", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeLessThan(String value) {
            addCriterion("uit_loginTime <", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeLessThanOrEqualTo(String value) {
            addCriterion("uit_loginTime <=", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeLike(String value) {
            addCriterion("uit_loginTime like", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeNotLike(String value) {
            addCriterion("uit_loginTime not like", value, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeIn(List<String> values) {
            addCriterion("uit_loginTime in", values, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeNotIn(List<String> values) {
            addCriterion("uit_loginTime not in", values, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeBetween(String value1, String value2) {
            addCriterion("uit_loginTime between", value1, value2, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitLogintimeNotBetween(String value1, String value2) {
            addCriterion("uit_loginTime not between", value1, value2, "uitLogintime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeIsNull() {
            addCriterion("uit_suspendedTime is null");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeIsNotNull() {
            addCriterion("uit_suspendedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeEqualTo(String value) {
            addCriterion("uit_suspendedTime =", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeNotEqualTo(String value) {
            addCriterion("uit_suspendedTime <>", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeGreaterThan(String value) {
            addCriterion("uit_suspendedTime >", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uit_suspendedTime >=", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeLessThan(String value) {
            addCriterion("uit_suspendedTime <", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeLessThanOrEqualTo(String value) {
            addCriterion("uit_suspendedTime <=", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeLike(String value) {
            addCriterion("uit_suspendedTime like", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeNotLike(String value) {
            addCriterion("uit_suspendedTime not like", value, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeIn(List<String> values) {
            addCriterion("uit_suspendedTime in", values, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeNotIn(List<String> values) {
            addCriterion("uit_suspendedTime not in", values, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeBetween(String value1, String value2) {
            addCriterion("uit_suspendedTime between", value1, value2, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitSuspendedtimeNotBetween(String value1, String value2) {
            addCriterion("uit_suspendedTime not between", value1, value2, "uitSuspendedtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeIsNull() {
            addCriterion("uit_updatePwdTime is null");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeIsNotNull() {
            addCriterion("uit_updatePwdTime is not null");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeEqualTo(String value) {
            addCriterion("uit_updatePwdTime =", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeNotEqualTo(String value) {
            addCriterion("uit_updatePwdTime <>", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeGreaterThan(String value) {
            addCriterion("uit_updatePwdTime >", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uit_updatePwdTime >=", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeLessThan(String value) {
            addCriterion("uit_updatePwdTime <", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeLessThanOrEqualTo(String value) {
            addCriterion("uit_updatePwdTime <=", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeLike(String value) {
            addCriterion("uit_updatePwdTime like", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeNotLike(String value) {
            addCriterion("uit_updatePwdTime not like", value, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeIn(List<String> values) {
            addCriterion("uit_updatePwdTime in", values, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeNotIn(List<String> values) {
            addCriterion("uit_updatePwdTime not in", values, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeBetween(String value1, String value2) {
            addCriterion("uit_updatePwdTime between", value1, value2, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatepwdtimeNotBetween(String value1, String value2) {
            addCriterion("uit_updatePwdTime not between", value1, value2, "uitUpdatepwdtime");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdIsNull() {
            addCriterion("uit_oldPwd is null");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdIsNotNull() {
            addCriterion("uit_oldPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdEqualTo(String value) {
            addCriterion("uit_oldPwd =", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdNotEqualTo(String value) {
            addCriterion("uit_oldPwd <>", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdGreaterThan(String value) {
            addCriterion("uit_oldPwd >", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdGreaterThanOrEqualTo(String value) {
            addCriterion("uit_oldPwd >=", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdLessThan(String value) {
            addCriterion("uit_oldPwd <", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdLessThanOrEqualTo(String value) {
            addCriterion("uit_oldPwd <=", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdLike(String value) {
            addCriterion("uit_oldPwd like", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdNotLike(String value) {
            addCriterion("uit_oldPwd not like", value, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdIn(List<String> values) {
            addCriterion("uit_oldPwd in", values, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdNotIn(List<String> values) {
            addCriterion("uit_oldPwd not in", values, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdBetween(String value1, String value2) {
            addCriterion("uit_oldPwd between", value1, value2, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitOldpwdNotBetween(String value1, String value2) {
            addCriterion("uit_oldPwd not between", value1, value2, "uitOldpwd");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipIsNull() {
            addCriterion("uit_lastLoginIp is null");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipIsNotNull() {
            addCriterion("uit_lastLoginIp is not null");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipEqualTo(String value) {
            addCriterion("uit_lastLoginIp =", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipNotEqualTo(String value) {
            addCriterion("uit_lastLoginIp <>", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipGreaterThan(String value) {
            addCriterion("uit_lastLoginIp >", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("uit_lastLoginIp >=", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipLessThan(String value) {
            addCriterion("uit_lastLoginIp <", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipLessThanOrEqualTo(String value) {
            addCriterion("uit_lastLoginIp <=", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipLike(String value) {
            addCriterion("uit_lastLoginIp like", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipNotLike(String value) {
            addCriterion("uit_lastLoginIp not like", value, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipIn(List<String> values) {
            addCriterion("uit_lastLoginIp in", values, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipNotIn(List<String> values) {
            addCriterion("uit_lastLoginIp not in", values, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipBetween(String value1, String value2) {
            addCriterion("uit_lastLoginIp between", value1, value2, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLastloginipNotBetween(String value1, String value2) {
            addCriterion("uit_lastLoginIp not between", value1, value2, "uitLastloginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipIsNull() {
            addCriterion("uit_loginIp is null");
            return (Criteria) this;
        }

        public Criteria andUitLoginipIsNotNull() {
            addCriterion("uit_loginIp is not null");
            return (Criteria) this;
        }

        public Criteria andUitLoginipEqualTo(String value) {
            addCriterion("uit_loginIp =", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipNotEqualTo(String value) {
            addCriterion("uit_loginIp <>", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipGreaterThan(String value) {
            addCriterion("uit_loginIp >", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("uit_loginIp >=", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipLessThan(String value) {
            addCriterion("uit_loginIp <", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipLessThanOrEqualTo(String value) {
            addCriterion("uit_loginIp <=", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipLike(String value) {
            addCriterion("uit_loginIp like", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipNotLike(String value) {
            addCriterion("uit_loginIp not like", value, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipIn(List<String> values) {
            addCriterion("uit_loginIp in", values, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipNotIn(List<String> values) {
            addCriterion("uit_loginIp not in", values, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipBetween(String value1, String value2) {
            addCriterion("uit_loginIp between", value1, value2, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitLoginipNotBetween(String value1, String value2) {
            addCriterion("uit_loginIp not between", value1, value2, "uitLoginip");
            return (Criteria) this;
        }

        public Criteria andUitParam1IsNull() {
            addCriterion("uit_param1 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam1IsNotNull() {
            addCriterion("uit_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam1EqualTo(String value) {
            addCriterion("uit_param1 =", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1NotEqualTo(String value) {
            addCriterion("uit_param1 <>", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1GreaterThan(String value) {
            addCriterion("uit_param1 >", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param1 >=", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1LessThan(String value) {
            addCriterion("uit_param1 <", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1LessThanOrEqualTo(String value) {
            addCriterion("uit_param1 <=", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1Like(String value) {
            addCriterion("uit_param1 like", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1NotLike(String value) {
            addCriterion("uit_param1 not like", value, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1In(List<String> values) {
            addCriterion("uit_param1 in", values, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1NotIn(List<String> values) {
            addCriterion("uit_param1 not in", values, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1Between(String value1, String value2) {
            addCriterion("uit_param1 between", value1, value2, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam1NotBetween(String value1, String value2) {
            addCriterion("uit_param1 not between", value1, value2, "uitParam1");
            return (Criteria) this;
        }

        public Criteria andUitParam2IsNull() {
            addCriterion("uit_param2 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam2IsNotNull() {
            addCriterion("uit_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam2EqualTo(String value) {
            addCriterion("uit_param2 =", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2NotEqualTo(String value) {
            addCriterion("uit_param2 <>", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2GreaterThan(String value) {
            addCriterion("uit_param2 >", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param2 >=", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2LessThan(String value) {
            addCriterion("uit_param2 <", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2LessThanOrEqualTo(String value) {
            addCriterion("uit_param2 <=", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2Like(String value) {
            addCriterion("uit_param2 like", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2NotLike(String value) {
            addCriterion("uit_param2 not like", value, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2In(List<String> values) {
            addCriterion("uit_param2 in", values, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2NotIn(List<String> values) {
            addCriterion("uit_param2 not in", values, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2Between(String value1, String value2) {
            addCriterion("uit_param2 between", value1, value2, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam2NotBetween(String value1, String value2) {
            addCriterion("uit_param2 not between", value1, value2, "uitParam2");
            return (Criteria) this;
        }

        public Criteria andUitParam3IsNull() {
            addCriterion("uit_param3 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam3IsNotNull() {
            addCriterion("uit_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam3EqualTo(String value) {
            addCriterion("uit_param3 =", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3NotEqualTo(String value) {
            addCriterion("uit_param3 <>", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3GreaterThan(String value) {
            addCriterion("uit_param3 >", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param3 >=", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3LessThan(String value) {
            addCriterion("uit_param3 <", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3LessThanOrEqualTo(String value) {
            addCriterion("uit_param3 <=", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3Like(String value) {
            addCriterion("uit_param3 like", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3NotLike(String value) {
            addCriterion("uit_param3 not like", value, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3In(List<String> values) {
            addCriterion("uit_param3 in", values, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3NotIn(List<String> values) {
            addCriterion("uit_param3 not in", values, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3Between(String value1, String value2) {
            addCriterion("uit_param3 between", value1, value2, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam3NotBetween(String value1, String value2) {
            addCriterion("uit_param3 not between", value1, value2, "uitParam3");
            return (Criteria) this;
        }

        public Criteria andUitParam4IsNull() {
            addCriterion("uit_param4 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam4IsNotNull() {
            addCriterion("uit_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam4EqualTo(String value) {
            addCriterion("uit_param4 =", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4NotEqualTo(String value) {
            addCriterion("uit_param4 <>", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4GreaterThan(String value) {
            addCriterion("uit_param4 >", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param4 >=", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4LessThan(String value) {
            addCriterion("uit_param4 <", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4LessThanOrEqualTo(String value) {
            addCriterion("uit_param4 <=", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4Like(String value) {
            addCriterion("uit_param4 like", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4NotLike(String value) {
            addCriterion("uit_param4 not like", value, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4In(List<String> values) {
            addCriterion("uit_param4 in", values, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4NotIn(List<String> values) {
            addCriterion("uit_param4 not in", values, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4Between(String value1, String value2) {
            addCriterion("uit_param4 between", value1, value2, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam4NotBetween(String value1, String value2) {
            addCriterion("uit_param4 not between", value1, value2, "uitParam4");
            return (Criteria) this;
        }

        public Criteria andUitParam5IsNull() {
            addCriterion("uit_param5 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam5IsNotNull() {
            addCriterion("uit_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam5EqualTo(String value) {
            addCriterion("uit_param5 =", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5NotEqualTo(String value) {
            addCriterion("uit_param5 <>", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5GreaterThan(String value) {
            addCriterion("uit_param5 >", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param5 >=", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5LessThan(String value) {
            addCriterion("uit_param5 <", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5LessThanOrEqualTo(String value) {
            addCriterion("uit_param5 <=", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5Like(String value) {
            addCriterion("uit_param5 like", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5NotLike(String value) {
            addCriterion("uit_param5 not like", value, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5In(List<String> values) {
            addCriterion("uit_param5 in", values, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5NotIn(List<String> values) {
            addCriterion("uit_param5 not in", values, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5Between(String value1, String value2) {
            addCriterion("uit_param5 between", value1, value2, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam5NotBetween(String value1, String value2) {
            addCriterion("uit_param5 not between", value1, value2, "uitParam5");
            return (Criteria) this;
        }

        public Criteria andUitParam6IsNull() {
            addCriterion("uit_param6 is null");
            return (Criteria) this;
        }

        public Criteria andUitParam6IsNotNull() {
            addCriterion("uit_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andUitParam6EqualTo(String value) {
            addCriterion("uit_param6 =", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6NotEqualTo(String value) {
            addCriterion("uit_param6 <>", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6GreaterThan(String value) {
            addCriterion("uit_param6 >", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6GreaterThanOrEqualTo(String value) {
            addCriterion("uit_param6 >=", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6LessThan(String value) {
            addCriterion("uit_param6 <", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6LessThanOrEqualTo(String value) {
            addCriterion("uit_param6 <=", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6Like(String value) {
            addCriterion("uit_param6 like", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6NotLike(String value) {
            addCriterion("uit_param6 not like", value, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6In(List<String> values) {
            addCriterion("uit_param6 in", values, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6NotIn(List<String> values) {
            addCriterion("uit_param6 not in", values, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6Between(String value1, String value2) {
            addCriterion("uit_param6 between", value1, value2, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitParam6NotBetween(String value1, String value2) {
            addCriterion("uit_param6 not between", value1, value2, "uitParam6");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeIsNull() {
            addCriterion("uit_created_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeIsNotNull() {
            addCriterion("uit_created_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeEqualTo(Date value) {
            addCriterion("uit_created_datetime =", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("uit_created_datetime <>", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeGreaterThan(Date value) {
            addCriterion("uit_created_datetime >", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uit_created_datetime >=", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeLessThan(Date value) {
            addCriterion("uit_created_datetime <", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("uit_created_datetime <=", value, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeIn(List<Date> values) {
            addCriterion("uit_created_datetime in", values, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("uit_created_datetime not in", values, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("uit_created_datetime between", value1, value2, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("uit_created_datetime not between", value1, value2, "uitCreatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeIsNull() {
            addCriterion("uit_updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeIsNotNull() {
            addCriterion("uit_updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeEqualTo(Date value) {
            addCriterion("uit_updated_datetime =", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeNotEqualTo(Date value) {
            addCriterion("uit_updated_datetime <>", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeGreaterThan(Date value) {
            addCriterion("uit_updated_datetime >", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uit_updated_datetime >=", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeLessThan(Date value) {
            addCriterion("uit_updated_datetime <", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("uit_updated_datetime <=", value, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeIn(List<Date> values) {
            addCriterion("uit_updated_datetime in", values, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeNotIn(List<Date> values) {
            addCriterion("uit_updated_datetime not in", values, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("uit_updated_datetime between", value1, value2, "uitUpdatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUitUpdatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("uit_updated_datetime not between", value1, value2, "uitUpdatedDatetime");
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