package com.botech.designpattern.interpreter.impl;

import com.botech.designpattern.interpreter.Expression;

import java.util.Map;

/**
 * 大于表达式
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class GreaterExpression implements Expression {
    private String key;
    private long value;

    public GreaterExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !">".equals(elements[1].trim())) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public GreaterExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long statValue = stats.get(key);
        return statValue > value;
    }
}