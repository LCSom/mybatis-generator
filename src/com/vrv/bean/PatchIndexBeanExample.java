package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatchIndexBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatchIndexBeanExample() {
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
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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

        public Criteria andCrcIsNull() {
            addCriterion("crc is null");
            return (Criteria) this;
        }

        public Criteria andCrcIsNotNull() {
            addCriterion("crc is not null");
            return (Criteria) this;
        }

        public Criteria andCrcEqualTo(String value) {
            addCriterion("crc =", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotEqualTo(String value) {
            addCriterion("crc <>", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcGreaterThan(String value) {
            addCriterion("crc >", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcGreaterThanOrEqualTo(String value) {
            addCriterion("crc >=", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLessThan(String value) {
            addCriterion("crc <", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLessThanOrEqualTo(String value) {
            addCriterion("crc <=", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcLike(String value) {
            addCriterion("crc like", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotLike(String value) {
            addCriterion("crc not like", value, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcIn(List<String> values) {
            addCriterion("crc in", values, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotIn(List<String> values) {
            addCriterion("crc not in", values, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcBetween(String value1, String value2) {
            addCriterion("crc between", value1, value2, "crc");
            return (Criteria) this;
        }

        public Criteria andCrcNotBetween(String value1, String value2) {
            addCriterion("crc not between", value1, value2, "crc");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeIsNull() {
            addCriterion("lastUploadTime is null");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeIsNotNull() {
            addCriterion("lastUploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeEqualTo(Date value) {
            addCriterion("lastUploadTime =", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeNotEqualTo(Date value) {
            addCriterion("lastUploadTime <>", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeGreaterThan(Date value) {
            addCriterion("lastUploadTime >", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUploadTime >=", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeLessThan(Date value) {
            addCriterion("lastUploadTime <", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUploadTime <=", value, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeIn(List<Date> values) {
            addCriterion("lastUploadTime in", values, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeNotIn(List<Date> values) {
            addCriterion("lastUploadTime not in", values, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeBetween(Date value1, Date value2) {
            addCriterion("lastUploadTime between", value1, value2, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andLastuploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUploadTime not between", value1, value2, "lastuploadtime");
            return (Criteria) this;
        }

        public Criteria andFromindexIsNull() {
            addCriterion("fromIndex is null");
            return (Criteria) this;
        }

        public Criteria andFromindexIsNotNull() {
            addCriterion("fromIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFromindexEqualTo(String value) {
            addCriterion("fromIndex =", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotEqualTo(String value) {
            addCriterion("fromIndex <>", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexGreaterThan(String value) {
            addCriterion("fromIndex >", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexGreaterThanOrEqualTo(String value) {
            addCriterion("fromIndex >=", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLessThan(String value) {
            addCriterion("fromIndex <", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLessThanOrEqualTo(String value) {
            addCriterion("fromIndex <=", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexLike(String value) {
            addCriterion("fromIndex like", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotLike(String value) {
            addCriterion("fromIndex not like", value, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexIn(List<String> values) {
            addCriterion("fromIndex in", values, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotIn(List<String> values) {
            addCriterion("fromIndex not in", values, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexBetween(String value1, String value2) {
            addCriterion("fromIndex between", value1, value2, "fromindex");
            return (Criteria) this;
        }

        public Criteria andFromindexNotBetween(String value1, String value2) {
            addCriterion("fromIndex not between", value1, value2, "fromindex");
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