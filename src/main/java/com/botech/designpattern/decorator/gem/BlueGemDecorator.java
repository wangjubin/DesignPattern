package com.botech.designpattern.decorator.gem;

import com.botech.designpattern.decorator.IEquip;
import com.botech.designpattern.decorator.IEquipDecorator;

/**
 * 蓝色宝石装饰
 * 这与武器不同。可以累加
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class BlueGemDecorator implements IEquipDecorator {

    private IEquip iEquip;


    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return 5 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+蓝宝石";
    }
}
