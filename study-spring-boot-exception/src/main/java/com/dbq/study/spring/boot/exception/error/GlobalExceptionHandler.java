package com.dbq.study.spring.boot.exception.error;

import com.dbq.study.spring.boot.exception.common.Result;
import com.dbq.study.spring.boot.exception.common.ResultCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = ResourceNotFoundException.class)
    public Result<?> handleResourceNotFoundException(ResourceNotFoundException e) {
        if (e.getResultCode() != null) {
            return Result.fail(e.getResultCode(), e.getMessage());
        }
        return Result.fail(e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = BusinessException.class)
    public Result<?> handleBusinessException(BusinessException e) {
        if (e.getResultCode() != null) {
            return Result.fail(e.getResultCode(), e.getMessage());
        }
        return Result.fail(e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Result<?> handleAppException(Exception e) {
        return Result.fail(ResultCode.INTERNAL_SERVER_ERROR, e.getMessage());
    }

}
