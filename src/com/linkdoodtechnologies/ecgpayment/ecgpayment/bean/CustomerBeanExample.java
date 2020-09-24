package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerBeanExample() {
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

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdIsNull() {
            addCriterion("ct_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCtUserIdIsNotNull() {
            addCriterion("ct_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtUserIdEqualTo(String value) {
            addCriterion("ct_user_id =", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdNotEqualTo(String value) {
            addCriterion("ct_user_id <>", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdGreaterThan(String value) {
            addCriterion("ct_user_id >", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ct_user_id >=", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdLessThan(String value) {
            addCriterion("ct_user_id <", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdLessThanOrEqualTo(String value) {
            addCriterion("ct_user_id <=", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdLike(String value) {
            addCriterion("ct_user_id like", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdNotLike(String value) {
            addCriterion("ct_user_id not like", value, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdIn(List<String> values) {
            addCriterion("ct_user_id in", values, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdNotIn(List<String> values) {
            addCriterion("ct_user_id not in", values, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdBetween(String value1, String value2) {
            addCriterion("ct_user_id between", value1, value2, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtUserIdNotBetween(String value1, String value2) {
            addCriterion("ct_user_id not between", value1, value2, "ctUserId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdIsNull() {
            addCriterion("ct_att_id is null");
            return (Criteria) this;
        }

        public Criteria andCtAttIdIsNotNull() {
            addCriterion("ct_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtAttIdEqualTo(String value) {
            addCriterion("ct_att_id =", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdNotEqualTo(String value) {
            addCriterion("ct_att_id <>", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdGreaterThan(String value) {
            addCriterion("ct_att_id >", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("ct_att_id >=", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdLessThan(String value) {
            addCriterion("ct_att_id <", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdLessThanOrEqualTo(String value) {
            addCriterion("ct_att_id <=", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdLike(String value) {
            addCriterion("ct_att_id like", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdNotLike(String value) {
            addCriterion("ct_att_id not like", value, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdIn(List<String> values) {
            addCriterion("ct_att_id in", values, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdNotIn(List<String> values) {
            addCriterion("ct_att_id not in", values, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdBetween(String value1, String value2) {
            addCriterion("ct_att_id between", value1, value2, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtAttIdNotBetween(String value1, String value2) {
            addCriterion("ct_att_id not between", value1, value2, "ctAttId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdIsNull() {
            addCriterion("ct_invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdIsNotNull() {
            addCriterion("ct_invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdEqualTo(String value) {
            addCriterion("ct_invoice_id =", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdNotEqualTo(String value) {
            addCriterion("ct_invoice_id <>", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdGreaterThan(String value) {
            addCriterion("ct_invoice_id >", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("ct_invoice_id >=", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdLessThan(String value) {
            addCriterion("ct_invoice_id <", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("ct_invoice_id <=", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdLike(String value) {
            addCriterion("ct_invoice_id like", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdNotLike(String value) {
            addCriterion("ct_invoice_id not like", value, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdIn(List<String> values) {
            addCriterion("ct_invoice_id in", values, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdNotIn(List<String> values) {
            addCriterion("ct_invoice_id not in", values, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdBetween(String value1, String value2) {
            addCriterion("ct_invoice_id between", value1, value2, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("ct_invoice_id not between", value1, value2, "ctInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIsNull() {
            addCriterion("ct_username is null");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIsNotNull() {
            addCriterion("ct_username is not null");
            return (Criteria) this;
        }

        public Criteria andCtUsernameEqualTo(String value) {
            addCriterion("ct_username =", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotEqualTo(String value) {
            addCriterion("ct_username <>", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameGreaterThan(String value) {
            addCriterion("ct_username >", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ct_username >=", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLessThan(String value) {
            addCriterion("ct_username <", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLessThanOrEqualTo(String value) {
            addCriterion("ct_username <=", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLike(String value) {
            addCriterion("ct_username like", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotLike(String value) {
            addCriterion("ct_username not like", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIn(List<String> values) {
            addCriterion("ct_username in", values, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotIn(List<String> values) {
            addCriterion("ct_username not in", values, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameBetween(String value1, String value2) {
            addCriterion("ct_username between", value1, value2, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotBetween(String value1, String value2) {
            addCriterion("ct_username not between", value1, value2, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtEmailIsNull() {
            addCriterion("ct_email is null");
            return (Criteria) this;
        }

        public Criteria andCtEmailIsNotNull() {
            addCriterion("ct_email is not null");
            return (Criteria) this;
        }

        public Criteria andCtEmailEqualTo(String value) {
            addCriterion("ct_email =", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotEqualTo(String value) {
            addCriterion("ct_email <>", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailGreaterThan(String value) {
            addCriterion("ct_email >", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ct_email >=", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLessThan(String value) {
            addCriterion("ct_email <", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLessThanOrEqualTo(String value) {
            addCriterion("ct_email <=", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLike(String value) {
            addCriterion("ct_email like", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotLike(String value) {
            addCriterion("ct_email not like", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailIn(List<String> values) {
            addCriterion("ct_email in", values, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotIn(List<String> values) {
            addCriterion("ct_email not in", values, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailBetween(String value1, String value2) {
            addCriterion("ct_email between", value1, value2, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotBetween(String value1, String value2) {
            addCriterion("ct_email not between", value1, value2, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtPhoneIsNull() {
            addCriterion("ct_phone is null");
            return (Criteria) this;
        }

        public Criteria andCtPhoneIsNotNull() {
            addCriterion("ct_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCtPhoneEqualTo(String value) {
            addCriterion("ct_phone =", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneNotEqualTo(String value) {
            addCriterion("ct_phone <>", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneGreaterThan(String value) {
            addCriterion("ct_phone >", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ct_phone >=", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneLessThan(String value) {
            addCriterion("ct_phone <", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneLessThanOrEqualTo(String value) {
            addCriterion("ct_phone <=", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneLike(String value) {
            addCriterion("ct_phone like", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneNotLike(String value) {
            addCriterion("ct_phone not like", value, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneIn(List<String> values) {
            addCriterion("ct_phone in", values, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneNotIn(List<String> values) {
            addCriterion("ct_phone not in", values, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneBetween(String value1, String value2) {
            addCriterion("ct_phone between", value1, value2, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtPhoneNotBetween(String value1, String value2) {
            addCriterion("ct_phone not between", value1, value2, "ctPhone");
            return (Criteria) this;
        }

        public Criteria andCtCcNameIsNull() {
            addCriterion("ct_cc_name is null");
            return (Criteria) this;
        }

        public Criteria andCtCcNameIsNotNull() {
            addCriterion("ct_cc_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtCcNameEqualTo(String value) {
            addCriterion("ct_cc_name =", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameNotEqualTo(String value) {
            addCriterion("ct_cc_name <>", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameGreaterThan(String value) {
            addCriterion("ct_cc_name >", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameGreaterThanOrEqualTo(String value) {
            addCriterion("ct_cc_name >=", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameLessThan(String value) {
            addCriterion("ct_cc_name <", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameLessThanOrEqualTo(String value) {
            addCriterion("ct_cc_name <=", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameLike(String value) {
            addCriterion("ct_cc_name like", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameNotLike(String value) {
            addCriterion("ct_cc_name not like", value, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameIn(List<String> values) {
            addCriterion("ct_cc_name in", values, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameNotIn(List<String> values) {
            addCriterion("ct_cc_name not in", values, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameBetween(String value1, String value2) {
            addCriterion("ct_cc_name between", value1, value2, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNameNotBetween(String value1, String value2) {
            addCriterion("ct_cc_name not between", value1, value2, "ctCcName");
            return (Criteria) this;
        }

        public Criteria andCtCcNoIsNull() {
            addCriterion("ct_cc_no is null");
            return (Criteria) this;
        }

        public Criteria andCtCcNoIsNotNull() {
            addCriterion("ct_cc_no is not null");
            return (Criteria) this;
        }

        public Criteria andCtCcNoEqualTo(String value) {
            addCriterion("ct_cc_no =", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoNotEqualTo(String value) {
            addCriterion("ct_cc_no <>", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoGreaterThan(String value) {
            addCriterion("ct_cc_no >", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoGreaterThanOrEqualTo(String value) {
            addCriterion("ct_cc_no >=", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoLessThan(String value) {
            addCriterion("ct_cc_no <", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoLessThanOrEqualTo(String value) {
            addCriterion("ct_cc_no <=", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoLike(String value) {
            addCriterion("ct_cc_no like", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoNotLike(String value) {
            addCriterion("ct_cc_no not like", value, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoIn(List<String> values) {
            addCriterion("ct_cc_no in", values, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoNotIn(List<String> values) {
            addCriterion("ct_cc_no not in", values, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoBetween(String value1, String value2) {
            addCriterion("ct_cc_no between", value1, value2, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtCcNoNotBetween(String value1, String value2) {
            addCriterion("ct_cc_no not between", value1, value2, "ctCcNo");
            return (Criteria) this;
        }

        public Criteria andCtBankIsNull() {
            addCriterion("ct_bank is null");
            return (Criteria) this;
        }

        public Criteria andCtBankIsNotNull() {
            addCriterion("ct_bank is not null");
            return (Criteria) this;
        }

        public Criteria andCtBankEqualTo(String value) {
            addCriterion("ct_bank =", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankNotEqualTo(String value) {
            addCriterion("ct_bank <>", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankGreaterThan(String value) {
            addCriterion("ct_bank >", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankGreaterThanOrEqualTo(String value) {
            addCriterion("ct_bank >=", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankLessThan(String value) {
            addCriterion("ct_bank <", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankLessThanOrEqualTo(String value) {
            addCriterion("ct_bank <=", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankLike(String value) {
            addCriterion("ct_bank like", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankNotLike(String value) {
            addCriterion("ct_bank not like", value, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankIn(List<String> values) {
            addCriterion("ct_bank in", values, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankNotIn(List<String> values) {
            addCriterion("ct_bank not in", values, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankBetween(String value1, String value2) {
            addCriterion("ct_bank between", value1, value2, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtBankNotBetween(String value1, String value2) {
            addCriterion("ct_bank not between", value1, value2, "ctBank");
            return (Criteria) this;
        }

        public Criteria andCtCountryIsNull() {
            addCriterion("ct_country is null");
            return (Criteria) this;
        }

        public Criteria andCtCountryIsNotNull() {
            addCriterion("ct_country is not null");
            return (Criteria) this;
        }

        public Criteria andCtCountryEqualTo(String value) {
            addCriterion("ct_country =", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryNotEqualTo(String value) {
            addCriterion("ct_country <>", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryGreaterThan(String value) {
            addCriterion("ct_country >", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryGreaterThanOrEqualTo(String value) {
            addCriterion("ct_country >=", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryLessThan(String value) {
            addCriterion("ct_country <", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryLessThanOrEqualTo(String value) {
            addCriterion("ct_country <=", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryLike(String value) {
            addCriterion("ct_country like", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryNotLike(String value) {
            addCriterion("ct_country not like", value, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryIn(List<String> values) {
            addCriterion("ct_country in", values, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryNotIn(List<String> values) {
            addCriterion("ct_country not in", values, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryBetween(String value1, String value2) {
            addCriterion("ct_country between", value1, value2, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtCountryNotBetween(String value1, String value2) {
            addCriterion("ct_country not between", value1, value2, "ctCountry");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeIsNull() {
            addCriterion("ct_last_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeIsNotNull() {
            addCriterion("ct_last_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeEqualTo(String value) {
            addCriterion("ct_last_payment_time =", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeNotEqualTo(String value) {
            addCriterion("ct_last_payment_time <>", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeGreaterThan(String value) {
            addCriterion("ct_last_payment_time >", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_last_payment_time >=", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeLessThan(String value) {
            addCriterion("ct_last_payment_time <", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeLessThanOrEqualTo(String value) {
            addCriterion("ct_last_payment_time <=", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeLike(String value) {
            addCriterion("ct_last_payment_time like", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeNotLike(String value) {
            addCriterion("ct_last_payment_time not like", value, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeIn(List<String> values) {
            addCriterion("ct_last_payment_time in", values, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeNotIn(List<String> values) {
            addCriterion("ct_last_payment_time not in", values, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeBetween(String value1, String value2) {
            addCriterion("ct_last_payment_time between", value1, value2, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtLastPaymentTimeNotBetween(String value1, String value2) {
            addCriterion("ct_last_payment_time not between", value1, value2, "ctLastPaymentTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeIsNull() {
            addCriterion("ct_created_time is null");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeIsNotNull() {
            addCriterion("ct_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeEqualTo(String value) {
            addCriterion("ct_created_time =", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeNotEqualTo(String value) {
            addCriterion("ct_created_time <>", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeGreaterThan(String value) {
            addCriterion("ct_created_time >", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_created_time >=", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeLessThan(String value) {
            addCriterion("ct_created_time <", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("ct_created_time <=", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeLike(String value) {
            addCriterion("ct_created_time like", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeNotLike(String value) {
            addCriterion("ct_created_time not like", value, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeIn(List<String> values) {
            addCriterion("ct_created_time in", values, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeNotIn(List<String> values) {
            addCriterion("ct_created_time not in", values, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeBetween(String value1, String value2) {
            addCriterion("ct_created_time between", value1, value2, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("ct_created_time not between", value1, value2, "ctCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeIsNull() {
            addCriterion("ct_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeIsNotNull() {
            addCriterion("ct_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeEqualTo(String value) {
            addCriterion("ct_updated_time =", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeNotEqualTo(String value) {
            addCriterion("ct_updated_time <>", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeGreaterThan(String value) {
            addCriterion("ct_updated_time >", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_updated_time >=", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeLessThan(String value) {
            addCriterion("ct_updated_time <", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeLessThanOrEqualTo(String value) {
            addCriterion("ct_updated_time <=", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeLike(String value) {
            addCriterion("ct_updated_time like", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeNotLike(String value) {
            addCriterion("ct_updated_time not like", value, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeIn(List<String> values) {
            addCriterion("ct_updated_time in", values, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeNotIn(List<String> values) {
            addCriterion("ct_updated_time not in", values, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeBetween(String value1, String value2) {
            addCriterion("ct_updated_time between", value1, value2, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtUpdatedTimeNotBetween(String value1, String value2) {
            addCriterion("ct_updated_time not between", value1, value2, "ctUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNull() {
            addCriterion("ct_status is null");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNotNull() {
            addCriterion("ct_status is not null");
            return (Criteria) this;
        }

        public Criteria andCtStatusEqualTo(Integer value) {
            addCriterion("ct_status =", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotEqualTo(Integer value) {
            addCriterion("ct_status <>", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThan(Integer value) {
            addCriterion("ct_status >", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_status >=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThan(Integer value) {
            addCriterion("ct_status <", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ct_status <=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusIn(List<Integer> values) {
            addCriterion("ct_status in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotIn(List<Integer> values) {
            addCriterion("ct_status not in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusBetween(Integer value1, Integer value2) {
            addCriterion("ct_status between", value1, value2, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_status not between", value1, value2, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNull() {
            addCriterion("ct_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNotNull() {
            addCriterion("ct_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam1EqualTo(String value) {
            addCriterion("ct_param1 =", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotEqualTo(String value) {
            addCriterion("ct_param1 <>", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThan(String value) {
            addCriterion("ct_param1 >", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param1 >=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThan(String value) {
            addCriterion("ct_param1 <", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThanOrEqualTo(String value) {
            addCriterion("ct_param1 <=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Like(String value) {
            addCriterion("ct_param1 like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotLike(String value) {
            addCriterion("ct_param1 not like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1In(List<String> values) {
            addCriterion("ct_param1 in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotIn(List<String> values) {
            addCriterion("ct_param1 not in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Between(String value1, String value2) {
            addCriterion("ct_param1 between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotBetween(String value1, String value2) {
            addCriterion("ct_param1 not between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNull() {
            addCriterion("ct_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNotNull() {
            addCriterion("ct_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam2EqualTo(String value) {
            addCriterion("ct_param2 =", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotEqualTo(String value) {
            addCriterion("ct_param2 <>", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThan(String value) {
            addCriterion("ct_param2 >", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param2 >=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThan(String value) {
            addCriterion("ct_param2 <", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThanOrEqualTo(String value) {
            addCriterion("ct_param2 <=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Like(String value) {
            addCriterion("ct_param2 like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotLike(String value) {
            addCriterion("ct_param2 not like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2In(List<String> values) {
            addCriterion("ct_param2 in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotIn(List<String> values) {
            addCriterion("ct_param2 not in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Between(String value1, String value2) {
            addCriterion("ct_param2 between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotBetween(String value1, String value2) {
            addCriterion("ct_param2 not between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNull() {
            addCriterion("ct_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNotNull() {
            addCriterion("ct_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam3EqualTo(String value) {
            addCriterion("ct_param3 =", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotEqualTo(String value) {
            addCriterion("ct_param3 <>", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThan(String value) {
            addCriterion("ct_param3 >", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param3 >=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThan(String value) {
            addCriterion("ct_param3 <", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThanOrEqualTo(String value) {
            addCriterion("ct_param3 <=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Like(String value) {
            addCriterion("ct_param3 like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotLike(String value) {
            addCriterion("ct_param3 not like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3In(List<String> values) {
            addCriterion("ct_param3 in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotIn(List<String> values) {
            addCriterion("ct_param3 not in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Between(String value1, String value2) {
            addCriterion("ct_param3 between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotBetween(String value1, String value2) {
            addCriterion("ct_param3 not between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNull() {
            addCriterion("ct_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNotNull() {
            addCriterion("ct_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam4EqualTo(String value) {
            addCriterion("ct_param4 =", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotEqualTo(String value) {
            addCriterion("ct_param4 <>", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThan(String value) {
            addCriterion("ct_param4 >", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param4 >=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThan(String value) {
            addCriterion("ct_param4 <", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThanOrEqualTo(String value) {
            addCriterion("ct_param4 <=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Like(String value) {
            addCriterion("ct_param4 like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotLike(String value) {
            addCriterion("ct_param4 not like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4In(List<String> values) {
            addCriterion("ct_param4 in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotIn(List<String> values) {
            addCriterion("ct_param4 not in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Between(String value1, String value2) {
            addCriterion("ct_param4 between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotBetween(String value1, String value2) {
            addCriterion("ct_param4 not between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNull() {
            addCriterion("ct_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNotNull() {
            addCriterion("ct_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam5EqualTo(String value) {
            addCriterion("ct_param5 =", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotEqualTo(String value) {
            addCriterion("ct_param5 <>", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThan(String value) {
            addCriterion("ct_param5 >", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param5 >=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThan(String value) {
            addCriterion("ct_param5 <", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThanOrEqualTo(String value) {
            addCriterion("ct_param5 <=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Like(String value) {
            addCriterion("ct_param5 like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotLike(String value) {
            addCriterion("ct_param5 not like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5In(List<String> values) {
            addCriterion("ct_param5 in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotIn(List<String> values) {
            addCriterion("ct_param5 not in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Between(String value1, String value2) {
            addCriterion("ct_param5 between", value1, value2, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotBetween(String value1, String value2) {
            addCriterion("ct_param5 not between", value1, value2, "ctParam5");
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