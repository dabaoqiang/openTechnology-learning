package com.dbq.principle.simpleResponsibility;

/**
 * @author dabaoqiang
 */
public class SimpleResponsibilityCourseDemo {

    /**
     * 什么是简单职责原则了
     * 我在一个类里面，我既有直播课的行为可以不能快讲，我又有可以快讲，
     * 这个，行为是根据不同的课程来的，所以，课程可以分为两种一种是，直播，一种是简单课程
     * 再将一个一个课程抽象行为 专人做专事
     *
     */

//    /**
//     * @param courseName
//     */
//    public void study(String courseName) {
//        if ("直播课".equals(courseName)) {
//            System.out.println("不能快进");
//        } else {
//            System.out.println("可以快进");
//        }
//    }

    // 1.0版本，都绑定在一起了
//    public static void main(String[] args) {
//        Course course = new Course();
//        course.study("直播课");
//        course.study("录播");
//    }

    // 2.0版本。类的属性，行为不一样，进行抽离，单一职责
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播");

    }


}
