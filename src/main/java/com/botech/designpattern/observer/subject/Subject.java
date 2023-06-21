package com.botech.designpattern.observer.subject;

import com.botech.designpattern.observer.observe.Observer;

/**
 * 主题
 *
 * @author wangjubin
 * @date 2023/06/21
 */
public interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}