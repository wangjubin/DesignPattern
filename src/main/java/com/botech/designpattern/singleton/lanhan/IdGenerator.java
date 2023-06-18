package com.botech.designpattern.singleton.lanhan;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例模式懒汉式
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;

    private IdGenerator() {
    }

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}

//long id=IdGenerator.getInstance().getId()