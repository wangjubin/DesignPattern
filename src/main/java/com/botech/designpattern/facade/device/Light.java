package com.botech.designpattern.facade.device;

public class Light {

    /**
     * 灯光调亮
     *
     * @author wangjubin
     */
    public void up() {
        System.out.println("Light up");
    }

    /**
     * 灯光跳暗
     *
     * @author wangjubin
     */
    public void down() {
        System.out.println("Light down");
    }
}
