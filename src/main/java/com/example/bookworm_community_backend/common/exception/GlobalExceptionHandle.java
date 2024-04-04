package com.example.bookworm_community_backend.common.exception;

import com.example.bookworm_community_backend.common.api.ApiResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandle {
    /**
     * 全局异常处理方法
     *
     * @param e 要处理的异常对象
     * @return 包含错误信息的ApiResult对象
     */
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public ApiResult<Map<String, Object>> handle(ApiException e) {
        if (e.getErrorCode() == null) {
            // 如果没有指定错误码，则返回默认的错误码和错误信息
            return ApiResult.failed(e.getMessage());
        } else {
            // 根据错误码返回相应的错误信息
            return ApiResult.failed(e.getErrorCode());
        }
    }
}
