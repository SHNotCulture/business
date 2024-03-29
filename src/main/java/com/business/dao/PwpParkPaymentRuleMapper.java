package com.business.dao;

import com.business.dao.sqlProvider.PwpParkPaymentRuleSqlProvider;
import com.business.entity.PwpParkPaymentRule;
import com.business.entity.PwpParkPaymentRuleCriteria;
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

public interface PwpParkPaymentRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkPaymentRuleSqlProvider.class, method="countByExample")
    long countByExample(PwpParkPaymentRuleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpParkPaymentRuleSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpParkPaymentRuleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_park_payment_rule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_park_payment_rule (id, league_id, ",
        "park_id, payment_rule_id, ",
        "priority)",
        "values (#{id,jdbcType=INTEGER}, #{leagueId,jdbcType=INTEGER}, ",
        "#{parkId,jdbcType=INTEGER}, #{paymentRuleId,jdbcType=INTEGER}, ",
        "#{priority,jdbcType=INTEGER})"
    })
    int insert(PwpParkPaymentRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpParkPaymentRuleSqlProvider.class, method="insertSelective")
    int insertSelective(PwpParkPaymentRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpParkPaymentRuleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="league_id", property="leagueId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_rule_id", property="paymentRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    List<PwpParkPaymentRule> selectByExample(PwpParkPaymentRuleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, league_id, park_id, payment_rule_id, priority",
        "from pwp_park_payment_rule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="league_id", property="leagueId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_rule_id", property="paymentRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    PwpParkPaymentRule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkPaymentRuleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpParkPaymentRule record, @Param("example") PwpParkPaymentRuleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkPaymentRuleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpParkPaymentRule record, @Param("example") PwpParkPaymentRuleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpParkPaymentRuleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpParkPaymentRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_park_payment_rule
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_park_payment_rule",
        "set league_id = #{leagueId,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "payment_rule_id = #{paymentRuleId,jdbcType=INTEGER},",
          "priority = #{priority,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpParkPaymentRule record);
}