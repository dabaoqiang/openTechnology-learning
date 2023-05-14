package com.dbq.design.chainofresponsibility;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
