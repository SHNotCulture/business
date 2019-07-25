package com.business.service.impl;

import com.business.dao.TBusinePayMapper;
import com.business.entity.*;
import com.business.service.BusinePayService;
import com.business.util.BeanCopyUtil;
import com.business.util.ExportExcelUtil;
import com.business.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 11:162018-10-9
 * @Modified By:
 */
@Service
public class BusinePayServiceImpl implements BusinePayService{
    private  static final Logger logger= LoggerFactory.getLogger(BusinePayServiceImpl.class);
    @Autowired
    private TBusinePayMapper tBusinePayMapper;

    /**
     * 设置查询条件
     * @param tBusinePay
     * @return
     */
    private TBusinePayCriteria setCriteria(TBusinePay tBusinePay,String beginTime,String endTime){
        TBusinePayCriteria tBusinePayCriteria= new TBusinePayCriteria();
        if(tBusinePay!=null){
            TBusinePayCriteria.Criteria criteria=tBusinePayCriteria.createCriteria();
            if(tBusinePay.getParkId()!=null)
            {
                criteria.andParkIdEqualTo(tBusinePay.getParkId());
            }
            if(tBusinePay.getBusineName()!=null)
            {
                criteria.andBusineNameLike("%"+tBusinePay.getBusineName()+"%");
            }
            if(tBusinePay.getCompanyId()!=null){
                criteria.andCompanyIdEqualTo(tBusinePay.getCompanyId());
            }
            if(beginTime!=null&&endTime!=null&&beginTime!=""&&endTime!="")
            {
                criteria.andPayTimeBetween(beginTime,endTime);
            }
            tBusinePayCriteria.setOrderByClause("pay_time DESC");
        }
        return tBusinePayCriteria;
    }
    /**
     * 获取数据总量
     * @param tBusinePay
     * @return
     */
    private Integer getCount(TBusinePay tBusinePay,String beginTime,String endTime){
        Integer total =(int)tBusinePayMapper.countByExample(setCriteria(tBusinePay,beginTime,endTime));
        return total;
    }
    /**
     *查询商户充值记录(分页)
     * @param tBusinePay
     * @param page
     * @param limit
     * @return
     */
    public PageBean<TBusinePay> getTBusinePaybyPage(TBusinePay tBusinePay, Integer page, Integer limit,String beginTime,String endTime){
        PageHelper.startPage(page, limit,"id desc");
        List<TBusinePay> tBusinePayList=getTBusinePay(tBusinePay,beginTime,endTime);
        Integer countNums =getCount(tBusinePay,beginTime,endTime);
        PageBean<TBusinePay> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tBusinePayList);
        return pageData;
    }
    /**
     * 查询商户充值记录
     * @return
     */
    public List<TBusinePay> getTBusinePay(TBusinePay tBusinePay,String beginTime,String endTime){
        List<TBusinePay> tBusinePayList=tBusinePayMapper.selectByExample(setCriteria(tBusinePay,beginTime,endTime));
        return tBusinePayList;
    }
    /**
     * 导出商户充值记录
     * @param beginTime
     * @param endTime
     * @param tBusinePay
     * @param title
     * @param response
     */
    public void exportList(TBusinePay tBusinePay,String beginTime,String endTime, String title, HttpServletResponse response){
        List<TBusinePay> tBusinePayList=getTBusinePay(tBusinePay,beginTime,endTime);
        List<ExcelTBusinePay> excelTBusinePays=new ArrayList<>();
        logger.info("tBusinePayList:"+tBusinePayList);
        for (TBusinePay tBusinePayNew : tBusinePayList){
            ExcelTBusinePay excelTBusinePay = new ExcelTBusinePay();
            try {
                excelTBusinePay = (ExcelTBusinePay) BeanCopyUtil.CopyBeanToBean(tBusinePayNew,excelTBusinePay);
            } catch (Exception e) {
                e.printStackTrace();
            }
            excelTBusinePays.add(excelTBusinePay);
        }
        try {
            ExportExcelUtil.exportExcel(response,title,title,title,excelTBusinePays);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Double totalRecharge(Integer busineId) {
        return null;
    }

    @Override
    public Double totalConsumption(Integer busineId) {
        return null;
    }

}
