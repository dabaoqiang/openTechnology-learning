package com.dbq.principle.openClose;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class JavaCourse implements Icourse {

    private Long id;

    private String name;

    private Double price;


    public JavaCourse(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
