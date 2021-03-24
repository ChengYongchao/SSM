package com.kevin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("teacher")
//@Scope("prototype") 默认单例 通过配置设置为非单例
public class Teacher {
    @Value("wanger")
    private String name;
    @Value("34")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
