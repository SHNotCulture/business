package com.business.dao.sqlProvider;

import com.business.entity.TBindingParking;
import com.business.entity.TBindingParkingCriteria.Criteria;
import com.business.entity.TBindingParkingCriteria.Criterion;
import com.business.entity.TBindingParkingCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TBindingParkingSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String countByExample(TBindingParkingCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_binding_parking");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String deleteByExample(TBindingParkingCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_binding_parking");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String insertSelective(TBindingParking record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_binding_parking");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkingNo() != null) {
            sql.VALUES("parking_no", "#{parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getCarType() != null) {
            sql.VALUES("car_type", "#{carType,jdbcType=INTEGER}");
        }
        
        if (record.getIsSync() != null) {
            sql.VALUES("is_sync", "#{isSync,jdbcType=INTEGER}");
        }
        
        if (record.getParkCarName() != null) {
            sql.VALUES("park_car_name", "#{parkCarName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.VALUES("company_id", "#{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.VALUES("begin_date", "#{beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.VALUES("binding_name", "#{bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getPayRule() != null) {
            sql.VALUES("pay_rule", "#{payRule,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.VALUES("is_use", "#{isUse,jdbcType=INTEGER}");
        }
        
        if (record.getCarPlate() != null) {
            sql.VALUES("car_plate", "#{carPlate,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getParkCode() != null) {
            sql.VALUES("park_code", "#{parkCode,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String selectByExampleWithBLOBs(TBindingParkingCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("park_id");
        sql.SELECT("parking_no");
        sql.SELECT("car_type");
        sql.SELECT("is_sync");
        sql.SELECT("park_car_name");
        sql.SELECT("company_id");
        sql.SELECT("status");
        sql.SELECT("begin_date");
        sql.SELECT("binding_name");
        sql.SELECT("end_date");
        sql.SELECT("pay_rule");
        sql.SELECT("is_use");
        sql.SELECT("car_plate");
        sql.SELECT("park_code");
        sql.SELECT("remark");
        sql.FROM("t_binding_parking");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String selectByExample(TBindingParkingCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("park_id");
        sql.SELECT("parking_no");
        sql.SELECT("car_type");
        sql.SELECT("is_sync");
        sql.SELECT("park_car_name");
        sql.SELECT("company_id");
        sql.SELECT("status");
        sql.SELECT("begin_date");
        sql.SELECT("binding_name");
        sql.SELECT("end_date");
        sql.SELECT("pay_rule");
        sql.SELECT("is_use");
        sql.FROM("t_binding_parking");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TBindingParking record = (TBindingParking) parameter.get("record");
        TBindingParkingCriteria example = (TBindingParkingCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_binding_parking");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkingNo() != null) {
            sql.SET("parking_no = #{record.parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getCarType() != null) {
            sql.SET("car_type = #{record.carType,jdbcType=INTEGER}");
        }
        
        if (record.getIsSync() != null) {
            sql.SET("is_sync = #{record.isSync,jdbcType=INTEGER}");
        }
        
        if (record.getParkCarName() != null) {
            sql.SET("park_car_name = #{record.parkCarName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{record.beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.SET("binding_name = #{record.bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{record.endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getPayRule() != null) {
            sql.SET("pay_rule = #{record.payRule,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.SET("is_use = #{record.isUse,jdbcType=INTEGER}");
        }
        
        if (record.getCarPlate() != null) {
            sql.SET("car_plate = #{record.carPlate,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getParkCode() != null) {
            sql.SET("park_code = #{record.parkCode,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_binding_parking");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("parking_no = #{record.parkingNo,jdbcType=INTEGER}");
        sql.SET("car_type = #{record.carType,jdbcType=INTEGER}");
        sql.SET("is_sync = #{record.isSync,jdbcType=INTEGER}");
        sql.SET("park_car_name = #{record.parkCarName,jdbcType=VARCHAR}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=VARCHAR}");
        sql.SET("binding_name = #{record.bindingName,jdbcType=VARCHAR}");
        sql.SET("end_date = #{record.endDate,jdbcType=VARCHAR}");
        sql.SET("pay_rule = #{record.payRule,jdbcType=INTEGER}");
        sql.SET("is_use = #{record.isUse,jdbcType=INTEGER}");
        sql.SET("car_plate = #{record.carPlate,jdbcType=LONGVARCHAR}");
        sql.SET("park_code = #{record.parkCode,jdbcType=LONGVARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        
        TBindingParkingCriteria example = (TBindingParkingCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_binding_parking");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("parking_no = #{record.parkingNo,jdbcType=INTEGER}");
        sql.SET("car_type = #{record.carType,jdbcType=INTEGER}");
        sql.SET("is_sync = #{record.isSync,jdbcType=INTEGER}");
        sql.SET("park_car_name = #{record.parkCarName,jdbcType=VARCHAR}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=VARCHAR}");
        sql.SET("binding_name = #{record.bindingName,jdbcType=VARCHAR}");
        sql.SET("end_date = #{record.endDate,jdbcType=VARCHAR}");
        sql.SET("pay_rule = #{record.payRule,jdbcType=INTEGER}");
        sql.SET("is_use = #{record.isUse,jdbcType=INTEGER}");
        
        TBindingParkingCriteria example = (TBindingParkingCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TBindingParking record) {
        SQL sql = new SQL();
        sql.UPDATE("t_binding_parking");
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkingNo() != null) {
            sql.SET("parking_no = #{parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getCarType() != null) {
            sql.SET("car_type = #{carType,jdbcType=INTEGER}");
        }
        
        if (record.getIsSync() != null) {
            sql.SET("is_sync = #{isSync,jdbcType=INTEGER}");
        }
        
        if (record.getParkCarName() != null) {
            sql.SET("park_car_name = #{parkCarName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.SET("binding_name = #{bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getPayRule() != null) {
            sql.SET("pay_rule = #{payRule,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.SET("is_use = #{isUse,jdbcType=INTEGER}");
        }
        
        if (record.getCarPlate() != null) {
            sql.SET("car_plate = #{carPlate,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getParkCode() != null) {
            sql.SET("park_code = #{parkCode,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_binding_parking
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TBindingParkingCriteria example, boolean includeExamplePhrase) {
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