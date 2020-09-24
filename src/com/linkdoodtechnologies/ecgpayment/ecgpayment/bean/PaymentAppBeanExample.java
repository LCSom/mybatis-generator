package com.linkdoodtechnologies.ecgpayment.ecgpayment.bean;

import java.util.ArrayList;
import java.util.List;

public class PaymentAppBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentAppBeanExample() {
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

        public Criteria andPatIdIsNull() {
            addCriterion("pat_id is null");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNotNull() {
            addCriterion("pat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatIdEqualTo(Integer value) {
            addCriterion("pat_id =", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotEqualTo(Integer value) {
            addCriterion("pat_id <>", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThan(Integer value) {
            addCriterion("pat_id >", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pat_id >=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThan(Integer value) {
            addCriterion("pat_id <", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThanOrEqualTo(Integer value) {
            addCriterion("pat_id <=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdIn(List<Integer> values) {
            addCriterion("pat_id in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotIn(List<Integer> values) {
            addCriterion("pat_id not in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdBetween(Integer value1, Integer value2) {
            addCriterion("pat_id between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pat_id not between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdIsNull() {
            addCriterion("pat_att_id is null");
            return (Criteria) this;
        }

        public Criteria andPatAttIdIsNotNull() {
            addCriterion("pat_att_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatAttIdEqualTo(String value) {
            addCriterion("pat_att_id =", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdNotEqualTo(String value) {
            addCriterion("pat_att_id <>", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdGreaterThan(String value) {
            addCriterion("pat_att_id >", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_att_id >=", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdLessThan(String value) {
            addCriterion("pat_att_id <", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdLessThanOrEqualTo(String value) {
            addCriterion("pat_att_id <=", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdLike(String value) {
            addCriterion("pat_att_id like", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdNotLike(String value) {
            addCriterion("pat_att_id not like", value, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdIn(List<String> values) {
            addCriterion("pat_att_id in", values, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdNotIn(List<String> values) {
            addCriterion("pat_att_id not in", values, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdBetween(String value1, String value2) {
            addCriterion("pat_att_id between", value1, value2, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatAttIdNotBetween(String value1, String value2) {
            addCriterion("pat_att_id not between", value1, value2, "patAttId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdIsNull() {
            addCriterion("pat_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPatUserIdIsNotNull() {
            addCriterion("pat_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatUserIdEqualTo(String value) {
            addCriterion("pat_user_id =", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdNotEqualTo(String value) {
            addCriterion("pat_user_id <>", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdGreaterThan(String value) {
            addCriterion("pat_user_id >", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_user_id >=", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdLessThan(String value) {
            addCriterion("pat_user_id <", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdLessThanOrEqualTo(String value) {
            addCriterion("pat_user_id <=", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdLike(String value) {
            addCriterion("pat_user_id like", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdNotLike(String value) {
            addCriterion("pat_user_id not like", value, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdIn(List<String> values) {
            addCriterion("pat_user_id in", values, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdNotIn(List<String> values) {
            addCriterion("pat_user_id not in", values, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdBetween(String value1, String value2) {
            addCriterion("pat_user_id between", value1, value2, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatUserIdNotBetween(String value1, String value2) {
            addCriterion("pat_user_id not between", value1, value2, "patUserId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdIsNull() {
            addCriterion("pat_invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdIsNotNull() {
            addCriterion("pat_invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdEqualTo(String value) {
            addCriterion("pat_invoice_id =", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdNotEqualTo(String value) {
            addCriterion("pat_invoice_id <>", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdGreaterThan(String value) {
            addCriterion("pat_invoice_id >", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_invoice_id >=", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdLessThan(String value) {
            addCriterion("pat_invoice_id <", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("pat_invoice_id <=", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdLike(String value) {
            addCriterion("pat_invoice_id like", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdNotLike(String value) {
            addCriterion("pat_invoice_id not like", value, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdIn(List<String> values) {
            addCriterion("pat_invoice_id in", values, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdNotIn(List<String> values) {
            addCriterion("pat_invoice_id not in", values, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdBetween(String value1, String value2) {
            addCriterion("pat_invoice_id between", value1, value2, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("pat_invoice_id not between", value1, value2, "patInvoiceId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdIsNull() {
            addCriterion("pat_pmt_id is null");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdIsNotNull() {
            addCriterion("pat_pmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdEqualTo(String value) {
            addCriterion("pat_pmt_id =", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdNotEqualTo(String value) {
            addCriterion("pat_pmt_id <>", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdGreaterThan(String value) {
            addCriterion("pat_pmt_id >", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_pmt_id >=", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdLessThan(String value) {
            addCriterion("pat_pmt_id <", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdLessThanOrEqualTo(String value) {
            addCriterion("pat_pmt_id <=", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdLike(String value) {
            addCriterion("pat_pmt_id like", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdNotLike(String value) {
            addCriterion("pat_pmt_id not like", value, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdIn(List<String> values) {
            addCriterion("pat_pmt_id in", values, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdNotIn(List<String> values) {
            addCriterion("pat_pmt_id not in", values, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdBetween(String value1, String value2) {
            addCriterion("pat_pmt_id between", value1, value2, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatPmtIdNotBetween(String value1, String value2) {
            addCriterion("pat_pmt_id not between", value1, value2, "patPmtId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdIsNull() {
            addCriterion("pat_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdIsNotNull() {
            addCriterion("pat_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdEqualTo(String value) {
            addCriterion("pat_order_id =", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdNotEqualTo(String value) {
            addCriterion("pat_order_id <>", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdGreaterThan(String value) {
            addCriterion("pat_order_id >", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_order_id >=", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdLessThan(String value) {
            addCriterion("pat_order_id <", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pat_order_id <=", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdLike(String value) {
            addCriterion("pat_order_id like", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdNotLike(String value) {
            addCriterion("pat_order_id not like", value, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdIn(List<String> values) {
            addCriterion("pat_order_id in", values, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdNotIn(List<String> values) {
            addCriterion("pat_order_id not in", values, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdBetween(String value1, String value2) {
            addCriterion("pat_order_id between", value1, value2, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatOrderIdNotBetween(String value1, String value2) {
            addCriterion("pat_order_id not between", value1, value2, "patOrderId");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodIsNull() {
            addCriterion("pat_payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodIsNotNull() {
            addCriterion("pat_payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodEqualTo(String value) {
            addCriterion("pat_payment_method =", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodNotEqualTo(String value) {
            addCriterion("pat_payment_method <>", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodGreaterThan(String value) {
            addCriterion("pat_payment_method >", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pat_payment_method >=", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodLessThan(String value) {
            addCriterion("pat_payment_method <", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("pat_payment_method <=", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodLike(String value) {
            addCriterion("pat_payment_method like", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodNotLike(String value) {
            addCriterion("pat_payment_method not like", value, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodIn(List<String> values) {
            addCriterion("pat_payment_method in", values, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodNotIn(List<String> values) {
            addCriterion("pat_payment_method not in", values, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodBetween(String value1, String value2) {
            addCriterion("pat_payment_method between", value1, value2, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("pat_payment_method not between", value1, value2, "patPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeIsNull() {
            addCriterion("pat_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeIsNotNull() {
            addCriterion("pat_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeEqualTo(String value) {
            addCriterion("pat_currency_type =", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeNotEqualTo(String value) {
            addCriterion("pat_currency_type <>", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeGreaterThan(String value) {
            addCriterion("pat_currency_type >", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pat_currency_type >=", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeLessThan(String value) {
            addCriterion("pat_currency_type <", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("pat_currency_type <=", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeLike(String value) {
            addCriterion("pat_currency_type like", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeNotLike(String value) {
            addCriterion("pat_currency_type not like", value, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeIn(List<String> values) {
            addCriterion("pat_currency_type in", values, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeNotIn(List<String> values) {
            addCriterion("pat_currency_type not in", values, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeBetween(String value1, String value2) {
            addCriterion("pat_currency_type between", value1, value2, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("pat_currency_type not between", value1, value2, "patCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPatAmountIsNull() {
            addCriterion("pat_amount is null");
            return (Criteria) this;
        }

        public Criteria andPatAmountIsNotNull() {
            addCriterion("pat_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPatAmountEqualTo(String value) {
            addCriterion("pat_amount =", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountNotEqualTo(String value) {
            addCriterion("pat_amount <>", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountGreaterThan(String value) {
            addCriterion("pat_amount >", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountGreaterThanOrEqualTo(String value) {
            addCriterion("pat_amount >=", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountLessThan(String value) {
            addCriterion("pat_amount <", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountLessThanOrEqualTo(String value) {
            addCriterion("pat_amount <=", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountLike(String value) {
            addCriterion("pat_amount like", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountNotLike(String value) {
            addCriterion("pat_amount not like", value, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountIn(List<String> values) {
            addCriterion("pat_amount in", values, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountNotIn(List<String> values) {
            addCriterion("pat_amount not in", values, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountBetween(String value1, String value2) {
            addCriterion("pat_amount between", value1, value2, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatAmountNotBetween(String value1, String value2) {
            addCriterion("pat_amount not between", value1, value2, "patAmount");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionIsNull() {
            addCriterion("pat_description is null");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionIsNotNull() {
            addCriterion("pat_description is not null");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionEqualTo(String value) {
            addCriterion("pat_description =", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionNotEqualTo(String value) {
            addCriterion("pat_description <>", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionGreaterThan(String value) {
            addCriterion("pat_description >", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pat_description >=", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionLessThan(String value) {
            addCriterion("pat_description <", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionLessThanOrEqualTo(String value) {
            addCriterion("pat_description <=", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionLike(String value) {
            addCriterion("pat_description like", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionNotLike(String value) {
            addCriterion("pat_description not like", value, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionIn(List<String> values) {
            addCriterion("pat_description in", values, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionNotIn(List<String> values) {
            addCriterion("pat_description not in", values, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionBetween(String value1, String value2) {
            addCriterion("pat_description between", value1, value2, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatDescriptionNotBetween(String value1, String value2) {
            addCriterion("pat_description not between", value1, value2, "patDescription");
            return (Criteria) this;
        }

        public Criteria andPatStatusIsNull() {
            addCriterion("pat_status is null");
            return (Criteria) this;
        }

        public Criteria andPatStatusIsNotNull() {
            addCriterion("pat_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatStatusEqualTo(String value) {
            addCriterion("pat_status =", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusNotEqualTo(String value) {
            addCriterion("pat_status <>", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusGreaterThan(String value) {
            addCriterion("pat_status >", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pat_status >=", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusLessThan(String value) {
            addCriterion("pat_status <", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusLessThanOrEqualTo(String value) {
            addCriterion("pat_status <=", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusLike(String value) {
            addCriterion("pat_status like", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusNotLike(String value) {
            addCriterion("pat_status not like", value, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusIn(List<String> values) {
            addCriterion("pat_status in", values, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusNotIn(List<String> values) {
            addCriterion("pat_status not in", values, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusBetween(String value1, String value2) {
            addCriterion("pat_status between", value1, value2, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatStatusNotBetween(String value1, String value2) {
            addCriterion("pat_status not between", value1, value2, "patStatus");
            return (Criteria) this;
        }

        public Criteria andPatParam1IsNull() {
            addCriterion("pat_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam1IsNotNull() {
            addCriterion("pat_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam1EqualTo(String value) {
            addCriterion("pat_param1 =", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1NotEqualTo(String value) {
            addCriterion("pat_param1 <>", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1GreaterThan(String value) {
            addCriterion("pat_param1 >", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param1 >=", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1LessThan(String value) {
            addCriterion("pat_param1 <", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1LessThanOrEqualTo(String value) {
            addCriterion("pat_param1 <=", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1Like(String value) {
            addCriterion("pat_param1 like", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1NotLike(String value) {
            addCriterion("pat_param1 not like", value, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1In(List<String> values) {
            addCriterion("pat_param1 in", values, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1NotIn(List<String> values) {
            addCriterion("pat_param1 not in", values, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1Between(String value1, String value2) {
            addCriterion("pat_param1 between", value1, value2, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam1NotBetween(String value1, String value2) {
            addCriterion("pat_param1 not between", value1, value2, "patParam1");
            return (Criteria) this;
        }

        public Criteria andPatParam2IsNull() {
            addCriterion("pat_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam2IsNotNull() {
            addCriterion("pat_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam2EqualTo(String value) {
            addCriterion("pat_param2 =", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2NotEqualTo(String value) {
            addCriterion("pat_param2 <>", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2GreaterThan(String value) {
            addCriterion("pat_param2 >", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param2 >=", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2LessThan(String value) {
            addCriterion("pat_param2 <", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2LessThanOrEqualTo(String value) {
            addCriterion("pat_param2 <=", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2Like(String value) {
            addCriterion("pat_param2 like", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2NotLike(String value) {
            addCriterion("pat_param2 not like", value, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2In(List<String> values) {
            addCriterion("pat_param2 in", values, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2NotIn(List<String> values) {
            addCriterion("pat_param2 not in", values, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2Between(String value1, String value2) {
            addCriterion("pat_param2 between", value1, value2, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam2NotBetween(String value1, String value2) {
            addCriterion("pat_param2 not between", value1, value2, "patParam2");
            return (Criteria) this;
        }

        public Criteria andPatParam3IsNull() {
            addCriterion("pat_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam3IsNotNull() {
            addCriterion("pat_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam3EqualTo(String value) {
            addCriterion("pat_param3 =", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3NotEqualTo(String value) {
            addCriterion("pat_param3 <>", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3GreaterThan(String value) {
            addCriterion("pat_param3 >", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param3 >=", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3LessThan(String value) {
            addCriterion("pat_param3 <", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3LessThanOrEqualTo(String value) {
            addCriterion("pat_param3 <=", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3Like(String value) {
            addCriterion("pat_param3 like", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3NotLike(String value) {
            addCriterion("pat_param3 not like", value, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3In(List<String> values) {
            addCriterion("pat_param3 in", values, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3NotIn(List<String> values) {
            addCriterion("pat_param3 not in", values, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3Between(String value1, String value2) {
            addCriterion("pat_param3 between", value1, value2, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam3NotBetween(String value1, String value2) {
            addCriterion("pat_param3 not between", value1, value2, "patParam3");
            return (Criteria) this;
        }

        public Criteria andPatParam4IsNull() {
            addCriterion("pat_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam4IsNotNull() {
            addCriterion("pat_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam4EqualTo(String value) {
            addCriterion("pat_param4 =", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4NotEqualTo(String value) {
            addCriterion("pat_param4 <>", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4GreaterThan(String value) {
            addCriterion("pat_param4 >", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param4 >=", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4LessThan(String value) {
            addCriterion("pat_param4 <", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4LessThanOrEqualTo(String value) {
            addCriterion("pat_param4 <=", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4Like(String value) {
            addCriterion("pat_param4 like", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4NotLike(String value) {
            addCriterion("pat_param4 not like", value, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4In(List<String> values) {
            addCriterion("pat_param4 in", values, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4NotIn(List<String> values) {
            addCriterion("pat_param4 not in", values, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4Between(String value1, String value2) {
            addCriterion("pat_param4 between", value1, value2, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam4NotBetween(String value1, String value2) {
            addCriterion("pat_param4 not between", value1, value2, "patParam4");
            return (Criteria) this;
        }

        public Criteria andPatParam5IsNull() {
            addCriterion("pat_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam5IsNotNull() {
            addCriterion("pat_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam5EqualTo(String value) {
            addCriterion("pat_param5 =", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5NotEqualTo(String value) {
            addCriterion("pat_param5 <>", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5GreaterThan(String value) {
            addCriterion("pat_param5 >", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param5 >=", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5LessThan(String value) {
            addCriterion("pat_param5 <", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5LessThanOrEqualTo(String value) {
            addCriterion("pat_param5 <=", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5Like(String value) {
            addCriterion("pat_param5 like", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5NotLike(String value) {
            addCriterion("pat_param5 not like", value, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5In(List<String> values) {
            addCriterion("pat_param5 in", values, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5NotIn(List<String> values) {
            addCriterion("pat_param5 not in", values, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5Between(String value1, String value2) {
            addCriterion("pat_param5 between", value1, value2, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam5NotBetween(String value1, String value2) {
            addCriterion("pat_param5 not between", value1, value2, "patParam5");
            return (Criteria) this;
        }

        public Criteria andPatParam6IsNull() {
            addCriterion("pat_param6 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam6IsNotNull() {
            addCriterion("pat_param6 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam6EqualTo(String value) {
            addCriterion("pat_param6 =", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6NotEqualTo(String value) {
            addCriterion("pat_param6 <>", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6GreaterThan(String value) {
            addCriterion("pat_param6 >", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param6 >=", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6LessThan(String value) {
            addCriterion("pat_param6 <", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6LessThanOrEqualTo(String value) {
            addCriterion("pat_param6 <=", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6Like(String value) {
            addCriterion("pat_param6 like", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6NotLike(String value) {
            addCriterion("pat_param6 not like", value, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6In(List<String> values) {
            addCriterion("pat_param6 in", values, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6NotIn(List<String> values) {
            addCriterion("pat_param6 not in", values, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6Between(String value1, String value2) {
            addCriterion("pat_param6 between", value1, value2, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam6NotBetween(String value1, String value2) {
            addCriterion("pat_param6 not between", value1, value2, "patParam6");
            return (Criteria) this;
        }

        public Criteria andPatParam7IsNull() {
            addCriterion("pat_param7 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam7IsNotNull() {
            addCriterion("pat_param7 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam7EqualTo(String value) {
            addCriterion("pat_param7 =", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7NotEqualTo(String value) {
            addCriterion("pat_param7 <>", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7GreaterThan(String value) {
            addCriterion("pat_param7 >", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param7 >=", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7LessThan(String value) {
            addCriterion("pat_param7 <", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7LessThanOrEqualTo(String value) {
            addCriterion("pat_param7 <=", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7Like(String value) {
            addCriterion("pat_param7 like", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7NotLike(String value) {
            addCriterion("pat_param7 not like", value, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7In(List<String> values) {
            addCriterion("pat_param7 in", values, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7NotIn(List<String> values) {
            addCriterion("pat_param7 not in", values, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7Between(String value1, String value2) {
            addCriterion("pat_param7 between", value1, value2, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam7NotBetween(String value1, String value2) {
            addCriterion("pat_param7 not between", value1, value2, "patParam7");
            return (Criteria) this;
        }

        public Criteria andPatParam8IsNull() {
            addCriterion("pat_param8 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam8IsNotNull() {
            addCriterion("pat_param8 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam8EqualTo(String value) {
            addCriterion("pat_param8 =", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8NotEqualTo(String value) {
            addCriterion("pat_param8 <>", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8GreaterThan(String value) {
            addCriterion("pat_param8 >", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param8 >=", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8LessThan(String value) {
            addCriterion("pat_param8 <", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8LessThanOrEqualTo(String value) {
            addCriterion("pat_param8 <=", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8Like(String value) {
            addCriterion("pat_param8 like", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8NotLike(String value) {
            addCriterion("pat_param8 not like", value, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8In(List<String> values) {
            addCriterion("pat_param8 in", values, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8NotIn(List<String> values) {
            addCriterion("pat_param8 not in", values, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8Between(String value1, String value2) {
            addCriterion("pat_param8 between", value1, value2, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam8NotBetween(String value1, String value2) {
            addCriterion("pat_param8 not between", value1, value2, "patParam8");
            return (Criteria) this;
        }

        public Criteria andPatParam9IsNull() {
            addCriterion("pat_param9 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam9IsNotNull() {
            addCriterion("pat_param9 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam9EqualTo(String value) {
            addCriterion("pat_param9 =", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9NotEqualTo(String value) {
            addCriterion("pat_param9 <>", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9GreaterThan(String value) {
            addCriterion("pat_param9 >", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param9 >=", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9LessThan(String value) {
            addCriterion("pat_param9 <", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9LessThanOrEqualTo(String value) {
            addCriterion("pat_param9 <=", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9Like(String value) {
            addCriterion("pat_param9 like", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9NotLike(String value) {
            addCriterion("pat_param9 not like", value, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9In(List<String> values) {
            addCriterion("pat_param9 in", values, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9NotIn(List<String> values) {
            addCriterion("pat_param9 not in", values, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9Between(String value1, String value2) {
            addCriterion("pat_param9 between", value1, value2, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam9NotBetween(String value1, String value2) {
            addCriterion("pat_param9 not between", value1, value2, "patParam9");
            return (Criteria) this;
        }

        public Criteria andPatParam10IsNull() {
            addCriterion("pat_param10 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam10IsNotNull() {
            addCriterion("pat_param10 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam10EqualTo(String value) {
            addCriterion("pat_param10 =", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10NotEqualTo(String value) {
            addCriterion("pat_param10 <>", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10GreaterThan(String value) {
            addCriterion("pat_param10 >", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param10 >=", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10LessThan(String value) {
            addCriterion("pat_param10 <", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10LessThanOrEqualTo(String value) {
            addCriterion("pat_param10 <=", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10Like(String value) {
            addCriterion("pat_param10 like", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10NotLike(String value) {
            addCriterion("pat_param10 not like", value, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10In(List<String> values) {
            addCriterion("pat_param10 in", values, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10NotIn(List<String> values) {
            addCriterion("pat_param10 not in", values, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10Between(String value1, String value2) {
            addCriterion("pat_param10 between", value1, value2, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam10NotBetween(String value1, String value2) {
            addCriterion("pat_param10 not between", value1, value2, "patParam10");
            return (Criteria) this;
        }

        public Criteria andPatParam11IsNull() {
            addCriterion("pat_param11 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam11IsNotNull() {
            addCriterion("pat_param11 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam11EqualTo(String value) {
            addCriterion("pat_param11 =", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11NotEqualTo(String value) {
            addCriterion("pat_param11 <>", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11GreaterThan(String value) {
            addCriterion("pat_param11 >", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param11 >=", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11LessThan(String value) {
            addCriterion("pat_param11 <", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11LessThanOrEqualTo(String value) {
            addCriterion("pat_param11 <=", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11Like(String value) {
            addCriterion("pat_param11 like", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11NotLike(String value) {
            addCriterion("pat_param11 not like", value, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11In(List<String> values) {
            addCriterion("pat_param11 in", values, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11NotIn(List<String> values) {
            addCriterion("pat_param11 not in", values, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11Between(String value1, String value2) {
            addCriterion("pat_param11 between", value1, value2, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam11NotBetween(String value1, String value2) {
            addCriterion("pat_param11 not between", value1, value2, "patParam11");
            return (Criteria) this;
        }

        public Criteria andPatParam12IsNull() {
            addCriterion("pat_param12 is null");
            return (Criteria) this;
        }

        public Criteria andPatParam12IsNotNull() {
            addCriterion("pat_param12 is not null");
            return (Criteria) this;
        }

        public Criteria andPatParam12EqualTo(String value) {
            addCriterion("pat_param12 =", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12NotEqualTo(String value) {
            addCriterion("pat_param12 <>", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12GreaterThan(String value) {
            addCriterion("pat_param12 >", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12GreaterThanOrEqualTo(String value) {
            addCriterion("pat_param12 >=", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12LessThan(String value) {
            addCriterion("pat_param12 <", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12LessThanOrEqualTo(String value) {
            addCriterion("pat_param12 <=", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12Like(String value) {
            addCriterion("pat_param12 like", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12NotLike(String value) {
            addCriterion("pat_param12 not like", value, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12In(List<String> values) {
            addCriterion("pat_param12 in", values, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12NotIn(List<String> values) {
            addCriterion("pat_param12 not in", values, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12Between(String value1, String value2) {
            addCriterion("pat_param12 between", value1, value2, "patParam12");
            return (Criteria) this;
        }

        public Criteria andPatParam12NotBetween(String value1, String value2) {
            addCriterion("pat_param12 not between", value1, value2, "patParam12");
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