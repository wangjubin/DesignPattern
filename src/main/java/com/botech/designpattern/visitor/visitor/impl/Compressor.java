package com.botech.designpattern.visitor.visitor.impl;

import com.botech.designpattern.visitor.resources.impl.PPTFile;
import com.botech.designpattern.visitor.resources.impl.PdfFile;
import com.botech.designpattern.visitor.resources.impl.WordFile;
import com.botech.designpattern.visitor.visitor.Visitor;

/**
 * 压缩
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class Compressor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }
    @Override
    public void visit(PPTFile pdfFile) {
        //...
        System.out.println("Compress PPT.");
    }
    @Override
    public void visit(WordFile pdfFile) {
        //...
        System.out.println("Compress WORD.");
    }
}