package com.botech.designpattern.state;

import com.botech.designpattern.state.mario.IMario;
import com.botech.designpattern.state.mario.SmallMario;
import lombok.Data;

/**
 * 马里奥状态机
 *
 * @author wangjubin
 * @date 2023/06/25
 */
@Data
public class MarioStateMachine {

    private int score;

    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        currentState.obtainMushRoom();
    }


    /**
     * 获得斗篷
     *
     * @author wangjubin
     */
    public void obtainCape() {
        currentState.obtainCape();
    }


    /**
     * 获得火焰
     *
     * @author wangjubin
     */
    public void obtainFireFlower() {
        currentState.obtainFireFlower();
    }


    /**
     * 遇到怪物
     *
     * @author wangjubin
     */
    public void meetMonster() {
        currentState.meetMonster();
    }


    public String getDetail() {
        return currentState.getName() + ":" + score;
    }
}
