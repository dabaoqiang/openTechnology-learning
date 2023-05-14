package com.dbq.design.strategy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 1));
        Context context2 = new Context(new OperationSubtract());
        System.out.println(context2.executeStrategy(1, 1));
    }
}
