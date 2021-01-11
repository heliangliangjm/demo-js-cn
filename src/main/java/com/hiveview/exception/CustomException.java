package com.hiveview.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Title：自定义用户异常 Description： Company：hiveview.com Author：马小强
 * Email：maxiaoqiang@hiveview.com 2014年12月19日
 */
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LoggerFactory
			.getLogger("CustomException 回滚异常  > ");

	public CustomException() {
		super();
	}

	public CustomException(String s) {
		super(s);
		LOG.error(s);
	}

	public CustomException(String s, Throwable a) {
		super(s, a);
		LOG.error(s + " -- " + a);
	}
}
