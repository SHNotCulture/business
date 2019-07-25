package com.business.aspect;

import com.business.dao.*;
import com.business.entity.*;
import com.business.service.*;
import com.business.util.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author lishuhan
 * @Description:Http请求监听
 * @Date Create in 11:402018-5-9
 * @Modified By:
 */
@Aspect
@Component
public class HttpAspect {
    private  static final Logger logger= LoggerFactory.getLogger(HttpAspect.class);
    @Autowired
    private JournalService journalService;

    @Autowired
    private BusineService busineService;
    @Autowired
    private CarPayRuleService carPayRuleService;

    @Autowired
    private RolePowerService rolePowerService;
    @Autowired
    private UserService userService;

    private String logMsg;
    @Pointcut("execution(public * com.business.controller.work.*.*(..))")
    private  void mainAction(){
    }
    @Before("mainAction()")
    public void dobefore(JoinPoint joinPoint)throws ClassNotFoundException {
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        logMsg=getLogInfo(joinPoint).get("logInfo");
    }

    @After("mainAction()")
    public void doAfter(JoinPoint joinPoint) throws ClassNotFoundException {
         ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        String url=request.getRequestURL().toString();
        String ip=request.getRemoteAddr().toString();
                Map<String,String> map = getLogInfo(joinPoint);
                String operationType=map.get("operationType");
                String logInfo=logMsg;
                if (Integer.valueOf(operationType)!=0) {
                    TJournal tJournal = new TJournal();
                    TCompanyUser user = SessionUtil.getUser();
                    tJournal.setCompanyUser(user.getUserName());
                    tJournal.setCompanyUserId(user.getId());
                    tJournal.setParkid(SessionUtil.getParkId());
                    tJournal.setDate(DateUtil.getCurDateTime());
                    tJournal.setIp(ip);
                    tJournal.setOperatingType(Integer.valueOf(operationType));
                    tJournal.setOperationContent(logInfo);
                    tJournal.setStatus(1);
                    journalService.UpdateTJournal(tJournal);
                }
        logger.info("访问结束");
    }

    @AfterReturning(returning = "object",pointcut = "mainAction()")
    public void doAfterReturn(Object object){
        //返回数据
        logger.info("response={}",object.toString());
    }

    private Map<String,String> getLogInfo(JoinPoint joinPoint) throws ClassNotFoundException {
        String targetName = joinPoint.getTarget().getClass().getName();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        Object[] arguments = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        String modulerType="";
        String operationType="";
        String logInfo="";
        if (methods.length>0) {
            for (Method method : methods){
                if (method.getName().equals(methodName)) {
                    Class[] clazzs = method.getParameterTypes();
                    if (clazzs.length == arguments.length) {
                        if (method.getAnnotation(HttpLog.class) != null) {
                            modulerType = method.getAnnotation(HttpLog.class).modularTypeName();
                            operationType = method.getAnnotation(HttpLog.class).operationType();
                            break;
                        }
                    }
                }}
        }
        if(modulerType!=""&&operationType!="")
        {
            if(Integer.valueOf(operationType)!=0){
                //logger.info("开始记录日志,modulerType="+modulerType+",operationType="+operationType);
                Object argOne=arguments[0];
                switch (modulerType){
                    case "商户充值":
                        if(argOne instanceof TBusinePay){
                            TBusinePay tBusinePay=(TBusinePay)argOne;
                            String arg_Second=arguments[1].toString();
                            if(arg_Second.equals(1))
                            {
                                logInfo=String.format("商户%s充值%s元",tBusinePay.getBusineName(),tBusinePay.getActualPay());
                            }
                            else
                            {
                                logInfo=String.format("商户%s冲正%s元",tBusinePay.getBusineName(),tBusinePay.getActualPay());
                            }
                        }
                        break;
                    case "更新商户信息":
                        if (argOne instanceof TBusine){
                            TBusine tBusine = (TBusine)argOne;
                            if (tBusine.getId() != null){
                                TBusine tBusinePar = busineService.selectByPrimaryKey(tBusine.getId());
                                String[] ignore = {"id","companyId","parkId"};
                                String msg = getMsgInfo(tBusinePar,tBusine,ignore);
                                logInfo = String.format("编辑商户信息:%s",msg);
                            }
                        }
                        break;
                    case "修改商户密码":
                        //String newpassword = arguments[3].toString();
                        logInfo=String.format("修改商户密码");
                        break;
                    case "重置商户密码":
                        //String newpassword = arguments[3].toString();
                        logInfo=String.format("重置商户密码为【123456】");
                        break;
                    case "删除商户信息":
                        //String newpassword = arguments[3].toString();
                        TBusine tBusine = busineService.selectByPrimaryKey(Integer.valueOf(argOne.toString()));
                        logInfo=String.format("删除商户:%s",tBusine.getBusineName());
                        break;


                    case "更新月租规则":
                        if (argOne instanceof TCarPayRule){
                            TCarPayRule tCarPayRule = (TCarPayRule)argOne;
                            if (tCarPayRule.getId()!=null){
                                TCarPayRule tCarPayRulePar = carPayRuleService.selectByPrimaryKey(tCarPayRule.getId());
                                String [] ignore={"id","parkId","remark"};
                                String msg = getMsgInfo(tCarPayRulePar,tCarPayRule,ignore);
                                logInfo = String.format("更新月租规则:%s",msg);
                            }else {
                                logInfo = String.format("新增月租规则:【%s】",tCarPayRule.getRuleName());
                            }
                        }
                        break;
                    case "删除月租规则":
                        TCarPayRule tCarPayRule = carPayRuleService.selectByPrimaryKey(Integer.valueOf(argOne.toString()));
                        logInfo = String.format("删除月租规则:【%s】",tCarPayRule.getRuleName());
                        break;


                    case "更新角色信息":
                        if (argOne instanceof TRolePowerNew){
                            TRolePowerNew tRolePowerNew = (TRolePowerNew)argOne;
                            if (tRolePowerNew.getId()!=null){
                                TRolePowerNew tRolePowerNewPar = rolePowerService.selectByPrimaryKey(tRolePowerNew.getId());
                                String [] ignore={"id","companyId","moduleId","userId"};
                                String msg = getMsgInfo(tRolePowerNewPar,tRolePowerNew,ignore);
                                logInfo = String.format("更新角色信息:%s",msg);
                            }else {
                                logInfo = String.format("新增角色:角色名称【%s】角色描述【%s】",tRolePowerNew.getRoleName(),tRolePowerNew.getRemark());
                            }
                        }
                        break;
                    case "删除角色信息":
                        TRolePowerNew tRolePowerNew = rolePowerService.selectByPrimaryKey(Integer.valueOf(argOne.toString()));
                        logInfo = String.format("删除角色信息:角色名称【%s】角色描述【%s】",tRolePowerNew.getRoleName(),tRolePowerNew.getRemark());
                        break;
                    case "更新物业用户信息":
                        if (argOne instanceof TCompanyUser){
                            TCompanyUser tCompanyUser = (TCompanyUser)argOne;
                            if (tCompanyUser.getId()!=null){
                                TCompanyUser tCompanyUserPar = userService.selectByPrimaryKey(tCompanyUser.getId());
                                String [] ignore={"id","companyId","parkIds","password","remark","roleId","isAdmin","entityType","parentUser"};
                                String msg = getMsgInfo(tCompanyUserPar,tCompanyUser,ignore);
                                logInfo = String.format("更新物业用户信息:%s",msg);
                            }else {
                                logInfo = String.format("新增物业用户：账号【%s】角色【%s】姓名【%s】手机【%s】",tCompanyUser.getUserAccout(),tCompanyUser.getRoleId(),tCompanyUser.getUserName(),tCompanyUser.getPhone());
                            }
                        }
                        break;
                    case "修改用户密码":
                        Integer id = Integer.valueOf(arguments[1].toString());
                        TCompanyUser tCompanyUser = userService.selectByPrimaryKey(id);
                        logInfo = String.format("修改用户密码:账号【%s】修改密码",tCompanyUser.getUserAccout());
                        break;
                    case "重置物业用户密码":
                        TCompanyUser tCompanyUser1 = userService.selectByPrimaryKey(Integer.valueOf(argOne.toString()));
                        logInfo = String.format("重置物业用户【%s】密码",tCompanyUser1.getUserAccout());
                        break;
                    case "删除物业用户信息":
                        TCompanyUser tCompanyUser2 = userService.selectByPrimaryKey(Integer.valueOf(argOne.toString()));
                        logInfo = String.format("删除物业用户【%s】",tCompanyUser2.getUserAccout());
                        break;
                        default:
                            break;
                }}}
        Map<String,String> map = new HashMap<String, String>(2);
        map.put("logInfo",logInfo);
        map.put("operationType",operationType);
      return map;
    }

    public String getMsgInfo(Object obPar,Object ob,String[] ignore){
        Map<String, List<Object>> compareResult = CompareFields.compareFields(obPar,ob,ignore);
        Set<String> keySet = compareResult.keySet();
        StringBuffer msg = new StringBuffer();
        for(String key : keySet){
            List<Object> list = compareResult.get(key);
            msg.append(key+"【"+list.get(1)+"】");
        }
        return msg.toString();
    }
}
