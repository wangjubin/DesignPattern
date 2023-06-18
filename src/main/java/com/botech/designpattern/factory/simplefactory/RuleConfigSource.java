package com.botech.designpattern.factory.simplefactory;

import com.botech.designpattern.factory.simplefactory.bean.RuleConfig;
import com.botech.designpattern.factory.simplefactory.exception.InvalidRuleConfigException;
import com.botech.designpattern.factory.simplefactory.factory.RuleConfigParserFactory;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;

/**
 * 规则配置源
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        if(parser == null) {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }
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