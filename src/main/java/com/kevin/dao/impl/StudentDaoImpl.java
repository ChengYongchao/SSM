package com.kevin.dao.impl;

import com.kevin.dao.StudentDao;
import com.kevin.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {

    @Override
    public Student findStudentById(Integer id) {
        SqlSession session = this.getSqlSession();
        Student student = session.selectOne("findStudentById",id);
        return student;
    }
}
