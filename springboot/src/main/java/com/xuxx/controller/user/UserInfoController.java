package com.xuxx.controller.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuxx.entity.UserInfo;

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
	@ResponseBody
	public Map<String, Object> userInfo() {
		Map<String, Object> data = new HashMap<String, Object>();
		List<UserInfo> userList = new ArrayList<UserInfo>();
		UserInfo userInfo = new UserInfo();
		userInfo.setName("xuxx");
		userInfo.setState((byte) 0);
		userInfo.setUsername("xuxx");
		userList.add(userInfo);
		logger.info(userList.toString());

		data.put("userList", userList);
		return data;
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
