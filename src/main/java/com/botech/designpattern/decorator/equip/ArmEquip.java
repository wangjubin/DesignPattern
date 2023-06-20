package com.botech.designpattern.decorator.equip;

import com.botech.designpattern.decorator.IEquip;

/**
 * 手臂装备
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class ArmEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙宝刀";
    }
}
