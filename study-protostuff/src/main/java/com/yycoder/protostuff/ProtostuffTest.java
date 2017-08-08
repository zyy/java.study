package com.yycoder.protostuff;

import java.util.*;

/**
 * Created by yangyang.zhao on 2017/8/8.
 */
public class ProtostuffTest {
    public static void main(String[] args) {
        OrderInfo oldOrder = createOrder();
        System.out.println(oldOrder);

        byte[] orderInfo = SerializationUtils.serialize(oldOrder);

        OrderInfo newOrder = SerializationUtils.deserialize(orderInfo, OrderInfo.class);

        System.out.println(newOrder);
        System.out.println(newOrder.getOrderNo() == null ? "y" : "n");
    }

    private static OrderInfo createOrder() {
        OrderInfo orderInfo = new OrderInfo();
        DelieryAddress delieryAddress = new DelieryAddress();
        List<OrderExt> orderExts = new LinkedList<OrderExt>();

        for (int i = 0; i < 2; i++) {
            OrderExt orderExt = new OrderExt();
            orderExt.setGoodsNo("343434");
            orderExt.setOrderNo("12345");
            orderExts.add(orderExt);
        }

        delieryAddress.setAddress("北京");
        delieryAddress.setConsigneeName("烤鸭");
        delieryAddress.setExpectTime(new Date());

        Map<String, Object> orderItem = new HashMap<String, Object>();
        orderItem.put("google", "google.com");
        orderItem.put("baidu", "baidu.com");

        orderInfo.setOrderItem(orderItem);
        orderInfo.setAddress(delieryAddress);
        orderInfo.setOrderExts(orderExts);

        return orderInfo;
    }
}
