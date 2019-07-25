package com.business.controller.work;


import com.business.aspect.HttpLog;
import com.business.entity.ControllerRsp;
import com.business.entity.TBusine;
import com.business.entity.TBusinePay;
import com.business.service.BusineService;
import com.business.service.MerchantRechargeRecordService;
import com.business.util.ControllerRspUtil;
import com.business.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author xiexuanran
 * @Description:
 * @Date Create in 2019-4-24 11:36
 * @Modified By:
 */

@RestController
@RequestMapping(value = "MerchantRechargeRecord")
public class MerchantRechargeRecordController {
    @Autowired
    private MerchantRechargeRecordService merchantRechargeRecordService;
    @Autowired
    private BusineService busineService;
    @PostMapping(value = "/getMerchantRechargeRecord")
    @HttpLog(operationType = "0",modularTypeName = "查询商户充值记录")
    public ControllerRsp getTMerchantPay(TBusinePay tBusinePay, String PayTimeBegin, String PayTimeEnd, Integer page, Integer limit, HttpServletRequest request){
        String timeType = request.getParameter("timeType");
        tBusinePay.setParkId(SessionUtil.getParkId());
        String account =  SessionUtil.getUser().getUserAccout();
        Integer busineId = busineService.selectByAccount(account).getId();
        return ControllerRspUtil.Success(merchantRechargeRecordService.findMerchantRechargeRecordbyPage(tBusinePay,busineId, PayTimeBegin, PayTimeEnd,page,limit));
    }
}
