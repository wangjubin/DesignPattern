package com.botech.designpattern.visitor.resources.impl;

import com.botech.designpattern.visitor.resources.ResourceFile;
import com.botech.designpattern.visitor.visitor.Visitor;

/**
 * PPT文件
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    //...
}