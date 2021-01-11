package com.hiveview.action.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiveview.entity.Data;
import com.hiveview.entity.user.User;
import com.hiveview.util.LogUtil;

/**
 * 用户
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/api/user")
public class UserApiAction {

	private static final String apiRootUrl = "/api/user";

	/**
	 * 获取用户基础信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getBaseInfo")
	public Data getTaskList(HttpServletRequest request) {
		String apiName = "getTaskList";
		LogUtil.printApiParam(apiRootUrl, apiName, request);
		try {
			User user = new User();
			user.setName("张三");
			user.setAge(20);
			user.setPhone("18811583145");
//			Integer.parseInt("asdf");
			return Data.buildSuccess(user);
		} catch (Exception e) {
			// TODO: handle exception
			LogUtil.printApiException(apiRootUrl, apiName, e);
			return Data.buildFailed(e.getMessage());
		}
	}

}
