package com.botech.designpattern.templatemethod;

/**
 * IT
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     * 
     */
    public boolean isNeedPrintDate() {
        return true;
    }
    @Override
    public void work() {
        System.out.println(name + "写程序-测bug-fix bug");
    }
}