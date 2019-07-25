package com.business.entity;

import com.business.util.ExcelTitle;

public class ExcelBlacklist {
    private String carPlate;
    private String createTime;
    private String createPerson;
    private String beginTime;
    private String endTime;

    @ExcelTitle(value = "车牌号",order=1)
    public String getCarPlate() {
        return carPlate;
    }
    @ExcelTitle(value = "创建时间",order=2)
    public String getCreateTime() {
        return createTime;
    }
    @ExcelTitle(value = "创建人",order=3)
    public String getCreatePerson() {
        return createPerson;
    }
    @ExcelTitle(value = "车牌号",order=4)
    public String getBeginTime() {
        return beginTime;
    }
    @ExcelTitle(value = "截止时间",order=5)
    public String getEndTime() {
        return endTime;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
