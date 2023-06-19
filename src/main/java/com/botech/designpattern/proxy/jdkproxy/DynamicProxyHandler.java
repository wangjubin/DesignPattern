package com.botech.designpattern.proxy.jdkproxy;

import com.botech.designpattern.proxy.MetricsCollector;
import com.botech.designpattern.proxy.bean.RequestInfo;
import com.botech.designpattern.proxy.service.MetricsStorage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理程序
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    private MetricsCollector metricsCollector;



    public DynamicProxyHandler(Object proxied,MetricsStorage metricsStorage) {
        this.proxied = proxied;
        this.metricsCollector =new MetricsCollector(metricsStorage);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在转调具体目标对象之前，可以执行一些功能处理
        long startTimestamp = System.currentTimeMillis();
        // 转调具体目标对象的方法
        Object result = method.invoke(proxied, args);
        // 在转调具体目标对象之后，可以执行一些功能处理
        long endTimestamp = System.currentTimeMillis();
        long responseTime = endTimestamp - startTimestamp;
        String apiName = proxied.getClass().getName() + ":" + method.getName();
        RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return result;
    }
}