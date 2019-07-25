package com.business.service.impl;


import com.business.dao.TBusineMapper;
import com.business.entity.ApiRequest;
import com.business.entity.BusineCouponUpload;
import com.business.entity.TBusine;
import com.business.entity.TBusineCriteria;
import com.business.service.BusineService;
import com.business.service.MerchantService;
import com.business.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商户平台实现类
 */

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private TBusineMapper tBusineMapper;
    @Autowired
    private BusineService busineService;



    /**
     * 查询优惠类型
     * @param
     * @return
     */
    @Override
    public Integer getMerchantCouponType(TBusine tBusine) {
        Integer couponType =busineService.getBusine(tBusine).get(0).getDiscountType();
        return couponType;
    }

    @Override
    public String transferBusineCoupon(BusineCouponUpload busineCouponUpload) {
        Map<String,String> mapRequest = new HashMap<>();
        mapRequest.put("ID","001");
        mapRequest.put("key",MD5Util.MD5Encode("BDmlp48liikpom9hj7eczwj7aduGh7io" + StringUtil3.monthHOUR(-1)));
        mapRequest.put("parkId",busineCouponUpload.getParkId().toString());
        mapRequest.put("service","transferBusinCoupon");
        mapRequest.put("data",JsonUtil.beanToJson(busineCouponUpload));
        return HttpClientUtil.doPost("http://yun.eparking.top/GZBZTheThirdAPI/mainAction",mapRequest);
    }

    public static void main(String[] args) {
        /*BusineCouponUpload busineCouponUpload = new BusineCouponUpload();
        busineCouponUpload.setTicketId(19);
        busineCouponUpload.setParkId(274);
        busineCouponUpload.setInTime("2019-04-22 17:21:57");
        busineCouponUpload.setCouponType(3);
        busineCouponUpload.setCouponPay(10.00);
        busineCouponUpload.setCompanyId(1);
        busineCouponUpload.setCarPlate("粤CS0001");
        busineCouponUpload.setBusineId(360);
        busineCouponUpload.setBusineTicketId(26);
        Map<String,String> mapRequest = new HashMap<>();
        mapRequest.put("ID","001");
        mapRequest.put("key",MD5Util.MD5Encode("BDmlp48liikpom9hj7eczwj7aduGh7io" + StringUtil3.monthHOUR(-1)));
        mapRequest.put("parkId",busineCouponUpload.getParkId().toString());
        mapRequest.put("service","transferBusinCoupon");
        mapRequest.put("data",JsonUtil.beanToJson(busineCouponUpload));
        String r = HttpClientUtil.doPost("http://localhost:8080/mainAction",mapRequest);
        System.out.println(r);*/

        System.out.println("568".indexOf("5"));

    }

}
