package com.botech.designpattern.strategy;

import com.botech.designpattern.strategy.sort.Sorter;

/**
 * 测试
 *
 * @author wangjubin
 * @date 2023/06/25
 */
public class TestMain {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile("F:\\迅雷下载\\zh-cn_windows_10_business_editions_version_21h2_updated_sep_2022_x64_dvd_1015341c.iso");
    }
}
