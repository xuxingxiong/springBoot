package com.xuxx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xuxx.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
