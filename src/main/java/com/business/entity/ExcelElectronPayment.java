package com.business.entity;

import com.business.util.CommonUtil;
import com.business.util.ExcelTitle;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 16:112018-12-8
 * @Modified By:
 */
public class ExcelElectronPayment {

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
    private String checkFlag;

    @ExcelTitle(value = "账单日期",order=1)
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    @ExcelTitle(value = "临停电子实收",order=2)
    public Double getTempOnlineTotal() {
        return tempOnlineTotal;
    }

    public void setTempOnlineTotal(Double tempOnlineTotal) {
        this.tempOnlineTotal = tempOnlineTotal;
    }
    @ExcelTitle(value = "月租电子实收",order=3)
    public Double getFixOnlineActualTotal() {
        return fixOnlineActualTotal;
    }

    public void setFixOnlineActualTotal(Double fixOnlineActualTotal) {
        this.fixOnlineActualTotal = fixOnlineActualTotal;
    }
    @ExcelTitle(value = "电子缴费总额",order=3)
    public Double getTempQpasspayTotal() {
        return tempQpasspayTotal;
    }

    public void setTempQpasspayTotal(Double tempQpasspayTotal) {
        this.tempQpasspayTotal = tempQpasspayTotal;
    }
    @ExcelTitle(value = "临停线上预缴",order=4)
    public Double getTempPrepayTotal() {
        return tempPrepayTotal;
    }

    public void setTempPrepayTotal(Double tempPrepayTotal) {
        this.tempPrepayTotal = tempPrepayTotal;
    }
    @ExcelTitle(value = "微信预缴",order=5)
    public Double getWechatPrepayTotal() {
        return wechatPrepayTotal;
    }

    public void setWechatPrepayTotal(Double wechatPrepayTotal) {
        this.wechatPrepayTotal = wechatPrepayTotal;
    }
    @ExcelTitle(value = "支付宝预缴",order=6)
    public Double getAlipayPrepayTotal() {
        return alipayPrepayTotal;
    }

    public void setAlipayPrepayTotal(Double alipayPrepayTotal) {
        this.alipayPrepayTotal = alipayPrepayTotal;
    }
    @ExcelTitle(value = "第三方预缴",order=7)
    public Double getThirdPrepayTotal() {
        return thirdPrepayTotal;
    }

    public void setThirdPrepayTotal(Double thirdPrepayTotal) {
        this.thirdPrepayTotal = thirdPrepayTotal;
    }
    @ExcelTitle(value = "月租微信支付",order=8)
    public Double getMonthlyWechatTotal() {
        return monthlyWechatTotal;
    }

    public void setMonthlyWechatTotal(Double monthlyWechatTotal) {
        this.monthlyWechatTotal = monthlyWechatTotal;
    }
    @ExcelTitle(value = "银联无感支付",order=9)
    public Double getTempUnionpayTotal() {
        return tempUnionpayTotal;
    }

    public void setTempUnionpayTotal(Double tempUnionpayTotal) {
        this.tempUnionpayTotal = tempUnionpayTotal;
    }
    @ExcelTitle(value = "银联卡支付",order=10)
    public Double getTempCardTotal() {
        return tempCardTotal;
    }

    public void setTempCardTotal(Double tempCardTotal) {
        this.tempCardTotal = tempCardTotal;
    }
    @ExcelTitle(value = "银联卡权益",order=11)
    public Double getTempRightsTotal() {
        return tempRightsTotal;
    }

    public void setTempRightsTotal(Double tempRightsTotal) {
        this.tempRightsTotal = tempRightsTotal;
    }
    @ExcelTitle(value = "微信付款码支付",order=12)
    public Double getTempWechatTotal() {
        return tempWechatTotal;
    }

    public void setTempWechatTotal(Double tempWechatTotal) {
        this.tempWechatTotal = tempWechatTotal;
    }
    @ExcelTitle(value = "支付宝付款码支付",order=13)
    public Double getTempAlipayTotal() {
        return tempAlipayTotal;
    }

    public void setTempAlipayTotal(Double tempAlipayTotal) {
        this.tempAlipayTotal = tempAlipayTotal;
    }
    @ExcelTitle(value = "少付补款",order=14)
    public Double getPayLessTotal() {
        return payLessTotal;
    }

    public void setPayLessTotal(Double payLessTotal) {
        this.payLessTotal = payLessTotal;
    }
    @ExcelTitle(value = "多付退款",order=15)
    public Double getPayMoreTotal() {
        return payMoreTotal;
    }

    public void setPayMoreTotal(Double payMoreTotal) {
        this.payMoreTotal = payMoreTotal;
    }
    @ExcelTitle(value = "对账说明",order=16)
    public String getReconciliationStatement() {
        return reconciliationStatement;
    }

    public void setReconciliationStatement(String reconciliationStatement) {
        this.reconciliationStatement = reconciliationStatement;
    }
    @ExcelTitle(value = "对账标识",order=16)
    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(Integer checkFlag) {
        this.checkFlag =  CommonUtil.FlagLists.get(checkFlag).getName();
    }
}
