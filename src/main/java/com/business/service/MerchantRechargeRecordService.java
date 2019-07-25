package com.business.service;

import com.business.entity.TBusinePay;
import com.business.util.PageBean;

import java.util.List;

public interface MerchantRechargeRecordService {
    PageBean<TBusinePay> findMerchantRechargeRecordbyPage(TBusinePay tBusinePay, Integer busineId, String PayTimeBegin, String PayTimeEnd, Integer page, Integer limit);
    //List<TBusinePay> findMerchantPay(TBusinePay tBusinePay, String PayTimeBegin, String PayTimeEnd);
}
