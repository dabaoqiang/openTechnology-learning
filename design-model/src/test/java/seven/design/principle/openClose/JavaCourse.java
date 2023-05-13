package seven.design.principle.openClose;

import com.dbq.principle.openClose.Icourse;

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
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
