package com.xuxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xuxx.entity.User;
import com.xuxx.repository.UserRepository;
import com.xuxx.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

}
