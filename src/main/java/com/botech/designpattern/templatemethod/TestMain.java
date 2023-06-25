package com.botech.designpattern.templatemethod;

public class TestMain {

    public static void main(String[] args) {
        Worker it = new ITWorker("鸿洋");
        it.workOneDay();

        Worker hr = new HRWorker("老李");
        hr.workOneDay();
    }
}
