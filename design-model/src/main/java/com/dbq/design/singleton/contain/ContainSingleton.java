package com.dbq.design.singleton.contain;


import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 * 前提：处理反射，内部类不优雅的问题
 * 缺点：不安全，反序列号会破坏单例
 */
public class ContainSingleton {

    /**
     * 私有化构造函数
     */
    private ContainSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            Class<?> aClass = Class.forName(className);
            instance = aClass.newInstance();
            ioc.put(className, instance);
        } else {
            return ioc.get(className);
        }
        return instance;
    }
}
