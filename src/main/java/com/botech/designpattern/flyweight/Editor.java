package com.botech.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 编辑器
 *
 * @author wangjubin
 * @date 2023/06/20
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();
    public void appendCharacter(char c, String font, int size, int colorRGB) {
        CharacterStyle style = CharacterStyleFactory.getStyle(font, size, colorRGB);
        Character character = new Character(c, style);
        chars.add(character);
    }


}