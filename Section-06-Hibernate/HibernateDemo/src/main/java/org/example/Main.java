package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Student s1 = new Student();
//        s1.setSid(9);
//        s1.setSname("Franky");
//        s1.setSmarks(50);

//        Student s2=null;

//        Student s3=new Student();
//        s3.setSid(6);
//        s3.setSname("Ussop");
//        s3.setSmarks(80);

//        Student s4=null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();

//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.example.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();

//        To insert data
//        Transaction transaction=session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();

//        To fetch data
//        s2=session.get(Student.class,7); //session.get(returnType,primaryKey)

        //To update or insert(when data doesn't exist)
//        Transaction transaction=session.beginTransaction();
//        session.merge(s3);
//        transaction.commit();

        //To delete data
//        s4=session.get(Student.class,9);
//        Transaction transaction=session.beginTransaction();
//        session.remove(s4);
//        transaction.commit();
//
//        session.close();
//        sf.close();

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

        //CHANGING TABLE AND COLUMN NAMES, EMBEDDABELE
//        Alien a1=new Alien();
//        a1.setAid(103);
//        a1.setAname("Prem");
//        a1.setTech("Java");
//
//        Laptop l1=new Laptop();
//        l1.setBrand("HP");
//        l1.setModel("Pavilion");
//        l1.setRam(16);
//
//        a1.setLaptop(l1);
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction=session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2=session.get(Alien.class,103);
//        System.out.println(a2);
//
//        session.close();
//        sf.close();

//        //OneToOne MAPPING
//        Laptop l1=new Laptop();
//        l1.setLid(1);
//        l1.setBrand("HP");
//        l1.setModel("Pavilion");
//        l1.setRam(16);
//
//        Alien a1=new Alien();
//        a1.setAid(103);
//        a1.setAname("Prem");
//        a1.setTech("Java");
//        a1.setLaptop(l1);
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction=session.beginTransaction();
//        session.persist(l1);
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2=session.get(Alien.class,103);
//        System.out.println(a2);
//
//        session.close();
//        sf.close();

        //OneToMany MAPPING
//        Laptop l1=new Laptop();
//        l1.setLid(1);
//        l1.setBrand("HP");
//        l1.setModel("Pavilion");
//        l1.setRam(16);
//
//        Laptop l2=new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Alien a1=new Alien();
//        a1.setAid(103);
//        a1.setAname("Prem");
//        a1.setTech("Java");
//        a1.setLaptops(Arrays.asList(l1,l2));
//
//        l1.setAlien(a1);
//        l2.setAlien(a1);
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction=session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2=session.get(Alien.class,103);
//        System.out.println(a2);
//
//        session.close();
//        sf.close();

        //MANYTOMANY RELATIONSHIP
//        Laptop l1=new Laptop();
//        l1.setLid(1);
//        l1.setBrand("HP");
//        l1.setModel("Pavilion");
//        l1.setRam(16);
//
//        Laptop l2=new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Laptop l3=new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Apple");
//        l3.setModel("Macbook");
//        l3.setRam(8);
//
//        Alien a1=new Alien();
//        a1.setAid(103);
//        a1.setAname("Prem");
//        a1.setTech("Java");
//        a1.setLaptops(Arrays.asList(l1,l2));
//
//        Alien a2=new Alien();
//        a2.setAid(104);
//        a2.setAname("Sai");
//        a2.setTech("Python");
//        a2.setLaptops(Arrays.asList(l2,l3));;
//
//        l1.setAliens(Arrays.asList(a1));
//        l2.setAliens(Arrays.asList(a1,a2));
//        l3.setAliens(Arrays.asList(a2));
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction=session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//
//        session.persist(a1);
//        session.persist(a2);
//        transaction.commit();
//
//        Alien a3=session.get(Alien.class,104);
//        System.out.println(a2);
//
//        session.close();
//        sf.close();

        //HQL
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

        //SQL -> Select * from student where marks=80
        //HQL -> from student where marks=80

        String name="Robin";

        Query query=session.createQuery("select sname, smarks from Student where sname like ?1");
        query.setParameter(1,name);
        List<Object[]> students=query.getResultList();

        for (Object[] obj: students)
            System.out.println((String)obj[0]+" "+(Integer)obj[1]);


        session.close();
        sf.close();
    }
}
