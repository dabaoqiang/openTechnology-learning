package com.dbq.study.spring.boot.exception.error;

import com.dbq.study.spring.boot.exception.common.ResultCode;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public class BusinessException extends BaseException {

    public BusinessException() { super(ResultCode.FAILURE); }

    public BusinessException(String message) {
        super(ResultCode.FAILURE, message);
    }
}
