package com.kevin.dao;

import com.kevin.pojo.Student;

public class StudentFactory {
    public Student getStudent(String name, Integer age) {
        return new Student(name, age);
    }
}
