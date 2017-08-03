package com.yycoder.rpc.core;

import java.lang.reflect.Proxy;

/**
 * Rpc客户端执行模块
 * Created by yangyang.zhao on 2017/8/1.
 */
public class MessageSendExecutor {
    private RpcServerLoader loader = RpcServerLoader.getInstance();

    public MessageSendExecutor(String serverAddress) {
        loader.load(serverAddress);
    }

    public void stop() {
        loader.unLoad();
    }

    public static <T> T execute(Class<T> rpcInterface) {
        return (T) Proxy.newProxyInstance(
                rpcInterface.getClassLoader(),
                new Class<?>[]{rpcInterface},
                new MessageSendProxy<T>(rpcInterface)
        );
    }
}