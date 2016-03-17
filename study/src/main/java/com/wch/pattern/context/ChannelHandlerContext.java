package com.wch.pattern.context;

/**
 * Created by chunhai.wang on 2016/2/3.
 */
public class ChannelHandlerContext {
    private ChannelHandlerContext next;
    private ChannelHandlerContext prev;
    private ChannelHandler handler;

    public ChannelHandlerContext(ChannelHandler handler) {
        this.handler = handler;
    }

    public ChannelHandlerContext fireChannelActive() {
        handler.channelActive(this);
        ChannelHandlerContext next = findNextContext();
        if (next != null) {
            next.fireChannelActive();
        }
        return this;
    }

    private ChannelHandlerContext findNextContext() {
        ChannelHandlerContext ctx = this;
        ctx = ctx.next;
        return ctx;
    }

    public ChannelHandlerContext getNext() {
        return next;
    }

    public void setNext(final ChannelHandlerContext next) {
        this.next = next;
    }

    public ChannelHandlerContext getPrev() {
        return prev;
    }

    public void setPrev(final ChannelHandlerContext prev) {
        this.prev = prev;
    }

    public ChannelHandler getHandler() {
        return handler;
    }

    public void setHandler(final ChannelHandler handler) {
        this.handler = handler;
    }
}
