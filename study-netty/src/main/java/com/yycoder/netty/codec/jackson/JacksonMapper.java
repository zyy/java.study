package com.yycoder.netty.codec.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by yangyang.zhao on 2017/8/2.
 */
public class JacksonMapper {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static ObjectMapper getInstance() {
        return MAPPER;
    }
}
