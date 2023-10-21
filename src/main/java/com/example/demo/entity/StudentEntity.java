package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class StudentEntity {
    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Birth")
    private  String birth;

    @Column(name = "Phone")
    private String phone;

    public StudentEntity(String id, String name, String birth, String phone) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}