package com.dbq.design.decorator;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 * 具体装饰器
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
