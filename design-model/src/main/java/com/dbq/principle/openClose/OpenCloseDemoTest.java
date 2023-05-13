package com.dbq.principle.openClose;

/**
 * @author dabaoqiang
 */
public class OpenCloseDemoTest {

    public static void main(String[] args) {
        /**
         * 开闭原则，定义一个接口，不同的实现，可以做到， 对新增开放，对修改关闭，低耦合
         */

        Icourse icourse = new JavaDiscountCourse(1L, "sz", 1D);
        Double price = icourse.getPrice();
        System.out.println(price);

        Icourse original = new JavaCourse(1L, "sz", 1D);
        Double price1 = original.getPrice();
        System.out.println(price1);
    }
}
