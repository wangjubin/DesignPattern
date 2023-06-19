package com.botech.designpattern.bridge.notify;

import com.botech.designpattern.bridge.msgsender.MsgSender;

/**
 * 正常通知
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}