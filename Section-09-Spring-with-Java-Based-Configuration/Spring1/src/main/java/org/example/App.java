package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt=context.getBean("com2",Desktop.class); //using bean name

//        Desktop dt=context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt2=context.getBean(Desktop.class); //using Scope
//        dt2.compile();

        Alien alien=context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }
}
