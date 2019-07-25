package com.business.service.impl;

import com.business.dao.TBusinesCouponMapper;
import com.business.entity.TBusinesCoupon;
import com.business.entity.TBusinesCouponCriteria;
import com.business.service.MerchantCouponRecordService;
import com.business.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**@Author xiexuanran
 * @Date  2019/4/12
 */

@Service
public class MerchantCouponRecordServiceImpl implements MerchantCouponRecordService {

    @Autowired
    private TBusinesCouponMapper tBusinesCouponMapper;

    /**
     * 查询商户消费记录
     * @param tBusinesCoupon
     * @param CouponTimeBegin
     * @param CouponTimeEnd
     * @return
     */
    public List<TBusinesCoupon> FindMerchantCoupon(TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd){
        return tBusinesCouponMapper.selectByExample(getTBusinesCouponCriteria(tBusinesCoupon,CouponTimeBegin,CouponTimeEnd));
    }

    /**
     * 获取数据总量
     * @param tBusinesCoupon
     * @param
     * @return
     */
    private Integer getCount(TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd){
        Integer total = (int)tBusinesCouponMapper.countByExample(getTBusinesCouponCriteria(tBusinesCoupon,CouponTimeBegin,CouponTimeEnd));
        return total;
    }

    public TBusinesCouponCriteria getTBusinesCouponCriteria (TBusinesCoupon tBusinesCoupon, String CouponTimeBegin, String CouponTimeEnd){
        TBusinesCouponCriteria tBusinesCouponCriteria = new TBusinesCouponCriteria();
        TBusinesCouponCriteria.Criteria criteria = tBusinesCouponCriteria.createCriteria();
        if (tBusinesCoupon!=null){

            if (tBusinesCoupon.getCarPlate()!=null && tBusinesCoupon.getCarPlate()!=""){        //车牌
                criteria.andCarPlateLike("%" + tBusinesCoupon.getCarPlate() + "%");
            }
            if (tBusinesCoupon.getBusineId()!=null){
                criteria.andBusineIdEqualTo(tBusinesCoupon.getBusineId());
            }

        }
        if (CouponTimeBegin!=null && CouponTimeBegin!=""  && CouponTimeEnd!="" && CouponTimeEnd!=null ){
            criteria.andInTimeBetween(CouponTimeBegin,CouponTimeEnd);
        }
        return tBusinesCouponCriteria;
    }


    /**
     * 商户优惠(分页)
     * @param tBusinesCoupon
     * @param
     * @param page
     * @param limit
     * @return
     */

    @Override
    public PageBean<TBusinesCoupon> FindMerchantCouponbyPage(TBusinesCoupon tBusinesCoupon ,String CouponTimeBegin, String CouponTimeEnd,Integer page,Integer limit){
        PageHelper.startPage(page, limit,"create_date desc");
        List<TBusinesCoupon> tBusinesCoupons=FindMerchantCoupon(tBusinesCoupon,CouponTimeBegin,CouponTimeEnd);
        Integer countNums =getCount(tBusinesCoupon,CouponTimeBegin,CouponTimeEnd);
        PageBean<TBusinesCoupon> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tBusinesCoupons);
        return pageData;
    }
}
