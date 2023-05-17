package com.dbq.study.spring.boot.exception.error;

import java.util.Map;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public class BusinessException extends BaseException{

    public BusinessException(ErrorCode error, Map<String, Object> data) {
        super(error, data);
    }
}
