package com.business.service;

import com.business.entity.TBusinePay;
import com.business.util.PageBean;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 11:162018-10-9
 * @Modified By:
 */
public interface BusinePayService {
    PageBean<TBusinePay> getTBusinePaybyPage(TBusinePay tBusinePay, Integer page, Integer limit, String beginTime, String endTime);
    List<TBusinePay> getTBusinePay(TBusinePay tBusinePay, String beginTime, String endTime);
    void exportList(TBusinePay tBusinePay, String beginTime, String endTime, String title, HttpServletResponse response);
    Double totalRecharge(Integer busineId);
    Double totalConsumption(Integer busineId);
}
