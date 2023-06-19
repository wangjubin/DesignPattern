package com.botech.designpattern.factory.abstractfactory.factory;

import com.botech.designpattern.factory.abstractfactory.factory.impl.JsonConfigParserFactory;
import com.botech.designpattern.factory.abstractfactory.factory.impl.XmlConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 规则配置解析器工厂
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class ConfigParserFactoryMap {
    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
        //省略。。。。

    }

    public static IConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}