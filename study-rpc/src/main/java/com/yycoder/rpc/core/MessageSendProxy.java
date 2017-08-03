package com.yycoder.rpc.core;

import com.yycoder.rpc.msg.MessageRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * Rpc客户端消息处理
 * Created by yangyang.zhao on 2017/8/1.
 */
public class MessageSendProxy<T> implements InvocationHandler {

    private Class<T> clazz;

    public MessageSendProxy(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MessageRequest request = new MessageRequest();
        request.setMessageId(UUID.randomUUID().toString());
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameterTypes(method.getParameterTypes());
        request.setParameterValues(args);

        MessageSendHandler handler = RpcServerLoader.getInstance().getMessageSendHandler();
        MessageCallBack callBack = handler.sendRequest(request);
        return callBack.start();
    }
}
