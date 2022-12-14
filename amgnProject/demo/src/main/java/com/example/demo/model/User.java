package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class User {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_num")
    private int id;
    @Column(nullable = false, length = 50)
    private String username;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 100) // 해쉬로 암호화 하기 위해 길이 지정
    private String password;
    @Column(nullable = false)
    private String birth;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = true)
    private String gender;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String education; // 최종학력
    @Column(nullable = true)
    private String status; // 대학교 현재상황
    @Column(nullable = true)
    private String university; // 대학교 이름
    @Column(nullable = true)
    private String department;
    @Column(nullable = false)
    private String mbti;
    private String role;

    @CreationTimestamp
    private Timestamp createDate; // user 생성 날짜


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
