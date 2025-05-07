package com.example.student_docker_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public List<Student> findAll() {
        return repo.findAll();
    }

    public void save(Student s) {
        repo.save(s);
    }
}
