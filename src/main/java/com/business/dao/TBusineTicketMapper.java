package com.business.dao;

import com.business.dao.sqlProvider.TBusineTicketSqlProvider;
import com.business.entity.TBusineTicket;
import com.business.entity.TBusineTicketCriteria;
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

public interface TBusineTicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @SelectProvider(type= TBusineTicketSqlProvider.class, method="countByExample")
    long countByExample(TBusineTicketCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TBusineTicketSqlProvider.class, method="deleteByExample")
    int deleteByExample(TBusineTicketCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_busine_ticket",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_busine_ticket (id, busine_id, ",
        "busine_name, ticket_id, ",
        "ticket_name, ticket_num, ",
        "limit_day, limit_month, ",
        "limit_year, expiry_date, ",
        "ticket_initial_num, company_id, ",
        "update_time, is_pay)",
        "values (#{id,jdbcType=INTEGER}, #{busineId,jdbcType=INTEGER}, ",
        "#{busineName,jdbcType=VARCHAR}, #{ticketId,jdbcType=INTEGER}, ",
        "#{ticketName,jdbcType=VARCHAR}, #{ticketNum,jdbcType=INTEGER}, ",
        "#{limitDay,jdbcType=INTEGER}, #{limitMonth,jdbcType=INTEGER}, ",
        "#{limitYear,jdbcType=INTEGER}, #{expiryDate,jdbcType=VARCHAR}, ",
        "#{ticketInitialNum,jdbcType=INTEGER}, #{companyId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=VARCHAR}, #{isPay,jdbcType=INTEGER})"
    })
    int insert(TBusineTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @InsertProvider(type=TBusineTicketSqlProvider.class, method="insertSelective")
    int insertSelective(TBusineTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @SelectProvider(type=TBusineTicketSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="busine_id", property="busineId", jdbcType=JdbcType.INTEGER),
        @Result(column="busine_name", property="busineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_id", property="ticketId", jdbcType=JdbcType.INTEGER),
        @Result(column="ticket_name", property="ticketName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_num", property="ticketNum", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_day", property="limitDay", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_month", property="limitMonth", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_year", property="limitYear", jdbcType=JdbcType.INTEGER),
        @Result(column="expiry_date", property="expiryDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_initial_num", property="ticketInitialNum", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_pay", property="isPay", jdbcType=JdbcType.INTEGER)
    })
    List<TBusineTicket> selectByExample(TBusineTicketCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, busine_id, busine_name, ticket_id, ticket_name, ticket_num, limit_day, limit_month, ",
        "limit_year, expiry_date, ticket_initial_num, company_id, update_time, is_pay",
        "from t_busine_ticket",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="busine_id", property="busineId", jdbcType=JdbcType.INTEGER),
        @Result(column="busine_name", property="busineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_id", property="ticketId", jdbcType=JdbcType.INTEGER),
        @Result(column="ticket_name", property="ticketName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_num", property="ticketNum", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_day", property="limitDay", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_month", property="limitMonth", jdbcType=JdbcType.INTEGER),
        @Result(column="limit_year", property="limitYear", jdbcType=JdbcType.INTEGER),
        @Result(column="expiry_date", property="expiryDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_initial_num", property="ticketInitialNum", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_pay", property="isPay", jdbcType=JdbcType.INTEGER)
    })
    TBusineTicket selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TBusineTicketSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TBusineTicket record, @Param("example") TBusineTicketCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TBusineTicketSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TBusineTicket record, @Param("example") TBusineTicketCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TBusineTicketSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TBusineTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_busine_ticket
     *
     * @mbg.generated
     */
    @Update({
        "update t_busine_ticket",
        "set busine_id = #{busineId,jdbcType=INTEGER},",
          "busine_name = #{busineName,jdbcType=VARCHAR},",
          "ticket_id = #{ticketId,jdbcType=INTEGER},",
          "ticket_name = #{ticketName,jdbcType=VARCHAR},",
          "ticket_num = #{ticketNum,jdbcType=INTEGER},",
          "limit_day = #{limitDay,jdbcType=INTEGER},",
          "limit_month = #{limitMonth,jdbcType=INTEGER},",
          "limit_year = #{limitYear,jdbcType=INTEGER},",
          "expiry_date = #{expiryDate,jdbcType=VARCHAR},",
          "ticket_initial_num = #{ticketInitialNum,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=VARCHAR},",
          "is_pay = #{isPay,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TBusineTicket record);
}