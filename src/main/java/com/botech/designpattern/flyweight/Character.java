package com.botech.designpattern.flyweight;

/**
 * 字符
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Character {
    private char c;
    private CharacterStyle style;
    
    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}