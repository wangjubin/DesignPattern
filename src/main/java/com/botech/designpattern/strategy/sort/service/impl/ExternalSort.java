package com.botech.designpattern.strategy.sort.service.impl;

import com.botech.designpattern.strategy.sort.service.ISortAlg;

/**
 * 外部排序
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class ExternalSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("ExternalSort");
    }
}