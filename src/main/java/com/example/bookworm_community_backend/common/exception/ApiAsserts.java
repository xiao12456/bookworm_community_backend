package com.example.bookworm_community_backend.common.exception;

import com.example.bookworm_community_backend.common.api.IErrorCode;

public class ApiAsserts {
    /**
     * 失败抛出异常
     *
     * @param message 提示信息
     */
    public static void fail(String message) {
        throw new ApiException(message);
    }

    /**
     * 失败抛出异常
     *
     * @param errorCode 状态码
     */
    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
