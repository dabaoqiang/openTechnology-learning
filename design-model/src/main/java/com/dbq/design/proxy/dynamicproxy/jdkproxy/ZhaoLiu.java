package com.dbq.design.proxy.dynamicproxy.jdkproxy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class ZhaoLiu implements IPerson{
    @Override
    public void findLove() {
        System.out.println("赵六要求：位高金多");
    }

    @Override
    public void buyInsure() {
        System.out.println("100W");
    }
}
