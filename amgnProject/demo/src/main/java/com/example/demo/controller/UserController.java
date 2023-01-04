package com.example.demo.controller;

import com.example.demo.auth.PrincipalDetailsService;
import com.example.demo.model.User;
import com.example.demo.model.UserCertificate;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // View를 리턴하겠다!!
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PrincipalDetailsService principalDetailsService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping({"","/"})
    public String certificateForm() {
        return "certificateForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @GetMapping("/result")
    public String index() {
        return "result";
    }

    @PostMapping("/join") // 회원가입 입력값 저장
    public String join(User user) {
        System.out.println(11);
        user.setRole("ROLE_USER");
        String rawPassword = user.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);
        userRepository.save(user);
        return "redirect:/loginForm";
    }

    @PostMapping("/choose") // 유저 데이터 저장
    public String choose(UserCertificate usercertificate) {
        certificateRepository.save(usercertificate);
        return "result";
    }



}
