package com.botech.designpattern.visitor.visitor.impl;

import com.botech.designpattern.visitor.resources.impl.PPTFile;
import com.botech.designpattern.visitor.resources.impl.PdfFile;
import com.botech.designpattern.visitor.resources.impl.WordFile;
import com.botech.designpattern.visitor.visitor.Visitor;

/**
 * 提取器
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }
    @Override
    public void visit(PPTFile pdfFile) {
        //...
        System.out.println("Extract PPT.");
    }
    @Override
    public void visit(WordFile pdfFile) {
        //...
        System.out.println("Extract WORD.");
    }
}