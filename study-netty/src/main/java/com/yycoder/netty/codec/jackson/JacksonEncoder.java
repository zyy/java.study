package com.yycoder.netty.codec.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by yangyang.zhao on 2017/8/2.
 */
public class JacksonEncoder extends MessageToByteEncoder<Object> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out)
            throws Exception {
        ObjectMapper mapper = JacksonMapper.getInstance();
        ByteBufOutputStream byteBufOutputStream = new ByteBufOutputStream(out);
        mapper.writeValue(byteBufOutputStream, msg);
    }

}
