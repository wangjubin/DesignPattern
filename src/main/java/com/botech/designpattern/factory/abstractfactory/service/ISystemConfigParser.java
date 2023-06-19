package com.botech.designpattern.factory.abstractfactory.service;

import com.botech.designpattern.factory.abstractfactory.bean.SystemConfig;

/**
 * 系统配置解析器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public interface ISystemConfigParser {

    SystemConfig parse(String configText);
}
