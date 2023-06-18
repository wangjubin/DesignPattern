package com.botech.designpattern.singleton.lanhan.bothexam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例模式懒汉式双重校验锁[推荐用]
 * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static volatile IdGenerator instance;

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
//long id=IdGenerator.getInstance().getId()