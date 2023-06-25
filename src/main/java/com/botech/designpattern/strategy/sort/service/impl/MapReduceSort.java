package com.botech.designpattern.strategy.sort.service.impl;

import com.botech.designpattern.strategy.sort.service.ISortAlg;

/**
 * MapReduceSort
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class MapReduceSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("MapReduceSort");
    }
}