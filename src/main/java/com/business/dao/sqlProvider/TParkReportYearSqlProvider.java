package com.business.dao.sqlProvider;

import com.business.entity.TParkReportYear;
import com.business.entity.TParkReportYearCriteria.Criteria;
import com.business.entity.TParkReportYearCriteria.Criterion;
import com.business.entity.TParkReportYearCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TParkReportYearSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String countByExample(TParkReportYearCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_park_report_year");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String deleteByExample(TParkReportYearCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_park_report_year");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String insertSelective(TParkReportYear record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_park_report_year");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessCircleTotal() != null) {
            sql.VALUES("business_circle_total", "#{businessCircleTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCenterChargeTotal() != null) {
            sql.VALUES("center_charge_total", "#{centerChargeTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getFixAdd() != null) {
            sql.VALUES("fix_add", "#{fixAdd,jdbcType=INTEGER}");
        }
        
        if (record.getFixCashActualTotal() != null) {
            sql.VALUES("fix_cash_actual_total", "#{fixCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixCashNeedTotal() != null) {
            sql.VALUES("fix_cash_need_total", "#{fixCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineActualTotal() != null) {
            sql.VALUES("fix_online_actual_total", "#{fixOnlineActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineNeedTotal() != null) {
            sql.VALUES("fix_online_need_total", "#{fixOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFreeTotal() != null) {
            sql.VALUES("free_total", "#{freeTotal,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getTempCashActualTotal() != null) {
            sql.VALUES("temp_cash_actual_total", "#{tempCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCashNeedTotal() != null) {
            sql.VALUES("temp_cash_need_total", "#{tempCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineNeedTotal() != null) {
            sql.VALUES("temp_online_need_total", "#{tempOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineTotal() != null) {
            sql.VALUES("temp_online_total", "#{tempOnlineTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempBehalfpayTotal() != null) {
            sql.VALUES("temp_BehalfPay_Total", "#{tempBehalfpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPayDiff() != null) {
            sql.VALUES("temp_Pay_diff", "#{tempPayDiff,jdbcType=DOUBLE}");
        }
        
        if (record.getTempNeedpayTotal() != null) {
            sql.VALUES("temp_NeedPay_Total", "#{tempNeedpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPrepayTotal() != null) {
            sql.VALUES("temp_PrePay_Total", "#{tempPrepayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempQpasspayTotal() != null) {
            sql.VALUES("temp_qPassPay_Total", "#{tempQpasspayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCouponTotal() != null) {
            sql.VALUES("temp_coupon_Total", "#{tempCouponTotal,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String selectByExample(TParkReportYearCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("business_circle_total");
        sql.SELECT("center_charge_total");
        sql.SELECT("create_date");
        sql.SELECT("fix_add");
        sql.SELECT("fix_cash_actual_total");
        sql.SELECT("fix_cash_need_total");
        sql.SELECT("fix_online_actual_total");
        sql.SELECT("fix_online_need_total");
        sql.SELECT("free_total");
        sql.SELECT("park_id");
        sql.SELECT("temp_cash_actual_total");
        sql.SELECT("temp_cash_need_total");
        sql.SELECT("temp_online_need_total");
        sql.SELECT("temp_online_total");
        sql.SELECT("temp_BehalfPay_Total");
        sql.SELECT("temp_Pay_diff");
        sql.SELECT("temp_NeedPay_Total");
        sql.SELECT("temp_PrePay_Total");
        sql.SELECT("temp_qPassPay_Total");
        sql.SELECT("temp_coupon_Total");
        sql.FROM("t_park_report_year");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TParkReportYear record = (TParkReportYear) parameter.get("record");
        TParkReportYearCriteria example = (TParkReportYearCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_park_report_year");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessCircleTotal() != null) {
            sql.SET("business_circle_total = #{record.businessCircleTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCenterChargeTotal() != null) {
            sql.SET("center_charge_total = #{record.centerChargeTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{record.createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getFixAdd() != null) {
            sql.SET("fix_add = #{record.fixAdd,jdbcType=INTEGER}");
        }
        
        if (record.getFixCashActualTotal() != null) {
            sql.SET("fix_cash_actual_total = #{record.fixCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixCashNeedTotal() != null) {
            sql.SET("fix_cash_need_total = #{record.fixCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineActualTotal() != null) {
            sql.SET("fix_online_actual_total = #{record.fixOnlineActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineNeedTotal() != null) {
            sql.SET("fix_online_need_total = #{record.fixOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFreeTotal() != null) {
            sql.SET("free_total = #{record.freeTotal,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getTempCashActualTotal() != null) {
            sql.SET("temp_cash_actual_total = #{record.tempCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCashNeedTotal() != null) {
            sql.SET("temp_cash_need_total = #{record.tempCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineNeedTotal() != null) {
            sql.SET("temp_online_need_total = #{record.tempOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineTotal() != null) {
            sql.SET("temp_online_total = #{record.tempOnlineTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempBehalfpayTotal() != null) {
            sql.SET("temp_BehalfPay_Total = #{record.tempBehalfpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPayDiff() != null) {
            sql.SET("temp_Pay_diff = #{record.tempPayDiff,jdbcType=DOUBLE}");
        }
        
        if (record.getTempNeedpayTotal() != null) {
            sql.SET("temp_NeedPay_Total = #{record.tempNeedpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPrepayTotal() != null) {
            sql.SET("temp_PrePay_Total = #{record.tempPrepayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempQpasspayTotal() != null) {
            sql.SET("temp_qPassPay_Total = #{record.tempQpasspayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCouponTotal() != null) {
            sql.SET("temp_coupon_Total = #{record.tempCouponTotal,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_park_report_year");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("business_circle_total = #{record.businessCircleTotal,jdbcType=DOUBLE}");
        sql.SET("center_charge_total = #{record.centerChargeTotal,jdbcType=DOUBLE}");
        sql.SET("create_date = #{record.createDate,jdbcType=VARCHAR}");
        sql.SET("fix_add = #{record.fixAdd,jdbcType=INTEGER}");
        sql.SET("fix_cash_actual_total = #{record.fixCashActualTotal,jdbcType=DOUBLE}");
        sql.SET("fix_cash_need_total = #{record.fixCashNeedTotal,jdbcType=DOUBLE}");
        sql.SET("fix_online_actual_total = #{record.fixOnlineActualTotal,jdbcType=DOUBLE}");
        sql.SET("fix_online_need_total = #{record.fixOnlineNeedTotal,jdbcType=DOUBLE}");
        sql.SET("free_total = #{record.freeTotal,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("temp_cash_actual_total = #{record.tempCashActualTotal,jdbcType=DOUBLE}");
        sql.SET("temp_cash_need_total = #{record.tempCashNeedTotal,jdbcType=DOUBLE}");
        sql.SET("temp_online_need_total = #{record.tempOnlineNeedTotal,jdbcType=DOUBLE}");
        sql.SET("temp_online_total = #{record.tempOnlineTotal,jdbcType=DOUBLE}");
        sql.SET("temp_BehalfPay_Total = #{record.tempBehalfpayTotal,jdbcType=DOUBLE}");
        sql.SET("temp_Pay_diff = #{record.tempPayDiff,jdbcType=DOUBLE}");
        sql.SET("temp_NeedPay_Total = #{record.tempNeedpayTotal,jdbcType=DOUBLE}");
        sql.SET("temp_PrePay_Total = #{record.tempPrepayTotal,jdbcType=DOUBLE}");
        sql.SET("temp_qPassPay_Total = #{record.tempQpasspayTotal,jdbcType=DOUBLE}");
        sql.SET("temp_coupon_Total = #{record.tempCouponTotal,jdbcType=DOUBLE}");
        
        TParkReportYearCriteria example = (TParkReportYearCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TParkReportYear record) {
        SQL sql = new SQL();
        sql.UPDATE("t_park_report_year");
        
        if (record.getBusinessCircleTotal() != null) {
            sql.SET("business_circle_total = #{businessCircleTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCenterChargeTotal() != null) {
            sql.SET("center_charge_total = #{centerChargeTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=VARCHAR}");
        }
        
        if (record.getFixAdd() != null) {
            sql.SET("fix_add = #{fixAdd,jdbcType=INTEGER}");
        }
        
        if (record.getFixCashActualTotal() != null) {
            sql.SET("fix_cash_actual_total = #{fixCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixCashNeedTotal() != null) {
            sql.SET("fix_cash_need_total = #{fixCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineActualTotal() != null) {
            sql.SET("fix_online_actual_total = #{fixOnlineActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFixOnlineNeedTotal() != null) {
            sql.SET("fix_online_need_total = #{fixOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getFreeTotal() != null) {
            sql.SET("free_total = #{freeTotal,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getTempCashActualTotal() != null) {
            sql.SET("temp_cash_actual_total = #{tempCashActualTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCashNeedTotal() != null) {
            sql.SET("temp_cash_need_total = #{tempCashNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineNeedTotal() != null) {
            sql.SET("temp_online_need_total = #{tempOnlineNeedTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempOnlineTotal() != null) {
            sql.SET("temp_online_total = #{tempOnlineTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempBehalfpayTotal() != null) {
            sql.SET("temp_BehalfPay_Total = #{tempBehalfpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPayDiff() != null) {
            sql.SET("temp_Pay_diff = #{tempPayDiff,jdbcType=DOUBLE}");
        }
        
        if (record.getTempNeedpayTotal() != null) {
            sql.SET("temp_NeedPay_Total = #{tempNeedpayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempPrepayTotal() != null) {
            sql.SET("temp_PrePay_Total = #{tempPrepayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempQpasspayTotal() != null) {
            sql.SET("temp_qPassPay_Total = #{tempQpasspayTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTempCouponTotal() != null) {
            sql.SET("temp_coupon_Total = #{tempCouponTotal,jdbcType=DOUBLE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_year
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TParkReportYearCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}