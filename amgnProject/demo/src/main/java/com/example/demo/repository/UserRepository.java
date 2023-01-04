package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy: 규칙 => Username: 문법
    // select * from user where username = ?parameter
    public User findByUsername(String username); // jpa 쿼리 메소드

    //public User findByEmail(String email);

    // select * from user where email = ?parameter
    // public User findByEmail;
}