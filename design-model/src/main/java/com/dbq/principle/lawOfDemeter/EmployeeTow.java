package com.dbq.principle.lawOfDemeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dabaoqiang
 */
public class EmployeeTow {

    public void checkNumberOfCourses() {
        List<Course> list = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            // 迪米特法则，有些对象，与我产生不了关系，就不应该放在这里
            list.add(new Course());
        }
        System.out.println("目前已经发布的课程数量:" + list.size());
    }
}
