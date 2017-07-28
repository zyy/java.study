package com.yycoder.dp.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:42
 * To change this template use File | Settings | File Templates.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
