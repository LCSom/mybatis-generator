package com.linkdoodtechnologies.ecgcloud.ecgcloud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CloudInstanceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloudInstanceBeanExample() {
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

        public Criteria andCitIdIsNull() {
            addCriterion("cit_id is null");
            return (Criteria) this;
        }

        public Criteria andCitIdIsNotNull() {
            addCriterion("cit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitIdEqualTo(Integer value) {
            addCriterion("cit_id =", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdNotEqualTo(Integer value) {
            addCriterion("cit_id <>", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdGreaterThan(Integer value) {
            addCriterion("cit_id >", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cit_id >=", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdLessThan(Integer value) {
            addCriterion("cit_id <", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdLessThanOrEqualTo(Integer value) {
            addCriterion("cit_id <=", value, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdIn(List<Integer> values) {
            addCriterion("cit_id in", values, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdNotIn(List<Integer> values) {
            addCriterion("cit_id not in", values, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdBetween(Integer value1, Integer value2) {
            addCriterion("cit_id between", value1, value2, "citId");
            return (Criteria) this;
        }

        public Criteria andCitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cit_id not between", value1, value2, "citId");
            return (Criteria) this;
        }

        public Criteria andCitOtnIsNull() {
            addCriterion("cit_otn is null");
            return (Criteria) this;
        }

        public Criteria andCitOtnIsNotNull() {
            addCriterion("cit_otn is not null");
            return (Criteria) this;
        }

        public Criteria andCitOtnEqualTo(String value) {
            addCriterion("cit_otn =", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnNotEqualTo(String value) {
            addCriterion("cit_otn <>", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnGreaterThan(String value) {
            addCriterion("cit_otn >", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnGreaterThanOrEqualTo(String value) {
            addCriterion("cit_otn >=", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnLessThan(String value) {
            addCriterion("cit_otn <", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnLessThanOrEqualTo(String value) {
            addCriterion("cit_otn <=", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnLike(String value) {
            addCriterion("cit_otn like", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnNotLike(String value) {
            addCriterion("cit_otn not like", value, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnIn(List<String> values) {
            addCriterion("cit_otn in", values, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnNotIn(List<String> values) {
            addCriterion("cit_otn not in", values, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnBetween(String value1, String value2) {
            addCriterion("cit_otn between", value1, value2, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitOtnNotBetween(String value1, String value2) {
            addCriterion("cit_otn not between", value1, value2, "citOtn");
            return (Criteria) this;
        }

        public Criteria andCitUserIdIsNull() {
            addCriterion("cit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCitUserIdIsNotNull() {
            addCriterion("cit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitUserIdEqualTo(Integer value) {
            addCriterion("cit_user_id =", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdNotEqualTo(Integer value) {
            addCriterion("cit_user_id <>", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdGreaterThan(Integer value) {
            addCriterion("cit_user_id >", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cit_user_id >=", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdLessThan(Integer value) {
            addCriterion("cit_user_id <", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("cit_user_id <=", value, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdIn(List<Integer> values) {
            addCriterion("cit_user_id in", values, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdNotIn(List<Integer> values) {
            addCriterion("cit_user_id not in", values, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdBetween(Integer value1, Integer value2) {
            addCriterion("cit_user_id between", value1, value2, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cit_user_id not between", value1, value2, "citUserId");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpIsNull() {
            addCriterion("cit_public_ip is null");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpIsNotNull() {
            addCriterion("cit_public_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpEqualTo(String value) {
            addCriterion("cit_public_ip =", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpNotEqualTo(String value) {
            addCriterion("cit_public_ip <>", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpGreaterThan(String value) {
            addCriterion("cit_public_ip >", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpGreaterThanOrEqualTo(String value) {
            addCriterion("cit_public_ip >=", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpLessThan(String value) {
            addCriterion("cit_public_ip <", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpLessThanOrEqualTo(String value) {
            addCriterion("cit_public_ip <=", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpLike(String value) {
            addCriterion("cit_public_ip like", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpNotLike(String value) {
            addCriterion("cit_public_ip not like", value, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpIn(List<String> values) {
            addCriterion("cit_public_ip in", values, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpNotIn(List<String> values) {
            addCriterion("cit_public_ip not in", values, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpBetween(String value1, String value2) {
            addCriterion("cit_public_ip between", value1, value2, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitPublicIpNotBetween(String value1, String value2) {
            addCriterion("cit_public_ip not between", value1, value2, "citPublicIp");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdIsNull() {
            addCriterion("cit_srt_id is null");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdIsNotNull() {
            addCriterion("cit_srt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdEqualTo(Integer value) {
            addCriterion("cit_srt_id =", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdNotEqualTo(Integer value) {
            addCriterion("cit_srt_id <>", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdGreaterThan(Integer value) {
            addCriterion("cit_srt_id >", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cit_srt_id >=", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdLessThan(Integer value) {
            addCriterion("cit_srt_id <", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdLessThanOrEqualTo(Integer value) {
            addCriterion("cit_srt_id <=", value, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdIn(List<Integer> values) {
            addCriterion("cit_srt_id in", values, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdNotIn(List<Integer> values) {
            addCriterion("cit_srt_id not in", values, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdBetween(Integer value1, Integer value2) {
            addCriterion("cit_srt_id between", value1, value2, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitSrtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cit_srt_id not between", value1, value2, "citSrtId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdIsNull() {
            addCriterion("cit_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdIsNotNull() {
            addCriterion("cit_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdEqualTo(String value) {
            addCriterion("cit_instance_id =", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdNotEqualTo(String value) {
            addCriterion("cit_instance_id <>", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdGreaterThan(String value) {
            addCriterion("cit_instance_id >", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("cit_instance_id >=", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdLessThan(String value) {
            addCriterion("cit_instance_id <", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("cit_instance_id <=", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdLike(String value) {
            addCriterion("cit_instance_id like", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdNotLike(String value) {
            addCriterion("cit_instance_id not like", value, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdIn(List<String> values) {
            addCriterion("cit_instance_id in", values, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdNotIn(List<String> values) {
            addCriterion("cit_instance_id not in", values, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdBetween(String value1, String value2) {
            addCriterion("cit_instance_id between", value1, value2, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitInstanceIdNotBetween(String value1, String value2) {
            addCriterion("cit_instance_id not between", value1, value2, "citInstanceId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdIsNull() {
            addCriterion("cit_allocation_id is null");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdIsNotNull() {
            addCriterion("cit_allocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdEqualTo(String value) {
            addCriterion("cit_allocation_id =", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdNotEqualTo(String value) {
            addCriterion("cit_allocation_id <>", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdGreaterThan(String value) {
            addCriterion("cit_allocation_id >", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("cit_allocation_id >=", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdLessThan(String value) {
            addCriterion("cit_allocation_id <", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdLessThanOrEqualTo(String value) {
            addCriterion("cit_allocation_id <=", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdLike(String value) {
            addCriterion("cit_allocation_id like", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdNotLike(String value) {
            addCriterion("cit_allocation_id not like", value, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdIn(List<String> values) {
            addCriterion("cit_allocation_id in", values, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdNotIn(List<String> values) {
            addCriterion("cit_allocation_id not in", values, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdBetween(String value1, String value2) {
            addCriterion("cit_allocation_id between", value1, value2, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitAllocationIdNotBetween(String value1, String value2) {
            addCriterion("cit_allocation_id not between", value1, value2, "citAllocationId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdIsNull() {
            addCriterion("cit_record_id is null");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdIsNotNull() {
            addCriterion("cit_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdEqualTo(String value) {
            addCriterion("cit_record_id =", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdNotEqualTo(String value) {
            addCriterion("cit_record_id <>", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdGreaterThan(String value) {
            addCriterion("cit_record_id >", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("cit_record_id >=", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdLessThan(String value) {
            addCriterion("cit_record_id <", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdLessThanOrEqualTo(String value) {
            addCriterion("cit_record_id <=", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdLike(String value) {
            addCriterion("cit_record_id like", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdNotLike(String value) {
            addCriterion("cit_record_id not like", value, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdIn(List<String> values) {
            addCriterion("cit_record_id in", values, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdNotIn(List<String> values) {
            addCriterion("cit_record_id not in", values, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdBetween(String value1, String value2) {
            addCriterion("cit_record_id between", value1, value2, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitRecordIdNotBetween(String value1, String value2) {
            addCriterion("cit_record_id not between", value1, value2, "citRecordId");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameIsNull() {
            addCriterion("cit_ssh_username is null");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameIsNotNull() {
            addCriterion("cit_ssh_username is not null");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameEqualTo(String value) {
            addCriterion("cit_ssh_username =", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameNotEqualTo(String value) {
            addCriterion("cit_ssh_username <>", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameGreaterThan(String value) {
            addCriterion("cit_ssh_username >", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cit_ssh_username >=", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameLessThan(String value) {
            addCriterion("cit_ssh_username <", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameLessThanOrEqualTo(String value) {
            addCriterion("cit_ssh_username <=", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameLike(String value) {
            addCriterion("cit_ssh_username like", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameNotLike(String value) {
            addCriterion("cit_ssh_username not like", value, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameIn(List<String> values) {
            addCriterion("cit_ssh_username in", values, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameNotIn(List<String> values) {
            addCriterion("cit_ssh_username not in", values, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameBetween(String value1, String value2) {
            addCriterion("cit_ssh_username between", value1, value2, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshUsernameNotBetween(String value1, String value2) {
            addCriterion("cit_ssh_username not between", value1, value2, "citSshUsername");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordIsNull() {
            addCriterion("cit_ssh_password is null");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordIsNotNull() {
            addCriterion("cit_ssh_password is not null");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordEqualTo(String value) {
            addCriterion("cit_ssh_password =", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordNotEqualTo(String value) {
            addCriterion("cit_ssh_password <>", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordGreaterThan(String value) {
            addCriterion("cit_ssh_password >", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cit_ssh_password >=", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordLessThan(String value) {
            addCriterion("cit_ssh_password <", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordLessThanOrEqualTo(String value) {
            addCriterion("cit_ssh_password <=", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordLike(String value) {
            addCriterion("cit_ssh_password like", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordNotLike(String value) {
            addCriterion("cit_ssh_password not like", value, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordIn(List<String> values) {
            addCriterion("cit_ssh_password in", values, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordNotIn(List<String> values) {
            addCriterion("cit_ssh_password not in", values, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordBetween(String value1, String value2) {
            addCriterion("cit_ssh_password between", value1, value2, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitSshPasswordNotBetween(String value1, String value2) {
            addCriterion("cit_ssh_password not between", value1, value2, "citSshPassword");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameIsNull() {
            addCriterion("cit_domain_name is null");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameIsNotNull() {
            addCriterion("cit_domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameEqualTo(String value) {
            addCriterion("cit_domain_name =", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameNotEqualTo(String value) {
            addCriterion("cit_domain_name <>", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameGreaterThan(String value) {
            addCriterion("cit_domain_name >", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("cit_domain_name >=", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameLessThan(String value) {
            addCriterion("cit_domain_name <", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameLessThanOrEqualTo(String value) {
            addCriterion("cit_domain_name <=", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameLike(String value) {
            addCriterion("cit_domain_name like", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameNotLike(String value) {
            addCriterion("cit_domain_name not like", value, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameIn(List<String> values) {
            addCriterion("cit_domain_name in", values, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameNotIn(List<String> values) {
            addCriterion("cit_domain_name not in", values, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameBetween(String value1, String value2) {
            addCriterion("cit_domain_name between", value1, value2, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitDomainNameNotBetween(String value1, String value2) {
            addCriterion("cit_domain_name not between", value1, value2, "citDomainName");
            return (Criteria) this;
        }

        public Criteria andCitStatusIsNull() {
            addCriterion("cit_status is null");
            return (Criteria) this;
        }

        public Criteria andCitStatusIsNotNull() {
            addCriterion("cit_status is not null");
            return (Criteria) this;
        }

        public Criteria andCitStatusEqualTo(Boolean value) {
            addCriterion("cit_status =", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusNotEqualTo(Boolean value) {
            addCriterion("cit_status <>", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusGreaterThan(Boolean value) {
            addCriterion("cit_status >", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cit_status >=", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusLessThan(Boolean value) {
            addCriterion("cit_status <", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("cit_status <=", value, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusIn(List<Boolean> values) {
            addCriterion("cit_status in", values, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusNotIn(List<Boolean> values) {
            addCriterion("cit_status not in", values, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("cit_status between", value1, value2, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cit_status not between", value1, value2, "citStatus");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolIsNull() {
            addCriterion("cit_is_pool is null");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolIsNotNull() {
            addCriterion("cit_is_pool is not null");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolEqualTo(Boolean value) {
            addCriterion("cit_is_pool =", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolNotEqualTo(Boolean value) {
            addCriterion("cit_is_pool <>", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolGreaterThan(Boolean value) {
            addCriterion("cit_is_pool >", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cit_is_pool >=", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolLessThan(Boolean value) {
            addCriterion("cit_is_pool <", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolLessThanOrEqualTo(Boolean value) {
            addCriterion("cit_is_pool <=", value, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolIn(List<Boolean> values) {
            addCriterion("cit_is_pool in", values, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolNotIn(List<Boolean> values) {
            addCriterion("cit_is_pool not in", values, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolBetween(Boolean value1, Boolean value2) {
            addCriterion("cit_is_pool between", value1, value2, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitIsPoolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cit_is_pool not between", value1, value2, "citIsPool");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeIsNull() {
            addCriterion("cit_start_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeIsNotNull() {
            addCriterion("cit_start_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeEqualTo(String value) {
            addCriterion("cit_start_datetime =", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeNotEqualTo(String value) {
            addCriterion("cit_start_datetime <>", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeGreaterThan(String value) {
            addCriterion("cit_start_datetime >", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cit_start_datetime >=", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeLessThan(String value) {
            addCriterion("cit_start_datetime <", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeLessThanOrEqualTo(String value) {
            addCriterion("cit_start_datetime <=", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeLike(String value) {
            addCriterion("cit_start_datetime like", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeNotLike(String value) {
            addCriterion("cit_start_datetime not like", value, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeIn(List<String> values) {
            addCriterion("cit_start_datetime in", values, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeNotIn(List<String> values) {
            addCriterion("cit_start_datetime not in", values, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeBetween(String value1, String value2) {
            addCriterion("cit_start_datetime between", value1, value2, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStartDatetimeNotBetween(String value1, String value2) {
            addCriterion("cit_start_datetime not between", value1, value2, "citStartDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeIsNull() {
            addCriterion("cit_end_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeIsNotNull() {
            addCriterion("cit_end_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeEqualTo(String value) {
            addCriterion("cit_end_datetime =", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeNotEqualTo(String value) {
            addCriterion("cit_end_datetime <>", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeGreaterThan(String value) {
            addCriterion("cit_end_datetime >", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cit_end_datetime >=", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeLessThan(String value) {
            addCriterion("cit_end_datetime <", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeLessThanOrEqualTo(String value) {
            addCriterion("cit_end_datetime <=", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeLike(String value) {
            addCriterion("cit_end_datetime like", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeNotLike(String value) {
            addCriterion("cit_end_datetime not like", value, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeIn(List<String> values) {
            addCriterion("cit_end_datetime in", values, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeNotIn(List<String> values) {
            addCriterion("cit_end_datetime not in", values, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeBetween(String value1, String value2) {
            addCriterion("cit_end_datetime between", value1, value2, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitEndDatetimeNotBetween(String value1, String value2) {
            addCriterion("cit_end_datetime not between", value1, value2, "citEndDatetime");
            return (Criteria) this;
        }

        public Criteria andCitProjectIsNull() {
            addCriterion("cit_project is null");
            return (Criteria) this;
        }

        public Criteria andCitProjectIsNotNull() {
            addCriterion("cit_project is not null");
            return (Criteria) this;
        }

        public Criteria andCitProjectEqualTo(String value) {
            addCriterion("cit_project =", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectNotEqualTo(String value) {
            addCriterion("cit_project <>", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectGreaterThan(String value) {
            addCriterion("cit_project >", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectGreaterThanOrEqualTo(String value) {
            addCriterion("cit_project >=", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectLessThan(String value) {
            addCriterion("cit_project <", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectLessThanOrEqualTo(String value) {
            addCriterion("cit_project <=", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectLike(String value) {
            addCriterion("cit_project like", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectNotLike(String value) {
            addCriterion("cit_project not like", value, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectIn(List<String> values) {
            addCriterion("cit_project in", values, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectNotIn(List<String> values) {
            addCriterion("cit_project not in", values, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectBetween(String value1, String value2) {
            addCriterion("cit_project between", value1, value2, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitProjectNotBetween(String value1, String value2) {
            addCriterion("cit_project not between", value1, value2, "citProject");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeIsNull() {
            addCriterion("cit_server_up_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeIsNotNull() {
            addCriterion("cit_server_up_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeEqualTo(String value) {
            addCriterion("cit_server_up_datetime =", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeNotEqualTo(String value) {
            addCriterion("cit_server_up_datetime <>", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeGreaterThan(String value) {
            addCriterion("cit_server_up_datetime >", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cit_server_up_datetime >=", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeLessThan(String value) {
            addCriterion("cit_server_up_datetime <", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeLessThanOrEqualTo(String value) {
            addCriterion("cit_server_up_datetime <=", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeLike(String value) {
            addCriterion("cit_server_up_datetime like", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeNotLike(String value) {
            addCriterion("cit_server_up_datetime not like", value, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeIn(List<String> values) {
            addCriterion("cit_server_up_datetime in", values, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeNotIn(List<String> values) {
            addCriterion("cit_server_up_datetime not in", values, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeBetween(String value1, String value2) {
            addCriterion("cit_server_up_datetime between", value1, value2, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitServerUpDatetimeNotBetween(String value1, String value2) {
            addCriterion("cit_server_up_datetime not between", value1, value2, "citServerUpDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeIsNull() {
            addCriterion("cit_stop_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeIsNotNull() {
            addCriterion("cit_stop_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeEqualTo(Date value) {
            addCriterion("cit_stop_datetime =", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeNotEqualTo(Date value) {
            addCriterion("cit_stop_datetime <>", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeGreaterThan(Date value) {
            addCriterion("cit_stop_datetime >", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cit_stop_datetime >=", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeLessThan(Date value) {
            addCriterion("cit_stop_datetime <", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cit_stop_datetime <=", value, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeIn(List<Date> values) {
            addCriterion("cit_stop_datetime in", values, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeNotIn(List<Date> values) {
            addCriterion("cit_stop_datetime not in", values, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeBetween(Date value1, Date value2) {
            addCriterion("cit_stop_datetime between", value1, value2, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cit_stop_datetime not between", value1, value2, "citStopDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeIsNull() {
            addCriterion("cit_stop_eip_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeIsNotNull() {
            addCriterion("cit_stop_eip_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeEqualTo(Date value) {
            addCriterion("cit_stop_eip_datetime =", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeNotEqualTo(Date value) {
            addCriterion("cit_stop_eip_datetime <>", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeGreaterThan(Date value) {
            addCriterion("cit_stop_eip_datetime >", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cit_stop_eip_datetime >=", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeLessThan(Date value) {
            addCriterion("cit_stop_eip_datetime <", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cit_stop_eip_datetime <=", value, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeIn(List<Date> values) {
            addCriterion("cit_stop_eip_datetime in", values, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeNotIn(List<Date> values) {
            addCriterion("cit_stop_eip_datetime not in", values, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeBetween(Date value1, Date value2) {
            addCriterion("cit_stop_eip_datetime between", value1, value2, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitStopEipDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cit_stop_eip_datetime not between", value1, value2, "citStopEipDatetime");
            return (Criteria) this;
        }

        public Criteria andCitParam1IsNull() {
            addCriterion("cit_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCitParam1IsNotNull() {
            addCriterion("cit_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCitParam1EqualTo(String value) {
            addCriterion("cit_param1 =", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1NotEqualTo(String value) {
            addCriterion("cit_param1 <>", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1GreaterThan(String value) {
            addCriterion("cit_param1 >", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1GreaterThanOrEqualTo(String value) {
            addCriterion("cit_param1 >=", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1LessThan(String value) {
            addCriterion("cit_param1 <", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1LessThanOrEqualTo(String value) {
            addCriterion("cit_param1 <=", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1Like(String value) {
            addCriterion("cit_param1 like", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1NotLike(String value) {
            addCriterion("cit_param1 not like", value, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1In(List<String> values) {
            addCriterion("cit_param1 in", values, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1NotIn(List<String> values) {
            addCriterion("cit_param1 not in", values, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1Between(String value1, String value2) {
            addCriterion("cit_param1 between", value1, value2, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam1NotBetween(String value1, String value2) {
            addCriterion("cit_param1 not between", value1, value2, "citParam1");
            return (Criteria) this;
        }

        public Criteria andCitParam2IsNull() {
            addCriterion("cit_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCitParam2IsNotNull() {
            addCriterion("cit_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCitParam2EqualTo(String value) {
            addCriterion("cit_param2 =", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2NotEqualTo(String value) {
            addCriterion("cit_param2 <>", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2GreaterThan(String value) {
            addCriterion("cit_param2 >", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2GreaterThanOrEqualTo(String value) {
            addCriterion("cit_param2 >=", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2LessThan(String value) {
            addCriterion("cit_param2 <", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2LessThanOrEqualTo(String value) {
            addCriterion("cit_param2 <=", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2Like(String value) {
            addCriterion("cit_param2 like", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2NotLike(String value) {
            addCriterion("cit_param2 not like", value, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2In(List<String> values) {
            addCriterion("cit_param2 in", values, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2NotIn(List<String> values) {
            addCriterion("cit_param2 not in", values, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2Between(String value1, String value2) {
            addCriterion("cit_param2 between", value1, value2, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam2NotBetween(String value1, String value2) {
            addCriterion("cit_param2 not between", value1, value2, "citParam2");
            return (Criteria) this;
        }

        public Criteria andCitParam3IsNull() {
            addCriterion("cit_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCitParam3IsNotNull() {
            addCriterion("cit_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCitParam3EqualTo(String value) {
            addCriterion("cit_param3 =", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3NotEqualTo(String value) {
            addCriterion("cit_param3 <>", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3GreaterThan(String value) {
            addCriterion("cit_param3 >", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3GreaterThanOrEqualTo(String value) {
            addCriterion("cit_param3 >=", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3LessThan(String value) {
            addCriterion("cit_param3 <", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3LessThanOrEqualTo(String value) {
            addCriterion("cit_param3 <=", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3Like(String value) {
            addCriterion("cit_param3 like", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3NotLike(String value) {
            addCriterion("cit_param3 not like", value, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3In(List<String> values) {
            addCriterion("cit_param3 in", values, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3NotIn(List<String> values) {
            addCriterion("cit_param3 not in", values, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3Between(String value1, String value2) {
            addCriterion("cit_param3 between", value1, value2, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam3NotBetween(String value1, String value2) {
            addCriterion("cit_param3 not between", value1, value2, "citParam3");
            return (Criteria) this;
        }

        public Criteria andCitParam4IsNull() {
            addCriterion("cit_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCitParam4IsNotNull() {
            addCriterion("cit_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCitParam4EqualTo(String value) {
            addCriterion("cit_param4 =", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4NotEqualTo(String value) {
            addCriterion("cit_param4 <>", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4GreaterThan(String value) {
            addCriterion("cit_param4 >", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4GreaterThanOrEqualTo(String value) {
            addCriterion("cit_param4 >=", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4LessThan(String value) {
            addCriterion("cit_param4 <", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4LessThanOrEqualTo(String value) {
            addCriterion("cit_param4 <=", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4Like(String value) {
            addCriterion("cit_param4 like", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4NotLike(String value) {
            addCriterion("cit_param4 not like", value, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4In(List<String> values) {
            addCriterion("cit_param4 in", values, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4NotIn(List<String> values) {
            addCriterion("cit_param4 not in", values, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4Between(String value1, String value2) {
            addCriterion("cit_param4 between", value1, value2, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam4NotBetween(String value1, String value2) {
            addCriterion("cit_param4 not between", value1, value2, "citParam4");
            return (Criteria) this;
        }

        public Criteria andCitParam5IsNull() {
            addCriterion("cit_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCitParam5IsNotNull() {
            addCriterion("cit_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCitParam5EqualTo(String value) {
            addCriterion("cit_param5 =", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5NotEqualTo(String value) {
            addCriterion("cit_param5 <>", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5GreaterThan(String value) {
            addCriterion("cit_param5 >", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5GreaterThanOrEqualTo(String value) {
            addCriterion("cit_param5 >=", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5LessThan(String value) {
            addCriterion("cit_param5 <", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5LessThanOrEqualTo(String value) {
            addCriterion("cit_param5 <=", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5Like(String value) {
            addCriterion("cit_param5 like", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5NotLike(String value) {
            addCriterion("cit_param5 not like", value, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5In(List<String> values) {
            addCriterion("cit_param5 in", values, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5NotIn(List<String> values) {
            addCriterion("cit_param5 not in", values, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5Between(String value1, String value2) {
            addCriterion("cit_param5 between", value1, value2, "citParam5");
            return (Criteria) this;
        }

        public Criteria andCitParam5NotBetween(String value1, String value2) {
            addCriterion("cit_param5 not between", value1, value2, "citParam5");
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