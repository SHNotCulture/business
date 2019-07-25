package com.business.dao;

import com.business.dao.sqlProvider.PwpMcardMemberSqlProvider;
import com.business.entity.PwpMcardMember;
import com.business.entity.PwpMcardMemberCriteria;
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

public interface PwpMcardMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpMcardMemberSqlProvider.class, method="countByExample")
    long countByExample(PwpMcardMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpMcardMemberSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpMcardMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_mcard_member",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_mcard_member (id, address, ",
        "begin_date, car_num, ",
        "contact, create_from, ",
        "create_time, end_date, ",
        "is_owner, mcard_deposit, ",
        "mcard_rule_id, mcard_status, ",
        "member_detail_id, member_id, ",
        "park_id, park_port_ids, ",
        "realname, show_card, ",
        "stop_days, stop_time, ",
        "sync_status, sync_to_local, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{beginDate,jdbcType=VARCHAR}, #{carNum,jdbcType=VARCHAR}, ",
        "#{contact,jdbcType=VARCHAR}, #{createFrom,jdbcType=SMALLINT}, ",
        "#{createTime,jdbcType=VARCHAR}, #{endDate,jdbcType=VARCHAR}, ",
        "#{isOwner,jdbcType=SMALLINT}, #{mcardDeposit,jdbcType=DOUBLE}, ",
        "#{mcardRuleId,jdbcType=INTEGER}, #{mcardStatus,jdbcType=SMALLINT}, ",
        "#{memberDetailId,jdbcType=INTEGER}, #{memberId,jdbcType=INTEGER}, ",
        "#{parkId,jdbcType=INTEGER}, #{parkPortIds,jdbcType=VARCHAR}, ",
        "#{realname,jdbcType=VARCHAR}, #{showCard,jdbcType=SMALLINT}, ",
        "#{stopDays,jdbcType=INTEGER}, #{stopTime,jdbcType=VARCHAR}, ",
        "#{syncStatus,jdbcType=SMALLINT}, #{syncToLocal,jdbcType=SMALLINT}, ",
        "#{updateTime,jdbcType=VARCHAR})"
    })
    int insert(PwpMcardMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpMcardMemberSqlProvider.class, method="insertSelective")
    int insertSelective(PwpMcardMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpMcardMemberSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_from", property="createFrom", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_owner", property="isOwner", jdbcType=JdbcType.SMALLINT),
        @Result(column="mcard_deposit", property="mcardDeposit", jdbcType=JdbcType.DOUBLE),
        @Result(column="mcard_rule_id", property="mcardRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="mcard_status", property="mcardStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_port_ids", property="parkPortIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_card", property="showCard", jdbcType=JdbcType.SMALLINT),
        @Result(column="stop_days", property="stopDays", jdbcType=JdbcType.INTEGER),
        @Result(column="stop_time", property="stopTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="sync_status", property="syncStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="sync_to_local", property="syncToLocal", jdbcType=JdbcType.SMALLINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR)
    })
    List<PwpMcardMember> selectByExample(PwpMcardMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, address, begin_date, car_num, contact, create_from, create_time, end_date, ",
        "is_owner, mcard_deposit, mcard_rule_id, mcard_status, member_detail_id, member_id, ",
        "park_id, park_port_ids, realname, show_card, stop_days, stop_time, sync_status, ",
        "sync_to_local, update_time",
        "from pwp_mcard_member",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_num", property="carNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_from", property="createFrom", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_owner", property="isOwner", jdbcType=JdbcType.SMALLINT),
        @Result(column="mcard_deposit", property="mcardDeposit", jdbcType=JdbcType.DOUBLE),
        @Result(column="mcard_rule_id", property="mcardRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="mcard_status", property="mcardStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="member_detail_id", property="memberDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_port_ids", property="parkPortIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_card", property="showCard", jdbcType=JdbcType.SMALLINT),
        @Result(column="stop_days", property="stopDays", jdbcType=JdbcType.INTEGER),
        @Result(column="stop_time", property="stopTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="sync_status", property="syncStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="sync_to_local", property="syncToLocal", jdbcType=JdbcType.SMALLINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR)
    })
    PwpMcardMember selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMcardMemberSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpMcardMember record, @Param("example") PwpMcardMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMcardMemberSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpMcardMember record, @Param("example") PwpMcardMemberCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpMcardMemberSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpMcardMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_mcard_member
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_mcard_member",
        "set address = #{address,jdbcType=VARCHAR},",
          "begin_date = #{beginDate,jdbcType=VARCHAR},",
          "car_num = #{carNum,jdbcType=VARCHAR},",
          "contact = #{contact,jdbcType=VARCHAR},",
          "create_from = #{createFrom,jdbcType=SMALLINT},",
          "create_time = #{createTime,jdbcType=VARCHAR},",
          "end_date = #{endDate,jdbcType=VARCHAR},",
          "is_owner = #{isOwner,jdbcType=SMALLINT},",
          "mcard_deposit = #{mcardDeposit,jdbcType=DOUBLE},",
          "mcard_rule_id = #{mcardRuleId,jdbcType=INTEGER},",
          "mcard_status = #{mcardStatus,jdbcType=SMALLINT},",
          "member_detail_id = #{memberDetailId,jdbcType=INTEGER},",
          "member_id = #{memberId,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "park_port_ids = #{parkPortIds,jdbcType=VARCHAR},",
          "realname = #{realname,jdbcType=VARCHAR},",
          "show_card = #{showCard,jdbcType=SMALLINT},",
          "stop_days = #{stopDays,jdbcType=INTEGER},",
          "stop_time = #{stopTime,jdbcType=VARCHAR},",
          "sync_status = #{syncStatus,jdbcType=SMALLINT},",
          "sync_to_local = #{syncToLocal,jdbcType=SMALLINT},",
          "update_time = #{updateTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpMcardMember record);
}