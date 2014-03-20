package com.yycoder.dp.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:38
 * To change this template use File | Settings | File Templates.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
