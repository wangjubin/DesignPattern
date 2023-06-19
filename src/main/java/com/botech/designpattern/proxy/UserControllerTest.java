package com.botech.designpattern.proxy;

import com.botech.designpattern.proxy.jdkproxy.MetricsCollectorProxy;
import com.botech.designpattern.proxy.service.IUserController;
import com.botech.designpattern.proxy.service.impl.RedisMetricsCollector;
import com.botech.designpattern.proxy.service.impl.UserController;

/**
 * 用户控制器测试
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class UserControllerTest {
    public static void main(String[] args) {
        //jdk动态代理
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController(),new RedisMetricsCollector());
        userController.login("13600000000", "pwd");

    }
}