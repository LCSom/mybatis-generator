package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.ArrayList;
import java.util.List;

public class InvoiceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceBeanExample() {
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

        public Criteria andItIdIsNull() {
            addCriterion("it_id is null");
            return (Criteria) this;
        }

        public Criteria andItIdIsNotNull() {
            addCriterion("it_id is not null");
            return (Criteria) this;
        }

        public Criteria andItIdEqualTo(Integer value) {
            addCriterion("it_id =", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotEqualTo(Integer value) {
            addCriterion("it_id <>", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThan(Integer value) {
            addCriterion("it_id >", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("it_id >=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThan(Integer value) {
            addCriterion("it_id <", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThanOrEqualTo(Integer value) {
            addCriterion("it_id <=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdIn(List<Integer> values) {
            addCriterion("it_id in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotIn(List<Integer> values) {
            addCriterion("it_id not in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdBetween(Integer value1, Integer value2) {
            addCriterion("it_id between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotBetween(Integer value1, Integer value2) {
            addCriterion("it_id not between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItUtIdIsNull() {
            addCriterion("it_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andItUtIdIsNotNull() {
            addCriterion("it_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andItUtIdEqualTo(Integer value) {
            addCriterion("it_ut_id =", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdNotEqualTo(Integer value) {
            addCriterion("it_ut_id <>", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdGreaterThan(Integer value) {
            addCriterion("it_ut_id >", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("it_ut_id >=", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdLessThan(Integer value) {
            addCriterion("it_ut_id <", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("it_ut_id <=", value, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdIn(List<Integer> values) {
            addCriterion("it_ut_id in", values, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdNotIn(List<Integer> values) {
            addCriterion("it_ut_id not in", values, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdBetween(Integer value1, Integer value2) {
            addCriterion("it_ut_id between", value1, value2, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("it_ut_id not between", value1, value2, "itUtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdIsNull() {
            addCriterion("it_ot_id is null");
            return (Criteria) this;
        }

        public Criteria andItOtIdIsNotNull() {
            addCriterion("it_ot_id is not null");
            return (Criteria) this;
        }

        public Criteria andItOtIdEqualTo(Integer value) {
            addCriterion("it_ot_id =", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdNotEqualTo(Integer value) {
            addCriterion("it_ot_id <>", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdGreaterThan(Integer value) {
            addCriterion("it_ot_id >", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("it_ot_id >=", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdLessThan(Integer value) {
            addCriterion("it_ot_id <", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdLessThanOrEqualTo(Integer value) {
            addCriterion("it_ot_id <=", value, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdIn(List<Integer> values) {
            addCriterion("it_ot_id in", values, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdNotIn(List<Integer> values) {
            addCriterion("it_ot_id not in", values, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdBetween(Integer value1, Integer value2) {
            addCriterion("it_ot_id between", value1, value2, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItOtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("it_ot_id not between", value1, value2, "itOtId");
            return (Criteria) this;
        }

        public Criteria andItNameIsNull() {
            addCriterion("it_name is null");
            return (Criteria) this;
        }

        public Criteria andItNameIsNotNull() {
            addCriterion("it_name is not null");
            return (Criteria) this;
        }

        public Criteria andItNameEqualTo(String value) {
            addCriterion("it_name =", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotEqualTo(String value) {
            addCriterion("it_name <>", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThan(String value) {
            addCriterion("it_name >", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThanOrEqualTo(String value) {
            addCriterion("it_name >=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThan(String value) {
            addCriterion("it_name <", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThanOrEqualTo(String value) {
            addCriterion("it_name <=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLike(String value) {
            addCriterion("it_name like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotLike(String value) {
            addCriterion("it_name not like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameIn(List<String> values) {
            addCriterion("it_name in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotIn(List<String> values) {
            addCriterion("it_name not in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameBetween(String value1, String value2) {
            addCriterion("it_name between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotBetween(String value1, String value2) {
            addCriterion("it_name not between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItAddress1IsNull() {
            addCriterion("it_address1 is null");
            return (Criteria) this;
        }

        public Criteria andItAddress1IsNotNull() {
            addCriterion("it_address1 is not null");
            return (Criteria) this;
        }

        public Criteria andItAddress1EqualTo(String value) {
            addCriterion("it_address1 =", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1NotEqualTo(String value) {
            addCriterion("it_address1 <>", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1GreaterThan(String value) {
            addCriterion("it_address1 >", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("it_address1 >=", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1LessThan(String value) {
            addCriterion("it_address1 <", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1LessThanOrEqualTo(String value) {
            addCriterion("it_address1 <=", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1Like(String value) {
            addCriterion("it_address1 like", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1NotLike(String value) {
            addCriterion("it_address1 not like", value, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1In(List<String> values) {
            addCriterion("it_address1 in", values, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1NotIn(List<String> values) {
            addCriterion("it_address1 not in", values, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1Between(String value1, String value2) {
            addCriterion("it_address1 between", value1, value2, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress1NotBetween(String value1, String value2) {
            addCriterion("it_address1 not between", value1, value2, "itAddress1");
            return (Criteria) this;
        }

        public Criteria andItAddress2IsNull() {
            addCriterion("it_address2 is null");
            return (Criteria) this;
        }

        public Criteria andItAddress2IsNotNull() {
            addCriterion("it_address2 is not null");
            return (Criteria) this;
        }

        public Criteria andItAddress2EqualTo(String value) {
            addCriterion("it_address2 =", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2NotEqualTo(String value) {
            addCriterion("it_address2 <>", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2GreaterThan(String value) {
            addCriterion("it_address2 >", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("it_address2 >=", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2LessThan(String value) {
            addCriterion("it_address2 <", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2LessThanOrEqualTo(String value) {
            addCriterion("it_address2 <=", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2Like(String value) {
            addCriterion("it_address2 like", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2NotLike(String value) {
            addCriterion("it_address2 not like", value, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2In(List<String> values) {
            addCriterion("it_address2 in", values, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2NotIn(List<String> values) {
            addCriterion("it_address2 not in", values, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2Between(String value1, String value2) {
            addCriterion("it_address2 between", value1, value2, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress2NotBetween(String value1, String value2) {
            addCriterion("it_address2 not between", value1, value2, "itAddress2");
            return (Criteria) this;
        }

        public Criteria andItAddress3IsNull() {
            addCriterion("it_address3 is null");
            return (Criteria) this;
        }

        public Criteria andItAddress3IsNotNull() {
            addCriterion("it_address3 is not null");
            return (Criteria) this;
        }

        public Criteria andItAddress3EqualTo(String value) {
            addCriterion("it_address3 =", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3NotEqualTo(String value) {
            addCriterion("it_address3 <>", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3GreaterThan(String value) {
            addCriterion("it_address3 >", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3GreaterThanOrEqualTo(String value) {
            addCriterion("it_address3 >=", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3LessThan(String value) {
            addCriterion("it_address3 <", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3LessThanOrEqualTo(String value) {
            addCriterion("it_address3 <=", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3Like(String value) {
            addCriterion("it_address3 like", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3NotLike(String value) {
            addCriterion("it_address3 not like", value, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3In(List<String> values) {
            addCriterion("it_address3 in", values, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3NotIn(List<String> values) {
            addCriterion("it_address3 not in", values, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3Between(String value1, String value2) {
            addCriterion("it_address3 between", value1, value2, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItAddress3NotBetween(String value1, String value2) {
            addCriterion("it_address3 not between", value1, value2, "itAddress3");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoIsNull() {
            addCriterion("it_phone_no is null");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoIsNotNull() {
            addCriterion("it_phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoEqualTo(String value) {
            addCriterion("it_phone_no =", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoNotEqualTo(String value) {
            addCriterion("it_phone_no <>", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoGreaterThan(String value) {
            addCriterion("it_phone_no >", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("it_phone_no >=", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoLessThan(String value) {
            addCriterion("it_phone_no <", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("it_phone_no <=", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoLike(String value) {
            addCriterion("it_phone_no like", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoNotLike(String value) {
            addCriterion("it_phone_no not like", value, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoIn(List<String> values) {
            addCriterion("it_phone_no in", values, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoNotIn(List<String> values) {
            addCriterion("it_phone_no not in", values, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoBetween(String value1, String value2) {
            addCriterion("it_phone_no between", value1, value2, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItPhoneNoNotBetween(String value1, String value2) {
            addCriterion("it_phone_no not between", value1, value2, "itPhoneNo");
            return (Criteria) this;
        }

        public Criteria andItFaxIsNull() {
            addCriterion("it_fax is null");
            return (Criteria) this;
        }

        public Criteria andItFaxIsNotNull() {
            addCriterion("it_fax is not null");
            return (Criteria) this;
        }

        public Criteria andItFaxEqualTo(String value) {
            addCriterion("it_fax =", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxNotEqualTo(String value) {
            addCriterion("it_fax <>", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxGreaterThan(String value) {
            addCriterion("it_fax >", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxGreaterThanOrEqualTo(String value) {
            addCriterion("it_fax >=", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxLessThan(String value) {
            addCriterion("it_fax <", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxLessThanOrEqualTo(String value) {
            addCriterion("it_fax <=", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxLike(String value) {
            addCriterion("it_fax like", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxNotLike(String value) {
            addCriterion("it_fax not like", value, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxIn(List<String> values) {
            addCriterion("it_fax in", values, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxNotIn(List<String> values) {
            addCriterion("it_fax not in", values, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxBetween(String value1, String value2) {
            addCriterion("it_fax between", value1, value2, "itFax");
            return (Criteria) this;
        }

        public Criteria andItFaxNotBetween(String value1, String value2) {
            addCriterion("it_fax not between", value1, value2, "itFax");
            return (Criteria) this;
        }

        public Criteria andItParam1IsNull() {
            addCriterion("it_param1 is null");
            return (Criteria) this;
        }

        public Criteria andItParam1IsNotNull() {
            addCriterion("it_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam1EqualTo(String value) {
            addCriterion("it_param1 =", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1NotEqualTo(String value) {
            addCriterion("it_param1 <>", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1GreaterThan(String value) {
            addCriterion("it_param1 >", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1GreaterThanOrEqualTo(String value) {
            addCriterion("it_param1 >=", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1LessThan(String value) {
            addCriterion("it_param1 <", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1LessThanOrEqualTo(String value) {
            addCriterion("it_param1 <=", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1Like(String value) {
            addCriterion("it_param1 like", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1NotLike(String value) {
            addCriterion("it_param1 not like", value, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1In(List<String> values) {
            addCriterion("it_param1 in", values, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1NotIn(List<String> values) {
            addCriterion("it_param1 not in", values, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1Between(String value1, String value2) {
            addCriterion("it_param1 between", value1, value2, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam1NotBetween(String value1, String value2) {
            addCriterion("it_param1 not between", value1, value2, "itParam1");
            return (Criteria) this;
        }

        public Criteria andItParam2IsNull() {
            addCriterion("it_param2 is null");
            return (Criteria) this;
        }

        public Criteria andItParam2IsNotNull() {
            addCriterion("it_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam2EqualTo(String value) {
            addCriterion("it_param2 =", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2NotEqualTo(String value) {
            addCriterion("it_param2 <>", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2GreaterThan(String value) {
            addCriterion("it_param2 >", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2GreaterThanOrEqualTo(String value) {
            addCriterion("it_param2 >=", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2LessThan(String value) {
            addCriterion("it_param2 <", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2LessThanOrEqualTo(String value) {
            addCriterion("it_param2 <=", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2Like(String value) {
            addCriterion("it_param2 like", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2NotLike(String value) {
            addCriterion("it_param2 not like", value, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2In(List<String> values) {
            addCriterion("it_param2 in", values, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2NotIn(List<String> values) {
            addCriterion("it_param2 not in", values, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2Between(String value1, String value2) {
            addCriterion("it_param2 between", value1, value2, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam2NotBetween(String value1, String value2) {
            addCriterion("it_param2 not between", value1, value2, "itParam2");
            return (Criteria) this;
        }

        public Criteria andItParam3IsNull() {
            addCriterion("it_param3 is null");
            return (Criteria) this;
        }

        public Criteria andItParam3IsNotNull() {
            addCriterion("it_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam3EqualTo(String value) {
            addCriterion("it_param3 =", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3NotEqualTo(String value) {
            addCriterion("it_param3 <>", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3GreaterThan(String value) {
            addCriterion("it_param3 >", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3GreaterThanOrEqualTo(String value) {
            addCriterion("it_param3 >=", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3LessThan(String value) {
            addCriterion("it_param3 <", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3LessThanOrEqualTo(String value) {
            addCriterion("it_param3 <=", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3Like(String value) {
            addCriterion("it_param3 like", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3NotLike(String value) {
            addCriterion("it_param3 not like", value, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3In(List<String> values) {
            addCriterion("it_param3 in", values, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3NotIn(List<String> values) {
            addCriterion("it_param3 not in", values, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3Between(String value1, String value2) {
            addCriterion("it_param3 between", value1, value2, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam3NotBetween(String value1, String value2) {
            addCriterion("it_param3 not between", value1, value2, "itParam3");
            return (Criteria) this;
        }

        public Criteria andItParam4IsNull() {
            addCriterion("it_param4 is null");
            return (Criteria) this;
        }

        public Criteria andItParam4IsNotNull() {
            addCriterion("it_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam4EqualTo(String value) {
            addCriterion("it_param4 =", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4NotEqualTo(String value) {
            addCriterion("it_param4 <>", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4GreaterThan(String value) {
            addCriterion("it_param4 >", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4GreaterThanOrEqualTo(String value) {
            addCriterion("it_param4 >=", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4LessThan(String value) {
            addCriterion("it_param4 <", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4LessThanOrEqualTo(String value) {
            addCriterion("it_param4 <=", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4Like(String value) {
            addCriterion("it_param4 like", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4NotLike(String value) {
            addCriterion("it_param4 not like", value, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4In(List<String> values) {
            addCriterion("it_param4 in", values, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4NotIn(List<String> values) {
            addCriterion("it_param4 not in", values, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4Between(String value1, String value2) {
            addCriterion("it_param4 between", value1, value2, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam4NotBetween(String value1, String value2) {
            addCriterion("it_param4 not between", value1, value2, "itParam4");
            return (Criteria) this;
        }

        public Criteria andItParam5IsNull() {
            addCriterion("it_param5 is null");
            return (Criteria) this;
        }

        public Criteria andItParam5IsNotNull() {
            addCriterion("it_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam5EqualTo(String value) {
            addCriterion("it_param5 =", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5NotEqualTo(String value) {
            addCriterion("it_param5 <>", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5GreaterThan(String value) {
            addCriterion("it_param5 >", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5GreaterThanOrEqualTo(String value) {
            addCriterion("it_param5 >=", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5LessThan(String value) {
            addCriterion("it_param5 <", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5LessThanOrEqualTo(String value) {
            addCriterion("it_param5 <=", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5Like(String value) {
            addCriterion("it_param5 like", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5NotLike(String value) {
            addCriterion("it_param5 not like", value, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5In(List<String> values) {
            addCriterion("it_param5 in", values, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5NotIn(List<String> values) {
            addCriterion("it_param5 not in", values, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5Between(String value1, String value2) {
            addCriterion("it_param5 between", value1, value2, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam5NotBetween(String value1, String value2) {
            addCriterion("it_param5 not between", value1, value2, "itParam5");
            return (Criteria) this;
        }

        public Criteria andItParam6IsNull() {
            addCriterion("it_param6 is null");
            return (Criteria) this;
        }

        public Criteria andItParam6IsNotNull() {
            addCriterion("it_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andItParam6EqualTo(String value) {
            addCriterion("it_param6 =", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6NotEqualTo(String value) {
            addCriterion("it_param6 <>", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6GreaterThan(String value) {
            addCriterion("it_param6 >", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6GreaterThanOrEqualTo(String value) {
            addCriterion("it_param6 >=", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6LessThan(String value) {
            addCriterion("it_param6 <", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6LessThanOrEqualTo(String value) {
            addCriterion("it_param6 <=", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6Like(String value) {
            addCriterion("it_param6 like", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6NotLike(String value) {
            addCriterion("it_param6 not like", value, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6In(List<String> values) {
            addCriterion("it_param6 in", values, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6NotIn(List<String> values) {
            addCriterion("it_param6 not in", values, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6Between(String value1, String value2) {
            addCriterion("it_param6 between", value1, value2, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItParam6NotBetween(String value1, String value2) {
            addCriterion("it_param6 not between", value1, value2, "itParam6");
            return (Criteria) this;
        }

        public Criteria andItStatusIsNull() {
            addCriterion("it_status is null");
            return (Criteria) this;
        }

        public Criteria andItStatusIsNotNull() {
            addCriterion("it_status is not null");
            return (Criteria) this;
        }

        public Criteria andItStatusEqualTo(Integer value) {
            addCriterion("it_status =", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusNotEqualTo(Integer value) {
            addCriterion("it_status <>", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusGreaterThan(Integer value) {
            addCriterion("it_status >", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("it_status >=", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusLessThan(Integer value) {
            addCriterion("it_status <", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusLessThanOrEqualTo(Integer value) {
            addCriterion("it_status <=", value, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusIn(List<Integer> values) {
            addCriterion("it_status in", values, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusNotIn(List<Integer> values) {
            addCriterion("it_status not in", values, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusBetween(Integer value1, Integer value2) {
            addCriterion("it_status between", value1, value2, "itStatus");
            return (Criteria) this;
        }

        public Criteria andItStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("it_status not between", value1, value2, "itStatus");
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