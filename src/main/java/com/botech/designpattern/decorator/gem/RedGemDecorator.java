package com.botech.designpattern.decorator.gem;

import com.botech.designpattern.decorator.IEquip;
import com.botech.designpattern.decorator.IEquipDecorator;

/**
 * 红色宝石装饰
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class RedGemDecorator implements IEquipDecorator {
    private IEquip iEquip;

    public RedGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 15 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 红宝石";
    }
}
