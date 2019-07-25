package com.business.service;

import com.business.entity.TBusinesCoupon;
import com.business.util.PageBean;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MerchantCouponRecordService {
    PageBean<TBusinesCoupon> FindMerchantCouponbyPage(TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd, Integer page, Integer limit);
    List<TBusinesCoupon> FindMerchantCoupon(TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd);
}
