package com.dbq.design.singleton.hungry;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 另一种写法
 */
public class HungryStaticSingleton2 {

    private static final HungryStaticSingleton2 h;

    /**
     * 使用了静态方法块
     */
    static {
        h = new HungryStaticSingleton2();
    }

    /**
     * 私有化构造函数
     */
    private HungryStaticSingleton2() {
    }

    /**
     * 统一对外方法
     *
     * @return
     */
    public static HungryStaticSingleton2 getInstance() {
        return h;
    }
}
