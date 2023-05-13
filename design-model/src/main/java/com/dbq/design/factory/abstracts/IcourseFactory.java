package com.dbq.design.factory.abstracts;

/**
 * Created by @author dabaoqiang on 2023/5/13.
 */
public interface IcourseFactory {

    /**
     * 看视频
     * @return
     */
    IVideo play();

    /**
     * 看书
     * @return
     */
    IBook readBook();

    /**
     * 学习
     * @return
     */
    IStudy study();
}
