package com.example.student_docker_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student s=new Student();
        s.setName("Franky");
        s.setMarks(40);

        service.save(s);
    }


    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

}
