package com.business.service;

import com.business.entity.TRolePower;
import com.business.entity.TRolePowerNew;
import com.business.util.PageBean;

import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 19:002018-11-6
 * @Modified By:
 */
public interface RolePowerService {
    PageBean<TRolePowerNew> getRolePowerbyPage(TRolePowerNew tRolePower, Integer page, Integer limit);
    List<TRolePowerNew> getRolePower(TRolePowerNew tRolePower);
    List<TRolePowerNew> getRolePowerById(TRolePowerNew tRolePower);
    String UpdateRolePower(TRolePowerNew tRolePower);
    String DeleteRolePower(Integer id);
    TRolePowerNew selectByPrimaryKey(Integer id);
}
