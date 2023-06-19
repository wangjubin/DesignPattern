package com.botech.designpattern.proxy.service.impl;

import cn.hutool.json.JSONUtil;
import com.botech.designpattern.proxy.bean.RequestInfo;
import com.botech.designpattern.proxy.service.MetricsStorage;

import java.util.List;
import java.util.Map;

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
