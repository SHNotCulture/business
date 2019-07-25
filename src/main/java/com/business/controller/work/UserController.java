package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.enums.ActionRspEnum;
import com.business.exception.ActionRspException;
import com.business.service.RolePowerService;
import com.business.service.UserService;
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
 * @Date Create in 21:322018-8-14
 * @Modified By:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    private  static final Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private RolePowerService rolePowerService;
    /**
     * 查询角色信息(分页)
     * @return
     */
    @PostMapping(value = "/getRolePowerbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询角色信息（分页）")
    public ControllerRsp getRolePowerbyPage(TRolePowerNew tRolePower,Integer page, Integer limit,HttpServletRequest request){
        TCompanyUser user= SessionUtil.getUser();
        tRolePower.setCompanyId(user.getCompanyId());
        return ControllerRspUtil.Success(rolePowerService.getRolePowerbyPage(tRolePower,page,limit));
    }

    /**
     * 查询角色信息
     * @return
     */
    @PostMapping(value = "/getRolePower")
    @HttpLog(operationType = "0",modularTypeName = "查询角色信息")
    public ControllerRsp getRolePower(TRolePowerNew tRolePower,HttpServletRequest request){
        TCompanyUser user=SessionUtil.getUser();
        tRolePower.setCompanyId(user.getCompanyId());
        return ControllerRspUtil.Success(rolePowerService.getRolePower(tRolePower));
    }
    /**
     * 更新角色信息
     * @param tRolePower
     * @return
     */
    @PostMapping(value = "/updateRolePower")
    @HttpLog(operationType = "1",modularTypeName = "更新角色信息")
    public ActionRsp UpdateRolePower(TRolePowerNew tRolePower,HttpServletRequest request)
    {
        TCompanyUser user= SessionUtil.getUser();
        tRolePower.setCompanyId(user.getCompanyId());
        tRolePower.setUserId(user.getId());
        return ActionRspUtil.Success(rolePowerService.UpdateRolePower(tRolePower));
    }

    /**
     * 删除角色信息
     * @param id
     * @return
     */
    @PostMapping(value = "/deleteRolePower")
    @HttpLog(operationType = "1",modularTypeName = "删除角色信息")
    public ActionRsp DeleteRolePower(Integer id){
        return ActionRspUtil.Success(rolePowerService.DeleteRolePower(id));
    }

    /**
     * 查询物业用户信息(分页)
     * @return
     */
    @PostMapping(value = "/getCompanyUserbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询物业用户信息（分页）")
    public ControllerRsp getCompanyUserbyPage(TCompanyUser tCompanyUser,Integer page, Integer limit,HttpServletRequest request){
        TCompanyUser user=SessionUtil.getUser();
        tCompanyUser.setEntityType(1);
        tCompanyUser.setCompanyId(user.getCompanyId());
        return ControllerRspUtil.Success(userService.getCompanyUserbyPage(tCompanyUser,page,limit));
    }
    /**
     * 查询物业用户信息
     * @return
     */
    @PostMapping(value = "/getCompanyUser")
    @HttpLog(operationType = "0",modularTypeName = "查询物业用户信息")
    public ControllerRsp getCompanyUser(TCompanyUser tCompanyUser,HttpServletRequest request){
        TCompanyUser user= SessionUtil.getUser();
        tCompanyUser.setEntityType(1);
        tCompanyUser.setCompanyId(user.getCompanyId());
        return ControllerRspUtil.Success(userService.getCompanyUser(tCompanyUser));
    }
    /**
     * 更新物业用户信息
     * @param tCompanyUser
     * @return
     */
    @PostMapping(value = "/updateCompanyUser")
    @HttpLog(operationType = "1",modularTypeName = "更新物业用户信息")
    public ActionRsp UpdateCompanyUser(TCompanyUser tCompanyUser,HttpServletRequest request)
    {
        TCompanyUser user=SessionUtil.getUser();
        tCompanyUser.setCompanyId(user.getCompanyId());
        tCompanyUser.setParentUser(user.getId());
        tCompanyUser.setIsAdmin("2");
        tCompanyUser.setEntityType(1);
        return ActionRspUtil.Success(userService.UpdateCompanyUser(tCompanyUser));
    }
    /**
     * 修改用户密码
     * @param request
     * @param password
     * @param newPassword
     * @param resetPassword
     * @return
     */
    @PostMapping(value = "/changePassword")
    @HttpLog(operationType = "1",modularTypeName = "修改用户密码")
    public  ActionRsp changePassword(HttpServletRequest request,Integer id,String password,String newPassword,String resetPassword){
        TCompanyUser nowUser= SessionUtil.getUser();
        logger.info("nowUser:"+nowUser.toString());
        TCompanyUser user=new TCompanyUser();
        user.setId(id);
        TCompanyUser userChange=new TCompanyUser();
        userChange=userService.getCompanyUser(user).get(0);
        userChange.setParentUser(nowUser.getId());
        logger.info("userChange:"+userChange.toString());
        if(userChange.getPassword().equals(MD5Util.MD5Encode(password)))
        {
            if(newPassword.equals(resetPassword)){
                userChange.setPassword(MD5Util.MD5Encode(newPassword));
                userService.UpdateCompanyUser(userChange);
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
     * 重置物业用户密码
     * @param id
     * @return
     */
    @PostMapping(value = "/resetPassword")
    @HttpLog(operationType = "1",modularTypeName = "重置物业用户密码")
    public ActionRsp resetPassword(Integer id,HttpServletRequest request)
    {
        TCompanyUser user= SessionUtil.getUser();
        TCompanyUser tCompanyUser=new TCompanyUser();
        tCompanyUser.setId(id);
        tCompanyUser.setPassword(MD5Util.MD5Encode("123456"));
        tCompanyUser.setCompanyId(user.getCompanyId());
        tCompanyUser.setParentUser(user.getId());
       String result=userService.UpdateCompanyUser(tCompanyUser);
       if(result.equals("更新成功")){
           result="密码重置成功,初始密码为123456,,请自行更改密码后使用！";
       }
        return ActionRspUtil.Success(result);
    }

    /**
     * 删除物业用户信息
     * @param id
     * @return
     */
    @PostMapping(value = "/deleteCompanyUser")
    @HttpLog(operationType = "1",modularTypeName = "删除物业用户信息")
    public ActionRsp DeleteCompanyUser(Integer id){
        return ActionRspUtil.Success(userService.DeleteCompanyUser(id));
    }
}
