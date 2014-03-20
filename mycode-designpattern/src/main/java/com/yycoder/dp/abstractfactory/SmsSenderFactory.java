package com.yycoder.dp.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 下午1:41
 * To change this template use File | Settings | File Templates.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
