package com.business.service.impl;

import com.business.dao.CustomizeMapper;
import com.business.dao.TCompanyParkMapper;
import com.business.entity.TCompanyPark;
import com.business.entity.TCompanyParkCriteria;
import com.business.entity.ZtreeRsp;
import com.business.service.CarParkService;
import com.business.util.PageBean;
import com.business.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 14:482018-9-14
 * @Modified By:
 */
@Service
public class CarParkServiceImpl  implements CarParkService {
    private  static final Logger logger= LoggerFactory.getLogger(CarParkServiceImpl.class);
    @Autowired
    private TCompanyParkMapper tCompanyParkMapper;
    @Autowired
    private CustomizeMapper customizeMapper;

    /**
     * 设置查询条件
     * @param tCompanyPark
     * @return
     */
    private TCompanyParkCriteria setCriteria(TCompanyPark tCompanyPark){
        //查询全部车场信息
        TCompanyParkCriteria tCompanyParkCriteria= new TCompanyParkCriteria();
        if(tCompanyPark!=null){
            TCompanyParkCriteria.Criteria criteria=tCompanyParkCriteria.createCriteria();
            if(tCompanyPark.getParkName()!=null&&tCompanyPark.getParkName()!="")
            {
                criteria.andParkNameLike("%"+tCompanyPark.getParkName()+"%");
            }
            if(tCompanyPark.getCompanyId()!=null&&tCompanyPark.getCompanyId()!=0)
            {
                criteria.andCompanyIdEqualTo(tCompanyPark.getCompanyId());
            }
            if(tCompanyPark.getId()!=null){
                criteria.andIdEqualTo(tCompanyPark.getId());
            }

        }
        return  tCompanyParkCriteria;
    }
    /**
     * 获取数据总量
     * @param tCompanyPark
     * @return
     */
    private Integer getCount(TCompanyPark tCompanyPark){
        Integer total =(int)tCompanyParkMapper.countByExample(setCriteria(tCompanyPark));
        return total;
    }


    /**
     * 查询车场信息
     * @return
     */
    public  List<TCompanyPark> getCarPark(TCompanyPark tCompanyPark){
        List<TCompanyPark> tCompanyParkList=tCompanyParkMapper.selectByExample(setCriteria(tCompanyPark));
        return tCompanyParkList;
    }



    /**
     * 根据数组查询对应车场信息
     * @param ids
     * @return
     */
    public  List<TCompanyPark> getCarParkbyIDIn(List<Integer> ids){
        //logger.info("ids:"+ids);
        //查询对应车场信息
        TCompanyParkCriteria tCompanyParkCriteria= new TCompanyParkCriteria();
        TCompanyParkCriteria.Criteria criteria=tCompanyParkCriteria.createCriteria();
        criteria.andIdIn(ids);
        List<TCompanyPark> tCompanyParkList=tCompanyParkMapper.selectByExample(tCompanyParkCriteria);
        return tCompanyParkList;
    }

}
