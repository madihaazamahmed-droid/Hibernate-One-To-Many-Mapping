package controller;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Mainclass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Trainer t1 = new Trainer();
        t1.setT_id(101);
        t1.setT_name("madiha");

        Student s1 = new Student();
        s1.setS_id(201);
        s1.setS_name("azam");

        Student s2 = new Student();
        s2.setS_id(202);
        s2.setS_name("nida");

        Student s3 = new Student();
        s3.setS_id(203);
        s3.setS_name("subiya");
//
//        // Set relationship (IMPORTANT)
//        s1.setTrainer(t1);
//        s2.setTrainer(t1);
//        s3.setTrainer(t1);

        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        t1.setL1(l1);

        et.begin();

        em.persist(t1);
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        et.commit();

        System.out.println("One-to-Many mapping successful!");
    }
}