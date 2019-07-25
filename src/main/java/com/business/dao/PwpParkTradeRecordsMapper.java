package com.business.dao;

import com.business.dao.sqlProvider.PwpParkTradeRecordsSqlProvider;
import com.business.entity.PwpParkTradeRecords;
import com.business.entity.PwpParkTradeRecordsCriteria;
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

public interface PwpParkTradeRecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkTradeRecordsSqlProvider.class, method="countByExample")
    long countByExample(PwpParkTradeRecordsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpParkTradeRecordsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpParkTradeRecordsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_park_trade_records",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_park_trade_records (id, actual_pay, ",
        "balance, car_card_no, ",
        "car_num, car_num_in, ",
        "car_num_out, car_type, ",
        "client_id, coupon_code, ",
        "create_time, driver_card_in, ",
        "driver_card_no, driver_card_out, ",
        "enable_cash, end_time, ",
        "fee_type, mcard_member_id, ",
        "member_detail_id, merchant_discount, ",
        "need_pay, open_gate_in, ",
        "open_gate_out, park_id, ",
        "park_status, parkin_type, ",
        "parking_in_img, parking_out_img, ",
        "parking_out_type, port_id_in, ",
        "port_id_out, start_time, ",
        "trade_no, update_time, ",
        "user_id, user_name)",
        "values (#{id,jdbcType=INTEGER}, #{actualPay,jdbcType=DOUBLE}, ",
        "#{balance,jdbcType=DOUBLE}, #{carCardNo,jdbcType=VARCHAR}, ",
        "#{carNum,jdbcType=VARCHAR}, #{carNumIn,jdbcType=VARCHAR}, ",
        "#{carNumOut,jdbcType=VARCHAR}, #{carType,jdbcType=SMALLINT}, ",
        "#{clientId,jdbcType=INTEGER}, #{couponCode,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=VARCHAR}, #{driverCardIn,jdbcType=VARCHAR}, ",
        "#{driverCardNo,jdbcType=VARCHAR}, #{driverCardOut,jdbcType=VARCHAR}, ",
        "#{enableCash,jdbcType=SMALLINT}, #{endTime,jdbcType=VARCHAR}, ",
        "#{feeType,jdbcType=SMALLINT}, #{mcardMemberId,jdbcType=INTEGER}, ",
        "#{memberDetailId,jdbcType=INTEGER}, #{merchantDiscount,jdbcType=DOUBLE}, ",
        "#{needPay,jdbcType=DOUBLE}, #{openGateIn,jdbcType=VARCHAR}, ",
        "#{openGateOut,jdbcType=VARCHAR}, #{parkId,jdbcType=INTEGER}, ",
        "#{parkStatus,jdbcType=BIT}, #{parkinType,jdbcType=SMALLINT}, ",
        "#{parkingInImg,jdbcType=VARCHAR}, #{parkingOutImg,jdbcType=VARCHAR}, ",
        "#{parkingOutType,jdbcType=SMALLINT}, #{portIdIn,jdbcType=VARCHAR}, ",
        "#{portIdOut,jdbcType=VARCHAR}, #{startTime,jdbcType=VARCHAR}, ",
        "#{tradeNo,jdbcType=VARCHAR}, #{updateTime,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR})"
    })
    int insert(PwpParkTradeRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpParkTradeRecordsSqlProvider.class, method="insertSelective")
    int insertSelective(PwpParkTradeRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkTradeRecordsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="actual_pay", property="actualPay", jdbcType=JdbcType.DOUBLE),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DOUBLE),
        @Result(column="car_card_no", property="carCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num_in", property="carNumIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num_out", property="carNumOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_type", property="carType", jdbcType=JdbcType.SMALLINT),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_code", property="couponCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_in", property="driverCardIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_no", property="driverCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_out", property="driverCardOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable_cash", property="enableCash", jdbcType=JdbcType.SMALLINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="fee_type", property="feeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="mcard_member_id", property="mcardMemberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="merchant_discount", property="merchantDiscount", jdbcType=JdbcType.DOUBLE),
        @Result(column="need_pay", property="needPay", jdbcType=JdbcType.DOUBLE),
        @Result(column="open_gate_in", property="openGateIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_gate_out", property="openGateOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_status", property="parkStatus", jdbcType=JdbcType.BIT),
        @Result(column="parkin_type", property="parkinType", jdbcType=JdbcType.SMALLINT),
        @Result(column="parking_in_img", property="parkingInImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="parking_out_img", property="parkingOutImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="parking_out_type", property="parkingOutType", jdbcType=JdbcType.SMALLINT),
        @Result(column="port_id_in", property="portIdIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="port_id_out", property="portIdOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR)
    })
    List<PwpParkTradeRecords> selectByExample(PwpParkTradeRecordsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, actual_pay, balance, car_card_no, car_num, car_num_in, car_num_out, car_type, ",
        "client_id, coupon_code, create_time, driver_card_in, driver_card_no, driver_card_out, ",
        "enable_cash, end_time, fee_type, mcard_member_id, member_detail_id, merchant_discount, ",
        "need_pay, open_gate_in, open_gate_out, park_id, park_status, parkin_type, parking_in_img, ",
        "parking_out_img, parking_out_type, port_id_in, port_id_out, start_time, trade_no, ",
        "update_time, user_id, user_name",
        "from pwp_park_trade_records",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="actual_pay", property="actualPay", jdbcType=JdbcType.DOUBLE),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DOUBLE),
        @Result(column="car_card_no", property="carCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num_in", property="carNumIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num_out", property="carNumOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_type", property="carType", jdbcType=JdbcType.SMALLINT),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_code", property="couponCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_in", property="driverCardIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_no", property="driverCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="driver_card_out", property="driverCardOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable_cash", property="enableCash", jdbcType=JdbcType.SMALLINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="fee_type", property="feeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="mcard_member_id", property="mcardMemberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="merchant_discount", property="merchantDiscount", jdbcType=JdbcType.DOUBLE),
        @Result(column="need_pay", property="needPay", jdbcType=JdbcType.DOUBLE),
        @Result(column="open_gate_in", property="openGateIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_gate_out", property="openGateOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_status", property="parkStatus", jdbcType=JdbcType.BIT),
        @Result(column="parkin_type", property="parkinType", jdbcType=JdbcType.SMALLINT),
        @Result(column="parking_in_img", property="parkingInImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="parking_out_img", property="parkingOutImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="parking_out_type", property="parkingOutType", jdbcType=JdbcType.SMALLINT),
        @Result(column="port_id_in", property="portIdIn", jdbcType=JdbcType.VARCHAR),
        @Result(column="port_id_out", property="portIdOut", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR)
    })
    PwpParkTradeRecords selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkTradeRecordsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpParkTradeRecords record, @Param("example") PwpParkTradeRecordsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkTradeRecordsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpParkTradeRecords record, @Param("example") PwpParkTradeRecordsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkTradeRecordsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpParkTradeRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_trade_records
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_park_trade_records",
        "set actual_pay = #{actualPay,jdbcType=DOUBLE},",
          "balance = #{balance,jdbcType=DOUBLE},",
          "car_card_no = #{carCardNo,jdbcType=VARCHAR},",
          "car_num = #{carNum,jdbcType=VARCHAR},",
          "car_num_in = #{carNumIn,jdbcType=VARCHAR},",
          "car_num_out = #{carNumOut,jdbcType=VARCHAR},",
          "car_type = #{carType,jdbcType=SMALLINT},",
          "client_id = #{clientId,jdbcType=INTEGER},",
          "coupon_code = #{couponCode,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR},",
          "driver_card_in = #{driverCardIn,jdbcType=VARCHAR},",
          "driver_card_no = #{driverCardNo,jdbcType=VARCHAR},",
          "driver_card_out = #{driverCardOut,jdbcType=VARCHAR},",
          "enable_cash = #{enableCash,jdbcType=SMALLINT},",
          "end_time = #{endTime,jdbcType=VARCHAR},",
          "fee_type = #{feeType,jdbcType=SMALLINT},",
          "mcard_member_id = #{mcardMemberId,jdbcType=INTEGER},",
          "member_detail_id = #{memberDetailId,jdbcType=INTEGER},",
          "merchant_discount = #{merchantDiscount,jdbcType=DOUBLE},",
          "need_pay = #{needPay,jdbcType=DOUBLE},",
          "open_gate_in = #{openGateIn,jdbcType=VARCHAR},",
          "open_gate_out = #{openGateOut,jdbcType=VARCHAR},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "park_status = #{parkStatus,jdbcType=BIT},",
          "parkin_type = #{parkinType,jdbcType=SMALLINT},",
          "parking_in_img = #{parkingInImg,jdbcType=VARCHAR},",
          "parking_out_img = #{parkingOutImg,jdbcType=VARCHAR},",
          "parking_out_type = #{parkingOutType,jdbcType=SMALLINT},",
          "port_id_in = #{portIdIn,jdbcType=VARCHAR},",
          "port_id_out = #{portIdOut,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=VARCHAR},",
          "trade_no = #{tradeNo,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "user_name = #{userName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpParkTradeRecords record);
}