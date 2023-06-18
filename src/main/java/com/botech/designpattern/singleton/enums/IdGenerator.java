package com.botech.designpattern.singleton.enums;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举[极推荐使用]
 * <p>
 * 这里IdGenerator.INSTANCE
 * 这里的INSTANCE即为IdGenerator类型的引用所以得到它就可以调用枚举中的方法了。
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 * @author wangjubin
 * @date 2023/06/18
 */
public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();

    }
}
//long id=IdGenerator.INSTANCE.getId()