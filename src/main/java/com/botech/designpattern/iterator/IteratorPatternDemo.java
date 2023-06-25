package com.botech.designpattern.iterator;

/**
 * 迭代器模式演示
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}