package com.xuxx.service;

import com.xuxx.entity.UserInfo;

public interface UserInfoService {

	UserInfo findByUsername(String username);
}
