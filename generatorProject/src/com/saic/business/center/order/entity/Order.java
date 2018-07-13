package com.saic.business.center.order.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long id;

    private String orderNo;

    private Date createTime;

    private Date updateTime;

    private String orderCityCode;

    private String passengerUid;

    private String passengerName;

    private String passengerMobile;

    private String driverUid;

    private String driverName;

    private String driverMobile;

    private String vehicleNo;

    private Date orderTime;

    private String estimatePathId;

    private BigDecimal estimatePrice;

    private String actualPathId;

    private BigDecimal actualBaseFee;

    private BigDecimal actualExtFee;

    private BigDecimal arAmount;

    private BigDecimal rcvdAmount;

    private Integer orderStatus;

    private Integer paymentStatus;

    private Integer orderTypeId;

    private String complaintsFlag;

    private String evaluationFlag;

    private Integer invoiceFlag;

    private Integer exceptionFlag;

    private Integer deleteFlag;

    private Integer gohomeFlag;

    private String newestEventCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderCityCode() {
        return orderCityCode;
    }

    public void setOrderCityCode(String orderCityCode) {
        this.orderCityCode = orderCityCode == null ? null : orderCityCode.trim();
    }

    public String getPassengerUid() {
        return passengerUid;
    }

    public void setPassengerUid(String passengerUid) {
        this.passengerUid = passengerUid == null ? null : passengerUid.trim();
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName == null ? null : passengerName.trim();
    }

    public String getPassengerMobile() {
        return passengerMobile;
    }

    public void setPassengerMobile(String passengerMobile) {
        this.passengerMobile = passengerMobile == null ? null : passengerMobile.trim();
    }

    public String getDriverUid() {
        return driverUid;
    }

    public void setDriverUid(String driverUid) {
        this.driverUid = driverUid == null ? null : driverUid.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getDriverMobile() {
        return driverMobile;
    }

    public void setDriverMobile(String driverMobile) {
        this.driverMobile = driverMobile == null ? null : driverMobile.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getEstimatePathId() {
        return estimatePathId;
    }

    public void setEstimatePathId(String estimatePathId) {
        this.estimatePathId = estimatePathId == null ? null : estimatePathId.trim();
    }

    public BigDecimal getEstimatePrice() {
        return estimatePrice;
    }

    public void setEstimatePrice(BigDecimal estimatePrice) {
        this.estimatePrice = estimatePrice;
    }

    public String getActualPathId() {
        return actualPathId;
    }

    public void setActualPathId(String actualPathId) {
        this.actualPathId = actualPathId == null ? null : actualPathId.trim();
    }

    public BigDecimal getActualBaseFee() {
        return actualBaseFee;
    }

    public void setActualBaseFee(BigDecimal actualBaseFee) {
        this.actualBaseFee = actualBaseFee;
    }

    public BigDecimal getActualExtFee() {
        return actualExtFee;
    }

    public void setActualExtFee(BigDecimal actualExtFee) {
        this.actualExtFee = actualExtFee;
    }

    public BigDecimal getArAmount() {
        return arAmount;
    }

    public void setArAmount(BigDecimal arAmount) {
        this.arAmount = arAmount;
    }

    public BigDecimal getRcvdAmount() {
        return rcvdAmount;
    }

    public void setRcvdAmount(BigDecimal rcvdAmount) {
        this.rcvdAmount = rcvdAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getComplaintsFlag() {
        return complaintsFlag;
    }

    public void setComplaintsFlag(String complaintsFlag) {
        this.complaintsFlag = complaintsFlag == null ? null : complaintsFlag.trim();
    }

    public String getEvaluationFlag() {
        return evaluationFlag;
    }

    public void setEvaluationFlag(String evaluationFlag) {
        this.evaluationFlag = evaluationFlag == null ? null : evaluationFlag.trim();
    }

    public Integer getInvoiceFlag() {
        return invoiceFlag;
    }

    public void setInvoiceFlag(Integer invoiceFlag) {
        this.invoiceFlag = invoiceFlag;
    }

    public Integer getExceptionFlag() {
        return exceptionFlag;
    }

    public void setExceptionFlag(Integer exceptionFlag) {
        this.exceptionFlag = exceptionFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getGohomeFlag() {
        return gohomeFlag;
    }

    public void setGohomeFlag(Integer gohomeFlag) {
        this.gohomeFlag = gohomeFlag;
    }

    public String getNewestEventCode() {
        return newestEventCode;
    }

    public void setNewestEventCode(String newestEventCode) {
        this.newestEventCode = newestEventCode == null ? null : newestEventCode.trim();
    }
}