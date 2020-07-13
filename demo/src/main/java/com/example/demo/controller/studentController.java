package com.example.demo.controller;

import com.example.demo.dao.StudentRepository;
import com.example.demo.enty.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping(value = "/student")
    private List<student> studentList(){
        return studentRepository.findAll();
    }

}
