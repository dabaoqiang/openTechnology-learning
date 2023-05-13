package com.dbq.design.factory.abstracts;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        JavaCourseAbstract javaCourseAbstract = new JavaCourseAbstract();
        javaCourseAbstract.play();
        javaCourseAbstract.readBook();
        javaCourseAbstract.study();

    }
}
