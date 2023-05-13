package com.dbq.design.factory.simple;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class JavaCourse implements Course{
    @Override
    public void study() {
        System.out.println("java课程学习");
    }
}
