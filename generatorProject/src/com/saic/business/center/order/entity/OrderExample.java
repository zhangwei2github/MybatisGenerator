package com.saic.business.center.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeIsNull() {
            addCriterion("order_city_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeIsNotNull() {
            addCriterion("order_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeEqualTo(String value) {
            addCriterion("order_city_code =", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeNotEqualTo(String value) {
            addCriterion("order_city_code <>", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeGreaterThan(String value) {
            addCriterion("order_city_code >", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_city_code >=", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeLessThan(String value) {
            addCriterion("order_city_code <", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeLessThanOrEqualTo(String value) {
            addCriterion("order_city_code <=", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeLike(String value) {
            addCriterion("order_city_code like", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeNotLike(String value) {
            addCriterion("order_city_code not like", value, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeIn(List<String> values) {
            addCriterion("order_city_code in", values, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeNotIn(List<String> values) {
            addCriterion("order_city_code not in", values, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeBetween(String value1, String value2) {
            addCriterion("order_city_code between", value1, value2, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andOrderCityCodeNotBetween(String value1, String value2) {
            addCriterion("order_city_code not between", value1, value2, "orderCityCode");
            return (Criteria) this;
        }

        public Criteria andPassengerUidIsNull() {
            addCriterion("passenger_uid is null");
            return (Criteria) this;
        }

        public Criteria andPassengerUidIsNotNull() {
            addCriterion("passenger_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerUidEqualTo(String value) {
            addCriterion("passenger_uid =", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidNotEqualTo(String value) {
            addCriterion("passenger_uid <>", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidGreaterThan(String value) {
            addCriterion("passenger_uid >", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_uid >=", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidLessThan(String value) {
            addCriterion("passenger_uid <", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidLessThanOrEqualTo(String value) {
            addCriterion("passenger_uid <=", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidLike(String value) {
            addCriterion("passenger_uid like", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidNotLike(String value) {
            addCriterion("passenger_uid not like", value, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidIn(List<String> values) {
            addCriterion("passenger_uid in", values, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidNotIn(List<String> values) {
            addCriterion("passenger_uid not in", values, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidBetween(String value1, String value2) {
            addCriterion("passenger_uid between", value1, value2, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerUidNotBetween(String value1, String value2) {
            addCriterion("passenger_uid not between", value1, value2, "passengerUid");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNull() {
            addCriterion("passenger_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNotNull() {
            addCriterion("passenger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameEqualTo(String value) {
            addCriterion("passenger_name =", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotEqualTo(String value) {
            addCriterion("passenger_name <>", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThan(String value) {
            addCriterion("passenger_name >", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_name >=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThan(String value) {
            addCriterion("passenger_name <", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_name <=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLike(String value) {
            addCriterion("passenger_name like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotLike(String value) {
            addCriterion("passenger_name not like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIn(List<String> values) {
            addCriterion("passenger_name in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotIn(List<String> values) {
            addCriterion("passenger_name not in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameBetween(String value1, String value2) {
            addCriterion("passenger_name between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotBetween(String value1, String value2) {
            addCriterion("passenger_name not between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileIsNull() {
            addCriterion("passenger_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileIsNotNull() {
            addCriterion("passenger_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileEqualTo(String value) {
            addCriterion("passenger_mobile =", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileNotEqualTo(String value) {
            addCriterion("passenger_mobile <>", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileGreaterThan(String value) {
            addCriterion("passenger_mobile >", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_mobile >=", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileLessThan(String value) {
            addCriterion("passenger_mobile <", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileLessThanOrEqualTo(String value) {
            addCriterion("passenger_mobile <=", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileLike(String value) {
            addCriterion("passenger_mobile like", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileNotLike(String value) {
            addCriterion("passenger_mobile not like", value, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileIn(List<String> values) {
            addCriterion("passenger_mobile in", values, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileNotIn(List<String> values) {
            addCriterion("passenger_mobile not in", values, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileBetween(String value1, String value2) {
            addCriterion("passenger_mobile between", value1, value2, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andPassengerMobileNotBetween(String value1, String value2) {
            addCriterion("passenger_mobile not between", value1, value2, "passengerMobile");
            return (Criteria) this;
        }

        public Criteria andDriverUidIsNull() {
            addCriterion("driver_uid is null");
            return (Criteria) this;
        }

        public Criteria andDriverUidIsNotNull() {
            addCriterion("driver_uid is not null");
            return (Criteria) this;
        }

        public Criteria andDriverUidEqualTo(String value) {
            addCriterion("driver_uid =", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidNotEqualTo(String value) {
            addCriterion("driver_uid <>", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidGreaterThan(String value) {
            addCriterion("driver_uid >", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidGreaterThanOrEqualTo(String value) {
            addCriterion("driver_uid >=", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidLessThan(String value) {
            addCriterion("driver_uid <", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidLessThanOrEqualTo(String value) {
            addCriterion("driver_uid <=", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidLike(String value) {
            addCriterion("driver_uid like", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidNotLike(String value) {
            addCriterion("driver_uid not like", value, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidIn(List<String> values) {
            addCriterion("driver_uid in", values, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidNotIn(List<String> values) {
            addCriterion("driver_uid not in", values, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidBetween(String value1, String value2) {
            addCriterion("driver_uid between", value1, value2, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverUidNotBetween(String value1, String value2) {
            addCriterion("driver_uid not between", value1, value2, "driverUid");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNull() {
            addCriterion("driver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNotNull() {
            addCriterion("driver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileEqualTo(String value) {
            addCriterion("driver_mobile =", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotEqualTo(String value) {
            addCriterion("driver_mobile <>", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThan(String value) {
            addCriterion("driver_mobile >", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("driver_mobile >=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThan(String value) {
            addCriterion("driver_mobile <", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThanOrEqualTo(String value) {
            addCriterion("driver_mobile <=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLike(String value) {
            addCriterion("driver_mobile like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotLike(String value) {
            addCriterion("driver_mobile not like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIn(List<String> values) {
            addCriterion("driver_mobile in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotIn(List<String> values) {
            addCriterion("driver_mobile not in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileBetween(String value1, String value2) {
            addCriterion("driver_mobile between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotBetween(String value1, String value2) {
            addCriterion("driver_mobile not between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdIsNull() {
            addCriterion("estimate_path_id is null");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdIsNotNull() {
            addCriterion("estimate_path_id is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdEqualTo(String value) {
            addCriterion("estimate_path_id =", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdNotEqualTo(String value) {
            addCriterion("estimate_path_id <>", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdGreaterThan(String value) {
            addCriterion("estimate_path_id >", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdGreaterThanOrEqualTo(String value) {
            addCriterion("estimate_path_id >=", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdLessThan(String value) {
            addCriterion("estimate_path_id <", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdLessThanOrEqualTo(String value) {
            addCriterion("estimate_path_id <=", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdLike(String value) {
            addCriterion("estimate_path_id like", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdNotLike(String value) {
            addCriterion("estimate_path_id not like", value, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdIn(List<String> values) {
            addCriterion("estimate_path_id in", values, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdNotIn(List<String> values) {
            addCriterion("estimate_path_id not in", values, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdBetween(String value1, String value2) {
            addCriterion("estimate_path_id between", value1, value2, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePathIdNotBetween(String value1, String value2) {
            addCriterion("estimate_path_id not between", value1, value2, "estimatePathId");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceIsNull() {
            addCriterion("estimate_price is null");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceIsNotNull() {
            addCriterion("estimate_price is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceEqualTo(BigDecimal value) {
            addCriterion("estimate_price =", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceNotEqualTo(BigDecimal value) {
            addCriterion("estimate_price <>", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceGreaterThan(BigDecimal value) {
            addCriterion("estimate_price >", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_price >=", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceLessThan(BigDecimal value) {
            addCriterion("estimate_price <", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_price <=", value, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceIn(List<BigDecimal> values) {
            addCriterion("estimate_price in", values, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceNotIn(List<BigDecimal> values) {
            addCriterion("estimate_price not in", values, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_price between", value1, value2, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andEstimatePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_price not between", value1, value2, "estimatePrice");
            return (Criteria) this;
        }

        public Criteria andActualPathIdIsNull() {
            addCriterion("actual_path_id is null");
            return (Criteria) this;
        }

        public Criteria andActualPathIdIsNotNull() {
            addCriterion("actual_path_id is not null");
            return (Criteria) this;
        }

        public Criteria andActualPathIdEqualTo(String value) {
            addCriterion("actual_path_id =", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdNotEqualTo(String value) {
            addCriterion("actual_path_id <>", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdGreaterThan(String value) {
            addCriterion("actual_path_id >", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdGreaterThanOrEqualTo(String value) {
            addCriterion("actual_path_id >=", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdLessThan(String value) {
            addCriterion("actual_path_id <", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdLessThanOrEqualTo(String value) {
            addCriterion("actual_path_id <=", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdLike(String value) {
            addCriterion("actual_path_id like", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdNotLike(String value) {
            addCriterion("actual_path_id not like", value, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdIn(List<String> values) {
            addCriterion("actual_path_id in", values, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdNotIn(List<String> values) {
            addCriterion("actual_path_id not in", values, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdBetween(String value1, String value2) {
            addCriterion("actual_path_id between", value1, value2, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualPathIdNotBetween(String value1, String value2) {
            addCriterion("actual_path_id not between", value1, value2, "actualPathId");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIsNull() {
            addCriterion("actual_base_fee is null");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIsNotNull() {
            addCriterion("actual_base_fee is not null");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeEqualTo(BigDecimal value) {
            addCriterion("actual_base_fee =", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotEqualTo(BigDecimal value) {
            addCriterion("actual_base_fee <>", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeGreaterThan(BigDecimal value) {
            addCriterion("actual_base_fee >", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_base_fee >=", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeLessThan(BigDecimal value) {
            addCriterion("actual_base_fee <", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_base_fee <=", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIn(List<BigDecimal> values) {
            addCriterion("actual_base_fee in", values, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotIn(List<BigDecimal> values) {
            addCriterion("actual_base_fee not in", values, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_base_fee between", value1, value2, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_base_fee not between", value1, value2, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeIsNull() {
            addCriterion("actual_ext_fee is null");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeIsNotNull() {
            addCriterion("actual_ext_fee is not null");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeEqualTo(BigDecimal value) {
            addCriterion("actual_ext_fee =", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeNotEqualTo(BigDecimal value) {
            addCriterion("actual_ext_fee <>", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeGreaterThan(BigDecimal value) {
            addCriterion("actual_ext_fee >", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_ext_fee >=", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeLessThan(BigDecimal value) {
            addCriterion("actual_ext_fee <", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_ext_fee <=", value, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeIn(List<BigDecimal> values) {
            addCriterion("actual_ext_fee in", values, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeNotIn(List<BigDecimal> values) {
            addCriterion("actual_ext_fee not in", values, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_ext_fee between", value1, value2, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andActualExtFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_ext_fee not between", value1, value2, "actualExtFee");
            return (Criteria) this;
        }

        public Criteria andArAmountIsNull() {
            addCriterion("ar_amount is null");
            return (Criteria) this;
        }

        public Criteria andArAmountIsNotNull() {
            addCriterion("ar_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArAmountEqualTo(BigDecimal value) {
            addCriterion("ar_amount =", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotEqualTo(BigDecimal value) {
            addCriterion("ar_amount <>", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountGreaterThan(BigDecimal value) {
            addCriterion("ar_amount >", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_amount >=", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountLessThan(BigDecimal value) {
            addCriterion("ar_amount <", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_amount <=", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountIn(List<BigDecimal> values) {
            addCriterion("ar_amount in", values, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotIn(List<BigDecimal> values) {
            addCriterion("ar_amount not in", values, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_amount between", value1, value2, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_amount not between", value1, value2, "arAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountIsNull() {
            addCriterion("rcvd_amount is null");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountIsNotNull() {
            addCriterion("rcvd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountEqualTo(BigDecimal value) {
            addCriterion("rcvd_amount =", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountNotEqualTo(BigDecimal value) {
            addCriterion("rcvd_amount <>", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountGreaterThan(BigDecimal value) {
            addCriterion("rcvd_amount >", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rcvd_amount >=", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountLessThan(BigDecimal value) {
            addCriterion("rcvd_amount <", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rcvd_amount <=", value, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountIn(List<BigDecimal> values) {
            addCriterion("rcvd_amount in", values, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountNotIn(List<BigDecimal> values) {
            addCriterion("rcvd_amount not in", values, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rcvd_amount between", value1, value2, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andRcvdAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rcvd_amount not between", value1, value2, "rcvdAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdIsNull() {
            addCriterion("order_type_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdIsNotNull() {
            addCriterion("order_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdEqualTo(Integer value) {
            addCriterion("order_type_id =", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdNotEqualTo(Integer value) {
            addCriterion("order_type_id <>", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdGreaterThan(Integer value) {
            addCriterion("order_type_id >", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type_id >=", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdLessThan(Integer value) {
            addCriterion("order_type_id <", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_type_id <=", value, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdIn(List<Integer> values) {
            addCriterion("order_type_id in", values, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdNotIn(List<Integer> values) {
            addCriterion("order_type_id not in", values, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("order_type_id between", value1, value2, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type_id not between", value1, value2, "orderTypeId");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagIsNull() {
            addCriterion("complaints_flag is null");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagIsNotNull() {
            addCriterion("complaints_flag is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagEqualTo(String value) {
            addCriterion("complaints_flag =", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagNotEqualTo(String value) {
            addCriterion("complaints_flag <>", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagGreaterThan(String value) {
            addCriterion("complaints_flag >", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("complaints_flag >=", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagLessThan(String value) {
            addCriterion("complaints_flag <", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagLessThanOrEqualTo(String value) {
            addCriterion("complaints_flag <=", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagLike(String value) {
            addCriterion("complaints_flag like", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagNotLike(String value) {
            addCriterion("complaints_flag not like", value, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagIn(List<String> values) {
            addCriterion("complaints_flag in", values, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagNotIn(List<String> values) {
            addCriterion("complaints_flag not in", values, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagBetween(String value1, String value2) {
            addCriterion("complaints_flag between", value1, value2, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andComplaintsFlagNotBetween(String value1, String value2) {
            addCriterion("complaints_flag not between", value1, value2, "complaintsFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagIsNull() {
            addCriterion("evaluation_flag is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagIsNotNull() {
            addCriterion("evaluation_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagEqualTo(String value) {
            addCriterion("evaluation_flag =", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagNotEqualTo(String value) {
            addCriterion("evaluation_flag <>", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagGreaterThan(String value) {
            addCriterion("evaluation_flag >", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_flag >=", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagLessThan(String value) {
            addCriterion("evaluation_flag <", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagLessThanOrEqualTo(String value) {
            addCriterion("evaluation_flag <=", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagLike(String value) {
            addCriterion("evaluation_flag like", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagNotLike(String value) {
            addCriterion("evaluation_flag not like", value, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagIn(List<String> values) {
            addCriterion("evaluation_flag in", values, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagNotIn(List<String> values) {
            addCriterion("evaluation_flag not in", values, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagBetween(String value1, String value2) {
            addCriterion("evaluation_flag between", value1, value2, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluationFlagNotBetween(String value1, String value2) {
            addCriterion("evaluation_flag not between", value1, value2, "evaluationFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNull() {
            addCriterion("invoice_flag is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNotNull() {
            addCriterion("invoice_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagEqualTo(Integer value) {
            addCriterion("invoice_flag =", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotEqualTo(Integer value) {
            addCriterion("invoice_flag <>", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThan(Integer value) {
            addCriterion("invoice_flag >", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_flag >=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThan(Integer value) {
            addCriterion("invoice_flag <", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_flag <=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIn(List<Integer> values) {
            addCriterion("invoice_flag in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotIn(List<Integer> values) {
            addCriterion("invoice_flag not in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagBetween(Integer value1, Integer value2) {
            addCriterion("invoice_flag between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_flag not between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagIsNull() {
            addCriterion("exception_flag is null");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagIsNotNull() {
            addCriterion("exception_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagEqualTo(Integer value) {
            addCriterion("exception_flag =", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagNotEqualTo(Integer value) {
            addCriterion("exception_flag <>", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagGreaterThan(Integer value) {
            addCriterion("exception_flag >", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_flag >=", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagLessThan(Integer value) {
            addCriterion("exception_flag <", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagLessThanOrEqualTo(Integer value) {
            addCriterion("exception_flag <=", value, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagIn(List<Integer> values) {
            addCriterion("exception_flag in", values, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagNotIn(List<Integer> values) {
            addCriterion("exception_flag not in", values, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagBetween(Integer value1, Integer value2) {
            addCriterion("exception_flag between", value1, value2, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andExceptionFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_flag not between", value1, value2, "exceptionFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagIsNull() {
            addCriterion("gohome_flag is null");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagIsNotNull() {
            addCriterion("gohome_flag is not null");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagEqualTo(Integer value) {
            addCriterion("gohome_flag =", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagNotEqualTo(Integer value) {
            addCriterion("gohome_flag <>", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagGreaterThan(Integer value) {
            addCriterion("gohome_flag >", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("gohome_flag >=", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagLessThan(Integer value) {
            addCriterion("gohome_flag <", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("gohome_flag <=", value, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagIn(List<Integer> values) {
            addCriterion("gohome_flag in", values, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagNotIn(List<Integer> values) {
            addCriterion("gohome_flag not in", values, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagBetween(Integer value1, Integer value2) {
            addCriterion("gohome_flag between", value1, value2, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andGohomeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("gohome_flag not between", value1, value2, "gohomeFlag");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeIsNull() {
            addCriterion("newest_event_code is null");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeIsNotNull() {
            addCriterion("newest_event_code is not null");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeEqualTo(String value) {
            addCriterion("newest_event_code =", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeNotEqualTo(String value) {
            addCriterion("newest_event_code <>", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeGreaterThan(String value) {
            addCriterion("newest_event_code >", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeGreaterThanOrEqualTo(String value) {
            addCriterion("newest_event_code >=", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeLessThan(String value) {
            addCriterion("newest_event_code <", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeLessThanOrEqualTo(String value) {
            addCriterion("newest_event_code <=", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeLike(String value) {
            addCriterion("newest_event_code like", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeNotLike(String value) {
            addCriterion("newest_event_code not like", value, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeIn(List<String> values) {
            addCriterion("newest_event_code in", values, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeNotIn(List<String> values) {
            addCriterion("newest_event_code not in", values, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeBetween(String value1, String value2) {
            addCriterion("newest_event_code between", value1, value2, "newestEventCode");
            return (Criteria) this;
        }

        public Criteria andNewestEventCodeNotBetween(String value1, String value2) {
            addCriterion("newest_event_code not between", value1, value2, "newestEventCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}