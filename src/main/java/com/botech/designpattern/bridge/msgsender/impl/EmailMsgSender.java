package com.botech.designpattern.bridge.msgsender.impl;

import com.botech.designpattern.bridge.msgsender.MsgSender;

import java.util.List;

/**
 * 电子邮件消息发送方
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class EmailMsgSender implements MsgSender {
    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        System.out.println("send message by email:"+ message + emails);
    }
}