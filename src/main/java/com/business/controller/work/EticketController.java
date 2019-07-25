package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.ActionRsp;
import com.business.entity.ControllerRsp;
import com.business.entity.TElectronicTicket;
import com.business.service.ElectronicTicketService;
import com.business.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(value = "eTicket")
public class EticketController {
    private  static final Logger logger= LoggerFactory.getLogger(EticketController.class);


    @Autowired
    private ElectronicTicketService electronicTicketService;
    /**
     * 查询电子券列表
     */
    @PostMapping(value = "/geteTicketList")
    @HttpLog(operationType = "0",modularTypeName = "查询电子券列表")
    public ControllerRsp geteTicketListbyPage(TElectronicTicket tElectronicTicket, HttpServletRequest request, Integer page, Integer limit){
        tElectronicTicket.setCompanyId(SessionUtil.getCompany().getId());
        return ControllerRspUtil.Success(electronicTicketService.geteTicketListbyPage(tElectronicTicket,page,limit));
    }

    /**
     * 编辑电子券
     */
    @PostMapping(value = "/updateEticket")
    @HttpLog(operationType = "1",modularTypeName = "新增电子券")
    public ActionRsp updateEticket(TElectronicTicket tElectronicTicket,HttpServletRequest request){
        tElectronicTicket.setCompanyId(SessionUtil.getCompany().getId());
        return ActionRspUtil.Success(electronicTicketService.updateEticket(tElectronicTicket));
    }
    /**
     * 删除电子券
     */
    @PostMapping(value = "/deleteEticket")
    @HttpLog(operationType = "1",modularTypeName = "删除电子券")
    public ActionRsp deleteEticket(TElectronicTicket tElectronicTicket){
        return ActionRspUtil.Success(electronicTicketService.deleteEticket(tElectronicTicket));
    }

}
