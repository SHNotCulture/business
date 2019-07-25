package com.business.service;

import com.business.entity.TCompanyPark;
import com.business.entity.ZtreeRsp;
import com.business.util.PageBean;

import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 14:482018-9-14
 * @Modified By:
 */
public interface CarParkService {
    List<TCompanyPark> getCarParkbyIDIn(List<Integer> ids);
    List<TCompanyPark> getCarPark(TCompanyPark tCompanyPark);

}
