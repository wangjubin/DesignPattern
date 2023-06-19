package com.botech.designpattern.proxy.jdkproxy;

import com.botech.designpattern.proxy.service.MetricsStorage;

import java.lang.reflect.Proxy;

/**
 * 度量收集器代理
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class MetricsCollectorProxy {
    public Object createProxy(Object proxiedObject, MetricsStorage metricsStorage) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject, metricsStorage);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }
}