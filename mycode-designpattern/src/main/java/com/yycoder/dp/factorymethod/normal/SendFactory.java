package com.yycoder.dp.factorymethod.normal;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 上午11:24
 * To change this template use File | Settings | File Templates.
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
