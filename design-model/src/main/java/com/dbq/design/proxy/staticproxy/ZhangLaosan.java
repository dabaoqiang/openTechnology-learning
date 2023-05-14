package com.dbq.design.proxy.staticproxy;

/**
 * Created by @author dabaoqiang on 2023/5/14.
 */
public class ZhangLaosan implements IPerson {

    private ZhangSan zhangSan;

    /**
     * 构造函数
     *
     * @param zhangSan
     */
    public ZhangLaosan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangSan.findLove();
        System.out.println("开始交往");
    }

}
