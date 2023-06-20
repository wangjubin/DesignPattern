package com.botech.designpattern.flyweight;

/**
 * 字符样式
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class CharacterStyle {
    private String font;
    private int size;
    private int colorRGB;
    
    public CharacterStyle(String font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CharacterStyle) {
            CharacterStyle cs = (CharacterStyle) obj;
            return cs.font.equals(font) && cs.size == size && cs.colorRGB == colorRGB;
        }
        return false;
    }
}