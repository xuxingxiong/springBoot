package com.xuxx.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xuxx.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Before
	public void before() {
		System.err.println("开始：");
	}

	@Test
	public void testFindAll() {
		List<User> users = userService.findAll();
		for (User user : users) {
			System.err.println(user.toString());
		}
	}

	@After
	public void after() {
		System.err.println("结束！");
	}
}
