package com.botech.designpattern.state.mario;

import com.botech.designpattern.state.MarioStateMachine;
import com.botech.designpattern.state.State;

/**
 * 斗篷里奥角
 *
 * @author wangjubin
 * @date 2023/06/15
 */
public class CapeMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public CapeMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom() {
        //not doing anything
    }

    @Override
    public void obtainCape() {
        //not doing anything
    }

    @Override
    public void obtainFireFlower() {
        //not doing anything
    }

    @Override
    public void meetMonster() {
        marioStateMachine.setCurrentState(new SmallMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() - 200);
    }
}
