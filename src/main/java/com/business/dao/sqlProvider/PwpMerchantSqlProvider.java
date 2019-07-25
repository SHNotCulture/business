package com.business.dao.sqlProvider;

import com.business.entity.PwpMerchant;
import com.business.entity.PwpMerchantCriteria.Criteria;
import com.business.entity.PwpMerchantCriteria.Criterion;
import com.business.entity.PwpMerchantCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PwpMerchantSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String countByExample(PwpMerchantCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pwp_merchant");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String deleteByExample(PwpMerchantCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pwp_merchant");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String insertSelective(PwpMerchant record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pwp_merchant");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getBillingAccountId() != null) {
            sql.VALUES("billing_account_id", "#{billingAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getContact() != null) {
            sql.VALUES("contact", "#{contact,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponBalance() != null) {
            sql.VALUES("coupon_balance", "#{couponBalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponDiscount() != null) {
            sql.VALUES("coupon_discount", "#{couponDiscount,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantName() != null) {
            sql.VALUES("merchant_name", "#{merchantName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantStatus() != null) {
            sql.VALUES("merchant_status", "#{merchantStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getMerchantType() != null) {
            sql.VALUES("merchant_type", "#{merchantType,jdbcType=SMALLINT}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPhotoUrl() != null) {
            sql.VALUES("photo_url", "#{photoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPosId() != null) {
            sql.VALUES("pos_id", "#{posId,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperAccount() != null) {
            sql.VALUES("super_account", "#{superAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperPassword() != null) {
            sql.VALUES("super_password", "#{superPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIntroduction() != null) {
            sql.VALUES("introduction", "#{introduction,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String selectByExampleWithBLOBs(PwpMerchantCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("address");
        sql.SELECT("billing_account_id");
        sql.SELECT("contact");
        sql.SELECT("coupon_balance");
        sql.SELECT("coupon_discount");
        sql.SELECT("create_time");
        sql.SELECT("merchant_name");
        sql.SELECT("merchant_status");
        sql.SELECT("merchant_type");
        sql.SELECT("mobile");
        sql.SELECT("park_id");
        sql.SELECT("phone");
        sql.SELECT("photo_url");
        sql.SELECT("pos_id");
        sql.SELECT("super_account");
        sql.SELECT("super_password");
        sql.SELECT("update_time");
        sql.SELECT("introduction");
        sql.FROM("pwp_merchant");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String selectByExample(PwpMerchantCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("address");
        sql.SELECT("billing_account_id");
        sql.SELECT("contact");
        sql.SELECT("coupon_balance");
        sql.SELECT("coupon_discount");
        sql.SELECT("create_time");
        sql.SELECT("merchant_name");
        sql.SELECT("merchant_status");
        sql.SELECT("merchant_type");
        sql.SELECT("mobile");
        sql.SELECT("park_id");
        sql.SELECT("phone");
        sql.SELECT("photo_url");
        sql.SELECT("pos_id");
        sql.SELECT("super_account");
        sql.SELECT("super_password");
        sql.SELECT("update_time");
        sql.FROM("pwp_merchant");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PwpMerchant record = (PwpMerchant) parameter.get("record");
        PwpMerchantCriteria example = (PwpMerchantCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getBillingAccountId() != null) {
            sql.SET("billing_account_id = #{record.billingAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getContact() != null) {
            sql.SET("contact = #{record.contact,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponBalance() != null) {
            sql.SET("coupon_balance = #{record.couponBalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponDiscount() != null) {
            sql.SET("coupon_discount = #{record.couponDiscount,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantName() != null) {
            sql.SET("merchant_name = #{record.merchantName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantStatus() != null) {
            sql.SET("merchant_status = #{record.merchantStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getMerchantType() != null) {
            sql.SET("merchant_type = #{record.merchantType,jdbcType=SMALLINT}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPhotoUrl() != null) {
            sql.SET("photo_url = #{record.photoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPosId() != null) {
            sql.SET("pos_id = #{record.posId,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperAccount() != null) {
            sql.SET("super_account = #{record.superAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperPassword() != null) {
            sql.SET("super_password = #{record.superPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIntroduction() != null) {
            sql.SET("introduction = #{record.introduction,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("billing_account_id = #{record.billingAccountId,jdbcType=INTEGER}");
        sql.SET("contact = #{record.contact,jdbcType=VARCHAR}");
        sql.SET("coupon_balance = #{record.couponBalance,jdbcType=DOUBLE}");
        sql.SET("coupon_discount = #{record.couponDiscount,jdbcType=DOUBLE}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("merchant_name = #{record.merchantName,jdbcType=VARCHAR}");
        sql.SET("merchant_status = #{record.merchantStatus,jdbcType=SMALLINT}");
        sql.SET("merchant_type = #{record.merchantType,jdbcType=SMALLINT}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("photo_url = #{record.photoUrl,jdbcType=VARCHAR}");
        sql.SET("pos_id = #{record.posId,jdbcType=VARCHAR}");
        sql.SET("super_account = #{record.superAccount,jdbcType=VARCHAR}");
        sql.SET("super_password = #{record.superPassword,jdbcType=VARCHAR}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("introduction = #{record.introduction,jdbcType=LONGVARCHAR}");
        
        PwpMerchantCriteria example = (PwpMerchantCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("billing_account_id = #{record.billingAccountId,jdbcType=INTEGER}");
        sql.SET("contact = #{record.contact,jdbcType=VARCHAR}");
        sql.SET("coupon_balance = #{record.couponBalance,jdbcType=DOUBLE}");
        sql.SET("coupon_discount = #{record.couponDiscount,jdbcType=DOUBLE}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("merchant_name = #{record.merchantName,jdbcType=VARCHAR}");
        sql.SET("merchant_status = #{record.merchantStatus,jdbcType=SMALLINT}");
        sql.SET("merchant_type = #{record.merchantType,jdbcType=SMALLINT}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("photo_url = #{record.photoUrl,jdbcType=VARCHAR}");
        sql.SET("pos_id = #{record.posId,jdbcType=VARCHAR}");
        sql.SET("super_account = #{record.superAccount,jdbcType=VARCHAR}");
        sql.SET("super_password = #{record.superPassword,jdbcType=VARCHAR}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PwpMerchantCriteria example = (PwpMerchantCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(PwpMerchant record) {
        SQL sql = new SQL();
        sql.UPDATE("pwp_merchant");
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getBillingAccountId() != null) {
            sql.SET("billing_account_id = #{billingAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getContact() != null) {
            sql.SET("contact = #{contact,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponBalance() != null) {
            sql.SET("coupon_balance = #{couponBalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCouponDiscount() != null) {
            sql.SET("coupon_discount = #{couponDiscount,jdbcType=DOUBLE}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMerchantName() != null) {
            sql.SET("merchant_name = #{merchantName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantStatus() != null) {
            sql.SET("merchant_status = #{merchantStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getMerchantType() != null) {
            sql.SET("merchant_type = #{merchantType,jdbcType=SMALLINT}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPhotoUrl() != null) {
            sql.SET("photo_url = #{photoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getPosId() != null) {
            sql.SET("pos_id = #{posId,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperAccount() != null) {
            sql.SET("super_account = #{superAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getSuperPassword() != null) {
            sql.SET("super_password = #{superPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIntroduction() != null) {
            sql.SET("introduction = #{introduction,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_merchant
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, PwpMerchantCriteria example, boolean includeExamplePhrase) {
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