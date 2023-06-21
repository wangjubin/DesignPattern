package com.botech.designpattern.observer;

import com.botech.designpattern.observer.observe.ConcreteObserverOne;
import com.botech.designpattern.observer.observe.ConcreteObserverTwo;
import com.botech.designpattern.observer.subject.ConcreteSubject;

/**
 * 测试主要
 *
 * @author wangjubin
 * @date 2023/06/21
 */
public class TestMain {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(new ConcreteObserverOne());
        concreteSubject.registerObserver(new ConcreteObserverTwo());
        concreteSubject.notifyObservers();
    }
}
