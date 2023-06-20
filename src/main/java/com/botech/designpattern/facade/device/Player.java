package com.botech.designpattern.facade.device;

/**
 * 播放器
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Player {

    public void on() {
        System.out.println("player on");
    }

    public void off() {
        System.out.println("player off");
    }

    public void make3DListener() {
        System.out.println("player make3DListener");
    }
}
