package com.chaoxiaoyan.exam.util;


import com.chaoxiaoyan.exam.content.JsonBean;

public class JsonUtils {
	public static JsonBean createJsonBean(int code, Object info) {
		JsonBean bean = new JsonBean();
		bean.setCode(code);
		bean.setInfo(info);
		return bean;
	}
}
