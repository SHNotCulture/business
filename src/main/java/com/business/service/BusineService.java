package com.business.service;

import com.business.entity.TBusine;
import com.business.entity.TBusinePay;
import com.business.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 17:372018-9-14
 * @Modified By:
 */
public interface BusineService {
    PageBean<TBusine> getBusinebyPage(TBusine tBusine, Integer page, Integer limit);
    List<TBusine> getBusine(TBusine tBusine);
    String DeleteBusine(Integer id);
    @Transactional
    String BusineRecharge(TBusinePay tBusinePay, String type);
    String UpdateBusine(TBusine tBusine);
    TBusine selectByPrimaryKey(Integer id);
    TBusine selectByAccount(String account);
}
