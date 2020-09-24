package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class OrgIpRangeBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgIpRangeBeanExample() {
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

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("organizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("organizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("organizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("organizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("organizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("organizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("organizationId like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("organizationId not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("organizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("organizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("organizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("organizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andBeginipIsNull() {
            addCriterion("beginIp is null");
            return (Criteria) this;
        }

        public Criteria andBeginipIsNotNull() {
            addCriterion("beginIp is not null");
            return (Criteria) this;
        }

        public Criteria andBeginipEqualTo(String value) {
            addCriterion("beginIp =", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipNotEqualTo(String value) {
            addCriterion("beginIp <>", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipGreaterThan(String value) {
            addCriterion("beginIp >", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipGreaterThanOrEqualTo(String value) {
            addCriterion("beginIp >=", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipLessThan(String value) {
            addCriterion("beginIp <", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipLessThanOrEqualTo(String value) {
            addCriterion("beginIp <=", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipLike(String value) {
            addCriterion("beginIp like", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipNotLike(String value) {
            addCriterion("beginIp not like", value, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipIn(List<String> values) {
            addCriterion("beginIp in", values, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipNotIn(List<String> values) {
            addCriterion("beginIp not in", values, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipBetween(String value1, String value2) {
            addCriterion("beginIp between", value1, value2, "beginip");
            return (Criteria) this;
        }

        public Criteria andBeginipNotBetween(String value1, String value2) {
            addCriterion("beginIp not between", value1, value2, "beginip");
            return (Criteria) this;
        }

        public Criteria andEndipIsNull() {
            addCriterion("endIp is null");
            return (Criteria) this;
        }

        public Criteria andEndipIsNotNull() {
            addCriterion("endIp is not null");
            return (Criteria) this;
        }

        public Criteria andEndipEqualTo(String value) {
            addCriterion("endIp =", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipNotEqualTo(String value) {
            addCriterion("endIp <>", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipGreaterThan(String value) {
            addCriterion("endIp >", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipGreaterThanOrEqualTo(String value) {
            addCriterion("endIp >=", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipLessThan(String value) {
            addCriterion("endIp <", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipLessThanOrEqualTo(String value) {
            addCriterion("endIp <=", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipLike(String value) {
            addCriterion("endIp like", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipNotLike(String value) {
            addCriterion("endIp not like", value, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipIn(List<String> values) {
            addCriterion("endIp in", values, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipNotIn(List<String> values) {
            addCriterion("endIp not in", values, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipBetween(String value1, String value2) {
            addCriterion("endIp between", value1, value2, "endip");
            return (Criteria) this;
        }

        public Criteria andEndipNotBetween(String value1, String value2) {
            addCriterion("endIp not between", value1, value2, "endip");
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

        public Criteria andBeginipnumberIsNull() {
            addCriterion("beginIpNumber is null");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberIsNotNull() {
            addCriterion("beginIpNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberEqualTo(String value) {
            addCriterion("beginIpNumber =", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberNotEqualTo(String value) {
            addCriterion("beginIpNumber <>", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberGreaterThan(String value) {
            addCriterion("beginIpNumber >", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberGreaterThanOrEqualTo(String value) {
            addCriterion("beginIpNumber >=", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberLessThan(String value) {
            addCriterion("beginIpNumber <", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberLessThanOrEqualTo(String value) {
            addCriterion("beginIpNumber <=", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberLike(String value) {
            addCriterion("beginIpNumber like", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberNotLike(String value) {
            addCriterion("beginIpNumber not like", value, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberIn(List<String> values) {
            addCriterion("beginIpNumber in", values, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberNotIn(List<String> values) {
            addCriterion("beginIpNumber not in", values, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberBetween(String value1, String value2) {
            addCriterion("beginIpNumber between", value1, value2, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andBeginipnumberNotBetween(String value1, String value2) {
            addCriterion("beginIpNumber not between", value1, value2, "beginipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberIsNull() {
            addCriterion("endIpNumber is null");
            return (Criteria) this;
        }

        public Criteria andEndipnumberIsNotNull() {
            addCriterion("endIpNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEndipnumberEqualTo(String value) {
            addCriterion("endIpNumber =", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberNotEqualTo(String value) {
            addCriterion("endIpNumber <>", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberGreaterThan(String value) {
            addCriterion("endIpNumber >", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberGreaterThanOrEqualTo(String value) {
            addCriterion("endIpNumber >=", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberLessThan(String value) {
            addCriterion("endIpNumber <", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberLessThanOrEqualTo(String value) {
            addCriterion("endIpNumber <=", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberLike(String value) {
            addCriterion("endIpNumber like", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberNotLike(String value) {
            addCriterion("endIpNumber not like", value, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberIn(List<String> values) {
            addCriterion("endIpNumber in", values, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberNotIn(List<String> values) {
            addCriterion("endIpNumber not in", values, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberBetween(String value1, String value2) {
            addCriterion("endIpNumber between", value1, value2, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andEndipnumberNotBetween(String value1, String value2) {
            addCriterion("endIpNumber not between", value1, value2, "endipnumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNull() {
            addCriterion("deleteStatus is null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNotNull() {
            addCriterion("deleteStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusEqualTo(Integer value) {
            addCriterion("deleteStatus =", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotEqualTo(Integer value) {
            addCriterion("deleteStatus <>", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThan(Integer value) {
            addCriterion("deleteStatus >", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteStatus >=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThan(Integer value) {
            addCriterion("deleteStatus <", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThanOrEqualTo(Integer value) {
            addCriterion("deleteStatus <=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIn(List<Integer> values) {
            addCriterion("deleteStatus in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotIn(List<Integer> values) {
            addCriterion("deleteStatus not in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusBetween(Integer value1, Integer value2) {
            addCriterion("deleteStatus between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteStatus not between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andIpremarksIsNull() {
            addCriterion("ipRemarks is null");
            return (Criteria) this;
        }

        public Criteria andIpremarksIsNotNull() {
            addCriterion("ipRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andIpremarksEqualTo(String value) {
            addCriterion("ipRemarks =", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksNotEqualTo(String value) {
            addCriterion("ipRemarks <>", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksGreaterThan(String value) {
            addCriterion("ipRemarks >", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksGreaterThanOrEqualTo(String value) {
            addCriterion("ipRemarks >=", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksLessThan(String value) {
            addCriterion("ipRemarks <", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksLessThanOrEqualTo(String value) {
            addCriterion("ipRemarks <=", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksLike(String value) {
            addCriterion("ipRemarks like", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksNotLike(String value) {
            addCriterion("ipRemarks not like", value, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksIn(List<String> values) {
            addCriterion("ipRemarks in", values, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksNotIn(List<String> values) {
            addCriterion("ipRemarks not in", values, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksBetween(String value1, String value2) {
            addCriterion("ipRemarks between", value1, value2, "ipremarks");
            return (Criteria) this;
        }

        public Criteria andIpremarksNotBetween(String value1, String value2) {
            addCriterion("ipRemarks not between", value1, value2, "ipremarks");
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