package com.botech.designpattern.interpreter.impl;

import com.botech.designpattern.interpreter.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 与表达式
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class AndExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String strAndExpression) {
        String[] strExpressions = strAndExpression.trim().split("&&");
        for (String strExpr : strExpressions) {
            if(strExpr.contains(">")) {
                expressions.add(new GreaterExpression(strExpr));
            } else if(strExpr.contains("<")) {
                expressions.add(new LessExpression(strExpr));
            } else if(strExpr.contains("==")) {
                expressions.add(new EqualExpression(strExpr));
            } else {
                throw new RuntimeException("Expression is invalid: " + strAndExpression);
            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            if (!expr.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}