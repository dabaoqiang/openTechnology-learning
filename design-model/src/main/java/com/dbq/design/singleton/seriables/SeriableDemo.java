package com.dbq.design.singleton.seriables;

import com.dbq.design.singleton.inner.LazyStaticInnerSingleton;

import java.io.*;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 解决对象反序列化破解问题
 */
public class SeriableDemo implements Serializable {

    private static final long serialVersionUID = 1370237857614396494L;

    private static final SeriableDemo h = new SeriableDemo();

    private SeriableDemo() {
    }

    public static SeriableDemo getInstance() {
        return h;
    }

    // 重写 readResolve 方法
    private Object readResolve() {
        return h;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 写
        String path = "LazyStaticInnerSingleton.obj";
        SeriableDemo s1 = null;
        SeriableDemo s2 = SeriableDemo.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(s2);
        objectOutputStream.close();

        System.out.println(s2);

        // 读
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        s1 = (SeriableDemo) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(s1);

        // // true
        System.out.println(s1 == s2);
    }
}


