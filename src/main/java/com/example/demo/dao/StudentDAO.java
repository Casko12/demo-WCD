package com.example.demo.dao;

import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentDAO {
    void createStudent(StudentEntity student);
    List<StudentEntity> getAllStudent();
}