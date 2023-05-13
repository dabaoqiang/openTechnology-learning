package com.dbq.design.factory.methods;

import com.dbq.design.factory.simple.Course;
import com.dbq.design.factory.simple.JavaCourse;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
