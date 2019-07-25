package com.business.controller.work;
import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.enums.ActionRspEnum;
import com.business.exception.ActionRspException;
import com.business.service.BusinePayService;
import com.business.service.BusineService;
import com.business.service.ElectronicTbusineTicketService;
import com.business.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 23:472018-7-25
 * @Modified By:
 */
@RestController
@RequestMapping(value = "busine")
public class BusineController {
    private  static final Logger logger= LoggerFactory.getLogger(BusineController.class);
    @Autowired
    private BusineService busineService;
    @Autowired
    private BusinePayService businePayService;
    @Autowired
    private ElectronicTbusineTicketService electronicTbusineTicketService;

    /**
     * 查询商户信息
     * @return
     */
    @PostMapping(value = "/getBusinebyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询商户信息(分页)")
    public ControllerRsp getBusinebyPage(TBusine tBusine,HttpServletRequest request,Integer page, Integer limit){
        TCompanyUser user= SessionUtil.getUser();
        tBusine.setCompanyId(user.getCompanyId());
        tBusine.setParkId(SessionUtil.getParkId());
        return ControllerRspUtil.Success(busineService.getBusinebyPage(tBusine,page,limit));
    }
    /**
     * 查询商户信息
     * @return
     */
    @PostMapping(value = "/getBusine")
    @HttpLog(operationType = "0",modularTypeName = "查询商户信息")
    public ControllerRsp getBusine(TBusine tBusine,HttpServletRequest request,Integer page, Integer limit){
        TCompanyUser user= SessionUtil.getUser();
        tBusine.setCompanyId(user.getCompanyId());
        tBusine.setParkId(SessionUtil.getParkId());
        return ControllerRspUtil.Success(busineService.getBusine(tBusine));
    }
    /**
     * 查询商户充值记录
     * @return
     */
    @PostMapping(value = "/getBusinePay")
    @HttpLog(operationType = "0",modularTypeName = "查询商户充值记录")
    public ControllerRsp getBusinePay(Integer busineId,String beginTime,String endTime,HttpServletRequest request,Integer page, Integer limit){
        TCompanyUser user= SessionUtil.getUser();
        TBusinePay tBusinePay=new TBusinePay();
        tBusinePay.setBusineId(busineId);
        tBusinePay.setCompanyId(user.getCompanyId());
        tBusinePay.setParkId(SessionUtil.getParkId());
        return ControllerRspUtil.Success(businePayService.getTBusinePaybyPage(tBusinePay,page,limit,beginTime,endTime));
    }



    /**
     * 更新商户信息
     * @param tBusine
     * @return
     */
    @PostMapping(value = "/updateBusine")
    @HttpLog(operationType = "1",modularTypeName = "更新商户信息")
    public ActionRsp UpdateBusine(TBusine tBusine,HttpServletRequest request)
    {
        String isAuto=request.getParameter("isAutoStr");
        if (isAuto!=null){
            tBusine.setIsAuto(1);
        }else {
            tBusine.setIsAuto(0);
        }
        TCompanyUser user= SessionUtil.getUser();
        if(tBusine.getIsfree()==null){
            tBusine.setIsfree(0);
        }
        tBusine.setCompanyId(user.getCompanyId());
        tBusine.setParkId(SessionUtil.getParkId());
        return ActionRspUtil.Success(busineService.UpdateBusine(tBusine));
    }
    /**
     * 修改商户密码
     * @param request
     * @param password
     * @param newPassword
     * @param resetPassword
     * @return
     */
    @PostMapping(value = "/changePassword")
    @HttpLog(operationType = "1",modularTypeName = "修改商户密码")
    public  ActionRsp changePassword(HttpServletRequest request,Integer id,String password,String newPassword,String resetPassword){
        TCompanyUser nowUser= SessionUtil.getUser();
        logger.info("nowUser:"+nowUser.toString());
        TBusine tBusine=new TBusine();
        tBusine.setId(id);
        TBusine tBusineChange=new TBusine();
        tBusineChange=busineService.getBusine(tBusine).get(0);
        if(tBusineChange.getPassword().equals(MD5Util.MD5Encode(password)))
        {
            if(newPassword.equals(resetPassword)){
                tBusineChange.setPassword(MD5Util.MD5Encode(newPassword));
                busineService.UpdateBusine(tBusineChange);
            }
            else
            {
                throw new ActionRspException(ActionRspEnum.Reset_ERROR2);
            }

        }
        else
        {
            throw new ActionRspException(ActionRspEnum.Reset_ERROR1);
        }
        return ActionRspUtil.Success("修改成功");
    }
    /**
     * 重置商户密码
     * @param id
     * @return
     */
    @PostMapping(value = "/resetPassword")
    @HttpLog(operationType = "1",modularTypeName = "重置商户密码")
    public ActionRsp resetPassword(Integer id,HttpServletRequest request)
    {
        TCompanyUser user= SessionUtil.getUser();
        TBusine tBusine=new TBusine();
        tBusine.setId(id);
        tBusine.setPassword(MD5Util.MD5Encode("123456"));
        tBusine.setCompanyId(user.getCompanyId());
        String result=busineService.UpdateBusine(tBusine);
        if(result.equals("更新成功")){
            result="密码重置成功,初始密码为123456,,请自行更改密码后使用！";
        }
        return ActionRspUtil.Success(result);
    }
    /**
     * 商户充值
     * @param tBusinePay
     * @return
     */
    @PostMapping(value = "/busineRecharge")
    @HttpLog(operationType = "1",modularTypeName = "商户充值")
    public  ActionRsp BusineRecharge(TBusinePay tBusinePay,String type,HttpServletRequest request){
        TCompanyUser user= SessionUtil.getUser();
        tBusinePay.setCompanyId(user.getCompanyId());
        tBusinePay.setParkId(SessionUtil.getParkId());
        return ActionRspUtil.Success(busineService.BusineRecharge(tBusinePay,type));
    }

    /**
     * 删除商户信息
     * @param id
     * @return
     */
    @PostMapping(value = "/deleteBusine")
    @HttpLog(operationType = "1",modularTypeName = "删除商户信息")
    public ActionRsp DeleteBusine(Integer id){
        return ActionRspUtil.Success(busineService.DeleteBusine(id));
    }

    /**
     * 商户购买电子券
     * @param
     * @return
     */
    @PostMapping(value = "/eleBuy")
    @HttpLog(operationType = "1",modularTypeName = "购买电子券")
    public ActionRsp eleBuy(TBusineTicket tBusineTicket){
        return ActionRspUtil.Success(electronicTbusineTicketService.eleBuy(tBusineTicket));
    }

}
