package com.dbq.design.singleton.safe;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class HungryStaticSingleton3 {

    private static HungryStaticSingleton3 lazySimpleSingleton;

    /**
     * 私有化构造函数
     */
    private HungryStaticSingleton3() {
    }

    public static HungryStaticSingleton3 getInstance1Version() {
        // 加个判断增加效率，但是出现线程并发问题
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new HungryStaticSingleton3();
        }
        return lazySimpleSingleton;
    }

}
