package com.botech.designpattern.proxy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;

}
