package com.business.service.impl;

import com.business.dao.TElectronicTicketMapper;
import com.business.entity.TElectronicTicket;
import com.business.entity.TElectronicTicketCriteria;
import com.business.service.ElectronicTicketService;
import com.business.util.DateUtil;
import com.business.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectronicTicketServiceImpl implements ElectronicTicketService {

    @Autowired
    private TElectronicTicketMapper tElectronicTicketMapper;

    //查询电子券列表
    public List<TElectronicTicket> FindElectronicTicket(TElectronicTicket tElectronicTicket){
        return tElectronicTicketMapper.selectByExample(getTElectronicTicketCriteria(tElectronicTicket));
    }
    //设置查询条件
    public TElectronicTicketCriteria  getTElectronicTicketCriteria (TElectronicTicket tElectronicTicket){
        TElectronicTicketCriteria tElectronicTicketCriteria = new TElectronicTicketCriteria();
        TElectronicTicketCriteria.Criteria criteria = tElectronicTicketCriteria.createCriteria();
        if (tElectronicTicket!=null){

            if (tElectronicTicket.getTicketName()!=null && tElectronicTicket.getTicketName()!=""){        //电子券名称
                criteria.andTicketNameLike("%" + tElectronicTicket.getTicketName() + "%");
            }
            if(tElectronicTicket.getCompanyId()!=null){                                                    //companyid
                criteria.andCompanyIdEqualTo(tElectronicTicket.getCompanyId());
            }
            if(tElectronicTicket.getTicketPay()!=null ){                                                //电子券对应现金
                criteria.andTicketPayEqualTo(tElectronicTicket.getTicketPay());
            }
            if(tElectronicTicket.getTicketType()!=null){                                                //电子券类型
                criteria.andTicketTypeEqualTo(tElectronicTicket.getTicketType());
            }
            if(tElectronicTicket.getTicketValue()!=null){                                                  //电子券价值
                criteria.andTicketValueEqualTo(tElectronicTicket.getTicketValue());
            }

        }
        return tElectronicTicketCriteria;
    }


    /**
     * 获取数据总量
     * @param tElectronicTicket
     * @param
     * @return
     */
    private Integer getCount(TElectronicTicket tElectronicTicket){
        Integer total = (int)tElectronicTicketMapper.countByExample(getTElectronicTicketCriteria(tElectronicTicket));
        return total;
    }

    /**
     * 电子券管理(分页)
     * @param tElectronicTicket
     * @param page
     * @param limit
     * @return
     */

    @Override
    public PageBean<TElectronicTicket> geteTicketListbyPage(TElectronicTicket tElectronicTicket, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"update_time desc");
        List<TElectronicTicket> tElectronicTicketLists=FindElectronicTicket(tElectronicTicket);
        Integer countNums =getCount(tElectronicTicket);
        PageBean<TElectronicTicket> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tElectronicTicketLists);
        return pageData;
    }

    /**
     * 新增电子券记录/更新电子券记录
     */
    @Override
    public String updateEticket(TElectronicTicket tElectronicTicket) {
        String msg="";
        if(tElectronicTicket.getId()!=null)                 //根据记录ID判断是更新还是插入
        {
            tElectronicTicket.setUpdateTime(DateUtil.getCurDateTime());
            tElectronicTicketMapper.updateByPrimaryKeySelective(tElectronicTicket);
            msg="更新成功";
        }
        else
        {
            tElectronicTicket.setUpdateTime(DateUtil.getCurDateTime());
            tElectronicTicketMapper.insertSelective(tElectronicTicket);
            msg="新增成功";
        }
        return msg;
    }


    /**
     * 删除电子券记录
     */
    @Override
    public String deleteEticket(TElectronicTicket tElectronicTicket) {
        String msg="";
        if(tElectronicTicket.getId()!=null){
            tElectronicTicketMapper.deleteByPrimaryKey(tElectronicTicket.getId());
            msg="删除成功";
        }
            return msg;
    }

    @Override
    public TElectronicTicket getElectronicTicketByPrimaryKey(Integer id) {
        return tElectronicTicketMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean<TElectronicTicket> geteTicketListbyPageAndIds(List<Integer> ids, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"update_time desc");
        List<TElectronicTicket> tElectronicTicketLists=FindElectronicTicketByIds(ids);
        Integer countNums =getCountByIds(ids);
        PageBean<TElectronicTicket> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tElectronicTicketLists);
        return pageData;
    }

    private  List<TElectronicTicket> FindElectronicTicketByIds(List<Integer> ids){
        return tElectronicTicketMapper.selectByExample(getElectronicTicketCriteriaByIds(ids));
    }

    private Integer getCountByIds(List<Integer> ids){
        return (int)tElectronicTicketMapper.countByExample(getElectronicTicketCriteriaByIds(ids));
    }

    private TElectronicTicketCriteria getElectronicTicketCriteriaByIds(List<Integer> ids){
        TElectronicTicketCriteria tElectronicTicketCriteria = new TElectronicTicketCriteria();
        TElectronicTicketCriteria.Criteria criteria = tElectronicTicketCriteria.createCriteria();
        criteria.andIdIn(ids);
        return tElectronicTicketCriteria;
    }


}
