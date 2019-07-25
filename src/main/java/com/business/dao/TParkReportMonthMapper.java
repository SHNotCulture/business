package com.business.dao;

import com.business.dao.sqlProvider.TParkReportMonthSqlProvider;
import com.business.entity.TParkReportMonth;
import com.business.entity.TParkReportMonthCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TParkReportMonthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @SelectProvider(type=TParkReportMonthSqlProvider.class, method="countByExample")
    long countByExample(TParkReportMonthCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TParkReportMonthSqlProvider.class, method="deleteByExample")
    int deleteByExample(TParkReportMonthCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_park_report_month",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_park_report_month (id, business_circle_total, ",
        "center_charge_total, create_date, ",
        "fix_add, fix_cash_actual_total, ",
        "fix_cash_need_total, fix_online_actual_total, ",
        "fix_online_need_total, free_total, ",
        "park_id, temp_cash_actual_total, ",
        "temp_cash_need_total, temp_online_need_total, ",
        "temp_online_total, temp_BehalfPay_Total, ",
        "temp_Pay_diff, temp_NeedPay_Total, ",
        "temp_PrePay_Total, temp_qPassPay_Total, ",
        "temp_coupon_Total)",
        "values (#{id,jdbcType=INTEGER}, #{businessCircleTotal,jdbcType=DOUBLE}, ",
        "#{centerChargeTotal,jdbcType=DOUBLE}, #{createDate,jdbcType=VARCHAR}, ",
        "#{fixAdd,jdbcType=INTEGER}, #{fixCashActualTotal,jdbcType=DOUBLE}, ",
        "#{fixCashNeedTotal,jdbcType=DOUBLE}, #{fixOnlineActualTotal,jdbcType=DOUBLE}, ",
        "#{fixOnlineNeedTotal,jdbcType=DOUBLE}, #{freeTotal,jdbcType=INTEGER}, ",
        "#{parkId,jdbcType=INTEGER}, #{tempCashActualTotal,jdbcType=DOUBLE}, ",
        "#{tempCashNeedTotal,jdbcType=DOUBLE}, #{tempOnlineNeedTotal,jdbcType=DOUBLE}, ",
        "#{tempOnlineTotal,jdbcType=DOUBLE}, #{tempBehalfpayTotal,jdbcType=DOUBLE}, ",
        "#{tempPayDiff,jdbcType=DOUBLE}, #{tempNeedpayTotal,jdbcType=DOUBLE}, ",
        "#{tempPrepayTotal,jdbcType=DOUBLE}, #{tempQpasspayTotal,jdbcType=DOUBLE}, ",
        "#{tempCouponTotal,jdbcType=DOUBLE})"
    })
    int insert(TParkReportMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @InsertProvider(type=TParkReportMonthSqlProvider.class, method="insertSelective")
    int insertSelective(TParkReportMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @SelectProvider(type=TParkReportMonthSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="business_circle_total", property="businessCircleTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="center_charge_total", property="centerChargeTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="fix_add", property="fixAdd", jdbcType=JdbcType.INTEGER),
        @Result(column="fix_cash_actual_total", property="fixCashActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_cash_need_total", property="fixCashNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_online_actual_total", property="fixOnlineActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_online_need_total", property="fixOnlineNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="free_total", property="freeTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="temp_cash_actual_total", property="tempCashActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_cash_need_total", property="tempCashNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_online_need_total", property="tempOnlineNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_online_total", property="tempOnlineTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_BehalfPay_Total", property="tempBehalfpayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_Pay_diff", property="tempPayDiff", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_NeedPay_Total", property="tempNeedpayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_PrePay_Total", property="tempPrepayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_qPassPay_Total", property="tempQpasspayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_coupon_Total", property="tempCouponTotal", jdbcType=JdbcType.DOUBLE)
    })
    List<TParkReportMonth> selectByExample(TParkReportMonthCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, business_circle_total, center_charge_total, create_date, fix_add, fix_cash_actual_total, ",
        "fix_cash_need_total, fix_online_actual_total, fix_online_need_total, free_total, ",
        "park_id, temp_cash_actual_total, temp_cash_need_total, temp_online_need_total, ",
        "temp_online_total, temp_BehalfPay_Total, temp_Pay_diff, temp_NeedPay_Total, ",
        "temp_PrePay_Total, temp_qPassPay_Total, temp_coupon_Total",
        "from t_park_report_month",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="business_circle_total", property="businessCircleTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="center_charge_total", property="centerChargeTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="fix_add", property="fixAdd", jdbcType=JdbcType.INTEGER),
        @Result(column="fix_cash_actual_total", property="fixCashActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_cash_need_total", property="fixCashNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_online_actual_total", property="fixOnlineActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="fix_online_need_total", property="fixOnlineNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="free_total", property="freeTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="temp_cash_actual_total", property="tempCashActualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_cash_need_total", property="tempCashNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_online_need_total", property="tempOnlineNeedTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_online_total", property="tempOnlineTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_BehalfPay_Total", property="tempBehalfpayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_Pay_diff", property="tempPayDiff", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_NeedPay_Total", property="tempNeedpayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_PrePay_Total", property="tempPrepayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_qPassPay_Total", property="tempQpasspayTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="temp_coupon_Total", property="tempCouponTotal", jdbcType=JdbcType.DOUBLE)
    })
    TParkReportMonth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkReportMonthSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TParkReportMonth record, @Param("example") TParkReportMonthCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkReportMonthSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TParkReportMonth record, @Param("example") TParkReportMonthCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkReportMonthSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TParkReportMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_report_month
     *
     * @mbg.generated
     */
    @Update({
        "update t_park_report_month",
        "set business_circle_total = #{businessCircleTotal,jdbcType=DOUBLE},",
          "center_charge_total = #{centerChargeTotal,jdbcType=DOUBLE},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "fix_add = #{fixAdd,jdbcType=INTEGER},",
          "fix_cash_actual_total = #{fixCashActualTotal,jdbcType=DOUBLE},",
          "fix_cash_need_total = #{fixCashNeedTotal,jdbcType=DOUBLE},",
          "fix_online_actual_total = #{fixOnlineActualTotal,jdbcType=DOUBLE},",
          "fix_online_need_total = #{fixOnlineNeedTotal,jdbcType=DOUBLE},",
          "free_total = #{freeTotal,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "temp_cash_actual_total = #{tempCashActualTotal,jdbcType=DOUBLE},",
          "temp_cash_need_total = #{tempCashNeedTotal,jdbcType=DOUBLE},",
          "temp_online_need_total = #{tempOnlineNeedTotal,jdbcType=DOUBLE},",
          "temp_online_total = #{tempOnlineTotal,jdbcType=DOUBLE},",
          "temp_BehalfPay_Total = #{tempBehalfpayTotal,jdbcType=DOUBLE},",
          "temp_Pay_diff = #{tempPayDiff,jdbcType=DOUBLE},",
          "temp_NeedPay_Total = #{tempNeedpayTotal,jdbcType=DOUBLE},",
          "temp_PrePay_Total = #{tempPrepayTotal,jdbcType=DOUBLE},",
          "temp_qPassPay_Total = #{tempQpasspayTotal,jdbcType=DOUBLE},",
          "temp_coupon_Total = #{tempCouponTotal,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TParkReportMonth record);
}