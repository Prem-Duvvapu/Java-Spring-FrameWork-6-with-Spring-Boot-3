package com.example.SpringJDBC.Demo;

import com.example.SpringJDBC.Demo.model.Student;
import com.example.SpringJDBC.Demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");

		ApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student s=context.getBean(Student.class);
		s.setRollNo(203);
		s.setName("Prem");
		s.setMarks(75);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getAllStudents();
		System.out.println(students);
	}

}
