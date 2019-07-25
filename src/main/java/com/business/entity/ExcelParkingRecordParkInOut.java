package com.business.entity;

import com.business.util.CommonUtil;
import com.business.util.ExcelTitle;

public class ExcelParkingRecordParkInOut {
    private String inCarPlate;
    private String carNature;//根据commonuntil判断
    private String inOutTime;//进场时间和出场时间拼接
    private String stopTime;
    private Double needPay;
    private Double actualPay;
    private Double qpassPay;
    private Double coupon;
    private Double beforePay;
    private Double localcoupon;
    private String outTypeDesc;
    private String dutyPerson;
    private String inTime;
    private String outTime;
    private String remark;


    @ExcelTitle(value = "车牌",order=1)
    public String getInCarPlate() {
        return inCarPlate;
    }
    @ExcelTitle(value = "车辆类型",order=2)
    public String getCarNature() {
        return carNature;
    }
    @ExcelTitle(value = "进出场时间",order=3)
    public String getInOutTime() {
        return inOutTime;
    }
    @ExcelTitle(value = "停车时长",order=4)
    public String getStopTime() {
        return stopTime;
    }
    @ExcelTitle(value = "应收",order=5)
    public Double getNeedPay() {
        return needPay;
    }
    @ExcelTitle(value = "现金",order=6)
    public Double getActualPay() {
        return actualPay;
    }
    @ExcelTitle(value = "聚合",order=7)
    public Double getQpassPay() {
        return qpassPay;
    }
    @ExcelTitle(value = "代缴",order=8)
    public Double getCoupon() {
        return coupon;
    }
    @ExcelTitle(value = "预缴",order=9)
    public Double getBeforePay() {
        return beforePay;
    }
    @ExcelTitle(value = "减免",order=10)
    public Double getLocalcoupon() {
        return localcoupon;
    }
    @ExcelTitle(value = "出场方式",order=11)
    public String getOutTypeDesc() {
        return outTypeDesc;
    }
    @ExcelTitle(value = "当班员",order=12)
    public String getDutyPerson() {
        return dutyPerson;
    }
    @ExcelTitle(value = "说明",order=13)
    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInCarPlate(String inCarPlate) {
        this.inCarPlate = inCarPlate;
    }

    public void setCarNature(Integer carNatureStr) {
        this.carNature = CommonUtil.carNature.get(carNatureStr-1).getName();
    }


    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public void setNeedPay(Double needPay) {
        this.needPay = needPay;
    }

    public void setActualPay(Double actualPay) {
        this.actualPay = actualPay;
    }

    public void setQpassPay(Double qpassPay) {
        this.qpassPay = qpassPay;
    }

    public void setCoupon(Double coupon) {
        this.coupon = coupon;
    }

    public void setBeforePay(Double beforePay) {
        this.beforePay = beforePay;
    }

    public void setLocalcoupon(Double localcoupon) {
        this.localcoupon = localcoupon;
    }

    public void setOutTypeDesc(String outTypeDesc) {
        this.outTypeDesc = outTypeDesc;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
        this.inOutTime=inTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
        this.inOutTime=this.inOutTime+"*"+outTime;
    }

}
