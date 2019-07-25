package com.business.dao;

import com.business.dao.sqlProvider.PwpLeagueSqlProvider;
import com.business.entity.PwpLeague;
import com.business.entity.PwpLeagueCriteria;
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

public interface PwpLeagueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpLeagueSqlProvider.class, method="countByExample")
    long countByExample(PwpLeagueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @DeleteProvider(type=PwpLeagueSqlProvider.class, method="deleteByExample")
    int deleteByExample(PwpLeagueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pwp_league",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pwp_league (id, account, ",
        "address, contact, ",
        "contact_phone, create_time, ",
        "domain, league_name, ",
        "league_status, league_type, ",
        "logo, password, ",
        "update_time, website)",
        "values (#{id,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{contact,jdbcType=VARCHAR}, ",
        "#{contactPhone,jdbcType=VARCHAR}, #{createTime,jdbcType=VARCHAR}, ",
        "#{domain,jdbcType=VARCHAR}, #{leagueName,jdbcType=VARCHAR}, ",
        "#{leagueStatus,jdbcType=INTEGER}, #{leagueType,jdbcType=INTEGER}, ",
        "#{logo,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=VARCHAR}, #{website,jdbcType=VARCHAR})"
    })
    int insert(PwpLeague record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @InsertProvider(type=PwpLeagueSqlProvider.class, method="insertSelective")
    int insertSelective(PwpLeague record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @SelectProvider(type=PwpLeagueSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_phone", property="contactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_name", property="leagueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_status", property="leagueStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="league_type", property="leagueType", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="website", property="website", jdbcType=JdbcType.VARCHAR)
    })
    List<PwpLeague> selectByExample(PwpLeagueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, account, address, contact, contact_phone, create_time, domain, league_name, ",
        "league_status, league_type, logo, password, update_time, website",
        "from pwp_league",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_phone", property="contactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_name", property="leagueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="league_status", property="leagueStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="league_type", property="leagueType", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="website", property="website", jdbcType=JdbcType.VARCHAR)
    })
    PwpLeague selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpLeagueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PwpLeague record, @Param("example") PwpLeagueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpLeagueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PwpLeague record, @Param("example") PwpLeagueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @UpdateProvider(type=PwpLeagueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PwpLeague record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pwp_league
     *
     * @mbg.generated
     */
    @Update({
        "update pwp_league",
        "set account = #{account,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "contact = #{contact,jdbcType=VARCHAR},",
          "contact_phone = #{contactPhone,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR},",
          "domain = #{domain,jdbcType=VARCHAR},",
          "league_name = #{leagueName,jdbcType=VARCHAR},",
          "league_status = #{leagueStatus,jdbcType=INTEGER},",
          "league_type = #{leagueType,jdbcType=INTEGER},",
          "logo = #{logo,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=VARCHAR},",
          "website = #{website,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PwpLeague record);
}