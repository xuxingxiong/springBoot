package com.xuxx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xuxx.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Override
	public List<User> findAll();

}
