package com.dbq.study.spring.boot.exception.error;

import com.dbq.study.spring.boot.exception.common.Result;
import com.dbq.study.spring.boot.exception.common.ResultCode;
import com.dbq.study.spring.boot.exception.controller.BookController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
@ControllerAdvice(assignableTypes = {BookController.class})
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Result<?> handleAppException(BaseException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(ex, request.getRequestURI());
        return Result.fail(ResultCode.FAILURE, errorResponse.getMessage());
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public Result<?> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        ErrorResponse response = new ErrorResponse(ex, request.getRequestURI());
        return Result.fail(ResultCode.FAILURE, response.getMessage());
    }

//    @ExceptionHandler(value = BusinessException.class)
//    public ResponseEntity<?> handleBusinessException(BusinessException ex, HttpServletRequest request) {
//        ErrorResponse response = new ErrorResponse(ex, request.getRequestURI());
//        return new ResponseEntity<>(response, new HttpHeaders(), ex.getError().getStatus());
//    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result<?> handleBusinessException(BusinessException ex, HttpServletRequest request) {
        ErrorResponse response = new ErrorResponse(ex, request.getRequestURI());
        return Result.fail(ResultCode.FAILURE, response.getMessage());
    }

}
