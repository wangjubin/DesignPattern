package com.botech.designpattern.state.mario;

import com.botech.designpattern.state.MarioStateMachine;
import com.botech.designpattern.state.State;

/**
 * 超级马里奥
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class SuperMario implements IMario {

    private MarioStateMachine marioStateMachine;

    public SuperMario(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {

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
        marioStateMachine.setCurrentState(new SmallMario(marioStateMachine));
        marioStateMachine.setScore(marioStateMachine.getScore() - 100);
    }
}
