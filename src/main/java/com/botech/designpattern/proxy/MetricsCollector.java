package com.botech.designpattern.proxy;

import com.botech.designpattern.proxy.bean.RequestInfo;
import com.botech.designpattern.proxy.service.MetricsStorage;
import org.junit.platform.commons.util.StringUtils;

/**
 * 度量收集器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class MetricsCollector {

    private MetricsStorage metricsStorage; // 基于接口而非实现编程

    // 依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    // 用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }



}
