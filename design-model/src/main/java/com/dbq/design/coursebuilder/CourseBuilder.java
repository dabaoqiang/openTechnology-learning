package com.dbq.design.coursebuilder;

import com.dbq.design.coursebuilder.Course;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 * 本来直接可以调用course赋值，但是加了层CourseBuilder，负责建造course以及调用它方法
 */
public class CourseBuilder {

    private Course course = new Course();

    public void addName(String name) {
        course.setName(name);
    }

    public void addPPT(String ppt) {
        course.setPpt(ppt);
    }

    public void addVideo(String video) {
        course.setVideo(video);
    }

    public void addNote(String note) {
        course.setNote(note);
    }

    public void addHomework(String homework) {
        course.setHomework(homework);
    }

    public Course build() {
        return course;
    }
}
