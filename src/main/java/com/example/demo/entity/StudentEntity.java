package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer birthyear;
    private Integer phone;

    public StudentEntity(Integer id, String name, Integer birthyear, Integer phone) {
        this.id = id;
        this.name = name;
        this.birthyear = birthyear;
        this.phone = phone;
    }

    public StudentEntity() {
    }

    public StudentEntity(String name, Integer age, String address) {
        this.name = name;
        this.birthyear = birthyear;
        this.phone = phone;
    }
}
