package com.botech.designpattern.chainofresponsibility;

/**
 * 处理
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class HandlerB implements IHandler{
    @Override
    public boolean handle(){
        boolean handled = false;
        // do something
        System.out.println("HandlerB");
        return handled;
    }
}