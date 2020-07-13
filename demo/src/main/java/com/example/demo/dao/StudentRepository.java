package com.example.demo.dao;

import com.example.demo.enty.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Integer> {
}
