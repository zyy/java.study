package com.yycoder.protostuff;

/**
 * Created by yangyang.zhao on 2017/8/8.
 */
public class OrderExt {
    /**
     * 订单流水
     */
    private String orderNo;
    /**
     * 商品编码
     */
    private String goodsNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "orderNo='" + orderNo + '\'' +
                ", goodsNo='" + goodsNo + '\'' +
                '}';
    }
}
