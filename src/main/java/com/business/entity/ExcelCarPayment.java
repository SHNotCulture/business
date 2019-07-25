package com.business.entity;

import com.business.util.ExcelTitle;
import com.business.util.SessionUtil;

public class ExcelCarPayment {

    private String carplate;
    private String beginDate;
    private Double actualPay;
    private Integer operType;
    private Integer payRule;
    private String payTime;
    private String operator;

    @ExcelTitle(value = "车牌",order=1)
    public String getCarplate() {
        return carplate;
    }
    @ExcelTitle(value = "开始时间",order=2)
    public String getBeginDate() {
        return beginDate;
    }
    @ExcelTitle(value = "截止时间",order=3)
    public Double getActualPay() {
        return actualPay;
    }
    @ExcelTitle(value = "缴费类型",order=4)
    public Integer getOperType() {
        return operType;
    }
    @ExcelTitle(value = "月租规则",order=5)
    public Integer getPayRule() {
        return payRule;
    }
    @ExcelTitle(value = "缴费时间",order=6)
    public String getPayTime() {
        return payTime;
    }
    @ExcelTitle(value = "操作人",order=7)
    public String getOperator() {
        return SessionUtil.getUser().getUserName();
    }

    public void setCarplate(String carplate) {
        this.carplate = carplate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setActualPay(Double actualPay) {
        this.actualPay = actualPay;
    }

    public void setOperType(Integer operType) {
        this.operType = operType;
    }

    public void setPayRule(Integer payRule) {
        this.payRule = payRule;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
