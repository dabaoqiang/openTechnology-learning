package com.dbq.design.coursebuilder;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class CourseBuilder2 {

    private Course course = new Course();

    public CourseBuilder2 addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder2 addPPT(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder2 addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder2 addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder2 addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return this.course;
    }
}
