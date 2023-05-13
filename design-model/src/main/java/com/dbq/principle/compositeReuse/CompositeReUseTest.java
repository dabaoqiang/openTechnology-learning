package com.dbq.principle.compositeReuse;


import com.dbq.principle.compositeReuse.two.MysqlConnection;
import com.dbq.principle.compositeReuse.two.OracleConnection;
import com.dbq.principle.compositeReuse.two.ProductDao1;

/**
 * 少用继承，多用组合
 * 合成复用原则
 * @author dabaoqiang
 */
public class CompositeReUseTest {

    /**
     * 合成复用原则
     * 多使用has-a对象组合；聚合 contains-a 聚合 而不是继承 ，因为继承是白盒，暴露了很多信息，聚合，组合，则是黑盒，
     * 可以降低，类之间的耦合关系，一个类对；另一个类影响较少
     * 继承会暴露，信息
     * @param args
     */

//     // 1.0版本
//    public static void main(String[] args) {
//
//        ProductDao productDao = new ProductDao(new DbConnection());
//        productDao.addProduct();
//    }


    public static void main(String[] args) {
        ProductDao1 productDao1 = new ProductDao1(new MysqlConnection());
        productDao1.addProduct();

        ProductDao1 productDao2 = new ProductDao1(new OracleConnection());
        productDao2.addProduct();

    }
}
