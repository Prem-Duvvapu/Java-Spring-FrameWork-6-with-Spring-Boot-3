package com.example.JobApp;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		SpringApplication.run(JobAppApplication.class, args);
	}

}
