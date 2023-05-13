package com.dbq.design.factory.simple;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class PythonCourse implements Course {
    @Override
    public void study() {
        System.out.println("Python课程学习");
    }
}
