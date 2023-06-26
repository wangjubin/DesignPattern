package com.botech.designpattern.visitor.visitor;

import com.botech.designpattern.visitor.resources.impl.PPTFile;
import com.botech.designpattern.visitor.resources.impl.PdfFile;
import com.botech.designpattern.visitor.resources.impl.WordFile;

/**
 * 访问者
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pdfFile);
    void visit(WordFile pdfFile);
}