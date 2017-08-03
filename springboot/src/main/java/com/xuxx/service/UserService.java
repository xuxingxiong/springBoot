package com.xuxx.service;

import java.util.List;

import com.xuxx.entity.User;

public interface UserService {

	public List<User> findAll();

	public User save(User user);

	public void delete(Integer id);

	public void delete(User user);

}
