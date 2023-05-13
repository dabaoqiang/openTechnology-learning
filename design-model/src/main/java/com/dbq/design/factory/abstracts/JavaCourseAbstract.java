package com.dbq.design.factory.abstracts;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class JavaCourseAbstract implements IcourseFactory {
    @Override
    public IVideo play() {
        System.out.println("java播放");
        return null;
    }

    @Override
    public IBook readBook() {
        System.out.println("java读书");
        return null;
    }

    @Override
    public IStudy study() {
        System.out.println("java用心学习");
        return null;
    }
}
