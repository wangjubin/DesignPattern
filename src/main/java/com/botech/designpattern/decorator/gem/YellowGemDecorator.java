package com.botech.designpattern.decorator.gem;

import com.botech.designpattern.decorator.IEquip;
import com.botech.designpattern.decorator.IEquipDecorator;

/**
 * 黄色宝石装饰
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class YellowGemDecorator implements IEquipDecorator {

    private IEquip iEquip;

    public YellowGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 10 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 黄宝石";
    }
}