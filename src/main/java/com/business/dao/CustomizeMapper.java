package com.business.dao;

import com.business.dao.sqlProvider.CustomizeSqlProvider;
import com.business.dao.sqlProvider.TParkCarSqlProvider;
import com.business.entity.*;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;
import java.util.Map;

public interface CustomizeMapper {


    /**
     * 搜索在场记录（根据车牌）
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="selectPresentCarByCarplate")
    TParkInOut selectPresentCarByCarplate(String parkId, String carplate);

    /**
     * 搜索在场车辆总数
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="selectPresentCar")
    Integer selectPresentCarNum(String type, String parkId, String andSql);

    /**
     * 模糊搜索在场车牌（根据车牌）
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="selectPresentCarLikeCarplate")
    List<String> selectPresentCarLikeCarplate(Integer parkId, String carplate);

    /**
     * 查询商户最接近过期的电子劵
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="getTBusineTicketExpireSoon")
    Integer getTBusineTicketExpireSoon(Integer busineId, Integer ticketId);

    /**
     * 按月份查询支出金额
     * @param tBusinesCoupon
     * @param
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="getCouponPayMonth")
    List<Map> getCouponPayMonth(TBusinesCoupon tBusinesCoupon, Integer year);

    /**
     * 按天数查询支出金额
     * @param tBusinesCoupon
     * @param year
     * @param month
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="getCouponPayDay")
    List<Map> getCouponPayDay(TBusinesCoupon tBusinesCoupon, Integer year, Integer month);

    /**
     * 查询商户累计消费金额
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="getCouponSumPay")
    Double getCouponSumPay(TBusinesCoupon tBusinesCoupon);

    /**
     * 查询商户累计充值金额
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="getCouponNeedPay")
    Double getCouponNeedPay(TBusinesCoupon tBusinesCoupon);

    /**
     * 搜索在场车辆
     * @return
     */
    @SelectProvider(type=CustomizeSqlProvider.class, method="selectPresentCar")
    List<TParkInOut> selectPresentCar(String type, String parkId, String andSql);


}
