package com.dbq.design.chainofresponsibility;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
