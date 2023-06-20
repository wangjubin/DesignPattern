package com.botech.designpattern.facade.device;

/**
 * 投影仪
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Projector {

    /**
     * 打开投影仪
     *
     * @author wangjubin
     */
    public void on() {
        System.out.println("Projector on");
    }

    /**
     * 关闭投影仪
     *
     * @author wangjubin
     */
    public void off() {
        System.out.println("Projector off");
    }

    /**
     * 收起投影仪投影区
     *
     * @author wangjubin
     */
    public void close() {
        System.out.println("Projector close");
    }

    /**
     * 放下投影仪投影区
     *
     * @author wangjubin
     */
    public void open() {
        System.out.println("Projector open");
    }
}
