package com.yycoder.dp.factorymethod.normal;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
