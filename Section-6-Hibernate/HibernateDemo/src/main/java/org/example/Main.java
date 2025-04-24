package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        Student s4=null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

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
        s4=session.get(Student.class,9);
        Transaction transaction=session.beginTransaction();
        session.remove(s4);
        transaction.commit();

        session.close();
        sf.close();

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        System.out.println(s4);
    }
}
