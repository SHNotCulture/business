package com.business.service;

import com.business.entity.TParkDuty;
import com.business.util.PageBean;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface CashPaymentService {
    PageBean<TParkDuty> getTParkDutyListbyPage(TParkDuty tParkDuty, String beginTime, String endTime, Integer page, Integer limit);
    List<TParkDuty> getTParkDutyList(TParkDuty tParkDuty, String beginTime, String endTime);
    void exportList(String beginTime, String endTime, TParkDuty tParkDuty, String title, HttpServletResponse response);
}

