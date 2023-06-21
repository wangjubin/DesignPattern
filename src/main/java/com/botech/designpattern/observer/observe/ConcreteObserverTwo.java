package com.botech.designpattern.observer.observe;

/**
 * 具体观察者二
 *
 * @author wangjubin
 * @date 2023/06/21
 */
public class ConcreteObserverTwo implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserverTwo is notified");
    }
}