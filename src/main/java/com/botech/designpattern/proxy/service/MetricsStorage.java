package com.botech.designpattern.proxy.service;

import com.botech.designpattern.proxy.bean.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * 度量存储
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    Map<String, List<RequestInfo>> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);
}
