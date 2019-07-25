package com.business.dao.sqlProvider;

import com.business.entity.TBusine;
import com.business.entity.TBusineCriteria.Criteria;
import com.business.entity.TBusineCriteria.Criterion;
import com.business.entity.TBusineCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TBusineSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String countByExample(TBusineCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_busine");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String deleteByExample(TBusineCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_busine");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String insertSelective(TBusine record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_busine");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyId() != null) {
            sql.VALUES("company_id", "#{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getBusineName() != null) {
            sql.VALUES("busine_name", "#{busineName,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=DOUBLE}");
        }
        
        if (record.getBusineType() != null) {
            sql.VALUES("busine_type", "#{busineType,jdbcType=INTEGER}");
        }
        
        if (record.getPrincipal() != null) {
            sql.VALUES("principal", "#{principal,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPosCode() != null) {
            sql.VALUES("pos_code", "#{posCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDiscount() != null) {
            sql.VALUES("discount", "#{discount,jdbcType=DECIMAL}");
        }
        
        if (record.getBusineStatus() != null) {
            sql.VALUES("busine_status", "#{busineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsfree() != null) {
            sql.VALUES("isfree", "#{isfree,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.VALUES("discount_amount", "#{discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountType() != null) {
            sql.VALUES("discount_type", "#{discountType,jdbcType=INTEGER}");
        }
        
        if (record.getInitialAmount() != null) {
            sql.VALUES("initial_amount", "#{initialAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getIsAuto() != null) {
            sql.VALUES("is_auto", "#{isAuto,jdbcType=INTEGER}");
        }
        
        if (record.getFixedAmount() != null) {
            sql.VALUES("fixed_amount", "#{fixedAmount,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String selectByExample(TBusineCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("company_id");
        sql.SELECT("park_id");
        sql.SELECT("busine_name");
        sql.SELECT("account");
        sql.SELECT("password");
        sql.SELECT("balance");
        sql.SELECT("busine_type");
        sql.SELECT("principal");
        sql.SELECT("phone");
        sql.SELECT("mobile");
        sql.SELECT("address");
        sql.SELECT("pos_code");
        sql.SELECT("discount");
        sql.SELECT("busine_status");
        sql.SELECT("remark");
        sql.SELECT("isfree");
        sql.SELECT("discount_amount");
        sql.SELECT("discount_type");
        sql.SELECT("initial_amount");
        sql.SELECT("is_auto");
        sql.SELECT("fixed_amount");
        sql.FROM("t_busine");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TBusine record = (TBusine) parameter.get("record");
        TBusineCriteria example = (TBusineCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_busine");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getBusineName() != null) {
            sql.SET("busine_name = #{record.busineName,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{record.balance,jdbcType=DOUBLE}");
        }
        
        if (record.getBusineType() != null) {
            sql.SET("busine_type = #{record.busineType,jdbcType=INTEGER}");
        }
        
        if (record.getPrincipal() != null) {
            sql.SET("principal = #{record.principal,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getPosCode() != null) {
            sql.SET("pos_code = #{record.posCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDiscount() != null) {
            sql.SET("discount = #{record.discount,jdbcType=DECIMAL}");
        }
        
        if (record.getBusineStatus() != null) {
            sql.SET("busine_status = #{record.busineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsfree() != null) {
            sql.SET("isfree = #{record.isfree,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.SET("discount_amount = #{record.discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountType() != null) {
            sql.SET("discount_type = #{record.discountType,jdbcType=INTEGER}");
        }
        
        if (record.getInitialAmount() != null) {
            sql.SET("initial_amount = #{record.initialAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getIsAuto() != null) {
            sql.SET("is_auto = #{record.isAuto,jdbcType=INTEGER}");
        }
        
        if (record.getFixedAmount() != null) {
            sql.SET("fixed_amount = #{record.fixedAmount,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_busine");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("busine_name = #{record.busineName,jdbcType=VARCHAR}");
        sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        sql.SET("balance = #{record.balance,jdbcType=DOUBLE}");
        sql.SET("busine_type = #{record.busineType,jdbcType=INTEGER}");
        sql.SET("principal = #{record.principal,jdbcType=VARCHAR}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("pos_code = #{record.posCode,jdbcType=VARCHAR}");
        sql.SET("discount = #{record.discount,jdbcType=DECIMAL}");
        sql.SET("busine_status = #{record.busineStatus,jdbcType=INTEGER}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("isfree = #{record.isfree,jdbcType=INTEGER}");
        sql.SET("discount_amount = #{record.discountAmount,jdbcType=INTEGER}");
        sql.SET("discount_type = #{record.discountType,jdbcType=INTEGER}");
        sql.SET("initial_amount = #{record.initialAmount,jdbcType=DOUBLE}");
        sql.SET("is_auto = #{record.isAuto,jdbcType=INTEGER}");
        sql.SET("fixed_amount = #{record.fixedAmount,jdbcType=DOUBLE}");
        
        TBusineCriteria example = (TBusineCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TBusine record) {
        SQL sql = new SQL();
        sql.UPDATE("t_busine");
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getBusineName() != null) {
            sql.SET("busine_name = #{busineName,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=DOUBLE}");
        }
        
        if (record.getBusineType() != null) {
            sql.SET("busine_type = #{busineType,jdbcType=INTEGER}");
        }
        
        if (record.getPrincipal() != null) {
            sql.SET("principal = #{principal,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPosCode() != null) {
            sql.SET("pos_code = #{posCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDiscount() != null) {
            sql.SET("discount = #{discount,jdbcType=DECIMAL}");
        }
        
        if (record.getBusineStatus() != null) {
            sql.SET("busine_status = #{busineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsfree() != null) {
            sql.SET("isfree = #{isfree,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.SET("discount_amount = #{discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountType() != null) {
            sql.SET("discount_type = #{discountType,jdbcType=INTEGER}");
        }
        
        if (record.getInitialAmount() != null) {
            sql.SET("initial_amount = #{initialAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getIsAuto() != null) {
            sql.SET("is_auto = #{isAuto,jdbcType=INTEGER}");
        }
        
        if (record.getFixedAmount() != null) {
            sql.SET("fixed_amount = #{fixedAmount,jdbcType=DOUBLE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TBusineCriteria example, boolean includeExamplePhrase) {
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