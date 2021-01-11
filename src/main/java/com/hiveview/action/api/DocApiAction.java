package com.hiveview.action.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文档
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/api/doc")
public class DocApiAction {

	@RequestMapping(value = "/detail")
	public String detail(HttpServletRequest request) {
		return "doc/detail";
	}
}
