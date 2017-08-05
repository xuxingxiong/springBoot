package com.xuxx.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * 登录提交地址和applicationontext-shiro.xml配置的loginurl一致。 (配置文件方式的说法)
	 * 
	 * @param request
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/login")
	public String login(HttpServletRequest request, Map<String, Object> map) throws Exception {
		logger.info("HomeController.login()");
		// 登录失败从request中获取shiro处理的异常信息。
		// shiroLoginFailure:就是shiro异常类的全类名.
		String exception = (String) request.getAttribute("shiroLoginFailure");

		logger.info("exception=" + exception);
		String msg = "";
		if (exception != null) {
			if (UnknownAccountException.class.getName().equals(exception)) {
				logger.error("账号不存在：");
				msg = "账号不存在：";
			} else if (IncorrectCredentialsException.class.getName().equals(exception)) {
				logger.error("密码不正确：");
				msg = "密码不正确：";
			} else if ("kaptchaValidateFailed".equals(exception)) {
				logger.error("验证码错误");
				msg = "验证码错误";
			} else {
				msg = "else >> " + exception;
				System.out.println("else -- >" + exception);
			}
		} else {
			return "/index";
		}
		map.put("msg", msg);
		// 此方法不处理登录成功,由shiro进行处理.
		return "/login";
	}
}
