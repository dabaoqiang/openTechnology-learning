package com.dbq.principle.depenceInversion;

public class Tom {

    /**
     * 啥是依赖倒置了，就是本来我是tom，我要去学课程，我直接在tom的类里面去写，我要学java，我要学python，
     * 学习课程，是抽象的，还是行为，于是，课程抽象为接口，java，phthotn是其实现，
     * tom学那个课程，应该是那个课程的抽象，她不应该依赖是具体的那门课程
     * <p>
     * 即，高层模块不依赖底层模块，二者依赖其抽象，
     * 抽象不依赖细节，细节依赖抽象，
     * 减少耦合，提高稳定，增强，代码可读性，可维护性
     */

    private Icourse icourse;

    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }

    public void studyJavaCourse() {
        System.out.println("xq正在学习java课程");
    }

    public void studyPythonCourse() {
        System.out.println("xq正在学习python课程");
    }

    // 未有依赖倒置前 1.0 版本
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();
//    }


    public void study(Icourse icourse) {
        icourse.study();
    }

    public void studyTwo() {
        icourse.study();
    }

    // 2.0 版本
//    public static void main(String[] args) {
//        Tom tom = new Tom();
    // 直接new
//        tom.study(new JavaCourse());
//    }

    // 3.0版本
    public static void main(String[] args) {
        Tom tom = new Tom();
        // 依赖注入通过setter
        tom.setIcourse(new JavaCourse());
        tom.studyTwo();
    }

}
