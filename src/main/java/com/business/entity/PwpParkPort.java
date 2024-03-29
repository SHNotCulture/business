package com.business.entity;

public class PwpParkPort {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pwp_park_port.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pwp_park_port.local_port_id
     *
     * @mbg.generated
     */
    private Integer localPortId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pwp_park_port.park_id
     *
     * @mbg.generated
     */
    private Integer parkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pwp_park_port.port_name
     *
     * @mbg.generated
     */
    private String portName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pwp_park_port.port_status
     *
     * @mbg.generated
     */
    private Short portStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pwp_park_port.id
     *
     * @return the value of pwp_park_port.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pwp_park_port.id
     *
     * @param id the value for pwp_park_port.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pwp_park_port.local_port_id
     *
     * @return the value of pwp_park_port.local_port_id
     *
     * @mbg.generated
     */
    public Integer getLocalPortId() {
        return localPortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pwp_park_port.local_port_id
     *
     * @param localPortId the value for pwp_park_port.local_port_id
     *
     * @mbg.generated
     */
    public void setLocalPortId(Integer localPortId) {
        this.localPortId = localPortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pwp_park_port.park_id
     *
     * @return the value of pwp_park_port.park_id
     *
     * @mbg.generated
     */
    public Integer getParkId() {
        return parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pwp_park_port.park_id
     *
     * @param parkId the value for pwp_park_port.park_id
     *
     * @mbg.generated
     */
    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pwp_park_port.port_name
     *
     * @return the value of pwp_park_port.port_name
     *
     * @mbg.generated
     */
    public String getPortName() {
        return portName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pwp_park_port.port_name
     *
     * @param portName the value for pwp_park_port.port_name
     *
     * @mbg.generated
     */
    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pwp_park_port.port_status
     *
     * @return the value of pwp_park_port.port_status
     *
     * @mbg.generated
     */
    public Short getPortStatus() {
        return portStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pwp_park_port.port_status
     *
     * @param portStatus the value for pwp_park_port.port_status
     *
     * @mbg.generated
     */
    public void setPortStatus(Short portStatus) {
        this.portStatus = portStatus;
    }
}