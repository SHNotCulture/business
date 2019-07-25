package com.business.dao;

import com.business.dao.sqlProvider.TUserRoleSqlProvider;
import com.business.entity.TUserRole;
import com.business.entity.TUserRoleCriteria;
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

public interface TUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @SelectProvider(type=TUserRoleSqlProvider.class, method="countByExample")
    long countByExample(TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TUserRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_user_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_user_role (id, company_user_id, ",
        "role_power_id, remark)",
        "values (#{id,jdbcType=INTEGER}, #{companyUserId,jdbcType=INTEGER}, ",
        "#{rolePowerId,jdbcType=INTEGER}, #{remark,jdbcType=LONGVARCHAR})"
    })
    int insert(TUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @InsertProvider(type=TUserRoleSqlProvider.class, method="insertSelective")
    int insertSelective(TUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @SelectProvider(type=TUserRoleSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_user_id", property="companyUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_power_id", property="rolePowerId", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TUserRole> selectByExampleWithBLOBs(TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @SelectProvider(type=TUserRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_user_id", property="companyUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_power_id", property="rolePowerId", jdbcType=JdbcType.INTEGER)
    })
    List<TUserRole> selectByExample(TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, company_user_id, role_power_id, remark",
        "from t_user_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_user_id", property="companyUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_power_id", property="rolePowerId", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    TUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TUserRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TUserRole record, @Param("example") TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TUserRoleSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TUserRole record, @Param("example") TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TUserRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TUserRole record, @Param("example") TUserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TUserRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @Update({
        "update t_user_role",
        "set company_user_id = #{companyUserId,jdbcType=INTEGER},",
          "role_power_id = #{rolePowerId,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(TUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    @Update({
        "update t_user_role",
        "set company_user_id = #{companyUserId,jdbcType=INTEGER},",
          "role_power_id = #{rolePowerId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TUserRole record);
}