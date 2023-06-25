package com.botech.designpattern.state;

/**
 * 测试
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class TestMain {

    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        marioStateMachine.obtainMushRoom();
        marioStateMachine.obtainFireFlower();
        System.out.println(marioStateMachine.getDetail());
        marioStateMachine.meetMonster();
        System.out.println(marioStateMachine.getDetail());
    }

}
