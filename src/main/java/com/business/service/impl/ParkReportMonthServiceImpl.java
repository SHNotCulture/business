package com.business.service.impl;

import com.business.dao.TParkReportMonthMapper;
import com.business.entity.*;
import com.business.service.ParkReportMonthService;
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
 * @Date Create in 18:262018-11-6
 * @Modified By:
 */
@Service
public class ParkReportMonthServiceImpl  implements ParkReportMonthService {
    private  static final Logger logger= LoggerFactory.getLogger(ParkReportMonthServiceImpl.class);
    @Autowired
    private TParkReportMonthMapper tParkReportMonthMapper;

    /**
     *设置查询条件
     * @param beginTime
     * @param endTime
     * @param tParkReportMonth
     * @return
     */
    private TParkReportMonthCriteria setCriteria(String beginTime, String endTime, TParkReportMonth tParkReportMonth){
        //查询月报表信息
        TParkReportMonthCriteria tParkReportMonthCriteria= new TParkReportMonthCriteria();
        if(tParkReportMonth!=null){
            TParkReportMonthCriteria.Criteria criteria=tParkReportMonthCriteria.createCriteria();
            if(tParkReportMonth.getParkId()!=null)
            {
                criteria.andParkIdEqualTo(tParkReportMonth.getParkId());
            }
            if(beginTime!=null&&endTime!=null&&beginTime!=""&&endTime!="")
            {
                criteria.andCreateDateBetween(beginTime,endTime);
            }

        }
        return  tParkReportMonthCriteria;
    }
    /**
     * 获取数据总量
     * @param beginTime
     * @param endTime
     * @param tParkReportMonth
     * @return
     */
    private Integer getCount(String beginTime,String endTime,TParkReportMonth tParkReportMonth){
        Integer total =(int)tParkReportMonthMapper.countByExample(setCriteria( beginTime, endTime, tParkReportMonth));
        return total;
    }
    /**
     * 查询月报表信息(分页)
     * @param beginTime
     * @param endTime
     * @param tParkReportMonth
     * @param page
     * @param limit
     * @return
     */
    public PageBean<TParkReportMonth> getParkReportMonthbyPage(String beginTime, String endTime, TParkReportMonth tParkReportMonth, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TParkReportMonth> tParkReportMonthList=getParkReportMonth(beginTime, endTime, tParkReportMonth);
        Integer countNums =getCount(beginTime, endTime, tParkReportMonth);
        PageBean<TParkReportMonth> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tParkReportMonthList);
        return pageData;
    }
    /**
     * 查询月报表信息
     * @return
     */
    public List<TParkReportMonth> getParkReportMonth(String beginTime, String endTime, TParkReportMonth tParkReportMonth){
        List<TParkReportMonth> tParkReportMonthList=tParkReportMonthMapper.selectByExample(setCriteria(beginTime,endTime,tParkReportMonth));
        return tParkReportMonthList;
    }

    /**
     * 导出月报表信息
     * @param beginTime
     * @param endTime
     * @param tParkReportMonth
     * @param title
     * @param response
     */
    public void exportList(String beginTime,String endTime,TParkReportMonth tParkReportMonth,String title, HttpServletResponse response){
        List<TParkReportMonth> tParkReportMonthList=getParkReportMonth(beginTime, endTime, tParkReportMonth);
        List<ExeclParkReportMonth> execlParkReportMonths=new ArrayList<>();
        logger.info("tParkReportMonthList:"+tParkReportMonthList);
        for (TParkReportMonth tParkReportNew : tParkReportMonthList){
            ExeclParkReportMonth execlParkReportMonth = new ExeclParkReportMonth();
            try {
                execlParkReportMonth = (ExeclParkReportMonth) BeanCopyUtil.CopyBeanToBean(tParkReportNew,execlParkReportMonth);
            } catch (Exception e) {
                e.printStackTrace();
            }
            execlParkReportMonths.add(execlParkReportMonth);
        }
        try {
            ExportExcelUtil.exportExcel(response,title,title,title,execlParkReportMonths);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
