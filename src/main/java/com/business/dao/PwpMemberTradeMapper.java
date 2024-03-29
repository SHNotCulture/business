package com.business.dao;

import com.business.dao.sqlProvider.PwpMemberTradeSqlProvider;
import com.business.entity.PwpMemberTrade;
import com.business.entity.PwpMemberTradeCriteria;
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

public interface PwpMemberTradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpMemberTradeSqlProvider.class, method="countByExample")
    long countByExample(PwpMemberTradeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpMemberTradeSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpMemberTradeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_member_trade",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_member_trade (id, balance, ",
        "billing_account_id, car_num, ",
        "create_date, create_time, ",
        "member_detail_id, member_external_account, ",
        "member_id, member_p_card_id, ",
        "park_id, park_id_java, ",
        "sync_result, sync_time, ",
        "trade_amount, trade_no, ",
        "trade_result, trade_type, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{balance,jdbcType=DOUBLE}, ",
        "#{billingAccountId,jdbcType=INTEGER}, #{carNum,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=DATE}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{memberDetailId,jdbcType=INTEGER}, #{memberExternalAccount,jdbcType=VARCHAR}, ",
        "#{memberId,jdbcType=INTEGER}, #{memberPCardId,jdbcType=INTEGER}, ",
        "#{parkId,jdbcType=INTEGER}, #{parkIdJava,jdbcType=INTEGER}, ",
        "#{syncResult,jdbcType=SMALLINT}, #{syncTime,jdbcType=TIMESTAMP}, ",
        "#{tradeAmount,jdbcType=DOUBLE}, #{tradeNo,jdbcType=VARCHAR}, ",
        "#{tradeResult,jdbcType=SMALLINT}, #{tradeType,jdbcType=SMALLINT}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PwpMemberTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpMemberTradeSqlProvider.class, method="insertSelective")
    int insertSelective(PwpMemberTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpMemberTradeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DOUBLE),
        @Result(column="billing_account_id", property="billingAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_external_account", property="memberExternalAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_p_card_id", property="memberPCardId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id_java", property="parkIdJava", jdbcType=JdbcType.INTEGER),
        @Result(column="sync_result", property="syncResult", jdbcType=JdbcType.SMALLINT),
        @Result(column="sync_time", property="syncTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_amount", property="tradeAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_result", property="tradeResult", jdbcType=JdbcType.SMALLINT),
        @Result(column="trade_type", property="tradeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PwpMemberTrade> selectByExample(PwpMemberTradeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, balance, billing_account_id, car_num, create_date, create_time, member_detail_id, ",
        "member_external_account, member_id, member_p_card_id, park_id, park_id_java, ",
        "sync_result, sync_time, trade_amount, trade_no, trade_result, trade_type, update_time",
        "from pwp_member_trade",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DOUBLE),
        @Result(column="billing_account_id", property="billingAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_external_account", property="memberExternalAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_p_card_id", property="memberPCardId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id_java", property="parkIdJava", jdbcType=JdbcType.INTEGER),
        @Result(column="sync_result", property="syncResult", jdbcType=JdbcType.SMALLINT),
        @Result(column="sync_time", property="syncTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_amount", property="tradeAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_result", property="tradeResult", jdbcType=JdbcType.SMALLINT),
        @Result(column="trade_type", property="tradeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PwpMemberTrade selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMemberTradeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpMemberTrade record, @Param("example") PwpMemberTradeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMemberTradeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpMemberTrade record, @Param("example") PwpMemberTradeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMemberTradeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpMemberTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_member_trade
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_member_trade",
        "set balance = #{balance,jdbcType=DOUBLE},",
          "billing_account_id = #{billingAccountId,jdbcType=INTEGER},",
          "car_num = #{carNum,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=DATE},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "member_detail_id = #{memberDetailId,jdbcType=INTEGER},",
          "member_external_account = #{memberExternalAccount,jdbcType=VARCHAR},",
          "member_id = #{memberId,jdbcType=INTEGER},",
          "member_p_card_id = #{memberPCardId,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "park_id_java = #{parkIdJava,jdbcType=INTEGER},",
          "sync_result = #{syncResult,jdbcType=SMALLINT},",
          "sync_time = #{syncTime,jdbcType=TIMESTAMP},",
          "trade_amount = #{tradeAmount,jdbcType=DOUBLE},",
          "trade_no = #{tradeNo,jdbcType=VARCHAR},",
          "trade_result = #{tradeResult,jdbcType=SMALLINT},",
          "trade_type = #{tradeType,jdbcType=SMALLINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpMemberTrade record);
}