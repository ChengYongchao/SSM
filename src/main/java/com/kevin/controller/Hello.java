package com.kevin.controller;


import com.kevin.pojo.Student;
import com.kevin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello{

    @Autowired
    private StudentService studentService;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(path = "/getStudent", method = RequestMethod.GET)
    @ResponseBody
    public String getStudent() {
        Student student = studentService.findStudentById(1);
        return student.getName() +student.getAge();
    }
}
