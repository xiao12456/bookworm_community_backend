package com.example.bookworm_community_backend.common.api;

public interface IErrorCode {
    /**
     * 错误编码
     *
     * @return 错误编码
     */
    Integer getCode();

    /**
     * 错误描述
     *
     * @return 错误描述
     */
    String getMessage();
}
