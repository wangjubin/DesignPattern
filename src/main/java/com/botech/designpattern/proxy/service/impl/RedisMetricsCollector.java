package com.botech.designpattern.proxy.service.impl;

import cn.hutool.json.JSONUtil;
import com.botech.designpattern.proxy.bean.RequestInfo;
import com.botech.designpattern.proxy.service.MetricsStorage;

import java.util.List;
import java.util.Map;

/**
 * redis度量收集器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class RedisMetricsCollector implements MetricsStorage {
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        System.out.println("RedisMetricsCollector saveRequestInfo" + JSONUtil.toJsonStr(requestInfo));
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
