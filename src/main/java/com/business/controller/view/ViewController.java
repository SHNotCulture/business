package com.business.controller.view;

import com.business.aspect.HttpLog;
import com.business.entity.TCompanyUser;
import com.business.service.*;
import com.business.util.RequestUtils;
import com.business.entity.*;
import com.business.util.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author lishuhan
 * @Description:统一页面跳转控制器
 * @Date Create in 17:282018-7-4
 * @Modified By:
 */
@Controller
@RequestMapping("view")
public class ViewController {
    private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
    @Autowired
    private CarParkService carParkService;
    @Autowired
    private CompanyService companyService;


    @Autowired
    private ModuleListService moduleListService;
    @Autowired
    private UserService userService;
    @Autowired
    private RolePowerService rolePowerService;



    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "/getIndex")
    public String index(HttpServletRequest request){
        String username = "未登录";
        String currentLoginUser = RequestUtils.currentLoginUser();

        if (currentLoginUser != null && StringUtils.isNotEmpty(currentLoginUser)) {
            TCompanyUser user=new TCompanyUser();//用户信息
            List<TCompany> tCompanyList=new ArrayList<>();//用户车场信息
            List<TCompanyPark> tCompanyParkList=new ArrayList<>();//用户公司信息
            List<LayuiMenu> layuiMenuList=new ArrayList<>();//用户页面权限信息
            user =SessionUtil.getUser();
            List<Integer> ids= StringUtil.stringList2List(user.getParkIds().split(","));
            tCompanyParkList=carParkService.getCarParkbyIDIn(ids);
            if(tCompanyParkList.size()!=0) {
                request.getSession().setAttribute(Common.ParkId, tCompanyParkList.get(0).getId());//将当前选择车场信息ID存入session
                request.getSession().setAttribute(Common.Park,  JsonUtil.beanToJson(tCompanyParkList.get(0)));//将当前选择车场信息存入session
            }else{
                request.getSession().setAttribute(Common.ParkId,0);//将当前选择车场信息存入session
                request.getSession().setAttribute(Common.Park,0);
            }
            if(!user.getUserAccout().equals("admin"))
            {

                TCompany tCompany=new TCompany();
                tCompany.setId(user.getCompanyId());
                tCompanyList=companyService.getCompany(tCompany);
                request.getSession().setAttribute(Common.Company,  JsonUtil.beanToJson(tCompanyList.get(0)));//将当前用户所属物业公司信息存入session
                TRolePowerNew tRolePower=new TRolePowerNew();
                tRolePower.setId(user.getRoleId());
                List<Integer> roleids= StringUtil.stringList2List(rolePowerService.getRolePowerById(tRolePower).get(0).getModuleId().split(","));
                for (Integer i=0;i< roleids.size();i++){
                    if(roleids.get(i)==12||roleids.get(i)==13){
                        roleids.remove(roleids.get(i));
                        i--;
                    }
                }
                layuiMenuList=moduleListService.getModuleListNewForLayuiMenu(roleids);

            }
            else
            {
                TCompany tCompany=new TCompany();
                tCompany.setId(user.getCompanyId());
                tCompany.setCompanyName("系统管理员");
                tCompanyList.add(tCompany);
                //得到全部页面权限
                TModuleListNew tModuleListNew=new TModuleListNew();
                List<TModuleListNew> tModuleListNews=moduleListService.getModuleList(tModuleListNew);
                String moduleId="";
                if(tModuleListNews.size()!=0){
                    for (TModuleListNew t:tModuleListNews) {
                            moduleId+=t.getId()+",";
                    }
                }
                List<Integer> roleids= StringUtil.stringList2List(moduleId.substring(0,moduleId.length()-1).split(","));
                layuiMenuList=moduleListService.getModuleListNewForLayuiMenu(roleids);
            }

            request.setAttribute("user", user);//用户信息
            request.setAttribute("tCompanyList", tCompanyList.get(0));//用户所属物业信息
            request.setAttribute("tCompanyParkList",  JsonUtil.listToJson(tCompanyParkList));//用户所属车场信息
            request.setAttribute("layuiMenuList",  JsonUtil.listToJson(layuiMenuList));//用户权限菜单信息
        } else {
            return "redirect:/view/getLogin";
        }

        return "homepage/Index";
    }
    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/getLogin")
    public String login(HttpServletRequest request){
        try{
            String code=StringUtil.RandomString(4);
            request.getSession().setAttribute(Common.Code, code);//保存验证码
            request.setAttribute("code", code);//验证码

        }
        catch (Exception e)
        {
            logger.info(e.toString());
        }

        return "homepage/Login";
    }
    @RequestMapping(value = "/ResetPS")
    public  String ResetPS(){
        return "homepage/ResetPS";
    }

    /**
     * 电子券优惠记录查询界面
     * updated by xiexuanran
     */
    @RequestMapping(value = "/electronicCouponsRecords")
    public String electronicCouponsRecords(){
        return "Merchant_Platform/electronicCouponsRecords";
    }


    /**
     * 商户优惠记录查询页面
     * updated by xiexuanran
     */
    @RequestMapping(value = "/merchantCoupon")
    public String merchantCoupon(){
        return "Merchant_Platform/merchantCoupon";
    }


    /**
     * 商户优惠减免界面测试
     * updated by xiexuanran
     */
    @RequestMapping(value = "/merchantIndex")
    public String merchantCouponIndex() {
       return "Merchant_Platform/merchantIndex";
    }

    /**
     * 商户充值记录查询
     * updated by xiexuanran
     */
    @RequestMapping(value = "/merchantRechargeRecord")
    public String merchantRechargeRecord() {
        return "Merchant_Platform/merchantRechargeRecord";
    }

    /**
     * 商户电子券管理
     * updated by xiexuanran
     */
    @RequestMapping(value = "/eTicketManage")
    public String eTicketManage() {
        return "busine_Management/eTicketManage";
    }

    /**
     * 二维码记录查询
     * updated by xiexuanran
     */
    @RequestMapping(value = "/couponQrcodeRecord")
    public String couponQrcodeRecord(){
        return "Merchant_Platform/couponQrcodeRecords";
    }

    /**
     * 商户查询商户电子券信息
     * @return
     */
    @RequestMapping(value = "/busineTicketRecord")
    public String busineTicketRecord(){
        return "Merchant_Platform/electronicBusineTicket";
    }
}
