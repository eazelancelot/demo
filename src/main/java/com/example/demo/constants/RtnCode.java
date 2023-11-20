package com.example.demo.constants;

public enum RtnCode {

	SUCCESSFUL(200, "OK!"), //
	PARAM_ERROR(400, "Param error!"), //
	ACCOUNT_EXISTED(400, "Account existed!"), //
	ACCOUNT_NOT_FOUND(404, "Account not found!"),//
	INSUFFICIENT_BALANCE(400, "Insufficient balance")
	;

	private int code;

	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
