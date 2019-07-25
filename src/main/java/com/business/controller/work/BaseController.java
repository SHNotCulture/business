package com.business.controller.work;


import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.*;
import com.business.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 10:082018-10-10
 * @Modified By:
 */
@RestController
@RequestMapping(value = "Base")
public class BaseController {
    private  static final Logger logger= LoggerFactory.getLogger(BaseController.class);
    @Autowired
    private ElectronPaymentService electronPaymentService;
    @Autowired
    private CashPaymentService cashPaymentService;
    @Autowired
    private ParkReportMonthService parkReportMonthService;
    @Autowired
    private ParkReportYearService parkReportYearService;
    @Autowired
    private BusinePayService businePayService;

    @Autowired
    private CarPaymentService carPaymentService;




    /**
     *导出商户充值记录
     * @param beginTime
     * @param endTime
     * @param busineId
     * @param request
     * @param response
     */
    @GetMapping("/exportListforBusinePay")
    @HttpLog(operationType = "1",modularTypeName = "导出商户充值记录")
    public void  exportListforBusinePay(String beginTime,String endTime,Integer busineId, HttpServletRequest request, HttpServletResponse response){
        try {
            Integer parkId=SessionUtil.getParkId();
            TBusinePay tBusinePay=new TBusinePay();
            tBusinePay.setParkId(parkId);
            tBusinePay.setBusineId(busineId);
            businePayService.exportList(tBusinePay,beginTime,endTime,"商户充值记录",response);
        } catch (Exception e){
            logger.info("错误原因为："+e.toString());
            e.printStackTrace();
        }
    }
    /**
     *导出电子对账单信息
     * @param beginTime
     * @param endTime
     * @param checkFlag
     * @param request
     * @param response
     */
    @GetMapping("/exportListforElectronic")
    @HttpLog(operationType = "1",modularTypeName = "导出电子对账单信息")
    public void  exportListforElectronic(String beginTime,String endTime,Integer checkFlag, HttpServletRequest request, HttpServletResponse response){
        try {
            Integer parkId=SessionUtil.getParkId();
            TElectronPayment tElectronPayment=new TElectronPayment();
            tElectronPayment.setParkId(parkId);
            tElectronPayment.setCheckFlag(checkFlag);
            electronPaymentService.exportList(beginTime,endTime,tElectronPayment,"电子对账单信息",response);
        } catch (Exception e){
            logger.info("错误原因为："+e.toString());
            e.printStackTrace();
        }
    }
    /**
     *导出当班支付对账信息
     * @param beginTime
     * @param endTime
     * @param dutyPerson
     * @param request
     * @param response
     */
    @GetMapping("/exportListforCashPayment")
    @HttpLog(operationType = "1",modularTypeName = "导出当班支付对账信息")
    public void  exportListforCashPayment(String beginTime,String endTime,String dutyPerson, HttpServletRequest request, HttpServletResponse response){
        try {
            Integer parkId=SessionUtil.getParkId();
            TParkDuty tParkDuty=new TParkDuty();
            tParkDuty.setParkId(parkId);
            tParkDuty.setDutyPerson(dutyPerson);
            cashPaymentService.exportList(beginTime,endTime,tParkDuty,"当班支付对账信息",response);
        } catch (Exception e){
            logger.info("错误原因为："+e.toString());
            e.printStackTrace();
        }
    }
    /**
     *导出财务报表信息
     * @param beginTime
     * @param endTime
     * @param type
     * @param request
     * @param response
     */
    @GetMapping("/exportListforParkReport")
    @HttpLog(operationType = "1",modularTypeName = "导出财务报表信息")
    public void  exportListforParkReport(String beginTime,String endTime,Integer type, HttpServletRequest request, HttpServletResponse response){
        try {
            Integer parkId=SessionUtil.getParkId();
            switch (type){

                case 1:
                    TParkReportMonth tParkReportMonth=new TParkReportMonth();
                    tParkReportMonth.setParkId(parkId);
                    parkReportMonthService.exportList(beginTime,endTime,tParkReportMonth,"财务月报表信息",response);
                    break;
                case 2:
                    TParkReportYear tParkReportYear=new TParkReportYear();
                    tParkReportYear.setParkId(parkId);
                    parkReportYearService.exportList(beginTime,endTime,tParkReportYear,"财务年报表信息",response);
                    break;
                default:
                        break;
            }
        } catch (Exception e){
            logger.info("错误原因为："+e.toString());
            e.printStackTrace();
        }
    }





    @GetMapping("/exportListMonthlyDetails")
    @HttpLog(operationType = "1",modularTypeName = "导出月租车信息")
    public void  exportListMonthlyDetails(TCarPayment tCarPayment,String beginData,String endData, HttpServletRequest request, HttpServletResponse response){
        tCarPayment.setParkId(SessionUtil.getParkId());
        try {
            carPaymentService.exportListMonthlyDetails(tCarPayment,"月租缴费详情",response,beginData,endData);
        }
        catch (Exception e){
            logger.info("错误原因为："+e.toString());
            e.printStackTrace();
        }
    }


    @PostMapping(value = "/getParkingStateList")
    @HttpLog(operationType = "0",modularTypeName = "获取车位状态")
    public ActionRsp getParkingStateList(){
        return ActionRspUtil.Success(CommonUtil.parkingStateList);
    }
    @PostMapping(value = "/getParkingSpaceList")
    @HttpLog(operationType = "0",modularTypeName = "获取车位性质")
    public ActionRsp getParkingSpaceList(){
        return ActionRspUtil.Success(CommonUtil.parkingSpaceList);
    }
    @PostMapping(value = "/getBusineStatusList")
    @HttpLog(operationType = "0",modularTypeName = "获取商户状态")
    public ActionRsp getBusineStatusList(){
        return ActionRspUtil.Success(CommonUtil.busineStatusList);
    }
    @PostMapping(value = "/getBusineTypeList")
    @HttpLog(operationType = "0",modularTypeName = "获取商户类别")
    public ActionRsp getBusineTypeList(){
        return ActionRspUtil.Success(CommonUtil.busineTypeList);
    }
    @PostMapping(value = "/getCarTypeList")
    @HttpLog(operationType = "0",modularTypeName = "获取车辆类型")
    public ActionRsp getCarTypeList(){
        return ActionRspUtil.Success(CommonUtil.carTypeList);
    }
    @PostMapping(value = "/getIsHolidayUseList")
    @HttpLog(operationType = "0",modularTypeName = "获取假日规则")
    public ActionRsp getIsHolidayUseList(){
        return ActionRspUtil.Success(CommonUtil.isHolidayUseList);
    }
    @PostMapping(value = "/getH24RuleList")
    @HttpLog(operationType = "0",modularTypeName = "获取计时规则")
    public ActionRsp getH24RuleList(){
        return ActionRspUtil.Success(CommonUtil.h24RuleList);
    }
    @PostMapping(value = "/getIsMaxSectimeFeeByAddList")
    @HttpLog(operationType = "0",modularTypeName = "获取是否最大收费规则")
    public ActionRsp getIsMaxSectimeFeeByAddList(){
        return ActionRspUtil.Success(CommonUtil.isMaxSectimeFeeByAddList);
    }
    @PostMapping(value = "/getCarPayRuleList")
    @HttpLog(operationType = "0",modularTypeName = "获取月租车缴费规则")
    public ActionRsp getCarPayRuleList(){
        return ActionRspUtil.Success(CommonUtil.CarPayRuleList);
    }
    @PostMapping(value = "/getCompanyTypeList")
    @HttpLog(operationType = "0",modularTypeName = "获取物业类型")
    public ActionRsp getCompanyTypeList(){
        return ActionRspUtil.Success(CommonUtil.companyTypeList);
    }
    @PostMapping(value = "/getCompanyStatusList")
    @HttpLog(operationType = "0",modularTypeName = "获取物业状态")
    public ActionRsp getCompanyStatusList(){
        return ActionRspUtil.Success(CommonUtil.companyStatusList);
    }
    @PostMapping(value = "/getIsManyPreferentialList")
    @HttpLog(operationType = "0",modularTypeName = "获取代缴类型")
    public ActionRsp getIsManyPreferentialList(){
        return ActionRspUtil.Success(CommonUtil.IsManyPreferentialList);
    }
    @PostMapping(value = "/getFlagLists")
    @HttpLog(operationType = "0",modularTypeName = "获取电子报表确认标识")
    public ActionRsp getFlagLists(){
        return ActionRspUtil.Success(CommonUtil.FlagLists);
    }
    @PostMapping(value = "/getCarNatureLists")
    @HttpLog(operationType = "0",modularTypeName = "获取车辆类型")
    public ActionRsp getCarNatureLists(){
        return ActionRspUtil.Success(CommonUtil.carNature);
    }

}
