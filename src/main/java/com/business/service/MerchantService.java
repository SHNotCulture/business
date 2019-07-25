package com.business.service;


import com.business.entity.BusineCouponUpload;
import com.business.entity.TBusine;

public interface MerchantService {
    Integer getMerchantCouponType(TBusine tBusine);
    String transferBusineCoupon(BusineCouponUpload busineCouponUpload);
}
