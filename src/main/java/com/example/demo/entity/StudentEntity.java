package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentCode;

    private String name;
    private String birthyear;
    private String phone;

    public StudentEntity(Integer id, String studentCode, String name, String birthyear, String phone) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.birthyear = birthyear;
        this.phone = phone;
    }

    public StudentEntity() {
    }

    public StudentEntity(String studentCode, String name, String birthyear, String phone) {
        this.studentCode = studentCode;
        this.name = name;
        this.birthyear = birthyear;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
