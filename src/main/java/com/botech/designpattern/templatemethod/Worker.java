package com.botech.designpattern.templatemethod;

import java.time.LocalDateTime;

/**
 * 工人的超类
 * <p>
 * 模板方法模式中的三类角色
 * 1、具体方法(Concrete Method)
 * 2、抽象方法(Abstract Method)
 * 3、钩子方法(Hook Method)
 * <p>
 * 三类角色的关联
 * 在模板方法模式中，首先父类会定义一个算法的框架，即实现算法所必须的所有方法。
 * <p>
 * 其中，具有共性的代码放在父类的具体方法中。
 * <p>
 * 各个子类特殊性的代码放在子类的具体方法中。但是父类中需要有对应抽象方法声明。
 * 钩子方法可以让子类决定是否对算法的不同点进行挂钩。
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