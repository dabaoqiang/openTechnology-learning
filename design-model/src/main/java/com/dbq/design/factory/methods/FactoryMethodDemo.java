package com.dbq.design.factory.methods;

import com.dbq.design.factory.simple.Course;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Course javaCourse = courseFactory.create();
        javaCourse.study();

        CourseFactory courseFactory1 = new PythonCourseFactory();
        Course pythonCourse = courseFactory1.create();
        pythonCourse.study();

    }
}
