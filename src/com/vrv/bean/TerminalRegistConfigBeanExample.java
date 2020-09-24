package com.vrv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TerminalRegistConfigBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalRegistConfigBeanExample() {
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

        public Criteria andItemfieldIsNull() {
            addCriterion("itemField is null");
            return (Criteria) this;
        }

        public Criteria andItemfieldIsNotNull() {
            addCriterion("itemField is not null");
            return (Criteria) this;
        }

        public Criteria andItemfieldEqualTo(String value) {
            addCriterion("itemField =", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldNotEqualTo(String value) {
            addCriterion("itemField <>", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldGreaterThan(String value) {
            addCriterion("itemField >", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldGreaterThanOrEqualTo(String value) {
            addCriterion("itemField >=", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldLessThan(String value) {
            addCriterion("itemField <", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldLessThanOrEqualTo(String value) {
            addCriterion("itemField <=", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldLike(String value) {
            addCriterion("itemField like", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldNotLike(String value) {
            addCriterion("itemField not like", value, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldIn(List<String> values) {
            addCriterion("itemField in", values, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldNotIn(List<String> values) {
            addCriterion("itemField not in", values, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldBetween(String value1, String value2) {
            addCriterion("itemField between", value1, value2, "itemfield");
            return (Criteria) this;
        }

        public Criteria andItemfieldNotBetween(String value1, String value2) {
            addCriterion("itemField not between", value1, value2, "itemfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldIsNull() {
            addCriterion("dbField is null");
            return (Criteria) this;
        }

        public Criteria andDbfieldIsNotNull() {
            addCriterion("dbField is not null");
            return (Criteria) this;
        }

        public Criteria andDbfieldEqualTo(String value) {
            addCriterion("dbField =", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldNotEqualTo(String value) {
            addCriterion("dbField <>", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldGreaterThan(String value) {
            addCriterion("dbField >", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldGreaterThanOrEqualTo(String value) {
            addCriterion("dbField >=", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldLessThan(String value) {
            addCriterion("dbField <", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldLessThanOrEqualTo(String value) {
            addCriterion("dbField <=", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldLike(String value) {
            addCriterion("dbField like", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldNotLike(String value) {
            addCriterion("dbField not like", value, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldIn(List<String> values) {
            addCriterion("dbField in", values, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldNotIn(List<String> values) {
            addCriterion("dbField not in", values, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldBetween(String value1, String value2) {
            addCriterion("dbField between", value1, value2, "dbfield");
            return (Criteria) this;
        }

        public Criteria andDbfieldNotBetween(String value1, String value2) {
            addCriterion("dbField not between", value1, value2, "dbfield");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNull() {
            addCriterion("isverify is null");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNotNull() {
            addCriterion("isverify is not null");
            return (Criteria) this;
        }

        public Criteria andIsverifyEqualTo(Integer value) {
            addCriterion("isverify =", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotEqualTo(Integer value) {
            addCriterion("isverify <>", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThan(Integer value) {
            addCriterion("isverify >", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isverify >=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThan(Integer value) {
            addCriterion("isverify <", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThanOrEqualTo(Integer value) {
            addCriterion("isverify <=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyIn(List<Integer> values) {
            addCriterion("isverify in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotIn(List<Integer> values) {
            addCriterion("isverify not in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyBetween(Integer value1, Integer value2) {
            addCriterion("isverify between", value1, value2, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotBetween(Integer value1, Integer value2) {
            addCriterion("isverify not between", value1, value2, "isverify");
            return (Criteria) this;
        }

        public Criteria andOnlyselectIsNull() {
            addCriterion("onlySelect is null");
            return (Criteria) this;
        }

        public Criteria andOnlyselectIsNotNull() {
            addCriterion("onlySelect is not null");
            return (Criteria) this;
        }

        public Criteria andOnlyselectEqualTo(Integer value) {
            addCriterion("onlySelect =", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectNotEqualTo(Integer value) {
            addCriterion("onlySelect <>", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectGreaterThan(Integer value) {
            addCriterion("onlySelect >", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlySelect >=", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectLessThan(Integer value) {
            addCriterion("onlySelect <", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectLessThanOrEqualTo(Integer value) {
            addCriterion("onlySelect <=", value, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectIn(List<Integer> values) {
            addCriterion("onlySelect in", values, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectNotIn(List<Integer> values) {
            addCriterion("onlySelect not in", values, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectBetween(Integer value1, Integer value2) {
            addCriterion("onlySelect between", value1, value2, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andOnlyselectNotBetween(Integer value1, Integer value2) {
            addCriterion("onlySelect not between", value1, value2, "onlyselect");
            return (Criteria) this;
        }

        public Criteria andNeedfillIsNull() {
            addCriterion("needFill is null");
            return (Criteria) this;
        }

        public Criteria andNeedfillIsNotNull() {
            addCriterion("needFill is not null");
            return (Criteria) this;
        }

        public Criteria andNeedfillEqualTo(Integer value) {
            addCriterion("needFill =", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillNotEqualTo(Integer value) {
            addCriterion("needFill <>", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillGreaterThan(Integer value) {
            addCriterion("needFill >", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillGreaterThanOrEqualTo(Integer value) {
            addCriterion("needFill >=", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillLessThan(Integer value) {
            addCriterion("needFill <", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillLessThanOrEqualTo(Integer value) {
            addCriterion("needFill <=", value, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillIn(List<Integer> values) {
            addCriterion("needFill in", values, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillNotIn(List<Integer> values) {
            addCriterion("needFill not in", values, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillBetween(Integer value1, Integer value2) {
            addCriterion("needFill between", value1, value2, "needfill");
            return (Criteria) this;
        }

        public Criteria andNeedfillNotBetween(Integer value1, Integer value2) {
            addCriterion("needFill not between", value1, value2, "needfill");
            return (Criteria) this;
        }

        public Criteria andCtrltypeIsNull() {
            addCriterion("ctrlType is null");
            return (Criteria) this;
        }

        public Criteria andCtrltypeIsNotNull() {
            addCriterion("ctrlType is not null");
            return (Criteria) this;
        }

        public Criteria andCtrltypeEqualTo(String value) {
            addCriterion("ctrlType =", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeNotEqualTo(String value) {
            addCriterion("ctrlType <>", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeGreaterThan(String value) {
            addCriterion("ctrlType >", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctrlType >=", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeLessThan(String value) {
            addCriterion("ctrlType <", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeLessThanOrEqualTo(String value) {
            addCriterion("ctrlType <=", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeLike(String value) {
            addCriterion("ctrlType like", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeNotLike(String value) {
            addCriterion("ctrlType not like", value, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeIn(List<String> values) {
            addCriterion("ctrlType in", values, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeNotIn(List<String> values) {
            addCriterion("ctrlType not in", values, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeBetween(String value1, String value2) {
            addCriterion("ctrlType between", value1, value2, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andCtrltypeNotBetween(String value1, String value2) {
            addCriterion("ctrlType not between", value1, value2, "ctrltype");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andFieldcodeIsNull() {
            addCriterion("fieldCode is null");
            return (Criteria) this;
        }

        public Criteria andFieldcodeIsNotNull() {
            addCriterion("fieldCode is not null");
            return (Criteria) this;
        }

        public Criteria andFieldcodeEqualTo(String value) {
            addCriterion("fieldCode =", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeNotEqualTo(String value) {
            addCriterion("fieldCode <>", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeGreaterThan(String value) {
            addCriterion("fieldCode >", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fieldCode >=", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeLessThan(String value) {
            addCriterion("fieldCode <", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeLessThanOrEqualTo(String value) {
            addCriterion("fieldCode <=", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeLike(String value) {
            addCriterion("fieldCode like", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeNotLike(String value) {
            addCriterion("fieldCode not like", value, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeIn(List<String> values) {
            addCriterion("fieldCode in", values, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeNotIn(List<String> values) {
            addCriterion("fieldCode not in", values, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeBetween(String value1, String value2) {
            addCriterion("fieldCode between", value1, value2, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andFieldcodeNotBetween(String value1, String value2) {
            addCriterion("fieldCode not between", value1, value2, "fieldcode");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isshow");
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