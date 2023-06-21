package com.botech.designpattern.observer.observe;

/**
 * 具体观察者一
 *
 * @author wangjubin
 * @date 2023/06/21
 */
public class ConcreteObserverOne implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserverOne is notified");
    }
}