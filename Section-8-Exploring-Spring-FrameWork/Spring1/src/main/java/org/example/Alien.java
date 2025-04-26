package org.example;

public class Alien {
    private int age;
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

    public void setCom(Computer com) {
        this.com = com;
    }
}
