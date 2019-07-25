package com.business.service.impl;

import com.business.dao.TDicOuttypeMapper;
import com.business.dao.TDicPrepayTypeMapper;
import com.business.dao.TParkPortMapper;
import com.business.entity.*;
import com.business.service.BaseDicService;
import com.business.util.Common;
import com.business.util.StringUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BaseDicServiceImpl
 * @Author jin
 * @Date 2018/9/27 15:48
 **/
@Service
public class BaseDicServiceImpl implements BaseDicService {

    private  static final Logger logger= LoggerFactory.getLogger(BaseDicServiceImpl.class);

    @Autowired
    private TParkPortMapper tParkPortMapper;
    @Autowired
    private TDicOuttypeMapper tDicOuttypeMapper;
    @Autowired
    private TDicPrepayTypeMapper tDicPrepayTypeMapper;

    @Override
    public List<TParkPort> selectParkPort(String portType) {
        String parkid = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(Common.ParkId).toString();
        TParkPortCriteria tParkPortCriteria = new TParkPortCriteria();
        TParkPortCriteria.Criteria criteria = tParkPortCriteria.createCriteria();
        criteria.andParkIdEqualTo(Integer.valueOf(parkid));
        if (portType==null){
            criteria.andPortTypeIsNotNull();
        }else {
            criteria.andPortTypeEqualTo(Integer.valueOf(portType));
        }
        return tParkPortMapper.selectByExample(tParkPortCriteria);
    }

    @Override
    public List<TDicOuttype> selectOutType() {
        TDicOuttypeCriteria tDicOuttypeCriteria = new TDicOuttypeCriteria();
        TDicOuttypeCriteria.Criteria criteria = tDicOuttypeCriteria.createCriteria();
        return tDicOuttypeMapper.selectByExample(tDicOuttypeCriteria);
    }

    @Override
    public List<TDicPrepayType> selectgetPayType() {
        TDicPrepayTypeCriteria tDicPrepayTypeCriteria = new TDicPrepayTypeCriteria();
        TDicPrepayTypeCriteria.Criteria criteria = tDicPrepayTypeCriteria.createCriteria();
        return tDicPrepayTypeMapper.selectByExample(tDicPrepayTypeCriteria);
    }

    /**
     * 查询全部页面信息Ztree
     * @return
     */
    @Override
    public List<ZtreeRsp> getPortNameListForZtree(String portType) {
        List<ZtreeRsp> ztreeRspList=new ArrayList<ZtreeRsp>();
        try{
            String parkid = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(Common.ParkId).toString();
            TParkPortCriteria tParkPortCriteria = new TParkPortCriteria();
            TParkPortCriteria.Criteria criteria = tParkPortCriteria.createCriteria();
            criteria.andParkIdEqualTo(Integer.valueOf(parkid));
            if (portType==null){
                criteria.andPortTypeIsNotNull();
            }else {
                criteria.andPortTypeEqualTo(Integer.valueOf(portType));
            }
            List<TParkPort> tParkPortLists =  tParkPortMapper.selectByExample(tParkPortCriteria);

            ZtreeRsp ztreeRspall=new ZtreeRsp();
            ztreeRspall.setId(0);
            ztreeRspall.setpId(0);
            ztreeRspall.setName("所有通道");
            ztreeRspall.setOpen(true);
            ztreeRspList.add(ztreeRspall);
            for (TParkPort tParkPortList:tParkPortLists) {
                ZtreeRsp ztreeRsp=new ZtreeRsp();
                ztreeRsp.setId(tParkPortList.getId());
                ztreeRsp.setpId(0);
                ztreeRsp.setName(tParkPortList.getPortName());
                //if(tParkPortList.getPid().equals(0)){
                //ztreeRsp.setOpen(true);
                //}
                ztreeRspList.add(ztreeRsp);
            }
        }
        catch (Exception e){
            logger.info("获取Ztree信息异常,异常信息为："+e.toString());
        }

        return ztreeRspList;
    }

}
