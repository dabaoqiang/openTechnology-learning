package com.dbq.principle.openClose;

/**
 * @author dabaoqiang
 */
public class JavaDiscountCourse extends JavaCourse {
    
    public JavaDiscountCourse(Long id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.1;
    }
}
