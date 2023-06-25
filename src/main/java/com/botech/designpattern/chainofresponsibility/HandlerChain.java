package com.botech.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理链
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class HandlerChain{
    private List<IHandler> handlers = new ArrayList<>();
    public void addHandler(IHandler handler){
        this.handlers.add(handler);
    }
    public void handle(){
        for(IHandler handler : handlers){
            if(handler.handle()){
                break;
            }
        }
    }
}