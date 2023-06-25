package com.botech.designpattern.strategy.sort.factory;

import com.botech.designpattern.strategy.sort.service.ISortAlg;
import com.botech.designpattern.strategy.sort.service.impl.ConcurrentExternalSort;
import com.botech.designpattern.strategy.sort.service.impl.ExternalSort;
import com.botech.designpattern.strategy.sort.service.impl.MapReduceSort;
import com.botech.designpattern.strategy.sort.service.impl.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * 排序工厂
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class SortAlgFactory{
    
    private static final Map<String, ISortAlg> algs = new HashMap<>();
    
    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }
    
    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}