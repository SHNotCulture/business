package com.business.entity;

public class TBusineTicket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.busine_id
     *
     * @mbg.generated
     */
    private Integer busineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.busine_name
     *
     * @mbg.generated
     */
    private String busineName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.ticket_id
     *
     * @mbg.generated
     */
    private Integer ticketId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.ticket_name
     *
     * @mbg.generated
     */
    private String ticketName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.ticket_num
     *
     * @mbg.generated
     */
    private Integer ticketNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.limit_day
     *
     * @mbg.generated
     */
    private Integer limitDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.limit_month
     *
     * @mbg.generated
     */
    private Integer limitMonth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.limit_year
     *
     * @mbg.generated
     */
    private Integer limitYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.expiry_date
     *
     * @mbg.generated
     */
    private String expiryDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.ticket_initial_num
     *
     * @mbg.generated
     */
    private Integer ticketInitialNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.update_time
     *
     * @mbg.generated
     */
    private String updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_ticket.is_pay
     *
     * @mbg.generated
     */
    private Integer isPay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.id
     *
     * @return the value of t_busine_ticket.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.id
     *
     * @param id the value for t_busine_ticket.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.busine_id
     *
     * @return the value of t_busine_ticket.busine_id
     *
     * @mbg.generated
     */
    public Integer getBusineId() {
        return busineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.busine_id
     *
     * @param busineId the value for t_busine_ticket.busine_id
     *
     * @mbg.generated
     */
    public void setBusineId(Integer busineId) {
        this.busineId = busineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.busine_name
     *
     * @return the value of t_busine_ticket.busine_name
     *
     * @mbg.generated
     */
    public String getBusineName() {
        return busineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.busine_name
     *
     * @param busineName the value for t_busine_ticket.busine_name
     *
     * @mbg.generated
     */
    public void setBusineName(String busineName) {
        this.busineName = busineName == null ? null : busineName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.ticket_id
     *
     * @return the value of t_busine_ticket.ticket_id
     *
     * @mbg.generated
     */
    public Integer getTicketId() {
        return ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.ticket_id
     *
     * @param ticketId the value for t_busine_ticket.ticket_id
     *
     * @mbg.generated
     */
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.ticket_name
     *
     * @return the value of t_busine_ticket.ticket_name
     *
     * @mbg.generated
     */
    public String getTicketName() {
        return ticketName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.ticket_name
     *
     * @param ticketName the value for t_busine_ticket.ticket_name
     *
     * @mbg.generated
     */
    public void setTicketName(String ticketName) {
        this.ticketName = ticketName == null ? null : ticketName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.ticket_num
     *
     * @return the value of t_busine_ticket.ticket_num
     *
     * @mbg.generated
     */
    public Integer getTicketNum() {
        return ticketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.ticket_num
     *
     * @param ticketNum the value for t_busine_ticket.ticket_num
     *
     * @mbg.generated
     */
    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.limit_day
     *
     * @return the value of t_busine_ticket.limit_day
     *
     * @mbg.generated
     */
    public Integer getLimitDay() {
        return limitDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.limit_day
     *
     * @param limitDay the value for t_busine_ticket.limit_day
     *
     * @mbg.generated
     */
    public void setLimitDay(Integer limitDay) {
        this.limitDay = limitDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.limit_month
     *
     * @return the value of t_busine_ticket.limit_month
     *
     * @mbg.generated
     */
    public Integer getLimitMonth() {
        return limitMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.limit_month
     *
     * @param limitMonth the value for t_busine_ticket.limit_month
     *
     * @mbg.generated
     */
    public void setLimitMonth(Integer limitMonth) {
        this.limitMonth = limitMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.limit_year
     *
     * @return the value of t_busine_ticket.limit_year
     *
     * @mbg.generated
     */
    public Integer getLimitYear() {
        return limitYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.limit_year
     *
     * @param limitYear the value for t_busine_ticket.limit_year
     *
     * @mbg.generated
     */
    public void setLimitYear(Integer limitYear) {
        this.limitYear = limitYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.expiry_date
     *
     * @return the value of t_busine_ticket.expiry_date
     *
     * @mbg.generated
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.expiry_date
     *
     * @param expiryDate the value for t_busine_ticket.expiry_date
     *
     * @mbg.generated
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.ticket_initial_num
     *
     * @return the value of t_busine_ticket.ticket_initial_num
     *
     * @mbg.generated
     */
    public Integer getTicketInitialNum() {
        return ticketInitialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.ticket_initial_num
     *
     * @param ticketInitialNum the value for t_busine_ticket.ticket_initial_num
     *
     * @mbg.generated
     */
    public void setTicketInitialNum(Integer ticketInitialNum) {
        this.ticketInitialNum = ticketInitialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.company_id
     *
     * @return the value of t_busine_ticket.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.company_id
     *
     * @param companyId the value for t_busine_ticket.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.update_time
     *
     * @return the value of t_busine_ticket.update_time
     *
     * @mbg.generated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.update_time
     *
     * @param updateTime the value for t_busine_ticket.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_busine_ticket.is_pay
     *
     * @return the value of t_busine_ticket.is_pay
     *
     * @mbg.generated
     */
    public Integer getIsPay() {
        return isPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_busine_ticket.is_pay
     *
     * @param isPay the value for t_busine_ticket.is_pay
     *
     * @mbg.generated
     */
    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }
}