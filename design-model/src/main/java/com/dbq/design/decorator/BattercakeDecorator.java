package com.dbq.design.decorator;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 * 抽象装饰器
 */
public class BattercakeDecorator extends BaseBattercake {

    private AbstractBattercake abstractBattercake;

    public BattercakeDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

    @Override
    protected String getMsg() {
        return this.abstractBattercake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.abstractBattercake.getPrice();
    }

}
