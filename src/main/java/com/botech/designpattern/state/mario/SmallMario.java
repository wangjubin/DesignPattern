package com.botech.designpattern.state.mario;

import com.botech.designpattern.state.MarioStateMachine;
import com.botech.designpattern.state.State;

/**
 * 小马里奥
 *
 * @author wangjubin
 * @date 2023/06/15
 */
public class SmallMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public SmallMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        marioStateMachine.setCurrentState(new SuperMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        marioStateMachine.setCurrentState(new CapeMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);

    }

    @Override
    public void obtainFireFlower() {
        marioStateMachine.setCurrentState(new FireMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        //not doing anything
    }
}
