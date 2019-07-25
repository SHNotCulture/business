package com.business.service;

import com.business.entity.TConponQrcode;
import com.business.util.PageBean;

public interface CouponQrcodeRecordsService {
    PageBean<TConponQrcode> getCouponQrcodeListbyPage(TConponQrcode tConponQrcode, Integer page, Integer limit);
    String updateCouponQrcode(TConponQrcode tConponQrcode);
    String deleteCouponQrcode(TConponQrcode tConponQrcode);
    String createCouponQrcode(TConponQrcode tConponQrcode);
    Integer getIdCouponQrcode(TConponQrcode tConponQrcode);
    void existQrcodeName(TConponQrcode tConponQrcode);
    void lessDiscountAmount(TConponQrcode tConponQrcode, Integer busineId);
}
