package com.botech.designpattern.iterator;

/**
 * 迭代器
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public interface Iterator {
    /**
     * 是否有下一个元素
     *
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     *
     */
    Object next();
}