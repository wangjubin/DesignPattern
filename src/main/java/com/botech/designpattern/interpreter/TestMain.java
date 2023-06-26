package com.botech.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class TestMain {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter alertRuleInterpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 101L);
        stats.put("key2", 29L);
        stats.put("key3", 101L);
        stats.put("key4", 89L);
        boolean interpret = alertRuleInterpreter.interpret(stats);
        System.out.println(interpret);
    }
}