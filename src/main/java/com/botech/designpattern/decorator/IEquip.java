package com.botech.designpattern.decorator;

/**
 * 装备的接口
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public interface IEquip{

    /**
     * 计算攻击力
     *
     * @author wangjubin
     */
    public int caculateAttack();

    /**
     * 描述
     *
     * @author wangjubin
     */
    public String description();
    
}