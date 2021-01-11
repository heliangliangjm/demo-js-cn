package com.hiveview.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * 日志工具
 * 
 * @author Administrator
 * 
 */
public class LogUtil {
	private static final Logger outLogger = Logger.getLogger("reqout");

	/**
	 * 被请求接口打印日志
	 * 
	 * @param name
	 * @param map
	 */
	public static void printApiParam(String apiRootUrl, String apiName, HttpServletRequest request) {
		Map<String, String[]> map = request.getParameterMap();
		try {
			StringBuilder ms = new StringBuilder();
			if (map != null && !map.isEmpty()) {
				for (Map.Entry<String, String[]> entry : map.entrySet()) {
					String[] vs = entry.getValue();
					if (vs != null && vs.length > 0) {
						ms.append(entry.getKey() + "=" + vs[0] + ";");
					}
				}
			}
			outLogger.info("[" + apiRootUrl + "/" + apiName + "]APIPARAM > " + ms.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 程序内所catch的异常日志
	 * 
	 * @param name
	 * @param map
	 */
	public static void printApiException(String apiRootUrl, String apiName, Exception exception) {
		outLogger.info("[" + apiRootUrl + "/" + apiName + "]APIEXCEPTION > " + exception);
	}

	public static void printMessage(String message) {
		outLogger.info(message);
	}

}
