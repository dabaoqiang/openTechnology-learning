package com.dbq.design.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class CGlibMeipo implements MethodInterceptor {

    /**
     * 获取实例
     * @param clazz
     * @return
     * @throws Exception
     */
    public Object getInstance(Class<?> clazz) throws Exception {
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object o1 = methodProxy.invokeSuper(o, objects);
        after();
        return o1;

    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }
}
