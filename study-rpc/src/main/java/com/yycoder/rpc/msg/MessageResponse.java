package com.yycoder.rpc.msg;

import java.io.Serializable;

/**
 * RPC响应消息
 * <p/>
 * Created by yangyang.zhao on 2017/7/31.
 */
public class MessageResponse implements Serializable {
    // 响应消息ID
    private String messageId;
    // 错误信息
    private String error;
    // 返回结果
    private Object result;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "messageId='" + messageId + '\'' +
                ", error='" + error + '\'' +
                ", result=" + result +
                '}';
    }
}
