package com.botech.designpattern.factory.simplefactory.service;

import com.botech.designpattern.factory.simplefactory.bean.RuleConfig;

/**
 * rule配置解析器
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
