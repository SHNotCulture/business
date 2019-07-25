package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.*;
import com.business.util.ActionRspUtil;
import com.business.util.ControllerRspUtil;
import com.business.util.SessionUtil;
import com.business.service.BusineService;

import com.business.service.BusinesCouponService;
import com.business.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping(value = "Merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @Autowired
    private BusineService busineService;
    @Autowired
    private ElectronicTbusineTicketService electronicTbusineTicketService;
    @Autowired
    private ElectronicTicketService electronicTicketService;

    @Autowired
    private BusinesCouponService businesCouponService;

    @Autowired
    private PresentCarService presentCarService;

    @PostMapping(value = "/indexMonth")
    @HttpLog(operationType = "0",modularTypeName = "按日查询支出")
    public ActionRsp indexMonth(){
        return ActionRspUtil.Success(businesCouponService.returnCouponPayDay());
    }

    @PostMapping(value = "/indexYear")
    @HttpLog(operationType = "0",modularTypeName = "按月查询支出")
    public ActionRsp indexYear(){
        return ActionRspUtil.Success(businesCouponService.returnCouponPayMonth()); }

    @PostMapping(value = "/getCouponType")
    @HttpLog(operationType = "0",modularTypeName = "查询商户优惠类型")
    public ActionRsp getCouponType(HttpServletRequest request,TBusine tBusine){
         TCompanyUser tCompanyUser = SessionUtil.getUser();
         tBusine.setAccount(tCompanyUser.getUserAccout());
        Integer CouponType = merchantService.getMerchantCouponType(tBusine);

        ActionRsp actionRsp= ActionRspUtil.Success(CouponType);

        return actionRsp;
    }

    @PostMapping(value = "/getCarIntime")
    @HttpLog(operationType = "0",modularTypeName = "查询在场车辆时间")
    public ActionRsp getIntime(String carPlate){
        String inTime=presentCarService.selectPresentCarByCarplate(SessionUtil.getParkId(),carPlate);
        return  ActionRspUtil.Success(inTime);
    }

    @PostMapping(value = "/getCarPlateFuzzy")
    @HttpLog(operationType = "0",modularTypeName = "模糊查询车牌号")
    public ActionRsp getCarPlateFuzzy(Integer parkId,String carPlate){
        parkId = SessionUtil.getParkId();
        return ActionRspUtil.Success(presentCarService.selectPresentCarLikeCarplate(parkId,carPlate));
    }



    @PostMapping(value = "/transferBusineCoupon")
    @HttpLog(operationType = "1",modularTypeName = "商户下发优惠")
    public ActionRsp transferBusineCoupon(HttpServletRequest request,BusineCouponUpload busineCouponUpload){
        busineCouponUpload.setParkId(SessionUtil.getParkId());
        busineCouponUpload.setBusineId(busineService.selectByAccount(SessionUtil.getUser().getUserAccout()).getId());
        if (busineCouponUpload.getTicketId()!=null){
        busineCouponUpload.setBusineTicketId(electronicTbusineTicketService.getTBusineTicketExpireSoon(busineCouponUpload.getBusineId(),busineCouponUpload.getTicketId()));}
        return ActionRspUtil.Success(merchantService.transferBusineCoupon(busineCouponUpload));
    }
    @PostMapping(value = "/getBusineTicket")
    @HttpLog(operationType = "0",modularTypeName = "查询商户拥有的可使用的电子劵")
    public ControllerRsp getBusineTicket(TBusineTicket tBusineTicket, HttpServletRequest request, Integer page, Integer limit){
        tBusineTicket.setBusineId(busineService.selectByAccount(SessionUtil.getUser().getUserAccout()).getId());
        return ControllerRspUtil.Success(electronicTicketService.geteTicketListbyPageAndIds(electronicTbusineTicketService.getIdsByUsable(tBusineTicket), page,limit));
    }

    @PostMapping(value = "/selectSumPay")
    @HttpLog(operationType = "0",modularTypeName = "查询商户累计消费信息")
    public ActionRsp selectSumPay(){
        Map map = new HashMap();
        map.put("couponNeedPay",businesCouponService.couponNeedPay());
        map.put("couponSumPay",businesCouponService.couponSumPay());
        map.put("couponBalance",businesCouponService.couponBalance());
        return ActionRspUtil.Success(map);
    }
}
