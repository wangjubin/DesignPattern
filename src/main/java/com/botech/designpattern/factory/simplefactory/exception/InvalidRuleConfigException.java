package com.botech.designpattern.factory.simplefactory.exception;

/**
 * 无效规则配置异常
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class InvalidRuleConfigException extends Exception{

    public InvalidRuleConfigException(String msg){
        super(msg);
    }
}
