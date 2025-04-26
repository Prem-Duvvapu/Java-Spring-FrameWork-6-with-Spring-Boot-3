package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

//    public Alien(int age,Laptop lap) {
//        this.age=age;
//        this.lap=lap;
//    }


    public void code() {
        System.out.println("Coding...");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Alien age setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

//    @Autowired //setter injection
    public void setCom(Computer com) {
        this.com = com;
    }
}
