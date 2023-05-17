package com.dbq.study.spring.boot.exception.error;

import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
public abstract class BaseException extends RuntimeException {

    private final ErrorCode error;

    private final HashMap<String, Object> data = new HashMap<>();

    /**
     * 构造方法
     * @param error
     * @param data
     */
    public BaseException(ErrorCode error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCode getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
