package com.botech.designpattern.state.mario;

import com.botech.designpattern.state.MarioStateMachine;
import com.botech.designpattern.state.State;

/**
 * 火焰马里奥
 *
 * @author wangjubin
 * @date 2023/06/15
 */
public class FireMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public FireMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }


    @Override
    public State getName() {
        return State.FIRE;
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
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
    }
}
