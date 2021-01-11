package com.hiveview.action.js;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/js")
public class JsAction {
	@RequestMapping(value = "/{part}.html")
	public String detail(HttpServletRequest request, @PathVariable("part") String part) {
		return "js/" + part;
	}
}
