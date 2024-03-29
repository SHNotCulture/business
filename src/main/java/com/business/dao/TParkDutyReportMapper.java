package com.business.dao;

import com.business.dao.sqlProvider.TParkDutyReportSqlProvider;
import com.business.entity.TParkDutyReport;
import com.business.entity.TParkDutyReportCriteria;
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

public interface TParkDutyReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @SelectProvider(type=TParkDutyReportSqlProvider.class, method="countByExample")
    long countByExample(TParkDutyReportCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TParkDutyReportSqlProvider.class, method="deleteByExample")
    int deleteByExample(TParkDutyReportCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_park_duty_report",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_park_duty_report (id, actual_total, ",
        "create_date, duty_person, ",
        "free_pass, manual_pass, ",
        "match_pass, need_total, ",
        "sys_pass, park_id, ",
        "company_id)",
        "values (#{id,jdbcType=INTEGER}, #{actualTotal,jdbcType=DOUBLE}, ",
        "#{createDate,jdbcType=VARCHAR}, #{dutyPerson,jdbcType=VARCHAR}, ",
        "#{freePass,jdbcType=INTEGER}, #{manualPass,jdbcType=INTEGER}, ",
        "#{matchPass,jdbcType=INTEGER}, #{needTotal,jdbcType=DOUBLE}, ",
        "#{sysPass,jdbcType=INTEGER}, #{parkId,jdbcType=INTEGER}, ",
        "#{companyId,jdbcType=INTEGER})"
    })
    int insert(TParkDutyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @InsertProvider(type=TParkDutyReportSqlProvider.class, method="insertSelective")
    int insertSelective(TParkDutyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @SelectProvider(type=TParkDutyReportSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="actual_total", property="actualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="duty_person", property="dutyPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="free_pass", property="freePass", jdbcType=JdbcType.INTEGER),
        @Result(column="manual_pass", property="manualPass", jdbcType=JdbcType.INTEGER),
        @Result(column="match_pass", property="matchPass", jdbcType=JdbcType.INTEGER),
        @Result(column="need_total", property="needTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="sys_pass", property="sysPass", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER)
    })
    List<TParkDutyReport> selectByExample(TParkDutyReportCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, actual_total, create_date, duty_person, free_pass, manual_pass, match_pass, ",
        "need_total, sys_pass, park_id, company_id",
        "from t_park_duty_report",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="actual_total", property="actualTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="duty_person", property="dutyPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="free_pass", property="freePass", jdbcType=JdbcType.INTEGER),
        @Result(column="manual_pass", property="manualPass", jdbcType=JdbcType.INTEGER),
        @Result(column="match_pass", property="matchPass", jdbcType=JdbcType.INTEGER),
        @Result(column="need_total", property="needTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="sys_pass", property="sysPass", jdbcType=JdbcType.INTEGER),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER)
    })
    TParkDutyReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkDutyReportSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TParkDutyReport record, @Param("example") TParkDutyReportCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkDutyReportSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TParkDutyReport record, @Param("example") TParkDutyReportCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TParkDutyReportSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TParkDutyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_park_duty_report
     *
     * @mbg.generated
     */
    @Update({
        "update t_park_duty_report",
        "set actual_total = #{actualTotal,jdbcType=DOUBLE},",
          "create_date = #{createDate,jdbcType=VARCHAR},",
          "duty_person = #{dutyPerson,jdbcType=VARCHAR},",
          "free_pass = #{freePass,jdbcType=INTEGER},",
          "manual_pass = #{manualPass,jdbcType=INTEGER},",
          "match_pass = #{matchPass,jdbcType=INTEGER},",
          "need_total = #{needTotal,jdbcType=DOUBLE},",
          "sys_pass = #{sysPass,jdbcType=INTEGER},",
          "park_id = #{parkId,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TParkDutyReport record);
}