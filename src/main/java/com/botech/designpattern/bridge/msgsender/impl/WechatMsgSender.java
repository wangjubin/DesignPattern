package com.botech.designpattern.bridge.msgsender.impl;

import com.botech.designpattern.bridge.msgsender.MsgSender;

import java.util.List;

/**
 * 微信消息发送方
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class WechatMsgSender implements MsgSender {
    private List<String> wechats;

    public WechatMsgSender(List<String> wechats) {
        this.wechats = wechats;
    }

    @Override
    public void send(String message) {
        System.out.println("send message by wechat:" + message + wechats);
    }
}