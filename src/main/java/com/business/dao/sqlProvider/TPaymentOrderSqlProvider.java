package com.business.dao.sqlProvider;

import com.business.entity.TPaymentOrder;
import com.business.entity.TPaymentOrderCriteria.Criteria;
import com.business.entity.TPaymentOrderCriteria.Criterion;
import com.business.entity.TPaymentOrderCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TPaymentOrderSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String countByExample(TPaymentOrderCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_payment_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String deleteByExample(TPaymentOrderCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_payment_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String insertSelective(TPaymentOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_payment_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDealId() != null) {
            sql.VALUES("deal_id", "#{dealId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchId() != null) {
            sql.VALUES("mch_id", "#{mchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBody() != null) {
            sql.VALUES("body", "#{body,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.VALUES("payment_method", "#{paymentMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getFee() != null) {
            sql.VALUES("fee", "#{fee,jdbcType=DOUBLE}");
        }
        
        if (record.getCarplate() != null) {
            sql.VALUES("carplate", "#{carplate,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeStart() != null) {
            sql.VALUES("time_start", "#{timeStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenid() != null) {
            sql.VALUES("openid", "#{openid,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("flag", "#{flag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeflag() != null) {
            sql.VALUES("uplodeFlag", "#{uplodeflag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeFlag() != null) {
            sql.VALUES("uplode_flag", "#{uplodeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String selectByExampleWithBLOBs(TPaymentOrderCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("deal_id");
        sql.SELECT("mch_id");
        sql.SELECT("body");
        sql.SELECT("payment_method");
        sql.SELECT("fee");
        sql.SELECT("carplate");
        sql.SELECT("park_id");
        sql.SELECT("time_start");
        sql.SELECT("openid");
        sql.SELECT("create_time");
        sql.SELECT("flag");
        sql.SELECT("uplodeFlag");
        sql.SELECT("uplode_flag");
        sql.SELECT("remark");
        sql.FROM("t_payment_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String selectByExample(TPaymentOrderCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("deal_id");
        sql.SELECT("mch_id");
        sql.SELECT("body");
        sql.SELECT("payment_method");
        sql.SELECT("fee");
        sql.SELECT("carplate");
        sql.SELECT("park_id");
        sql.SELECT("time_start");
        sql.SELECT("openid");
        sql.SELECT("create_time");
        sql.SELECT("flag");
        sql.SELECT("uplodeFlag");
        sql.SELECT("uplode_flag");
        sql.FROM("t_payment_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TPaymentOrder record = (TPaymentOrder) parameter.get("record");
        TPaymentOrderCriteria example = (TPaymentOrderCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_payment_order");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDealId() != null) {
            sql.SET("deal_id = #{record.dealId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchId() != null) {
            sql.SET("mch_id = #{record.mchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBody() != null) {
            sql.SET("body = #{record.body,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{record.paymentMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{record.fee,jdbcType=DOUBLE}");
        }
        
        if (record.getCarplate() != null) {
            sql.SET("carplate = #{record.carplate,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeStart() != null) {
            sql.SET("time_start = #{record.timeStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenid() != null) {
            sql.SET("openid = #{record.openid,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{record.flag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeflag() != null) {
            sql.SET("uplodeFlag = #{record.uplodeflag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeFlag() != null) {
            sql.SET("uplode_flag = #{record.uplodeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_payment_order");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("deal_id = #{record.dealId,jdbcType=VARCHAR}");
        sql.SET("mch_id = #{record.mchId,jdbcType=VARCHAR}");
        sql.SET("body = #{record.body,jdbcType=VARCHAR}");
        sql.SET("payment_method = #{record.paymentMethod,jdbcType=VARCHAR}");
        sql.SET("fee = #{record.fee,jdbcType=DOUBLE}");
        sql.SET("carplate = #{record.carplate,jdbcType=VARCHAR}");
        sql.SET("park_id = #{record.parkId,jdbcType=VARCHAR}");
        sql.SET("time_start = #{record.timeStart,jdbcType=TIMESTAMP}");
        sql.SET("openid = #{record.openid,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("flag = #{record.flag,jdbcType=INTEGER}");
        sql.SET("uplodeFlag = #{record.uplodeflag,jdbcType=INTEGER}");
        sql.SET("uplode_flag = #{record.uplodeFlag,jdbcType=INTEGER}");
        sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        
        TPaymentOrderCriteria example = (TPaymentOrderCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_payment_order");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("deal_id = #{record.dealId,jdbcType=VARCHAR}");
        sql.SET("mch_id = #{record.mchId,jdbcType=VARCHAR}");
        sql.SET("body = #{record.body,jdbcType=VARCHAR}");
        sql.SET("payment_method = #{record.paymentMethod,jdbcType=VARCHAR}");
        sql.SET("fee = #{record.fee,jdbcType=DOUBLE}");
        sql.SET("carplate = #{record.carplate,jdbcType=VARCHAR}");
        sql.SET("park_id = #{record.parkId,jdbcType=VARCHAR}");
        sql.SET("time_start = #{record.timeStart,jdbcType=TIMESTAMP}");
        sql.SET("openid = #{record.openid,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("flag = #{record.flag,jdbcType=INTEGER}");
        sql.SET("uplodeFlag = #{record.uplodeflag,jdbcType=INTEGER}");
        sql.SET("uplode_flag = #{record.uplodeFlag,jdbcType=INTEGER}");
        
        TPaymentOrderCriteria example = (TPaymentOrderCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TPaymentOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("t_payment_order");
        
        if (record.getDealId() != null) {
            sql.SET("deal_id = #{dealId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchId() != null) {
            sql.SET("mch_id = #{mchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBody() != null) {
            sql.SET("body = #{body,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{paymentMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{fee,jdbcType=DOUBLE}");
        }
        
        if (record.getCarplate() != null) {
            sql.SET("carplate = #{carplate,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeStart() != null) {
            sql.SET("time_start = #{timeStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenid() != null) {
            sql.SET("openid = #{openid,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{flag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeflag() != null) {
            sql.SET("uplodeFlag = #{uplodeflag,jdbcType=INTEGER}");
        }
        
        if (record.getUplodeFlag() != null) {
            sql.SET("uplode_flag = #{uplodeFlag,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TPaymentOrderCriteria example, boolean includeExamplePhrase) {
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