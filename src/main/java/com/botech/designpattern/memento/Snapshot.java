package com.botech.designpattern.memento;

/**
 * 快照
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class Snapshot{
    private String text;
    public Snapshot(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}