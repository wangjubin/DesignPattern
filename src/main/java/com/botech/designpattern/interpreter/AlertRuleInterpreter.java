package com.botech.designpattern.interpreter;

import com.botech.designpattern.interpreter.impl.OrExpression;

import java.util.Map;

/**
 * 预警规则解释器
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class AlertRuleInterpreter {
   
    private Expression expression;

    public AlertRuleInterpreter(String alertRuleExpr) {
        this.expression = new OrExpression(alertRuleExpr);
    }

    public AlertRuleInterpreter(Expression expression) {
        this.expression = expression;
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}