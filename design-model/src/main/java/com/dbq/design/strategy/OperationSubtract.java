package com.dbq.design.strategy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
