package com.yycoder.protostuff;

import java.util.Date;

/**
 * Created by yangyang.zhao on 2017/8/8.
 */
public class DelieryAddress {
    /**
     * 收货地址
     */
    private String address;
    /**
     * 收货人
     */
    private String consigneeName;
    /**
     * 送达时间
     */
    private Date expectTime;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public Date getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(Date expectTime) {
        this.expectTime = expectTime;
    }

    @Override
    public String toString() {
        return "DelieryAddress{" +
                "address='" + address + '\'' +
                ", consigneeName='" + consigneeName + '\'' +
                ", expectTime=" + expectTime +
                '}';
    }
}
