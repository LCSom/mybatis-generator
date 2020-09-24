package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.ArrayList;
import java.util.List;

public class CloudWatchBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloudWatchBeanExample() {
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

        public Criteria andCwtIdIsNull() {
            addCriterion("cwt_id is null");
            return (Criteria) this;
        }

        public Criteria andCwtIdIsNotNull() {
            addCriterion("cwt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCwtIdEqualTo(Integer value) {
            addCriterion("cwt_id =", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdNotEqualTo(Integer value) {
            addCriterion("cwt_id <>", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdGreaterThan(Integer value) {
            addCriterion("cwt_id >", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cwt_id >=", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdLessThan(Integer value) {
            addCriterion("cwt_id <", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdLessThanOrEqualTo(Integer value) {
            addCriterion("cwt_id <=", value, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdIn(List<Integer> values) {
            addCriterion("cwt_id in", values, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdNotIn(List<Integer> values) {
            addCriterion("cwt_id not in", values, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdBetween(Integer value1, Integer value2) {
            addCriterion("cwt_id between", value1, value2, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cwt_id not between", value1, value2, "cwtId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdIsNull() {
            addCriterion("cwt_cit_id is null");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdIsNotNull() {
            addCriterion("cwt_cit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdEqualTo(Integer value) {
            addCriterion("cwt_cit_id =", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdNotEqualTo(Integer value) {
            addCriterion("cwt_cit_id <>", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdGreaterThan(Integer value) {
            addCriterion("cwt_cit_id >", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cwt_cit_id >=", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdLessThan(Integer value) {
            addCriterion("cwt_cit_id <", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdLessThanOrEqualTo(Integer value) {
            addCriterion("cwt_cit_id <=", value, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdIn(List<Integer> values) {
            addCriterion("cwt_cit_id in", values, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdNotIn(List<Integer> values) {
            addCriterion("cwt_cit_id not in", values, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdBetween(Integer value1, Integer value2) {
            addCriterion("cwt_cit_id between", value1, value2, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cwt_cit_id not between", value1, value2, "cwtCitId");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeIsNull() {
            addCriterion("cwt_cloud_type is null");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeIsNotNull() {
            addCriterion("cwt_cloud_type is not null");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeEqualTo(String value) {
            addCriterion("cwt_cloud_type =", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeNotEqualTo(String value) {
            addCriterion("cwt_cloud_type <>", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeGreaterThan(String value) {
            addCriterion("cwt_cloud_type >", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cwt_cloud_type >=", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeLessThan(String value) {
            addCriterion("cwt_cloud_type <", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeLessThanOrEqualTo(String value) {
            addCriterion("cwt_cloud_type <=", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeLike(String value) {
            addCriterion("cwt_cloud_type like", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeNotLike(String value) {
            addCriterion("cwt_cloud_type not like", value, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeIn(List<String> values) {
            addCriterion("cwt_cloud_type in", values, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeNotIn(List<String> values) {
            addCriterion("cwt_cloud_type not in", values, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeBetween(String value1, String value2) {
            addCriterion("cwt_cloud_type between", value1, value2, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtCloudTypeNotBetween(String value1, String value2) {
            addCriterion("cwt_cloud_type not between", value1, value2, "cwtCloudType");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutIsNull() {
            addCriterion("cwt_total_network_out is null");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutIsNotNull() {
            addCriterion("cwt_total_network_out is not null");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutEqualTo(String value) {
            addCriterion("cwt_total_network_out =", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutNotEqualTo(String value) {
            addCriterion("cwt_total_network_out <>", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutGreaterThan(String value) {
            addCriterion("cwt_total_network_out >", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutGreaterThanOrEqualTo(String value) {
            addCriterion("cwt_total_network_out >=", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutLessThan(String value) {
            addCriterion("cwt_total_network_out <", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutLessThanOrEqualTo(String value) {
            addCriterion("cwt_total_network_out <=", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutLike(String value) {
            addCriterion("cwt_total_network_out like", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutNotLike(String value) {
            addCriterion("cwt_total_network_out not like", value, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutIn(List<String> values) {
            addCriterion("cwt_total_network_out in", values, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutNotIn(List<String> values) {
            addCriterion("cwt_total_network_out not in", values, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutBetween(String value1, String value2) {
            addCriterion("cwt_total_network_out between", value1, value2, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtTotalNetworkOutNotBetween(String value1, String value2) {
            addCriterion("cwt_total_network_out not between", value1, value2, "cwtTotalNetworkOut");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateIsNull() {
            addCriterion("cwt_start_date is null");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateIsNotNull() {
            addCriterion("cwt_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateEqualTo(String value) {
            addCriterion("cwt_start_date =", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateNotEqualTo(String value) {
            addCriterion("cwt_start_date <>", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateGreaterThan(String value) {
            addCriterion("cwt_start_date >", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("cwt_start_date >=", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateLessThan(String value) {
            addCriterion("cwt_start_date <", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateLessThanOrEqualTo(String value) {
            addCriterion("cwt_start_date <=", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateLike(String value) {
            addCriterion("cwt_start_date like", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateNotLike(String value) {
            addCriterion("cwt_start_date not like", value, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateIn(List<String> values) {
            addCriterion("cwt_start_date in", values, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateNotIn(List<String> values) {
            addCriterion("cwt_start_date not in", values, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateBetween(String value1, String value2) {
            addCriterion("cwt_start_date between", value1, value2, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtStartDateNotBetween(String value1, String value2) {
            addCriterion("cwt_start_date not between", value1, value2, "cwtStartDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateIsNull() {
            addCriterion("cwt_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateIsNotNull() {
            addCriterion("cwt_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateEqualTo(String value) {
            addCriterion("cwt_end_date =", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateNotEqualTo(String value) {
            addCriterion("cwt_end_date <>", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateGreaterThan(String value) {
            addCriterion("cwt_end_date >", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("cwt_end_date >=", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateLessThan(String value) {
            addCriterion("cwt_end_date <", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateLessThanOrEqualTo(String value) {
            addCriterion("cwt_end_date <=", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateLike(String value) {
            addCriterion("cwt_end_date like", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateNotLike(String value) {
            addCriterion("cwt_end_date not like", value, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateIn(List<String> values) {
            addCriterion("cwt_end_date in", values, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateNotIn(List<String> values) {
            addCriterion("cwt_end_date not in", values, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateBetween(String value1, String value2) {
            addCriterion("cwt_end_date between", value1, value2, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtEndDateNotBetween(String value1, String value2) {
            addCriterion("cwt_end_date not between", value1, value2, "cwtEndDate");
            return (Criteria) this;
        }

        public Criteria andCwtParam1IsNull() {
            addCriterion("cwt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCwtParam1IsNotNull() {
            addCriterion("cwt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCwtParam1EqualTo(String value) {
            addCriterion("cwt_param1 =", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1NotEqualTo(String value) {
            addCriterion("cwt_param1 <>", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1GreaterThan(String value) {
            addCriterion("cwt_param1 >", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("cwt_param1 >=", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1LessThan(String value) {
            addCriterion("cwt_param1 <", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1LessThanOrEqualTo(String value) {
            addCriterion("cwt_param1 <=", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1Like(String value) {
            addCriterion("cwt_param1 like", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1NotLike(String value) {
            addCriterion("cwt_param1 not like", value, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1In(List<String> values) {
            addCriterion("cwt_param1 in", values, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1NotIn(List<String> values) {
            addCriterion("cwt_param1 not in", values, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1Between(String value1, String value2) {
            addCriterion("cwt_param1 between", value1, value2, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam1NotBetween(String value1, String value2) {
            addCriterion("cwt_param1 not between", value1, value2, "cwtParam1");
            return (Criteria) this;
        }

        public Criteria andCwtParam2IsNull() {
            addCriterion("cwt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCwtParam2IsNotNull() {
            addCriterion("cwt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCwtParam2EqualTo(String value) {
            addCriterion("cwt_param2 =", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2NotEqualTo(String value) {
            addCriterion("cwt_param2 <>", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2GreaterThan(String value) {
            addCriterion("cwt_param2 >", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("cwt_param2 >=", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2LessThan(String value) {
            addCriterion("cwt_param2 <", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2LessThanOrEqualTo(String value) {
            addCriterion("cwt_param2 <=", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2Like(String value) {
            addCriterion("cwt_param2 like", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2NotLike(String value) {
            addCriterion("cwt_param2 not like", value, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2In(List<String> values) {
            addCriterion("cwt_param2 in", values, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2NotIn(List<String> values) {
            addCriterion("cwt_param2 not in", values, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2Between(String value1, String value2) {
            addCriterion("cwt_param2 between", value1, value2, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam2NotBetween(String value1, String value2) {
            addCriterion("cwt_param2 not between", value1, value2, "cwtParam2");
            return (Criteria) this;
        }

        public Criteria andCwtParam3IsNull() {
            addCriterion("cwt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCwtParam3IsNotNull() {
            addCriterion("cwt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCwtParam3EqualTo(String value) {
            addCriterion("cwt_param3 =", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3NotEqualTo(String value) {
            addCriterion("cwt_param3 <>", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3GreaterThan(String value) {
            addCriterion("cwt_param3 >", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("cwt_param3 >=", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3LessThan(String value) {
            addCriterion("cwt_param3 <", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3LessThanOrEqualTo(String value) {
            addCriterion("cwt_param3 <=", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3Like(String value) {
            addCriterion("cwt_param3 like", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3NotLike(String value) {
            addCriterion("cwt_param3 not like", value, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3In(List<String> values) {
            addCriterion("cwt_param3 in", values, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3NotIn(List<String> values) {
            addCriterion("cwt_param3 not in", values, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3Between(String value1, String value2) {
            addCriterion("cwt_param3 between", value1, value2, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam3NotBetween(String value1, String value2) {
            addCriterion("cwt_param3 not between", value1, value2, "cwtParam3");
            return (Criteria) this;
        }

        public Criteria andCwtParam4IsNull() {
            addCriterion("cwt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCwtParam4IsNotNull() {
            addCriterion("cwt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCwtParam4EqualTo(String value) {
            addCriterion("cwt_param4 =", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4NotEqualTo(String value) {
            addCriterion("cwt_param4 <>", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4GreaterThan(String value) {
            addCriterion("cwt_param4 >", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("cwt_param4 >=", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4LessThan(String value) {
            addCriterion("cwt_param4 <", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4LessThanOrEqualTo(String value) {
            addCriterion("cwt_param4 <=", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4Like(String value) {
            addCriterion("cwt_param4 like", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4NotLike(String value) {
            addCriterion("cwt_param4 not like", value, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4In(List<String> values) {
            addCriterion("cwt_param4 in", values, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4NotIn(List<String> values) {
            addCriterion("cwt_param4 not in", values, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4Between(String value1, String value2) {
            addCriterion("cwt_param4 between", value1, value2, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam4NotBetween(String value1, String value2) {
            addCriterion("cwt_param4 not between", value1, value2, "cwtParam4");
            return (Criteria) this;
        }

        public Criteria andCwtParam5IsNull() {
            addCriterion("cwt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCwtParam5IsNotNull() {
            addCriterion("cwt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCwtParam5EqualTo(String value) {
            addCriterion("cwt_param5 =", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5NotEqualTo(String value) {
            addCriterion("cwt_param5 <>", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5GreaterThan(String value) {
            addCriterion("cwt_param5 >", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("cwt_param5 >=", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5LessThan(String value) {
            addCriterion("cwt_param5 <", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5LessThanOrEqualTo(String value) {
            addCriterion("cwt_param5 <=", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5Like(String value) {
            addCriterion("cwt_param5 like", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5NotLike(String value) {
            addCriterion("cwt_param5 not like", value, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5In(List<String> values) {
            addCriterion("cwt_param5 in", values, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5NotIn(List<String> values) {
            addCriterion("cwt_param5 not in", values, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5Between(String value1, String value2) {
            addCriterion("cwt_param5 between", value1, value2, "cwtParam5");
            return (Criteria) this;
        }

        public Criteria andCwtParam5NotBetween(String value1, String value2) {
            addCriterion("cwt_param5 not between", value1, value2, "cwtParam5");
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