package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.ArrayList;
import java.util.List;

public class CloudRenewInstanceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloudRenewInstanceBeanExample() {
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

        public Criteria andEcrIdIsNull() {
            addCriterion("ecr_id is null");
            return (Criteria) this;
        }

        public Criteria andEcrIdIsNotNull() {
            addCriterion("ecr_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcrIdEqualTo(Integer value) {
            addCriterion("ecr_id =", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdNotEqualTo(Integer value) {
            addCriterion("ecr_id <>", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdGreaterThan(Integer value) {
            addCriterion("ecr_id >", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecr_id >=", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdLessThan(Integer value) {
            addCriterion("ecr_id <", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecr_id <=", value, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdIn(List<Integer> values) {
            addCriterion("ecr_id in", values, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdNotIn(List<Integer> values) {
            addCriterion("ecr_id not in", values, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdBetween(Integer value1, Integer value2) {
            addCriterion("ecr_id between", value1, value2, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecr_id not between", value1, value2, "ecrId");
            return (Criteria) this;
        }

        public Criteria andEcrOtnIsNull() {
            addCriterion("ecr_otn is null");
            return (Criteria) this;
        }

        public Criteria andEcrOtnIsNotNull() {
            addCriterion("ecr_otn is not null");
            return (Criteria) this;
        }

        public Criteria andEcrOtnEqualTo(String value) {
            addCriterion("ecr_otn =", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnNotEqualTo(String value) {
            addCriterion("ecr_otn <>", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnGreaterThan(String value) {
            addCriterion("ecr_otn >", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_otn >=", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnLessThan(String value) {
            addCriterion("ecr_otn <", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnLessThanOrEqualTo(String value) {
            addCriterion("ecr_otn <=", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnLike(String value) {
            addCriterion("ecr_otn like", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnNotLike(String value) {
            addCriterion("ecr_otn not like", value, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnIn(List<String> values) {
            addCriterion("ecr_otn in", values, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnNotIn(List<String> values) {
            addCriterion("ecr_otn not in", values, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnBetween(String value1, String value2) {
            addCriterion("ecr_otn between", value1, value2, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrOtnNotBetween(String value1, String value2) {
            addCriterion("ecr_otn not between", value1, value2, "ecrOtn");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateIsNull() {
            addCriterion("ecr_renew_start_date is null");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateIsNotNull() {
            addCriterion("ecr_renew_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateEqualTo(String value) {
            addCriterion("ecr_renew_start_date =", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateNotEqualTo(String value) {
            addCriterion("ecr_renew_start_date <>", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateGreaterThan(String value) {
            addCriterion("ecr_renew_start_date >", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_renew_start_date >=", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateNearCurrentDate(String value, int hour) {
            addCriterion("DATE_SUB(ecr_renew_start_date, INTERVAL " + hour + " HOUR) >", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateLessThan(String value) {
            addCriterion("ecr_renew_start_date <", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateLessThanOrEqualTo(String value) {
            addCriterion("ecr_renew_start_date <=", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateLike(String value) {
            addCriterion("ecr_renew_start_date like", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateNotLike(String value) {
            addCriterion("ecr_renew_start_date not like", value, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateIn(List<String> values) {
            addCriterion("ecr_renew_start_date in", values, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateNotIn(List<String> values) {
            addCriterion("ecr_renew_start_date not in", values, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateBetween(String value1, String value2) {
            addCriterion("ecr_renew_start_date between", value1, value2, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewStartDateNotBetween(String value1, String value2) {
            addCriterion("ecr_renew_start_date not between", value1, value2, "ecrRenewStartDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateIsNull() {
            addCriterion("ecr_renew_end_date is null");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateIsNotNull() {
            addCriterion("ecr_renew_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateEqualTo(String value) {
            addCriterion("ecr_renew_end_date =", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateNotEqualTo(String value) {
            addCriterion("ecr_renew_end_date <>", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateGreaterThan(String value) {
            addCriterion("ecr_renew_end_date >", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_renew_end_date >=", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateLessThan(String value) {
            addCriterion("ecr_renew_end_date <", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateLessThanOrEqualTo(String value) {
            addCriterion("ecr_renew_end_date <=", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateLike(String value) {
            addCriterion("ecr_renew_end_date like", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateNotLike(String value) {
            addCriterion("ecr_renew_end_date not like", value, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateIn(List<String> values) {
            addCriterion("ecr_renew_end_date in", values, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateNotIn(List<String> values) {
            addCriterion("ecr_renew_end_date not in", values, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateBetween(String value1, String value2) {
            addCriterion("ecr_renew_end_date between", value1, value2, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrRenewEndDateNotBetween(String value1, String value2) {
            addCriterion("ecr_renew_end_date not between", value1, value2, "ecrRenewEndDate");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumIsNull() {
            addCriterion("ecr_period_num is null");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumIsNotNull() {
            addCriterion("ecr_period_num is not null");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumEqualTo(Integer value) {
            addCriterion("ecr_period_num =", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumNotEqualTo(Integer value) {
            addCriterion("ecr_period_num <>", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumGreaterThan(Integer value) {
            addCriterion("ecr_period_num >", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecr_period_num >=", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumLessThan(Integer value) {
            addCriterion("ecr_period_num <", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumLessThanOrEqualTo(Integer value) {
            addCriterion("ecr_period_num <=", value, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumIn(List<Integer> values) {
            addCriterion("ecr_period_num in", values, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumNotIn(List<Integer> values) {
            addCriterion("ecr_period_num not in", values, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumBetween(Integer value1, Integer value2) {
            addCriterion("ecr_period_num between", value1, value2, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ecr_period_num not between", value1, value2, "ecrPeriodNum");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeIsNull() {
            addCriterion("ecr_period_type is null");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeIsNotNull() {
            addCriterion("ecr_period_type is not null");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeEqualTo(String value) {
            addCriterion("ecr_period_type =", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeNotEqualTo(String value) {
            addCriterion("ecr_period_type <>", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeGreaterThan(String value) {
            addCriterion("ecr_period_type >", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_period_type >=", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeLessThan(String value) {
            addCriterion("ecr_period_type <", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("ecr_period_type <=", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeLike(String value) {
            addCriterion("ecr_period_type like", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeNotLike(String value) {
            addCriterion("ecr_period_type not like", value, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeIn(List<String> values) {
            addCriterion("ecr_period_type in", values, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeNotIn(List<String> values) {
            addCriterion("ecr_period_type not in", values, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeBetween(String value1, String value2) {
            addCriterion("ecr_period_type between", value1, value2, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("ecr_period_type not between", value1, value2, "ecrPeriodType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeIsNull() {
            addCriterion("ecr_cloud_type is null");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeIsNotNull() {
            addCriterion("ecr_cloud_type is not null");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeEqualTo(String value) {
            addCriterion("ecr_cloud_type =", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeNotEqualTo(String value) {
            addCriterion("ecr_cloud_type <>", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeGreaterThan(String value) {
            addCriterion("ecr_cloud_type >", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_cloud_type >=", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeLessThan(String value) {
            addCriterion("ecr_cloud_type <", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeLessThanOrEqualTo(String value) {
            addCriterion("ecr_cloud_type <=", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeLike(String value) {
            addCriterion("ecr_cloud_type like", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeNotLike(String value) {
            addCriterion("ecr_cloud_type not like", value, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeIn(List<String> values) {
            addCriterion("ecr_cloud_type in", values, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeNotIn(List<String> values) {
            addCriterion("ecr_cloud_type not in", values, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeBetween(String value1, String value2) {
            addCriterion("ecr_cloud_type between", value1, value2, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrCloudTypeNotBetween(String value1, String value2) {
            addCriterion("ecr_cloud_type not between", value1, value2, "ecrCloudType");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkIsNull() {
            addCriterion("ecr_remark is null");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkIsNotNull() {
            addCriterion("ecr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkEqualTo(String value) {
            addCriterion("ecr_remark =", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkNotEqualTo(String value) {
            addCriterion("ecr_remark <>", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkGreaterThan(String value) {
            addCriterion("ecr_remark >", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ecr_remark >=", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkLessThan(String value) {
            addCriterion("ecr_remark <", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkLessThanOrEqualTo(String value) {
            addCriterion("ecr_remark <=", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkLike(String value) {
            addCriterion("ecr_remark like", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkNotLike(String value) {
            addCriterion("ecr_remark not like", value, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkIn(List<String> values) {
            addCriterion("ecr_remark in", values, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkNotIn(List<String> values) {
            addCriterion("ecr_remark not in", values, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkBetween(String value1, String value2) {
            addCriterion("ecr_remark between", value1, value2, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrRemarkNotBetween(String value1, String value2) {
            addCriterion("ecr_remark not between", value1, value2, "ecrRemark");
            return (Criteria) this;
        }

        public Criteria andEcrStatusIsNull() {
            addCriterion("ecr_status is null");
            return (Criteria) this;
        }

        public Criteria andEcrStatusIsNotNull() {
            addCriterion("ecr_status is not null");
            return (Criteria) this;
        }

        public Criteria andEcrStatusEqualTo(Integer value) {
            addCriterion("ecr_status =", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusNotEqualTo(Integer value) {
            addCriterion("ecr_status <>", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusGreaterThan(Integer value) {
            addCriterion("ecr_status >", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecr_status >=", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusLessThan(Integer value) {
            addCriterion("ecr_status <", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ecr_status <=", value, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusIn(List<Integer> values) {
            addCriterion("ecr_status in", values, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusNotIn(List<Integer> values) {
            addCriterion("ecr_status not in", values, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusBetween(Integer value1, Integer value2) {
            addCriterion("ecr_status between", value1, value2, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ecr_status not between", value1, value2, "ecrStatus");
            return (Criteria) this;
        }

        public Criteria andEcrParam1IsNull() {
            addCriterion("ecr_param1 is null");
            return (Criteria) this;
        }

        public Criteria andEcrParam1IsNotNull() {
            addCriterion("ecr_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andEcrParam1EqualTo(String value) {
            addCriterion("ecr_param1 =", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1NotEqualTo(String value) {
            addCriterion("ecr_param1 <>", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1GreaterThan(String value) {
            addCriterion("ecr_param1 >", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ecr_param1 >=", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1LessThan(String value) {
            addCriterion("ecr_param1 <", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1LessThanOrEqualTo(String value) {
            addCriterion("ecr_param1 <=", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1Like(String value) {
            addCriterion("ecr_param1 like", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1NotLike(String value) {
            addCriterion("ecr_param1 not like", value, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1In(List<String> values) {
            addCriterion("ecr_param1 in", values, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1NotIn(List<String> values) {
            addCriterion("ecr_param1 not in", values, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1Between(String value1, String value2) {
            addCriterion("ecr_param1 between", value1, value2, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam1NotBetween(String value1, String value2) {
            addCriterion("ecr_param1 not between", value1, value2, "ecrParam1");
            return (Criteria) this;
        }

        public Criteria andEcrParam2IsNull() {
            addCriterion("ecr_param2 is null");
            return (Criteria) this;
        }

        public Criteria andEcrParam2IsNotNull() {
            addCriterion("ecr_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andEcrParam2EqualTo(String value) {
            addCriterion("ecr_param2 =", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2NotEqualTo(String value) {
            addCriterion("ecr_param2 <>", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2GreaterThan(String value) {
            addCriterion("ecr_param2 >", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ecr_param2 >=", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2LessThan(String value) {
            addCriterion("ecr_param2 <", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2LessThanOrEqualTo(String value) {
            addCriterion("ecr_param2 <=", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2Like(String value) {
            addCriterion("ecr_param2 like", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2NotLike(String value) {
            addCriterion("ecr_param2 not like", value, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2In(List<String> values) {
            addCriterion("ecr_param2 in", values, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2NotIn(List<String> values) {
            addCriterion("ecr_param2 not in", values, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2Between(String value1, String value2) {
            addCriterion("ecr_param2 between", value1, value2, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam2NotBetween(String value1, String value2) {
            addCriterion("ecr_param2 not between", value1, value2, "ecrParam2");
            return (Criteria) this;
        }

        public Criteria andEcrParam3IsNull() {
            addCriterion("ecr_param3 is null");
            return (Criteria) this;
        }

        public Criteria andEcrParam3IsNotNull() {
            addCriterion("ecr_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andEcrParam3EqualTo(String value) {
            addCriterion("ecr_param3 =", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3NotEqualTo(String value) {
            addCriterion("ecr_param3 <>", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3GreaterThan(String value) {
            addCriterion("ecr_param3 >", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ecr_param3 >=", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3LessThan(String value) {
            addCriterion("ecr_param3 <", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3LessThanOrEqualTo(String value) {
            addCriterion("ecr_param3 <=", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3Like(String value) {
            addCriterion("ecr_param3 like", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3NotLike(String value) {
            addCriterion("ecr_param3 not like", value, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3In(List<String> values) {
            addCriterion("ecr_param3 in", values, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3NotIn(List<String> values) {
            addCriterion("ecr_param3 not in", values, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3Between(String value1, String value2) {
            addCriterion("ecr_param3 between", value1, value2, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam3NotBetween(String value1, String value2) {
            addCriterion("ecr_param3 not between", value1, value2, "ecrParam3");
            return (Criteria) this;
        }

        public Criteria andEcrParam4IsNull() {
            addCriterion("ecr_param4 is null");
            return (Criteria) this;
        }

        public Criteria andEcrParam4IsNotNull() {
            addCriterion("ecr_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andEcrParam4EqualTo(String value) {
            addCriterion("ecr_param4 =", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4NotEqualTo(String value) {
            addCriterion("ecr_param4 <>", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4GreaterThan(String value) {
            addCriterion("ecr_param4 >", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ecr_param4 >=", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4LessThan(String value) {
            addCriterion("ecr_param4 <", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4LessThanOrEqualTo(String value) {
            addCriterion("ecr_param4 <=", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4Like(String value) {
            addCriterion("ecr_param4 like", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4NotLike(String value) {
            addCriterion("ecr_param4 not like", value, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4In(List<String> values) {
            addCriterion("ecr_param4 in", values, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4NotIn(List<String> values) {
            addCriterion("ecr_param4 not in", values, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4Between(String value1, String value2) {
            addCriterion("ecr_param4 between", value1, value2, "ecrParam4");
            return (Criteria) this;
        }

        public Criteria andEcrParam4NotBetween(String value1, String value2) {
            addCriterion("ecr_param4 not between", value1, value2, "ecrParam4");
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