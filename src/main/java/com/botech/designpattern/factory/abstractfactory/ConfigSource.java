package com.botech.designpattern.factory.abstractfactory;

import com.botech.designpattern.factory.abstractfactory.bean.SystemConfig;
import com.botech.designpattern.factory.abstractfactory.factory.ConfigParserFactoryMap;
import com.botech.designpattern.factory.abstractfactory.factory.IConfigParserFactory;
import com.botech.designpattern.factory.abstractfactory.service.ISystemConfigParser;
import com.botech.designpattern.factory.simplefactory.bean.RuleConfig;
import com.botech.designpattern.factory.simplefactory.exception.InvalidRuleConfigException;
import com.botech.designpattern.factory.simplefactory.service.IRuleConfigParser;

/**
 * 配置源
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class ConfigSource {
    /**
     * 加载系统配置
     *
     * @author wangjubin
     */
    public SystemConfig loadSystemConfig(String systemConfigFilePath) throws InvalidRuleConfigException {
        String systemConfigFileExtension = getFileExtension(systemConfigFilePath);
        IConfigParserFactory parserFactory = ConfigParserFactoryMap.getParserFactory(systemConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("system config file format is not supported: " + systemConfigFilePath);
        }
        ISystemConfigParser parser = parserFactory.createSystemParser();
        String configText = "";
        //从systemConfigFilePath文件中读取配置文本到configText中
        return parser.parse(configText);
    }

    /**
     * 加载规则配置
     *
     * @author wangjubin
     */
    public RuleConfig loadRuleConfig(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IConfigParserFactory parserFactory = ConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser ruleParser = parserFactory.createRuleParser();
        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        return ruleParser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}