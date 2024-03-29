package com.business.dao;

import com.business.dao.sqlProvider.TModuleListNewSqlProvider;
import com.business.entity.TModuleListNew;
import com.business.entity.TModuleListNewCriteria;
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

public interface TModuleListNewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @SelectProvider(type=TModuleListNewSqlProvider.class, method="countByExample")
    long countByExample(TModuleListNewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TModuleListNewSqlProvider.class, method="deleteByExample")
    int deleteByExample(TModuleListNewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_module_list_new",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_module_list_new (id, pid, ",
        "icon, url, name, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER}, ",
        "#{icon,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(TModuleListNew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @InsertProvider(type=TModuleListNewSqlProvider.class, method="insertSelective")
    int insertSelective(TModuleListNew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @SelectProvider(type=TModuleListNewSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<TModuleListNew> selectByExample(TModuleListNewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, pid, icon, url, name, remark",
        "from t_module_list_new",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    TModuleListNew selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TModuleListNewSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TModuleListNew record, @Param("example") TModuleListNewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TModuleListNewSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TModuleListNew record, @Param("example") TModuleListNewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TModuleListNewSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TModuleListNew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_module_list_new
     *
     * @mbg.generated
     */
    @Update({
        "update t_module_list_new",
        "set pid = #{pid,jdbcType=INTEGER},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TModuleListNew record);
}