package com.dbq.principle.liskovSubstitution.two;

/**
 * @author dabaoqiang
 */
public class TestSubstitutuinDemo {

    /**
     * 子类可以实现父类的抽象方法，不能覆盖；
     * 子类可以自己增加特有的方法；
     * 当子类的方法重载父类时，方法的前置条件，入参，比父类更宽松
     * 当子类的实现父类的方法时，重写/重载/实现抽象方法，方法的后置条件更严格
     *
     * 目标是为了约束继承，泛滥继承 里氏替换原则
     *
     * 子类可以实现父类的抽象方法，不能覆盖；
     * 子类可以自己增加特有的方法；
     * 当子类的方法重载父类时，方法的前置条件，入参，比父类更宽松
     * 当子类的实现父类的方法时，重写/重载/实现抽象方法，方法的后置条件更严格
     *
     * @param rectangle
     */

    public static void reSize(RectRangleTwo rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
        }
        System.out.println("resize end ,width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());

    }

    public static void main(String[] args) {
        SquareTwo rectRangleTwo = new SquareTwo();
        rectRangleTwo.setLength(10);
        // 为了约束继承泛滥！
//        reSize(rectRangleTwo);

    }
}
