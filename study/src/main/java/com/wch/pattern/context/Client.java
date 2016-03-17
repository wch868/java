package com.wch.pattern.context;

/**
 * Created by chunhai.wang on 2016/2/3.
 */
public class Client {
    public static void main(String[] args) {
        ChannelHandlerContext ctxLog = new ChannelHandlerContext(new LogChannelHandler());
        ChannelHandlerContext ctxNotice = new ChannelHandlerContext(new NoticeChannelHandler());
        ctxLog.setNext(ctxNotice);
        ctxLog.fireChannelActive();
    }
}
