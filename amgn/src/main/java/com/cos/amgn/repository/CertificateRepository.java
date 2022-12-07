package com.cos.amgn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.amgn.model.User;
import com.cos.amgn.model.UserCertificate;

public interface CertificateRepository extends JpaRepository<UserCertificate, Integer> {
	
	public User findById(Long id);
}
