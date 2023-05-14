package com.dbq.design.decorator;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 * 具体组件
 */
public class BaseBattercake extends AbstractBattercake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
