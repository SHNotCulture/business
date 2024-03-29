package com.business.service;

import com.business.entity.TParkReportMonth;
import com.business.util.PageBean;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 18:262018-11-6
 * @Modified By:
 */
public interface ParkReportMonthService {
    PageBean<TParkReportMonth> getParkReportMonthbyPage(String beginTime, String endTime, TParkReportMonth tParkReportMonth, Integer page, Integer limit);
    List<TParkReportMonth> getParkReportMonth(String beginTime, String endTime, TParkReportMonth tParkReportMonth);
    void exportList(String beginTime, String endTime, TParkReportMonth tParkReportMonth, String title, HttpServletResponse response);
}
