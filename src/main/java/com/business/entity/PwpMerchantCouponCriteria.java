package com.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PwpMerchantCouponCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public PwpMerchantCouponCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(Double value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(Double value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(Double value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(Double value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(Double value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<Double> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<Double> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(Double value1, Double value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(Double value1, Double value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponNoIsNull() {
            addCriterion("coupon_no is null");
            return (Criteria) this;
        }

        public Criteria andCouponNoIsNotNull() {
            addCriterion("coupon_no is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNoEqualTo(String value) {
            addCriterion("coupon_no =", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotEqualTo(String value) {
            addCriterion("coupon_no <>", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoGreaterThan(String value) {
            addCriterion("coupon_no >", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_no >=", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLessThan(String value) {
            addCriterion("coupon_no <", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLessThanOrEqualTo(String value) {
            addCriterion("coupon_no <=", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLike(String value) {
            addCriterion("coupon_no like", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotLike(String value) {
            addCriterion("coupon_no not like", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoIn(List<String> values) {
            addCriterion("coupon_no in", values, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotIn(List<String> values) {
            addCriterion("coupon_no not in", values, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoBetween(String value1, String value2) {
            addCriterion("coupon_no between", value1, value2, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotBetween(String value1, String value2) {
            addCriterion("coupon_no not between", value1, value2, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNull() {
            addCriterion("park_id is null");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNotNull() {
            addCriterion("park_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdEqualTo(Integer value) {
            addCriterion("park_id =", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotEqualTo(Integer value) {
            addCriterion("park_id <>", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThan(Integer value) {
            addCriterion("park_id >", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_id >=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThan(Integer value) {
            addCriterion("park_id <", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThanOrEqualTo(Integer value) {
            addCriterion("park_id <=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdIn(List<Integer> values) {
            addCriterion("park_id in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotIn(List<Integer> values) {
            addCriterion("park_id not in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdBetween(Integer value1, Integer value2) {
            addCriterion("park_id between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("park_id not between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdIsNull() {
            addCriterion("park_trade_records_id is null");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdIsNotNull() {
            addCriterion("park_trade_records_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdEqualTo(Integer value) {
            addCriterion("park_trade_records_id =", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdNotEqualTo(Integer value) {
            addCriterion("park_trade_records_id <>", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdGreaterThan(Integer value) {
            addCriterion("park_trade_records_id >", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_trade_records_id >=", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdLessThan(Integer value) {
            addCriterion("park_trade_records_id <", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdLessThanOrEqualTo(Integer value) {
            addCriterion("park_trade_records_id <=", value, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdIn(List<Integer> values) {
            addCriterion("park_trade_records_id in", values, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdNotIn(List<Integer> values) {
            addCriterion("park_trade_records_id not in", values, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdBetween(Integer value1, Integer value2) {
            addCriterion("park_trade_records_id between", value1, value2, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andParkTradeRecordsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("park_trade_records_id not between", value1, value2, "parkTradeRecordsId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
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