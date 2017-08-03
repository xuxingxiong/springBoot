package com.xuxx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xuxx.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	/** 通过username查找用户信息; */
	public UserInfo findByUsername(String username);
}
