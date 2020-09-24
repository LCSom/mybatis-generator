package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class PatchResourceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatchResourceBeanExample() {
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

        public Criteria andUpdateidIsNull() {
            addCriterion("updateId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(String value) {
            addCriterion("updateId =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(String value) {
            addCriterion("updateId <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(String value) {
            addCriterion("updateId >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(String value) {
            addCriterion("updateId >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(String value) {
            addCriterion("updateId <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(String value) {
            addCriterion("updateId <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLike(String value) {
            addCriterion("updateId like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotLike(String value) {
            addCriterion("updateId not like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<String> values) {
            addCriterion("updateId in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<String> values) {
            addCriterion("updateId not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(String value1, String value2) {
            addCriterion("updateId between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(String value1, String value2) {
            addCriterion("updateId not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andShownameIsNull() {
            addCriterion("showName is null");
            return (Criteria) this;
        }

        public Criteria andShownameIsNotNull() {
            addCriterion("showName is not null");
            return (Criteria) this;
        }

        public Criteria andShownameEqualTo(String value) {
            addCriterion("showName =", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotEqualTo(String value) {
            addCriterion("showName <>", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThan(String value) {
            addCriterion("showName >", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThanOrEqualTo(String value) {
            addCriterion("showName >=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThan(String value) {
            addCriterion("showName <", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThanOrEqualTo(String value) {
            addCriterion("showName <=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLike(String value) {
            addCriterion("showName like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotLike(String value) {
            addCriterion("showName not like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameIn(List<String> values) {
            addCriterion("showName in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotIn(List<String> values) {
            addCriterion("showName not in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameBetween(String value1, String value2) {
            addCriterion("showName between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotBetween(String value1, String value2) {
            addCriterion("showName not between", value1, value2, "showname");
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

        public Criteria andHoledescriptionIsNull() {
            addCriterion("holeDescription is null");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionIsNotNull() {
            addCriterion("holeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionEqualTo(String value) {
            addCriterion("holeDescription =", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionNotEqualTo(String value) {
            addCriterion("holeDescription <>", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionGreaterThan(String value) {
            addCriterion("holeDescription >", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("holeDescription >=", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionLessThan(String value) {
            addCriterion("holeDescription <", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionLessThanOrEqualTo(String value) {
            addCriterion("holeDescription <=", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionLike(String value) {
            addCriterion("holeDescription like", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionNotLike(String value) {
            addCriterion("holeDescription not like", value, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionIn(List<String> values) {
            addCriterion("holeDescription in", values, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionNotIn(List<String> values) {
            addCriterion("holeDescription not in", values, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionBetween(String value1, String value2) {
            addCriterion("holeDescription between", value1, value2, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoledescriptionNotBetween(String value1, String value2) {
            addCriterion("holeDescription not between", value1, value2, "holedescription");
            return (Criteria) this;
        }

        public Criteria andHoleinfoIsNull() {
            addCriterion("holeInfo is null");
            return (Criteria) this;
        }

        public Criteria andHoleinfoIsNotNull() {
            addCriterion("holeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andHoleinfoEqualTo(String value) {
            addCriterion("holeInfo =", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoNotEqualTo(String value) {
            addCriterion("holeInfo <>", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoGreaterThan(String value) {
            addCriterion("holeInfo >", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoGreaterThanOrEqualTo(String value) {
            addCriterion("holeInfo >=", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoLessThan(String value) {
            addCriterion("holeInfo <", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoLessThanOrEqualTo(String value) {
            addCriterion("holeInfo <=", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoLike(String value) {
            addCriterion("holeInfo like", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoNotLike(String value) {
            addCriterion("holeInfo not like", value, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoIn(List<String> values) {
            addCriterion("holeInfo in", values, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoNotIn(List<String> values) {
            addCriterion("holeInfo not in", values, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoBetween(String value1, String value2) {
            addCriterion("holeInfo between", value1, value2, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andHoleinfoNotBetween(String value1, String value2) {
            addCriterion("holeInfo not between", value1, value2, "holeinfo");
            return (Criteria) this;
        }

        public Criteria andAffectsIsNull() {
            addCriterion("affects is null");
            return (Criteria) this;
        }

        public Criteria andAffectsIsNotNull() {
            addCriterion("affects is not null");
            return (Criteria) this;
        }

        public Criteria andAffectsEqualTo(String value) {
            addCriterion("affects =", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsNotEqualTo(String value) {
            addCriterion("affects <>", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsGreaterThan(String value) {
            addCriterion("affects >", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsGreaterThanOrEqualTo(String value) {
            addCriterion("affects >=", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsLessThan(String value) {
            addCriterion("affects <", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsLessThanOrEqualTo(String value) {
            addCriterion("affects <=", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsLike(String value) {
            addCriterion("affects like", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsNotLike(String value) {
            addCriterion("affects not like", value, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsIn(List<String> values) {
            addCriterion("affects in", values, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsNotIn(List<String> values) {
            addCriterion("affects not in", values, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsBetween(String value1, String value2) {
            addCriterion("affects between", value1, value2, "affects");
            return (Criteria) this;
        }

        public Criteria andAffectsNotBetween(String value1, String value2) {
            addCriterion("affects not between", value1, value2, "affects");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNull() {
            addCriterion("suggestion is null");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNotNull() {
            addCriterion("suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestionEqualTo(String value) {
            addCriterion("suggestion =", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotEqualTo(String value) {
            addCriterion("suggestion <>", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThan(String value) {
            addCriterion("suggestion >", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("suggestion >=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThan(String value) {
            addCriterion("suggestion <", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThanOrEqualTo(String value) {
            addCriterion("suggestion <=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLike(String value) {
            addCriterion("suggestion like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotLike(String value) {
            addCriterion("suggestion not like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionIn(List<String> values) {
            addCriterion("suggestion in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotIn(List<String> values) {
            addCriterion("suggestion not in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionBetween(String value1, String value2) {
            addCriterion("suggestion between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotBetween(String value1, String value2) {
            addCriterion("suggestion not between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPatchsizeIsNull() {
            addCriterion("patchSize is null");
            return (Criteria) this;
        }

        public Criteria andPatchsizeIsNotNull() {
            addCriterion("patchSize is not null");
            return (Criteria) this;
        }

        public Criteria andPatchsizeEqualTo(Long value) {
            addCriterion("patchSize =", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeNotEqualTo(Long value) {
            addCriterion("patchSize <>", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeGreaterThan(Long value) {
            addCriterion("patchSize >", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeGreaterThanOrEqualTo(Long value) {
            addCriterion("patchSize >=", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeLessThan(Long value) {
            addCriterion("patchSize <", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeLessThanOrEqualTo(Long value) {
            addCriterion("patchSize <=", value, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeIn(List<Long> values) {
            addCriterion("patchSize in", values, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeNotIn(List<Long> values) {
            addCriterion("patchSize not in", values, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeBetween(Long value1, Long value2) {
            addCriterion("patchSize between", value1, value2, "patchsize");
            return (Criteria) this;
        }

        public Criteria andPatchsizeNotBetween(Long value1, Long value2) {
            addCriterion("patchSize not between", value1, value2, "patchsize");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNull() {
            addCriterion("CHECKSUM is null");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNotNull() {
            addCriterion("CHECKSUM is not null");
            return (Criteria) this;
        }

        public Criteria andChecksumEqualTo(String value) {
            addCriterion("CHECKSUM =", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotEqualTo(String value) {
            addCriterion("CHECKSUM <>", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThan(String value) {
            addCriterion("CHECKSUM >", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSUM >=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThan(String value) {
            addCriterion("CHECKSUM <", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThanOrEqualTo(String value) {
            addCriterion("CHECKSUM <=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLike(String value) {
            addCriterion("CHECKSUM like", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotLike(String value) {
            addCriterion("CHECKSUM not like", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumIn(List<String> values) {
            addCriterion("CHECKSUM in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotIn(List<String> values) {
            addCriterion("CHECKSUM not in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumBetween(String value1, String value2) {
            addCriterion("CHECKSUM between", value1, value2, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotBetween(String value1, String value2) {
            addCriterion("CHECKSUM not between", value1, value2, "checksum");
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