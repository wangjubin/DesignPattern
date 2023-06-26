package com.botech.designpattern.mediator;

/**
 * 测试
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class TestMain{
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}