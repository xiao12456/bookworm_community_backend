package com.example.bookworm_community_backend.common.exception;

import com.example.bookworm_community_backend.common.api.IErrorCode;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 4504062069241628175L;
    private IErrorCode errorCode;
    
    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
    
    public ApiException(String message) {
        super(message);
    }
}
