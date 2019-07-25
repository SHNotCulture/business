package com.business.dao;

import com.business.dao.sqlProvider.TPaymentOrderSqlProvider;
import com.business.entity.TPaymentOrder;
import com.business.entity.TPaymentOrderCriteria;
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

public interface TPaymentOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @SelectProvider(type=TPaymentOrderSqlProvider.class, method="countByExample")
    long countByExample(TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TPaymentOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_payment_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_payment_order (id, deal_id, ",
        "mch_id, body, payment_method, ",
        "fee, carplate, park_id, ",
        "time_start, openid, ",
        "create_time, flag, ",
        "uplodeFlag, uplode_flag, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{dealId,jdbcType=VARCHAR}, ",
        "#{mchId,jdbcType=VARCHAR}, #{body,jdbcType=VARCHAR}, #{paymentMethod,jdbcType=VARCHAR}, ",
        "#{fee,jdbcType=DOUBLE}, #{carplate,jdbcType=VARCHAR}, #{parkId,jdbcType=VARCHAR}, ",
        "#{timeStart,jdbcType=TIMESTAMP}, #{openid,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{flag,jdbcType=INTEGER}, ",
        "#{uplodeflag,jdbcType=INTEGER}, #{uplodeFlag,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=LONGVARCHAR})"
    })
    int insert(TPaymentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @InsertProvider(type=TPaymentOrderSqlProvider.class, method="insertSelective")
    int insertSelective(TPaymentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @SelectProvider(type=TPaymentOrderSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deal_id", property="dealId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mch_id", property="mchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="payment_method", property="paymentMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DOUBLE),
        @Result(column="carplate", property="carplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_start", property="timeStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplodeFlag", property="uplodeflag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplode_flag", property="uplodeFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TPaymentOrder> selectByExampleWithBLOBs(TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @SelectProvider(type=TPaymentOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deal_id", property="dealId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mch_id", property="mchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="payment_method", property="paymentMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DOUBLE),
        @Result(column="carplate", property="carplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_start", property="timeStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplodeFlag", property="uplodeflag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplode_flag", property="uplodeFlag", jdbcType=JdbcType.INTEGER)
    })
    List<TPaymentOrder> selectByExample(TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, deal_id, mch_id, body, payment_method, fee, carplate, park_id, time_start, ",
        "openid, create_time, flag, uplodeFlag, uplode_flag, remark",
        "from t_payment_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deal_id", property="dealId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mch_id", property="mchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="payment_method", property="paymentMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DOUBLE),
        @Result(column="carplate", property="carplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_start", property="timeStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplodeFlag", property="uplodeflag", jdbcType=JdbcType.INTEGER),
        @Result(column="uplode_flag", property="uplodeFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    TPaymentOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TPaymentOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TPaymentOrder record, @Param("example") TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TPaymentOrderSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TPaymentOrder record, @Param("example") TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TPaymentOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TPaymentOrder record, @Param("example") TPaymentOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TPaymentOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TPaymentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @Update({
        "update t_payment_order",
        "set deal_id = #{dealId,jdbcType=VARCHAR},",
          "mch_id = #{mchId,jdbcType=VARCHAR},",
          "body = #{body,jdbcType=VARCHAR},",
          "payment_method = #{paymentMethod,jdbcType=VARCHAR},",
          "fee = #{fee,jdbcType=DOUBLE},",
          "carplate = #{carplate,jdbcType=VARCHAR},",
          "park_id = #{parkId,jdbcType=VARCHAR},",
          "time_start = #{timeStart,jdbcType=TIMESTAMP},",
          "openid = #{openid,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "flag = #{flag,jdbcType=INTEGER},",
          "uplodeFlag = #{uplodeflag,jdbcType=INTEGER},",
          "uplode_flag = #{uplodeFlag,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(TPaymentOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_payment_order
     *
     * @mbg.generated
     */
    @Update({
        "update t_payment_order",
        "set deal_id = #{dealId,jdbcType=VARCHAR},",
          "mch_id = #{mchId,jdbcType=VARCHAR},",
          "body = #{body,jdbcType=VARCHAR},",
          "payment_method = #{paymentMethod,jdbcType=VARCHAR},",
          "fee = #{fee,jdbcType=DOUBLE},",
          "carplate = #{carplate,jdbcType=VARCHAR},",
          "park_id = #{parkId,jdbcType=VARCHAR},",
          "time_start = #{timeStart,jdbcType=TIMESTAMP},",
          "openid = #{openid,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "flag = #{flag,jdbcType=INTEGER},",
          "uplodeFlag = #{uplodeflag,jdbcType=INTEGER},",
          "uplode_flag = #{uplodeFlag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TPaymentOrder record);
}