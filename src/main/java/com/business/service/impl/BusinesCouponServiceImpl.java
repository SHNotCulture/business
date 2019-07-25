package com.business.service.impl;

import com.business.dao.CustomizeMapper;
import com.business.dao.TBusineMapper;
import com.business.dao.TBusinesCouponMapper;
import com.business.entity.TBusine;
import com.business.entity.TBusinesCoupon;
import com.business.entity.TBusinesCouponCriteria;
import com.business.entity.TParkInOut;
import com.business.service.BusineService;
import com.business.service.BusinesCouponService;
import com.business.util.DateUtils;
import com.business.util.SessionUtil;
import com.business.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusinesCouponServiceImpl implements BusinesCouponService {

    @Autowired
    private CustomizeMapper customizeMapper;

    @Autowired
    private BusineService busineService;

    @Autowired
    private BusinesCouponService businesCouponService;

    @Autowired
    private TBusinesCouponMapper tBusinesCouponMapper;

    @Autowired
    private TBusineMapper tBusineMapper;


    @Override
    public List<Map> getCouponPayMonth(TBusinesCoupon tBusinesCoupon, Integer year) {
        List<Map> tCouponPayMonth=customizeMapper.getCouponPayMonth(tBusinesCoupon,year);
        return tCouponPayMonth;
    }
    @Override
    public List<Map> getCouponPayDay(TBusinesCoupon tBusinesCoupon, Integer year,Integer month) {
        List<Map> tCouponPayDay=customizeMapper.getCouponPayDay(tBusinesCoupon,year,month);
        return tCouponPayDay;
    }

    @Override
    public TBusinesCoupon setTBusinesCoupon() {
        TBusinesCoupon tBusinesCoupon = new TBusinesCoupon();
        String account =  SessionUtil.getUser().getUserAccout();
        TBusine tBusine = busineService.selectByAccount(account);
        tBusinesCoupon.setBusineId(tBusine.getId());
        tBusinesCoupon.setCompanyId(SessionUtil.getUser().getCompanyId());
        tBusinesCoupon.setParkId(SessionUtil.getParkId());
        return tBusinesCoupon;
    }

    @Override
    public List<Map> returnCouponPayDay() {
        TBusinesCoupon tBusinesCoupon = businesCouponService.setTBusinesCoupon();
        int month = DateUtils.getCurMonth(DateUtils.today());
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Integer dayNum=DateUtils.getDayByMonth(DateUtils.today());

        List<Map> couponPay = businesCouponService.getCouponPayDay(tBusinesCoupon,year,month);

            List<String> DayList = new ArrayList<>();
            for (Integer i=1;i<=dayNum;i++) {
                if (i < 10) {
                    DayList.add("0" + i);
                }else {
                    DayList.add(i.toString());
                }
            }
        List<Map> resultCouponPay = new ArrayList<>();
        int i=0;
        for(String m : DayList){
            Map map = new HashMap();
            map.put("date",m);
            map.put("value",0.00);
            resultCouponPay.add(map);
            for(Map map1 : couponPay){
                if (m.equals(map1.get("date"))){
                    Map map2 = new HashMap();
                    map2.put("date",m);
                    map2.put("value",map1.get("value"));
                    resultCouponPay.remove(i);
                    resultCouponPay.add(map2);
                }
            }
            i++;
        }
        return resultCouponPay;
    }

    @Override
    public List<Map> returnCouponPayMonth() {
        TBusinesCoupon tBusinesCoupon = businesCouponService.setTBusinesCoupon();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        List<Map> couponPay = businesCouponService.getCouponPayMonth(tBusinesCoupon,year);
        List<String> monthList = new ArrayList<>(Arrays.asList("01","02","03","04","05","06","07","08","09","10","11","12"));
        List<Map> resultCouponPay = new ArrayList<>();
        int i=0;
        for(String m : monthList) {
            Map map = new HashMap();
            map.put("date", m);
            map.put("value", 0.00);
            resultCouponPay.add(map);
            for (Map map1 : couponPay) {
                if (m.equals(map1.get("date"))) {
                    Map map2 = new HashMap();
                    map2.put("date", m);
                    map2.put("value", map1.get("value"));
                    resultCouponPay.remove(i);
                    resultCouponPay.add(map2);
                }
            }
            i++;
        }
        return resultCouponPay;
    }

    @Override
    public Double couponSumPay() {
        TBusinesCoupon tBusinesCoupon = businesCouponService.setTBusinesCoupon();
        Double couponSumPay = customizeMapper.getCouponSumPay(tBusinesCoupon);
        return couponSumPay;
    }

    @Override
    public Double couponNeedPay() {
        TBusinesCoupon tBusinesCoupon = businesCouponService.setTBusinesCoupon();
        Double couponNeedPay = customizeMapper.getCouponNeedPay(tBusinesCoupon);
        return couponNeedPay;
    }

    @Override
    public Double couponBalance() {
        Double coupon = businesCouponService.couponSumPay();
        Double total = businesCouponService.couponNeedPay();
        Double balance = total - coupon;
        TBusine tBusine = tBusineMapper.selectByPrimaryKey(businesCouponService.setTBusinesCoupon().getBusineId());
        tBusine.setBalance(balance);
        tBusineMapper.updateByPrimaryKeySelective(tBusine);
        return balance;
    }

    @Override
    public List getBusinesCouponByCarplate(TParkInOut tParkInOut) {
        TBusinesCoupon tBusinesCoupon = new TBusinesCoupon();
        tBusinesCoupon.setParkId(tParkInOut.getParkId());
        tBusinesCoupon.setCarPlate(tParkInOut.getInCarPlate());
        tBusinesCoupon.setInTime(tParkInOut.getInTime());
        List<TBusinesCoupon> tBusinesCoupons = tBusinesCouponMapper.selectByExample(getTBusinesCouponCriteria(tBusinesCoupon));
        List list = new ArrayList();
        for (TBusinesCoupon tBusinesCouponNew : tBusinesCoupons){
            Map map = StringUtil.object2Map(tBusinesCouponNew);
            TBusine tBusine = busineService.selectByPrimaryKey(tBusinesCouponNew.getBusineId());
            map.put("busineName",tBusine.getBusineName());
            map.put("busineType",tBusine.getDiscountType());
            list.add(map);
        }
        return list;
    }

    public TBusinesCouponCriteria getTBusinesCouponCriteria(TBusinesCoupon tBusinesCoupon){
        TBusinesCouponCriteria tBusinesCouponCriteria = new TBusinesCouponCriteria();
        TBusinesCouponCriteria.Criteria criteria = tBusinesCouponCriteria.createCriteria();
        if (tBusinesCoupon!=null){
            if (tBusinesCoupon.getParkId()!=null){
                criteria.andParkIdEqualTo(tBusinesCoupon.getParkId());
            }
            if (tBusinesCoupon.getCarPlate()!=null){
                criteria.andCarPlateEqualTo(tBusinesCoupon.getCarPlate());
            }if (tBusinesCoupon.getInTime()!=null){
                criteria.andInTimeEqualTo(tBusinesCoupon.getInTime());
            }
        }
        return tBusinesCouponCriteria;
    }

}
