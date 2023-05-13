package com.dbq.principle.liskovSubstitution;

public class Test01 {

    public static void reSize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
        }
        System.out.println("resize end ,width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());

    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(20L);
//        rectangle.setHeight(10L);
//        reSize(rectangle);
//    }

    // 出现了死循环 约束继承泛滥
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(10L);
        reSize(square);
    }
}
