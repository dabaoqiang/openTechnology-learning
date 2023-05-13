package com.dbq.principle.compositeReuse;


/**
 * @author dabaoqiang
 */
public class ProductDao {

    private DbConnection dbConnection;

    public ProductDao(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conncetion = dbConnection.getConnection();
        System.out.println("获取 " + conncetion + ",加入产品");
    }
}
