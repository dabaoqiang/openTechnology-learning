package com.dbq.design.proxy.staticproxy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 * zhangLaosan因为注入的是具体对象实例，只能为zhangsan找对象，其他zhaoliu就找不到对象，
 * 对zhanglaosan进行抽象，使得能为大家找对象
 */
public class TestDemo {

    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();

    }
}
