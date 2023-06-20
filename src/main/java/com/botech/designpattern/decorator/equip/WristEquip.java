package com.botech.designpattern.decorator.equip;

import com.botech.designpattern.decorator.IEquip;

/**
 * 手腕装备
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class WristEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}