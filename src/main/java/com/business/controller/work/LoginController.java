package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.enums.ActionRspEnum;
import com.business.exception.ActionRspException;
import com.business.service.CompanyService;
import com.business.service.UserService;
import com.business.util.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 17:512018-8-28
 * @Modified By:
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {
    private  static final Logger logger= LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private CompanyService companyService;

    /**
     * 核对用户信息
     * @return
     */
    @PostMapping(value = "/checkPassword")
    @HttpLog(operationType = "0",modularTypeName = "核对用户信息")
    public ActionRsp CheckPassword(String userName, String passWord, String rememberMe,String code,HttpServletRequest request){
            logger.info("开始核对用户信息");
            /*核对物业公司权限*/
            TCompanyUser companyUser = new TCompanyUser();
            companyUser.setUserAccout(userName);
            List<TCompanyUser> tCompanyUserList = userService.getCompanyUser(companyUser);
            if (tCompanyUserList.size()>0){
            Integer companyId = tCompanyUserList.get(0).getCompanyId();
            Integer status = companyService.getCompanyById(companyId).getStatus();
            if (status!=1){
                throw new ActionRspException(ActionRspEnum.Permission_ERROR);
            }
            }
            String error = null;
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);

            if(rememberMe != null && "true".equals(rememberMe))
            {
               // token.setRememberMe(true);    // 记住我
            }
            if(!code.equals(request.getSession().getAttribute(Common.Code).toString())){
                throw new ActionRspException(ActionRspEnum.Code_ERROR);
            }
            try {
                subject.login(token);
            }
            catch (UnknownAccountException | IncorrectCredentialsException e1) {
                error = "用户名或密码错误";
                throw  new ActionRspException(ActionRspEnum.Login_ERROR);
            }catch(ExcessiveAttemptsException e){
                error = "超过了尝试登录的次数，您的账户已经被锁定。";
            }catch (AuthenticationException e) {    // 其他错误
                if(e.getMessage() != null){
                    error = "发生错误：" + e.getMessage();}
                else{
                    error = "发生错误，无法登录。";}
            }
            catch (Exception e)
            {
                logger.info(e.toString());
                throw  new ActionRspException(ActionRspEnum.Login_ERROR);
            }

        return ActionRspUtil.Success();
    }

    /**
     * 退出系统
     * @return
     */
    @PostMapping(value = "/logOut")
    @HttpLog(operationType = "0",modularTypeName = "退出系统")
    public ActionRsp logOut(){
        return ActionRspUtil.Success( RequestUtils.logOut());
    }



    /**
     * 改变验证码
     * @param request
     * @return
     */
    @PostMapping(value = "/changeCode")
    @HttpLog(operationType = "0",modularTypeName = "改变验证码")
    public  ActionRsp ChangeCode(HttpServletRequest request){
        String code= StringUtil.RandomString(4);
        request.getSession().setAttribute(Common.Code, code);//保存验证码
        return ActionRspUtil.Success(code);
    }

    /**
     * 重置当前用户密码
     * @param request
     * @param password
     * @param newPassword
     * @param resetPassword
     * @return
     */
    @PostMapping(value = "/resetPassword")
    @HttpLog(operationType = "1",modularTypeName = "重置当前用户密码")
    public  ActionRsp resetPassword(HttpServletRequest request,String password,String newPassword,String resetPassword){
        TCompanyUser user= SessionUtil.getUser();
        if(user.getPassword().equals(MD5Util.MD5Encode(password)))
        {
            if(newPassword.equals(resetPassword)){
                user.setPassword(MD5Util.MD5Encode(newPassword));
                userService.UpdateCompanyUser(user);
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
        return ActionRspUtil.Success("重置成功,请重新登录");
    }
}
