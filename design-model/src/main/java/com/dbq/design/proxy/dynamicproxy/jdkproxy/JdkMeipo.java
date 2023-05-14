package com.dbq.design.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class JdkMeipo implements InvocationHandler {
    /**
     * 真实对象
     */
    private IPerson target;

    /**
     * 回去代理对象
     * @param target
     * @return
     */
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<? extends IPerson> aClass = target.getClass();
        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);

    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        after();
        Object invoke = method.invoke(target, objects);
        before();
        return invoke;
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
