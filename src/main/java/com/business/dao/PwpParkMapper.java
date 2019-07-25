package com.business.dao;

import com.business.dao.sqlProvider.PwpParkSqlProvider;
import com.business.entity.PwpPark;
import com.business.entity.PwpParkCriteria;
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

public interface PwpParkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkSqlProvider.class, method="countByExample")
    long countByExample(PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpParkSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_park",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_park (id, address, ",
        "bank_account, bank_card, ",
        "bank_name, create_time, ",
        "domain, external_account, ",
        "league_id, local_request_key, ",
        "month_rule, name, ",
        "park_num, park_plan, ",
        "park_status, park_type, ",
        "photo, position_x, ",
        "position_y, system_ratio, ",
        "total_num, update_time, ",
        "descript)",
        "values (#{id,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{bankAccount,jdbcType=VARCHAR}, #{bankCard,jdbcType=VARCHAR}, ",
        "#{bankName,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{domain,jdbcType=VARCHAR}, #{externalAccount,jdbcType=VARCHAR}, ",
        "#{leagueId,jdbcType=INTEGER}, #{localRequestKey,jdbcType=VARCHAR}, ",
        "#{monthRule,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{parkNum,jdbcType=INTEGER}, #{parkPlan,jdbcType=VARCHAR}, ",
        "#{parkStatus,jdbcType=SMALLINT}, #{parkType,jdbcType=SMALLINT}, ",
        "#{photo,jdbcType=VARCHAR}, #{positionX,jdbcType=VARCHAR}, ",
        "#{positionY,jdbcType=VARCHAR}, #{systemRatio,jdbcType=DOUBLE}, ",
        "#{totalNum,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{descript,jdbcType=LONGVARCHAR})"
    })
    int insert(PwpPark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpParkSqlProvider.class, method="insertSelective")
    int insertSelective(PwpPark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_account", property="bankAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card", property="bankCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="external_account", property="externalAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_id", property="leagueId", jdbcType=JdbcType.INTEGER),
        @Result(column="local_request_key", property="localRequestKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="month_rule", property="monthRule", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_num", property="parkNum", jdbcType=JdbcType.INTEGER),
        @Result(column="park_plan", property="parkPlan", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_status", property="parkStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="park_type", property="parkType", jdbcType=JdbcType.SMALLINT),
        @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_x", property="positionX", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_y", property="positionY", jdbcType=JdbcType.VARCHAR),
        @Result(column="system_ratio", property="systemRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="descript", property="descript", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PwpPark> selectByExampleWithBLOBs(PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_account", property="bankAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card", property="bankCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="external_account", property="externalAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_id", property="leagueId", jdbcType=JdbcType.INTEGER),
        @Result(column="local_request_key", property="localRequestKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="month_rule", property="monthRule", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_num", property="parkNum", jdbcType=JdbcType.INTEGER),
        @Result(column="park_plan", property="parkPlan", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_status", property="parkStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="park_type", property="parkType", jdbcType=JdbcType.SMALLINT),
        @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_x", property="positionX", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_y", property="positionY", jdbcType=JdbcType.VARCHAR),
        @Result(column="system_ratio", property="systemRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PwpPark> selectByExample(PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, address, bank_account, bank_card, bank_name, create_time, domain, external_account, ",
        "league_id, local_request_key, month_rule, name, park_num, park_plan, park_status, ",
        "park_type, photo, position_x, position_y, system_ratio, total_num, update_time, ",
        "descript",
        "from pwp_park",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_account", property="bankAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card", property="bankCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="external_account", property="externalAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_id", property="leagueId", jdbcType=JdbcType.INTEGER),
        @Result(column="local_request_key", property="localRequestKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="month_rule", property="monthRule", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_num", property="parkNum", jdbcType=JdbcType.INTEGER),
        @Result(column="park_plan", property="parkPlan", jdbcType=JdbcType.VARCHAR),
        @Result(column="park_status", property="parkStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="park_type", property="parkType", jdbcType=JdbcType.SMALLINT),
        @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_x", property="positionX", jdbcType=JdbcType.VARCHAR),
        @Result(column="position_y", property="positionY", jdbcType=JdbcType.VARCHAR),
        @Result(column="system_ratio", property="systemRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="descript", property="descript", jdbcType=JdbcType.LONGVARCHAR)
    })
    PwpPark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpPark record, @Param("example") PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PwpPark record, @Param("example") PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpPark record, @Param("example") PwpParkCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpPark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_park",
        "set address = #{address,jdbcType=VARCHAR},",
          "bank_account = #{bankAccount,jdbcType=VARCHAR},",
          "bank_card = #{bankCard,jdbcType=VARCHAR},",
          "bank_name = #{bankName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "domain = #{domain,jdbcType=VARCHAR},",
          "external_account = #{externalAccount,jdbcType=VARCHAR},",
          "league_id = #{leagueId,jdbcType=INTEGER},",
          "local_request_key = #{localRequestKey,jdbcType=VARCHAR},",
          "month_rule = #{monthRule,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "park_num = #{parkNum,jdbcType=INTEGER},",
          "park_plan = #{parkPlan,jdbcType=VARCHAR},",
          "park_status = #{parkStatus,jdbcType=SMALLINT},",
          "park_type = #{parkType,jdbcType=SMALLINT},",
          "photo = #{photo,jdbcType=VARCHAR},",
          "position_x = #{positionX,jdbcType=VARCHAR},",
          "position_y = #{positionY,jdbcType=VARCHAR},",
          "system_ratio = #{systemRatio,jdbcType=DOUBLE},",
          "total_num = #{totalNum,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "descript = #{descript,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(PwpPark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_park",
        "set address = #{address,jdbcType=VARCHAR},",
          "bank_account = #{bankAccount,jdbcType=VARCHAR},",
          "bank_card = #{bankCard,jdbcType=VARCHAR},",
          "bank_name = #{bankName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "domain = #{domain,jdbcType=VARCHAR},",
          "external_account = #{externalAccount,jdbcType=VARCHAR},",
          "league_id = #{leagueId,jdbcType=INTEGER},",
          "local_request_key = #{localRequestKey,jdbcType=VARCHAR},",
          "month_rule = #{monthRule,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "park_num = #{parkNum,jdbcType=INTEGER},",
          "park_plan = #{parkPlan,jdbcType=VARCHAR},",
          "park_status = #{parkStatus,jdbcType=SMALLINT},",
          "park_type = #{parkType,jdbcType=SMALLINT},",
          "photo = #{photo,jdbcType=VARCHAR},",
          "position_x = #{positionX,jdbcType=VARCHAR},",
          "position_y = #{positionY,jdbcType=VARCHAR},",
          "system_ratio = #{systemRatio,jdbcType=DOUBLE},",
          "total_num = #{totalNum,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpPark record);
}