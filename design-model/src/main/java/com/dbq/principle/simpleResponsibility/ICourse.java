package com.dbq.principle.simpleResponsibility;

/**
 * @author dabaoqiang
 */
public interface ICourse {

    /**
     * getCousreName
     * @return
     */
    String getCousreName();

    /**
     * getCourseVideo
     * @return
     */
    byte[] getCourseVideo();

    /**
     * studyCourse
     */
    void studyCourse();

    /**
     * refundCourse
     */
    void refundCourse();

}
