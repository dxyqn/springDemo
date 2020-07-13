package com.example.demo.enty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String age;
    private String sex;
    private String project;
    private String grade;

    public student() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getProject() {
        return project;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}