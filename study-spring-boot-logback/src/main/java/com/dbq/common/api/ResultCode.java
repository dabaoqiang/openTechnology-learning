package com.dbq.common.api;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Created by @author dabaoqiang on 2023/5/16.
 */
@Getter
public enum ResultCode implements IResultCode {

    SUCCESS(1001, HttpStatus.OK, "操作成功"),
    FAILURE(1002, HttpStatus.BAD_REQUEST, "业务异常"),
    UN_AUTHORIZED(1003, HttpStatus.UNAUTHORIZED, "请求未授权"),
    NOT_FOUND(1004, HttpStatus.NOT_FOUND, "404 没找到请求"),
    MSG_NOT_READABLE(1005, HttpStatus.BAD_REQUEST, "消息不能读取"),
    METHOD_NOT_SUPPORTED(1006, HttpStatus.METHOD_NOT_ALLOWED, "不支持当前请求方法"),
    MEDIA_TYPE_NOT_SUPPORTED(1007, HttpStatus.UNSUPPORTED_MEDIA_TYPE, "不支持当前媒体类型"),
    REQ_REJECT(1008,HttpStatus.FORBIDDEN ,"请求被拒绝"),
    INTERNAL_SERVER_ERROR(1009,HttpStatus.INTERNAL_SERVER_ERROR, "服务器异常"),
    PARAM_MISS(1010,HttpStatus.BAD_REQUEST, "缺少必要的请求参数"),
    PARAM_TYPE_ERROR(1011,HttpStatus.BAD_REQUEST, "请求参数类型错误"),
    PARAM_BIND_ERROR(1012,HttpStatus.BAD_REQUEST, "请求参数绑定错误"),
    PARAM_VALID_ERROR(1013,HttpStatus.BAD_REQUEST, "参数校验失败");

    /**
     * code 内部系统查询异常
     */
    private final int code;
    /**
     * HttpStatus
     */
    private final HttpStatus status;
    /**
     * 提示信息
     */
    private final String message;

    ResultCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
