package com.yycoder.netty.codec.jackson;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by yangyang.zhao on 2017/8/2.
 */
public class JacksonServerHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object obj) throws Exception {
        String jsonString;
        if (obj instanceof JacksonBean) {
            JacksonBean user = (JacksonBean) obj;
            ctx.writeAndFlush(user);
            jsonString = JacksonMapper.getInstance().writeValueAsString(user);
        } else {
            ctx.writeAndFlush(obj);
            jsonString = JacksonMapper.getInstance().writeValueAsString(obj);
        }
        System.out.println("Server get msg form Client -" + jsonString);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel incoming = ctx.channel();
        System.out.println("SimpleChatClient:" + incoming.remoteAddress() + "异常");
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
