package com.dbq.design.singleton.hungry;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 初始化项目的时候进行对象创建
 */
public class HungrySingleton {

    private static final HungrySingleton h = new HungrySingleton();

    /**
     * 私有化构造函数
     */
    private HungrySingleton() {
    }

    /**
     * 统一对外方法
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return h;
    }
}
