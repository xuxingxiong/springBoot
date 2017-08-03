package com.xuxx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xuxx.entity.UserInfo;
import com.xuxx.repository.UserInfoRepository;
import com.xuxx.service.UserInfoService;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoRepository userInfoRepository;

	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}
}
