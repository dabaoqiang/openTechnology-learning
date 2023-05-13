package com.dbq.design.singleton.safe;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class HungryStaticSingleton6 {

    private static volatile HungryStaticSingleton6 lazySimpleSingleton;

    /**
     * 私有化构造函数
     */
    private HungryStaticSingleton6() {
    }

    /**
     * 方法级别加锁颗粒度太大，影响性能，对代码进行加锁,
     *
     * @return
     */
    public static synchronized HungryStaticSingleton6 getInstance1Version() {
        // 1.检测对象是否是否要阻塞
        if (lazySimpleSingleton == null) {
            synchronized (HungryStaticSingleton6.class) {
                // 2.检查是否要创建
                if (lazySimpleSingleton == null) {
                    lazySimpleSingleton = new HungryStaticSingleton6();
                    // 指令重排序问题lazySimpleSingleten 要变成  volatile
                }
            }
        }
        return lazySimpleSingleton;
    }
}
