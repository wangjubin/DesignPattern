package com.botech.designpattern.flyweight;

public class TestMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.appendCharacter('a', "宋体", 5, 0);
        editor.appendCharacter('a', "黑体", 5, 0);
        editor.appendCharacter('c', "宋体", 5, 0);

    }
}
