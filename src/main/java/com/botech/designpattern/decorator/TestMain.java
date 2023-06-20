package com.botech.designpattern.decorator;

import com.botech.designpattern.decorator.equip.ArmEquip;
import com.botech.designpattern.decorator.gem.BlueGemDecorator;
import com.botech.designpattern.decorator.gem.RedGemDecorator;
import com.botech.designpattern.decorator.gem.YellowGemDecorator;

public class TestMain {
    public static void main(String[] args) {
        ArmEquip armEquip = new ArmEquip();
        BlueGemDecorator blueGemDecorator = new BlueGemDecorator(armEquip);
        RedGemDecorator redGemDecorator = new RedGemDecorator(blueGemDecorator);
        YellowGemDecorator yellowGemDecorator = new YellowGemDecorator(redGemDecorator);
        System.out.println("装备:"+yellowGemDecorator.description());
        System.out.println("攻击:"+yellowGemDecorator.caculateAttack());
    }
}
