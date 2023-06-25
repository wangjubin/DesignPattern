package com.botech.designpattern.state.mario;

import com.botech.designpattern.state.State;

/**
 * 马里奥
 *
 * @author wangjubin
 * @date 2023/06/15
 */
public interface IMario {


    /**
     * 得到名字
     *
     * @author wangjubin
     */
    State getName();

    /**
     * 吃了蘑菇
     *
     * @author wangjubin
     */
    void obtainMushRoom();

    /**
     * 获得斗篷
     *
     * @author wangjubin
     */
    void obtainCape();

    /**
     * 获得火焰
     *
     * @author wangjubin
     */
    void obtainFireFlower();

    /**
     * 遇到怪物
     *
     * @author wangjubin
     */
    void meetMonster();
}
