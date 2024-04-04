package com.example.bookworm_community_backend.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 92441052893725434L;
    /**
     * 业务状态码
     */
    private Integer code;
    /**
     * 描述
     */
    private String message;
    /**
     * 结果集
     */
    private T data;

    public ApiResult(IErrorCode errorCode) {
        errorCode = Optional.ofNullable(errorCode).orElse(ApiErrorCode.FAILED);
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    /**
     * 成功
     *
     * @return {code: 200, message: '操作成功', data: null}
     */
    public static <T> ApiResult<T> success() {
        return new ApiResult<>(ApiErrorCode.SUCCESS.getCode(), ApiErrorCode.SUCCESS.getMessage(), null);
    }

    /**
     * 成功返回业务数据
     *
     * @param data 结果集
     * @return {code: 200, message: '操作成功', data: 结果集}
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(ApiErrorCode.SUCCESS.getCode(), ApiErrorCode.SUCCESS.getMessage(), data);
    }

    /**
     * 失败返回结果
     *
     * @return {code: -1, message: '操作失败', data: null}
     */
    public static <T> ApiResult<T> failed() {
        return new ApiResult<>(ApiErrorCode.FAILED.getCode(), ApiErrorCode.FAILED.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     * @return {code: -1, message: 提示信息, data: null}
     */
    public static <T> ApiResult<T> failed(String message) {
        return new ApiResult<>(ApiErrorCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误编码
     * @return {code: 错误编码, message: 提示信息, data: null}
     */
    public static <T> ApiResult<T> failed(IErrorCode errorCode) {
        return new ApiResult<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 参数验证失败返回结果
     *
     * @return {code: 303, message: '参数验证失败', data: null}
     */
    public static <T> ApiResult<T> validateFailed() {
        return new ApiResult<>(ApiErrorCode.VALIDATE_FAILED.getCode(), ApiErrorCode.VALIDATE_FAILED.getMessage(), null);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param message 提示信息
     * @return {code: 303, message: 提示信息, data: null}
     */
    public static <T> ApiResult<T> validateFailed(String message) {
        return new ApiResult<>(ApiErrorCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 暂未登录或token已经过期返回结果
     *
     * @return {code: 301, message: 暂未登录或token已经过期, data: null}
     */
    public static <T> ApiResult<T> unauthorized() {
        return new ApiResult<>(ApiErrorCode.UNAUTHORIZED.getCode(), ApiErrorCode.UNAUTHORIZED.getMessage(), null);
    }

    /**
     * 权限不足
     *
     * @return {code: 302, message: 权限不足, data: null}
     */
    public static <T> ApiResult<T> forbidden() {
        return new ApiResult<>(ApiErrorCode.FORBIDDEN.getCode(), ApiErrorCode.FORBIDDEN.getMessage(), null);
    }
}
