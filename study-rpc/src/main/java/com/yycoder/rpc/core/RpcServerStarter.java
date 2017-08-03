package com.yycoder.rpc.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangyang.zhao on 2017/8/1.
 */
public class RpcServerStarter {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:rpc-invoke-config.xml");
    }
}
