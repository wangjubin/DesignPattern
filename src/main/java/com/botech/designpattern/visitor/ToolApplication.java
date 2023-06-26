package com.botech.designpattern.visitor;

import com.botech.designpattern.visitor.resources.ResourceFile;
import com.botech.designpattern.visitor.resources.impl.PPTFile;
import com.botech.designpattern.visitor.resources.impl.PdfFile;
import com.botech.designpattern.visitor.resources.impl.WordFile;
import com.botech.designpattern.visitor.visitor.impl.Compressor;
import com.botech.designpattern.visitor.visitor.impl.Extractor;

import java.util.ArrayList;
import java.util.List;

/**
 * 工具应用
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }
        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }
    private static List<ResourceFile> listAllResourceFiles() {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}