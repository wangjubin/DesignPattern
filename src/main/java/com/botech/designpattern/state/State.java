package com.botech.designpattern.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态
 *
 * @author wangjubin
 * @date 2023/06/25
 */
@AllArgsConstructor
@Getter
public enum State {
    /**
     * 小
     */
    SMALL(0),
    /**
     * 超级
     */
    SUPER(1),
    /**
     * 火焰
     */
    FIRE(2),
    /**
     * 斗篷
     */
    CAPE(3);

    private final int  value;

}