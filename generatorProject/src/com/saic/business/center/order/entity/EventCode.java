package com.saic.business.center.order.entity;

public class EventCode {
    private String eventCode;

    private String eventName;

    private String subName;

    private Integer eventOrder;

    private Integer refOrderStatus;

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode == null ? null : eventCode.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public Integer getEventOrder() {
        return eventOrder;
    }

    public void setEventOrder(Integer eventOrder) {
        this.eventOrder = eventOrder;
    }

    public Integer getRefOrderStatus() {
        return refOrderStatus;
    }

    public void setRefOrderStatus(Integer refOrderStatus) {
        this.refOrderStatus = refOrderStatus;
    }
}