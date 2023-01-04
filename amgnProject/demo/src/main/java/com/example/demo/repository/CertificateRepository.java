package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.UserCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<UserCertificate, Integer> {

    public User findById(Long id);
}