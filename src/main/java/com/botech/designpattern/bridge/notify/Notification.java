package com.botech.designpattern.bridge.notify;

import com.botech.designpattern.bridge.msgsender.MsgSender;

/**
 * 通知
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
