package com.botech.designpattern.templatemethod;

/**
 * HR
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "看简历-打电话-接电话");
    }
}