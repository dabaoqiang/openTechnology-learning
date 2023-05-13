package com.dbq.principle.compositeReuse.two;

/**
 * @author dabaoqiang
 */
public class ProductDao1 {

    private DbConnection2 dbConnection2;

    public ProductDao1(DbConnection2 dbConnection2) {
        this.dbConnection2 = dbConnection2;
    }

    public void addProduct() {
        System.out.println("获取链接：" + dbConnection2.getDbConnection() + "插入产品");
    }

}
