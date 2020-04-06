package com.laowang.sptest.common.exception;

import com.laowang.sptest.common.data.BaseErrorCode;

public class ForbiddenException extends BaseException {
	public ForbiddenException() {
		super(BaseErrorCode.FORBIDDEN, BaseErrorCode.FORBIDDEN_MSG);
	}

	public ForbiddenException(Integer code, String msg) {
		super(code, msg);
	}
}