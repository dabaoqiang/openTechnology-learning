package com.dbq.design.proxy.dynamicproxy.jdkproxy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    @Override
    public void buyInsure() {
        System.out.println("20万");
    }
}
