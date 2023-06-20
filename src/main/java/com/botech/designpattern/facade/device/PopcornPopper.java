package com.botech.designpattern.facade.device;

/**
 * 爆米花机器
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class PopcornPopper {

    /**
     * 打开爆米花机
     *
     * @author wangjubin
     */
    public void on() {
        System.out.println("PopcornPopper on");
    }

    /**
     * 关闭爆米花机
     *
     * @author wangjubin
     */
    public void off() {
        System.out.println("PopcornPopper off");
    }

    /**
     * 制作爆米花
     *
     * @author wangjubin
     */
    public void makePopcorn() {
        System.out.println("PopcornPopper makePopcorn");
    }
}
