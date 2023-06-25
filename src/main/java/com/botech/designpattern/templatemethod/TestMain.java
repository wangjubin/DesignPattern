package com.botech.designpattern.templatemethod;

/**
 * 测试主要
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class TestMain {

    public static void main(String[] args) {
        Worker it = new ITWorker("鸿洋");
        it.workOneDay();

        Worker hr = new HRWorker("老李");
        hr.workOneDay();
    }
}
