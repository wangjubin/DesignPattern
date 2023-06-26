package com.botech.designpattern.interpreter.impl;

import com.botech.designpattern.interpreter.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 或表达
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression) {
        String[] strExpressions = strOrExpression.trim().split("\\|\\|");
        for (String strExpr : strExpressions) {
            expressions.add(new AndExpression(strExpr));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            if (expr.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}