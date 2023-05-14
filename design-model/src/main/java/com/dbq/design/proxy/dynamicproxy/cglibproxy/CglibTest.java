package com.dbq.design.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class CglibTest {

    public static void main(String[] args) throws Exception {
        String address = "D://developer//document//test//cglib_proxy_classes";
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, address);
        Customer obj = (Customer) new CGlibMeipo().getInstance(Customer.class);
        System.out.println(obj);
        obj.findLove();
    }
}
