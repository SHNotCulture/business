package com.business.entity;

public class TElectronPayment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.park_id
     *
     * @mbg.generated
     */
    private Integer parkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.create_date
     *
     * @mbg.generated
     */
    private String createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_online_total
     *
     * @mbg.generated
     */
    private Double tempOnlineTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.fix_online_actual_total
     *
     * @mbg.generated
     */
    private Double fixOnlineActualTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_qPassPay_Total
     *
     * @mbg.generated
     */
    private Double tempQpasspayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_PrePay_Total
     *
     * @mbg.generated
     */
    private Double tempPrepayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.weChat_PrePay_Total
     *
     * @mbg.generated
     */
    private Double wechatPrepayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.alipay_PrePay_Total
     *
     * @mbg.generated
     */
    private Double alipayPrepayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.third_PrePay_Total
     *
     * @mbg.generated
     */
    private Double thirdPrepayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.monthly_weChat_Total
     *
     * @mbg.generated
     */
    private Double monthlyWechatTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_unionPay_Total
     *
     * @mbg.generated
     */
    private Double tempUnionpayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_card_Total
     *
     * @mbg.generated
     */
    private Double tempCardTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_rights_Total
     *
     * @mbg.generated
     */
    private Double tempRightsTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_weChat_Total
     *
     * @mbg.generated
     */
    private Double tempWechatTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.temp_alipay_Total
     *
     * @mbg.generated
     */
    private Double tempAlipayTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.pay_less_Total
     *
     * @mbg.generated
     */
    private Double payLessTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.pay_more_Total
     *
     * @mbg.generated
     */
    private Double payMoreTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.reconciliation_statement
     *
     * @mbg.generated
     */
    private String reconciliationStatement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_electron_payment.check_flag
     *
     * @mbg.generated
     */
    private Integer checkFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.id
     *
     * @return the value of t_electron_payment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.id
     *
     * @param id the value for t_electron_payment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.park_id
     *
     * @return the value of t_electron_payment.park_id
     *
     * @mbg.generated
     */
    public Integer getParkId() {
        return parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.park_id
     *
     * @param parkId the value for t_electron_payment.park_id
     *
     * @mbg.generated
     */
    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.create_date
     *
     * @return the value of t_electron_payment.create_date
     *
     * @mbg.generated
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.create_date
     *
     * @param createDate the value for t_electron_payment.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_online_total
     *
     * @return the value of t_electron_payment.temp_online_total
     *
     * @mbg.generated
     */
    public Double getTempOnlineTotal() {
        return tempOnlineTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_online_total
     *
     * @param tempOnlineTotal the value for t_electron_payment.temp_online_total
     *
     * @mbg.generated
     */
    public void setTempOnlineTotal(Double tempOnlineTotal) {
        this.tempOnlineTotal = tempOnlineTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.fix_online_actual_total
     *
     * @return the value of t_electron_payment.fix_online_actual_total
     *
     * @mbg.generated
     */
    public Double getFixOnlineActualTotal() {
        return fixOnlineActualTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.fix_online_actual_total
     *
     * @param fixOnlineActualTotal the value for t_electron_payment.fix_online_actual_total
     *
     * @mbg.generated
     */
    public void setFixOnlineActualTotal(Double fixOnlineActualTotal) {
        this.fixOnlineActualTotal = fixOnlineActualTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_qPassPay_Total
     *
     * @return the value of t_electron_payment.temp_qPassPay_Total
     *
     * @mbg.generated
     */
    public Double getTempQpasspayTotal() {
        return tempQpasspayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_qPassPay_Total
     *
     * @param tempQpasspayTotal the value for t_electron_payment.temp_qPassPay_Total
     *
     * @mbg.generated
     */
    public void setTempQpasspayTotal(Double tempQpasspayTotal) {
        this.tempQpasspayTotal = tempQpasspayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_PrePay_Total
     *
     * @return the value of t_electron_payment.temp_PrePay_Total
     *
     * @mbg.generated
     */
    public Double getTempPrepayTotal() {
        return tempPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_PrePay_Total
     *
     * @param tempPrepayTotal the value for t_electron_payment.temp_PrePay_Total
     *
     * @mbg.generated
     */
    public void setTempPrepayTotal(Double tempPrepayTotal) {
        this.tempPrepayTotal = tempPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.weChat_PrePay_Total
     *
     * @return the value of t_electron_payment.weChat_PrePay_Total
     *
     * @mbg.generated
     */
    public Double getWechatPrepayTotal() {
        return wechatPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.weChat_PrePay_Total
     *
     * @param wechatPrepayTotal the value for t_electron_payment.weChat_PrePay_Total
     *
     * @mbg.generated
     */
    public void setWechatPrepayTotal(Double wechatPrepayTotal) {
        this.wechatPrepayTotal = wechatPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.alipay_PrePay_Total
     *
     * @return the value of t_electron_payment.alipay_PrePay_Total
     *
     * @mbg.generated
     */
    public Double getAlipayPrepayTotal() {
        return alipayPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.alipay_PrePay_Total
     *
     * @param alipayPrepayTotal the value for t_electron_payment.alipay_PrePay_Total
     *
     * @mbg.generated
     */
    public void setAlipayPrepayTotal(Double alipayPrepayTotal) {
        this.alipayPrepayTotal = alipayPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.third_PrePay_Total
     *
     * @return the value of t_electron_payment.third_PrePay_Total
     *
     * @mbg.generated
     */
    public Double getThirdPrepayTotal() {
        return thirdPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.third_PrePay_Total
     *
     * @param thirdPrepayTotal the value for t_electron_payment.third_PrePay_Total
     *
     * @mbg.generated
     */
    public void setThirdPrepayTotal(Double thirdPrepayTotal) {
        this.thirdPrepayTotal = thirdPrepayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.monthly_weChat_Total
     *
     * @return the value of t_electron_payment.monthly_weChat_Total
     *
     * @mbg.generated
     */
    public Double getMonthlyWechatTotal() {
        return monthlyWechatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.monthly_weChat_Total
     *
     * @param monthlyWechatTotal the value for t_electron_payment.monthly_weChat_Total
     *
     * @mbg.generated
     */
    public void setMonthlyWechatTotal(Double monthlyWechatTotal) {
        this.monthlyWechatTotal = monthlyWechatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_unionPay_Total
     *
     * @return the value of t_electron_payment.temp_unionPay_Total
     *
     * @mbg.generated
     */
    public Double getTempUnionpayTotal() {
        return tempUnionpayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_unionPay_Total
     *
     * @param tempUnionpayTotal the value for t_electron_payment.temp_unionPay_Total
     *
     * @mbg.generated
     */
    public void setTempUnionpayTotal(Double tempUnionpayTotal) {
        this.tempUnionpayTotal = tempUnionpayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_card_Total
     *
     * @return the value of t_electron_payment.temp_card_Total
     *
     * @mbg.generated
     */
    public Double getTempCardTotal() {
        return tempCardTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_card_Total
     *
     * @param tempCardTotal the value for t_electron_payment.temp_card_Total
     *
     * @mbg.generated
     */
    public void setTempCardTotal(Double tempCardTotal) {
        this.tempCardTotal = tempCardTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_rights_Total
     *
     * @return the value of t_electron_payment.temp_rights_Total
     *
     * @mbg.generated
     */
    public Double getTempRightsTotal() {
        return tempRightsTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_rights_Total
     *
     * @param tempRightsTotal the value for t_electron_payment.temp_rights_Total
     *
     * @mbg.generated
     */
    public void setTempRightsTotal(Double tempRightsTotal) {
        this.tempRightsTotal = tempRightsTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_weChat_Total
     *
     * @return the value of t_electron_payment.temp_weChat_Total
     *
     * @mbg.generated
     */
    public Double getTempWechatTotal() {
        return tempWechatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_weChat_Total
     *
     * @param tempWechatTotal the value for t_electron_payment.temp_weChat_Total
     *
     * @mbg.generated
     */
    public void setTempWechatTotal(Double tempWechatTotal) {
        this.tempWechatTotal = tempWechatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.temp_alipay_Total
     *
     * @return the value of t_electron_payment.temp_alipay_Total
     *
     * @mbg.generated
     */
    public Double getTempAlipayTotal() {
        return tempAlipayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.temp_alipay_Total
     *
     * @param tempAlipayTotal the value for t_electron_payment.temp_alipay_Total
     *
     * @mbg.generated
     */
    public void setTempAlipayTotal(Double tempAlipayTotal) {
        this.tempAlipayTotal = tempAlipayTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.pay_less_Total
     *
     * @return the value of t_electron_payment.pay_less_Total
     *
     * @mbg.generated
     */
    public Double getPayLessTotal() {
        return payLessTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.pay_less_Total
     *
     * @param payLessTotal the value for t_electron_payment.pay_less_Total
     *
     * @mbg.generated
     */
    public void setPayLessTotal(Double payLessTotal) {
        this.payLessTotal = payLessTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.pay_more_Total
     *
     * @return the value of t_electron_payment.pay_more_Total
     *
     * @mbg.generated
     */
    public Double getPayMoreTotal() {
        return payMoreTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.pay_more_Total
     *
     * @param payMoreTotal the value for t_electron_payment.pay_more_Total
     *
     * @mbg.generated
     */
    public void setPayMoreTotal(Double payMoreTotal) {
        this.payMoreTotal = payMoreTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.reconciliation_statement
     *
     * @return the value of t_electron_payment.reconciliation_statement
     *
     * @mbg.generated
     */
    public String getReconciliationStatement() {
        return reconciliationStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.reconciliation_statement
     *
     * @param reconciliationStatement the value for t_electron_payment.reconciliation_statement
     *
     * @mbg.generated
     */
    public void setReconciliationStatement(String reconciliationStatement) {
        this.reconciliationStatement = reconciliationStatement == null ? null : reconciliationStatement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_electron_payment.check_flag
     *
     * @return the value of t_electron_payment.check_flag
     *
     * @mbg.generated
     */
    public Integer getCheckFlag() {
        return checkFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_electron_payment.check_flag
     *
     * @param checkFlag the value for t_electron_payment.check_flag
     *
     * @mbg.generated
     */
    public void setCheckFlag(Integer checkFlag) {
        this.checkFlag = checkFlag;
    }
}