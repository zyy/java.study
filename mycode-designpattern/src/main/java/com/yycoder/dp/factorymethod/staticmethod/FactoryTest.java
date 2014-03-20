package com.yycoder.dp.factorymethod.staticmethod;

import com.yycoder.dp.factorymethod.normal.Sender;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:30
 * To change this template use File | Settings | File Templates.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
