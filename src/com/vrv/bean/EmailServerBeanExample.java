package com.vrv.bean;

import java.util.ArrayList;
import java.util.List;

public class EmailServerBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailServerBeanExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIssslIsNull() {
            addCriterion("isSSL is null");
            return (Criteria) this;
        }

        public Criteria andIssslIsNotNull() {
            addCriterion("isSSL is not null");
            return (Criteria) this;
        }

        public Criteria andIssslEqualTo(Integer value) {
            addCriterion("isSSL =", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslNotEqualTo(Integer value) {
            addCriterion("isSSL <>", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslGreaterThan(Integer value) {
            addCriterion("isSSL >", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSSL >=", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslLessThan(Integer value) {
            addCriterion("isSSL <", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslLessThanOrEqualTo(Integer value) {
            addCriterion("isSSL <=", value, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslIn(List<Integer> values) {
            addCriterion("isSSL in", values, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslNotIn(List<Integer> values) {
            addCriterion("isSSL not in", values, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslBetween(Integer value1, Integer value2) {
            addCriterion("isSSL between", value1, value2, "isssl");
            return (Criteria) this;
        }

        public Criteria andIssslNotBetween(Integer value1, Integer value2) {
            addCriterion("isSSL not between", value1, value2, "isssl");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andManagermailIsNull() {
            addCriterion("managerMail is null");
            return (Criteria) this;
        }

        public Criteria andManagermailIsNotNull() {
            addCriterion("managerMail is not null");
            return (Criteria) this;
        }

        public Criteria andManagermailEqualTo(String value) {
            addCriterion("managerMail =", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailNotEqualTo(String value) {
            addCriterion("managerMail <>", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailGreaterThan(String value) {
            addCriterion("managerMail >", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailGreaterThanOrEqualTo(String value) {
            addCriterion("managerMail >=", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailLessThan(String value) {
            addCriterion("managerMail <", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailLessThanOrEqualTo(String value) {
            addCriterion("managerMail <=", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailLike(String value) {
            addCriterion("managerMail like", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailNotLike(String value) {
            addCriterion("managerMail not like", value, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailIn(List<String> values) {
            addCriterion("managerMail in", values, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailNotIn(List<String> values) {
            addCriterion("managerMail not in", values, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailBetween(String value1, String value2) {
            addCriterion("managerMail between", value1, value2, "managermail");
            return (Criteria) this;
        }

        public Criteria andManagermailNotBetween(String value1, String value2) {
            addCriterion("managerMail not between", value1, value2, "managermail");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Integer value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Integer value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Integer value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Integer value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Integer> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Integer> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNull() {
            addCriterion("timeZone is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("timeZone is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("timeZone =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("timeZone <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("timeZone >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("timeZone >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("timeZone <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("timeZone <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("timeZone like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("timeZone not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("timeZone in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("timeZone not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("timeZone between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("timeZone not between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andValidationIsNull() {
            addCriterion("validation is null");
            return (Criteria) this;
        }

        public Criteria andValidationIsNotNull() {
            addCriterion("validation is not null");
            return (Criteria) this;
        }

        public Criteria andValidationEqualTo(String value) {
            addCriterion("validation =", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotEqualTo(String value) {
            addCriterion("validation <>", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationGreaterThan(String value) {
            addCriterion("validation >", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationGreaterThanOrEqualTo(String value) {
            addCriterion("validation >=", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationLessThan(String value) {
            addCriterion("validation <", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationLessThanOrEqualTo(String value) {
            addCriterion("validation <=", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationLike(String value) {
            addCriterion("validation like", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotLike(String value) {
            addCriterion("validation not like", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationIn(List<String> values) {
            addCriterion("validation in", values, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotIn(List<String> values) {
            addCriterion("validation not in", values, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationBetween(String value1, String value2) {
            addCriterion("validation between", value1, value2, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotBetween(String value1, String value2) {
            addCriterion("validation not between", value1, value2, "validation");
            return (Criteria) this;
        }

        public Criteria andDatabasefileIsNull() {
            addCriterion("dataBaseFile is null");
            return (Criteria) this;
        }

        public Criteria andDatabasefileIsNotNull() {
            addCriterion("dataBaseFile is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasefileEqualTo(String value) {
            addCriterion("dataBaseFile =", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileNotEqualTo(String value) {
            addCriterion("dataBaseFile <>", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileGreaterThan(String value) {
            addCriterion("dataBaseFile >", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileGreaterThanOrEqualTo(String value) {
            addCriterion("dataBaseFile >=", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileLessThan(String value) {
            addCriterion("dataBaseFile <", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileLessThanOrEqualTo(String value) {
            addCriterion("dataBaseFile <=", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileLike(String value) {
            addCriterion("dataBaseFile like", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileNotLike(String value) {
            addCriterion("dataBaseFile not like", value, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileIn(List<String> values) {
            addCriterion("dataBaseFile in", values, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileNotIn(List<String> values) {
            addCriterion("dataBaseFile not in", values, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileBetween(String value1, String value2) {
            addCriterion("dataBaseFile between", value1, value2, "databasefile");
            return (Criteria) this;
        }

        public Criteria andDatabasefileNotBetween(String value1, String value2) {
            addCriterion("dataBaseFile not between", value1, value2, "databasefile");
            return (Criteria) this;
        }

        public Criteria andTestmailIsNull() {
            addCriterion("testMail is null");
            return (Criteria) this;
        }

        public Criteria andTestmailIsNotNull() {
            addCriterion("testMail is not null");
            return (Criteria) this;
        }

        public Criteria andTestmailEqualTo(String value) {
            addCriterion("testMail =", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailNotEqualTo(String value) {
            addCriterion("testMail <>", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailGreaterThan(String value) {
            addCriterion("testMail >", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailGreaterThanOrEqualTo(String value) {
            addCriterion("testMail >=", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailLessThan(String value) {
            addCriterion("testMail <", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailLessThanOrEqualTo(String value) {
            addCriterion("testMail <=", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailLike(String value) {
            addCriterion("testMail like", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailNotLike(String value) {
            addCriterion("testMail not like", value, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailIn(List<String> values) {
            addCriterion("testMail in", values, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailNotIn(List<String> values) {
            addCriterion("testMail not in", values, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailBetween(String value1, String value2) {
            addCriterion("testMail between", value1, value2, "testmail");
            return (Criteria) this;
        }

        public Criteria andTestmailNotBetween(String value1, String value2) {
            addCriterion("testMail not between", value1, value2, "testmail");
            return (Criteria) this;
        }

        public Criteria andUserfilepathIsNull() {
            addCriterion("userFilePath is null");
            return (Criteria) this;
        }

        public Criteria andUserfilepathIsNotNull() {
            addCriterion("userFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andUserfilepathEqualTo(String value) {
            addCriterion("userFilePath =", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathNotEqualTo(String value) {
            addCriterion("userFilePath <>", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathGreaterThan(String value) {
            addCriterion("userFilePath >", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("userFilePath >=", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathLessThan(String value) {
            addCriterion("userFilePath <", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathLessThanOrEqualTo(String value) {
            addCriterion("userFilePath <=", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathLike(String value) {
            addCriterion("userFilePath like", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathNotLike(String value) {
            addCriterion("userFilePath not like", value, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathIn(List<String> values) {
            addCriterion("userFilePath in", values, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathNotIn(List<String> values) {
            addCriterion("userFilePath not in", values, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathBetween(String value1, String value2) {
            addCriterion("userFilePath between", value1, value2, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUserfilepathNotBetween(String value1, String value2) {
            addCriterion("userFilePath not between", value1, value2, "userfilepath");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNull() {
            addCriterion("useStatus is null");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNotNull() {
            addCriterion("useStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUsestatusEqualTo(String value) {
            addCriterion("useStatus =", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotEqualTo(String value) {
            addCriterion("useStatus <>", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThan(String value) {
            addCriterion("useStatus >", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThanOrEqualTo(String value) {
            addCriterion("useStatus >=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThan(String value) {
            addCriterion("useStatus <", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThanOrEqualTo(String value) {
            addCriterion("useStatus <=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLike(String value) {
            addCriterion("useStatus like", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotLike(String value) {
            addCriterion("useStatus not like", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusIn(List<String> values) {
            addCriterion("useStatus in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotIn(List<String> values) {
            addCriterion("useStatus not in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusBetween(String value1, String value2) {
            addCriterion("useStatus between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotBetween(String value1, String value2) {
            addCriterion("useStatus not between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andEmailmarkIsNull() {
            addCriterion("emailMark is null");
            return (Criteria) this;
        }

        public Criteria andEmailmarkIsNotNull() {
            addCriterion("emailMark is not null");
            return (Criteria) this;
        }

        public Criteria andEmailmarkEqualTo(String value) {
            addCriterion("emailMark =", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkNotEqualTo(String value) {
            addCriterion("emailMark <>", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkGreaterThan(String value) {
            addCriterion("emailMark >", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkGreaterThanOrEqualTo(String value) {
            addCriterion("emailMark >=", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkLessThan(String value) {
            addCriterion("emailMark <", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkLessThanOrEqualTo(String value) {
            addCriterion("emailMark <=", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkLike(String value) {
            addCriterion("emailMark like", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkNotLike(String value) {
            addCriterion("emailMark not like", value, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkIn(List<String> values) {
            addCriterion("emailMark in", values, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkNotIn(List<String> values) {
            addCriterion("emailMark not in", values, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkBetween(String value1, String value2) {
            addCriterion("emailMark between", value1, value2, "emailmark");
            return (Criteria) this;
        }

        public Criteria andEmailmarkNotBetween(String value1, String value2) {
            addCriterion("emailMark not between", value1, value2, "emailmark");
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