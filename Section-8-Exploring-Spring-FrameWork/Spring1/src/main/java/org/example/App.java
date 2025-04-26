package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1= (Alien) context.getBean("alien");
//        obj1.setAge(20);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop desk= (Desktop) context.getBean("com2");
//        Desktop desk=context.getBean("com2",Desktop.class); //get Bean with className in parameter
        Desktop desk2=context.getBean(Desktop.class); //this will search byType in spring.xml
    }
}
