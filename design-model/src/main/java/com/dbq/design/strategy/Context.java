package com.dbq.design.strategy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
