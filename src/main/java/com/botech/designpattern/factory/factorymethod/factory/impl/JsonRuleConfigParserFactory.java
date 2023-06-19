package com.botech.designpattern.factory.factorymethod.factory.impl;

import com.botech.designpattern.factory.factorymethod.factory.IRuleConfigParserFactory;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.JsonRuleConfigParser;

/**
 * json规则配置解析器工厂
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}