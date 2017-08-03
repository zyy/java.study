package com.yycoder.rpc.msg;

import java.io.Serializable;
import java.util.Arrays;

/**
 * RPC请求消息
 * <p/>
 * Created by yangyang.zhao on 2017/7/31.
 */
public class MessageRequest implements Serializable {
    // 消息ID
    private String messageId;
    // 请求调用的类名
    private String className;
    // 请求调用的方法名
    private String methodName;
    // 请求参数类型数组
    private Class<?>[] parameterTypes;
    // 请求参数值数组
    private Object[] parameterValues;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public Object[] getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Object[] parameterValues) {
        this.parameterValues = parameterValues;
    }

    @Override
    public String toString() {
        return "MessageRequest{" +
                "messageId='" + messageId + '\'' +
                ", className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", parameterTypes=" + Arrays.toString(parameterTypes) +
                ", parameterValues=" + Arrays.toString(parameterValues) +
                '}';
    }
}
