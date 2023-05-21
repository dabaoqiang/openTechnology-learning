package com.dbq.common.api;

import java.io.Serializable;

/**
 * Created by @author dabaoqiang on 2023/5/16.
 */
public interface IResultCode extends Serializable {
    /**
     * 消息
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     * @return int
     */
    int getCode();
}
