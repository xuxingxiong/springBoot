package com.xuxx.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;

import com.xuxx.config.HashConfig;

/**
 * 密码加密
 * 
 * @author xuxingxiong
 *
 */
public class PasswordUtil {
	@Autowired
	private HashConfig hashConfig;

	/**
	 * 用户密码加密
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            明文密码
	 * @return 加密密码
	 */
	public String encodedPassword(String username, String password) {
		String salt1 = username;
		String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();

		SimpleHash hash = new SimpleHash(hashConfig.getAlgorithmName(), password, salt1 + salt2,
				hashConfig.getIterations());
		String encodedPassword = hash.toHex();
		return encodedPassword;
	}
}
