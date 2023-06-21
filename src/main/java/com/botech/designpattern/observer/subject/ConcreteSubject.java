package com.botech.designpattern.observer.subject;

import com.botech.designpattern.observer.observe.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 *
 * @author wangjubin
 * @date 2023/06/21
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}