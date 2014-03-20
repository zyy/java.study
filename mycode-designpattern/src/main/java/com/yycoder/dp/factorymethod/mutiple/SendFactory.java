package com.yycoder.dp.factorymethod.mutiple;

import com.yycoder.dp.factorymethod.normal.MailSender;
import com.yycoder.dp.factorymethod.normal.Sender;
import com.yycoder.dp.factorymethod.normal.SmsSender;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
