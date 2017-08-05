package com.xuxx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xuxx.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	/**
	 * 通过用户名查找用户信息
	 * 
	 * @param username
	 *            用户名
	 * @return 用户信息
	 */
	public UserInfo findByUsername(String username);
}
