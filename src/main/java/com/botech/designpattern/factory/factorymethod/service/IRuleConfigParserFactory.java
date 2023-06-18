package com.botech.designpattern.factory.factorymethod.service;

import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;

/**
 * rule配置解析器工厂
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
