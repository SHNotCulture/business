package com.business.dao.sqlProvider;

import com.business.entity.TChargeRule;
import com.business.entity.TChargeRuleCriteria.Criteria;
import com.business.entity.TChargeRuleCriteria.Criterion;
import com.business.entity.TChargeRuleCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TChargeRuleSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String countByExample(TChargeRuleCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_charge_rule");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String deleteByExample(TChargeRuleCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_charge_rule");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String insertSelective(TChargeRule record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_charge_rule");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getIsHolidayUse() != null) {
            sql.VALUES("is_Holiday_Use", "#{isHolidayUse,jdbcType=INTEGER}");
        }
        
        if (record.getTimesecStart() != null) {
            sql.VALUES("timesec_start", "#{timesecStart,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecEnd() != null) {
            sql.VALUES("timesec_end", "#{timesecEnd,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTypeId() != null) {
            sql.VALUES("car_type_id", "#{carTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTime() != null) {
            sql.VALUES("free_time", "#{freeTime,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTimeFee() != null) {
            sql.VALUES("free_time_fee", "#{freeTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime1() != null) {
            sql.VALUES("base_time1", "#{baseTime1,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime1Fee() != null) {
            sql.VALUES("base_time1_fee", "#{baseTime1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime2() != null) {
            sql.VALUES("base_time2", "#{baseTime2,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime2Fee() != null) {
            sql.VALUES("base_time2_fee", "#{baseTime2Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTime() != null) {
            sql.VALUES("unit_time", "#{unitTime,jdbcType=INTEGER}");
        }
        
        if (record.getUnitTimeFee() != null) {
            sql.VALUES("unit_time_fee", "#{unitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24UnitTime() != null) {
            sql.VALUES("h24_unit_time", "#{h24UnitTime,jdbcType=INTEGER}");
        }
        
        if (record.getH24UnitTimeFee() != null) {
            sql.VALUES("h24_unit_time_fee", "#{h24UnitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getSurpassTime() != null) {
            sql.VALUES("surpass_time", "#{surpassTime,jdbcType=INTEGER}");
        }
        
        if (record.getMaxDay1Fee() != null) {
            sql.VALUES("max_day1_fee", "#{maxDay1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getMaxDaynFee() != null) {
            sql.VALUES("max_dayn_fee", "#{maxDaynFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24Rule() != null) {
            sql.VALUES("h24_rule", "#{h24Rule,jdbcType=INTEGER}");
        }
        
        if (record.getMaxSectimeFee() != null) {
            sql.VALUES("max_sectime_fee", "#{maxSectimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getIsMaxSectimeFeeByAdd() != null) {
            sql.VALUES("is_max_sectime_fee_by_add", "#{isMaxSectimeFeeByAdd,jdbcType=INTEGER}");
        }
        
        if (record.getIsMax24FeeByAdd() != null) {
            sql.VALUES("is_max_24_fee_by_add", "#{isMax24FeeByAdd,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String selectByExample(TChargeRuleCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("park_id");
        sql.SELECT("is_Holiday_Use");
        sql.SELECT("timesec_start");
        sql.SELECT("timesec_end");
        sql.SELECT("car_type_id");
        sql.SELECT("free_time");
        sql.SELECT("free_time_fee");
        sql.SELECT("base_time1");
        sql.SELECT("base_time1_fee");
        sql.SELECT("base_time2");
        sql.SELECT("base_time2_fee");
        sql.SELECT("unit_time");
        sql.SELECT("unit_time_fee");
        sql.SELECT("h24_unit_time");
        sql.SELECT("h24_unit_time_fee");
        sql.SELECT("surpass_time");
        sql.SELECT("max_day1_fee");
        sql.SELECT("max_dayn_fee");
        sql.SELECT("h24_rule");
        sql.SELECT("max_sectime_fee");
        sql.SELECT("is_max_sectime_fee_by_add");
        sql.SELECT("is_max_24_fee_by_add");
        sql.FROM("t_charge_rule");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TChargeRule record = (TChargeRule) parameter.get("record");
        TChargeRuleCriteria example = (TChargeRuleCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_charge_rule");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getIsHolidayUse() != null) {
            sql.SET("is_Holiday_Use = #{record.isHolidayUse,jdbcType=INTEGER}");
        }
        
        if (record.getTimesecStart() != null) {
            sql.SET("timesec_start = #{record.timesecStart,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecEnd() != null) {
            sql.SET("timesec_end = #{record.timesecEnd,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTypeId() != null) {
            sql.SET("car_type_id = #{record.carTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTime() != null) {
            sql.SET("free_time = #{record.freeTime,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTimeFee() != null) {
            sql.SET("free_time_fee = #{record.freeTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime1() != null) {
            sql.SET("base_time1 = #{record.baseTime1,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime1Fee() != null) {
            sql.SET("base_time1_fee = #{record.baseTime1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime2() != null) {
            sql.SET("base_time2 = #{record.baseTime2,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime2Fee() != null) {
            sql.SET("base_time2_fee = #{record.baseTime2Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTime() != null) {
            sql.SET("unit_time = #{record.unitTime,jdbcType=INTEGER}");
        }
        
        if (record.getUnitTimeFee() != null) {
            sql.SET("unit_time_fee = #{record.unitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24UnitTime() != null) {
            sql.SET("h24_unit_time = #{record.h24UnitTime,jdbcType=INTEGER}");
        }
        
        if (record.getH24UnitTimeFee() != null) {
            sql.SET("h24_unit_time_fee = #{record.h24UnitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getSurpassTime() != null) {
            sql.SET("surpass_time = #{record.surpassTime,jdbcType=INTEGER}");
        }
        
        if (record.getMaxDay1Fee() != null) {
            sql.SET("max_day1_fee = #{record.maxDay1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getMaxDaynFee() != null) {
            sql.SET("max_dayn_fee = #{record.maxDaynFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24Rule() != null) {
            sql.SET("h24_rule = #{record.h24Rule,jdbcType=INTEGER}");
        }
        
        if (record.getMaxSectimeFee() != null) {
            sql.SET("max_sectime_fee = #{record.maxSectimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getIsMaxSectimeFeeByAdd() != null) {
            sql.SET("is_max_sectime_fee_by_add = #{record.isMaxSectimeFeeByAdd,jdbcType=INTEGER}");
        }
        
        if (record.getIsMax24FeeByAdd() != null) {
            sql.SET("is_max_24_fee_by_add = #{record.isMax24FeeByAdd,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_charge_rule");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("is_Holiday_Use = #{record.isHolidayUse,jdbcType=INTEGER}");
        sql.SET("timesec_start = #{record.timesecStart,jdbcType=VARCHAR}");
        sql.SET("timesec_end = #{record.timesecEnd,jdbcType=VARCHAR}");
        sql.SET("car_type_id = #{record.carTypeId,jdbcType=INTEGER}");
        sql.SET("free_time = #{record.freeTime,jdbcType=INTEGER}");
        sql.SET("free_time_fee = #{record.freeTimeFee,jdbcType=DOUBLE}");
        sql.SET("base_time1 = #{record.baseTime1,jdbcType=INTEGER}");
        sql.SET("base_time1_fee = #{record.baseTime1Fee,jdbcType=DOUBLE}");
        sql.SET("base_time2 = #{record.baseTime2,jdbcType=INTEGER}");
        sql.SET("base_time2_fee = #{record.baseTime2Fee,jdbcType=DOUBLE}");
        sql.SET("unit_time = #{record.unitTime,jdbcType=INTEGER}");
        sql.SET("unit_time_fee = #{record.unitTimeFee,jdbcType=DOUBLE}");
        sql.SET("h24_unit_time = #{record.h24UnitTime,jdbcType=INTEGER}");
        sql.SET("h24_unit_time_fee = #{record.h24UnitTimeFee,jdbcType=DOUBLE}");
        sql.SET("surpass_time = #{record.surpassTime,jdbcType=INTEGER}");
        sql.SET("max_day1_fee = #{record.maxDay1Fee,jdbcType=DOUBLE}");
        sql.SET("max_dayn_fee = #{record.maxDaynFee,jdbcType=DOUBLE}");
        sql.SET("h24_rule = #{record.h24Rule,jdbcType=INTEGER}");
        sql.SET("max_sectime_fee = #{record.maxSectimeFee,jdbcType=DOUBLE}");
        sql.SET("is_max_sectime_fee_by_add = #{record.isMaxSectimeFeeByAdd,jdbcType=INTEGER}");
        sql.SET("is_max_24_fee_by_add = #{record.isMax24FeeByAdd,jdbcType=INTEGER}");
        
        TChargeRuleCriteria example = (TChargeRuleCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TChargeRule record) {
        SQL sql = new SQL();
        sql.UPDATE("t_charge_rule");
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getIsHolidayUse() != null) {
            sql.SET("is_Holiday_Use = #{isHolidayUse,jdbcType=INTEGER}");
        }
        
        if (record.getTimesecStart() != null) {
            sql.SET("timesec_start = #{timesecStart,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecEnd() != null) {
            sql.SET("timesec_end = #{timesecEnd,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTypeId() != null) {
            sql.SET("car_type_id = #{carTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTime() != null) {
            sql.SET("free_time = #{freeTime,jdbcType=INTEGER}");
        }
        
        if (record.getFreeTimeFee() != null) {
            sql.SET("free_time_fee = #{freeTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime1() != null) {
            sql.SET("base_time1 = #{baseTime1,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime1Fee() != null) {
            sql.SET("base_time1_fee = #{baseTime1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getBaseTime2() != null) {
            sql.SET("base_time2 = #{baseTime2,jdbcType=INTEGER}");
        }
        
        if (record.getBaseTime2Fee() != null) {
            sql.SET("base_time2_fee = #{baseTime2Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTime() != null) {
            sql.SET("unit_time = #{unitTime,jdbcType=INTEGER}");
        }
        
        if (record.getUnitTimeFee() != null) {
            sql.SET("unit_time_fee = #{unitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24UnitTime() != null) {
            sql.SET("h24_unit_time = #{h24UnitTime,jdbcType=INTEGER}");
        }
        
        if (record.getH24UnitTimeFee() != null) {
            sql.SET("h24_unit_time_fee = #{h24UnitTimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getSurpassTime() != null) {
            sql.SET("surpass_time = #{surpassTime,jdbcType=INTEGER}");
        }
        
        if (record.getMaxDay1Fee() != null) {
            sql.SET("max_day1_fee = #{maxDay1Fee,jdbcType=DOUBLE}");
        }
        
        if (record.getMaxDaynFee() != null) {
            sql.SET("max_dayn_fee = #{maxDaynFee,jdbcType=DOUBLE}");
        }
        
        if (record.getH24Rule() != null) {
            sql.SET("h24_rule = #{h24Rule,jdbcType=INTEGER}");
        }
        
        if (record.getMaxSectimeFee() != null) {
            sql.SET("max_sectime_fee = #{maxSectimeFee,jdbcType=DOUBLE}");
        }
        
        if (record.getIsMaxSectimeFeeByAdd() != null) {
            sql.SET("is_max_sectime_fee_by_add = #{isMaxSectimeFeeByAdd,jdbcType=INTEGER}");
        }
        
        if (record.getIsMax24FeeByAdd() != null) {
            sql.SET("is_max_24_fee_by_add = #{isMax24FeeByAdd,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_charge_rule
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TChargeRuleCriteria example, boolean includeExamplePhrase) {
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