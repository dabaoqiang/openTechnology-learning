package com.dbq.design.coursebuilder;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class Demo {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();
        Course build = courseBuilder.build();
        build.setName("xq");
        build.setHomework("link");
        System.out.println(build.toString());

        // 链式调用
        CourseBuilder2 courseBuilder2 = new CourseBuilder2().addName("设计模式")
                .addPPT("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】");
        System.out.println(courseBuilder2.build());
    }
}
