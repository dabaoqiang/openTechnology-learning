package com.dbq.design.singleton.safe;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class HungryStaticSingleton5 {

    private static HungryStaticSingleton5 lazySimpleSingleton;

    /**
     * 私有化构造函数
     */
    private HungryStaticSingleton5() {
    }

    /**
     * 方法级别加锁颗粒度太大，影响性能，对代码进行加锁,
     *
     * @return
     */
    public static synchronized HungryStaticSingleton5 getInstance1Version() {
        // 解决性能问题
        if (lazySimpleSingleton == null) {
            synchronized (HungryStaticSingleton5.class) {
                // 这个也有问题，A线程走完了，B线程已经到syc这一步了，还是会有问题
                lazySimpleSingleton = new HungryStaticSingleton5();
            }
        }
        return lazySimpleSingleton;
    }
}
