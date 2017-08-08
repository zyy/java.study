package com.yycoder.protostuff;

import java.util.List;
import java.util.Map;

/**
 * Created by yangyang.zhao on 2017/8/8.
 */
public class OrderInfo {
    /**
     * 订单流水
     */
    private String orderNo;
    /**
     * 订单概要信息
     */
    private Map<String, Object> orderItem;
    /**
     * 订单扩展信息
     */
    private List<OrderExt> orderExts;

    /**
     * 收货信息
     */
    private DelieryAddress address;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Map<String, Object> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Map<String, Object> orderItem) {
        this.orderItem = orderItem;
    }

    public List<OrderExt> getOrderExts() {
        return orderExts;
    }

    public void setOrderExts(List<OrderExt> orderExts) {
        this.orderExts = orderExts;
    }

    public DelieryAddress getAddress() {
        return address;
    }

    public void setAddress(DelieryAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNo='" + orderNo + '\'' +
                ", orderItem=" + orderItem +
                ", orderExts=" + orderExts +
                ", address=" + address +
                '}';
    }
}
