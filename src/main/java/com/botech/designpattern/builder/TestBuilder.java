package com.botech.designpattern.builder;

/**
 * 测试建造者模式
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class TestBuilder {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(2)
                .build();
        System.out.println(config);
    }
}