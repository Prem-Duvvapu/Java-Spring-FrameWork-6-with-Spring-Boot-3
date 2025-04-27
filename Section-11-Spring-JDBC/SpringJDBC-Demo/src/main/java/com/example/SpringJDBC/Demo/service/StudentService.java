package com.example.SpringJDBC.Demo.service;

import com.example.SpringJDBC.Demo.model.Student;
import com.example.SpringJDBC.Demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
