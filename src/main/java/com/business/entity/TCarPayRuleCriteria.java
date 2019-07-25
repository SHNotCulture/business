package com.business.entity;

import java.util.ArrayList;
import java.util.List;

public class TCarPayRuleCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public TCarPayRuleCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
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
     * This method corresponds to the database table t_car_pay_rule
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
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
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
     * This class corresponds to the database table t_car_pay_rule
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

        public Criteria andDayFeeIsNull() {
            addCriterion("day_fee is null");
            return (Criteria) this;
        }

        public Criteria andDayFeeIsNotNull() {
            addCriterion("day_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeeEqualTo(Double value) {
            addCriterion("day_fee =", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeNotEqualTo(Double value) {
            addCriterion("day_fee <>", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeGreaterThan(Double value) {
            addCriterion("day_fee >", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("day_fee >=", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeLessThan(Double value) {
            addCriterion("day_fee <", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeLessThanOrEqualTo(Double value) {
            addCriterion("day_fee <=", value, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeIn(List<Double> values) {
            addCriterion("day_fee in", values, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeNotIn(List<Double> values) {
            addCriterion("day_fee not in", values, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeBetween(Double value1, Double value2) {
            addCriterion("day_fee between", value1, value2, "dayFee");
            return (Criteria) this;
        }

        public Criteria andDayFeeNotBetween(Double value1, Double value2) {
            addCriterion("day_fee not between", value1, value2, "dayFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeIsNull() {
            addCriterion("month_fee is null");
            return (Criteria) this;
        }

        public Criteria andMonthFeeIsNotNull() {
            addCriterion("month_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMonthFeeEqualTo(Double value) {
            addCriterion("month_fee =", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeNotEqualTo(Double value) {
            addCriterion("month_fee <>", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeGreaterThan(Double value) {
            addCriterion("month_fee >", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("month_fee >=", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeLessThan(Double value) {
            addCriterion("month_fee <", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeLessThanOrEqualTo(Double value) {
            addCriterion("month_fee <=", value, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeIn(List<Double> values) {
            addCriterion("month_fee in", values, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeNotIn(List<Double> values) {
            addCriterion("month_fee not in", values, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeBetween(Double value1, Double value2) {
            addCriterion("month_fee between", value1, value2, "monthFee");
            return (Criteria) this;
        }

        public Criteria andMonthFeeNotBetween(Double value1, Double value2) {
            addCriterion("month_fee not between", value1, value2, "monthFee");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeIsNull() {
            addCriterion("season_fee is null");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeIsNotNull() {
            addCriterion("season_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeEqualTo(Long value) {
            addCriterion("season_fee =", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeNotEqualTo(Long value) {
            addCriterion("season_fee <>", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeGreaterThan(Long value) {
            addCriterion("season_fee >", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("season_fee >=", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeLessThan(Long value) {
            addCriterion("season_fee <", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeLessThanOrEqualTo(Long value) {
            addCriterion("season_fee <=", value, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeIn(List<Long> values) {
            addCriterion("season_fee in", values, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeNotIn(List<Long> values) {
            addCriterion("season_fee not in", values, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeBetween(Long value1, Long value2) {
            addCriterion("season_fee between", value1, value2, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andSeasonFeeNotBetween(Long value1, Long value2) {
            addCriterion("season_fee not between", value1, value2, "seasonFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeIsNull() {
            addCriterion("year_fee is null");
            return (Criteria) this;
        }

        public Criteria andYearFeeIsNotNull() {
            addCriterion("year_fee is not null");
            return (Criteria) this;
        }

        public Criteria andYearFeeEqualTo(Double value) {
            addCriterion("year_fee =", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeNotEqualTo(Double value) {
            addCriterion("year_fee <>", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeGreaterThan(Double value) {
            addCriterion("year_fee >", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("year_fee >=", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeLessThan(Double value) {
            addCriterion("year_fee <", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeLessThanOrEqualTo(Double value) {
            addCriterion("year_fee <=", value, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeIn(List<Double> values) {
            addCriterion("year_fee in", values, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeNotIn(List<Double> values) {
            addCriterion("year_fee not in", values, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeBetween(Double value1, Double value2) {
            addCriterion("year_fee between", value1, value2, "yearFee");
            return (Criteria) this;
        }

        public Criteria andYearFeeNotBetween(Double value1, Double value2) {
            addCriterion("year_fee not between", value1, value2, "yearFee");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeIsNull() {
            addCriterion("daily_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeIsNotNull() {
            addCriterion("daily_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeEqualTo(String value) {
            addCriterion("daily_start_time =", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeNotEqualTo(String value) {
            addCriterion("daily_start_time <>", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeGreaterThan(String value) {
            addCriterion("daily_start_time >", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("daily_start_time >=", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeLessThan(String value) {
            addCriterion("daily_start_time <", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeLessThanOrEqualTo(String value) {
            addCriterion("daily_start_time <=", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeLike(String value) {
            addCriterion("daily_start_time like", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeNotLike(String value) {
            addCriterion("daily_start_time not like", value, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeIn(List<String> values) {
            addCriterion("daily_start_time in", values, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeNotIn(List<String> values) {
            addCriterion("daily_start_time not in", values, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeBetween(String value1, String value2) {
            addCriterion("daily_start_time between", value1, value2, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyStartTimeNotBetween(String value1, String value2) {
            addCriterion("daily_start_time not between", value1, value2, "dailyStartTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeIsNull() {
            addCriterion("daily_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeIsNotNull() {
            addCriterion("daily_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeEqualTo(String value) {
            addCriterion("daily_end_time =", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeNotEqualTo(String value) {
            addCriterion("daily_end_time <>", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeGreaterThan(String value) {
            addCriterion("daily_end_time >", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("daily_end_time >=", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeLessThan(String value) {
            addCriterion("daily_end_time <", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeLessThanOrEqualTo(String value) {
            addCriterion("daily_end_time <=", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeLike(String value) {
            addCriterion("daily_end_time like", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeNotLike(String value) {
            addCriterion("daily_end_time not like", value, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeIn(List<String> values) {
            addCriterion("daily_end_time in", values, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeNotIn(List<String> values) {
            addCriterion("daily_end_time not in", values, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeBetween(String value1, String value2) {
            addCriterion("daily_end_time between", value1, value2, "dailyEndTime");
            return (Criteria) this;
        }

        public Criteria andDailyEndTimeNotBetween(String value1, String value2) {
            addCriterion("daily_end_time not between", value1, value2, "dailyEndTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_car_pay_rule
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
     * This class corresponds to the database table t_car_pay_rule
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