package com.dbq.design.singleton.threads;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> h = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return h.get();
    }

    public static void main(String[] args) {

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3); //一样的对象

        Thread t1 = new Thread(new ExecutorDemo());
        Thread t2 = new Thread(new ExecutorDemo());
        t1.start(); // 线程的对象是不一样的
        t2.start();

        System.out.println("end");
    }
}