package com.botech.designpattern.visitor.resources;

import com.botech.designpattern.visitor.visitor.Visitor;

/**
 * 资源文件
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Visitor visitor);
}