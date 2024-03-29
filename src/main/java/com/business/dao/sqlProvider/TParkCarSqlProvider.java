package com.business.dao.sqlProvider;

import com.business.entity.TParkCar;
import com.business.entity.TParkCarCriteria.Criteria;
import com.business.entity.TParkCarCriteria.Criterion;
import com.business.entity.TParkCarCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TParkCarSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String countByExample(TParkCarCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_park_car");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String deleteByExample(TParkCarCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_park_car");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String insertSelective(TParkCar record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_park_car");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.VALUES("begin_date", "#{beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindCarplate() != null) {
            sql.VALUES("bind_carplate", "#{bindCarplate,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.VALUES("company_id", "#{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getIsOwner() != null) {
            sql.VALUES("is_owner", "#{isOwner,jdbcType=SMALLINT}");
        }
        
        if (record.getIsReadcard() != null) {
            sql.VALUES("is_readcard", "#{isReadcard,jdbcType=SMALLINT}");
        }
        
        if (record.getIsSync() != null) {
            sql.VALUES("is_sync", "#{isSync,jdbcType=SMALLINT}");
        }
        
        if (record.getLockTime() != null) {
            sql.VALUES("lock_time", "#{lockTime,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberId() != null) {
            sql.VALUES("member_id", "#{memberId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayRule() != null) {
            sql.VALUES("pay_rule", "#{payRule,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        if (record.getStopDays() != null) {
            sql.VALUES("stop_days", "#{stopDays,jdbcType=INTEGER}");
        }
        
        if (record.getStopTime() != null) {
            sql.VALUES("stop_time", "#{stopTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.VALUES("port_id", "#{portId,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getCarPlate() != null) {
            sql.VALUES("car_plate", "#{carPlate,jdbcType=VARCHAR}");
        }
        
        if (record.getCarSeat() != null) {
            sql.VALUES("car_seat", "#{carSeat,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDelet() != null) {
            sql.VALUES("is_delet", "#{isDelet,jdbcType=SMALLINT}");
        }
        
        if (record.getLockStatus() != null) {
            sql.VALUES("lock_status", "#{lockStatus,jdbcType=INTEGER}");
        }
        
        if (record.getLockTimeStatus() != null) {
            sql.VALUES("lock_time_status", "#{lockTimeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getPayruleidstr() != null) {
            sql.VALUES("payRuleIdStr", "#{payruleidstr,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.VALUES("binding_name", "#{bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberCarId() != null) {
            sql.VALUES("member_car_id", "#{memberCarId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingSpace() != null) {
            sql.VALUES("parking_space", "#{parkingSpace,jdbcType=INTEGER}");
        }
        
        if (record.getBindParkCode() != null) {
            sql.VALUES("bind_park_code", "#{bindParkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingNo() != null) {
            sql.VALUES("parking_no", "#{parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.VALUES("is_use", "#{isUse,jdbcType=INTEGER}");
        }
        
        if (record.getParkCode() != null) {
            sql.VALUES("park_code", "#{parkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoRenew() != null) {
            sql.VALUES("auto_renew", "#{autoRenew,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCarColor() != null) {
            sql.VALUES("car_color", "#{carColor,jdbcType=VARCHAR}");
        }
        
        if (record.getCarType() != null) {
            sql.VALUES("car_type", "#{carType,jdbcType=INTEGER}");
        }
        
        if (record.getRealname() != null) {
            sql.VALUES("realname", "#{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getRenewalTime() != null) {
            sql.VALUES("renewal_time", "#{renewalTime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String selectByExample(TParkCarCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("begin_date");
        sql.SELECT("bind_carplate");
        sql.SELECT("company_id");
        sql.SELECT("create_time");
        sql.SELECT("end_date");
        sql.SELECT("is_owner");
        sql.SELECT("is_readcard");
        sql.SELECT("is_sync");
        sql.SELECT("lock_time");
        sql.SELECT("member_id");
        sql.SELECT("park_id");
        sql.SELECT("pay_rule");
        sql.SELECT("remark");
        sql.SELECT("status");
        sql.SELECT("stop_days");
        sql.SELECT("stop_time");
        sql.SELECT("port_id");
        sql.SELECT("address");
        sql.SELECT("car_plate");
        sql.SELECT("car_seat");
        sql.SELECT("is_delet");
        sql.SELECT("lock_status");
        sql.SELECT("lock_time_status");
        sql.SELECT("payRuleIdStr");
        sql.SELECT("binding_name");
        sql.SELECT("member_car_id");
        sql.SELECT("user_id");
        sql.SELECT("parking_space");
        sql.SELECT("bind_park_code");
        sql.SELECT("parking_no");
        sql.SELECT("is_use");
        sql.SELECT("park_code");
        sql.SELECT("auto_renew");
        sql.SELECT("phone");
        sql.SELECT("car_color");
        sql.SELECT("car_type");
        sql.SELECT("realname");
        sql.SELECT("renewal_time");
        sql.FROM("t_park_car");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TParkCar record = (TParkCar) parameter.get("record");
        TParkCarCriteria example = (TParkCarCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_park_car");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{record.beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindCarplate() != null) {
            sql.SET("bind_carplate = #{record.bindCarplate,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{record.endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getIsOwner() != null) {
            sql.SET("is_owner = #{record.isOwner,jdbcType=SMALLINT}");
        }
        
        if (record.getIsReadcard() != null) {
            sql.SET("is_readcard = #{record.isReadcard,jdbcType=SMALLINT}");
        }
        
        if (record.getIsSync() != null) {
            sql.SET("is_sync = #{record.isSync,jdbcType=SMALLINT}");
        }
        
        if (record.getLockTime() != null) {
            sql.SET("lock_time = #{record.lockTime,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberId() != null) {
            sql.SET("member_id = #{record.memberId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayRule() != null) {
            sql.SET("pay_rule = #{record.payRule,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        if (record.getStopDays() != null) {
            sql.SET("stop_days = #{record.stopDays,jdbcType=INTEGER}");
        }
        
        if (record.getStopTime() != null) {
            sql.SET("stop_time = #{record.stopTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.SET("port_id = #{record.portId,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getCarPlate() != null) {
            sql.SET("car_plate = #{record.carPlate,jdbcType=VARCHAR}");
        }
        
        if (record.getCarSeat() != null) {
            sql.SET("car_seat = #{record.carSeat,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDelet() != null) {
            sql.SET("is_delet = #{record.isDelet,jdbcType=SMALLINT}");
        }
        
        if (record.getLockStatus() != null) {
            sql.SET("lock_status = #{record.lockStatus,jdbcType=INTEGER}");
        }
        
        if (record.getLockTimeStatus() != null) {
            sql.SET("lock_time_status = #{record.lockTimeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getPayruleidstr() != null) {
            sql.SET("payRuleIdStr = #{record.payruleidstr,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.SET("binding_name = #{record.bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberCarId() != null) {
            sql.SET("member_car_id = #{record.memberCarId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingSpace() != null) {
            sql.SET("parking_space = #{record.parkingSpace,jdbcType=INTEGER}");
        }
        
        if (record.getBindParkCode() != null) {
            sql.SET("bind_park_code = #{record.bindParkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingNo() != null) {
            sql.SET("parking_no = #{record.parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.SET("is_use = #{record.isUse,jdbcType=INTEGER}");
        }
        
        if (record.getParkCode() != null) {
            sql.SET("park_code = #{record.parkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoRenew() != null) {
            sql.SET("auto_renew = #{record.autoRenew,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCarColor() != null) {
            sql.SET("car_color = #{record.carColor,jdbcType=VARCHAR}");
        }
        
        if (record.getCarType() != null) {
            sql.SET("car_type = #{record.carType,jdbcType=INTEGER}");
        }
        
        if (record.getRealname() != null) {
            sql.SET("realname = #{record.realname,jdbcType=VARCHAR}");
        }
        
        if (record.getRenewalTime() != null) {
            sql.SET("renewal_time = #{record.renewalTime,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_park_car");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=VARCHAR}");
        sql.SET("bind_carplate = #{record.bindCarplate,jdbcType=VARCHAR}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        sql.SET("end_date = #{record.endDate,jdbcType=VARCHAR}");
        sql.SET("is_owner = #{record.isOwner,jdbcType=SMALLINT}");
        sql.SET("is_readcard = #{record.isReadcard,jdbcType=SMALLINT}");
        sql.SET("is_sync = #{record.isSync,jdbcType=SMALLINT}");
        sql.SET("lock_time = #{record.lockTime,jdbcType=VARCHAR}");
        sql.SET("member_id = #{record.memberId,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("pay_rule = #{record.payRule,jdbcType=INTEGER}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        sql.SET("stop_days = #{record.stopDays,jdbcType=INTEGER}");
        sql.SET("stop_time = #{record.stopTime,jdbcType=VARCHAR}");
        sql.SET("port_id = #{record.portId,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("car_plate = #{record.carPlate,jdbcType=VARCHAR}");
        sql.SET("car_seat = #{record.carSeat,jdbcType=VARCHAR}");
        sql.SET("is_delet = #{record.isDelet,jdbcType=SMALLINT}");
        sql.SET("lock_status = #{record.lockStatus,jdbcType=INTEGER}");
        sql.SET("lock_time_status = #{record.lockTimeStatus,jdbcType=VARCHAR}");
        sql.SET("payRuleIdStr = #{record.payruleidstr,jdbcType=VARCHAR}");
        sql.SET("binding_name = #{record.bindingName,jdbcType=VARCHAR}");
        sql.SET("member_car_id = #{record.memberCarId,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        sql.SET("parking_space = #{record.parkingSpace,jdbcType=INTEGER}");
        sql.SET("bind_park_code = #{record.bindParkCode,jdbcType=VARCHAR}");
        sql.SET("parking_no = #{record.parkingNo,jdbcType=INTEGER}");
        sql.SET("is_use = #{record.isUse,jdbcType=INTEGER}");
        sql.SET("park_code = #{record.parkCode,jdbcType=VARCHAR}");
        sql.SET("auto_renew = #{record.autoRenew,jdbcType=INTEGER}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("car_color = #{record.carColor,jdbcType=VARCHAR}");
        sql.SET("car_type = #{record.carType,jdbcType=INTEGER}");
        sql.SET("realname = #{record.realname,jdbcType=VARCHAR}");
        sql.SET("renewal_time = #{record.renewalTime,jdbcType=VARCHAR}");
        
        TParkCarCriteria example = (TParkCarCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TParkCar record) {
        SQL sql = new SQL();
        sql.UPDATE("t_park_car");
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{beginDate,jdbcType=VARCHAR}");
        }
        
        if (record.getBindCarplate() != null) {
            sql.SET("bind_carplate = #{bindCarplate,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{endDate,jdbcType=VARCHAR}");
        }
        
        if (record.getIsOwner() != null) {
            sql.SET("is_owner = #{isOwner,jdbcType=SMALLINT}");
        }
        
        if (record.getIsReadcard() != null) {
            sql.SET("is_readcard = #{isReadcard,jdbcType=SMALLINT}");
        }
        
        if (record.getIsSync() != null) {
            sql.SET("is_sync = #{isSync,jdbcType=SMALLINT}");
        }
        
        if (record.getLockTime() != null) {
            sql.SET("lock_time = #{lockTime,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberId() != null) {
            sql.SET("member_id = #{memberId,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getPayRule() != null) {
            sql.SET("pay_rule = #{payRule,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        if (record.getStopDays() != null) {
            sql.SET("stop_days = #{stopDays,jdbcType=INTEGER}");
        }
        
        if (record.getStopTime() != null) {
            sql.SET("stop_time = #{stopTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.SET("port_id = #{portId,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getCarPlate() != null) {
            sql.SET("car_plate = #{carPlate,jdbcType=VARCHAR}");
        }
        
        if (record.getCarSeat() != null) {
            sql.SET("car_seat = #{carSeat,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDelet() != null) {
            sql.SET("is_delet = #{isDelet,jdbcType=SMALLINT}");
        }
        
        if (record.getLockStatus() != null) {
            sql.SET("lock_status = #{lockStatus,jdbcType=INTEGER}");
        }
        
        if (record.getLockTimeStatus() != null) {
            sql.SET("lock_time_status = #{lockTimeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getPayruleidstr() != null) {
            sql.SET("payRuleIdStr = #{payruleidstr,jdbcType=VARCHAR}");
        }
        
        if (record.getBindingName() != null) {
            sql.SET("binding_name = #{bindingName,jdbcType=VARCHAR}");
        }
        
        if (record.getMemberCarId() != null) {
            sql.SET("member_car_id = #{memberCarId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingSpace() != null) {
            sql.SET("parking_space = #{parkingSpace,jdbcType=INTEGER}");
        }
        
        if (record.getBindParkCode() != null) {
            sql.SET("bind_park_code = #{bindParkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingNo() != null) {
            sql.SET("parking_no = #{parkingNo,jdbcType=INTEGER}");
        }
        
        if (record.getIsUse() != null) {
            sql.SET("is_use = #{isUse,jdbcType=INTEGER}");
        }
        
        if (record.getParkCode() != null) {
            sql.SET("park_code = #{parkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoRenew() != null) {
            sql.SET("auto_renew = #{autoRenew,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCarColor() != null) {
            sql.SET("car_color = #{carColor,jdbcType=VARCHAR}");
        }
        
        if (record.getCarType() != null) {
            sql.SET("car_type = #{carType,jdbcType=INTEGER}");
        }
        
        if (record.getRealname() != null) {
            sql.SET("realname = #{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getRenewalTime() != null) {
            sql.SET("renewal_time = #{renewalTime,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_car
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TParkCarCriteria example, boolean includeExamplePhrase) {
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