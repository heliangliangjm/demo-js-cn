package com.hiveview.exception;

@SuppressWarnings("serial")
public class PPIRuntimeException extends RuntimeException {
	private String code;
	private String errMsg;
	public PPIRuntimeException(){
		super();
	}
	
	public PPIRuntimeException(String code, String errMsg){
		super(errMsg);
		this.code = code;
		this.errMsg = errMsg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
