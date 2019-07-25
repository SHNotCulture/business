package com.business.dao.sqlProvider;

import com.business.entity.TCarPayRule;
import com.business.entity.TCarPayRuleCriteria.Criteria;
import com.business.entity.TCarPayRuleCriteria.Criterion;
import com.business.entity.TCarPayRuleCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TCarPayRuleSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String countByExample(TCarPayRuleCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_car_pay_rule");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String deleteByExample(TCarPayRuleCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_car_pay_rule");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String insertSelective(TCarPayRule record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_car_pay_rule");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDayFee() != null) {
            sql.VALUES("day_fee", "#{dayFee,jdbcType=DOUBLE}");
        }
        
        if (record.getMonthFee() != null) {
            sql.VALUES("month_fee", "#{monthFee,jdbcType=DOUBLE}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getRuleName() != null) {
            sql.VALUES("rule_name", "#{ruleName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonFee() != null) {
            sql.VALUES("season_fee", "#{seasonFee,jdbcType=BIGINT}");
        }
        
        if (record.getYearFee() != null) {
            sql.VALUES("year_fee", "#{yearFee,jdbcType=DOUBLE}");
        }
        
        if (record.getCompanyId() != null) {
            sql.VALUES("company_id", "#{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getDailyStartTime() != null) {
            sql.VALUES("daily_start_time", "#{dailyStartTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyEndTime() != null) {
            sql.VALUES("daily_end_time", "#{dailyEndTime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String selectByExample(TCarPayRuleCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("day_fee");
        sql.SELECT("month_fee");
        sql.SELECT("park_id");
        sql.SELECT("remark");
        sql.SELECT("rule_name");
        sql.SELECT("season_fee");
        sql.SELECT("year_fee");
        sql.SELECT("company_id");
        sql.SELECT("daily_start_time");
        sql.SELECT("daily_end_time");
        sql.FROM("t_car_pay_rule");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TCarPayRule record = (TCarPayRule) parameter.get("record");
        TCarPayRuleCriteria example = (TCarPayRuleCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_car_pay_rule");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDayFee() != null) {
            sql.SET("day_fee = #{record.dayFee,jdbcType=DOUBLE}");
        }
        
        if (record.getMonthFee() != null) {
            sql.SET("month_fee = #{record.monthFee,jdbcType=DOUBLE}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getRuleName() != null) {
            sql.SET("rule_name = #{record.ruleName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonFee() != null) {
            sql.SET("season_fee = #{record.seasonFee,jdbcType=BIGINT}");
        }
        
        if (record.getYearFee() != null) {
            sql.SET("year_fee = #{record.yearFee,jdbcType=DOUBLE}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        }
        
        if (record.getDailyStartTime() != null) {
            sql.SET("daily_start_time = #{record.dailyStartTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyEndTime() != null) {
            sql.SET("daily_end_time = #{record.dailyEndTime,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_car_pay_rule");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("day_fee = #{record.dayFee,jdbcType=DOUBLE}");
        sql.SET("month_fee = #{record.monthFee,jdbcType=DOUBLE}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("rule_name = #{record.ruleName,jdbcType=VARCHAR}");
        sql.SET("season_fee = #{record.seasonFee,jdbcType=BIGINT}");
        sql.SET("year_fee = #{record.yearFee,jdbcType=DOUBLE}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("daily_start_time = #{record.dailyStartTime,jdbcType=VARCHAR}");
        sql.SET("daily_end_time = #{record.dailyEndTime,jdbcType=VARCHAR}");
        
        TCarPayRuleCriteria example = (TCarPayRuleCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TCarPayRule record) {
        SQL sql = new SQL();
        sql.UPDATE("t_car_pay_rule");
        
        if (record.getDayFee() != null) {
            sql.SET("day_fee = #{dayFee,jdbcType=DOUBLE}");
        }
        
        if (record.getMonthFee() != null) {
            sql.SET("month_fee = #{monthFee,jdbcType=DOUBLE}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getRuleName() != null) {
            sql.SET("rule_name = #{ruleName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeasonFee() != null) {
            sql.SET("season_fee = #{seasonFee,jdbcType=BIGINT}");
        }
        
        if (record.getYearFee() != null) {
            sql.SET("year_fee = #{yearFee,jdbcType=DOUBLE}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getDailyStartTime() != null) {
            sql.SET("daily_start_time = #{dailyStartTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyEndTime() != null) {
            sql.SET("daily_end_time = #{dailyEndTime,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_pay_rule
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TCarPayRuleCriteria example, boolean includeExamplePhrase) {
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