package com.business.dao;

import com.business.dao.sqlProvider.TDicOuttypeSqlProvider;
import com.business.entity.TDicOuttype;
import com.business.entity.TDicOuttypeCriteria;
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

public interface TDicOuttypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @SelectProvider(type=TDicOuttypeSqlProvider.class, method="countByExample")
    long countByExample(TDicOuttypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TDicOuttypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TDicOuttypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_dic_outtype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_dic_outtype (id, outtype_id, ",
        "outtype_name, remarks)",
        "values (#{id,jdbcType=INTEGER}, #{outtypeId,jdbcType=INTEGER}, ",
        "#{outtypeName,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR})"
    })
    int insert(TDicOuttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @InsertProvider(type=TDicOuttypeSqlProvider.class, method="insertSelective")
    int insertSelective(TDicOuttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @SelectProvider(type=TDicOuttypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="outtype_id", property="outtypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="outtype_name", property="outtypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<TDicOuttype> selectByExample(TDicOuttypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, outtype_id, outtype_name, remarks",
        "from t_dic_outtype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="outtype_id", property="outtypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="outtype_name", property="outtypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    TDicOuttype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicOuttypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TDicOuttype record, @Param("example") TDicOuttypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicOuttypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TDicOuttype record, @Param("example") TDicOuttypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicOuttypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TDicOuttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_outtype
     *
     * @mbg.generated
     */
    @Update({
        "update t_dic_outtype",
        "set outtype_id = #{outtypeId,jdbcType=INTEGER},",
          "outtype_name = #{outtypeName,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TDicOuttype record);
}