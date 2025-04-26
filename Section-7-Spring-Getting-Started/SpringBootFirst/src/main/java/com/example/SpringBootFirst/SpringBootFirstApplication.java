package com.example.SpringBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringBootFirstApplication.class, args);
		// System.out.println("Hello world");

		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.code();
	}


}
