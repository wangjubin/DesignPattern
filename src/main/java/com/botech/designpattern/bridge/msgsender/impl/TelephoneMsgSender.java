package com.botech.designpattern.bridge.msgsender.impl;

import com.botech.designpattern.bridge.msgsender.MsgSender;

import java.util.List;

/**
 * 电话消息发送方
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println("send message by telephone:" + message + telephones);
    }
}