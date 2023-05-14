package com.dbq.design.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class Test {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson instance = jdkMeipo.getInstance(new Zhangsan());
        instance.findLove();

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
            FileOutputStream file0utputStream = new FileOutputStream("D://developer//document//test//$Proxy0.class");
            file0utputStream.write(bytes);
            file0utputStream.flush();
            file0utputStream.close();
        } catch (Exception e) {
        }

        IPerson instance2 = jdkMeipo.getInstance(new ZhaoLiu());
        instance2.findLove();
    }
}
