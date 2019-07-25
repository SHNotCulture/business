package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.ControllerRsp;
import com.business.entity.TTicketCoupon;
import com.business.service.ElectronicCouponRecordsService;
import com.business.util.ControllerRspUtil;
import com.business.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author xiexuanran
 * @Description: 电子券使用记录查询
 * @Date Create in 2019-4-12 15:36
 * @Modified By:
 */
@RestController
@RequestMapping(value = "ticketCoupon")
public class ElectronicCouponRecordsController {
    private  static final Logger logger= LoggerFactory.getLogger(ElectronicCouponRecordsController.class);
    @Autowired
    private ElectronicCouponRecordsService electronicCouponRecordsService;

    /**
     *电子优惠券记录查询
     * @return
     */
    @PostMapping(value = "/getticketCoupon")
    @HttpLog(operationType = "0",modularTypeName = "查询电子优惠券记录")
    public ControllerRsp gettTicketCoupon(TTicketCoupon tTicketCoupon, Integer page, Integer limit, HttpServletRequest request,String InTimeBegin,String InTimeEnd,String OutTimeBegin,String OutTimeEnd){
        tTicketCoupon.setParkId(SessionUtil.getParkId());
        return ControllerRspUtil.Success(electronicCouponRecordsService.getTElectronicTicket(tTicketCoupon,InTimeBegin,InTimeEnd,OutTimeBegin,OutTimeEnd));
    }

}
