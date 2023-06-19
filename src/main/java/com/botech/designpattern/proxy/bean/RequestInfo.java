package com.botech.designpattern.proxy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 请求信息
 *
 * @author wangjubin
 * @date 2023/06/19
 */
@Data
@AllArgsConstructor
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;

}
