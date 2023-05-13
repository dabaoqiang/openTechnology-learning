package com.dbq.design.singleton.threads;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public class ExecutorDemo implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println("当前线程" + Thread.currentThread().getName() + ":" + instance);
    }
}
