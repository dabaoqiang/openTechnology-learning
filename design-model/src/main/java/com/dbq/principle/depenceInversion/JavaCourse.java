package com.dbq.principle.depenceInversion;

/**
 * @author dabaoqiang
 */
public class JavaCourse implements Icourse {

    @Override
    public void study() {
        System.out.println("xq正在学习java课程");
    }
}
