package com.dbq.principle.depenceInversion;

/**
 * @author dabaoqiang
 */
public class PythonCourse implements Icourse {
    @Override
    public void study() {
        System.out.println("xq正在学习python课程");
    }
}
