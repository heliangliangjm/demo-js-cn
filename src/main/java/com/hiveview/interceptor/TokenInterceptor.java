package com.hiveview.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Title：Token认证服务类 Description： Company：hiveview.com Author：马小强
 * Email：maxiaoqiang@hiveview.com 2014年12月23日
 */
public class TokenInterceptor extends BaseInterceptor {

	private Logger LOG = LoggerFactory.getLogger(TokenInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return super.preHandle(request, response, handler);
	}
}
