package com.botech.designpattern.bridge;

import cn.hutool.core.collection.ListUtil;
import com.botech.designpattern.bridge.msgsender.impl.TelephoneMsgSender;
import com.botech.designpattern.bridge.notify.SevereNotification;

/**
 * 测试演示
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class TestDemo {
    public static void main(String[] args) {
        SevereNotification severeNotification = new SevereNotification(
                new TelephoneMsgSender(ListUtil.of("1823")));
        severeNotification.notify("haha");
    }
}
