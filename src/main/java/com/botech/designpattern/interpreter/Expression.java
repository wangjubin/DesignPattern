package com.botech.designpattern.interpreter;

import java.util.Map;

/**
 * 表达式
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public interface Expression {
    boolean interpret(Map<String, Long> stats);
}