package com.dbq.study.spring.boot.exception.error;

import java.util.Map;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }
}
