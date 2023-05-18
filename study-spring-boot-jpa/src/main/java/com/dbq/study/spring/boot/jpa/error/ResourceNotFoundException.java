package com.dbq.study.spring.boot.jpa.error;


import com.dbq.study.spring.boot.jpa.common.ResultCode;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException() {
        super(ResultCode.NOT_FOUND);
    }
}
