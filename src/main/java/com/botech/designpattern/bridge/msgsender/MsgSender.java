package com.botech.designpattern.bridge.msgsender;

/**
 * 消息发送方
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public interface MsgSender {
    void send(String message);
}