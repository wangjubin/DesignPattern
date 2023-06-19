package com.botech.designpattern.bridge.notify;

import com.botech.designpattern.bridge.msgsender.MsgSender;

/**
 * 严重通知
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
