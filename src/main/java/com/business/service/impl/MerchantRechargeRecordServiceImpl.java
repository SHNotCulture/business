package com.business.service.impl;


import com.business.dao.TBusineMapper;
import com.business.dao.TBusinePayMapper;
import com.business.entity.TBusineCriteria;
import com.business.entity.TBusinePay;
import com.business.entity.TBusinePayCriteria;
import com.business.service.MerchantRechargeRecordService;
import com.business.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**@Author xiexuanran
 * @Date  2019/4/24
 */

@Service
public class MerchantRechargeRecordServiceImpl implements MerchantRechargeRecordService {
    @Autowired
    private TBusinePayMapper tBusinePayMapper;
    @Autowired
    private TBusineMapper tBusineMapper;

    public List<TBusinePay> findMerchantPay(TBusinePay tBusinePay,Integer busineId, String PayTimeBegin, String PayTimeEnd){
        return tBusinePayMapper.selectByExample(getTBusinePayCriteria(tBusinePay,busineId,PayTimeBegin,PayTimeEnd));

    }

    public TBusinePayCriteria getTBusinePayCriteria (TBusinePay tBusinePay,Integer busineId, String PayTimeBegin, String PayTimeEnd){
        TBusinePayCriteria tBusinePayCriteria = new TBusinePayCriteria();
        TBusinePayCriteria.Criteria criteria = tBusinePayCriteria.createCriteria();
        criteria.andBusineIdEqualTo(busineId);
        if (tBusinePay.getParkId()!=null){
            criteria.andParkIdEqualTo(tBusinePay.getParkId());
        }
        if (PayTimeBegin!=null && PayTimeBegin!=""  && PayTimeEnd!="" && PayTimeEnd!=null ){
            criteria.andPayTimeBetween(PayTimeBegin,PayTimeEnd);
        }
        return tBusinePayCriteria;
    }



    /**
     * 获取数据总量
     * @param tBusinePay
     * @param
     * @return
     */
    private Integer getCount(TBusinePay tBusinePay,Integer busineId, String PayTimeBegin, String PayTimeEnd){
        Integer total = (int)tBusinePayMapper.countByExample(getTBusinePayCriteria(tBusinePay,busineId,PayTimeBegin,PayTimeEnd));
        return total;
    }

    /**
     * 商户优惠(分页)
     * @param tBusinePay
     * @param
     * @param page
     * @param limit
     * @return
     */

    @Override
    public PageBean<TBusinePay> findMerchantRechargeRecordbyPage(TBusinePay tBusinePay ,Integer busineId, String PayTimeBegin, String PayTimeEnd, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"pay_time desc");
        List<TBusinePay> tBusinePays=findMerchantPay(tBusinePay,busineId,PayTimeBegin,PayTimeEnd);
        Integer countNums =getCount(tBusinePay,busineId,PayTimeBegin,PayTimeEnd);
        PageBean<TBusinePay> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tBusinePays);
        return pageData;
    }
}
