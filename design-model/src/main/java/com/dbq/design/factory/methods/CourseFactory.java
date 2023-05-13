package com.dbq.design.factory.methods;

import com.dbq.design.factory.simple.Course;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 对某行为进行抽象
 */
public interface CourseFactory {
    /**
     * create
     * @return
     */
    Course create();

}
