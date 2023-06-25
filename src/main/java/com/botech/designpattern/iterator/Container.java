package com.botech.designpattern.iterator;

/**
 * 容器
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public interface Container {
    /**
     * 获取迭代器
     *
     */
    Iterator getIterator();
}