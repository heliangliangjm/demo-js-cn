package com.hiveview.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.hiveview.entity.Data;

/**
 * 截获异常处理模块
 * 
 * @author tan
 * @since 2013-09-27
 */
public class PPIExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		Data data = null;
		if (ex instanceof PPIRuntimeException) {
			PPIRuntimeException exception = (PPIRuntimeException) ex;
			data = Data.buildFailed(exception.getErrMsg());
		} else {
			data = Data.buildFailed("系统未知错误！");
		}

		return new ModelAndView("", "", data);

	}
}
