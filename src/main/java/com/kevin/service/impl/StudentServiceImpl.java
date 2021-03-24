package com.kevin.service.impl;

import com.kevin.dao.StudentDao;
import com.kevin.pojo.Student;
import com.kevin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findStudentById(Integer id) {
        return studentDao.findStudentById(id);
    }
}
