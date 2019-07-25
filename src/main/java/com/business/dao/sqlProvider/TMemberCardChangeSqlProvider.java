package com.business.dao.sqlProvider;

import com.business.entity.TMemberCardChange;
import com.business.entity.TMemberCardChangeCriteria.Criteria;
import com.business.entity.TMemberCardChangeCriteria.Criterion;
import com.business.entity.TMemberCardChangeCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TMemberCardChangeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String countByExample(TMemberCardChangeCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_member_card_change");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String deleteByExample(TMemberCardChangeCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_member_card_change");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String insertSelective(TMemberCardChange record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_member_card_change");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMemberDetailId() != null) {
            sql.VALUES("member_detail_id", "#{memberDetailId,jdbcType=INTEGER}");
        }
        
        if (record.getCarNum() != null) {
            sql.VALUES("car_num", "#{carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardId() != null) {
            sql.VALUES("ori_p_card_id", "#{oriPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardCode() != null) {
            sql.VALUES("ori_p_card_code", "#{oriPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardPwd() != null) {
            sql.VALUES("ori_p_card_pwd", "#{oriPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardId() != null) {
            sql.VALUES("new_p_card_id", "#{newPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardCode() != null) {
            sql.VALUES("new_p_card_code", "#{newPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardPwd() != null) {
            sql.VALUES("new_p_card_pwd", "#{newPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String selectByExample(TMemberCardChangeCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("member_detail_id");
        sql.SELECT("car_num");
        sql.SELECT("ori_p_card_id");
        sql.SELECT("ori_p_card_code");
        sql.SELECT("ori_p_card_pwd");
        sql.SELECT("new_p_card_id");
        sql.SELECT("new_p_card_code");
        sql.SELECT("new_p_card_pwd");
        sql.SELECT("create_time");
        sql.FROM("t_member_card_change");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TMemberCardChange record = (TMemberCardChange) parameter.get("record");
        TMemberCardChangeCriteria example = (TMemberCardChangeCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_member_card_change");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getMemberDetailId() != null) {
            sql.SET("member_detail_id = #{record.memberDetailId,jdbcType=INTEGER}");
        }
        
        if (record.getCarNum() != null) {
            sql.SET("car_num = #{record.carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardId() != null) {
            sql.SET("ori_p_card_id = #{record.oriPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardCode() != null) {
            sql.SET("ori_p_card_code = #{record.oriPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardPwd() != null) {
            sql.SET("ori_p_card_pwd = #{record.oriPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardId() != null) {
            sql.SET("new_p_card_id = #{record.newPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardCode() != null) {
            sql.SET("new_p_card_code = #{record.newPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardPwd() != null) {
            sql.SET("new_p_card_pwd = #{record.newPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_member_card_change");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("member_detail_id = #{record.memberDetailId,jdbcType=INTEGER}");
        sql.SET("car_num = #{record.carNum,jdbcType=VARCHAR}");
        sql.SET("ori_p_card_id = #{record.oriPCardId,jdbcType=VARCHAR}");
        sql.SET("ori_p_card_code = #{record.oriPCardCode,jdbcType=VARCHAR}");
        sql.SET("ori_p_card_pwd = #{record.oriPCardPwd,jdbcType=VARCHAR}");
        sql.SET("new_p_card_id = #{record.newPCardId,jdbcType=VARCHAR}");
        sql.SET("new_p_card_code = #{record.newPCardCode,jdbcType=VARCHAR}");
        sql.SET("new_p_card_pwd = #{record.newPCardPwd,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        
        TMemberCardChangeCriteria example = (TMemberCardChangeCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TMemberCardChange record) {
        SQL sql = new SQL();
        sql.UPDATE("t_member_card_change");
        
        if (record.getMemberDetailId() != null) {
            sql.SET("member_detail_id = #{memberDetailId,jdbcType=INTEGER}");
        }
        
        if (record.getCarNum() != null) {
            sql.SET("car_num = #{carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardId() != null) {
            sql.SET("ori_p_card_id = #{oriPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardCode() != null) {
            sql.SET("ori_p_card_code = #{oriPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOriPCardPwd() != null) {
            sql.SET("ori_p_card_pwd = #{oriPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardId() != null) {
            sql.SET("new_p_card_id = #{newPCardId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardCode() != null) {
            sql.SET("new_p_card_code = #{newPCardCode,jdbcType=VARCHAR}");
        }
        
        if (record.getNewPCardPwd() != null) {
            sql.SET("new_p_card_pwd = #{newPCardPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_card_change
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TMemberCardChangeCriteria example, boolean includeExamplePhrase) {
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