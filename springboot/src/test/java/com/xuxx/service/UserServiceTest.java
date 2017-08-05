package com.xuxx.service;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserInfoService userInfoService;

	@Before
	public void before() {
		System.err.println("开始：");
	}

	@Test
	public void testDelete() {

	}

	@Test
	public void testSave() {
		String algorithmName = "md5";
		String username = "admin";
		String password = "1";
		String salt1 = username;
		String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
		System.err.println(salt2);
		int hashIterations = 2;

		SimpleHash hash = new SimpleHash(algorithmName, password, salt1 + salt2, hashIterations);
		String encodedPassword = hash.toHex();
		System.err.println(encodedPassword);
	}

	@Test
	public void testFindAll() {

	}

	@After
	public void after() {
		System.err.println("结束！");
	}
}
