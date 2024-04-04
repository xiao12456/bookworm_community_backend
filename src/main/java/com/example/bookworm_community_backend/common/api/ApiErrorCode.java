package com.example.bookworm_community_backend.common.api;

public enum ApiErrorCode implements IErrorCode {
    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),
    /**
     * 操作失败
     */
    FAILED(-1, "操作失败"),
    /**
     * 未登录或token已经过期
     */
    UNAUTHORIZED(301, "暂未登录或token已经过期"),
    /**
     * 权限不足
     */
    FORBIDDEN(302, "权限不足"),
    /**
     * 参数校验失败
     */
    VALIDATE_FAILED(303, "参数校验失败");

    /**
     * 业务状态码
     */
    private final Integer code;
    /**
     * 描述
     */
    private final String message;

    ApiErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ApiErrorCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
