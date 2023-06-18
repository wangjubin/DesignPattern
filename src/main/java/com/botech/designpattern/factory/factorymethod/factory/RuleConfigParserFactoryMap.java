package com.botech.designpattern.factory.factorymethod.factory;

import com.botech.designpattern.factory.factorymethod.service.IRuleConfigParserFactory;
import com.botech.designpattern.factory.factorymethod.service.impl.JsonRuleConfigParserFactory;
import com.botech.designpattern.factory.factorymethod.service.impl.PropertiesRuleConfigParserFactory;
import com.botech.designpattern.factory.factorymethod.service.impl.XmlRuleConfigParserFactory;
import com.botech.designpattern.factory.factorymethod.service.impl.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 规则配置解析器工厂地图
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class RuleConfigParserFactoryMap{
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();
    
    static {
        cachedFactories.put("json",new JsonRuleConfigParserFactory());
        cachedFactories.put("xml",new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml",new YamlRuleConfigParserFactory());
        cachedFactories.put("properties",new PropertiesRuleConfigParserFactory());
    }
    
    public static IRuleConfigParserFactory getParserFactory(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}