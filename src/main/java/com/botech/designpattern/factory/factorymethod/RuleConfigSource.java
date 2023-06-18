package com.botech.designpattern.factory.factorymethod;

import com.botech.designpattern.factory.factorymethod.factory.RuleConfigParserFactoryMap;
import com.botech.designpattern.factory.factorymethod.service.IRuleConfigParserFactory;
import com.botech.designpattern.factory.simplefactory.bean.RuleConfig;
import com.botech.designpattern.factory.simplefactory.exception.InvalidRuleConfigException;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();
        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}