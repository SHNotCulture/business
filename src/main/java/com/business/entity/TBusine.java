package com.business.entity;

import java.math.BigDecimal;

public class TBusine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.park_id
     *
     * @mbg.generated
     */
    private Integer parkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.busine_name
     *
     * @mbg.generated
     */
    private String busineName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.balance
     *
     * @mbg.generated
     */
    private Double balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.busine_type
     *
     * @mbg.generated
     */
    private Integer busineType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.principal
     *
     * @mbg.generated
     */
    private String principal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.pos_code
     *
     * @mbg.generated
     */
    private String posCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.discount
     *
     * @mbg.generated
     */
    private BigDecimal discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.busine_status
     *
     * @mbg.generated
     */
    private Integer busineStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.isfree
     *
     * @mbg.generated
     */
    private Integer isfree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.discount_amount
     *
     * @mbg.generated
     */
    private Integer discountAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.discount_type
     *
     * @mbg.generated
     */
    private Integer discountType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.initial_amount
     *
     * @mbg.generated
     */
    private Double initialAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.is_auto
     *
     * @mbg.generated
     */
    private Integer isAuto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine.fixed_amount
     *
     * @mbg.generated
     */
    private Double fixedAmount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.id
     *
     * @return the value of t_busine.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.id
     *
     * @param id the value for t_busine.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.company_id
     *
     * @return the value of t_busine.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.company_id
     *
     * @param companyId the value for t_busine.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.park_id
     *
     * @return the value of t_busine.park_id
     *
     * @mbg.generated
     */
    public Integer getParkId() {
        return parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.park_id
     *
     * @param parkId the value for t_busine.park_id
     *
     * @mbg.generated
     */
    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.busine_name
     *
     * @return the value of t_busine.busine_name
     *
     * @mbg.generated
     */
    public String getBusineName() {
        return busineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.busine_name
     *
     * @param busineName the value for t_busine.busine_name
     *
     * @mbg.generated
     */
    public void setBusineName(String busineName) {
        this.busineName = busineName == null ? null : busineName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.account
     *
     * @return the value of t_busine.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.account
     *
     * @param account the value for t_busine.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.password
     *
     * @return the value of t_busine.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.password
     *
     * @param password the value for t_busine.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.balance
     *
     * @return the value of t_busine.balance
     *
     * @mbg.generated
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.balance
     *
     * @param balance the value for t_busine.balance
     *
     * @mbg.generated
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.busine_type
     *
     * @return the value of t_busine.busine_type
     *
     * @mbg.generated
     */
    public Integer getBusineType() {
        return busineType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.busine_type
     *
     * @param busineType the value for t_busine.busine_type
     *
     * @mbg.generated
     */
    public void setBusineType(Integer busineType) {
        this.busineType = busineType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.principal
     *
     * @return the value of t_busine.principal
     *
     * @mbg.generated
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.principal
     *
     * @param principal the value for t_busine.principal
     *
     * @mbg.generated
     */
    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.phone
     *
     * @return the value of t_busine.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.phone
     *
     * @param phone the value for t_busine.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.mobile
     *
     * @return the value of t_busine.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.mobile
     *
     * @param mobile the value for t_busine.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.address
     *
     * @return the value of t_busine.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.address
     *
     * @param address the value for t_busine.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.pos_code
     *
     * @return the value of t_busine.pos_code
     *
     * @mbg.generated
     */
    public String getPosCode() {
        return posCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.pos_code
     *
     * @param posCode the value for t_busine.pos_code
     *
     * @mbg.generated
     */
    public void setPosCode(String posCode) {
        this.posCode = posCode == null ? null : posCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.discount
     *
     * @return the value of t_busine.discount
     *
     * @mbg.generated
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.discount
     *
     * @param discount the value for t_busine.discount
     *
     * @mbg.generated
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.busine_status
     *
     * @return the value of t_busine.busine_status
     *
     * @mbg.generated
     */
    public Integer getBusineStatus() {
        return busineStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.busine_status
     *
     * @param busineStatus the value for t_busine.busine_status
     *
     * @mbg.generated
     */
    public void setBusineStatus(Integer busineStatus) {
        this.busineStatus = busineStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.remark
     *
     * @return the value of t_busine.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.remark
     *
     * @param remark the value for t_busine.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.isfree
     *
     * @return the value of t_busine.isfree
     *
     * @mbg.generated
     */
    public Integer getIsfree() {
        return isfree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.isfree
     *
     * @param isfree the value for t_busine.isfree
     *
     * @mbg.generated
     */
    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.discount_amount
     *
     * @return the value of t_busine.discount_amount
     *
     * @mbg.generated
     */
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.discount_amount
     *
     * @param discountAmount the value for t_busine.discount_amount
     *
     * @mbg.generated
     */
    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.discount_type
     *
     * @return the value of t_busine.discount_type
     *
     * @mbg.generated
     */
    public Integer getDiscountType() {
        return discountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.discount_type
     *
     * @param discountType the value for t_busine.discount_type
     *
     * @mbg.generated
     */
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.initial_amount
     *
     * @return the value of t_busine.initial_amount
     *
     * @mbg.generated
     */
    public Double getInitialAmount() {
        return initialAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.initial_amount
     *
     * @param initialAmount the value for t_busine.initial_amount
     *
     * @mbg.generated
     */
    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.is_auto
     *
     * @return the value of t_busine.is_auto
     *
     * @mbg.generated
     */
    public Integer getIsAuto() {
        return isAuto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.is_auto
     *
     * @param isAuto the value for t_busine.is_auto
     *
     * @mbg.generated
     */
    public void setIsAuto(Integer isAuto) {
        this.isAuto = isAuto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine.fixed_amount
     *
     * @return the value of t_busine.fixed_amount
     *
     * @mbg.generated
     */
    public Double getFixedAmount() {
        return fixedAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine.fixed_amount
     *
     * @param fixedAmount the value for t_busine.fixed_amount
     *
     * @mbg.generated
     */
    public void setFixedAmount(Double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
}