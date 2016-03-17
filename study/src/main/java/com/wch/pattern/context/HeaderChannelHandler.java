package com.wch.pattern.context;

/**
 * Created by chunhai.wang on 2016/2/3.
 */
public class HeaderChannelHandler implements ChannelHandler{
    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
        ctx.fireChannelActive();
    }
}
