package com.yycoder.rpc.msg;

import java.util.Map;

/**
 * rpc服务映射容器
 * <p/>
 * Created by yangyang.zhao on 2017/7/31.
 */
public class MessageKeyValue {
    private Map<String, Object> messageKeyVal;

    public Map<String, Object> getMessageKeyValue() {
        return messageKeyVal;
    }

    public void setMessageKeyValue(Map<String, Object> messageKeyVal) {
        this.messageKeyVal = messageKeyVal;
    }
}
