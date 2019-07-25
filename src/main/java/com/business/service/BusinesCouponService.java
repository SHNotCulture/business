package com.business.service;

import com.business.entity.TBusinesCoupon;
import com.business.entity.TParkInOut;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface BusinesCouponService {
    List<Map> getCouponPayMonth(TBusinesCoupon tBusinesCoupon, Integer year);
    List<Map> getCouponPayDay(TBusinesCoupon tBusinesCoupon, Integer year, Integer month);
    TBusinesCoupon setTBusinesCoupon();
    List<Map> returnCouponPayDay();
    List<Map> returnCouponPayMonth();
    Double couponSumPay();
    Double couponNeedPay();
    Double couponBalance();
    List getBusinesCouponByCarplate(TParkInOut tParkInOut);
    }

