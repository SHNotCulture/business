package com.business.service.impl;

import com.business.dao.TCarPaymentMapper;
import com.business.entity.ExcelCarPayment;
import com.business.entity.TCarPayment;
import com.business.entity.TCarPaymentCriteria;
import com.business.service.CarPaymentService;
import com.business.util.BeanCopyUtil;
import com.business.util.ExportExcelUtil;
import com.business.util.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarPaymentServiceImpl implements CarPaymentService {
    @Autowired
    private TCarPaymentMapper tCarPaymentMapper;

    @Override
    public List<TCarPayment> getCarPayment(TCarPayment tCarPayment,String beginData,String endData) {
        return tCarPaymentMapper.selectByExample(setCriteria(tCarPayment, beginData, endData));
    }

    @Override
    public PageBean<TCarPayment> getCarPaymentByPage(TCarPayment tCarPayment,String beginData,String endData, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"pay_time desc");
        List<TCarPayment> tCarPaymentList = getCarPayment(tCarPayment, beginData, endData);
        Integer countNums =getCount(tCarPayment, beginData, endData);
        PageBean<TCarPayment> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tCarPaymentList);
        return pageData;
    }

    @Override
    public void exportListMonthlyDetails(TCarPayment tCarPayment, String title, HttpServletResponse response,String beginData,String endData) {
        List<TCarPayment> tCarPayments = getCarPayment(tCarPayment,beginData,endData);
        List<ExcelCarPayment> excelCarPaymentList = new ArrayList<>();
        for (TCarPayment tCarPaymentsNew : tCarPayments){
            ExcelCarPayment excelCarPayment = new ExcelCarPayment();
            try {
                excelCarPayment = (ExcelCarPayment) BeanCopyUtil.CopyBeanToBean(tCarPaymentsNew,excelCarPayment);
            } catch (Exception e) {
                e.printStackTrace();
            }
            excelCarPaymentList.add(excelCarPayment);
        }
        try {
            ExportExcelUtil.exportExcel(response,title,title,title,excelCarPaymentList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private TCarPaymentCriteria setCriteria(TCarPayment tCarPayment,String beginData,String endData){
        TCarPaymentCriteria tCarPaymentCriteria = new TCarPaymentCriteria();
        TCarPaymentCriteria.Criteria criteria = tCarPaymentCriteria.createCriteria();
        if (tCarPayment!=null){
            if (tCarPayment.getParkId()!=null){
                criteria.andParkIdEqualTo(tCarPayment.getParkId());
            }if (tCarPayment.getPayRule()!=null){
                criteria.andPayRuleEqualTo(tCarPayment.getPayRule());
            }if (tCarPayment.getCarplate()!=null){
                criteria.andCarplateLike("%"+tCarPayment.getCarplate()+"%");
            }
        }
        if (beginData.length()>0){
            criteria.andPayTimeGreaterThanOrEqualTo(beginData);
        }
        if (endData.length()>0){
            criteria.andPayTimeLessThanOrEqualTo(endData);
        }
        return tCarPaymentCriteria;
    }

    private Integer getCount(TCarPayment tCarPayment,String beginData,String endData){
        return (int)tCarPaymentMapper.countByExample(setCriteria(tCarPayment, beginData, endData));
    }
}
