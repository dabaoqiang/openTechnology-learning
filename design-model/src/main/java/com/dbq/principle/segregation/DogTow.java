package com.dbq.principle.segregation;

/**
 * @author dabaoqiang
 * @desc 我是狗的升级版，我现在不统一实现动物类，接口，我只是实行我需要的行为接口即接口隔离原则,我只要我的行为
 */
public class DogTow implements IEatAnimal, ISwimAnimal {

    @Override
    public void eat() {
        System.out.println("狗会吃");
    }

    @Override
    public void swim() {
        System.out.println("狗会游");
    }
}
