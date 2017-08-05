package com.xuxx.controller.user;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	private Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	/**
	 * 用户查询页面
	 * 
	 * @return
	 */
	@RequestMapping("/userList")
	public String userInfo() {
		return "userInfo";
	}

	/**
	 * 用户添加页面
	 * 
	 * @return
	 */
	@RequestMapping("/userAdd")
	@RequiresPermissions("userInfo:add") // 权限管理
	public String userAdd() {
		return "addUser";
	}

	/**
	 * 用户删除
	 * 
	 * @return
	 */
	@RequestMapping("/userDel")
	@RequiresPermissions("userInfo:del") // 权限管理
	public String userDel() {
		return "userInfoDel";
	}
}
