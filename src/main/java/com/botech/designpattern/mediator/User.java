package com.botech.designpattern.mediator;

/**
 * 用户
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        CharRoom.showMessage(this, message);
    }
}