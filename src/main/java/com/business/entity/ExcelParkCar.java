package com.business.entity;

import com.business.util.CommonUtil;
import com.business.util.ExcelTitle;

public class ExcelParkCar {
    private String carPlate;
    private String parkingSpace;//根据commonuntil判断
    private String payruleidstr;
    private String beginDate;
    private String stopTime;
    private String endDate;
    private String realname;
    private String phone;
    private String address;
    private String status;//根据commonuntil判断
    private Integer parkingNo;
    private String parkCode;
    private String portNamesStr;

    @ExcelTitle(value = "车牌",order=1)
    public String getCarPlate() {
        return carPlate;
    }
    @ExcelTitle(value = "车位性质",order=2)
    public String getParkingSpace() {
        return parkingSpace;
    }
    @ExcelTitle(value = "月租规则",order=3)
    public String getPayruleidstr() {
        return payruleidstr;
    }
    @ExcelTitle(value = "月卡开始时间",order=4)
    public String getBeginDate() {
        return beginDate;
    }
    @ExcelTitle(value = "暂停时间",order=5)
    public String getStopTime() {
        return stopTime;
    }
    @ExcelTitle(value = "月卡到期时间",order=6)
    public String getEndDate() {
        return endDate;
    }
    @ExcelTitle(value = "联系人",order=7)
    public String getRealname() {
        return realname;
    }
    @ExcelTitle(value = "电话",order=8)
    public String getPhone() {
        return phone;
    }
    @ExcelTitle(value = "地址",order=9)
    public String getAddress() {
        return address;
    }
    @ExcelTitle(value = "月卡状态",order=10)
    public String getStatus() {
        return status;
    }
    @ExcelTitle(value = "占用车位数",order=11)
    public Integer getParkingNo() {
        return parkingNo;
    }
    @ExcelTitle(value = "车位编码",order=12)
    public String getParkCode() {
        return parkCode;
    }
    @ExcelTitle(value = "通道权限",order=13)
    public String getPortNamesStr() {
        return portNamesStr;
    }


    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void setParkingSpaceStr(Integer parkingSpaceStr) {
        this.parkingSpace = CommonUtil.parkingSpace.get(parkingSpaceStr-1).getName();
    }

    public void setPayruleidstr(String payruleidstr) {
        this.payruleidstr = payruleidstr;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(Short statusStr) {
        this.status = CommonUtil.status.get(statusStr-1).getName();
    }

    public void setParkingNo(Integer parkingNo) {
        this.parkingNo = parkingNo;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public void setPortNamesStr(String portNamesStr) {
        this.portNamesStr = portNamesStr;
    }
}
