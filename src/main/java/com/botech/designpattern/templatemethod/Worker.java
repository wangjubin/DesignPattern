package com.botech.designpattern.templatemethod;

import java.time.LocalDateTime;

/**
 * 工人
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    /**
     * 具体方法
     */
    public final void workOneDay() {
        System.out.println("===================work start=================");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("===================work end====================");
    }

    /**
     * 抽象方法
     */
    public abstract void work();

    /**
     * 钩子方法
     */
    public boolean isNeedPrintDate() {
        return false;
    }

    private void exitCompany() {
        if (isNeedPrintDate()) {
            System.out.println("exitCompany---" + LocalDateTime.now() + name + "---离开公司");
            return;
        }
        System.out.println("exitCompany" + name + "---离开公司");

    }

    private void computerOn() {
        System.out.println(name + " 打开电脑");
    }

    private void computerOff() {
        System.out.println(name + " 关闭电脑");
    }

    public void enterCompany() {
        System.out.println(name + " 进入公司");
    }
}