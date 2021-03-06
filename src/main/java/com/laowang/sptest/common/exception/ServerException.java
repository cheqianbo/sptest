package com.laowang.sptest.common.exception;

import com.laowang.sptest.common.data.BaseErrorCode;

public class ServerException extends BaseException {
	public ServerException() {
		super(BaseErrorCode.SERVER_ERROR, BaseErrorCode.SERVER_ERROR_MSG);
	}

	public ServerException(String msg) {
		super(BaseErrorCode.SERVER_ERROR, msg);
	}

	public ServerException(Integer code, String msg) {
		super(code, msg);
	}
}