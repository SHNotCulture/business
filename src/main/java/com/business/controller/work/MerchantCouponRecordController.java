package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.ControllerRsp;
import com.business.entity.TBusinesCoupon;
import com.business.service.BusineService;
import com.business.service.MerchantCouponRecordService;
import com.business.util.ControllerRspUtil;
import com.business.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author xiexuanran
 * @Description: 查询商户消费记录
 * @Date Create in 2019-4-15 11:36
 * @Modified By:
 */

@RestController
@RequestMapping(value = "MerchantCouponRecord")
public class MerchantCouponRecordController {

    @Autowired
    private MerchantCouponRecordService merchantCouponRecordService;
    @Autowired
    private BusineService busineService;

    @PostMapping(value = "/getMerchantCoupon")
    @HttpLog(operationType = "0",modularTypeName = "查询商户消费记录")
    public ControllerRsp getTMerchantCoupon(TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd,Integer page, Integer limit,HttpServletRequest request){
        tBusinesCoupon.setParkId(SessionUtil.getParkId());   //通过登录信息获得车场ID
        String account =  SessionUtil.getUser().getUserAccout();
        Integer busineId = busineService.selectByAccount(account).getId();     //通过登录信息中account获得商户ID
        tBusinesCoupon.setBusineId(busineId);
        return ControllerRspUtil.Success(merchantCouponRecordService.FindMerchantCouponbyPage(tBusinesCoupon, CouponTimeBegin, CouponTimeEnd,page,limit));
    }
}
