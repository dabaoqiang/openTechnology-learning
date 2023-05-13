package com.dbq.principle.segregation;

/**
 * @author dabaoqiang
 */
public class Bird implements IAnimal {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        // 此时，鸟根本就不能泳！，如果用一个统一的接口的话,会出现脏的行为
    }
}
