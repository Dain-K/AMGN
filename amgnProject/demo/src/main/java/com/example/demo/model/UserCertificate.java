package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@OneToOne
    //@JoinColumn(name="user_id", )

    @Column(nullable = false)
    private String field; // 가고싶은 분야
    @Column(nullable = false)
    private String money; // 원하는 연봉
    @Column(nullable = false)
    private String revelTest; // 시험 난이도

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }

    public String getRevelTest() {
        return revelTest;
    }
    public void setRevelTest(String revelTest) {
        this.revelTest = revelTest;
    }


}
