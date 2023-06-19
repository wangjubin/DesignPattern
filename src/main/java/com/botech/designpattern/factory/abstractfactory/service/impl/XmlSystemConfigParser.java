package com.botech.designpattern.factory.abstractfactory.service.impl;

import com.botech.designpattern.factory.abstractfactory.bean.SystemConfig;
import com.botech.designpattern.factory.abstractfactory.service.ISystemConfigParser;

/**
 * xml系统配置解析器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class XmlSystemConfigParser implements ISystemConfigParser {
    @Override
    public SystemConfig parse(String configText) {
        return null;
    }
}
