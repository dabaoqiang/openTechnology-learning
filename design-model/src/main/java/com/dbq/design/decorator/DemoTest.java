package com.dbq.design.decorator;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class DemoTest {
    public static void main(String[] args) {
        BaseBattercake baseBattercake = new BaseBattercake();
        System.out.println(baseBattercake.getMsg());
        System.out.println(baseBattercake.getPrice());

        EggDecorator eggDecorator = new EggDecorator(baseBattercake);
        System.out.println(eggDecorator.getMsg());
        System.out.println(eggDecorator.getPrice());

    }
}
