package com.botech.designpattern.factory.simplefactory.factory;

import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.JsonRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.PropertiesRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.XmlRuleConfigParser;
import com.botech.designpattern.factory.simplefactory.service.impl.YamlRuleConfigParser;

public class RuleConfigParserFactory {
    public static IRuleConfigParser  createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}