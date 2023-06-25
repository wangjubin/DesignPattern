package com.botech.designpattern.strategy.sort;

import com.botech.designpattern.strategy.sort.factory.SortAlgFactory;
import com.botech.designpattern.strategy.sort.service.ISortAlg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Sorter{
    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlgRange> algs = new ArrayList<>();
    static {
        algs.add(new AlgRange(0, 5*GB, SortAlgFactory.getSortAlg("QuickSort")));
        algs.add(new AlgRange(5*GB, 10*GB, SortAlgFactory.getSortAlg("ExternalSort")));
        algs.add(new AlgRange(10*GB, 100*GB, SortAlgFactory.getSortAlg("ConcurrentExternalSort")));
        algs.add(new AlgRange(100*GB, Long.MAX_VALUE, SortAlgFactory.getSortAlg("MapReduceSort")));
    }
    
    public void sortFile(String filePath){
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlgRange algRange : algs) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }
    
    private static class AlgRange{
        private long start;
        private long end;
        private ISortAlg alg;
        
        public AlgRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }
        
        public ISortAlg getAlg() {
            return alg;
        }
        
        public boolean inRange(long size) {
            return size >= start && size < end;
        }
    }
}