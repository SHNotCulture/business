package com.business.service;

import com.business.entity.TCompanyUser;
import com.business.entity.TRolePower;
import com.business.util.PageBean;

import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 16:422018-8-29
 * @Modified By:
 */
public interface UserService {
    PageBean<TCompanyUser> getCompanyUserbyPage(TCompanyUser tCompanyUser, Integer page, Integer limit);
    List<TCompanyUser> getCompanyUser(TCompanyUser tCompanyUser);
    String UpdateCompanyUser(TCompanyUser tCompanyUser);
    String DeleteCompanyUser(Integer id);
    TCompanyUser CheckPassword(TCompanyUser tCompanyUser);
    TCompanyUser selectByPrimaryKey(Integer id);
}
