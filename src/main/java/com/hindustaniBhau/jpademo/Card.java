package com.hindustaniBhau.jpademo;

import jakarta.persistence.*;

@Entity
//@Table(name="card_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
//    private String name;
//    @Column(nullable = false,unique = true)
    private String dob;
    private String dept;
    @Enumerated(EnumType.STRING)   //converts enum to varchar for mysql as it can't support enums
    Status status;

    @OneToOne
    @JoinColumn
    User user;
    public Card(){

    }
    public Card(int cardNo, String dob, String dept, Status status) {
        this.cardNo = cardNo;
//        this.name = name;
        this.dob = dob;
        this.dept = dept;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
