package com.botech.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 个性风格工厂
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(String font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                System.out.println("使用缓存的风格");
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}