package com.dbq.design.singleton.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 *  是处理了反射，但是这个本质还是静态加载，又变成了饿汉方式
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //   Enum
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());

        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        // Cannot reflectively create enum objects
        Object enumSingleton = declaredConstructor.newInstance();
    }
}
