package com.dbq.design.singleton.inner;

import java.io.Serializable;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * <p>
 * 内部类加载 classPath:LazyStaticInnerSingleton.class
 * LazyStaticInnerSingleton$LazyHolder.class
 * 只有使用的时候，jvm才会初始化内部类
 * 优点：写法优雅，利用java本身语法，避免内存浪费，性能高
 * 缺点：能够被反射破坏
 * <p>
 * 2.0版本
 * 优点：处理了反射问题
 * 缺点：代码不优雅
 */
public class LazyStaticInnerSingleton implements Serializable {

    /**
     * 私有化构造函数
     *
     * @throws RuntimeException
     */
    private LazyStaticInnerSingleton() throws RuntimeException {
        // 处理反射
        if (LazyHolder.l != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    /**
     * 对外获取实例方法
     *
     * @return
     */
    public static LazyStaticInnerSingleton getInstance() {
        return LazyHolder.l;
    }

    /**
     * 内部类使用的时候初始化
     */
    private static class LazyHolder {
        private static final LazyStaticInnerSingleton l = new LazyStaticInnerSingleton();
    }

    /**
     * 序列化的时候不产生新对象
     *
     * @return
     */
    private Object readResolve() {
        return LazyHolder.l;
    }

}
