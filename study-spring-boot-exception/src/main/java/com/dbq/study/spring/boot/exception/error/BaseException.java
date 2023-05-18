package com.dbq.study.spring.boot.exception.error;

import com.dbq.study.spring.boot.exception.common.ResultCode;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public abstract class BaseException extends RuntimeException {

    private final ResultCode resultCode;

    public BaseException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }

    public BaseException(ResultCode resultCode, String message) {
        super(message);
        this.resultCode = resultCode;
    }

    protected BaseException(ResultCode resultCode, Throwable cause) {
        super(resultCode.getMessage(), cause);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

}
