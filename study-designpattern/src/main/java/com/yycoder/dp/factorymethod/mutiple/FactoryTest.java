package com.yycoder.dp.factorymethod.mutiple;

import com.yycoder.dp.factorymethod.normal.Sender;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:25
 * To change this template use File | Settings | File Templates.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
