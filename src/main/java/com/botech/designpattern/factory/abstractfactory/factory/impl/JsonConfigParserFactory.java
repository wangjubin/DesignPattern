package com.botech.designpattern.factory.abstractfactory.factory.impl;

import com.botech.designpattern.factory.abstractfactory.factory.IConfigParserFactory;
import com.botech.designpattern.factory.abstractfactory.service.ISystemConfigParser;
import com.botech.designpattern.factory.abstractfactory.service.impl.JsonSystemConfigParser;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.JsonRuleConfigParser;

/**
 * json配置解析器工厂
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}