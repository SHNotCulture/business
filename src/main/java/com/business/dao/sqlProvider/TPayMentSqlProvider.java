package com.business.dao.sqlProvider;

import com.business.entity.TPayMent;
import com.business.entity.TPayMentCriteria.Criteria;
import com.business.entity.TPayMentCriteria.Criterion;
import com.business.entity.TPayMentCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TPayMentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String countByExample(TPayMentCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_pay_ment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String deleteByExample(TPayMentCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_pay_ment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String insertSelective(TPayMent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_pay_ment");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayType() != null) {
            sql.VALUES("pay_type", "#{payType,jdbcType=INTEGER}");
        }
        
        if (record.getIsStartHump() != null) {
            sql.VALUES("is_start_hump", "#{isStartHump,jdbcType=INTEGER}");
        }
        
        if (record.getIsHoliday() != null) {
            sql.VALUES("is_holiday", "#{isHoliday,jdbcType=INTEGER}");
        }
        
        if (record.getIsLowPeak() != null) {
            sql.VALUES("is_low_peak", "#{isLowPeak,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String selectByExample(TPayMentCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("park_id");
        sql.SELECT("pay_type");
        sql.SELECT("is_start_hump");
        sql.SELECT("is_holiday");
        sql.SELECT("is_low_peak");
        sql.FROM("t_pay_ment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TPayMent record = (TPayMent) parameter.get("record");
        TPayMentCriteria example = (TPayMentCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_pay_ment");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        }
        
        if (record.getIsStartHump() != null) {
            sql.SET("is_start_hump = #{record.isStartHump,jdbcType=INTEGER}");
        }
        
        if (record.getIsHoliday() != null) {
            sql.SET("is_holiday = #{record.isHoliday,jdbcType=INTEGER}");
        }
        
        if (record.getIsLowPeak() != null) {
            sql.SET("is_low_peak = #{record.isLowPeak,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_pay_ment");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        sql.SET("is_start_hump = #{record.isStartHump,jdbcType=INTEGER}");
        sql.SET("is_holiday = #{record.isHoliday,jdbcType=INTEGER}");
        sql.SET("is_low_peak = #{record.isLowPeak,jdbcType=INTEGER}");
        
        TPayMentCriteria example = (TPayMentCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TPayMent record) {
        SQL sql = new SQL();
        sql.UPDATE("t_pay_ment");
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("pay_type = #{payType,jdbcType=INTEGER}");
        }
        
        if (record.getIsStartHump() != null) {
            sql.SET("is_start_hump = #{isStartHump,jdbcType=INTEGER}");
        }
        
        if (record.getIsHoliday() != null) {
            sql.SET("is_holiday = #{isHoliday,jdbcType=INTEGER}");
        }
        
        if (record.getIsLowPeak() != null) {
            sql.SET("is_low_peak = #{isLowPeak,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_ment
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TPayMentCriteria example, boolean includeExamplePhrase) {
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