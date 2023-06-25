package com.botech.designpattern.chainofresponsibility;

/**
 * 测试
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class TestMain {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
