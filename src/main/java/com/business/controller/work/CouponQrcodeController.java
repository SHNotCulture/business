package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.BusineService;
import com.business.service.CouponQrcodeRecordsService;
import com.business.service.ElectronicTicketService;
import com.business.util.ActionRspUtil;
import com.business.util.ControllerRspUtil;
import com.business.util.DateUtil;
import com.business.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * created by xiexuanran 2019-04-29
 */
@RestController
@RequestMapping(value = "couponQrcode")
public class CouponQrcodeController {

    @Autowired
    private CouponQrcodeRecordsService couponQrcodeRecordsService;
    @Autowired
    private BusineService busineService;
    @Autowired
    private ElectronicTicketService electronicTicketService;

    /**
     * 生成二维码优惠记录
     */
    @PostMapping(value = "/createCouponQrcode")
    @HttpLog(operationType = "0",modularTypeName = "生成优惠二维码列表")
    public ActionRsp createCouponQrcode(TConponQrcode tConponQrcode){
        couponQrcodeRecordsService.existQrcodeName(tConponQrcode);
        String account =  SessionUtil.getUser().getUserAccout();
        TBusine tBusine = busineService.selectByAccount(account);
        tConponQrcode.setCompanyId(SessionUtil.getCompany().getId());
        tConponQrcode.setParkId(SessionUtil.getParkId());
        tConponQrcode.setCreateTime(DateUtil.getCurDateTime());
        tConponQrcode.setBusineId(tBusine.getId());
        if (tConponQrcode.getTicketId()==null){
            couponQrcodeRecordsService.lessDiscountAmount(tConponQrcode,tBusine.getId());
            tConponQrcode.setTicketId(0);
        }else {
            TElectronicTicket tElectronicTicket = electronicTicketService.getElectronicTicketByPrimaryKey(tConponQrcode.getTicketId());
            tConponQrcode.setCouponPay(tElectronicTicket.getTicketValue());
        }
        tConponQrcode.setQrcodeUrl("http://yun.eparking.top/wechat/view/scope?parkid="+SessionUtil.getParkId()+"&companyId="+SessionUtil.getCompany().getId()+"&busineId="+tBusine.getId()+"&couponType="+tBusine.getDiscountType()+"&couponPay="+tConponQrcode.getCouponPay()+"&ticketId="+tConponQrcode.getTicketId()+"&qrcodeId=");
        couponQrcodeRecordsService.createCouponQrcode(tConponQrcode);
        Integer qrcodeId = couponQrcodeRecordsService.getIdCouponQrcode(tConponQrcode);
        tConponQrcode.setId(qrcodeId);
        tConponQrcode.setQrcodeUrl("http://yun.eparking.top/wechat/view/scope?parkid="+SessionUtil.getParkId()+"&companyId="+SessionUtil.getCompany().getId()+"&busineId="+tBusine.getId()+"&couponType="+tBusine.getDiscountType()+"&couponPay="+tConponQrcode.getCouponPay()+"&ticketId="+tConponQrcode.getTicketId()+"&qrcodeId="+qrcodeId);
        couponQrcodeRecordsService.updateCouponQrcode(tConponQrcode);
        return ActionRspUtil.Success(tConponQrcode.getQrcodeUrl());
    }

    /**
     * 查询二维码优惠记录
     */
    @PostMapping(value = "/getCouponQrcodeList")
    @HttpLog(operationType = "0",modularTypeName = "查询优惠二维码列表")
    public ControllerRsp getCouponQrcodeListbyPage(TConponQrcode tConponQrcode, HttpServletRequest request, Integer page, Integer limit){
        tConponQrcode.setCompanyId(SessionUtil.getCompany().getId());
        tConponQrcode.setParkId(SessionUtil.getParkId());
        return ControllerRspUtil.Success(couponQrcodeRecordsService.getCouponQrcodeListbyPage(tConponQrcode,page,limit));
    }
    /**
     * 编辑二维码优惠记录
     */
    @PostMapping(value = "/updateCouponQrcode")
    @HttpLog(operationType = "1",modularTypeName = "编辑优惠二维码")
    public ActionRsp updateCouponQrcode(TConponQrcode tConponQrcode, HttpServletRequest request){
        String account =  SessionUtil.getUser().getUserAccout();
        TBusine tBusine = busineService.selectByAccount(account);
        tConponQrcode.setCompanyId(SessionUtil.getCompany().getId());
        tConponQrcode.setParkId(SessionUtil.getParkId());
        tConponQrcode.setQrcodeUrl("http://yun.eparking.top/wechat/view/scope?parkid="+SessionUtil.getParkId()+"&companyId="+SessionUtil.getCompany().getId()+"&busineId="+tBusine.getId()+"&couponType="+tBusine.getDiscountType()+"&couponPay="+tConponQrcode.getCouponPay()+"&ticketId=0"+"&qrcodeId="+tConponQrcode.getId());
        return ActionRspUtil.Success(couponQrcodeRecordsService.updateCouponQrcode(tConponQrcode));
    }
    /**
     * 删除二维码优惠记录
     */
    @PostMapping(value = "/deleteCouponQrcode")
    @HttpLog(operationType = "1",modularTypeName = "删除优惠二维码")
    public ActionRsp deleteCouponQrcode(TConponQrcode tConponQrcode){
        return ActionRspUtil.Success(couponQrcodeRecordsService.deleteCouponQrcode(tConponQrcode));
    }

}
