package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.BusineService;
import com.business.service.ElectronicTbusineTicketService;
import com.business.service.ElectronicTicketService;
import com.business.util.ActionRspUtil;
import com.business.util.ControllerRspUtil;
import com.business.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author jin
 * @Data 2019/4/28 15:36
 **/
@RestController
@RequestMapping(value = "electronicBusineTicket")
public class ElectronicBusineTicketController {

    @Autowired
    private BusineService busineService;
    @Autowired
    private ElectronicTbusineTicketService electronicTbusineTicketService;
    @Autowired
    private ElectronicTicketService electronicTicketService;
    /**
     * 查询商户电子券列表
     */
    @PostMapping(value = "/getBusineTicketList")
    @HttpLog(operationType = "0",modularTypeName = "查询电子券列表")
    public ControllerRsp getBusineTicketListbyPage(TBusineTicket tBusineTicket, HttpServletRequest request, Integer page, Integer limit){
        tBusineTicket.setBusineId(busineService.selectByAccount(SessionUtil.getUser().getUserAccout()).getId());
        return ControllerRspUtil.Success(electronicTbusineTicketService.getTBusineTicketByPage(tBusineTicket,page,limit));
    }

    /**
     * 回购电子券
     */
    @PostMapping(value = "/buyBackBusineTicket")
    @HttpLog(operationType = "0",modularTypeName = "回购电子券")
    public ActionRsp buyBackBusineTicket(TBusineTicket tBusineTicket, Integer buyBackNum){
        TBusinePay tBusinePay = new TBusinePay();
        TElectronicTicket tbt = electronicTicketService.getElectronicTicketByPrimaryKey(tBusineTicket.getTicketId());
        Double buyBackSum = tbt.getTicketValue() * buyBackNum;
        tBusinePay.setNeedPay(buyBackSum);
        tBusinePay.setActualPay(buyBackSum);
        tBusinePay.setBusineId(tBusineTicket.getBusineId());
        tBusinePay.setBusineName(tBusineTicket.getBusineName());
        TCompanyUser user= SessionUtil.getUser();
        tBusinePay.setCompanyId(user.getCompanyId());
        tBusinePay.setParkId(SessionUtil.getParkId());
        String aaa= busineService.BusineRecharge(tBusinePay,"2");

        return ActionRspUtil.Success(electronicTbusineTicketService.buyBackBusineTicket(tBusineTicket));
    }
}
