package com.business.service.impl;

import com.business.dao.CustomizeMapper;
import com.business.dao.TBusinePayMapper;
import com.business.dao.TBusineTicketMapper;
import com.business.dao.TCompanyParkMapper;
import com.business.entity.*;
import com.business.enums.ActionRspEnum;
import com.business.exception.ActionRspException;
import com.business.service.BusineService;
import com.business.service.ElectronicTbusineTicketService;
import com.business.service.ElectronicTicketService;
import com.business.util.DateUtil;
import com.business.util.PageBean;
import com.business.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author jin
 * @Data 2019/4/28 15:47
 **/
@Service
public class ElectronicTbusineTicketServiceImpl implements ElectronicTbusineTicketService {
    @Autowired
    private TBusineTicketMapper tBusineTicketMapper;
    @Autowired
    private CustomizeMapper customizeMapper;
    @Autowired
    private TBusinePayMapper tBusinePayMapper;
    @Autowired
    private TCompanyParkMapper tCompanyParkMapper;

    @Autowired
    private ElectronicTicketService electronicTicketService;
    @Autowired
    private BusineService busineService;

    @Override
    public PageBean<TBusineTicket> getTBusineTicketByPage(TBusineTicket tBusineTicket, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"expiry_date asc");
        List<TBusineTicket> tBusineTicketList=getTBusineTicket(tBusineTicket);
        Integer countNums =getCount(tBusineTicket);
        PageBean<TBusineTicket> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tBusineTicketList);
        return pageData;
    }

    @Override
    public List<Integer> getIdsByUsable(TBusineTicket tBusineTicket) {
        tBusineTicket.setTicketNum(0);
        if (tBusineTicket.getExpiryDate()==null){
            tBusineTicket.setExpiryDate(DateUtil.getCurDateTime());
        }
        List<TBusineTicket> tBusineTickets = tBusineTicketMapper.selectByExample(getTBusineTicketCriteria(tBusineTicket));
        List<Integer> integerList = new ArrayList<>();
        for (TBusineTicket busineTicket : tBusineTickets){
            integerList.add(busineTicket.getTicketId());
        }
        HashSet h = new HashSet(integerList);
        integerList.clear();
        integerList.addAll(h);
        return integerList;
    }

    @Override
    public Integer getTBusineTicketExpireSoon(Integer busineId, Integer ticketId) {
        return customizeMapper.getTBusineTicketExpireSoon(busineId,ticketId);
    }

    @Override
    public String eleBuy(TBusineTicket tBusineTicket) {
        String msg = "购买成功";
        tBusineTicket.setUpdateTime(DateUtil.getCurDateTime());
        tBusineTicket.setTicketInitialNum(tBusineTicket.getTicketNum());
        if (tBusineTicket.getId()!=null){
            //修改
        }else {
            //新增

            TBusine tBusine = busineService.selectByPrimaryKey(tBusineTicket.getBusineId());
            TCompanyPark tCompanyPark=tCompanyParkMapper.selectByPrimaryKey(tBusine.getParkId());
            double balance = tBusine.getBalance();
            double needPay = electronicTicketService.getElectronicTicketByPrimaryKey(tBusineTicket.getTicketId()).getTicketPay()*tBusineTicket.getTicketNum();
            if (balance>=needPay){
                Integer i =tBusineTicketMapper.insertSelective(tBusineTicket);
                if (i==0){
                    msg = "购买失败";
                }
                else {
                    tBusine.setBalance(balance-needPay);
                    busineService.UpdateBusine(tBusine);
                    //添加充值记录（购买记录）
                    TBusinePay tBusinePay=new TBusinePay();
                    tBusinePay.setBusineId(tBusine.getId());
                    tBusinePay.setParkId(tBusine.getParkId());
                    tBusinePay.setCompanyId(tBusine.getCompanyId());
                    tBusinePay.setBusineName(tBusine.getBusineName());
                    tBusinePay.setNeedPay(needPay*(-1));
                    tBusinePay.setActualPay(needPay*(-1));
                    tBusinePay.setOrderNumber(StringUtil.RandomOrder());
                    tBusinePay.setPayTime(DateUtil.getCurDateTime());
                    tBusinePay.setBalance(tBusine.getBalance());
                    tBusinePay.setParkName(tCompanyPark.getParkName());
                    tBusinePay.setRemark("购买电子券");
                    tBusinePayMapper.insertSelective(tBusinePay);
                }
            }else {
                throw new ActionRspException(ActionRspEnum.BusineInsufficientBalance_ERROR);
            }


        }
        return msg;
    }

    @Override
    public String buyBackBusineTicket(TBusineTicket tBusineTicket) {
        String msg="";
        if (tBusineTicket.getId()!=null){
            Integer ticketNum=(Integer)tBusineTicket.getTicketNum();
            if (ticketNum!=0){
                tBusineTicket.setUpdateTime(DateUtil.getCurDateTime());
                tBusineTicketMapper.updateByPrimaryKeySelective(tBusineTicket);

            }else {
                tBusineTicketMapper.deleteByPrimaryKey(tBusineTicket.getId());
            }
            msg="电子券使用记录更新成功";
        }else
        {msg="电子券使用记录更新失败";}
        return msg;
    }

    public Integer getCount(TBusineTicket tBusineTicket){
        return (int)tBusineTicketMapper.countByExample(getTBusineTicketCriteria(tBusineTicket));
    }
    public List<TBusineTicket> getTBusineTicket(TBusineTicket tBusineTicket){
        return tBusineTicketMapper.selectByExample(getTBusineTicketCriteria(tBusineTicket));
    }
    public TBusineTicketCriteria getTBusineTicketCriteria(TBusineTicket tBusineTicket){
        TBusineTicketCriteria tBusineTicketCriteria = new TBusineTicketCriteria();
        TBusineTicketCriteria.Criteria criteria = tBusineTicketCriteria.createCriteria();
        if (tBusineTicket.getBusineId()!=null){
            criteria.andBusineIdEqualTo(tBusineTicket.getBusineId());
        }if (tBusineTicket.getTicketId()!=null){
            criteria.andTicketIdEqualTo(tBusineTicket.getTicketId());
        }if (tBusineTicket.getTicketNum()!=null){
            criteria.andTicketNumGreaterThan(0);
        }if (tBusineTicket.getExpiryDate()!=null){
            criteria.andExpiryDateGreaterThanOrEqualTo(tBusineTicket.getExpiryDate());
        }if (tBusineTicket.getTicketName()!=null){
            criteria.andTicketNameLike("%"+tBusineTicket.getTicketName()+"%");
        }
        return tBusineTicketCriteria;
    }

}
