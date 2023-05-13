package com.dbq.principle.segregation;

import com.dbq.principle.segregation.IAnimal;

/**
 * @author dabaoqiang
 */
public class Dog implements IAnimal {
    /**
     * eat
     */
    @Override
    public void eat() {

    }

    /**
     * fly
     */
    @Override
    public void fly() {
        // 此时，狗根本就不能飞！，如果用一个统一的接口的话,接口定义行为错误

    }

    @Override
    public void swim() {

    }
}
