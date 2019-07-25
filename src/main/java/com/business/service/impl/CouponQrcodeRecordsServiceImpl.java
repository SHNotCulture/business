package com.business.service.impl;

import com.business.dao.TBusineMapper;
import com.business.dao.TConponQrcodeMapper;
import com.business.entity.TConponQrcode;
import com.business.entity.TConponQrcodeCriteria;
import com.business.enums.ActionRspEnum;
import com.business.exception.ActionRspException;
import com.business.service.CouponQrcodeRecordsService;
import com.business.util.DateUtil;
import com.business.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponQrcodeRecordsServiceImpl implements CouponQrcodeRecordsService {

    @Autowired
    private TConponQrcodeMapper tConponQrcodeMapper;
    @Autowired
    private TBusineMapper tBusineMapper;

    //设置模糊查询条件
    public TConponQrcodeCriteria getTConponQrcodeCriteria (TConponQrcode tConponQrcode){
        TConponQrcodeCriteria tConponQrcodeCriteria = new TConponQrcodeCriteria();
        TConponQrcodeCriteria.Criteria criteria = tConponQrcodeCriteria.createCriteria();
        if (tConponQrcode!=null){

            if (tConponQrcode.getQrcodeName()!=null && tConponQrcode.getQrcodeName()!=""){        //优惠二维码名称
                criteria.andQrcodeNameLike("%" + tConponQrcode.getQrcodeName() + "%");
            }
        }
        return tConponQrcodeCriteria;
    }

    //设置精确查询条件
    public TConponQrcodeCriteria getPreciseTConponQrcodeCriteria (TConponQrcode tConponQrcode){
        TConponQrcodeCriteria tConponQrcodeCriteria = new TConponQrcodeCriteria();
        TConponQrcodeCriteria.Criteria criteria = tConponQrcodeCriteria.createCriteria();
        if (tConponQrcode!=null){

            if (!StringUtils.isBlank(tConponQrcode.getQrcodeName())){        //优惠二维码名称
                criteria.andQrcodeNameEqualTo( tConponQrcode.getQrcodeName());
            }
        }
        return tConponQrcodeCriteria;
    }

    /**
     * 获取数据总量
     * @param tConponQrcode
     * @param
     * @return
     */
    private Integer getCount(TConponQrcode tConponQrcode){
        Integer total = (int)tConponQrcodeMapper.countByExample(getTConponQrcodeCriteria(tConponQrcode));
        return total;
    }

    //查询优惠二维码列表
    public List<TConponQrcode> FindTConponQrcode(TConponQrcode tConponQrcode){
        List<TConponQrcode> t = tConponQrcodeMapper.selectByExample(getTConponQrcodeCriteria(tConponQrcode));
        //System.out.println(t);
        return t;
    }

    /**
     * 优惠二维码管理(分页)
     * @param tConponQrcode
     * @param page
     * @param limit
     * @return
     */
    @Override
    public PageBean<TConponQrcode> getCouponQrcodeListbyPage(TConponQrcode tConponQrcode, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"id desc");
        List<TConponQrcode> tConponQrcodeLists =FindTConponQrcode(tConponQrcode);
        Integer countNums =getCount(tConponQrcode);
        PageBean<TConponQrcode> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tConponQrcodeLists);
        return pageData;
    }

    /**
     * 更新优惠二维码记录
     */
    @Override
    public String updateCouponQrcode(TConponQrcode tConponQrcode) {
        String msg="";
        if(tConponQrcode.getId()!=null)                 //根据记录ID判断是更新还是插入
        {
            tConponQrcode.setCreateTime(DateUtil.getCurDateTime());
            tConponQrcodeMapper.updateByPrimaryKeySelective(tConponQrcode);
            msg="更新成功";
        }
        return msg;
    }


    /**
     * 删除优惠二维码记录
     */
    @Override
    public String deleteCouponQrcode(TConponQrcode tConponQrcode) {
        String msg="";
        if(tConponQrcode.getId()!=null){
            tConponQrcodeMapper.deleteByPrimaryKey(tConponQrcode.getId());
            msg="删除成功";
        }
        return msg;
    }

    /**
     * 生成优惠二维码记录
     */
    @Override
    public String createCouponQrcode(TConponQrcode tConponQrcode) {
        String msg="";
        if(tConponQrcode.getId()==null){
            tConponQrcodeMapper.insertSelective(tConponQrcode);
            msg="新建成功";
        }
        return msg;
    }

    @Override
    public Integer getIdCouponQrcode(TConponQrcode tConponQrcode) {

        return  tConponQrcodeMapper.selectByExample(getTConponQrcodeCriteria(tConponQrcode)).get(0).getId();
    }

    /*
    根据qrcodeName查询数据库
     */
    @Override
    public void existQrcodeName(TConponQrcode tConponQrcode) {

        if(tConponQrcodeMapper.selectByExample(getPreciseTConponQrcodeCriteria(tConponQrcode)).size()>0){
            throw new ActionRspException(ActionRspEnum.QrcodeName_ERROR);
        }

    }

    @Override
    public void lessDiscountAmount(TConponQrcode tConponQrcode, Integer busineId) {
        //当优惠类型不为时间时执行小于单笔最大消费金额判断
        if (tConponQrcode.getCouponType()!=1){
        Integer discountAmount=tBusineMapper.selectByPrimaryKey(busineId).getDiscountAmount();
        if (tConponQrcode.getCouponPay()>discountAmount){
            throw new ActionRspException(ActionRspEnum.GreaterThanDiscountAmount_ERROR);
        }
    }
    }

}
