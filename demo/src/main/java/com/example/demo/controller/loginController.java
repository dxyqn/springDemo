package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class loginController {
    @Autowired
    UserRepository userRepository;
    @PostMapping(value = "/login")
//    public List<>
}
