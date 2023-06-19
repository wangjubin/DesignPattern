package com.botech.designpattern.factory.abstractfactory.factory;

import com.botech.designpattern.factory.abstractfactory.service.ISystemConfigParser;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;

/**
 * iconfig解析器工厂
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}