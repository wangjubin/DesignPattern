package com.botech.designpattern.chainofresponsibility;

/**
 * 处理
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class HandlerA implements IHandler{
    @Override
    public boolean handle(){
        boolean handled = true;
        // do something
        System.out.println("HandlerA");
        return handled;
    }
}