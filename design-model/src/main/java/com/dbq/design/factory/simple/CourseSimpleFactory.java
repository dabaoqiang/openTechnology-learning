package com.dbq.design.factory.simple;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 简单工厂，根据参数获取相对应的实例
 */
public class CourseSimpleFactory {

    /**
     * study
     *
     * @param name
     * @return
     */
    public static Course study(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return new PythonCourse();
        }
    }

    public static Course study2Version(Class className) throws IllegalAccessException, InstantiationException {
        return (Course) className.newInstance();

    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Course java = CourseSimpleFactory.study("java");
        java.study();

        // 通过反射
        Course course = CourseSimpleFactory.study2Version(JavaCourse.class);
        course.study();
    }
}
