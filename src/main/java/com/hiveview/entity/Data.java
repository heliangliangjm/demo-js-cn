package com.hiveview.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * 基础数据结构
 * 
 * @author wangzhen
 * 
 */
public class Data {

	private Integer isSuccess;

	private String failedMessage;

	private Object result = null;

	private String returnTime = new Timestamp(System.currentTimeMillis()).toString();

	private Data() {

	}

	public Integer getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Integer isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getFailedMessage() {
		return failedMessage;
	}

	public void setFailedMessage(String failedMessage) {
		this.failedMessage = failedMessage;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public static Data buildSuccess(Object result) {
		Data data = new Data();
		data.isSuccess = 1;
		data.result = result;
		return data;
	}

	public static Data buildFailed(String failedMessage) {
		Data data = new Data();
		data.isSuccess = 0;
		data.failedMessage = failedMessage;
		return data;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
