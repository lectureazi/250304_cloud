package com.grepp.spring.infra.error.exceptions;

import com.grepp.spring.infra.response.ResponseCode;

public class AuthWebException extends CommonException{
    public AuthWebException(ResponseCode code) {
        super(code);
    }
    public AuthWebException(ResponseCode code, Exception e) {
        super(code, e);
    }
}
