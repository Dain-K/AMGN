package com.cos.amgn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.amgn.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	// findBy: 규칙 => Username: 문법
	// select * from user where username = ?parameter
	public User findByUsername(String username); // jpa 쿼리 메소드
	
	public User findByEmail(String email);
	
	// select * from user where email = ?parameter
	// public User findByEmail;
}