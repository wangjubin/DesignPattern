package com.botech.designpattern.visitor.resources.impl;

import com.botech.designpattern.visitor.resources.ResourceFile;
import com.botech.designpattern.visitor.visitor.Visitor;

/**
 * pdf文件
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    //...
}