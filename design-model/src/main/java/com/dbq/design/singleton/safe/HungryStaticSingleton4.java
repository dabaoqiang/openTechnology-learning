package com.dbq.design.singleton.safe;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class HungryStaticSingleton4 {

    private static HungryStaticSingleton4 lazySimpleSingleton;

    /**
     * 私有化构造函数
     */
    private HungryStaticSingleton4() {
    }

    /**
     * 为了解决并发问题，方法级别加锁
     *
     * @return
     */
    public static synchronized HungryStaticSingleton4 getInstance1Version() {
        // 加个判断增加效率
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new HungryStaticSingleton4();
        }
        return lazySimpleSingleton;
    }

}
