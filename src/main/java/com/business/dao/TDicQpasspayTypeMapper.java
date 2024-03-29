package com.business.dao;

import com.business.dao.sqlProvider.TDicQpasspayTypeSqlProvider;
import com.business.entity.TDicQpasspayType;
import com.business.entity.TDicQpasspayTypeCriteria;
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

public interface TDicQpasspayTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @SelectProvider(type=TDicQpasspayTypeSqlProvider.class, method="countByExample")
    long countByExample(TDicQpasspayTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TDicQpasspayTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TDicQpasspayTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_dic_qpasspay_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_dic_qpasspay_type (id, paytype_id, ",
        "paytype_name, remarks)",
        "values (#{id,jdbcType=INTEGER}, #{paytypeId,jdbcType=INTEGER}, ",
        "#{paytypeName,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR})"
    })
    int insert(TDicQpasspayType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @InsertProvider(type=TDicQpasspayTypeSqlProvider.class, method="insertSelective")
    int insertSelective(TDicQpasspayType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @SelectProvider(type=TDicQpasspayTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="paytype_id", property="paytypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="paytype_name", property="paytypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<TDicQpasspayType> selectByExample(TDicQpasspayTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, paytype_id, paytype_name, remarks",
        "from t_dic_qpasspay_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="paytype_id", property="paytypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="paytype_name", property="paytypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    TDicQpasspayType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicQpasspayTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TDicQpasspayType record, @Param("example") TDicQpasspayTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicQpasspayTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TDicQpasspayType record, @Param("example") TDicQpasspayTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TDicQpasspayTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TDicQpasspayType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dic_qpasspay_type
     *
     * @mbg.generated
     */
    @Update({
        "update t_dic_qpasspay_type",
        "set paytype_id = #{paytypeId,jdbcType=INTEGER},",
          "paytype_name = #{paytypeName,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TDicQpasspayType record);
}