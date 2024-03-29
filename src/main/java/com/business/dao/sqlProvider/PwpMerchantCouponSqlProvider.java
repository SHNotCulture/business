package com.business.dao.sqlProvider;

import com.business.entity.PwpMerchantCoupon;
import com.business.entity.PwpMerchantCouponCriteria.Criteria;
import com.business.entity.PwpMerchantCouponCriteria.Criterion;
import com.business.entity.PwpMerchantCouponCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PwpMerchantCouponSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String countByExample(PwpMerchantCouponCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pwp_merchant_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String deleteByExample(PwpMerchantCouponCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pwp_merchant_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String insertSelective(PwpMerchantCoupon record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pwp_merchant_coupon");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCarNum() != null) {
            sql.VALUES("car_num", "#{carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            sql.VALUES("client_id", "#{clientId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponMoney() != null) {
            sql.VALUES("coupon_money", "#{couponMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponNo() != null) {
            sql.VALUES("coupon_no", "#{couponNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            sql.VALUES("expire_time", "#{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantId() != null) {
            sql.VALUES("merchant_id", "#{merchantId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkTradeRecordsId() != null) {
            sql.VALUES("park_trade_records_id", "#{parkTradeRecordsId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String selectByExample(PwpMerchantCouponCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("car_num");
        sql.SELECT("client_id");
        sql.SELECT("coupon_money");
        sql.SELECT("coupon_no");
        sql.SELECT("create_time");
        sql.SELECT("expire_time");
        sql.SELECT("merchant_id");
        sql.SELECT("park_id");
        sql.SELECT("park_trade_records_id");
        sql.SELECT("update_time");
        sql.FROM("pwp_merchant_coupon");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PwpMerchantCoupon record = (PwpMerchantCoupon) parameter.get("record");
        PwpMerchantCouponCriteria example = (PwpMerchantCouponCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant_coupon");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCarNum() != null) {
            sql.SET("car_num = #{record.carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            sql.SET("client_id = #{record.clientId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponMoney() != null) {
            sql.SET("coupon_money = #{record.couponMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponNo() != null) {
            sql.SET("coupon_no = #{record.couponNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            sql.SET("expire_time = #{record.expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantId() != null) {
            sql.SET("merchant_id = #{record.merchantId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkTradeRecordsId() != null) {
            sql.SET("park_trade_records_id = #{record.parkTradeRecordsId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant_coupon");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("car_num = #{record.carNum,jdbcType=VARCHAR}");
        sql.SET("client_id = #{record.clientId,jdbcType=INTEGER}");
        sql.SET("coupon_money = #{record.couponMoney,jdbcType=DOUBLE}");
        sql.SET("coupon_no = #{record.couponNo,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("expire_time = #{record.expireTime,jdbcType=TIMESTAMP}");
        sql.SET("merchant_id = #{record.merchantId,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("park_trade_records_id = #{record.parkTradeRecordsId,jdbcType=INTEGER}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PwpMerchantCouponCriteria example = (PwpMerchantCouponCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(PwpMerchantCoupon record) {
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant_coupon");
        
        if (record.getCarNum() != null) {
            sql.SET("car_num = #{carNum,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            sql.SET("client_id = #{clientId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponMoney() != null) {
            sql.SET("coupon_money = #{couponMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponNo() != null) {
            sql.SET("coupon_no = #{couponNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            sql.SET("expire_time = #{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantId() != null) {
            sql.SET("merchant_id = #{merchantId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkTradeRecordsId() != null) {
            sql.SET("park_trade_records_id = #{parkTradeRecordsId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant_coupon
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, PwpMerchantCouponCriteria example, boolean includeExamplePhrase) {
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